package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.di;
import com.xiaomi.push.gf;
import com.xiaomi.push.gq;
import com.xiaomi.push.hb;
import com.xiaomi.push.hh;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.ir;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.js;
import com.xiaomi.push.service.bf;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ai {
    public static gf a(XMPushService xMPushService, byte[] bArr) {
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            return a(v.m1097a((Context) xMPushService), xMPushService, iyVar);
        } catch (js e) {
            b.a(e);
            return null;
        }
    }

    public static iy b(String str, String str2) {
        jb jbVar = new jb();
        jbVar.b(str2);
        jbVar.c(im.AppDataCleared.f1168a);
        jbVar.a(bc.a());
        jbVar.a(false);
        return a(str, str2, jbVar, ic.Notification);
    }

    public static gf a(u uVar, Context context, iy iyVar) {
        try {
            gf gfVar = new gf();
            gfVar.a(5);
            gfVar.c(uVar.f1658a);
            gfVar.b(a(iyVar));
            gfVar.a("SECMSG", "message");
            String str = uVar.f1658a;
            iyVar.f1290a.f1217a = str.substring(0, str.indexOf("@"));
            iyVar.f1290a.f1221c = str.substring(str.indexOf("/") + 1);
            gfVar.a(jm.a(iyVar), uVar.c);
            gfVar.a((short) 1);
            b.m410a("try send mi push message. packagename:" + iyVar.f1295b + " action:" + iyVar.f1288a);
            return gfVar;
        } catch (NullPointerException e) {
            b.a(e);
            return null;
        }
    }

    public static <T extends jn<T, ?>> iy b(String str, String str2, T t, ic icVar) {
        return a(str, str2, t, icVar, false);
    }

    public static iy a(String str, String str2) {
        jb jbVar = new jb();
        jbVar.b(str2);
        jbVar.c("package uninstalled");
        jbVar.a(hh.i());
        jbVar.a(false);
        return a(str, str2, jbVar, ic.Notification);
    }

    public static <T extends jn<T, ?>> iy a(String str, String str2, T t, ic icVar) {
        return a(str, str2, t, icVar, true);
    }

    private static <T extends jn<T, ?>> iy a(String str, String str2, T t, ic icVar, boolean z) {
        byte[] a2 = jm.a(t);
        iy iyVar = new iy();
        ir irVar = new ir();
        irVar.f1216a = 5L;
        irVar.f1217a = "fakeid";
        iyVar.a(irVar);
        iyVar.a(ByteBuffer.wrap(a2));
        iyVar.a(icVar);
        iyVar.b(z);
        iyVar.b(str);
        iyVar.a(false);
        iyVar.a(str2);
        return iyVar;
    }

    private static String a(iy iyVar) {
        Map<String, String> map;
        ip ipVar = iyVar.f1289a;
        if (!(ipVar == null || (map = ipVar.f1207b) == null)) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iyVar.f1295b;
    }

    public static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    public static void a(XMPushService xMPushService) {
        u a2 = v.m1097a(xMPushService.getApplicationContext());
        if (a2 != null) {
            bf.b a3 = v.m1097a(xMPushService.getApplicationContext()).a(xMPushService);
            b.m410a("prepare account. " + a3.f1587a);
            a(xMPushService, a3);
            bf.a().a(a3);
            a(xMPushService, a2, 172800);
        }
    }

    public static void a(XMPushService xMPushService, iy iyVar) {
        di.a(iyVar.b(), xMPushService.getApplicationContext(), iyVar, -1);
        gq a2 = xMPushService.m980a();
        if (a2 == null) {
            throw new hb("try send msg while connection is null.");
        } else if (a2.m739a()) {
            gf a3 = a(v.m1097a((Context) xMPushService), xMPushService, iyVar);
            if (a3 != null) {
                a2.b(a3);
            }
        } else {
            throw new hb("Don't support XMPP connection.");
        }
    }

    public static void a(XMPushService xMPushService, bf.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new ak(xMPushService));
    }

    private static void a(XMPushService xMPushService, u uVar, int i) {
        by.a(xMPushService).a(new aj("MSAID", i, xMPushService, uVar));
    }

    public static void a(XMPushService xMPushService, String str, byte[] bArr) {
        di.a(str, xMPushService.getApplicationContext(), bArr);
        gq a2 = xMPushService.m980a();
        if (a2 == null) {
            throw new hb("try send msg while connection is null.");
        } else if (a2.m739a()) {
            gf a3 = a(xMPushService, bArr);
            if (a3 != null) {
                a2.b(a3);
            } else {
                y.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
            }
        } else {
            throw new hb("Don't support XMPP connection.");
        }
    }
}
