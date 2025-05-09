package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.xsl.refact.PullRefreshContainer;
import com.taobao.uikit.extend.component.refresh.TBAnimationHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c5n extends kr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final oox h;
    public final PullRefreshContainer i;
    public MetaLayout j;
    public ValueAnimator k;
    public final int l;
    public final int m = -p1p.a(60.0f);
    public boolean n;
    public boolean o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/PullRefreshBehavior$hide$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            MetaLayout l = c5n.l(c5n.this);
            if (l != null) {
                l.resetScrollNode();
            }
        }
    }

    static {
        t2o.a(993002069);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5n(oox ooxVar, TBAnimationHeader tBAnimationHeader, PullRefreshContainer pullRefreshContainer, boolean z, zwm zwmVar) {
        super(pullRefreshContainer, z, zwmVar);
        ckf.g(ooxVar, "widget");
        ckf.g(tBAnimationHeader, "refreshHeader");
        ckf.g(pullRefreshContainer, "container");
        this.h = ooxVar;
        this.i = pullRefreshContainer;
        int i = -p1p.a(300.0f);
        this.l = i;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(c5n c5nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/PullRefreshBehavior");
    }

    public static final /* synthetic */ MetaLayout l(c5n c5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("f6bbf768", new Object[]{c5nVar});
        }
        return c5nVar.j;
    }

    public static final void m(c5n c5nVar, boolean z, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51423ec1", new Object[]{c5nVar, new Boolean(z), valueAnimator});
            return;
        }
        ckf.g(c5nVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            int intValue = num.intValue();
            c5nVar.b = intValue;
            c5nVar.i.updateOffset(intValue);
            c5nVar.w(z);
            MetaLayout metaLayout = c5nVar.j;
            ckf.d(metaLayout);
            metaLayout.requestLayout();
        }
    }

    @Override // tb.kr1, tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        } else if (this.n) {
            ValueAnimator valueAnimator = this.k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i == 0) {
                this.o = true;
                w(true);
            }
        }
    }

    @Override // tb.kr1, tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
        } else if (this.n && i == 0) {
            this.o = false;
            int i2 = this.b;
            int i3 = this.l;
            int i4 = i3 - this.m;
            if (i2 > i4) {
                s(i4, true);
                this.h.w2();
            } else if (i2 > i3 && i2 < i4) {
                s(i3, true);
            }
        }
    }

    @Override // tb.kr1, tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        MetaLayout metaLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 2) {
            return 0;
        }
        if (i < 0) {
            this.h.s2();
        }
        if (!this.n) {
            return 0;
        }
        MetaLayout metaLayout2 = this.j;
        if (metaLayout2 != null) {
            metaLayout2.setCanFling(true);
        }
        if (i == -2147483647) {
            return i;
        }
        if (i > 0) {
            MetaLayout metaLayout3 = this.j;
            if (metaLayout3 != null) {
                metaLayout3.setCanFling(false);
            }
            ValueAnimator valueAnimator = this.k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int c = hfn.c(this.l, this.b - i);
            int i4 = this.b - c;
            this.b = c;
            this.i.updateOffset(c);
            w(false);
            if (i4 == 0 && (metaLayout = this.j) != null) {
                metaLayout.setCanFling(true);
            }
            return i4;
        } else if (i3 != 0) {
            return i;
        } else {
            if (!this.o) {
                return 0;
            }
            MetaLayout metaLayout4 = this.j;
            if (metaLayout4 != null) {
                metaLayout4.setCanFling(false);
            }
            int i5 = (int) (i * 0.8f);
            if (i5 == 0) {
                i5 = -1;
            }
            int f = hfn.f(0, this.b - i5);
            this.b = f;
            this.i.updateOffset(f);
            w(false);
            return hfn.c(i, (int) ((this.b - f) / 0.8f));
        }
    }

    @Override // tb.kr1, tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        } else {
            this.j = metaLayout;
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.o) {
            w(true);
        } else {
            int i = this.b;
            int i2 = this.l;
            if (i > i2) {
                s(i2, false);
            }
        }
    }

    public final void s(int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18782ba", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.nkz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                c5n.m(c5n.this, z, valueAnimator2);
            }
        });
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addListener(new b());
        ofInt.start();
        this.k = ofInt;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e7c738", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645e0f54", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.j;
        if (metaLayout != null) {
            metaLayout.setCanFling(true);
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9b2bab", new Object[]{this, new Boolean(z)});
            return;
        }
        j(hfn.e(1.0f, ((this.b - this.l) * 1.0f) / (-this.m)));
        if (z) {
            this.h.K0(true, h());
        }
    }
}
