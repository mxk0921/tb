package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.shop2023.FlagShipV25;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bdw;
import tb.ckf;
import tb.d1a;
import tb.hps;
import tb.kew;
import tb.vpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$showTab3$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends FlagShipV25.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlagShipV25 f3294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FlagShipV25 flagShipV25) {
            super(flagShipV25);
            this.f3294a = flagShipV25;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$showTab3$2$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.FlagShipV25.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            PerceptionLinearLayout M1 = FlagShipV25.M1(this.f3294a);
            if (M1 != null) {
                kew.h0(M1);
                hps O1 = FlagShipV25.O1(this.f3294a);
                if (O1 != null && !O1.a()) {
                    hps O12 = FlagShipV25.O1(this.f3294a);
                    if (O12 != null) {
                        O12.j();
                    }
                    vpd I = FlagShipV25.v1(this.f3294a).I();
                    if (I != null) {
                        I.a(FlagShipV25.v1(this.f3294a).C(), FlagShipV25.v1(this.f3294a).p1());
                        return;
                    }
                    return;
                }
                return;
            }
            ckf.y("shopHeaderContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$showTab3$2(FlagShipV25 flagShipV25) {
        super(0);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$showTab3$2 flagShipV25$showTab3$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$showTab3$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        MarginSupportFrameLayout N1 = FlagShipV25.N1(this.this$0);
        if (N1 != null) {
            kew.e(N1, FlagShipV25.t1(this.this$0).getHeight());
            MarginSupportFrameLayout N12 = FlagShipV25.N1(this.this$0);
            if (N12 != null) {
                bdw.h(N12, FlagShipV25.t1(this.this$0).getHeight() * (-1.0f), 700L, new a(this.this$0)).start();
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
