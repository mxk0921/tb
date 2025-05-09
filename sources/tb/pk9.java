package tb;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pk9 extends FlagShipContentComponentV3.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk9(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(flagShipContentComponentV3);
        this.b = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(pk9 pk9Var, String str, Object... objArr) {
        if (str.hashCode() == -2145066406) {
            super.onAnimationEnd((Animator) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$closeTab3$1");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        super.onAnimationEnd(animator);
        MarginSupportFrameLayout s1 = FlagShipContentComponentV3.s1(this.b);
        if (s1 != null) {
            ViewGroup.LayoutParams layoutParams = s1.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topToBottom = 0;
                layoutParams2.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                MarginSupportFrameLayout s12 = FlagShipContentComponentV3.s1(this.b);
                if (s12 != null) {
                    s12.setLayoutParams(layoutParams2);
                    if (!FlagShipContentComponentV3.f1(this.b) || !FlagShipContentComponentV3.a1(this.b)) {
                        PerceptionLinearLayout p1 = FlagShipContentComponentV3.p1(this.b);
                        if (p1 != null) {
                            p1.setZ(0.0f);
                        } else {
                            ckf.y("shopHeaderContainer");
                            throw null;
                        }
                    } else {
                        PerceptionLinearLayout p12 = FlagShipContentComponentV3.p1(this.b);
                        if (p12 != null) {
                            PerceptionSizeFrameLayout k1 = FlagShipContentComponentV3.k1(this.b);
                            if (k1 != null) {
                                p12.setZ(k1.getZ());
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("shopHeaderContainer");
                            throw null;
                        }
                    }
                    gps t1 = FlagShipContentComponentV3.t1(this.b);
                    if (t1 != null) {
                        t1.destroyView();
                    }
                    FlagShipContentComponentV3.C1(this.b, null);
                    hps u1 = FlagShipContentComponentV3.u1(this.b);
                    if (u1 != null) {
                        u1.destroyView();
                    }
                    FlagShipContentComponentV3.D1(this.b, null);
                    MarginSupportFrameLayout s13 = FlagShipContentComponentV3.s1(this.b);
                    if (s13 != null) {
                        s13.removeAllViews();
                    } else {
                        ckf.y("tab3Container");
                        throw null;
                    }
                } else {
                    ckf.y("tab3Container");
                    throw null;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        } else {
            ckf.y("tab3Container");
            throw null;
        }
    }
}
