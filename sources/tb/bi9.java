package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.musie.component.filter.TbFilter;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bi9 implements mpc, View.OnClickListener, z6c, ViewTreeObserver.OnScrollChangedListener, zce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final phw f16401a;
    public final String b;
    public final int c;
    public final TbFilter d;
    public boolean e = false;
    public boolean f = false;
    public View g;
    public ValueAnimator h;
    public int i;
    public View j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                bi9.this.f16401a.destroyAndRemoveFromParent();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/filter/FilterHolder$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            bi9.this.f16401a.destroyAndRemoveFromParent();
            bi9.d(bi9.this).scrollObservers.remove(bi9.this);
        }
    }

    static {
        t2o.a(815792692);
        t2o.a(993002137);
        t2o.a(815792695);
        t2o.a(993002185);
    }

    public bi9(TbFilter tbFilter, phw phwVar, int i, String str) {
        this.d = tbFilter;
        this.f16401a = phwVar;
        this.c = i;
        this.b = str;
    }

    public static /* synthetic */ TbFilter d(bi9 bi9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbFilter) ipChange.ipc$dispatch("40e750bf", new Object[]{bi9Var});
        }
        return bi9Var.d;
    }

    @Override // tb.z6c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = false;
        if (!this.f || !z) {
            new Handler(Looper.getMainLooper()).post(new a());
            this.d.scrollObservers.remove(this);
            return;
        }
        e(false);
    }

    @Override // tb.z6c
    public void attachToContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cab40c8", new Object[]{this});
        } else {
            this.f16401a.attachToContainer();
        }
    }

    @Override // tb.mpc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0610079", new Object[]{this});
        } else {
            this.f = false;
        }
    }

    @Override // tb.z6c
    public void c(FrameLayout frameLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793fb6eb", new Object[]{this, frameLayout, view});
            return;
        }
        this.j = view;
        this.e = true;
        View view2 = this.f16401a.getView();
        if (view2 != null) {
            ViewProxy.setOnClickListener(view2, this);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            g(view);
            frameLayout.addView(view2);
            phw phwVar = this.f16401a;
            if (phwVar instanceof m8j) {
                ((m8j) phwVar).P2(this);
            } else if (phwVar instanceof b7x) {
                ((b7x) phwVar).C2(this);
            }
            this.d.scrollObservers.add(this);
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7130ec", new Object[]{this, new Boolean(z)});
        } else if (this.g != null) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.h.cancel();
                this.h = null;
            }
            if (z) {
                this.h = ObjectAnimator.ofFloat(this.g, View.TRANSLATION_Y, -this.i, 0.0f);
            } else {
                View view = this.g;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getTranslationY(), -this.i);
                this.h = ofFloat;
                ofFloat.addListener(new b());
            }
            this.h.setDuration(200L);
            this.h.start();
        }
    }

    public void f(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47dcd7d9", new Object[]{this, wXSDKInstance});
            return;
        }
        this.f = true;
        this.g = wXSDKInstance.getRootView();
        int weexHeight = wXSDKInstance.getWeexHeight();
        this.i = weexHeight;
        this.g.setTranslationY(-weexHeight);
        if (this.e) {
            e(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    public final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d42b8d", new Object[]{this, view});
        } else if (view != null && this.f16401a.getView() != 0 && ((FrameLayout.LayoutParams) this.f16401a.getView().getLayoutParams()) != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            int i = rect.top;
            this.d.getInstance().getRenderRoot().getGlobalVisibleRect(rect);
            this.f16401a.getView().setTranslationY((rect.bottom + this.c) - i);
        }
    }

    @Override // tb.z6c
    public String getFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c150e857", new Object[]{this});
        }
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // tb.mpc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.f = true;
        this.g = aVar.getRenderRoot();
        int rootHeight = aVar.getRootHeight();
        this.i = rootHeight;
        this.g.setTranslationY(-rootHeight);
        if (this.e) {
            e(true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
        } else {
            g(this.j);
        }
    }
}
