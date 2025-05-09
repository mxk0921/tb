package com.taobao.android.detail.ttdetail.request.params;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.b5m;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecommendRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_ID = "appId";
    private JSONObject mParams = new JSONObject();

    static {
        t2o.a(912262187);
        t2o.a(912262184);
    }

    public RecommendRequestParams(JSONObject jSONObject) {
        buildParams(jSONObject);
    }

    public static /* synthetic */ JSONObject access$000(RecommendRequestParams recommendRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a48aecb7", new Object[]{recommendRequestParams});
        }
        return recommendRequestParams.mParams;
    }

    private void buildParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b02e35", new Object[]{this, jSONObject});
            return;
        }
        this.mParams.put("bizId", (Object) "detailRecommend");
        Application d = mr7.d();
        this.mParams.put("longitude", (Object) b5m.I().b(d));
        this.mParams.put("latitude", (Object) b5m.I().c(d));
        this.mParams.put("utdid", (Object) UTDevice.getUtdid(d));
        if (jSONObject != null) {
            this.mParams.putAll(jSONObject);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        String string = this.mParams.getString("appId");
        this.mParams.remove("appId");
        return JSON.toJSONString(new JSONObject(string, new JSONObject() { // from class: com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams.1
            {
                put("param", (Object) RecommendRequestParams.access$000(RecommendRequestParams.this).toJSONString());
            }
        }) { // from class: com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams.2
            public final /* synthetic */ String val$appId;
            public final /* synthetic */ JSONObject val$param;

            {
                this.val$appId = string;
                this.val$param = r3;
                if (TextUtils.isEmpty(string)) {
                    putAll(r3);
                    return;
                }
                put("appId", (Object) string);
                put("params", (Object) r3.toJSONString());
            }
        });
    }
}
