package com.loc;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    private static ac f5550a;
    private static boolean b;
    private static boolean c;
    private Context d;

    private ac(Context context) {
        this.d = context;
    }

    public static ac a(Context context) {
        if (f5550a == null) {
            synchronized (ac.class) {
                try {
                    if (f5550a == null) {
                        f5550a = new ac(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5550a;
    }

    public final String a() {
        cr a2;
        cs csVar;
        String str = "";
        try {
            if (z.d) {
                str = y.c(this.d);
                long d = y.d(this.d);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (TextUtils.isEmpty(str)) {
                    a2 = cr.a();
                    csVar = new cs() { // from class: com.loc.ac.1
                        @Override // com.loc.cs
                        public final void a() {
                            try {
                                if (ac.b) {
                                    boolean unused = ac.b = false;
                                    return;
                                }
                                boolean unused2 = ac.b = true;
                                aa aaVar = new aa(ac.this.d);
                                new bo();
                                bu a3 = bo.a(aaVar);
                                if (a3 != null) {
                                    JSONObject jSONObject = new JSONObject(x.a(ab.a(a3.f5615a, x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                                    if (jSONObject.optBoolean("suc")) {
                                        y.f(ac.this.d, aaVar.f5549a);
                                        y.g(ac.this.d, aaVar.b);
                                        y.h(ac.this.d, aaVar.c);
                                        y.i(ac.this.d, aaVar.d);
                                        y.j(ac.this.d, aaVar.e);
                                        y.k(ac.this.d, aaVar.f);
                                        y.l(ac.this.d, aaVar.g);
                                        y.b(ac.this.d, aaVar.i);
                                        y.m(ac.this.d, aaVar.h);
                                        y.a(ac.this.d, SystemClock.elapsedRealtime());
                                        String optString = jSONObject.optString("aaid", "");
                                        String optString2 = jSONObject.optString("resetToken", "");
                                        String optString3 = jSONObject.optString("uabc", "");
                                        if (!TextUtils.isEmpty(optString)) {
                                            y.c(ac.this.d, optString);
                                        }
                                        if (!TextUtils.isEmpty(optString2)) {
                                            y.e(ac.this.d, optString2);
                                        }
                                        if (!TextUtils.isEmpty(optString3)) {
                                            y.d(ac.this.d, optString3);
                                        }
                                    }
                                }
                                boolean unused3 = ac.b = false;
                            } catch (Throwable unused4) {
                                boolean unused5 = ac.b = false;
                            }
                        }
                    };
                } else if (elapsedRealtime - d > z.b) {
                    a2 = cr.a();
                    csVar = new cs() { // from class: com.loc.ac.2
                        @Override // com.loc.cs
                        public final void a() {
                            try {
                                if (ac.c) {
                                    boolean unused = ac.c = false;
                                    return;
                                }
                                boolean unused2 = ac.c = true;
                                ad adVar = new ad(ac.this.d);
                                new bo();
                                bu a3 = bo.a(adVar);
                                if (a3 != null) {
                                    JSONObject jSONObject = new JSONObject(x.a(ab.a(a3.f5615a, x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                                    if (jSONObject.optBoolean("suc")) {
                                        y.f(ac.this.d, adVar.f5553a);
                                        y.g(ac.this.d, adVar.b);
                                        y.h(ac.this.d, adVar.c);
                                        y.i(ac.this.d, adVar.d);
                                        y.j(ac.this.d, adVar.e);
                                        y.k(ac.this.d, adVar.f);
                                        y.l(ac.this.d, adVar.g);
                                        y.b(ac.this.d, adVar.i);
                                        y.m(ac.this.d, adVar.h);
                                        y.a(ac.this.d, SystemClock.elapsedRealtime());
                                        String optString = jSONObject.optString("aaid", "");
                                        String optString2 = jSONObject.optString("resetToken", "");
                                        String optString3 = jSONObject.optString("uabc", "");
                                        if (!TextUtils.isEmpty(optString)) {
                                            y.c(ac.this.d, optString);
                                        }
                                        if (!TextUtils.isEmpty(optString2)) {
                                            y.e(ac.this.d, optString2);
                                        }
                                        if (!TextUtils.isEmpty(optString3)) {
                                            y.d(ac.this.d, optString3);
                                        }
                                    }
                                }
                                boolean unused3 = ac.c = false;
                            } catch (Throwable unused4) {
                                boolean unused5 = ac.c = false;
                            }
                        }
                    };
                }
                a2.b(csVar);
            }
        } catch (Throwable unused) {
        }
        return str;
    }
}
