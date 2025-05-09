package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.qrf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class KFCHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767209);
    }

    public KFCHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(KFCHandler kFCHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/KFCHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        String n = qrf.n("", this.f14073a, AbilityConst.Server.f14056a, AbilityConst.Server.h, AbilityConst.Server.i);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(n);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Localization.q(R.string.gg_pub_title), (Object) jSONArray);
        return jSONObject2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce95a278", new Object[]{this, jSONObject})).booleanValue();
        }
        if (qrf.h(jSONObject, "state", 0) != 1) {
            String str = "";
            String n = qrf.n(str, this.f14073a, AbilityConst.Server.f14056a, AbilityConst.Server.h, AbilityConst.Server.i);
            if (jSONObject != null) {
                str = jSONObject.toJSONString();
            }
            UmiPublishMonitor.w().o("3001", n, "quick_publish_kfc_error", str);
        }
        return qrf.h(jSONObject, "state", 0) != 1;
    }
}
