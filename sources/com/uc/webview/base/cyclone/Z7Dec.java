package com.uc.webview.base.cyclone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Z7Dec {
    public static int dec(String str, String str2) {
        int i = a.f14264a;
        if (i != -1000) {
            return i;
        }
        return decImpl(str, str2);
    }

    private static native int decImpl(String str, String str2);
}
