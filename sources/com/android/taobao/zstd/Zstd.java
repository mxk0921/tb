package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.drx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Zstd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COMPRESS_LEVEL = 3;
    public static final int ZSTD_RESET_PARAMETERS = 2;
    public static final int ZSTD_RESET_SESSION_AND_PARAMETERS = 3;
    public static final int ZSTD_RESET_SESSION_ONLY = 1;

    static {
        e();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17afa58f", new Object[0]);
        } else if (!drx.b.get()) {
            throw new IllegalStateException("libzstd.so is not available");
        }
    }

    public static byte[] c(byte[] bArr) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d9e5a2cc", new Object[]{bArr});
        }
        a();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("decompress src is null");
        }
        long decompresseBound = decompresseBound(bArr, bArr.length);
        if (decompresseBound <= 0) {
            throw new ZstdException("Failed to get decompress bound. error:" + decompresseBound);
        } else if (decompresseBound <= 2147483647L) {
            return d(bArr, (int) decompresseBound);
        } else {
            throw new ZstdException("Max decompress size is greater than MAX_INT");
        }
    }

    public static native long compressBound(long j);

    public static native long compressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5);

    public static native long compressCtx(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long createCCtx();

    public static native long createDCtx();

    public static native long decompressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long decompressCtx(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long decompresseBound(byte[] bArr, long j);

    public static native int destroyCCtx(long j);

    public static native int destroyDCtx(long j);

    public static synchronized void e() {
        synchronized (Zstd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else {
                drx.c();
            }
        }
    }

    public static boolean f(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a536585", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j != 0) {
            return !isError(resetCContextNative(j, i));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    public static native String getErrorMessage(long j);

    public static boolean h(long j, boolean z) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("984ba660", new Object[]{new Long(j), new Boolean(z)})).booleanValue();
        }
        if (j != 0) {
            return !isError(setChecksumNative(j, z));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    public static boolean i(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6d4038a", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j != 0) {
            return !isError(setCompressionLevelNative(j, i));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    public static native boolean isError(long j);

    public static void j(long j) throws ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a727d9bb", new Object[]{new Long(j)});
        } else if (isError(j)) {
            throw new ZstdException(j);
        }
    }

    private static native int resetCContextNative(long j, int i);

    private static native int resetDContextNative(long j, int i);

    private static native int setChecksumNative(long j, boolean z);

    private static native int setCompressionLevelNative(long j, int i);

    public static byte[] b(byte[] bArr, int i) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c6db9faa", new Object[]{bArr, new Integer(i)});
        }
        a();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("compress src is null");
        }
        long compressBound = compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            int i2 = (int) compressBound;
            byte[] bArr2 = new byte[i2];
            long compressByteArray = compressByteArray(bArr2, 0, i2, bArr, 0, bArr.length, i);
            if (!isError(compressByteArray)) {
                return Arrays.copyOfRange(bArr2, 0, (int) compressByteArray);
            }
            throw new ZstdException(compressByteArray);
        }
        throw new ZstdException("Max compress size is greater than MAX_INT");
    }

    public static byte[] d(byte[] bArr, int i) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("62dc8a2b", new Object[]{bArr, new Integer(i)});
        }
        a();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("decompress src is null");
        }
        byte[] bArr2 = new byte[i];
        long decompressByteArray = decompressByteArray(bArr2, 0, i, bArr, 0, bArr.length);
        if (!isError(decompressByteArray)) {
            return decompressByteArray != ((long) i) ? Arrays.copyOfRange(bArr2, 0, (int) decompressByteArray) : bArr2;
        }
        throw new ZstdException(decompressByteArray);
    }

    public static boolean g(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc312f24", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j != 0) {
            return !isError(resetDContextNative(j, i));
        }
        throw new IllegalStateException("Invalid Decompress context or stream");
    }
}
