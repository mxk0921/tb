package com.vivo.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ag {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f14662a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] b = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
    private static String[] c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] d = {"com.vivo.push.sdk.RegistrationReceiver"};
    private static String[] e = new String[0];
    private static Map<String, Bundle> f = new ConcurrentHashMap();

    public static long a(Context context) {
        String a2 = aa.a(context);
        if (!TextUtils.isEmpty(a2)) {
            return a(context, a2);
        }
        u.a("Utility", "systemPushPkgName is null");
        return -1L;
    }

    public static String b(Context context, String str) {
        Object a2 = a(context, str, "verification_status");
        if (a2 != null) {
            return a2.toString();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x00ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x00ab;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4 A[Catch: Exception -> 0x00be, TRY_ENTER, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x00a2, B:43:0x00a7, B:45:0x00ab, B:48:0x00b4, B:50:0x00b9), top: B:64:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x00a2, B:43:0x00a7, B:45:0x00ab, B:48:0x00b4, B:50:0x00b9), top: B:64:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.PublicKey c(android.content.Context r12) {
        /*
            r0 = 24
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x002d, Exception -> 0x0031
            java.lang.String r3 = "Utility"
            if (r2 < r0) goto L_0x0036
            android.content.ContentResolver r4 = r12.getContentResolver()     // Catch: all -> 0x002d, Exception -> 0x0031
            android.net.Uri r6 = com.vivo.push.x.f14676a     // Catch: all -> 0x002d, Exception -> 0x0031
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r6)     // Catch: all -> 0x002d, Exception -> 0x0031
            if (r4 == 0) goto L_0x002b
            java.lang.String r5 = "client is null"
            com.vivo.push.util.u.a(r3, r5)     // Catch: all -> 0x0024, Exception -> 0x0027
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: all -> 0x0024, Exception -> 0x0027
            goto L_0x0038
        L_0x0024:
            r12 = move-exception
            goto L_0x00bf
        L_0x0027:
            r12 = move-exception
            r5 = r1
            goto L_0x00af
        L_0x002b:
            r5 = r1
            goto L_0x0038
        L_0x002d:
            r12 = move-exception
            r4 = r1
            goto L_0x00bf
        L_0x0031:
            r12 = move-exception
            r4 = r1
            r5 = r4
            goto L_0x00af
        L_0x0036:
            r4 = r1
            r5 = r4
        L_0x0038:
            if (r5 != 0) goto L_0x004f
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch: all -> 0x0049, Exception -> 0x004d
            android.net.Uri r7 = com.vivo.push.x.f14676a     // Catch: all -> 0x0049, Exception -> 0x004d
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch: all -> 0x0049, Exception -> 0x004d
            goto L_0x004f
        L_0x0049:
            r12 = move-exception
            r1 = r5
            goto L_0x00bf
        L_0x004d:
            r12 = move-exception
            goto L_0x00af
        L_0x004f:
            if (r5 != 0) goto L_0x005e
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch: Exception -> 0x005d
        L_0x0056:
            if (r4 == 0) goto L_0x005d
            if (r2 < r0) goto L_0x005d
            r4.release()     // Catch: Exception -> 0x005d
        L_0x005d:
            return r1
        L_0x005e:
            boolean r12 = r5.moveToNext()     // Catch: all -> 0x0049, Exception -> 0x004d
            if (r12 == 0) goto L_0x00a2
            java.lang.String r12 = "pushkey"
            java.lang.String r2 = "name"
            int r2 = r5.getColumnIndex(r2)     // Catch: all -> 0x0049, Exception -> 0x004d
            java.lang.String r2 = r5.getString(r2)     // Catch: all -> 0x0049, Exception -> 0x004d
            boolean r12 = r12.equals(r2)     // Catch: all -> 0x0049, Exception -> 0x004d
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = "value"
            int r12 = r5.getColumnIndex(r12)     // Catch: all -> 0x0049, Exception -> 0x004d
            java.lang.String r12 = r5.getString(r12)     // Catch: all -> 0x0049, Exception -> 0x004d
            java.lang.String r2 = "result key : "
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch: all -> 0x0049, Exception -> 0x004d
            java.lang.String r2 = r2.concat(r6)     // Catch: all -> 0x0049, Exception -> 0x004d
            com.vivo.push.util.u.d(r3, r2)     // Catch: all -> 0x0049, Exception -> 0x004d
            java.security.PublicKey r12 = com.vivo.push.util.ab.a(r12)     // Catch: all -> 0x0049, Exception -> 0x004d
            r5.close()     // Catch: Exception -> 0x00a1
            if (r4 == 0) goto L_0x00a1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x00a1
            if (r1 < r0) goto L_0x00a1
            r4.release()     // Catch: Exception -> 0x00a1
        L_0x00a1:
            return r12
        L_0x00a2:
            r5.close()     // Catch: Exception -> 0x00be
            if (r4 == 0) goto L_0x00be
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x00be
            if (r12 < r0) goto L_0x00be
        L_0x00ab:
            r4.release()     // Catch: Exception -> 0x00be
            goto L_0x00be
        L_0x00af:
            r12.printStackTrace()     // Catch: all -> 0x0049
            if (r5 == 0) goto L_0x00b7
            r5.close()     // Catch: Exception -> 0x00be
        L_0x00b7:
            if (r4 == 0) goto L_0x00be
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x00be
            if (r12 < r0) goto L_0x00be
            goto L_0x00ab
        L_0x00be:
            return r1
        L_0x00bf:
            if (r1 == 0) goto L_0x00c4
            r1.close()     // Catch: Exception -> 0x00cd
        L_0x00c4:
            if (r4 == 0) goto L_0x00cd
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x00cd
            if (r1 < r0) goto L_0x00cd
            r4.release()     // Catch: Exception -> 0x00cd
        L_0x00cd:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.c(android.content.Context):java.security.PublicKey");
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    for (String str2 : c) {
                        a(str2, serviceInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("serviceInfos is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static void e(Context context, String str) throws VivoPushException {
        if (e.length > 0) {
            try {
                if (context.getPackageManager() != null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                    if (activityInfoArr != null) {
                        for (String str2 : e) {
                            a(str2, activityInfoArr, str);
                        }
                        return;
                    }
                    throw new VivoPushException("activityInfos is null");
                }
                throw new VivoPushException("localPackageManager is null");
            } catch (Exception e2) {
                throw new VivoPushException("error " + e2.getMessage());
            }
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
                if (activityInfoArr != null) {
                    for (String str2 : d) {
                        a(str2, activityInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("receivers is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "Utility"
            r1 = 0
            if (r3 == 0) goto L_0x0047
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x000c
            goto L_0x0047
        L_0x000c:
            java.lang.String r2 = "sdk_version_vivo"
            java.lang.Object r3 = a(r3, r4, r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x001c
            java.lang.String r3 = (java.lang.String) r3
        L_0x0019:
            r4 = r3
            r3 = 0
            goto L_0x0030
        L_0x001c:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0029
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = ""
            goto L_0x0030
        L_0x0029:
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.toString()
            goto L_0x0019
        L_0x0030:
            if (r3 <= 0) goto L_0x0033
            return r3
        L_0x0033:
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: Exception -> 0x0038
            goto L_0x0046
        L_0x0038:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "getClientSdkVersion: "
            java.lang.String r3 = r4.concat(r3)
            com.vivo.push.util.u.a(r0, r3)
        L_0x0046:
            return r1
        L_0x0047:
            java.lang.String r3 = "getClientSdkVersion() error, context is null or pkgName is empty"
            com.vivo.push.util.u.a(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.g(android.content.Context, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
        r12 = r12 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r20) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.b(android.content.Context):void");
    }

    public static long a(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.sdk_version");
        if (a2 == null) {
            a2 = a(context, str, "sdk_version");
        }
        if (a2 != null) {
            try {
                return Long.parseLong(a2.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
                u.a("Utility", "getSdkVersionCode error ", e2);
                return -1L;
            }
        } else {
            u.a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.d(android.content.Context):boolean");
    }

    public static Object a(Context context, String str, String str2) {
        Exception e2;
        Object obj;
        Object obj2;
        Bundle bundle;
        Bundle bundle2 = null;
        if (context == null || str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, Bundle> map = f;
            if (map == null || map.size() <= 0 || (bundle = f.get(str)) == null) {
                obj = null;
            } else {
                obj = bundle.get(str2);
            }
            if (obj != null) {
                return obj;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                if (applicationInfo != null) {
                    bundle2 = applicationInfo.metaData;
                }
                obj2 = bundle2 != null ? bundle2.get(str2) : obj;
            } catch (Exception e3) {
                e2 = e3;
                bundle2 = obj;
            }
            try {
                if (f.size() > 300) {
                    return obj2;
                }
                f.put(str, bundle2);
                return obj2;
            } catch (Exception e4) {
                e2 = e4;
                bundle2 = obj2;
                u.a("Utility", "getMetaValue::".concat(String.valueOf(e2)));
                return bundle2;
            }
        } catch (Exception e5) {
            e2 = e5;
        }
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    a(componentInfo, str2);
                    return;
                } else {
                    throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
                }
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    public static int c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            u.a("Utility", "getClientSdkVersionCode() error, context is null or pkgName is empty");
            return 0;
        }
        int a2 = (int) a(context, str);
        return a2 <= 0 ? g(context, str) : a2;
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (!componentInfo.applicationInfo.packageName.equals(str)) {
            for (String str2 : f14662a) {
                if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                    throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
                }
            }
        }
    }

    private static void a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            } else if (z) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    if (str2.equals(resolveInfo.activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            } else {
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no services");
                }
                for (ResolveInfo resolveInfo2 : queryIntentServices) {
                    if (str2.equals(resolveInfo2.serviceInfo.name)) {
                        if (!resolveInfo2.serviceInfo.exported) {
                            throw new VivoPushException(resolveInfo2.serviceInfo.name + " exported is false");
                        }
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
        } catch (Exception e2) {
            u.a("Utility", "error  " + e2.getMessage());
            throw new VivoPushException("checkModule error" + e2.getMessage());
        }
    }

    public static void a(Context context, Intent intent) {
        String a2 = aa.a(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(a2)) {
            u.a("Utility", "illegality abe adapter : push pkg is null");
        } else if (TextUtils.isEmpty(stringExtra)) {
            u.a("Utility", "illegality abe adapter : src pkg is null");
        } else if (a2.equals(context.getPackageName())) {
            u.a("Utility", "illegality abe adapter : abe is not pushservice");
        } else if (!a2.equals(stringExtra)) {
            u.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + a2);
            intent.setPackage(a2);
            intent.setClassName(a2, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
        } else {
            u.a("Utility", "illegality abe adapter : pushPkg = " + a2 + " ; srcPkg = " + stringExtra);
        }
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r15, java.lang.String r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.a(android.content.Context, java.lang.String, java.lang.String, long):boolean");
    }

    public static boolean a(Context context, String str, boolean z) {
        Cursor a2;
        Cursor cursor = null;
        try {
            try {
                try {
                    a2 = a(x.e, "appPkgName = ? and agreePrivacyStatement = ? ", new String[]{str, z ? "1" : "0"}, context);
                } catch (Exception e2) {
                    u.a("Utility", "close", e2);
                }
            } catch (Exception e3) {
                u.a("Utility", "syncAgreePrivacyStatement", e3);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (a2 == null) {
                u.a("Utility", "cursor is null");
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception e4) {
                        u.a("Utility", "close", e4);
                    }
                }
                return false;
            } else if (a2.moveToFirst()) {
                boolean parseBoolean = Boolean.parseBoolean(a2.getString(a2.getColumnIndex("agreePrivacyStatement")));
                try {
                    a2.close();
                } catch (Exception e5) {
                    u.a("Utility", "close", e5);
                }
                return parseBoolean;
            } else {
                a2.close();
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e6) {
                    u.a("Utility", "close", e6);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0037: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:16:0x0037 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.database.Cursor a(android.net.Uri r13, java.lang.String r14, java.lang.String[] r15, android.content.Context r16) {
        /*
            java.lang.String r1 = "close"
            r2 = 24
            java.lang.String r3 = "Utility"
            r4 = 0
            if (r16 != 0) goto L_0x0017
            java.lang.String r0 = "context is null"
            com.vivo.push.util.u.a(r3, r0)     // Catch: all -> 0x000f, Exception -> 0x0013
            return r4
        L_0x000f:
            r0 = move-exception
        L_0x0010:
            r5 = r0
            goto L_0x0087
        L_0x0013:
            r0 = move-exception
            r5 = r4
            goto L_0x0072
        L_0x0017:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x000f, Exception -> 0x0013
            if (r0 < r2) goto L_0x003d
            android.content.ContentResolver r5 = r16.getContentResolver()     // Catch: all -> 0x000f, Exception -> 0x0013
            r12 = r13
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r13)     // Catch: all -> 0x000f, Exception -> 0x0013
            if (r5 == 0) goto L_0x003b
            java.lang.String r6 = "client is null"
            com.vivo.push.util.u.a(r3, r6)     // Catch: all -> 0x0036, Exception -> 0x0039
            r8 = 0
            r11 = 0
            r6 = r5
            r7 = r13
            r9 = r14
            r10 = r15
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch: all -> 0x0036, Exception -> 0x0039
            goto L_0x0040
        L_0x0036:
            r0 = move-exception
            r4 = r5
            goto L_0x0010
        L_0x0039:
            r0 = move-exception
            goto L_0x0072
        L_0x003b:
            r6 = r4
            goto L_0x0040
        L_0x003d:
            r12 = r13
            r5 = r4
            r6 = r5
        L_0x0040:
            if (r6 != 0) goto L_0x004f
            android.content.ContentResolver r6 = r16.getContentResolver()     // Catch: all -> 0x0036, Exception -> 0x0039
            r8 = 0
            r11 = 0
            r7 = r13
            r9 = r14
            r10 = r15
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch: all -> 0x0036, Exception -> 0x0039
        L_0x004f:
            if (r6 != 0) goto L_0x0064
            java.lang.String r6 = "cursor is null"
            com.vivo.push.util.u.a(r3, r6)     // Catch: all -> 0x0036, Exception -> 0x0039
            if (r5 == 0) goto L_0x0063
            if (r0 < r2) goto L_0x0063
            r5.release()     // Catch: Exception -> 0x005e
            goto L_0x0063
        L_0x005e:
            r0 = move-exception
            r2 = r0
            com.vivo.push.util.u.a(r3, r1, r2)
        L_0x0063:
            return r4
        L_0x0064:
            if (r5 == 0) goto L_0x0071
            if (r0 < r2) goto L_0x0071
            r5.release()     // Catch: Exception -> 0x006c
            goto L_0x0071
        L_0x006c:
            r0 = move-exception
            r2 = r0
            com.vivo.push.util.u.a(r3, r1, r2)
        L_0x0071:
            return r6
        L_0x0072:
            java.lang.String r6 = "queryContentResolver"
            com.vivo.push.util.u.a(r3, r6, r0)     // Catch: all -> 0x0036
            if (r5 == 0) goto L_0x0086
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0082
            if (r0 < r2) goto L_0x0086
            r5.release()     // Catch: Exception -> 0x0082
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            com.vivo.push.util.u.a(r3, r1, r0)
        L_0x0086:
            return r4
        L_0x0087:
            if (r4 == 0) goto L_0x0095
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0091
            if (r0 < r2) goto L_0x0095
            r4.release()     // Catch: Exception -> 0x0091
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            com.vivo.push.util.u.a(r3, r1, r0)
        L_0x0095:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.a(android.net.Uri, java.lang.String, java.lang.String[], android.content.Context):android.database.Cursor");
    }
}
