package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$initComponent$3 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$initComponent$3(FlagShipV25 flagShipV25, ShopDataParser shopDataParser) {
        super(0);
        this.this$0 = flagShipV25;
        this.$shopData = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initComponent$3 flagShipV25$initComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initComponent$3");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        if (FlagShipV25.k1(this.this$0)) {
            return "live";
        }
        if (FlagShipV25.R1(this.this$0)) {
            return "brandTab3";
        }
        return this.$shopData.T();
    }
}
