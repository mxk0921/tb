package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.yg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExportHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767207);
    }

    public ExportHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(ExportHandler exportHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/ExportHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = this.f14073a.getJSONObject(AbilityConst.Server.f14056a);
        String str = AbilityConst.Server.e;
        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
        JSONObject jSONObject4 = this.c.mTemplateInfo;
        if (!(jSONObject4 == null || jSONObject3 == null)) {
            jSONObject4.put(str, (Object) jSONObject3);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("video");
        jSONArray.add("cover");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("templateType", (Object) "video");
        jSONObject5.put("outputType", (Object) jSONArray);
        jSONObject5.put("materialList", (Object) this.c.mDownloadedMediaList);
        jSONObject5.put(yg.CACHE_KEY_TEMPLATE_INFO, (Object) this.c.mTemplateInfo);
        String str2 = AbilityConst.Server.g;
        jSONObject5.put(str2, (Object) jSONObject2.getJSONObject(str2));
        return jSONObject5;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("cover") : null;
        this.c.mPublishVideo.path = qrf.n("", jSONObject2, "path");
        this.c.mPublishCover.path = qrf.n("", jSONObject3, "path");
        this.c.mPublishCover.width = Integer.valueOf(qrf.h(jSONObject3, "width", 0));
        this.c.mPublishCover.height = Integer.valueOf(qrf.h(jSONObject3, "height", 0));
        this.c.mTemplateClipsCount = qrf.h(jSONObject.getJSONObject("clips"), "clips_count", 0);
        odg.d("ExportHandler", "clipsCount out: " + this.c.mTemplateClipsCount);
    }
}
