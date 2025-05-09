package com.taobao.desktop.ditto.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AnimMeta implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String animId;
    private JSONObject renderProp;

    static {
        t2o.a(436207622);
    }

    public String getAnimId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9d2b637", new Object[]{this});
        }
        return this.animId;
    }

    public JSONObject getRenderProp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1d60e36", new Object[]{this});
        }
        return this.renderProp;
    }

    public void setAnimId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02dfe1f", new Object[]{this, str});
        } else {
            this.animId = str;
        }
    }

    public void setRenderProp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf7040e", new Object[]{this, jSONObject});
        } else {
            this.renderProp = jSONObject;
        }
    }
}
