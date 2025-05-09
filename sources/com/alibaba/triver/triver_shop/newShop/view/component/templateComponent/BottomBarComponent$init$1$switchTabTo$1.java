package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brp;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BottomBarComponent$init$1$switchTabTo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ int $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomBarComponent$init$1$switchTabTo$1(ShopDataParser shopDataParser, int i) {
        super(0);
        this.$shopData = shopDataParser;
        this.$tab = i;
    }

    public static /* synthetic */ Object ipc$super(BottomBarComponent$init$1$switchTabTo$1 bottomBarComponent$init$1$switchTabTo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BottomBarComponent$init$1$switchTabTo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.$shopData;
        brp.l(shopDataParser, shopDataParser.C());
        ShopUTExposeEventKt.e(this.$shopData, this.$tab);
    }
}
