package com.vivo.push.restructure;

import android.content.Context;
import com.vivo.push.k;
import com.vivo.push.restructure.a.a.d;
import com.vivo.push.restructure.b.b;
import com.vivo.push.restructure.b.f;
import com.vivo.push.util.z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14622a;
    private com.vivo.push.restructure.c.a b;
    private d c;
    private com.vivo.push.restructure.b.a d;
    private b e;
    private com.vivo.push.c.a f;
    private k g;

    /* compiled from: Taobao */
    /* renamed from: com.vivo.push.restructure.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0852a {

        /* renamed from: a  reason: collision with root package name */
        static a f14623a = new a((byte) 0);
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0852a.f14623a;
    }

    public final synchronized Context b() {
        return this.f14622a;
    }

    public final com.vivo.push.restructure.c.a c() {
        return this.b;
    }

    public final d d() {
        return this.c;
    }

    public final synchronized com.vivo.push.restructure.b.a e() {
        return this.d;
    }

    public final b f() {
        return this.e;
    }

    public final com.vivo.push.c.a g() {
        return this.f;
    }

    public final k h() {
        return this.g;
    }

    private a() {
    }

    public final synchronized void a(Context context) {
        if (context != null) {
            this.f14622a = context;
            com.vivo.push.restructure.b.d dVar = new com.vivo.push.restructure.b.d(new z(context));
            this.d = dVar;
            this.b = new com.vivo.push.restructure.c.b(dVar);
            this.c = new d();
            this.e = new f();
            com.vivo.push.c.a aVar = new com.vivo.push.c.a(context);
            this.f = aVar;
            this.g = new com.vivo.push.z(aVar, e());
        }
    }
}
