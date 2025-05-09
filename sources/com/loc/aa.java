package com.loc;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.s3;
import com.taobao.weex.utils.tools.TimeCalculator;
import org.json.JSONObject;
import tb.lca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class aa extends af {

    /* renamed from: a  reason: collision with root package name */
    public String f5549a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    protected byte[] j;

    public aa(Context context) {
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
            jSONObject.put("method", "create");
            jSONObject.put("package_name", l.c(this.k));
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_type", TimeCalculator.PLATFORM_ANDROID);
            jSONObject.put("sdk_version", "4.3.3");
            String a2 = ab.a();
            this.f5549a = a2;
            jSONObject.put(lca.STAGE_T1, a2);
            String b = ab.b();
            this.b = b;
            jSONObject.put(lca.STAGE_T2, b);
            String c = ab.c();
            this.c = c;
            jSONObject.put(lca.STAGE_T3, c);
            String d = ab.d();
            this.d = d;
            jSONObject.put("s1", d);
            String e = ab.e();
            this.e = e;
            jSONObject.put("s2", e);
            String f = ab.f();
            this.f = f;
            jSONObject.put(s3.g, f);
            String g = ab.g();
            this.g = g;
            jSONObject.put("s4", g);
            jSONObject.put("uuid", ab.a(this.k));
            jSONObject.put("android_id", o.g());
            jSONObject.put("hostname", ab.h());
            String t = o.t(this.k);
            this.h = t;
            jSONObject.put("gaid", t);
            String e2 = o.e(this.k);
            this.i = e2;
            jSONObject.put("oaid", e2);
            this.j = ab.a(x.d(jSONObject.toString().getBytes("utf-8")), x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes());
        } catch (Throwable unused) {
        }
        return this.j;
    }
}
