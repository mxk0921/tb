package tb;

import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class axk implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f16060a;
    public ViewTreeObserver b;
    public final Runnable c;

    static {
        t2o.a(503317417);
    }

    public axk(View view, Runnable runnable) {
        this.f16060a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static axk a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (axk) ipChange.ipc$dispatch("8094779e", new Object[]{view, runnable});
        }
        axk axkVar = new axk(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(axkVar);
        view.addOnAttachStateChangeListener(axkVar);
        return axkVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a75df", new Object[]{this});
            return;
        }
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.f16060a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16060a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        } else {
            this.b = view.getViewTreeObserver();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
        } else {
            b();
        }
    }
}
