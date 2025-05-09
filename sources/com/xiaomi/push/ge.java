package com.xiaomi.push;

import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.service.bf;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ge {
    public static void a(bf.b bVar, String str, gq gqVar) {
        String str2;
        em.c cVar = new em.c();
        if (!TextUtils.isEmpty(bVar.c)) {
            cVar.a(bVar.c);
        }
        if (!TextUtils.isEmpty(bVar.e)) {
            cVar.d(bVar.e);
        }
        if (!TextUtils.isEmpty(bVar.f)) {
            cVar.e(bVar.f);
        }
        cVar.b(bVar.f1589a ? "1" : "0");
        if (!TextUtils.isEmpty(bVar.d)) {
            cVar.c(bVar.d);
        } else {
            cVar.c("XIAOMI-SASL");
        }
        gf gfVar = new gf();
        gfVar.c(bVar.f1590b);
        gfVar.a(Integer.parseInt(bVar.g));
        gfVar.b(bVar.f1587a);
        gfVar.a("BIND", (String) null);
        gfVar.a(gfVar.e());
        b.m410a("[Slim]: bind id=" + gfVar.e());
        HashMap hashMap = new HashMap();
        hashMap.put(DataHelper.FP_CHALLENGE_KEY, str);
        hashMap.put("token", bVar.c);
        hashMap.put("chid", bVar.g);
        hashMap.put("from", bVar.f1590b);
        hashMap.put("id", gfVar.e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f1589a) {
            hashMap.put("kick", "1");
        } else {
            hashMap.put("kick", "0");
        }
        if (!TextUtils.isEmpty(bVar.e)) {
            hashMap.put("client_attrs", bVar.e);
        } else {
            hashMap.put("client_attrs", "");
        }
        if (!TextUtils.isEmpty(bVar.f)) {
            hashMap.put("cloud_attrs", bVar.f);
        } else {
            hashMap.put("cloud_attrs", "");
        }
        if (bVar.d.equals("XIAOMI-PASS") || bVar.d.equals("XMPUSH-PASS")) {
            str2 = bk.a(bVar.d, null, hashMap, bVar.h);
        } else {
            bVar.d.equals("XIAOMI-SASL");
            str2 = null;
        }
        cVar.f(str2);
        gfVar.a(cVar.m601a(), (String) null);
        gqVar.b(gfVar);
    }

    public static void a(String str, String str2, gq gqVar) {
        gf gfVar = new gf();
        gfVar.c(str2);
        gfVar.a(Integer.parseInt(str));
        gfVar.a("UBND", (String) null);
        gqVar.b(gfVar);
    }
}
