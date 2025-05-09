package com.mobile.auth;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O0O {
    private static final O0O0O O000000o = new O0O0O();
    private static boolean O00000Oo = false;

    public static void O000000o(String str, String str2) {
        if (O00000Oo) {
            Log.e("CMCC-SDK:" + str, "" + str2);
        }
    }

    public static void O00000Oo(String str, String str2) {
        if (O00000Oo) {
            new StringBuilder("CMCC-SDK:").append(str);
            new StringBuilder("").append(str2);
        }
    }

    public static void O000000o(boolean z) {
        O00000Oo = z;
    }
}
