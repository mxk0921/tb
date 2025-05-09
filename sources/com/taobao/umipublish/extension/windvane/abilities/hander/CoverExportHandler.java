package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.odg;
import tb.qrf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CoverExportHandler extends ExportHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767204);
    }

    public CoverExportHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(CoverExportHandler coverExportHandler, String str, Object... objArr) {
        if (str.hashCode() == 1390867556) {
            return super.a((JSONObject) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/CoverExportHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("cover");
        JSONObject a2 = super.a(jSONObject);
        a2.put("outputType", (Object) jSONArray);
        return a2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("cover");
        this.c.mPublishCover.path = qrf.m(jSONObject2, "path", null);
        this.c.mPublishCover.width = Integer.valueOf(qrf.h(jSONObject2, "width", 0));
        this.c.mPublishCover.height = Integer.valueOf(qrf.h(jSONObject2, "height", 0));
        this.c.mTemplateClipsCount = qrf.h(jSONObject.getJSONObject("clips"), "clips_count", 0);
        odg.d("CoverExportHandler", "clipsCount out: " + this.c.mTemplateClipsCount);
    }
}
