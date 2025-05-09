package com.alibaba.triver.triver_shop.shop2023;

import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.jnp;
import tb.kew;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$continueInitShopLoftBigCard$1$1$1 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ jnp $this_apply;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$continueInitShopLoftBigCard$1$1$1(TmallCardShop tmallCardShop, jnp jnpVar) {
        super(2);
        this.this$0 = tmallCardShop;
        this.$this_apply = jnpVar;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$continueInitShopLoftBigCard$1$1$1 tmallCardShop$continueInitShopLoftBigCard$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$continueInitShopLoftBigCard$1$1$1");
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
        BaseContentComponent.e0(this.this$0, this.$this_apply, null, 2, null);
    }
}
