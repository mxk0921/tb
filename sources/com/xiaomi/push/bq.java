package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.manager.a;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bq {
    public static String a() {
        return Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL;
    }

    public static String a(Context context) {
        String a2 = bt.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = bm.a(20);
        bt.a(context).m525a("sp_client_report_status", "sp_client_report_key", a3);
        return a3;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r7 == null) goto L_0x00c9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bq.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, List<String> list) {
        if (list != null && list.size() > 0 && m521a(context)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    a(context, str);
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m521a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m522a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = a.a(context).m417a().getMaxFileLength();
        if (file.exists()) {
            try {
            } catch (Exception e) {
                b.a(e);
            }
            return file.length() <= maxFileLength;
        }
        x.m1105a(file);
        return true;
    }

    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(bj.m516a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static File[] m523a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new bs());
        }
        return null;
    }
}
