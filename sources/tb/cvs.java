package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;
import tb.cvs;
import tb.pzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final re4 b;
    public static final pzf c;

    /* renamed from: a  reason: collision with root package name */
    public pzf f17358a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438749);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final xhv c(ue4 ue4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("a6788c18", new Object[]{ue4Var});
            }
            ckf.g(ue4Var, "$this$getTaskExecutor");
            ue4Var.a(ContainerType.KSerial);
            return xhv.INSTANCE;
        }

        public final cvs b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cvs) ipChange.ipc$dispatch("ffd1f7a8", new Object[]{this});
            }
            return d(new g1a() { // from class: tb.bvs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv c;
                    c = cvs.a.c((ue4) obj);
                    return c;
                }
            });
        }

        public final cvs d(g1a<? super ue4, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cvs) ipChange.ipc$dispatch("82226c2d", new Object[]{this, g1aVar});
            }
            ckf.g(g1aVar, "config");
            ue4 ue4Var = new ue4();
            g1aVar.invoke(ue4Var);
            return new cvs(ue4Var);
        }

        public final void e(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbbd85fb", new Object[]{this, d1aVar});
                return;
            }
            ckf.g(d1aVar, "task");
            if (!cvs.a().c()) {
                cvs.b().a(d1aVar);
            } else {
                d1aVar.invoke();
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438748);
        re4 re4Var = new re4();
        b = re4Var;
        pzf a2 = re4Var.a();
        pzf.a.a(a2, "TaoLiveCommonConcurrentMain", ContainerType.KMain, 0, 4, null);
        c = a2;
    }

    public cvs(ue4 ue4Var) {
        ckf.g(ue4Var, "config");
    }

    public static final /* synthetic */ re4 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (re4) ipChange.ipc$dispatch("47b7f060", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ pzf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("cd5eec8e", new Object[0]);
        }
        return c;
    }

    public final pzf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("45fc6dc1", new Object[]{this});
        }
        pzf a2 = b.a();
        pzf.a.a(a2, "TaoLiveCommonConcurrentMain", ContainerType.KMain, 0, 4, null);
        this.f17358a = a2;
        return a2;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
            return;
        }
        pzf pzfVar = this.f17358a;
        if (pzfVar != null) {
            pzfVar.shutdown();
        }
        this.f17358a = null;
    }

    public final void e(double d, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d019d80", new Object[]{this, new Double(d), d1aVar});
            return;
        }
        ckf.g(d1aVar, "task");
        pzf pzfVar = this.f17358a;
        if (pzfVar != null) {
            pzfVar.b(d, d1aVar);
        } else {
            c().b(d, d1aVar);
        }
    }
}
