package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.es;
import com.xiaomi.push.eu;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import java.util.HashMap;
import tb.krg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o {
    public static void a(Context context, Intent intent, Uri uri) {
        es a2;
        eu euVar;
        if (context != null) {
            ao.a(context).m442a();
            if (es.a(context.getApplicationContext()).m672a() == null) {
                es.a(context.getApplicationContext()).a(b.m452a(context.getApplicationContext()).m453a(), context.getPackageName(), az.a(context.getApplicationContext()).a(ih.AwakeInfoUploadWaySwitch.a(), 0), new c());
                az.a(context).a(new q(102, "awake online config", context));
            }
            if ((context instanceof Activity) && intent != null) {
                a2 = es.a(context.getApplicationContext());
                euVar = eu.ACTIVITY;
            } else if (!(context instanceof Service) || intent == null) {
                if (uri != null && !TextUtils.isEmpty(uri.toString())) {
                    es.a(context.getApplicationContext()).a(eu.PROVIDER, context, (Intent) null, uri.toString());
                    return;
                }
                return;
            } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                a2 = es.a(context.getApplicationContext());
                euVar = eu.SERVICE_COMPONENT;
            } else {
                a2 = es.a(context.getApplicationContext());
                euVar = eu.SERVICE_ACTION;
            }
            a2.a(euVar, context, intent, (String) null);
        }
    }

    private static void a(Context context, jb jbVar) {
        boolean z = false;
        z = az.a(context).a(ih.AwakeAppPingSwitch.a(), false);
        int a2 = az.a(context).a(ih.AwakeAppPingFrequency.a(), 0);
        if (a2 >= 0 && a2 < 30) {
            b.c("aw_ping: frquency need > 30s.");
            a2 = 30;
        }
        if (a2 >= 0) {
        }
        if (!j.m868a()) {
            a(context, jbVar, z, a2);
        } else if (z) {
            ah.a(context.getApplicationContext()).a((ah.a) new p(jbVar, context), a2);
        }
    }

    public static final <T extends jn<T, ?>> void a(Context context, T t, boolean z, int i) {
        byte[] a2 = jm.a(t);
        if (a2 == null) {
            b.m410a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a2);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ao.a(context).m444a(intent);
    }

    public static void a(Context context, String str) {
        b.m410a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf((int) krg.LOG_LEVEL_DEBUG));
        hashMap.put("description", "ping message");
        jb jbVar = new jb();
        jbVar.b(b.m452a(context).m453a());
        jbVar.d(context.getPackageName());
        jbVar.c(im.AwakeAppResponse.f1168a);
        jbVar.a(bc.a());
        jbVar.f1308a = hashMap;
        a(context, jbVar);
    }

    public static void a(Context context, String str, int i, String str2) {
        jb jbVar = new jb();
        jbVar.b(str);
        jbVar.a(new HashMap());
        jbVar.m880a().put("extra_aw_app_online_cmd", String.valueOf(i));
        jbVar.m880a().put("extra_help_aw_info", str2);
        jbVar.a(bc.a());
        byte[] a2 = jm.a(jbVar);
        if (a2 == null) {
            b.m410a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a2);
        ao.a(context).m444a(intent);
    }
}
