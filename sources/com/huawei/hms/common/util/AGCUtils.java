package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.xiaomi.mipush.sdk.Constants;
import tb.q2;
import tb.s2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AGCUtils {
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "AGCUtils"
            java.lang.String r1 = "Get "
            java.lang.String r2 = ""
            r3 = 0
            tb.s2 r4 = new tb.s2     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            r4.<init>()     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            android.content.res.Resources r5 = r7.getResources()     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            java.lang.String r6 = "agconnect-services.json"
            java.io.InputStream r3 = r5.open(r6)     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            r4.b(r3)     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            tb.r2 r7 = r4.a(r7)     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            tb.uwx r7 = (tb.uwx) r7     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            java.lang.String r7 = r7.getString(r8)     // Catch: all -> 0x0028, NullPointerException -> 0x002a, IOException -> 0x002c
            goto L_0x005f
        L_0x0028:
            r7 = move-exception
            goto L_0x0080
        L_0x002a:
            r7 = move-exception
            goto L_0x002e
        L_0x002c:
            r7 = move-exception
            goto L_0x0047
        L_0x002e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0028
            r4.<init>(r1)     // Catch: all -> 0x0028
            r4.append(r8)     // Catch: all -> 0x0028
            java.lang.String r1 = " with AGConnectServicesConfig failed: "
            r4.append(r1)     // Catch: all -> 0x0028
            r4.append(r7)     // Catch: all -> 0x0028
            java.lang.String r7 = r4.toString()     // Catch: all -> 0x0028
            com.huawei.hms.support.log.HMSLog.e(r0, r7)     // Catch: all -> 0x0028
        L_0x0045:
            r7 = r2
            goto L_0x005f
        L_0x0047:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0028
            r4.<init>(r1)     // Catch: all -> 0x0028
            r4.append(r8)     // Catch: all -> 0x0028
            java.lang.String r1 = " failed: "
            r4.append(r1)     // Catch: all -> 0x0028
            r4.append(r7)     // Catch: all -> 0x0028
            java.lang.String r7 = r4.toString()     // Catch: all -> 0x0028
            com.huawei.hms.support.log.HMSLog.e(r0, r7)     // Catch: all -> 0x0028
            goto L_0x0045
        L_0x005f:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0069
            return r7
        L_0x0069:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r8 = " is null."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.hms.support.log.HMSLog.e(r0, r7)
            return r2
        L_0x0080:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.startsWith("cpid=")) {
                return valueOf.substring(5);
            }
            return valueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e);
            return "";
        }
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        String str;
        if (context == null) {
            HMSLog.w("AGCUtils", "getAppId context is null");
            return "";
        }
        if (c(context)) {
            str = a(context, "client/app_id");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            str = null;
        }
        try {
            q2 c = q2.c();
            if (c.b() != context) {
                c = q2.a(new s2().a(context));
            }
            str = c.d().getString("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a(context);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String str;
        if (context == null) {
            HMSLog.w("AGCUtils", "getCpId context is null");
            return "";
        } else if (c(context)) {
            return a(context, "client/cp_id");
        } else {
            try {
                q2 c = q2.c();
                if (c.b() != context) {
                    c = q2.a(new s2().a(context));
                }
                str = c.d().getString("client/cp_id");
            } catch (NullPointerException unused) {
                HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String b = b(context);
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            return a(context, "client/cp_id");
        }
    }

    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get(Constants.HUAWEI_HMS_CLIENT_APPID)) == null) {
                HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e);
            return "";
        }
    }
}
