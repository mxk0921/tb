package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DownloadMaterialHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767206);
    }

    public DownloadMaterialHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(DownloadMaterialHandler downloadMaterialHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/DownloadMaterialHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        try {
            String string = this.f14073a.getJSONObject(AbilityConst.Server.f14056a).getJSONArray(AbilityConst.Server.b).getJSONObject(0).getString("tid");
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("materialIds", (Object) jSONArray);
            return jSONObject2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
        } else {
            this.c.mTemplateInfo = jSONObject.getJSONArray("materialList").getJSONObject(0);
        }
    }
}
