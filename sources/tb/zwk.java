package tb;

import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zwk implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public ViewTreeObserver f33065a;
    public final View b;
    public final Runnable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601378);
        }

        public a() {
        }

        public final zwk a(View view, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zwk) ipChange.ipc$dispatch("68d4e90c", new Object[]{this, view, runnable});
            }
            ckf.g(view, "view");
            ckf.g(runnable, "runnable");
            zwk zwkVar = new zwk(view, runnable, null);
            view.getViewTreeObserver().addOnPreDrawListener(zwkVar);
            view.addOnAttachStateChangeListener(zwkVar);
            return zwkVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601377);
    }

    public zwk(View view, Runnable runnable) {
        this.b = view;
        this.c = runnable;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ckf.f(viewTreeObserver, "mView.viewTreeObserver");
        this.f33065a = viewTreeObserver;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a75df", new Object[]{this});
            return;
        }
        if (this.f33065a.isAlive()) {
            this.f33065a.removeOnPreDrawListener(this);
        } else {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        a();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            return;
        }
        ckf.g(view, "v");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ckf.f(viewTreeObserver, "v.viewTreeObserver");
        this.f33065a = viewTreeObserver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            return;
        }
        ckf.g(view, "v");
        a();
    }

    public /* synthetic */ zwk(View view, Runnable runnable, a07 a07Var) {
        this(view, runnable);
    }
}
