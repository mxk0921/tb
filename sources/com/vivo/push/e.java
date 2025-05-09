package com.vivo.push;

import com.vivo.push.restructure.request.a.a.a;
import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static c.a<e> f14591a = new f();
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public e(int i, String str, String str2, String str3, String str4) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        a aVar = new a();
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.d);
        aVar.a(this.e);
        aVar.a(this.f);
        return aVar.d();
    }

    public e(a aVar) throws JSONException {
        this.b = aVar.a();
        this.c = aVar.c();
        this.d = aVar.c();
        this.e = aVar.c();
        this.f = aVar.c();
    }
}
