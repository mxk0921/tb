package com.vivo.push;

import com.vivo.push.restructure.request.a.a.a;
import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static c.a<g> f14607a = new h();
    private int b;
    private String c;

    public g(a aVar) throws JSONException {
        this.b = aVar.a();
        this.c = aVar.c();
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        a aVar = new a();
        aVar.a(this.b);
        aVar.a(this.c);
        return aVar.d();
    }

    public final String b() {
        return this.c;
    }
}
