package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.g.j.c;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g {
    private static final ExecutorService b = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> c = new ConcurrentHashMap(16);
    private static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f5349a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Callable<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5350a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;

        public a(c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f5350a = cVar;
            this.b = str;
            this.c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f5350a, g.this.f5349a).a(g.b, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5351a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;
        final /* synthetic */ int d;
        final /* synthetic */ com.huawei.hms.framework.network.grs.b e;

        public b(c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i, com.huawei.hms.framework.network.grs.b bVar) {
            this.f5351a = cVar;
            this.b = str;
            this.c = cVar2;
            this.d = i;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f5351a, this.b, this.c, this.d), this.e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r3.a() != false) goto L_0x006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.framework.network.grs.g.d a(com.huawei.hms.framework.network.grs.g.j.c r9, java.lang.String r10, com.huawei.hms.framework.network.grs.e.c r11, int r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.g.a(com.huawei.hms.framework.network.grs.g.j.c, java.lang.String, com.huawei.hms.framework.network.grs.e.c, int):com.huawei.hms.framework.network.grs.g.d");
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f5349a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar == null) {
            return;
        }
        if (dVar == null) {
            Logger.v("RequestController", "GrsResponse is null");
            bVar.a();
            return;
        }
        Logger.v("RequestController", "GrsResponse is not null");
        bVar.a(dVar);
    }

    public void a(c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        b.execute(new b(cVar, str, cVar2, i, bVar));
    }

    public void a(String str) {
        synchronized (d) {
            c.remove(str);
        }
    }
}
