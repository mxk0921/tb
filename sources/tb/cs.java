package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class cs<InAnimation extends Animator, OutAnimation extends Animator> implements fab, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public InAnimation f17275a;
    public OutAnimation b;
    public Object c;
    public Object d;
    public int e = xbm.e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17276a;
        public final /* synthetic */ gab b;

        /* compiled from: Taobao */
        /* renamed from: tb.cs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0891a extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0891a() {
            }

            public static /* synthetic */ Object ipc$super(C0891a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                } else if (hashCode == 977295137) {
                    super.onAnimationStart((Animator) objArr[0]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AbsAKPopAnimation$1$1");
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                a.this.f17276a.setVisibility(0);
                super.onAnimationEnd(animator);
                gab gabVar = a.this.b;
                if (gabVar != null) {
                    gabVar.b(new wz0(cs.this.c(), cs.this.c, Long.valueOf(animator.getDuration()), animator));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                super.onAnimationStart(animator);
                gab gabVar = a.this.b;
                if (gabVar != null) {
                    gabVar.d(new wz0(cs.this.c(), cs.this.c, Long.valueOf(animator.getDuration()), animator));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                if (a.this.b != null && valueAnimator.getAnimatedFraction() > 0.0f) {
                    a.this.b.a();
                }
                if (valueAnimator.getAnimatedFraction() > 0.1f) {
                    a.this.f17276a.setVisibility(0);
                }
            }
        }

        public a(View view, gab gabVar) {
            this.f17276a = view;
            this.b = gabVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cs csVar = cs.this;
            cs.f(csVar, cs.g(csVar, this.f17276a));
            cs.e(cs.this).removeAllListeners();
            cs.e(cs.this).addListener(new C0891a());
            if (cs.e(cs.this) instanceof ObjectAnimator) {
                ((ObjectAnimator) cs.e(cs.this)).addUpdateListener(new b());
            }
            cs.e(cs.this).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gab f17279a;

        public b(gab gabVar) {
            this.f17279a = gabVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AbsAKPopAnimation$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            gab gabVar = this.f17279a;
            if (gabVar != null) {
                gabVar.b(new wz0(cs.this.c(), cs.this.d, Long.valueOf(animator.getDuration()), animator));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            gab gabVar = this.f17279a;
            if (gabVar != null) {
                gabVar.d(new wz0(cs.this.c(), cs.this.d, Long.valueOf(animator.getDuration()), animator));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gab f17280a;

        public c(gab gabVar) {
            this.f17280a = gabVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (this.f17280a != null && valueAnimator.getAnimatedFraction() > 0.0f) {
                this.f17280a.a();
            }
        }
    }

    static {
        t2o.a(336592984);
        t2o.a(336592976);
    }

    public static /* synthetic */ Animator e(cs csVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("737abeeb", new Object[]{csVar});
        }
        return csVar.f17275a;
    }

    public static /* synthetic */ Animator f(cs csVar, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("7b7d566c", new Object[]{csVar, animator});
        }
        csVar.f17275a = animator;
        return animator;
    }

    public static /* synthetic */ Animator g(cs csVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("61f121ea", new Object[]{csVar, view});
        }
        return csVar.k(view);
    }

    @Override // tb.fab
    public boolean a() {
        OutAnimation outanimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        InAnimation inanimation = this.f17275a;
        if ((inanimation == null || !inanimation.isStarted()) && ((outanimation = this.b) == null || !outanimation.isStarted())) {
            return false;
        }
        return true;
    }

    @Override // tb.fab
    public void b(View view, View view2, gab gabVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f153b413", new Object[]{this, view, view2, gabVar, new Integer(i)});
            return;
        }
        if (i > 0) {
            this.e = i;
        }
        o(view, view2, gabVar);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    @Override // tb.fab
    public void d(View view, gab gabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44401b3", new Object[]{this, view, gabVar});
            return;
        }
        OutAnimation l = l(view);
        this.b = l;
        l.removeAllListeners();
        this.b.addListener(new b(gabVar));
        OutAnimation outanimation = this.b;
        if (outanimation instanceof ObjectAnimator) {
            ((ObjectAnimator) outanimation).addUpdateListener(new c(gabVar));
        }
        this.b.start();
    }

    public abstract InAnimation h(View view);

    public abstract OutAnimation i(View view);

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40b6680f", new Object[]{this})).longValue();
        }
        return xbm.c();
    }

    public final InAnimation k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InAnimation) ((Animator) ipChange.ipc$dispatch("e919eeca", new Object[]{this, view}));
        }
        InAnimation h = h(view);
        this.f17275a = h;
        h.setDuration(p());
        this.f17275a.setInterpolator(m());
        return this.f17275a;
    }

    public final OutAnimation l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutAnimation) ((Animator) ipChange.ipc$dispatch("4958d87", new Object[]{this, view}));
        }
        OutAnimation i = i(view);
        this.b = i;
        i.setDuration(j());
        this.b.setInterpolator(n());
        return this.b;
    }

    public Interpolator m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("9a3027a9", new Object[]{this});
        }
        return new FastOutSlowInInterpolator();
    }

    public Interpolator n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("a97c0770", new Object[]{this});
        }
        return new FastOutSlowInInterpolator();
    }

    public void o(View view, View view2, gab gabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b85cf0", new Object[]{this, view, view2, gabVar});
            return;
        }
        view.setVisibility(4);
        view.post(new a(view, gabVar));
    }

    public long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be168cbc", new Object[]{this})).longValue();
        }
        return this.e;
    }
}
