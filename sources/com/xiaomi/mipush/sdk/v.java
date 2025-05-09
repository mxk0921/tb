package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f14741a;

        /* renamed from: a  reason: collision with other field name */
        public boolean f711a;
        public String b;

        /* renamed from: b  reason: collision with other field name */
        public boolean f712b;

        public b(String str, boolean z, boolean z2, String str2) {
            this.f14741a = str;
            this.f711a = z;
            this.f712b = z2;
            this.b = str2;
        }
    }

    private static ActivityInfo a(PackageManager packageManager, Intent intent, Class<?> cls) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[EDGE_INSN: B:46:0x00a3->B:30:0x00a3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.xiaomi.push.service.receivers.PingReceiver"
            android.content.pm.PackageManager r4 = r8.getPackageManager()
            java.lang.String r5 = r8.getPackageName()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = com.xiaomi.push.service.bj.q
            r6.<init>(r7)
            r6.setPackage(r5)
            java.lang.Class r7 = com.xiaomi.push.r.a(r8, r3)     // Catch: ClassNotFoundException -> 0x0035
            android.content.pm.ActivityInfo r6 = a(r4, r6, r7)     // Catch: ClassNotFoundException -> 0x0035
            boolean r7 = com.xiaomi.mipush.sdk.MiPushClient.shouldUseMIUIPush(r8)     // Catch: ClassNotFoundException -> 0x0035
            if (r7 != 0) goto L_0x0047
            if (r6 == 0) goto L_0x0037
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]     // Catch: ClassNotFoundException -> 0x0035
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: ClassNotFoundException -> 0x0035
            r0[r2] = r3     // Catch: ClassNotFoundException -> 0x0035
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: ClassNotFoundException -> 0x0035
            r0[r1] = r3     // Catch: ClassNotFoundException -> 0x0035
            a(r6, r0)     // Catch: ClassNotFoundException -> 0x0035
            goto L_0x005a
        L_0x0035:
            r0 = move-exception
            goto L_0x0057
        L_0x0037:
            com.xiaomi.mipush.sdk.v$a r0 = new com.xiaomi.mipush.sdk.v$a     // Catch: ClassNotFoundException -> 0x0035
            java.lang.String r6 = "<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest."
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: ClassNotFoundException -> 0x0035
            r7[r2] = r3     // Catch: ClassNotFoundException -> 0x0035
            java.lang.String r3 = java.lang.String.format(r6, r7)     // Catch: ClassNotFoundException -> 0x0035
            r0.<init>(r3)     // Catch: ClassNotFoundException -> 0x0035
            throw r0     // Catch: ClassNotFoundException -> 0x0035
        L_0x0047:
            if (r6 == 0) goto L_0x005a
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]     // Catch: ClassNotFoundException -> 0x0035
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: ClassNotFoundException -> 0x0035
            r0[r2] = r3     // Catch: ClassNotFoundException -> 0x0035
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: ClassNotFoundException -> 0x0035
            r0[r1] = r3     // Catch: ClassNotFoundException -> 0x0035
            a(r6, r0)     // Catch: ClassNotFoundException -> 0x0035
            goto L_0x005a
        L_0x0057:
            com.xiaomi.channel.commonutils.logger.b.a(r0)
        L_0x005a:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r3)
            r0.setPackage(r5)
            r3 = 16384(0x4000, float:2.2959E-41)
            java.util.List r0 = r4.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x006f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00a3
            java.lang.Object r4 = r0.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            if (r4 == 0) goto L_0x00a0
            java.lang.String r5 = r4.name     // Catch: ClassNotFoundException -> 0x009b
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: ClassNotFoundException -> 0x009b
            if (r5 != 0) goto L_0x00a0
            java.lang.Class<com.xiaomi.mipush.sdk.PushMessageReceiver> r5 = com.xiaomi.mipush.sdk.PushMessageReceiver.class
            java.lang.String r6 = r4.name     // Catch: ClassNotFoundException -> 0x009b
            java.lang.Class r6 = com.xiaomi.push.r.a(r8, r6)     // Catch: ClassNotFoundException -> 0x009b
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: ClassNotFoundException -> 0x009b
            if (r5 == 0) goto L_0x00a0
            boolean r3 = r4.enabled     // Catch: ClassNotFoundException -> 0x009b
            if (r3 == 0) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x009b:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r4)
            goto L_0x006f
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            if (r3 == 0) goto L_0x006f
        L_0x00a3:
            if (r3 == 0) goto L_0x00c7
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenHmsPush(r8)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "com.huawei.android.push.intent.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.HmsPushReceiver"
            a(r8, r0, r1)
            java.lang.String r0 = "com.huawei.intent.action.PUSH"
            java.lang.String r1 = "com.huawei.hms.support.api.push.PushEventReceiver"
            a(r8, r0, r1)
        L_0x00b9:
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenVIVOPush(r8)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "com.vivo.pushclient.action.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.FTOSPushMessageReceiver"
            a(r8, r0, r1)
        L_0x00c6:
            return
        L_0x00c7:
            com.xiaomi.mipush.sdk.v$a r8 = new com.xiaomi.mipush.sdk.v$a
            java.lang.String r0 = "Receiver: none of the subclasses of PushMessageReceiver is enabled or defined."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.v.c(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 1;
        hashMap2.put(PushMessageHandler.class.getCanonicalName(), new b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        hashMap2.put(MessageHandleService.class.getCanonicalName(), new b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            hashMap2.put("com.xiaomi.push.service.XMJobService", new b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            hashMap2.put("com.xiaomi.push.service.XMPushService", new b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (MiPushClient.getOpenFCMPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            hashMap2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (MiPushClient.getOpenOPPOPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.COSPushMessageService", new b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            int length = serviceInfoArr.length;
            for (int i2 = 0; i2 < length; i2 += i) {
                ServiceInfo serviceInfo = serviceInfoArr[i2];
                if (!TextUtils.isEmpty(serviceInfo.name) && hashMap2.containsKey(serviceInfo.name)) {
                    b bVar = (b) hashMap2.remove(serviceInfo.name);
                    boolean z = bVar.f711a;
                    boolean z2 = bVar.f712b;
                    String str = bVar.b;
                    if (z != serviceInfo.enabled) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z)));
                    } else if (z2 != serviceInfo.exported) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z2)));
                    } else if (TextUtils.isEmpty(str) || TextUtils.equals(str, serviceInfo.permission)) {
                        hashMap.put(serviceInfo.name, serviceInfo.processName);
                        if (hashMap2.isEmpty()) {
                            break;
                        }
                        i = 1;
                    } else {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                }
            }
        }
        if (!hashMap2.isEmpty()) {
            throw new a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", hashMap2.keySet().iterator().next()));
        } else if (!TextUtils.equals((CharSequence) hashMap.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) hashMap.get(MessageHandleService.class.getCanonicalName()))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        } else if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && hashMap.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) hashMap.get("com.xiaomi.push.service.XMJobService"), (CharSequence) hashMap.get("com.xiaomi.push.service.XMPushService"))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }

    public static void a(Context context) {
        new Thread(new w(context)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            for (PermissionInfo permissionInfo : permissionInfoArr) {
                if (str.equals(permissionInfo.name)) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                                if (hashSet.isEmpty()) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        throw new a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
                    }
                    return;
                }
            }
        }
        throw new a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
    }

    private static void a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        boolean z = false;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    private static void a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        } else if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    private static boolean a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
