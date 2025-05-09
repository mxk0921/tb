package com.meizu.cloud.pushsdk.f.f;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.f.g.b;
import com.meizu.cloud.pushsdk.f.g.c;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5873a = "a";
    protected com.meizu.cloud.pushsdk.f.c.a c;
    protected c d;
    protected b e;
    protected final String f;
    protected final String g;
    protected final boolean h;
    protected final b i;
    protected final boolean j;
    protected final long k;
    protected final int l;
    protected final TimeUnit m;
    protected final String b = PushManager.TAG;
    protected final AtomicBoolean n = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.f.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0287a {

        /* renamed from: a  reason: collision with root package name */
        protected final com.meizu.cloud.pushsdk.f.c.a f5874a;
        protected final String b;
        protected final String c;
        protected final Context d;
        protected c e = null;
        protected boolean f = false;
        protected b g = b.OFF;
        protected boolean h = false;
        protected long i = 600;
        protected long j = 300;
        protected long k = 15;
        protected int l = 10;
        protected TimeUnit m = TimeUnit.SECONDS;

        public C0287a(com.meizu.cloud.pushsdk.f.c.a aVar, String str, String str2, Context context, Class<? extends a> cls) {
            this.f5874a = aVar;
            this.b = str;
            this.c = str2;
            this.d = context;
        }

        public C0287a a(int i) {
            this.l = i;
            return this;
        }

        public C0287a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public C0287a a(b bVar) {
            this.g = bVar;
            return this;
        }

        public C0287a a(Boolean bool) {
            this.f = bool.booleanValue();
            return this;
        }
    }

    public a(C0287a aVar) {
        this.c = aVar.f5874a;
        this.g = aVar.c;
        this.h = aVar.f;
        this.f = aVar.b;
        this.d = aVar.e;
        this.i = aVar.g;
        boolean z = aVar.h;
        this.j = z;
        this.k = aVar.k;
        int i = aVar.l;
        this.l = i < 2 ? 2 : i;
        TimeUnit timeUnit = aVar.m;
        this.m = timeUnit;
        if (z) {
            this.e = new b(aVar.i, aVar.j, timeUnit, aVar.d);
        }
        c.a(aVar.g);
        c.c(f5873a, "Tracker created successfully.", new Object[0]);
    }

    private com.meizu.cloud.pushsdk.f.b.b a(List<com.meizu.cloud.pushsdk.f.b.b> list) {
        if (this.j) {
            list.add(this.e.b());
        }
        c cVar = this.d;
        if (cVar != null) {
            if (!cVar.b().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.f.b.b("geolocation", this.d.b()));
            }
            if (!this.d.c().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.f.b.b("mobileinfo", this.d.c()));
            }
        }
        LinkedList linkedList = new LinkedList();
        for (com.meizu.cloud.pushsdk.f.b.b bVar : list) {
            linkedList.add(bVar.a());
        }
        return new com.meizu.cloud.pushsdk.f.b.b("push_extra_info", linkedList);
    }

    public void b() {
        if (this.n.get()) {
            a().b();
        }
    }

    public com.meizu.cloud.pushsdk.f.c.a a() {
        return this.c;
    }

    private void a(com.meizu.cloud.pushsdk.f.b.c cVar, List<com.meizu.cloud.pushsdk.f.b.b> list, boolean z) {
        if (this.d != null) {
            cVar.a(new HashMap(this.d.a()));
            cVar.a("et", a(list).a());
        }
        c.c(f5873a, "Adding new payload to event storage: %s", cVar);
        this.c.a(cVar, z);
    }

    public void a(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
        if (this.n.get()) {
            a(bVar.e(), bVar.b(), z);
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }
}
