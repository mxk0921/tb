package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreLoadItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject cacheData;
    private String url;

    static {
        t2o.a(491782425);
    }

    public JSONObject getCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f387b43d", new Object[]{this});
        }
        return this.cacheData;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void setCacheData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f98d7f", new Object[]{this, jSONObject});
        } else {
            this.cacheData = jSONObject;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }
}
