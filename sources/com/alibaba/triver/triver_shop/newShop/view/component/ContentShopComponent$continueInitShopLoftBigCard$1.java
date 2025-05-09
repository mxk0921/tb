package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ContentShopComponent$continueInitShopLoftBigCard$1 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ContentShopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$continueInitShopLoftBigCard$1(ContentShopComponent contentShopComponent) {
        super(2);
        this.this$0 = contentShopComponent;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent$continueInitShopLoftBigCard$1 contentShopComponent$continueInitShopLoftBigCard$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$continueInitShopLoftBigCard$1");
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
        int i2 = ContentShopComponent.i1(this.this$0).j().height;
        int i3 = i + i2;
        EmbedShopLoftComponent c1 = ContentShopComponent.c1(this.this$0);
        if (c1 != null) {
            c1.H(i3);
        }
        EmbedShopLoftComponent c12 = ContentShopComponent.c1(this.this$0);
        if (c12 != null) {
            c12.z();
        }
        EmbedShopLoftComponent c13 = ContentShopComponent.c1(this.this$0);
        if (c13 != null) {
            c13.G(i2);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = i2;
        ViewGroup X0 = ContentShopComponent.X0(this.this$0);
        if (X0 != null) {
            X0.addView(baseTemplateComponent.d(), layoutParams2);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
