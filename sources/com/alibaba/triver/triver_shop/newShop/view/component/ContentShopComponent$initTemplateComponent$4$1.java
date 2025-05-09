package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ContentShopComponent$initTemplateComponent$4$1 extends Lambda implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ContentShopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$initTemplateComponent$4$1(ContentShopComponent contentShopComponent) {
        super(2);
        this.this$0 = contentShopComponent;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent$initTemplateComponent$4$1 contentShopComponent$initTemplateComponent$4$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$initTemplateComponent$4$1");
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
        ckf.g(baseTemplateComponent, "$noName_0");
        ckf.g(layoutParams, "$noName_1");
        if (this.this$0.y()) {
            ContentShopComponent.W0(this.this$0);
        }
    }
}
