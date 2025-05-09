package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brp;
import tb.d1a;
import tb.ete;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IndexNavComponent$init$1$switchTabTo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ int $tab;
    public final /* synthetic */ ete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexNavComponent$init$1$switchTabTo$1(ShopDataParser shopDataParser, ete eteVar, int i) {
        super(0);
        this.$shopData = shopDataParser;
        this.$tab = i;
    }

    public static /* synthetic */ Object ipc$super(IndexNavComponent$init$1$switchTabTo$1 indexNavComponent$init$1$switchTabTo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/IndexNavComponent$init$1$switchTabTo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            brp.n(this.$shopData, ete.B(null), this.$tab, null, 8, null);
        }
    }
}
