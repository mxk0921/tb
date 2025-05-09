package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.panel.impl.PanelContainer;
import com.taobao.schedule.ViewProxy;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gpl implements wic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long PANEL_CLOSE_ANIM_DURATION = 200;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f20148a;
    public final PanelContainer b;
    public int c;
    public boolean d;
    public ObjectAnimator e;
    public ObjectAnimator f;
    public View g;
    public yic h = new fag();
    public final Stack<View> i = new Stack<>();
    public final Stack<yic> j = new Stack<>();
    public final View.OnClickListener k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            odg.d("LCPanelContainer", "click outside panel.");
            gpl.b(gpl.this).g();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f20150a;

        public b(View view) {
            this.f20150a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            this.f20150a.getViewTreeObserver().removeOnPreDrawListener(this);
            gpl gplVar = gpl.this;
            View view = this.f20150a;
            gpl.d(gplVar, view, view.getWidth(), this.f20150a.getHeight());
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(gpl gplVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20152a;

        public e(int i) {
            this.f20152a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (gpl.j(gpl.this, this.f20152a) && gpl.k(gpl.this) != null) {
                gpl.k(gpl.this).setAlpha((floatValue * 1.0f) / gpl.l(gpl.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20153a;
        public final /* synthetic */ View b;

        public f(int i, View view) {
            this.f20153a = i;
            this.b = view;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainerViewImpl$6");
        }

        @Override // tb.gpl.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            odg.d("LCPanelContainer", "close animation end.");
            if (gpl.j(gpl.this, this.f20153a)) {
                gpl.m(gpl.this).removeView(this.b);
                gpl.n(gpl.this).pop();
                if (gpl.e(gpl.this).size() > 0) {
                    gpl.e(gpl.this).pop();
                }
            } else {
                gpl.m(gpl.this).removeView(this.b);
                gpl.f(gpl.this).removeView(gpl.m(gpl.this));
                gpl.n(gpl.this).clear();
                if (gpl.e(gpl.this).size() > 0) {
                    gpl gplVar = gpl.this;
                    gpl.c(gplVar, gpl.h(gplVar));
                }
                gpl.e(gpl.this).clear();
            }
            if (gpl.g(gpl.this, this.f20153a)) {
                gpl.b(gpl.this).a();
            }
            gpl.i(gpl.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20154a;

        public g(int i) {
            this.f20154a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (gpl.j(gpl.this, this.f20154a) && gpl.k(gpl.this) != null && gpl.l(gpl.this) != 0) {
                gpl.k(gpl.this).setAlpha((floatValue * 1.0f) / gpl.l(gpl.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705524);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        t2o.a(511705516);
        t2o.a(511705511);
    }

    public gpl(Context context) {
        a aVar = new a();
        this.k = aVar;
        PanelContainer panelContainer = new PanelContainer(context);
        this.b = panelContainer;
        panelContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        panelContainer.setOnClickListener(aVar);
        this.f20148a = (ViewGroup) ((Activity) context).findViewById(16908290);
    }

    public static /* synthetic */ yic b(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yic) ipChange.ipc$dispatch("aa5f0a", new Object[]{gplVar});
        }
        return gplVar.h;
    }

    public static /* synthetic */ yic c(gpl gplVar, yic yicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yic) ipChange.ipc$dispatch("596f02bc", new Object[]{gplVar, yicVar});
        }
        gplVar.h = yicVar;
        return yicVar;
    }

    public static /* synthetic */ void d(gpl gplVar, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2dfd79", new Object[]{gplVar, view, new Integer(i), new Integer(i2)});
        } else {
            gplVar.t(view, i, i2);
        }
    }

    public static /* synthetic */ Stack e(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("f21d8450", new Object[]{gplVar});
        }
        return gplVar.j;
    }

    public static /* synthetic */ ViewGroup f(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a21dffcd", new Object[]{gplVar});
        }
        return gplVar.f20148a;
    }

    public static /* synthetic */ boolean g(gpl gplVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec90796d", new Object[]{gplVar, new Integer(i)})).booleanValue();
        }
        return gplVar.r(i);
    }

    public static /* synthetic */ yic h(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yic) ipChange.ipc$dispatch("b66637e7", new Object[]{gplVar});
        }
        return gplVar.p();
    }

    public static /* synthetic */ boolean i(gpl gplVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf2e13a", new Object[]{gplVar, new Boolean(z)})).booleanValue();
        }
        gplVar.d = z;
        return z;
    }

    public static /* synthetic */ boolean j(gpl gplVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("421e5dca", new Object[]{gplVar, new Integer(i)})).booleanValue();
        }
        return gplVar.q(i);
    }

    public static /* synthetic */ View k(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("114dc1a0", new Object[]{gplVar});
        }
        return gplVar.g;
    }

    public static /* synthetic */ int l(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a5698d2", new Object[]{gplVar})).intValue();
        }
        return gplVar.c;
    }

    public static /* synthetic */ PanelContainer m(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelContainer) ipChange.ipc$dispatch("38267bc", new Object[]{gplVar});
        }
        return gplVar.b;
    }

    public static /* synthetic */ Stack n(gpl gplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("71ca1bea", new Object[]{gplVar});
        }
        return gplVar.i;
    }

    @Override // tb.wic
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new b(view));
        this.i.push(view);
    }

    @Override // tb.wic
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (o() > 0) {
            return true;
        }
        return false;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b84ea9ab", new Object[]{this})).intValue();
        }
        return this.i.size();
    }

    public final yic p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yic) ipChange.ipc$dispatch("b96bdaf0", new Object[]{this});
        }
        if (this.j.size() > 0) {
            return this.j.peek();
        }
        return this.h;
    }

    public final boolean q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd0d7ae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    public final boolean r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318b47e2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i <= 1) {
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0d0754", new Object[]{this, view})).booleanValue();
        }
        return this.i.contains(view);
    }

    public final void t(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357036e6", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view != null) {
            odg.d("LCPanelContainer", "contentview.onPreDraw. contentView width=" + view.getWidth() + ", height=" + view.getHeight());
            this.c = i2;
            x();
        }
    }

    public final void v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25f153", new Object[]{this, view});
        } else if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20151a;

        public d(int i) {
            this.f20151a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainerViewImpl$4");
        }

        @Override // tb.gpl.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            odg.d("LCPanelContainer", "show animation end.");
            if (gpl.g(gpl.this, this.f20151a)) {
                gpl.h(gpl.this).d();
            }
            gpl.i(gpl.this, false);
        }
    }

    @Override // tb.wic
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.i.isEmpty() && !this.d) {
            odg.d("LCPanelContainer", "perform close panel.");
            u();
        }
    }

    @Override // tb.wic
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (o() <= 0 || this.d) {
            odg.c("LCPanelContainer", "show panel. but contentView is null!");
        } else {
            View peek = this.i.peek();
            v(peek);
            v(this.b);
            odg.d("LCPanelContainer", "perform show panel.");
            this.b.addView(peek, new FrameLayout.LayoutParams(-1, -2, 80));
            this.f20148a.addView(this.b);
            this.b.onShow();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b9c1e", new Object[]{this});
            return;
        }
        this.d = true;
        int o = o();
        if (r(o)) {
            p().f();
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.e.cancel();
        }
        View peek = this.i.peek();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(peek, "translationY", 0.0f, this.c);
        this.f = ofFloat;
        ofFloat.setDuration(200L);
        this.f.addListener(new f(o, peek));
        this.f.addUpdateListener(new g(o));
        this.f.start();
    }

    public void w(yic yicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bacadb", new Object[]{this, yicVar});
            return;
        }
        odg.d("LCPanelContainer", "setHandler. handler=" + yicVar);
        if (yicVar != null) {
            if (yicVar.c()) {
                this.b.setOnClickListener(null);
                this.b.setClickable(false);
            } else {
                this.b.setOnClickListener(this.k);
                this.b.setClickable(true);
                this.b.setExceptViewList(yicVar.b());
            }
            this.h = yicVar;
            this.j.push(yicVar);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
            return;
        }
        this.d = true;
        int o = o();
        if (r(o)) {
            this.h.e();
        } else {
            this.g = this.i.get(o - 2);
        }
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f.cancel();
        }
        View peek = this.i.size() > 0 ? this.i.peek() : null;
        if (q(o) && peek != null) {
            ViewProxy.setOnClickListener(peek, new c(this));
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(peek, "translationY", this.c, 0.0f);
        this.e = ofFloat;
        ofFloat.setDuration(200L);
        this.e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.e.addListener(new d(o));
        this.e.addUpdateListener(new e(o));
        this.e.start();
    }
}
