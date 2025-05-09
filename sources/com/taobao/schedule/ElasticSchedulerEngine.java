package com.taobao.schedule;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c2c;
import tb.d2c;
import tb.ia8;
import tb.ja8;
import tb.ka8;
import tb.la8;
import tb.oa8;
import tb.pa8;
import tb.pxn;
import tb.qa8;
import tb.ra8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ElasticSchedulerEngine implements d2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean h = false;
    public final ServerDispatcher b = new ServerDispatcher();

    /* renamed from: a  reason: collision with root package name */
    public final ia8 f11516a = new ia8();
    public final ka8 c = new ka8();
    public final ElasticMtopPrefetch d = new ElasticMtopPrefetch();
    public final com.taobao.schedule.a e = new com.taobao.schedule.a();
    public final qa8 f = new qa8();
    public final oa8 g = new oa8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11517a;

        public a(Context context) {
            this.f11517a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ElasticSchedulerEngine.g(ElasticSchedulerEngine.this)) {
                if (!ra8.e(this.f11517a)) {
                    la8.c("elastic.Scheduler", "do not initialize in non-main process.", new Object[0]);
                    ElasticSchedulerEngine.h(ElasticSchedulerEngine.this, true);
                    return;
                }
                la8.c("elastic.Scheduler", "initialize called.", new Object[0]);
                pxn.d().i(this.f11517a);
                ElasticTriggerCenter.e().i(this.f11517a);
                ElasticSchedulerEngine.i(ElasticSchedulerEngine.this).e();
                ElasticSchedulerEngine.j(ElasticSchedulerEngine.this).b();
                ElasticSchedulerEngine.k(ElasticSchedulerEngine.this).i();
                ElasticSchedulerEngine.l(ElasticSchedulerEngine.this).g();
                ElasticSchedulerEngine.h(ElasticSchedulerEngine.this, true);
            }
        }
    }

    public static /* synthetic */ boolean g(ElasticSchedulerEngine elasticSchedulerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd800bd", new Object[]{elasticSchedulerEngine})).booleanValue();
        }
        return elasticSchedulerEngine.h;
    }

    public static /* synthetic */ boolean h(ElasticSchedulerEngine elasticSchedulerEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b07c157d", new Object[]{elasticSchedulerEngine, new Boolean(z)})).booleanValue();
        }
        elasticSchedulerEngine.h = z;
        return z;
    }

    public static /* synthetic */ ElasticMtopPrefetch i(ElasticSchedulerEngine elasticSchedulerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ElasticMtopPrefetch) ipChange.ipc$dispatch("78bda51c", new Object[]{elasticSchedulerEngine});
        }
        return elasticSchedulerEngine.d;
    }

    public static /* synthetic */ com.taobao.schedule.a j(ElasticSchedulerEngine elasticSchedulerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.schedule.a) ipChange.ipc$dispatch("3710f511", new Object[]{elasticSchedulerEngine});
        }
        return elasticSchedulerEngine.e;
    }

    public static /* synthetic */ qa8 k(ElasticSchedulerEngine elasticSchedulerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qa8) ipChange.ipc$dispatch("6405860", new Object[]{elasticSchedulerEngine});
        }
        return elasticSchedulerEngine.f;
    }

    public static /* synthetic */ oa8 l(ElasticSchedulerEngine elasticSchedulerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa8) ipChange.ipc$dispatch("db27268a", new Object[]{elasticSchedulerEngine});
        }
        return elasticSchedulerEngine.g;
    }

    public static ElasticSchedulerEngine m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ElasticSchedulerEngine) ipChange.ipc$dispatch("c20551db", new Object[0]);
        }
        return (ElasticSchedulerEngine) pa8.c();
    }

    @Override // tb.d2c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b785fa", new Object[]{this, str});
        } else {
            this.g.i(str);
        }
    }

    @Override // tb.d2c
    public void c(c2c c2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3d5d8f", new Object[]{this, c2cVar});
        } else {
            this.g.e(c2cVar);
        }
    }

    @Override // tb.d2c
    public void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else if (!this.h) {
            ja8.a(new a(context));
        }
    }

    /* renamed from: n */
    public ia8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ia8) ipChange.ipc$dispatch("f8374a3e", new Object[]{this});
        }
        return this.f11516a;
    }

    /* renamed from: o */
    public ElasticTriggerCenter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ElasticTriggerCenter) ipChange.ipc$dispatch("8852abe8", new Object[]{this});
        }
        return ElasticTriggerCenter.e();
    }

    /* renamed from: p */
    public ka8 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ka8) ipChange.ipc$dispatch("dd09bc76", new Object[]{this});
        }
        return this.c;
    }

    public ElasticMtopPrefetch q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ElasticMtopPrefetch) ipChange.ipc$dispatch("d2da4cfe", new Object[]{this});
        }
        return this.d;
    }

    public com.taobao.schedule.a r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.schedule.a) ipChange.ipc$dispatch("7ae92812", new Object[]{this});
        }
        return this.e;
    }

    public ServerDispatcher s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServerDispatcher) ipChange.ipc$dispatch("562d19ef", new Object[]{this});
        }
        return this.b;
    }

    public oa8 t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa8) ipChange.ipc$dispatch("5ccc7751", new Object[]{this});
        }
        return this.g;
    }

    /* renamed from: u */
    public qa8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qa8) ipChange.ipc$dispatch("108cd22d", new Object[]{this});
        }
        return this.f;
    }
}
