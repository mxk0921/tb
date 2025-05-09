package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.j.c;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    private static final String e = "a";
    private static final Map<String, Map<String, Map<String, String>>> f = new ConcurrentHashMap(16);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f5338a = new ConcurrentHashMap(16);
    private final c b;
    private final c c;
    private final g d;

    public a(c cVar, c cVar2, g gVar) {
        this.c = cVar2;
        this.b = cVar;
        this.d = gVar;
        gVar.a(this);
    }

    public c a() {
        return this.b;
    }

    public g b() {
        return this.d;
    }

    public c c() {
        return this.c;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 == null || map2.isEmpty()) {
            String str2 = e;
            Logger.i(str2, "Cache size is: " + map.size());
            return new HashMap();
        }
        a(grsBaseInfo, bVar, context, str);
        return map2.get(str);
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a2 = this.b.a(grsParasKey, "");
        c cVar = this.b;
        String a3 = cVar.a(grsParasKey + "time", "0");
        long j = 0;
        if (!TextUtils.isEmpty(a3) && a3.matches("\\d+")) {
            try {
                j = Long.parseLong(a3);
            } catch (NumberFormatException e2) {
                Logger.w(e, "convert urlParamKey from String to Long catch NumberFormatException.", e2);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a2));
        String str = e;
        Logger.i(str, "Cache size is: " + map.size());
        this.f5338a.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        c cVar = this.b;
        cVar.b(grsParasKey + "time", "0");
        Map<String, Long> map = this.f5338a;
        map.remove(grsParasKey + "time");
        Map<String, Map<String, Map<String, String>>> map2 = f;
        map2.remove(grsParasKey);
        String str = e;
        Logger.i(str, "Cache size is: " + map2.size());
        this.d.a(grsParasKey);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.f5338a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000L)) {
            this.d.a(new c(grsBaseInfo, context), null, str, this.c, -1);
        }
        bVar.a(1);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, c cVar) {
        if (dVar.f() == 2) {
            Logger.w(e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.b.a(grsParasKey, "")));
            } else {
                this.b.b(grsParasKey, dVar.j());
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                c cVar2 = this.b;
                cVar2.b(grsParasKey + HeaderConstant.HEADER_KEY_ETAG, dVar.e());
            }
            c cVar3 = this.b;
            cVar3.b(grsParasKey + "time", dVar.a());
            this.f5338a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.b.b("geoipCountryCode", dVar.j());
            this.b.b("geoipCountryCodetime", dVar.a());
        }
        String str = e;
        Logger.i(str, "Cache size is: " + f.size());
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f5338a.get(str), 300000L)) {
            this.d.a(new c(grsBaseInfo, context), null, null, this.c, -1);
        }
    }
}
