package com.android.taobao.zstd.dict;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZstdCompressDict {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        Zstd.e();
    }

    public static boolean a(long j, byte[] bArr) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a01176c", new Object[]{new Long(j), bArr})).booleanValue();
        }
        Zstd.a();
        if (j != 0) {
            return !Zstd.isError(loadCompressDict(j, bArr, 0, bArr.length));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    public static boolean b(long j, ZstdCompressDict zstdCompressDict) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf39dad9", new Object[]{new Long(j), zstdCompressDict})).booleanValue();
        }
        Zstd.a();
        if (j != 0) {
            zstdCompressDict.getClass();
            return !Zstd.isError(refCompressDict(j, 0L));
        }
        throw new IllegalStateException("Invalid Compress context or stream");
    }

    private native long createCompressDict(byte[] bArr, int i, int i2, int i3);

    private native int freeCompressDict(long j);

    private static native int loadCompressDict(long j, byte[] bArr, int i, int i2);

    private static native int refCompressDict(long j, long j2);
}
