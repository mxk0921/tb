package tb;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class p09 extends FarmShop.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FarmShop b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p09(FarmShop farmShop) {
        super(farmShop);
        this.b = farmShop;
    }

    public static /* synthetic */ Object ipc$super(p09 p09Var, String str, Object... objArr) {
        if (str.hashCode() == -2145066406) {
            super.onAnimationEnd((Animator) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$changeToHomePage$1$1");
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.FarmShop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        super.onAnimationEnd(animator);
        FrameLayout p1 = FarmShop.p1(this.b);
        if (p1 != null) {
            kew.d0(p1, this.b.X1().c());
        } else {
            ckf.y("navViewContainer");
            throw null;
        }
    }
}
