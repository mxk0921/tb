package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b69 extends jv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<wu> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends wu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/performanceoptimizationservice/impl/trace/feeds/datachange/FeedsDataChangePerformanceTrace$1");
        }

        @Override // tb.wu
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                rca.b(b69.d(b69.this), true, b69.e(b69.this));
            }
        }

        @Override // tb.wu
        public void c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                rca.b(b69.d(b69.this), false, true);
            }
        }

        @Override // tb.wu
        public void d(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            } else {
                rca.b(b69.d(b69.this), false, true);
            }
        }

        @Override // tb.wu
        public void e(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                rca.b(b69.d(b69.this), false, true);
            }
        }

        @Override // tb.wu
        public void f(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                mxl.l(b69.d(b69.this), false, true);
            }
        }

        @Override // tb.wu
        public void g(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                rca.b(b69.d(b69.this), false, true);
            }
        }
    }

    static {
        t2o.a(491782541);
    }

    public b69(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ String d(b69 b69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88d3359a", new Object[]{b69Var});
        }
        return b69Var.g();
    }

    public static /* synthetic */ boolean e(b69 b69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("627bfa4b", new Object[]{b69Var})).booleanValue();
        }
        return b69Var.h();
    }

    public static /* synthetic */ Object ipc$super(b69 b69Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/performanceoptimizationservice/impl/trace/feeds/datachange/FeedsDataChangePerformanceTrace");
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
        } else {
            i();
        }
    }

    public final wu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wu) ipChange.ipc$dispatch("da108403", new Object[]{this});
        }
        return new a();
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return c().getContainerType().getContainerId();
    }

    public final boolean h() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c99fcd65", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) c().a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null) {
            return false;
        }
        return base.isRemote();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a340bf4a", new Object[]{this});
            return;
        }
        h6c<?> b = b();
        if (b != null) {
            wu f = f();
            this.b = new WeakReference<>(f);
            b.J(f);
        }
    }

    public final void j() {
        wu wuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1ffaa", new Object[]{this});
            return;
        }
        h6c<?> b = b();
        if (b != null && (wuVar = this.b.get()) != null) {
            b.E(wuVar);
        }
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else {
            j();
        }
    }
}
