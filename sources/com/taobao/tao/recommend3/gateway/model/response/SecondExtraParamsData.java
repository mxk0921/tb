package com.taobao.tao.recommend3.gateway.model.response;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecondExtraParamsData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject newface_home_main;
    public JSONObject newface_home_sub;
    public List<JSONObject> overlays;
    public int requestInAdvance;

    static {
        t2o.a(729809706);
    }

    public JSONObject getMainPassParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bd62eb4", new Object[]{this});
        }
        return (JSONObject) AwesomeGetData.getTFromJsonObj(this.newface_home_main, JSONObject.class, "base", "passParams");
    }

    public String getMainUpdatePassParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e4e8f6a", new Object[]{this});
        }
        return (String) AwesomeGetData.getTFromJsonObj(this.newface_home_main, String.class, "base", "updatePassParams");
    }

    public JSONObject getOverlaysMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d505a52a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        List<JSONObject> list = this.overlays;
        if (list != null && list.size() > 0) {
            for (JSONObject jSONObject2 : this.overlays) {
                jSONObject.put(jSONObject2.getString("uniqueKey"), (Object) jSONObject2.getJSONObject("overlay"));
            }
        }
        return jSONObject;
    }

    public int getRequestInAdvance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f88c57be", new Object[]{this})).intValue();
        }
        return this.requestInAdvance;
    }

    public JSONObject getSubPassParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecd655b9", new Object[]{this});
        }
        return (JSONObject) AwesomeGetData.getTFromJsonObj(this.newface_home_sub, JSONObject.class, "base", "passParams");
    }

    public String getSubUpdatePassParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1b48b6f", new Object[]{this});
        }
        return (String) AwesomeGetData.getTFromJsonObj(this.newface_home_sub, String.class, "base", "updatePassParams");
    }

    public void mergePassParam(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f4c3f", new Object[]{this, awesomeGetContainerInnerData});
        }
    }
}
