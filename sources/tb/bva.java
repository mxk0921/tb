package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import java.util.Iterator;
import tb.bva;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16660a;
    public final boolean b;
    public final frk c;
    public final MetaLayout d;
    public final ValueAnimator e;
    public int f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static final void b(bva bvaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf5d727", new Object[]{bvaVar});
                return;
            }
            ckf.g(bvaVar, "this$0");
            frk b = bva.b(bvaVar);
            if (b != null) {
                b.r();
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/meta/uikit/HeaderScroller$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            MetaLayout c = bva.c(bva.this);
            final bva bvaVar = bva.this;
            c.post(new Runnable() { // from class: tb.e8z
                @Override // java.lang.Runnable
                public final void run() {
                    bva.b.b(bva.this);
                }
            });
            bva.f(bva.this, false);
        }
    }

    static {
        t2o.a(993001848);
    }

    public bva(int i, boolean z, frk frkVar, MetaLayout metaLayout) {
        ckf.g(metaLayout, "metaLayout");
        this.f16660a = i;
        this.b = z;
        this.c = frkVar;
        this.d = metaLayout;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.e = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.d8z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bva.e(bva.this, valueAnimator);
            }
        });
        ofInt.addListener(new b());
        ofInt.setInterpolator(new DecelerateInterpolator());
    }

    public static final /* synthetic */ frk b(bva bvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (frk) ipChange.ipc$dispatch("17e76ce5", new Object[]{bvaVar});
        }
        return bvaVar.c;
    }

    public static final /* synthetic */ MetaLayout c(bva bvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("eb4ae176", new Object[]{bvaVar});
        }
        return bvaVar.d;
    }

    public static final void e(bva bvaVar, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3735107", new Object[]{bvaVar, valueAnimator});
            return;
        }
        ckf.g(bvaVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        bvaVar.f = intValue;
        bvaVar.h(intValue - bvaVar.f);
    }

    public static final /* synthetic */ void f(bva bvaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8cbd05", new Object[]{bvaVar, new Boolean(z)});
        } else {
            bvaVar.g = z;
        }
    }

    public static final void j(bva bvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a69bd3c", new Object[]{bvaVar});
            return;
        }
        ckf.g(bvaVar, "this$0");
        frk frkVar = bvaVar.c;
        if (frkVar != null) {
            frkVar.r();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.g) {
            this.e.cancel();
            this.g = false;
        }
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8d71d8", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<ytc> it = this.d.originHeaders.iterator();
        while (it.hasNext() && (i = i - it.next().e(i, this.d.getListStart(), 0)) != 0) {
        }
        this.d.updateListTranslation(false);
        this.d.notifyHeaderScroll();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.b) {
            this.g = true;
            this.e.start();
        } else {
            h(this.f16660a);
            this.d.post(new Runnable() { // from class: tb.c8z
                @Override // java.lang.Runnable
                public final void run() {
                    bva.j(bva.this);
                }
            });
        }
    }
}
