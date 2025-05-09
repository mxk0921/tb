package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.t2o;
import tb.yg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AsyncPublishHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767201);
    }

    public AsyncPublishHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(AsyncPublishHandler asyncPublishHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/AsyncPublishHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        this.f14073a.put("localMediaFiles", (Object) this.c.mDownloadedMediaList);
        this.f14073a.put(yg.CACHE_KEY_TEMPLATE_INFO, (Object) this.c.mTemplateInfo);
        this.f14073a.put("cover", (Object) this.c.mPublishCover);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) this.f14073a);
        jSONObject2.put("publishParams", (Object) this.b);
        return jSONObject2;
    }
}
