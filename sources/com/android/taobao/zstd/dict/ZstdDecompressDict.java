package com.android.taobao.zstd.dict;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZstdDecompressDict {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f4600a;

    static {
        Zstd.e();
    }

    public ZstdDecompressDict(byte[] bArr, int i, int i2) {
        Zstd.a();
        if (bArr.length - i >= 0) {
            long createDecompressDict = createDecompressDict(bArr, i, i2);
            this.f4600a = createDecompressDict;
            if (createDecompressDict == 0) {
                throw new IllegalStateException("ZSTD_createCDict failed");
            }
            return;
        }
        throw new IllegalArgumentException("Dictionary buffer is to short");
    }

    public static boolean b(long j, byte[] bArr) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a01176c", new Object[]{new Long(j), bArr})).booleanValue();
        }
        Zstd.a();
        if (j != 0) {
            return !Zstd.isError(loadDecompressDict(j, bArr, 0, bArr.length));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    public static boolean c(long j, ZstdDecompressDict zstdDecompressDict) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eeadef8", new Object[]{new Long(j), zstdDecompressDict})).booleanValue();
        }
        Zstd.a();
        if (j != 0) {
            return !Zstd.isError(refDecompressDict(j, zstdDecompressDict.f4600a));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    private native long createDecompressDict(byte[] bArr, int i, int i2);

    private native int freeDecompressDict(long j);

    private static native int loadDecompressDict(long j, byte[] bArr, int i, int i2);

    private static native int refDecompressDict(long j, long j2);

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        long j = this.f4600a;
        if (j != 0) {
            freeDecompressDict(j);
            this.f4600a = 0L;
        }
    }
}
