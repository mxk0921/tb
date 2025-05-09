package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$getBottomTabPositionInfo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ String $params;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$getBottomTabPositionInfo$1(String str, WVCallBackContext wVCallBackContext, WVShopApiBridge wVShopApiBridge) {
        super(0);
        this.$params = str;
        this.$callback = wVCallBackContext;
        this.this$0 = wVShopApiBridge;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$getBottomTabPositionInfo$1 wVShopApiBridge$getBottomTabPositionInfo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$getBottomTabPositionInfo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShopDataParser.ShopViewContext m1;
        g1a<String, JSONObject> B;
        JSONObject invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        JSONObject k = brf.k(this.$params);
        if (k != null) {
            WVShopApiBridge wVShopApiBridge = this.this$0;
            WVCallBackContext wVCallBackContext = this.$callback;
            ShopDataParser access$getShopData = WVShopApiBridge.access$getShopData(wVShopApiBridge, wVCallBackContext);
            if (!(access$getShopData == null || (m1 = access$getShopData.m1()) == null || (B = m1.B()) == null || (invoke = B.invoke(k.getString("tabName"))) == null)) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(invoke.toJSONString());
                    return;
                }
                return;
            }
        }
        WVCallBackContext wVCallBackContext2 = this.$callback;
        if (wVCallBackContext2 != null) {
            wVCallBackContext2.error();
        }
    }
}
