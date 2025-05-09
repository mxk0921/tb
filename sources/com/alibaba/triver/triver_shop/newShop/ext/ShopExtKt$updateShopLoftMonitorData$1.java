package com.alibaba.triver.triver_shop.newShop.ext;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$updateShopLoftMonitorData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $performanceData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$updateShopLoftMonitorData$1(JSONObject jSONObject) {
        super(0);
        this.$performanceData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$updateShopLoftMonitorData$1 shopExtKt$updateShopLoftMonitorData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$updateShopLoftMonitorData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        String jSONString = this.$performanceData.toJSONString();
        npp.Companion.b(jSONString);
        Log.e("shop.nativeShop", jSONString);
    }
}
