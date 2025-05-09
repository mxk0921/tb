package com.mobile.auth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O0OOO {
    public static String O000000o(Context context) {
        Exception e;
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String str2 = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(O00000o(context), 0));
            if (str2 != null) {
                return str2;
            }
            try {
                PackageInfo O00000o0 = O00000o0(context);
                if (O00000o0 == null) {
                    return null;
                }
                return context.getResources().getString(O00000o0.applicationInfo.labelRes);
            } catch (Exception e2) {
                e = e2;
                str = str2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static String O00000Oo(Context context) {
        try {
            PackageInfo O00000o0 = O00000o0(context);
            if (O00000o0 == null) {
                return "";
            }
            return O00000o(context) + "&" + O00000o0.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String O00000o(Context context) {
        PackageInfo O00000o0 = O00000o0(context);
        if (O00000o0 == null) {
            return "";
        }
        return O00000o0.packageName;
    }

    private static PackageInfo O00000o0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
