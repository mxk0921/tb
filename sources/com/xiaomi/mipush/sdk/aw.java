package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ax;
import com.xiaomi.push.bm;
import com.xiaomi.push.g;
import com.xiaomi.push.i;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.k;
import com.xiaomi.push.service.bc;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14724a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f692a;

    public aw(Context context, boolean z) {
        this.f14724a = context;
        this.f692a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        String d;
        String d2;
        Map<String, String> map;
        String d3;
        String str;
        String c;
        String c2;
        b.m410a("do sync info");
        jb jbVar = new jb(bc.a(), false);
        b a2 = b.m452a(this.f14724a);
        jbVar.c(im.SyncInfo.f1168a);
        jbVar.b(a2.m453a());
        jbVar.d(this.f14724a.getPackageName());
        HashMap hashMap = new HashMap();
        jbVar.f1308a = hashMap;
        Context context = this.f14724a;
        k.a(hashMap, "app_version", g.m702a(context, context.getPackageName()));
        Map<String, String> map2 = jbVar.f1308a;
        Context context2 = this.f14724a;
        k.a(map2, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(g.a(context2, context2.getPackageName())));
        k.a(jbVar.f1308a, "push_sdk_vn", BuildConfig.VERSION_NAME);
        k.a(jbVar.f1308a, "push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
        k.a(jbVar.f1308a, "token", a2.b());
        if (!j.m874d()) {
            String a3 = bm.a(i.c(this.f14724a));
            String e = i.e(this.f14724a);
            if (!TextUtils.isEmpty(e)) {
                a3 = a3 + "," + e;
            }
            if (!TextUtils.isEmpty(a3)) {
                k.a(jbVar.f1308a, Constants.EXTRA_KEY_IMEI_MD5, a3);
            }
        }
        ax.a(this.f14724a).a(jbVar.f1308a);
        k.a(jbVar.f1308a, Constants.EXTRA_KEY_REG_ID, a2.m460c());
        k.a(jbVar.f1308a, Constants.EXTRA_KEY_REG_SECRET, a2.d());
        k.a(jbVar.f1308a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f14724a).replace(",", "-"));
        if (this.f692a) {
            Map<String, String> map3 = jbVar.f1308a;
            c = av.c(MiPushClient.getAllAlias(this.f14724a));
            k.a(map3, Constants.EXTRA_KEY_ALIASES_MD5, c);
            Map<String, String> map4 = jbVar.f1308a;
            c2 = av.c(MiPushClient.getAllTopic(this.f14724a));
            k.a(map4, Constants.EXTRA_KEY_TOPICS_MD5, c2);
            map = jbVar.f1308a;
            d3 = av.c(MiPushClient.getAllUserAccount(this.f14724a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            Map<String, String> map5 = jbVar.f1308a;
            d = av.d(MiPushClient.getAllAlias(this.f14724a));
            k.a(map5, Constants.EXTRA_KEY_ALIASES, d);
            Map<String, String> map6 = jbVar.f1308a;
            d2 = av.d(MiPushClient.getAllTopic(this.f14724a));
            k.a(map6, Constants.EXTRA_KEY_TOPICS, d2);
            map = jbVar.f1308a;
            d3 = av.d(MiPushClient.getAllUserAccount(this.f14724a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        k.a(map, str, d3);
        ao.a(this.f14724a).a((ao) jbVar, ic.Notification, false, (ip) null);
    }
}
