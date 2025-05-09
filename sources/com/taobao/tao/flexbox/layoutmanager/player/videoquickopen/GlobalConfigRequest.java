package com.taobao.tao.flexbox.layoutmanager.player.videoquickopen;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.login4android.session.constants.SessionConstants;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kf3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GlobalConfigRequest implements IMTOPDataObject {
    public JSONObject extendParams;
    private String API_NAME = "mtop.taobao.content.detail.mix.globalconfig";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String REQUEST_TYPE = "GET";
    public JSONArray sourceList = null;

    static {
        t2o.a(502268317);
        t2o.a(589299906);
    }

    public void buildExtendParams() {
        this.VERSION = "2.0";
        JSONObject jSONObject = new JSONObject();
        this.extendParams = jSONObject;
        jSONObject.put(kf3.REQ_SUPPORTWEEX, (Object) Boolean.TRUE);
    }

    public String getApi() {
        return this.API_NAME;
    }

    public String getVersion() {
        return this.VERSION;
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
        jSONObject2.put("source", (Object) this.sourceList);
        jSONObject2.put("extendParameters", (Object) this.extendParams);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }
}
