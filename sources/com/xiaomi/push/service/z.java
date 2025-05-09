package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.di;
import com.xiaomi.push.fd;
import com.xiaomi.push.g;
import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.he;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.is;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.js;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.bf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gl4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class z {
    public static Intent a(byte[] bArr, long j) {
        iy a2 = a(bArr);
        if (a2 == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a2.f1295b);
        return intent;
    }

    private static void b(Context context, iy iyVar, byte[] bArr) {
        if (!al.m1019a(iyVar)) {
            String a2 = al.a(iyVar);
            if (!TextUtils.isEmpty(a2) && !a(context, a2, bArr)) {
                fd.a(context).b(a2, al.b(iyVar), iyVar.m853a().m819a(), "1");
            }
        }
    }

    private static void c(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ac(4, xMPushService, iyVar));
    }

    private static void d(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ad(4, xMPushService, iyVar));
    }

    public static iy a(Context context, iy iyVar) {
        return a(context, iyVar, (Map<String, String>) null);
    }

    private static void b(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ab(4, xMPushService, iyVar));
    }

    private static boolean c(iy iyVar) {
        if (iyVar.m853a() == null || iyVar.m853a().m820a() == null) {
            return false;
        }
        return "1".equals(iyVar.m853a().m820a().get("obslete_ads_message"));
    }

    public static iy a(Context context, iy iyVar, Map<String, String> map) {
        is isVar = new is();
        isVar.b(iyVar.m854a());
        ip a2 = iyVar.m853a();
        if (a2 != null) {
            isVar.a(a2.m819a());
            isVar.a(a2.m817a());
            if (!TextUtils.isEmpty(a2.m824b())) {
                isVar.c(a2.m824b());
            }
        }
        isVar.a(jm.m930a(context, iyVar));
        iy a3 = ai.a(iyVar.b(), iyVar.m854a(), isVar, ic.AckMessage);
        ip a4 = iyVar.m853a();
        if (a4 != null) {
            a4 = bs.a(a4.m818a());
        }
        a4.a("mat", Long.toString(System.currentTimeMillis()));
        a4.a(ErrorType.CRASH, String.valueOf(jm.a(context, iyVar)));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        a4.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        a3.a(a4);
        return a3;
    }

    private static boolean b(iy iyVar) {
        Map<String, String> a2 = iyVar.m853a().m820a();
        return a2 != null && a2.containsKey("notify_effect");
    }

    public static iy a(byte[] bArr) {
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            return iyVar;
        } catch (Throwable th) {
            b.a(th);
            return null;
        }
    }

    public static void a(Context context, iy iyVar, byte[] bArr) {
        try {
            al.c a2 = al.m1015a(context, iyVar, bArr);
            if (a2.f15045a > 0 && !TextUtils.isEmpty(a2.f1553a)) {
                hv.a(context, a2.f1553a, a2.f15045a, true, false, System.currentTimeMillis());
            }
            if (!j.m869a(context) || !ah.a(context, iyVar, a2.f1554a)) {
                b(context, iyVar, bArr);
                return;
            }
            ah.m1010a(context, iyVar);
            b.m410a("consume this broadcast by tts");
        } catch (Exception e) {
            b.m410a("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    public void a(Context context, bf.b bVar, boolean z, int i, String str) {
        u a2;
        if (!z && (a2 = v.m1097a(context)) != null && "token-expired".equals(str)) {
            v.a(context, a2.f, a2.d, a2.e);
        }
    }

    public void a(XMPushService xMPushService, gf gfVar, bf.b bVar) {
        HashMap hashMap;
        try {
            byte[] a2 = gfVar.m723a(bVar.h);
            if (e.b(gfVar)) {
                hashMap = new HashMap();
                hashMap.put("t_im", String.valueOf(gfVar.m724b()));
                hashMap.put("t_rt", String.valueOf(gfVar.m717a()));
            } else {
                hashMap = null;
            }
            a(xMPushService, a2, gfVar.c(), hashMap);
        } catch (IllegalArgumentException e) {
            b.a(e);
        }
    }

    public void a(XMPushService xMPushService, hh hhVar, bf.b bVar) {
        if (hhVar instanceof hg) {
            hg hgVar = (hg) hhVar;
            he a2 = hgVar.a("s");
            if (a2 != null) {
                try {
                    a(xMPushService, bo.a(bo.a(bVar.h, hgVar.j()), a2.c()), hv.a(hhVar.m759a()));
                } catch (IllegalArgumentException e) {
                    b.a(e);
                }
            }
        } else {
            b.m410a("not a mipush message");
        }
    }

    private static void a(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new aa(4, xMPushService, iyVar));
    }

    private static void a(XMPushService xMPushService, iy iyVar, jb jbVar) {
        xMPushService.a(new ag(4, jbVar, iyVar, xMPushService));
    }

    private static void a(XMPushService xMPushService, iy iyVar, String str) {
        xMPushService.a(new ae(4, xMPushService, iyVar, str));
    }

    private static void a(XMPushService xMPushService, iy iyVar, String str, String str2) {
        xMPushService.a(new af(4, xMPushService, iyVar, str, str2));
    }

    public static void a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        fd a2;
        String b;
        String a3;
        String str2;
        String str3;
        int i;
        fd a4;
        String b2;
        String b3;
        String a5;
        String str4;
        String str5;
        iy a6 = a(bArr);
        ip a7 = a6.m853a();
        jn jnVar = null;
        String str6 = null;
        if (bArr != null) {
            di.a(a6.b(), xMPushService.getApplicationContext(), null, a6.a(), bArr.length);
        }
        if (c(a6) && a(xMPushService, str)) {
            if (al.e(a6)) {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), "5");
            }
            c(xMPushService, a6);
        } else if (a(a6) && !a(xMPushService, str) && !b(a6)) {
            if (al.e(a6)) {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), "6");
            }
            d(xMPushService, a6);
        } else if ((al.m1019a(a6) && g.c(xMPushService, a6.f1295b)) || a(xMPushService, intent)) {
            boolean z = false;
            if (ic.Registration == a6.a()) {
                String b4 = a6.b();
                SharedPreferences.Editor edit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
                edit.putString(b4, a6.f1291a);
                edit.commit();
                jd a8 = o.a(a6);
                if (a8.a() != 0 || TextUtils.isEmpty(a8.b())) {
                    b.d("read regSecret failed");
                } else {
                    o.a(xMPushService, b4, a8.b());
                }
                w.a(xMPushService).e(b4);
                w.a(xMPushService).f(b4);
                fd.a(xMPushService.getApplicationContext()).a(b4, "E100003", a7.m819a(), 6003, null);
                if (!TextUtils.isEmpty(a7.m819a())) {
                    intent.putExtra("messageId", a7.m819a());
                    intent.putExtra("eventMessageType", 6000);
                }
            }
            if (al.c(a6)) {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), 1001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(a7.m819a())) {
                    intent.putExtra("messageId", a7.m819a());
                    intent.putExtra("eventMessageType", 1000);
                }
            }
            if (al.m1023b(a6)) {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), 2001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(a7.m819a())) {
                    intent.putExtra("messageId", a7.m819a());
                    intent.putExtra("eventMessageType", 2000);
                }
            }
            if (al.m1019a(a6)) {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), 3001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(a7.m819a())) {
                    intent.putExtra("messageId", a7.m819a());
                    intent.putExtra("eventMessageType", 3000);
                }
            }
            if (a7 != null && !TextUtils.isEmpty(a7.m827c()) && !TextUtils.isEmpty(a7.d()) && a7.f1205b != 1 && !al.m1018a((Context) xMPushService, a6.f1295b, al.m1020a(a7.m820a()))) {
                Map<String, String> map = a7.f1203a;
                if (map != null) {
                    str6 = map.get("jobkey");
                }
                if (TextUtils.isEmpty(str6)) {
                    str6 = a7.m819a();
                }
                if (an.a(xMPushService, a6.f1295b, str6)) {
                    fd.a(xMPushService.getApplicationContext()).c(a6.b(), al.b(a6), a7.m819a(), "1:" + str6);
                    str5 = "drop a duplicate message, key=" + str6;
                } else if (!j.m869a((Context) xMPushService) || !ah.m1011a(a6)) {
                    a(xMPushService, a6, bArr);
                    b(xMPushService, a6);
                } else {
                    str5 = "receive pull down message";
                }
                b.m410a(str5);
                b(xMPushService, a6);
            } else if ("com.xiaomi.xmsf".contains(a6.f1295b) && !a6.m861b() && a7 != null && a7.m820a() != null && a7.m820a().containsKey("ab")) {
                b(xMPushService, a6);
                b.c("receive abtest message. ack it." + a7.m819a());
            } else if (a(xMPushService, str, a6, a7)) {
                if (a7 != null && !TextUtils.isEmpty(a7.m819a())) {
                    if (al.m1023b(a6)) {
                        a2 = fd.a(xMPushService.getApplicationContext());
                        b = a6.b();
                        str3 = al.b(a6);
                        a3 = a7.m819a();
                        i = 2002;
                        str2 = null;
                    } else {
                        if (al.m1019a(a6)) {
                            a4 = fd.a(xMPushService.getApplicationContext());
                            b2 = a6.b();
                            b3 = al.b(a6);
                            a5 = a7.m819a();
                            str4 = "7";
                        } else if (al.c(a6)) {
                            a4 = fd.a(xMPushService.getApplicationContext());
                            b2 = a6.b();
                            b3 = al.b(a6);
                            a5 = a7.m819a();
                            str4 = "8";
                        } else if (al.d(a6)) {
                            a2 = fd.a(xMPushService.getApplicationContext());
                            b = a6.b();
                            a3 = a7.m819a();
                            str2 = null;
                            str3 = "E100003";
                            i = 6004;
                        }
                        a4.a(b2, b3, a5, str4);
                    }
                    a2.a(b, str3, a3, i, str2);
                }
                if (ic.Notification == a6.f1288a) {
                    try {
                        jnVar = cf.a(xMPushService, a6);
                        if (jnVar == null) {
                            b.d("receiving an un-recognized notification message. " + a6.f1288a);
                        } else {
                            z = true;
                        }
                    } catch (js e) {
                        b.d("receive a message which action string is not valid. " + e);
                    }
                    if (z && (jnVar instanceof jb)) {
                        jb jbVar = (jb) jnVar;
                        if (im.CancelPushMessage.f1168a.equals(jbVar.f1313d) && jbVar.m880a() != null) {
                            String str7 = jbVar.m880a().get(bj.P);
                            int i2 = -2;
                            if (!TextUtils.isEmpty(str7)) {
                                try {
                                    i2 = Integer.parseInt(str7);
                                } catch (NumberFormatException e2) {
                                    b.m410a("parse notifyId from STRING to INT failed: " + e2);
                                }
                            }
                            if (i2 >= -1) {
                                b.m410a("try to retract a message by notifyId=" + i2);
                                al.a(xMPushService, a6.f1295b, i2);
                            } else {
                                b.m410a("try to retract a message by title&description.");
                                al.a(xMPushService, a6.f1295b, jbVar.m880a().get(bj.N), jbVar.m880a().get(bj.O));
                            }
                            if (a7 != null && a7.m820a() != null && j.m869a((Context) xMPushService) && gl4.CONFIG_PULL_DOWN.equals(ax.a((Object) a7.m820a()))) {
                                ah.a(a6);
                            }
                            a(xMPushService, a6, jbVar);
                        }
                    }
                }
                b.m410a("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, ai.a(a6.f1295b));
            } else {
                fd.a(xMPushService.getApplicationContext()).a(a6.b(), al.b(a6), a7.m819a(), "9");
            }
            if (a6.a() == ic.UnRegistration && !"com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
                xMPushService.stopSelf();
            }
        } else if (!g.c(xMPushService, a6.f1295b)) {
            if (al.e(a6)) {
                fd.a(xMPushService.getApplicationContext()).b(a6.b(), al.b(a6), a7.m819a(), "2");
            }
            a(xMPushService, a6);
        } else {
            b.m410a("receive a mipush message, we can see the app, but we can't see the receiver.");
            if (al.e(a6)) {
                fd.a(xMPushService.getApplicationContext()).b(a6.b(), al.b(a6), a7.m819a(), "3");
            }
        }
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j) {
        a(xMPushService, bArr, j, (Map<String, String>) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.xiaomi.push.service.XMPushService r20, byte[] r21, long r22, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(com.xiaomi.push.service.XMPushService, byte[], long, java.util.Map):void");
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                if (!queryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryBroadcastReceivers.isEmpty()) {
                if (queryIntentServices.isEmpty()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            b.a(e);
            return false;
        }
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        if (!g.m705a(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            b.m410a("broadcast message arrived.");
            context.sendBroadcast(intent, ai.a(str));
            return true;
        } catch (Exception e) {
            b.m410a("meet error when broadcast message arrived. " + e);
            return false;
        }
    }

    private static boolean a(iy iyVar) {
        return "com.xiaomi.xmsf".equals(iyVar.f1295b) && iyVar.m853a() != null && iyVar.m853a().m820a() != null && iyVar.m853a().m820a().containsKey("miui_package_name");
    }

    private static boolean a(XMPushService xMPushService, String str, iy iyVar, ip ipVar) {
        boolean z = true;
        if (ipVar != null && ipVar.m820a() != null && ipVar.m820a().containsKey("__check_alive") && ipVar.m820a().containsKey("__awake")) {
            jb jbVar = new jb();
            jbVar.b(iyVar.m854a());
            jbVar.d(str);
            jbVar.c(im.AwakeSystemApp.f1168a);
            jbVar.a(ipVar.m819a());
            jbVar.f1308a = new HashMap();
            boolean a2 = g.m705a(xMPushService.getApplicationContext(), str);
            jbVar.f1308a.put("app_running", Boolean.toString(a2));
            if (!a2) {
                boolean parseBoolean = Boolean.parseBoolean(ipVar.m820a().get("__awake"));
                jbVar.f1308a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                ai.a(xMPushService, ai.a(iyVar.b(), iyVar.m854a(), jbVar, ic.Notification));
            } catch (hb e) {
                b.a(e);
            }
        }
        return z;
    }
}
