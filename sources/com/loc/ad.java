package com.loc;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.s3;
import com.taobao.weex.utils.tools.TimeCalculator;
import org.json.JSONObject;
import tb.lca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ad extends af {

    /* renamed from: a  reason: collision with root package name */
    public String f5553a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    protected byte[] j;

    public ad(Context context) {
        super(context);
    }

    @Override // com.loc.bt
    public final byte[] d() {
        byte[] bArr = this.j;
        if (bArr != null) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "remap");
            jSONObject.put("package_name", l.c(this.k));
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_type", TimeCalculator.PLATFORM_ANDROID);
            jSONObject.put("sdk_version", "4.3.3");
            String a2 = ab.a();
            this.f5553a = a2;
            jSONObject.put(lca.STAGE_T1, a2);
            jSONObject.put("old_t1", y.g(this.k));
            String b = ab.b();
            this.b = b;
            jSONObject.put(lca.STAGE_T2, b);
            jSONObject.put("old_t2", y.h(this.k));
            String c = ab.c();
            this.c = c;
            jSONObject.put(lca.STAGE_T3, c);
            jSONObject.put("old_t3", y.i(this.k));
            String d = ab.d();
            this.d = d;
            jSONObject.put("s1", d);
            jSONObject.put("old_s1", y.j(this.k));
            String e = ab.e();
            this.e = e;
            jSONObject.put("s2", e);
            jSONObject.put("old_s2", y.k(this.k));
            String f = ab.f();
            this.f = f;
            jSONObject.put(s3.g, f);
            jSONObject.put("old_s3", y.l(this.k));
            String g = ab.g();
            this.g = g;
            jSONObject.put("s4", g);
            jSONObject.put("old_s4", y.m(this.k));
            jSONObject.put("uuid", ab.a(this.k));
            jSONObject.put("android_id", o.g());
            jSONObject.put("hostname", ab.h());
            String t = o.t(this.k);
            this.h = t;
            jSONObject.put("gaid", t);
            jSONObject.put("old_gaid", y.n(this.k));
            String e2 = o.e(this.k);
            this.i = e2;
            jSONObject.put("oaid", e2);
            jSONObject.put("old_oaid", y.b(this.k));
            jSONObject.put("aaid", y.c(this.k));
            jSONObject.put("resetToken", y.f(this.k));
            jSONObject.put("uabc", y.e(this.k));
            this.j = ab.a(x.d(jSONObject.toString().getBytes("utf-8")), x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes());
        } catch (Throwable unused) {
        }
        return this.j;
    }
}
