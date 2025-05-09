package com.taobao.umipublish.extension.windvane.abilities.hander;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.umipublish.extension.windvane.abilities.bean.Request;
import com.taobao.umipublish.extension.windvane.abilities.bean.RequestDataBean;
import tb.d83;
import tb.o4n;
import tb.qrf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ContentPublishHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767203);
    }

    public ContentPublishHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(ContentPublishHandler contentPublishHandler, String str, Object... objArr) {
        if (str.hashCode() == -554365765) {
            super.c((JSONObject) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/ContentPublishHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        Request request = new Request();
        RequestDataBean requestDataBean = request.data;
        JSONObject jSONObject2 = this.f14073a;
        String str = AbilityConst.Server.f14056a;
        requestDataBean.richTitle = qrf.l(jSONObject2, str, AbilityConst.Server.h);
        request.data.title = d83.a(this.f14073a);
        request.data.media.add(this.c.mPublishVideo);
        request.data.media.add(this.c.mPublishCover);
        JSONObject l = qrf.l(this.f14073a, str, AbilityConst.Server.k);
        if (l != null) {
            request.data.topics.add(l);
        }
        JSONArray a2 = qrf.a(this.f14073a, AbilityConst.Server.l);
        if (a2 != null) {
            request.data.item.addAll(a2);
        }
        JSONObject jSONObject3 = new JSONObject();
        this.c.mPublishRequestParams = (JSONObject) JSON.toJSON(request);
        jSONObject3.put("request", (Object) this.c.mPublishRequestParams);
        jSONObject3.put("params", (Object) this.b);
        return jSONObject3;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            return;
        }
        super.c(jSONObject);
        e(jSONObject);
    }

    public final String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("483031ff", new Object[]{this, jSONObject});
        }
        return jSONObject.getString("contentId");
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029c34e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String d = d(jSONObject);
            if (!TextUtils.isEmpty(d)) {
                o4n.b(this.b, d);
            }
        }
    }
}
