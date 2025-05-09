package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.d1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2025HeaderNativeComponent$initData$4$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Object $it;
    public final /* synthetic */ ShopDataParser $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2025HeaderNativeComponent$initData$4$1(ShopDataParser shopDataParser, Object obj) {
        super(0);
        this.$shopData = shopDataParser;
        this.$it = obj;
    }

    public static /* synthetic */ Object ipc$super(Shop2025HeaderNativeComponent$initData$4$1 shop2025HeaderNativeComponent$initData$4$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initData$4$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        a1v.d(this.$shopData, "Page_Shop_Button-Search_shadow", a.k(jpu.a("version", "1"), jpu.a("shadingWord", ((JSONObject) this.$it).getString("displayText")), jpu.a("benefitType", ((JSONObject) this.$it).getString("benefitType")), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))));
        a1v.d(this.$shopData, "Page_Shop_Page_Shop_Button-Search", a.k(jpu.a("shadingWord", ((JSONObject) this.$it).getString("displayText")), jpu.a("benefitType", ((JSONObject) this.$it).getString("benefitType"))));
    }
}
