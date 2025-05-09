package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.vivo.push.cache.d;
import com.vivo.push.model.b;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f14657a;
    private static String b;

    public static b a(Context context, o oVar) {
        b bVar;
        b f;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        b c = c(applicationContext);
        if (c != null) {
            u.d("PushPackageUtils", "get system push info :".concat(String.valueOf(c)));
            return c;
        }
        List<String> a2 = oVar.a(applicationContext);
        c = f(applicationContext, applicationContext.getPackageName());
        if (a2 == null || a2.size() <= 0) {
            if (c != null && c.d()) {
                c = c;
            }
            u.a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            b bVar2 = null;
            String a3 = af.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(a3) || !a(applicationContext, a3, "com.vivo.pushservice.action.METHOD") || (bVar = f(applicationContext, a3)) == null || !bVar.d()) {
                bVar = null;
            }
            if (c == null || !c.d()) {
                c = null;
            }
            if (bVar == null) {
                bVar = null;
            }
            if (c == null || (bVar != null && (!c.c() ? !(bVar.c() || c.b() > bVar.b()) : !(bVar.c() && c.b() > bVar.b())))) {
                c = bVar;
            }
            HashMap hashMap = new HashMap();
            if (c == null) {
                c = null;
            } else if (c.c()) {
                bVar2 = c;
                c = null;
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                String str = a2.get(i);
                if (!TextUtils.isEmpty(str) && (f = f(applicationContext, str)) != null) {
                    hashMap.put(str, f);
                    if (f.d()) {
                        if (f.c()) {
                            if (bVar2 == null || f.b() > bVar2.b()) {
                                bVar2 = f;
                            }
                        } else if (c == null || f.b() > c.b()) {
                            c = f;
                        }
                    }
                }
            }
            if (c == null) {
                u.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                c = bVar2;
            }
        }
        if (c == null) {
            u.b(applicationContext, "查找最优包为空!");
            u.d("PushPackageUtils", "finSuitablePushPackage is null");
        } else if (c.c()) {
            u.a(applicationContext, "查找最优包为:" + c.a() + f7l.BRACKET_START_STR + c.b() + ", Black)");
            u.d("PushPackageUtils", "finSuitablePushPackage" + c.a() + f7l.BRACKET_START_STR + c.b() + ", Black)");
        } else {
            u.a(applicationContext, "查找最优包为:" + c.a() + f7l.BRACKET_START_STR + c.b() + f7l.BRACKET_END_STR);
            u.d("PushPackageUtils", "finSuitablePushPackage" + c.a() + f7l.BRACKET_START_STR + c.b() + f7l.BRACKET_END_STR);
        }
        return c;
    }

    public static boolean b(Context context) {
        ProviderInfo resolveContentProvider;
        Boolean bool = f14657a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (!(context == null || TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") || (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) == null)) {
            str = resolveContentProvider.packageName;
        }
        boolean equals = "BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(g(context, str));
        f14657a = Boolean.valueOf(equals);
        return equals;
    }

    private static b c(Context context) {
        String a2 = a(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        b bVar = new b(a2);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a2, 128);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(ag.a(context, a2));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, a2));
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            u.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    public static boolean e(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static b f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str) && (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE"))) {
            b bVar = new b(str);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                if (packageInfo != null) {
                    bVar.a(packageInfo.versionCode);
                    bVar.a(packageInfo.versionName);
                    applicationInfo = packageInfo.applicationInfo;
                } else {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    bVar.a(ag.a(context, str));
                }
                bVar.b(a(context, str));
                bVar.a(a(context, bVar.b()));
                return bVar;
            } catch (Exception e) {
                u.a("PushPackageUtils", "getPushPackageInfo exception: ", e);
            }
        }
        return null;
    }

    private static String g(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA256").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b2 : digest) {
                    String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e) {
                u.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            }
        }
        return null;
    }

    public static int b(Context context, String str) {
        int i = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109 A[Catch: Exception -> 0x00fd, TRY_ENTER, TryCatch #1 {Exception -> 0x00fd, blocks: (B:70:0x00f0, B:72:0x00f5, B:74:0x00f9, B:79:0x0109, B:81:0x010e, B:83:0x0112), top: B:97:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e A[Catch: Exception -> 0x00fd, TryCatch #1 {Exception -> 0x00fd, blocks: (B:70:0x00f0, B:72:0x00f5, B:74:0x00f9, B:79:0x0109, B:81:0x010e, B:83:0x0112), top: B:97:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.aa.a(android.content.Context):java.lang.String");
    }

    public static boolean a(Context context, String str) {
        ServiceInfo serviceInfo;
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                u.a("PushPackageUtils", "isEnablePush error: can not find push service.");
            } else {
                int size = queryIntentServices.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i);
                    if (!(resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null)) {
                        String str2 = serviceInfo.name;
                        boolean z2 = serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                            boolean z3 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z3);
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    private static boolean a(Context context, long j) {
        d a2 = com.vivo.push.cache.b.a().a(context);
        if (a2 != null) {
            return a2.isInBlackList(j);
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }
}
