package com.taobao.live.home.widget.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b extends a.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f10983a = new ValueAnimator();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.g.b f10984a;

        public a(a.g.b bVar) {
            this.f10984a = bVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                ((a.C0579a) this.f10984a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.live.home.widget.tab.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0581b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.g.AbstractC0580a f10985a;

        public C0581b(b bVar, a.g.AbstractC0580a aVar) {
            this.f10985a = aVar;
        }

        public static /* synthetic */ Object ipc$super(C0581b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/widget/tab/ValueAnimatorCompatImplHoneycombMr1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ((a.b) this.f10985a).a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                ((a.b) this.f10985a).b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ((a.b) this.f10985a).c();
            }
        }
    }

    static {
        t2o.a(806355531);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/widget/tab/ValueAnimatorCompatImplHoneycombMr1");
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f10983a.cancel();
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17975332", new Object[]{this})).floatValue();
        }
        return this.f10983a.getAnimatedFraction();
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67cdd7f5", new Object[]{this})).intValue();
        }
        return ((Integer) this.f10983a.getAnimatedValue()).intValue();
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f10983a.getDuration();
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.f10983a.isRunning();
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.f10983a.setDuration(i);
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c92a3", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f10983a.setFloatValues(f, f2);
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9928396", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f10983a.setIntValues(i, i2);
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void i(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.f10983a.setInterpolator(interpolator);
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void j(a.g.AbstractC0580a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603dc92e", new Object[]{this, aVar});
        } else {
            this.f10983a.addListener(new C0581b(this, aVar));
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void k(a.g.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20097540", new Object[]{this, bVar});
        } else {
            this.f10983a.addUpdateListener(new a(bVar));
        }
    }

    @Override // com.taobao.live.home.widget.tab.a.g
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f10983a.start();
        }
    }
}
