package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private int f14675a;
    private String b;

    public v(int i) {
        this.f14675a = -1;
        if (i >= 0) {
            this.f14675a = i;
            return;
        }
        throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
    }

    private void e(d dVar) {
        dVar.a("command", this.f14675a);
        dVar.a("client_pkgname", this.b);
        c(dVar);
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.f14675a;
    }

    public abstract void c(d dVar);

    public boolean c() {
        return false;
    }

    public abstract void d(d dVar);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void b(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            u.b("PushCommand", "bundleWapper is null");
            return;
        }
        a2.a("method", this.f14675a);
        e(a2);
        Bundle b = a2.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    public final void a(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            u.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a2);
        Bundle b = a2.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    public final void a(d dVar) {
        String a2 = x.a(this.f14675a);
        if (a2 == null) {
            a2 = "";
        }
        dVar.a("method", a2);
        e(dVar);
    }

    public final void b(d dVar) {
        String a2 = dVar.a();
        if (!TextUtils.isEmpty(a2)) {
            this.b = a2;
        } else {
            this.b = dVar.a("client_pkgname");
        }
        d(dVar);
    }
}
