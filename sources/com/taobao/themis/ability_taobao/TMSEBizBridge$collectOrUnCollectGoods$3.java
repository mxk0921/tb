package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
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
public final class TMSEBizBridge$collectOrUnCollectGoods$3 extends Lambda implements g1a<IMtopInnerAdapter.Response, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ApiContext $apiContext;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ String $id;
    public final /* synthetic */ boolean $isCollect;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$collectOrUnCollectGoods$3(boolean z, BridgeCallback bridgeCallback, TMSEBizBridge tMSEBizBridge, ApiContext apiContext, String str) {
        super(1);
        this.$isCollect = z;
        this.$bridgeCallback = bridgeCallback;
        this.this$0 = tMSEBizBridge;
        this.$apiContext = apiContext;
        this.$id = str;
    }

    public static /* synthetic */ Object ipc$super(TMSEBizBridge$collectOrUnCollectGoods$3 tMSEBizBridge$collectOrUnCollectGoods$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSEBizBridge$collectOrUnCollectGoods$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        ckf.g(response, "response");
        if (!response.getSuccess() || response.getData() == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "errorCode", response.getErrorCode());
            jSONObject2.put((JSONObject) "message", response.getErrorMsg());
            jSONObject2.put((JSONObject) "errorMessage", response.getErrorMsg());
            jSONObject2.put((JSONObject) "error", (String) 10);
            this.$bridgeCallback.sendJSONResponse(jSONObject2);
            return;
        }
        String str = this.$isCollect ? "collectGood" : "unCollectGoods";
        JSONObject data = response.getData();
        ckf.d(data);
        JSONObject jSONObject3 = data.getJSONObject("data");
        if (!(jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("result")) == null)) {
            z = ckf.b(jSONObject.getBoolean(str), Boolean.TRUE);
        }
        String str2 = null;
        if (z) {
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            TMSEBizBridge tMSEBizBridge = this.this$0;
            String str3 = this.$isCollect ? "TRVcollectGoods" : "TRVunCollectGoods";
            bbs b = this.$apiContext.b();
            if (b != null) {
                str2 = b.L();
            }
            TMSEBizBridge.monitor$default(tMSEBizBridge, "TRVTbApiPage", str3, str2, this.$id, TMSEBizBridge.access$getSpm(this.this$0, this.$apiContext.b()), "/mapp.guide.pdp", null, null, 128, null);
            return;
        }
        JSONObject data2 = response.getData();
        ckf.d(data2);
        JSONObject jSONObject4 = data2.getJSONObject("data");
        if (jSONObject4 != null) {
            str2 = jSONObject4.getString("errorMsg");
        }
        if (str2 == null) {
            str2 = this.$isCollect ? "收藏失败" : "取消收藏失败";
        }
        JSONObject jSONObject5 = new JSONObject();
        JSONObject data3 = response.getData();
        ckf.d(data3);
        String string = data3.getString("errorCode");
        if (string == null) {
            string = "UNKNOWN_ERROR";
        }
        jSONObject5.put((JSONObject) "errorCode", string);
        jSONObject5.put((JSONObject) "message", str2);
        jSONObject5.put((JSONObject) "errorMessage", str2);
        jSONObject5.put((JSONObject) "error", (String) 10);
        this.$bridgeCallback.sendJSONResponse(jSONObject5);
    }
}
