package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kvy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f22956a;
    public final lvy b;
    public final h6c.e c = d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6c.e
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4813aba", new Object[]{this, new Boolean(z)});
                return;
            }
            mz8 a2 = kvy.a(kvy.this);
            if (a2 != null) {
                if (z) {
                    a2.a("InfoFlow", kvy.b(kvy.this));
                    fve.e("ScreenshotLifecycleHandler", "注册截屏监听（独占），容器ID：" + kvy.c(kvy.this).getContainerType().getContainerId());
                    return;
                }
                a2.unregisterListener("InfoFlow");
                fve.e("ScreenshotLifecycleHandler", "注销截屏监听（独占），容器ID：" + kvy.c(kvy.this).getContainerType().getContainerId());
            }
        }
    }

    static {
        t2o.a(491782639);
    }

    public kvy(cfc cfcVar, lvy lvyVar) {
        this.f22956a = cfcVar;
        this.b = lvyVar;
    }

    public static /* synthetic */ mz8 a(kvy kvyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz8) ipChange.ipc$dispatch("65dd74ff", new Object[]{kvyVar});
        }
        return kvyVar.e();
    }

    public static /* synthetic */ lvy b(kvy kvyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lvy) ipChange.ipc$dispatch("375b29e4", new Object[]{kvyVar});
        }
        return kvyVar.b;
    }

    public static /* synthetic */ cfc c(kvy kvyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("8d5bc5f8", new Object[]{kvyVar});
        }
        return kvyVar.f22956a;
    }

    public final h6c.e d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.e) ipChange.ipc$dispatch("adb75a09", new Object[]{this});
        }
        return new a();
    }

    public final mz8 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz8) ipChange.ipc$dispatch("2402c96c", new Object[]{this});
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            return null;
        }
        return tz8Var.g();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d654163", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f22956a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.getLifeCycleRegister().Q(this.c);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3867c6a", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f22956a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.getLifeCycleRegister().o(this.c);
        }
    }
}
