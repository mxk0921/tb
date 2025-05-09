package com.taobao.android.abilitykit.ability.pop.render.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler;
import com.taobao.android.abilitykit.ability.pop.render.util.b;
import tb.t2o;
import tb.wz0;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements com.taobao.android.abilitykit.ability.pop.render.util.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_ANIMATION = "onAnimation";
    public static final String ON_ANiM_END_POS_CHANGED = "onPositionChanged";

    /* renamed from: a  reason: collision with root package name */
    public int f6278a;
    public int b;
    public boolean c = false;
    public Animator d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6280a;
        public final /* synthetic */ b.a b;

        public b(View view, b.a aVar) {
            this.f6280a = view;
            this.b = aVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            View view = this.f6280a;
            if (view != null) {
                ((GestureHandler.a) this.b).c(view.getX(), this.f6280a.getY(), true, a.ON_ANIMATION);
            }
        }
    }

    static {
        t2o.a(336593044);
        t2o.a(336593052);
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c9c308", new Object[]{aVar})).booleanValue();
        }
        return aVar.c;
    }

    public static /* synthetic */ Animator b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("127f8f8e", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21b8786", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57237f88", new Object[]{this});
            return;
        }
        if (this.d != null && h()) {
            this.d.cancel();
        }
        i();
    }

    public void e(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ffb10d", new Object[]{this, view, new Float(f), aVar});
        } else {
            j(view, f, this.b, aVar);
        }
    }

    public void f(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e90f438", new Object[]{this, view, new Float(f), aVar});
        } else {
            j(view, f, this.b - this.f6278a, aVar);
        }
    }

    public void g(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3376f2b", new Object[]{this, view, new Float(f), aVar});
        } else {
            j(view, f, 0.0f, aVar);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        Animator animator = this.d;
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
            this.d = null;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09d2d63", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void l(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94da87a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f6278a = i;
        this.b = i2;
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.abilitykit.ability.pop.render.util.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0328a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6279a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ b.a d;
        public final /* synthetic */ ObjectAnimator e;

        public C0328a(View view, float f, float f2, b.a aVar, ObjectAnimator objectAnimator) {
            this.f6279a = view;
            this.b = f;
            this.c = f2;
            this.d = aVar;
            this.e = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(C0328a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/GestureAnimation$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (a.b(a.this) == this.e) {
                a.c(a.this);
            }
            ((GestureHandler.a) this.d).c(this.b, this.c, true, "onPositionChanged");
            ((GestureHandler.a) this.d).a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            float f;
            float f2;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else if (this.f6279a != null) {
                if (a.a(a.this)) {
                    f = this.f6279a.getX();
                } else {
                    f = this.f6279a.getY();
                }
                if (a.a(a.this)) {
                    f2 = this.b;
                } else {
                    f2 = this.c;
                }
                b.a aVar = this.d;
                if (a.a(a.this)) {
                    str = "translationX";
                } else {
                    str = "translationY";
                }
                ((GestureHandler.a) aVar).b(new wz0(str, new float[]{ywo.d(this.f6279a.getContext(), f), ywo.d(this.f6279a.getContext(), f2)}, Long.valueOf(animator.getDuration()), animator));
            }
        }
    }

    public final void j(View view, float f, float f2, b.a aVar) {
        float translationY;
        ObjectAnimator ofFloat;
        float x;
        float y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1b5438", new Object[]{this, view, new Float(f), new Float(f2), aVar});
            return;
        }
        d();
        if (this.c) {
            translationY = view.getTranslationX();
            ofFloat = ObjectAnimator.ofFloat(view, "translationX", translationY, f2);
            x = (view.getX() + f2) - translationY;
            y = view.getY();
        } else {
            translationY = view.getTranslationY();
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", translationY, f2);
            x = view.getX();
            y = (view.getY() + f2) - translationY;
        }
        ofFloat.setDuration(Math.min(300L, Math.max(50L, (Math.abs(translationY - f2) / Math.min(8000.0f, Math.max(200.0f, f))) * 1000.0f)));
        ofFloat.addListener(new C0328a(view, x, y, aVar, ofFloat));
        ofFloat.addUpdateListener(new b(view, aVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.d = ofFloat;
        ofFloat.start();
    }
}
