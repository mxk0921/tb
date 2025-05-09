package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.InteractiveComponentRightAnim;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cif implements aif {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final uhf c;
    public final ux9 e;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<InteractiveComponentRightAnim> f17080a = new ConcurrentLinkedQueue<>();
    public boolean b = false;
    public final xvg.a f = new b();
    public final Handler d = new Handler(Looper.getMainLooper());

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
            } else {
                cif.c(cif.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements xvg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xvg.a
        public void a(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c223d18e", new Object[]{this, xvgVar});
            } else {
                cif.c(cif.this);
            }
        }

        @Override // tb.xvg.a
        public void b(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f1b83e7", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void c(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c3c3fd3", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void d(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c294424", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void e(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb09f52", new Object[]{this, xvgVar});
            }
        }
    }

    static {
        t2o.a(295699993);
        t2o.a(295699992);
    }

    public cif(ux9 ux9Var, String str, Context context, FrameLayout frameLayout, ukr ukrVar, whf whfVar) {
        this.e = ux9Var;
        this.c = new uhf(frameLayout, ukrVar, context, str, whfVar);
    }

    public static /* synthetic */ void c(cif cifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd54ad2", new Object[]{cifVar});
        } else {
            cifVar.d();
        }
    }

    @Override // tb.aif
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da3cc9c", new Object[]{this});
            return;
        }
        this.b = true;
        d();
    }

    @Override // tb.aif
    public void b(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604173c", new Object[]{this, interactiveComponentRightAnim});
            return;
        }
        if (interactiveComponentRightAnim != null && "lottery".equals(interactiveComponentRightAnim.animationType)) {
            if (this.f17080a.contains(interactiveComponentRightAnim)) {
                this.f17080a.remove(interactiveComponentRightAnim);
                this.f17080a.offer(interactiveComponentRightAnim);
            } else {
                this.f17080a.offer(interactiveComponentRightAnim);
            }
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.postDelayed(new a(), 300L);
        }
    }

    public final void d() {
        InteractiveComponentRightAnim poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a693d82c", new Object[]{this});
        } else if (this.b && !this.f17080a.isEmpty() && (poll = this.f17080a.poll()) != null) {
            e(poll);
        }
    }

    @Override // tb.aif
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = false;
        this.f17080a.clear();
        uhf uhfVar = this.c;
        if (uhfVar != null) {
            uhfVar.k();
        }
    }

    public final void e(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e1b7db", new Object[]{this, interactiveComponentRightAnim});
            return;
        }
        this.c.addAnimationListener(this.f);
        this.c.o(interactiveComponentRightAnim);
        ux9 ux9Var = this.e;
        if (ux9Var != null && ux9Var.d() != null) {
            this.e.d().a(this.c);
        }
    }
}
