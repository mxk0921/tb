package com.vivo.push.d;

import com.vivo.push.restructure.request.a.a.a;
import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static c.a<b> f14584a = new c();
    private String b;

    public b(String str) {
        this.b = str;
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        a aVar = new a();
        aVar.a(this.b);
        return aVar.d();
    }

    public final String b() {
        return this.b;
    }

    public b(a aVar) throws JSONException {
        this.b = aVar.c();
    }
}
