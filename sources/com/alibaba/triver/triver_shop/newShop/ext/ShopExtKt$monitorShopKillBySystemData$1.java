package com.alibaba.triver.triver_shop.newShop.ext;

import android.os.Debug;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.mop;
import tb.rpp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$monitorShopKillBySystemData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$monitorShopKillBySystemData$1(ShopDataParser shopDataParser) {
        super(0);
        this.$shopData = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$monitorShopKillBySystemData$1 shopExtKt$monitorShopKillBySystemData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$monitorShopKillBySystemData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize();
        long pss = Debug.getPss();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) mop.KEY_APM_SHOP_URL, (String) this.$shopData.K0());
        jSONObject.put((JSONObject) "industryShop", this.$shopData.u0());
        jSONObject.put((JSONObject) "currentPageName", this.$shopData.R());
        jSONObject.put((JSONObject) "shopId", this.$shopData.W0());
        jSONObject.put((JSONObject) "memPss", (String) Long.valueOf(pss));
        jSONObject.put((JSONObject) "memJavaHeapSize", (String) Long.valueOf(freeMemory));
        jSONObject.put((JSONObject) "memNativeHeapSize", (String) Long.valueOf(nativeHeapSize));
        rpp.a("Shop", "DeathRecovery", jSONObject, new JSONObject(), null);
    }
}
