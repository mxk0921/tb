package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.bg;
import com.xiaomi.push.co;
import com.xiaomi.push.cr;
import com.xiaomi.push.cs;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.ft;
import com.xiaomi.push.gb;
import com.xiaomi.push.gd;
import com.xiaomi.push.gq;
import com.xiaomi.push.hs;
import com.xiaomi.push.r;
import com.xiaomi.push.service.bw;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bk extends bw.a implements cs.a {

    /* renamed from: a  reason: collision with root package name */
    private long f15075a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f1596a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements cs.b {
        @Override // com.xiaomi.push.cs.b
        public String a(String str) {
            int i;
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", hs.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(r.a()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.b.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            if (url.getPort() == -1) {
                i = 80;
            } else {
                i = url.getPort();
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = bg.a(r.m963a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                gd.a(url.getHost() + ":" + i, (int) currentTimeMillis2, null);
                return a2;
            } catch (IOException e) {
                gd.a(url.getHost() + ":" + i, -1, e);
                throw e;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b extends cs {
        public b(Context context, cr crVar, cs.b bVar, String str) {
            super(context, crVar, bVar, str);
        }

        @Override // com.xiaomi.push.cs
        public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (gb.m710a().m715a()) {
                    str2 = bw.m1062a();
                }
                return super.a(arrayList, str, str2, z);
            } catch (IOException e) {
                gd.a(0, ft.GSLB_ERR.a(), 1, null, bg.c(cs.f14810a) ? 1 : 0);
                throw e;
            }
        }
    }

    public bk(XMPushService xMPushService) {
        this.f1596a = xMPushService;
    }

    @Override // com.xiaomi.push.cs.a
    public cs a(Context context, cr crVar, cs.b bVar, String str) {
        return new b(context, crVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(el.a aVar) {
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(em.b bVar) {
        co b2;
        if (bVar.mo668b() && bVar.mo666a() && System.currentTimeMillis() - this.f15075a > 3600000) {
            com.xiaomi.channel.commonutils.logger.b.m410a("fetch bucket :" + bVar.mo666a());
            this.f15075a = System.currentTimeMillis();
            cs a2 = cs.a();
            a2.m566a();
            a2.m569b();
            gq a3 = this.f1596a.m980a();
            if (a3 != null && (b2 = a2.b(a3.m736a().c())) != null) {
                ArrayList<String> a4 = b2.m553a();
                Iterator<String> it = a4.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(a3.m737a())) {
                        return;
                    }
                }
                if (!a4.isEmpty()) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("bucket changed, force reconnect");
                    this.f1596a.a(0, (Exception) null);
                    this.f1596a.a(false);
                }
            }
        }
    }

    public static void a(XMPushService xMPushService) {
        bk bkVar = new bk(xMPushService);
        bw.a().a(bkVar);
        synchronized (cs.class) {
            cs.a(bkVar);
            cs.a(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }
}
