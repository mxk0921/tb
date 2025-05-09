package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.kew;
import tb.sk9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$continueInitShopLoftBigCard$2 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$continueInitShopLoftBigCard$2(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(2);
        this.this$0 = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$continueInitShopLoftBigCard$2 flagShipContentComponentV3$continueInitShopLoftBigCard$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$continueInitShopLoftBigCard$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        invoke2(baseTemplateComponent, layoutParams);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        EmbedShopLoftComponent c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbd566", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        ckf.g(baseTemplateComponent, "templateComponent");
        ckf.g(layoutParams, "templateViewLayoutParams");
        int i = layoutParams.height;
        if (this.this$0.z()) {
            SwipeBigCardComponent r1 = FlagShipContentComponentV3.r1(this.this$0);
            EmbedShopLoftComponent c2 = r1 == null ? null : r1.c();
            if (c2 != null) {
                c2.H(i + kew.P(Integer.valueOf((FlagShipContentComponentV3.g1(this.this$0) * 2) + 50)));
            }
            SwipeBigCardComponent r12 = FlagShipContentComponentV3.r1(this.this$0);
            if (!(r12 == null || (c = r12.c()) == null)) {
                c.z();
            }
        } else {
            EmbedShopLoftComponent h1 = FlagShipContentComponentV3.h1(this.this$0);
            if (h1 != null) {
                h1.H(i + kew.P(Integer.valueOf((FlagShipContentComponentV3.g1(this.this$0) * 2) + 50)));
            }
            EmbedShopLoftComponent h12 = FlagShipContentComponentV3.h1(this.this$0);
            if (h12 != null) {
                h12.z();
            }
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = FlagShipContentComponentV3.l1(this.this$0) + sk9.Companion.g();
        ViewGroup b1 = FlagShipContentComponentV3.b1(this.this$0);
        if (b1 != null) {
            b1.addView(baseTemplateComponent.d(), layoutParams2);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
