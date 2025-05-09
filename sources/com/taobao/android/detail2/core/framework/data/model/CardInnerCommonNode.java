package com.taobao.android.detail2.core.framework.data.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;
import tb.txj;
import tb.x3w;
import tb.z4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CardInnerCommonNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String containerName;
    public JSONObject data;
    public JSONObject dataContext;
    public x3w dataContextNode;
    public String locator;
    public String nid;
    public String position;
    public String type;
    public z4x containerInfo = new z4x();
    public HashMap<String, String> extraData = new HashMap<>();

    static {
        t2o.a(352321792);
    }

    public CardInnerCommonNode(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.type = jSONObject.getString("type");
            this.position = jSONObject.getString("position");
            this.data = jSONObject.getJSONObject("data");
            this.containerName = jSONObject.getString("containerName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("containerInfo");
            if (jSONObject2 != null) {
                this.containerInfo.d(jSONObject2.getString("weexUrl"));
                processContainerQueryParams(jSONObject2.getJSONObject("weexParams"));
            }
            this.locator = jSONObject.getString("locator");
        }
    }

    private void processContainerQueryParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662ada8d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        ((HashMap) this.containerInfo.c).put(str, jSONObject.getString(str));
                    }
                }
            } catch (Exception e) {
                txj.f("new_detail异常", "processContainerQueryParams异常", e);
            }
        }
    }

    public boolean isUrlValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d6b022", new Object[]{this})).booleanValue();
        }
        z4x z4xVar = this.containerInfo;
        if (z4xVar == null || TextUtils.isEmpty(z4xVar.c())) {
            return false;
        }
        return true;
    }
}
