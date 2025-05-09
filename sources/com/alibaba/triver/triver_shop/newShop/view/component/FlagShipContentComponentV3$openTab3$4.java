package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bdw;
import tb.ckf;
import tb.d1a;
import tb.gps;
import tb.hps;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$openTab3$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $directlyJump;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends FlagShipContentComponentV3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FlagShipContentComponentV3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FlagShipContentComponentV3 flagShipContentComponentV3) {
            super(flagShipContentComponentV3);
            this.b = flagShipContentComponentV3;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$openTab3$4$1");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hps u1;
            gps t1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            PerceptionLinearLayout p1 = FlagShipContentComponentV3.p1(this.b);
            if (p1 != null) {
                kew.h0(p1);
                gps t12 = FlagShipContentComponentV3.t1(this.b);
                if (!(t12 == null || t12.a() || (t1 = FlagShipContentComponentV3.t1(this.b)) == null)) {
                    t1.j();
                }
                hps u12 = FlagShipContentComponentV3.u1(this.b);
                if (u12 != null && !u12.a() && (u1 = FlagShipContentComponentV3.u1(this.b)) != null) {
                    u1.j();
                    return;
                }
                return;
            }
            ckf.y("shopHeaderContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$openTab3$4(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z) {
        super(0);
        this.this$0 = flagShipContentComponentV3;
        this.$directlyJump = z;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$openTab3$4 flagShipContentComponentV3$openTab3$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$openTab3$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        MarginSupportFrameLayout s1 = FlagShipContentComponentV3.s1(this.this$0);
        if (s1 != null) {
            kew.e(s1, this.this$0.H().getHeight());
            MarginSupportFrameLayout s12 = FlagShipContentComponentV3.s1(this.this$0);
            if (s12 != null) {
                bdw.h(s12, this.this$0.H().getHeight() * (-1.0f), this.$directlyJump ? 0L : 700L, new a(this.this$0)).start();
            } else {
                ckf.y("tab3Container");
                throw null;
            }
        } else {
            ckf.y("tab3Container");
            throw null;
        }
    }
}
