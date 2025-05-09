package tb;

import android.content.Context;
import android.os.Trace;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.p;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l86 extends bd5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DXPreRenderWorkTask";
    private final tc5<DXResult<DXRootView>> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f23167a;

        public a(DXRuntimeContext dXRuntimeContext) {
            this.f23167a = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l86.h(l86.this).a(this.f23167a, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXResult f23168a;

        public b(DXResult dXResult) {
            this.f23168a = dXResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l86.h(l86.this).b(this.f23168a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f23169a;
        public final /* synthetic */ Throwable b;

        public c(DXRuntimeContext dXRuntimeContext, Throwable th) {
            this.f23169a = dXRuntimeContext;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l86.h(l86.this).a(this.f23169a, this.b);
            }
        }
    }

    static {
        t2o.a(444596521);
    }

    public l86(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, av5 av5Var, ph5 ph5Var) {
        this(dXRuntimeContext, dXRenderOptions, pVar, kVar, av5Var, ph5Var, null);
    }

    public static /* synthetic */ tc5 h(l86 l86Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tc5) ipChange.ipc$dispatch("77aa2a80", new Object[]{l86Var});
        }
        return l86Var.k;
    }

    public static /* synthetic */ Object ipc$super(l86 l86Var, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.run();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXPreRenderWorkTask");
    }

    @Override // tb.bd5
    public m a(av5 av5Var, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("92a7837d", new Object[]{this, av5Var, pVar});
        }
        if (eb5.w()) {
            return new y66(av5Var, pVar);
        }
        return new m(av5Var, pVar);
    }

    @Override // tb.bd5
    public p b(av5 av5Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("a13e0cbc", new Object[]{this, av5Var, context});
        }
        return new p(av5Var, context);
    }

    @Override // tb.bd5, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (g.v != null && zg5.y2()) {
            g.v.a();
        }
        DXRuntimeContext d = d();
        if (d != null) {
            try {
                Trace.beginSection("dx_prerender_" + d.R());
                super.run();
                av5 f = f();
                DXEngineConfig e = e();
                m c2 = c(e, f);
                d.h0(new WeakReference<>(c2));
                d.N().h = new WeakReference<>(new bew(d.h().getApplicationContext()));
                DXRootView dXRootView = new DXRootView(d.h());
                dXRootView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                dXRootView.dxTemplateItem = d.p();
                if (!(f == null || f.f() == null)) {
                    dXRootView.setBindingXManagerWeakReference(f.f().p);
                }
                d.o.q = new WeakReference<>(dXRootView);
                DXResult<DXRootView> x = c2.x(dXRootView, d, -1, this.g);
                this.h = true;
                if (!(x == null || x.f7291a == null)) {
                    zm6.g().c(x.f7291a, d.p(), e.f7286a);
                    if (this.k != null) {
                        if (d.Y()) {
                            jb6.p(new a(d));
                        } else {
                            jb6.p(new b(x));
                        }
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public l86(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, av5 av5Var, ph5 ph5Var, tc5<DXResult<DXRootView>> tc5Var) {
        super(dXRuntimeContext, dXRenderOptions, pVar, kVar, av5Var, ph5Var);
        this.k = tc5Var;
    }
}
