package com.alibaba.triver.triver_shop.shop2023;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
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
public final class TmallCardShop$continueInitShopLoftBigCard$2 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$continueInitShopLoftBigCard$2(TmallCardShop tmallCardShop) {
        super(2);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$continueInitShopLoftBigCard$2 tmallCardShop$continueInitShopLoftBigCard$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$continueInitShopLoftBigCard$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        invoke2(baseTemplateComponent, layoutParams);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbd566", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        ckf.g(baseTemplateComponent, "templateComponent");
        ckf.g(layoutParams, "templateViewLayoutParams");
        int i = layoutParams.height;
        EmbedShopLoftComponent k1 = TmallCardShop.k1(this.this$0);
        if (k1 != null) {
            k1.H(i + kew.P(Integer.valueOf((TmallCardShop.j1(this.this$0) * 2) + 50)));
        }
        EmbedShopLoftComponent k12 = TmallCardShop.k1(this.this$0);
        if (k12 != null) {
            k12.z();
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = TmallCardShop.m1(this.this$0) + sk9.Companion.g();
        ViewGroup f1 = TmallCardShop.f1(this.this$0);
        if (f1 != null) {
            f1.addView(baseTemplateComponent.d(), layoutParams2);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
