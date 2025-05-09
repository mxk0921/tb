package com.vivo.push.restructure.request.a;

import com.vivo.push.restructure.a;
import com.vivo.push.restructure.request.a.a.b;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a<c> f14639a = new d();
    private String b;
    private int c;
    private long d;
    private int e;

    public c(int i, int i2) {
        this.b = a.a().b().getPackageName();
        this.c = i;
        this.d = 341L;
        this.e = i2;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.d);
        aVar.a(this.e);
    }

    public c(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.c();
            this.c = aVar.a();
            this.d = aVar.b();
            this.e = aVar.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
