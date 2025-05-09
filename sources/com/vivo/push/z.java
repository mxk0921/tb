package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.c.a;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z implements k {

    /* renamed from: a  reason: collision with root package name */
    private y f14678a = new y();
    private y b = new y();
    private a c;
    private volatile String d;
    private com.vivo.push.restructure.b.a e;

    public z(a aVar, com.vivo.push.restructure.b.a aVar2) {
        this.c = aVar;
        this.e = aVar2;
    }

    private void d(String str) {
        this.d = str;
        this.e.c(this.d);
    }

    @Override // com.vivo.push.k
    public final String b() {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        String d = d();
        if (TextUtils.isEmpty(d)) {
            d = this.e.f();
            t.c(new aa(this, d));
        }
        this.d = d;
        u.d("SubscribeImpl", "getRegidByCoreSdk code = ".concat(String.valueOf(d)));
        return d;
    }

    @Override // com.vivo.push.k
    public final void c(String str) {
        d(str);
    }

    private int c() {
        if (!this.c.d()) {
            return 8013;
        }
        if (this.b.a()) {
            u.d("SubscribeImpl", "isAppSubscribe 两秒内重复调用  ");
            return 1002;
        }
        int i = 1;
        try {
            String a2 = new e(1, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
            u.d("SubscribeImpl", "isAppSubscribe parameter = ".concat(String.valueOf(a2)));
            String a3 = a.a(com.vivo.push.restructure.a.a().b(), a2);
            u.d("SubscribeImpl", "isAppSubscribe isSubscribe = ".concat(String.valueOf(a3)));
            if (!TextUtils.isEmpty(a3)) {
                i = 1 ^ (Boolean.parseBoolean(g.f14607a.a(a3).b()) ? 1 : 0);
            }
        } catch (Exception e) {
            u.a("SubscribeImpl", "isAppSubscribe", e);
        }
        u.d("SubscribeImpl", "isAppSubscribe code = ".concat(String.valueOf(i)));
        return i;
    }

    @Override // com.vivo.push.k
    public final void a(IPushActionListener iPushActionListener, String str, String str2) {
        if (this.c.c() || iPushActionListener == null) {
            m.a().b(iPushActionListener, str, str2);
        } else {
            iPushActionListener.onStateChanged(8012);
        }
    }

    private String d() {
        String str = "";
        if (!this.c.d()) {
            u.d("SubscribeImpl", "getRegidByCoreSdk 系统不支持查询regid  ");
            return str;
        } else if (this.f14678a.a()) {
            u.d("SubscribeImpl", "getRegidByCoreSdk 两秒内重复调用  ");
            return str;
        } else {
            try {
                String a2 = new e(2, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
                u.d("SubscribeImpl", "getRegidByCoreSdk parameter = ".concat(String.valueOf(a2)));
                String a3 = a.a(com.vivo.push.restructure.a.a().b(), a2);
                u.d("SubscribeImpl", "getRegidByCoreSdk isSubscribe = ".concat(String.valueOf(a3)));
                if (!TextUtils.isEmpty(a3)) {
                    str = g.f14607a.a(a3).b();
                }
            } catch (Exception e) {
                u.a("SubscribeImpl", "getRegidByCoreSdk", e);
            }
            u.d("SubscribeImpl", "getRegidByCoreSdk code = ".concat(String.valueOf(str)));
            return str;
        }
    }

    @Override // com.vivo.push.k
    public final int a() {
        return c();
    }

    @Override // com.vivo.push.k
    public final void a(String str, String str2, String str3) {
        d(str);
        this.e.a(str2);
        this.e.b(str3);
    }

    @Override // com.vivo.push.k
    public final void a(String str) {
        d(str);
        this.e.d();
        this.e.b();
    }

    @Override // com.vivo.push.k
    public final void b(String str) {
        d(str);
        m.a().e();
        this.e.h();
        this.e.d();
        this.e.b();
    }
}
