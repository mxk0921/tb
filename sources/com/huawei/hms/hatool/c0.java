package com.huawei.hms.hatool;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c0 {
    public static boolean a(Context context) {
        return System.currentTimeMillis() - d.a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    public static boolean a(Context context, String str) {
        int checkSelfPermission;
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = context.checkSelfPermission(str);
            if (checkSelfPermission == 0) {
                return false;
            }
            v.f("hmsSdk", "not have read phone permission!");
            return true;
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return false;
        } else {
            v.f("hmsSdk", "not have read phone permission!");
            return true;
        }
    }

    public static boolean a(Context context, String str, int i) {
        String str2 = d.c(context, str) + ".xml";
        File file = new File(context.getFilesDir(), "../shared_prefs/" + str2);
        if (!file.exists()) {
            String str3 = context.getPackageName() + "_" + str2;
            file = new File(context.getFilesDir(), "../../shared_prefs/" + str3);
        }
        long length = file.length();
        if (length <= i) {
            return false;
        }
        v.c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    public static boolean a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            v.f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
