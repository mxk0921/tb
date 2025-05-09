package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ofs implements wwd<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25360a;
    public n b;
    public float c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f25361a;
        public final /* synthetic */ View b;

        public a(n nVar, View view) {
            this.f25361a = nVar;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (ofs.b(ofs.this) && ofs.d(ofs.this) && akt.p2("resetStartValue", true)) {
                ofs ofsVar = ofs.this;
                ofsVar.c = ofsVar.i();
            }
            ofs ofsVar2 = ofs.this;
            ofsVar2.n(this.f25361a, this.b, ofsVar2.g(floatValue));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f25362a;
        public final /* synthetic */ View b;

        public b(n nVar, View view) {
            this.f25362a = nVar;
            this.b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ofs.c(ofs.this, true);
            ofs ofsVar = ofs.this;
            ofsVar.k(this.f25362a, this.b, ofsVar.g(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
            this.f25362a.w1(ofs.this.getTag(), null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ofs.c(ofs.this, true);
            ofs ofsVar = ofs.this;
            ofsVar.l(this.f25362a, this.b, ofsVar.g(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
            this.f25362a.w1(ofs.this.getTag(), null);
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
            ofs.c(ofs.this, false);
            if (ofs.d(ofs.this)) {
                ofs ofsVar = ofs.this;
                ofsVar.c = ofsVar.i();
            }
            ofs ofsVar2 = ofs.this;
            ofsVar2.m(this.f25362a, this.b, ofsVar2.g(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
        }
    }

    static {
        t2o.a(503316640);
        t2o.a(503316635);
    }

    public static /* synthetic */ boolean b(ofs ofsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ec57de", new Object[]{ofsVar})).booleanValue();
        }
        return ofsVar.f25360a;
    }

    public static /* synthetic */ boolean c(ofs ofsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7ec74fc", new Object[]{ofsVar, new Boolean(z)})).booleanValue();
        }
        ofsVar.f25360a = z;
        return z;
    }

    public static /* synthetic */ boolean d(ofs ofsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7997b45f", new Object[]{ofsVar})).booleanValue();
        }
        return ofsVar.e;
    }

    @Override // tb.wwd
    public Animator a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("fbf3030f", new Object[]{this});
        }
        return this.f;
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
            this.e = z;
        }
    }

    public float g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2777edb", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.c;
        return f2 + (f * (this.d - f2));
    }

    public Float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("e9f5139c", new Object[]{this});
        }
        return Float.valueOf(this.d);
    }

    public abstract float i();

    public Animator j(n nVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("815f29dd", new Object[]{this, nVar, new Float(f), new Float(f2)});
        }
        View w0 = nVar.w0();
        this.b = nVar;
        this.c = f;
        this.d = f2;
        if (w0 == null || (!this.e && f == f2)) {
            e();
            nVar.w1(getTag(), null);
            return null;
        }
        ValueAnimator a2 = vz0.a(nVar);
        this.f = a2;
        a2.addUpdateListener(new a(nVar, w0));
        this.f.addListener(new b(nVar, w0));
        e();
        nVar.w1(getTag(), this);
        return this.f;
    }

    public void k(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f627f6f", new Object[]{this, nVar, view, new Float(f)});
        }
    }

    public abstract void l(n nVar, View view, float f);

    public abstract void m(n nVar, View view, float f);

    public abstract void n(n nVar, View view, float f);
}
