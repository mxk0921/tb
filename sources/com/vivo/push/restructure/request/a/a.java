package com.vivo.push.restructure.request.a;

import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.util.u;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a<a> f14637a = new b();
    private String b;
    private int c;
    private int d;
    private long e;
    private int f;
    private int g;

    public a(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.c();
            this.c = aVar.a();
            this.e = aVar.b();
            this.f = aVar.a();
            this.d = aVar.a();
            this.g = aVar.a();
        } catch (JSONException e) {
            u.a("CFToClientDS", e);
        }
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.g;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.e);
        aVar.a(this.f);
        aVar.a(this.d);
        aVar.a(this.g);
    }
}
