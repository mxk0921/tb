package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t8 implements eab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28558a;
    public int b;
    public Animator c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f28559a;
        public final /* synthetic */ Runnable b;

        public a(ObjectAnimator objectAnimator, Runnable runnable) {
            this.f28559a = objectAnimator;
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/AKGestureAnimation$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (t8.a(t8.this) == this.f28559a) {
                t8.b(t8.this);
            }
            this.b.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f28560a;

        public b(Runnable runnable) {
            this.f28560a = runnable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Runnable runnable = this.f28560a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static {
        t2o.a(713031969);
        t2o.a(297795595);
    }

    public static /* synthetic */ Animator a(t8 t8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("262dbce0", new Object[]{t8Var});
        }
        return t8Var.c;
    }

    public static /* synthetic */ void b(t8 t8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb18bb52", new Object[]{t8Var});
        } else {
            t8Var.i();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57237f88", new Object[]{this});
            return;
        }
        if (this.c != null && h()) {
            this.c.cancel();
        }
        i();
    }

    public void d(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a7329", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            j(view, f, this.b, runnable, runnable2);
        }
    }

    public void e(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af90de", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            j(view, f, this.f28558a, runnable, runnable2);
        }
    }

    public void f(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f763cb", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            j(view, f, 0.0f, runnable, runnable2);
        }
    }

    public void g(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee113a41", new Object[]{this, view, new Float(f), runnable, runnable2});
            return;
        }
        view.setTranslationY(this.f28558a);
        runnable.run();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        Animator animator = this.c;
        if (animator == null || !animator.isStarted()) {
            return false;
        }
        return true;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12b3a38", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void k(int i, int i2, int i3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6bf9069", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), view});
            return;
        }
        this.f28558a = i;
        this.b = i3;
    }

    public final void j(View view, float f, float f2, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266130de", new Object[]{this, view, new Float(f), new Float(f2), runnable, runnable2});
            return;
        }
        c();
        float translationY = view.getTranslationY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", translationY, f2);
        ofFloat.setDuration(Math.min(200L, Math.max(50L, (Math.abs(translationY - f2) / Math.min(8000.0f, Math.max(200.0f, f))) * 1000.0f)));
        ofFloat.addListener(new a(ofFloat, runnable));
        ofFloat.addUpdateListener(new b(runnable2));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.c = ofFloat;
        ofFloat.start();
    }
}
