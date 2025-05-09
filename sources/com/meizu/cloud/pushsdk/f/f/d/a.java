package com.meizu.cloud.pushsdk.f.f.d;

import com.meizu.cloud.pushsdk.f.f.a;
import com.meizu.cloud.pushsdk.f.g.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends com.meizu.cloud.pushsdk.f.f.a {
    private static final String o = "a";
    private static ScheduledExecutorService p;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.f.d.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0288a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.f.b f5878a;

        public RunnableC0288a(com.meizu.cloud.pushsdk.f.f.b bVar) {
            this.f5878a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5878a.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.d.b f5879a;
        final /* synthetic */ boolean b;

        public b(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
            this.f5879a = bVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.a(this.f5879a, this.b);
        }
    }

    public a(a.C0287a aVar) {
        super(aVar);
        com.meizu.cloud.pushsdk.f.c.h.b.a(this.l);
        c();
    }

    @Override // com.meizu.cloud.pushsdk.f.f.a
    public void a(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
        com.meizu.cloud.pushsdk.f.c.h.b.a(new b(bVar, z));
    }

    public void c() {
        if (p == null && this.j) {
            c.a(o, "Session checking has been resumed.", new Object[0]);
            com.meizu.cloud.pushsdk.f.f.b bVar = this.e;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            p = newSingleThreadScheduledExecutor;
            RunnableC0288a aVar = new RunnableC0288a(bVar);
            long j = this.k;
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(aVar, j, j, this.m);
        }
    }
}
