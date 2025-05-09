package com.taobao.taolive.sdk.configurable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ITaoLiveComponentConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject bizData;
    public List<ITaoLiveComponentConfig> cList;
    public String cName;
    public Boolean entranceHidden;
    public String objName;

    static {
        t2o.a(806356049);
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            str = JSON.toJSONString(this.bizData);
        } catch (Throwable unused) {
            str = null;
        }
        return "ITaoLiveComponentConfig{cName = '" + this.cName + "', bizData = " + str + ", entranceHidden = " + this.entranceHidden + '}';
    }
}
