package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q09 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FarmShop f26420a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FarmShop f26421a;

        public a(FarmShop farmShop) {
            this.f26421a = farmShop;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            FarmShop farmShop = this.f26421a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                FarmShop.F1(farmShop, ((Integer) animatedValue).intValue(), false, Integer.valueOf(this.f26421a.X1().c()));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends FarmShop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FarmShop b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FarmShop farmShop, int i) {
            super(farmShop);
            this.b = farmShop;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$changeToOtherPage$1$1$2");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.FarmShop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            int v1 = FarmShop.v1(this.b);
            FarmShop farmShop = this.b;
            FarmShop.D1(farmShop, v1);
            inp n1 = FarmShop.n1(farmShop);
            if (n1 != null) {
                n1.J(v1);
            }
            inp n12 = FarmShop.n1(this.b);
            if (n12 != null) {
                n12.n();
            }
            FarmShop.C1(this.b, this.c);
            FarmShop.B1(this.b, 0 - this.c);
            this.b.S0(false);
        }
    }

    public q09(FarmShop farmShop, int i, int i2, int i3) {
        this.f26420a = farmShop;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FarmShop.D1(this.f26420a, this.b);
        inp n1 = FarmShop.n1(this.f26420a);
        if (n1 != null) {
            n1.J(this.b);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.c);
        FarmShop farmShop = this.f26420a;
        int i = this.d;
        ofInt.addUpdateListener(new a(farmShop));
        ofInt.setDuration(900L);
        ofInt.addListener(new b(farmShop, i));
        ofInt.addListener(new FarmShop.a(farmShop));
        ofInt.start();
    }
}
