package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ByteUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787086);
    }

    public static long getLongByByte4(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da868c05", new Object[]{bArr})).longValue();
        }
        return ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }
}
