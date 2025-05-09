package com.taobao.android.bsdiff;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Bsdiff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        try {
            System.loadLibrary("bsdiff-jni");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static native int nativePatch(String str, String str2, String str3);

    public static int patch(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92c9f160", new Object[]{str, str2, str3})).intValue();
        }
        return nativePatch(str, str2, str3);
    }
}
