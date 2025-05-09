package com.alibaba.triver.triver_shop.shop2023;

import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FarmShop$initHeader$5$1 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023HeaderTagListTemplate $shop2023HeaderTagListTemplate;
    public final /* synthetic */ FarmShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FarmShop$initHeader$5$1(FarmShop farmShop, Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate) {
        super(2);
        this.this$0 = farmShop;
        this.$shop2023HeaderTagListTemplate = shop2023HeaderTagListTemplate;
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initHeader$5$1 farmShop$initHeader$5$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initHeader$5$1");
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
        if (!FarmShop.m1(this.this$0)) {
            this.$shop2023HeaderTagListTemplate.L();
        }
    }
}
