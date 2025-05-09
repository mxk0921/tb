package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import tb.ce8;
import tb.mg0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o0 {
    private static o0 c;

    /* renamed from: a  reason: collision with root package name */
    private String f5397a;
    private String b;

    private String b(String str) {
        return f() ? mg0.g("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a2 = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a2)) {
            return a(a2);
        }
        String d = ce8.d(16);
        c(b(d));
        return d;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (c == null) {
                c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f5397a)) {
            this.f5397a = c();
        }
        return this.f5397a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (f() != false) goto L_0x003d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = tb.mg0.d(r0, r3)
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.v.c(r0, r1)
            java.lang.String r0 = r2.e()
            java.lang.String r0 = com.huawei.hms.hatool.n.a(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0041
            r3 = 16
            java.lang.String r0 = tb.ce8.d(r3)
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x004f
        L_0x003d:
            com.huawei.hms.hatool.x.c()
            goto L_0x004f
        L_0x0041:
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            goto L_0x003d
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.o0.a(java.lang.String):java.lang.String");
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public void b() {
        String d = ce8.d(16);
        if (c(b(d))) {
            this.f5397a = d;
        }
    }
}
