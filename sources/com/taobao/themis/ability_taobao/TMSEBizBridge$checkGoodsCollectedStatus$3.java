package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.collect.CollectServiceImpl;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "response", "Ltb/xhv;", "invoke", "(Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEBizBridge$checkGoodsCollectedStatus$3 extends Lambda implements g1a<IMtopInnerAdapter.Response, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$checkGoodsCollectedStatus$3(BridgeCallback bridgeCallback, String str) {
        super(1);
        this.$bridgeCallback = bridgeCallback;
        this.$id = str;
    }

    public static /* synthetic */ Object ipc$super(TMSEBizBridge$checkGoodsCollectedStatus$3 tMSEBizBridge$checkGoodsCollectedStatus$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSEBizBridge$checkGoodsCollectedStatus$3");
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
            jSONObject.put((JSONObject) "errorCode", response.getErrorCode());
            jSONObject.put((JSONObject) "message", response.getErrorMsg());
            jSONObject.put((JSONObject) "errorMessage", response.getErrorMsg());
            jSONObject.put((JSONObject) "error", (String) 10);
            this.$bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        JSONObject data = response.getData();
        ckf.d(data);
        JSONObject jSONObject2 = data.getJSONObject("data");
        JSONObject jSONObject3 = jSONObject2 == null ? null : jSONObject2.getJSONObject("result");
        if (jSONObject3 != null) {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put((JSONObject) "id", this.$id);
            jSONObject4.put((JSONObject) "isCollect", (String) jSONObject3.getBoolean(CollectServiceImpl.KEY_COLLECT_STATUS));
            bridgeCallback.sendJSONResponse(jSONObject4);
            return;
        }
        JSONObject data2 = response.getData();
        ckf.d(data2);
        String string = data2.getString("errorMsg");
        if (string == null) {
            string = "检查收藏状态失败";
        }
        JSONObject jSONObject5 = new JSONObject();
        JSONObject data3 = response.getData();
        ckf.d(data3);
        String string2 = data3.getString("errorCode");
        if (string2 == null) {
            string2 = "UNKNOWN_ERROR";
        }
        jSONObject5.put((JSONObject) "errorCode", string2);
        jSONObject5.put((JSONObject) "message", string);
        jSONObject5.put((JSONObject) "errorMessage", string);
        jSONObject5.put((JSONObject) "error", (String) 10);
        this.$bridgeCallback.sendJSONResponse(jSONObject5);
    }
}
