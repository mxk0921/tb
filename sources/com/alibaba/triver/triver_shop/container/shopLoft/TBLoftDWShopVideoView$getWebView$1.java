package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class TBLoftDWShopVideoView$getWebView$1 extends FunctionReferenceImpl implements d1a<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TBLoftDWShopVideoView$getWebView$1(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        super(0, tBLoftDWShopVideoView, TBLoftDWShopVideoView.class, "getPlayerInfo", "getPlayerInfo()Lcom/alibaba/fastjson/JSONObject;", 0);
    }

    public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView$getWebView$1 tBLoftDWShopVideoView$getWebView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$getWebView$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final JSONObject invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3153bc1f", new Object[]{this}) : TBLoftDWShopVideoView.U((TBLoftDWShopVideoView) this.receiver);
    }
}
