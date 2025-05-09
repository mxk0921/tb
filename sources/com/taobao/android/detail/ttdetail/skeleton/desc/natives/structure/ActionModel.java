package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ActionModel implements Serializable {
    @Deprecated
    public String key;
    public String mapping;
    public JSONObject params;
    public String type;

    static {
        t2o.a(912262466);
    }

    public ActionModel(JSONObject jSONObject) {
        this.key = jSONObject.getString("key");
        String string = jSONObject.getString("type");
        this.type = string;
        if (TextUtils.isEmpty(string)) {
            this.type = this.key;
        }
        if (jSONObject.containsKey("params")) {
            this.mapping = jSONObject.getString("params");
            this.params = jSONObject.getJSONObject("params");
            return;
        }
        this.mapping = jSONObject.getString("fields");
        this.params = jSONObject.getJSONObject("fields");
    }

    public ActionModel(ActionModel actionModel) {
        if (actionModel != null) {
            this.key = actionModel.key;
            this.type = actionModel.type;
            this.params = JSON.parseObject(actionModel.mapping);
        }
    }
}
