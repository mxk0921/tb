package com.taobao.android.dinamicx;

import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.av5;
import tb.eb5;
import tb.h36;
import tb.ic5;
import tb.jb6;
import tb.mc6;
import tb.sqm;
import tb.t2o;
import tb.tc5;
import tb.vc5;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n extends mc6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public tc5<DXRuntimeContext> g;
    public Runnable h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n nVar = n.this;
            nVar.g.b(nVar.f23937a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n nVar = n.this;
            nVar.g.a(nVar.f23937a, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f7330a;

        public c(Throwable th) {
            this.f7330a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n nVar = n.this;
            nVar.g.a(nVar.f23937a, this.f7330a);
        }
    }

    static {
        t2o.a(444596559);
    }

    public n(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, av5 av5Var, k kVar, View view, tc5<DXRuntimeContext> tc5Var) {
        super(dXRuntimeContext, dXRenderOptions, av5Var, kVar, view);
        this.g = tc5Var;
    }

    private void f(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fa1de5", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            try {
                if (dXWidgetNode instanceof sqm) {
                    ((sqm) dXWidgetNode).onPrefetchSuccess();
                }
                if (!(dXWidgetNode.getChildren() == null || dXWidgetNode.getChildren().isEmpty())) {
                    for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                        f(dXWidgetNode2);
                    }
                }
            } catch (Throwable th) {
                f fVar = new f(this.f23937a.c());
                f.a aVar = new f.a("Engine", "Engine_Render", f.DX_SIMPLE_PREFETCH_LISTENER_CRASH);
                aVar.e = xv5.a(th);
                fVar.c.add(aVar);
                ic5.p(fVar);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXSimplePrefetchTask");
    }

    @Override // tb.mc6
    public void d() {
        vc5 A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b45bd8", new Object[]{this});
            return;
        }
        try {
            o c2 = c();
            if (eb5.B()) {
                Log.e("RecyclerPrefetch", "开始预加载: " + this.f23937a.e());
            }
            c2.l(this.f23937a.W(), null, this.e.get(), this.f23937a, this.c, -1);
            if (eb5.B()) {
                Log.e("RecyclerPrefetch", "结束预加载: " + this.f23937a.e());
            }
            this.b = true;
            if (this.g != null && !this.c.j()) {
                if (!this.f23937a.Y()) {
                    f(this.f23937a.W());
                    this.h = new a();
                } else {
                    this.h = new b();
                }
                jb6.p(this.h);
            } else if (eb5.B() && this.f23937a.W() != null) {
                h36.g("RecyclerPrefetch", this.f23937a.W().hashCode() + " 取消 ");
            }
            if (this.f23937a.s().s() && (A = this.f23937a.s().f().A()) != null) {
                A.J();
            }
        } catch (Throwable th) {
            xv5.b(th);
            this.b = true;
            if (this.g != null && !this.c.j()) {
                c cVar = new c(th);
                this.h = cVar;
                jb6.p(cVar);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        if (eb5.B()) {
            Log.e("RecyclerPrefetch", "异步任务被取消: " + this.f23937a.e());
        }
        if (this.h != null) {
            if (eb5.B()) {
                Log.e("RecyclerPrefetch", "有callback，主线程回调被取消: " + this.f23937a.e());
            }
            jb6.a(this.h);
        }
        this.c.q(true);
        this.b = true;
    }
}
