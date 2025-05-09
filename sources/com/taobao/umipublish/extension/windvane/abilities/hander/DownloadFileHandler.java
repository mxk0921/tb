package com.taobao.umipublish.extension.windvane.abilities.hander;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.weex.common.Constants;
import tb.gov;
import tb.krq;
import tb.qrf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DownloadFileHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int d;

    static {
        t2o.a(944767205);
    }

    public DownloadFileHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static /* synthetic */ Object ipc$super(DownloadFileHandler downloadFileHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/DownloadFileHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce95a278", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        if (jSONArray == null || jSONArray.size() < this.d) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        if (jSONArray != null) {
            this.c.mDownloadedMediaList.addAll(jSONArray);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = this.f14073a;
        String str3 = AbilityConst.Server.c;
        JSONArray a2 = qrf.a(jSONObject2, str3, AbilityConst.Server.d);
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        this.d = krq.i(qrf.n("", this.f14073a, str3, "minReqNum"), a2.size());
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("downloadList", (Object) jSONArray);
        for (int i = 0; i < a2.size(); i++) {
            JSONObject jSONObject4 = a2.getJSONObject(i);
            String m = qrf.m(jSONObject4, "type", "");
            if (TextUtils.equals("video", m)) {
                str = "video";
            } else {
                str = "image";
            }
            if (TextUtils.equals("video", m)) {
                str2 = gov.SUFFIX_MP4;
            } else {
                str2 = ".jpg";
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("url", (Object) qrf.m(jSONObject4, "url", ""));
            jSONObject5.put("type", (Object) str);
            jSONObject5.put(Constants.Name.SUFFIX, (Object) str2);
            jSONObject5.put("optional", (Object) qrf.m(jSONObject4, "optional", "true"));
            jSONArray.add(jSONObject5);
        }
        return jSONObject3;
    }
}
