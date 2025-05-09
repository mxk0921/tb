package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bbs;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "response", "Ltb/xhv;", "invoke", "(Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEBizBridge$favorOrUnFavorShop$2 extends Lambda implements g1a<IMtopInnerAdapter.Response, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ bbs $instance;
    public final /* synthetic */ boolean $isFavor;
    public final /* synthetic */ String $sellerId;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$favorOrUnFavorShop$2(BridgeCallback bridgeCallback, boolean z, bbs bbsVar, TMSEBizBridge tMSEBizBridge, String str) {
        super(1);
        this.$bridgeCallback = bridgeCallback;
        this.$isFavor = z;
        this.$instance = bbsVar;
        this.this$0 = tMSEBizBridge;
        this.$sellerId = str;
    }

    public static /* synthetic */ Object ipc$super(TMSEBizBridge$favorOrUnFavorShop$2 tMSEBizBridge$favorOrUnFavorShop$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSEBizBridge$favorOrUnFavorShop$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        ckf.g(response, "response");
        if (!response.getSuccess() || response.getData() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "error", response.getErrorCode());
            jSONObject.put((JSONObject) "message", response.getErrorMsg());
            jSONObject.put((JSONObject) "errorMessage", response.getErrorMsg());
            this.$bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        JSONObject data = response.getData();
        ckf.d(data);
        JSONObject jSONObject2 = data.getJSONObject("data");
        if ((jSONObject2 == null ? null : jSONObject2.toJSONString()) != null) {
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            TMSEBizBridge.monitor$default(this.this$0, "TRVTbApiPage", this.$isFavor ? "TRVfavorShop" : "TRVunFavorShop", this.$instance.L(), null, TMSEBizBridge.access$getSpm(this.this$0, this.$instance), null, this.$sellerId, null, 168, null);
            return;
        }
        this.$bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "服务端数据解析错误"));
    }
}
