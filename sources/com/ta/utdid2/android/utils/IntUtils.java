package com.ta.utdid2.android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IntUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787106);
    }

    public static byte[] getBytes(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8f3337f6", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }

    public static byte[] getBytes(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("af5417fd", new Object[]{bArr, new Integer(i)});
        }
        if (bArr.length != 4) {
            return null;
        }
        bArr[3] = (byte) (i % 256);
        bArr[2] = (byte) ((i >> 8) % 256);
        bArr[1] = (byte) ((i >> 16) % 256);
        bArr[0] = (byte) ((i >> 24) % 256);
        return bArr;
    }
}
