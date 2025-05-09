package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FarmShop$initComponent$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ FarmShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FarmShop$initComponent$2(FarmShop farmShop, ShopDataParser shopDataParser) {
        super(0);
        this.this$0 = farmShop;
        this.$shopData = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initComponent$2 farmShop$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initComponent$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        if (FarmShop.o1(this.this$0)) {
            return "live";
        }
        return this.$shopData.T();
    }
}
