package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopLoftNewVideoViewWithDW$getWebView$1 extends FunctionReferenceImpl implements d1a<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopLoftNewVideoViewWithDW$getWebView$1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(0, shopLoftNewVideoViewWithDW, ShopLoftNewVideoViewWithDW.class, "getPlayerInfo", "getPlayerInfo()Lcom/alibaba/fastjson/JSONObject;", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getWebView$1 shopLoftNewVideoViewWithDW$getWebView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final JSONObject invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3153bc1f", new Object[]{this}) : ShopLoftNewVideoViewWithDW.U((ShopLoftNewVideoViewWithDW) this.receiver);
    }
}
