package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class qfs implements wwd<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26728a;
    public n b;
    public ValueAnimator c;
    public int d;
    public int e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f26729a;
        public final /* synthetic */ Component b;
        public final /* synthetic */ View c;

        public a(n nVar, Component component, View view) {
            this.f26729a = nVar;
            this.b = component;
            this.c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (qfs.b(qfs.this) && qfs.d(qfs.this) && akt.p2("resetStartValue", true)) {
                qfs qfsVar = qfs.this;
                qfsVar.d = qfsVar.i();
            }
            qfs qfsVar2 = qfs.this;
            qfsVar2.m(this.f26729a, this.b, this.c, qfsVar2.g(floatValue));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f26730a;
        public final /* synthetic */ Component b;
        public final /* synthetic */ View c;

        public b(n nVar, Component component, View view) {
            this.f26730a = nVar;
            this.b = component;
            this.c = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            qfs.c(qfs.this, true);
            this.f26730a.w1(qfs.this.getTag(), null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            qfs.c(qfs.this, true);
            qfs qfsVar = qfs.this;
            qfsVar.k(this.f26730a, this.b, this.c, qfsVar.g(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
            this.f26730a.w1(qfs.this.getTag(), null);
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
                return;
            }
            qfs.c(qfs.this, false);
            if (qfs.d(qfs.this)) {
                qfs qfsVar = qfs.this;
                qfsVar.d = qfsVar.i();
            }
            qfs qfsVar2 = qfs.this;
            qfsVar2.l(this.f26730a, this.b, this.c, qfsVar2.g(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
        }
    }

    static {
        t2o.a(503316644);
        t2o.a(503316635);
    }

    public static /* synthetic */ boolean b(qfs qfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed532f1", new Object[]{qfsVar})).booleanValue();
        }
        return qfsVar.f26728a;
    }

    public static /* synthetic */ boolean c(qfs qfsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb393c9", new Object[]{qfsVar, new Boolean(z)})).booleanValue();
        }
        qfsVar.f26728a = z;
        return z;
    }

    public static /* synthetic */ boolean d(qfs qfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ffbbb2", new Object[]{qfsVar})).booleanValue();
        }
        return qfsVar.f;
    }

    @Override // tb.wwd
    public Animator a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("fbf3030f", new Object[]{this});
        }
        return this.c;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a128b2d", new Object[]{this});
            return;
        }
        wwd wwdVar = (wwd) this.b.m0(getTag());
        if (wwdVar != null && wwdVar.a() != null) {
            wwdVar.a().cancel();
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e890359a", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public int g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2777ede", new Object[]{this, new Float(f)})).intValue();
        }
        int i = this.d;
        return (int) (i + (f * (this.e - i)) + 0.5f);
    }

    public Integer h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("eb29f5ba", new Object[]{this});
        }
        return Integer.valueOf(this.e);
    }

    public abstract int i();

    public Animator j(n nVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("c21f857d", new Object[]{this, nVar, new Integer(i), new Integer(i2)});
        }
        View w0 = nVar.w0();
        Component K = nVar.K();
        this.b = nVar;
        this.d = i;
        this.e = i2;
        if (w0 == null || (!this.f && i == i2)) {
            e();
            nVar.w1(getTag(), null);
            return null;
        }
        ValueAnimator a2 = vz0.a(nVar);
        this.c = a2;
        a2.addUpdateListener(new a(nVar, K, w0));
        this.c.addListener(new b(nVar, K, w0));
        e();
        nVar.w1(getTag(), this);
        return this.c;
    }

    public abstract void k(n nVar, Component component, View view, int i);

    public abstract void l(n nVar, Component component, View view, int i);

    public abstract void m(n nVar, Component component, View view, int i);
}
