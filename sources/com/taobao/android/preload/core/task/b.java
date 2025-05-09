package com.taobao.android.preload.core.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.btm;
import tb.csm;
import tb.cw6;
import tb.ddt;
import tb.det;
import tb.ktm;
import tb.kzd;
import tb.ltm;
import tb.on8;
import tb.wsm;
import tb.yjd;
import tb.ysm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9179a = new AtomicBoolean(false);
    public final PreloadTaskEntity b;
    public final ddt c;
    public final int d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements det.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.preload.core.task.a f9180a;
        public final /* synthetic */ kzd b;
        public final /* synthetic */ yjd c;
        public final /* synthetic */ on8 d;

        public a(com.taobao.android.preload.core.task.a aVar, kzd kzdVar, yjd yjdVar, on8 on8Var) {
            this.f9180a = aVar;
            this.b = kzdVar;
            this.c = yjdVar;
            this.d = on8Var;
        }

        public ysm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ysm) ipChange.ipc$dispatch("bffd5b74", new Object[]{this});
            }
            return b.a(b.this, this.f9180a, this.b, this.c, this.d);
        }
    }

    public b(PreloadTaskEntity preloadTaskEntity, ddt ddtVar, int i, int i2) {
        this.b = preloadTaskEntity;
        this.c = ddtVar;
        this.d = i == 0 ? 5 : i;
        this.e = i2 == 0 ? 2 : i2;
    }

    public static /* synthetic */ ysm a(b bVar, com.taobao.android.preload.core.task.a aVar, kzd kzdVar, yjd yjdVar, on8 on8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysm) ipChange.ipc$dispatch("840173d3", new Object[]{bVar, aVar, kzdVar, yjdVar, on8Var});
        }
        return bVar.b(aVar, kzdVar, yjdVar, on8Var);
    }

    public static b c(PreloadTaskEntity preloadTaskEntity, ddt ddtVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("21567768", new Object[]{preloadTaskEntity, ddtVar, new Integer(i), new Integer(i2)});
        }
        return new b(preloadTaskEntity, ddtVar, i, i2);
    }

    public final ysm b(com.taobao.android.preload.core.task.a aVar, kzd kzdVar, yjd yjdVar, on8 on8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysm) ipChange.ipc$dispatch("2409f360", new Object[]{this, aVar, kzdVar, yjdVar, on8Var});
        }
        PreloadTaskEntity b = aVar.b(this.d, this.e, kzdVar);
        if (b != null) {
            return new ysm(this.c, kzdVar, b, yjdVar, on8Var);
        }
        wsm.c(csm.a("RealTask"), "buildPreloadTask newEntity is null");
        return null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82860ee4", new Object[]{this})).booleanValue();
        }
        return this.f9179a.get();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9fc367", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("发起预请求原始列表: ");
        Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
        while (it.hasNext()) {
            sb.append(it.next().e);
            sb.append(",");
        }
        wsm.c(csm.a("RealTask"), sb.toString());
    }

    public synchronized void d(com.taobao.android.preload.core.task.a aVar, kzd kzdVar, yjd yjdVar, on8 on8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e69189f", new Object[]{this, aVar, kzdVar, yjdVar, on8Var});
        } else if (e()) {
            wsm.a(csm.a("RealTask"), "isExecuted");
        } else if (kzdVar == null) {
            wsm.a(csm.a("RealTask"), "taskExecutor is null");
        } else {
            ktm a2 = ltm.a(this.b.bizName);
            if (a2 == null) {
                wsm.a(csm.a("RealTask"), "preloadTaskStore is null");
                return;
            }
            if (cw6.b()) {
                f();
                a2.b();
            }
            Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
            while (it.hasNext()) {
                PreloadTaskEntity.a next = it.next();
                if (TextUtils.equals(next.j, "replace")) {
                    a2.f(next.e);
                }
                if (a2.h(next.e)) {
                    if (cw6.b()) {
                        String a3 = csm.a("RealTask");
                        wsm.c(a3, next.e + "在缓存中已有，过滤掉不再发起请求");
                    }
                } else if (!kzdVar.c(next)) {
                    if (next.h != null) {
                        a2.d(new btm.b().n("deliver").l("low").m(next.e).o(next.h).p(this.b.sourceFrom).k());
                        if (cw6.b()) {
                            String a4 = csm.a("RealTask");
                            wsm.c(a4, next.e + "存在cachedata，过滤掉不再发起请求");
                        }
                    } else if (!next.i) {
                        aVar.a(next);
                    } else if (cw6.b()) {
                        String a5 = csm.a("RealTask");
                        wsm.c(a5, next.e + "disablePreRequest 为true，过滤掉不再发起请求");
                    }
                }
            }
            ysm b = b(aVar, kzdVar, yjdVar, on8Var);
            if (b == null) {
                wsm.c(csm.a("RealTask"), "准备队列中没有可执行的任务");
                return;
            }
            kzdVar.b(new a(aVar, kzdVar, yjdVar, on8Var));
            kzdVar.a(b);
            this.f9179a.set(true);
        }
    }
}
