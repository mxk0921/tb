package com.taobao.kirinvideoengine.feature.videodecide.model;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.login4android.session.constants.SessionConstants;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaVideoInfoRequestV2 implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.content.detail.video.info";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String REQUEST_TYPE = "GET";
    public long videoId = 0;
    public String source = null;
    public String type = null;
    public String extendParameters = null;

    static {
        t2o.a(500170785);
        t2o.a(589299906);
    }

    public String getApi() {
        return this.API_NAME;
    }

    public String getVersion() {
        return this.VERSION;
    }

    public boolean isEnableServerABR() {
        return true;
    }

    public boolean isNeedEcode() {
        return this.NEED_ECODE;
    }

    public boolean isNeedSession() {
        return this.NEED_SESSION;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", this.API_NAME);
        jSONObject.put("v", this.VERSION);
        jSONObject.put(SessionConstants.ECODE, Integer.valueOf(this.NEED_ECODE ? 1 : 0));
        jSONObject.put(MspGlobalDefine.SESSION, Integer.valueOf(this.NEED_SESSION ? 1 : 0));
        jSONObject.put("type", this.REQUEST_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("videoId", (Object) Long.valueOf(this.videoId));
        jSONObject2.put("source", (Object) this.source);
        jSONObject2.put("type", (Object) this.type);
        jSONObject2.put("extendParameters", (Object) this.extendParameters);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }
}
