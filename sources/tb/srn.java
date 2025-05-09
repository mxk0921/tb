package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;
import tb.lgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class srn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28232a;
    public final ysn b;
    public final h6c<RecyclerView> c;
    public final h6c.b d;
    public final IContainerDataService<?> e;
    public final IMainFeedsViewService<?> f;
    public final View.OnAttachStateChangeListener g = e();
    public lgc.a h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.srn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC1058a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView f28234a;

            public RunnableC1058a(RecyclerView recyclerView) {
                this.f28234a = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    srn.this.i(this.f28234a);
                }
            }
        }

        public a() {
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else if (srn.a(srn.this) != null) {
                RecyclerView recyclerView = (RecyclerView) srn.a(srn.this).getOriginalView();
                if (mve.a("enableFirstScreenExpose", true) && recyclerView != null) {
                    get.a().f(new RunnableC1058a(recyclerView), 100L);
                }
            }
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements lgc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.lgc.a
        public void e(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66994eec", new Object[]{this, viewHolder});
            } else if (mve.a("enableInsertExposeBugfix", true) && srn.a(srn.this) != null) {
                srn.a(srn.this).forceExposure();
            }
        }

        @Override // tb.lgc.a
        public void f(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe53713a", new Object[]{this, viewHolder});
            }
        }

        @Override // tb.lgc.a
        public void g(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bd58c33", new Object[]{this, viewHolder});
            }
        }

        @Override // tb.lgc.a
        public void k(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38fae81", new Object[]{this, viewHolder});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else if (srn.b(srn.this)) {
                srn.d(srn.this).onScrollStateChanged((RecyclerView) view, 0);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            try {
                if (srn.b(srn.this)) {
                    srn.c(srn.this, false);
                    srn.d(srn.this).onScrollStateChanged((RecyclerView) view, 0);
                    srn.d(srn.this).E();
                }
            } catch (Throwable unused) {
                fve.e("ExposureController", "onViewDetachedFromWindow error");
            }
        }
    }

    static {
        t2o.a(486539642);
    }

    public srn(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        this.e = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.f = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = h6cVar;
        ysn ysnVar = new ysn(cfcVar);
        this.b = ysnVar;
        k(ysnVar, h6cVar);
        h6c.b f = f();
        this.d = f;
        h6cVar.M(f);
        j();
    }

    public static /* synthetic */ IMainFeedsViewService a(srn srnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("26845d7f", new Object[]{srnVar});
        }
        return srnVar.f;
    }

    public static /* synthetic */ boolean b(srn srnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8998a9dc", new Object[]{srnVar})).booleanValue();
        }
        return srnVar.f28232a;
    }

    public static /* synthetic */ boolean c(srn srnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab44cbe", new Object[]{srnVar, new Boolean(z)})).booleanValue();
        }
        srnVar.f28232a = z;
        return z;
    }

    public static /* synthetic */ ysn d(srn srnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysn) ipChange.ipc$dispatch("103e3c49", new Object[]{srnVar});
        }
        return srnVar.b;
    }

    public final View.OnAttachStateChangeListener e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("d77d2a91", new Object[]{this});
        }
        return new c();
    }

    public final h6c.b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("a8a36fe", new Object[]{this});
        }
        return new a();
    }

    public final lgc.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgc.a) ipChange.ipc$dispatch("837ca797", new Object[]{this});
        }
        return new b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.v(this.b);
        this.c.q(this.b);
        this.c.E(this.b);
        this.c.L(this.g);
        h6c.b bVar = this.d;
        if (bVar != null) {
            this.c.k(bVar);
        }
        l();
    }

    public void i(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6d423e", new Object[]{this, recyclerView});
            return;
        }
        this.f28232a = true;
        this.b.onScrollStateChanged(recyclerView, 0);
    }

    public final void j() {
        h6c lifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc06534", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f;
        if (iMainFeedsViewService != null && (lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister()) != null) {
            lgc.a g = g();
            this.h = g;
            lifeCycleRegister.x(g);
        }
    }

    public final void k(ysn ysnVar, h6c<RecyclerView> h6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66410580", new Object[]{this, ysnVar, h6cVar});
            return;
        }
        h6cVar.h(ysnVar);
        h6cVar.y(ysnVar);
        h6cVar.g(this.g);
        h6cVar.J(ysnVar);
    }

    public final void l() {
        h6c lifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b7cf6d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f;
        if (iMainFeedsViewService != null && this.h != null && (lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister()) != null) {
            lifeCycleRegister.n(this.h);
        }
    }
}
