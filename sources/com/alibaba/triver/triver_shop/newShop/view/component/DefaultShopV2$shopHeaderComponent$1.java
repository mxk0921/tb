package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DefaultShopV2$shopHeaderComponent$1 extends Lambda implements g1a<ShopHeaderComponent, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DefaultShopV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopV2$shopHeaderComponent$1(DefaultShopV2 defaultShopV2) {
        super(1);
        this.this$0 = defaultShopV2;
    }

    public static /* synthetic */ Object ipc$super(DefaultShopV2$shopHeaderComponent$1 defaultShopV2$shopHeaderComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2$shopHeaderComponent$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ShopHeaderComponent shopHeaderComponent) {
        invoke2(shopHeaderComponent);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ShopHeaderComponent shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4c628f", new Object[]{this, shopHeaderComponent});
            return;
        }
        ckf.g(shopHeaderComponent, "shopHeaderComponent");
        if (!this.this$0.v()) {
            shopHeaderComponent.L(false);
        } else if (this.this$0.y()) {
            shopHeaderComponent.K(true);
        } else {
            shopHeaderComponent.L(true);
        }
    }
}
