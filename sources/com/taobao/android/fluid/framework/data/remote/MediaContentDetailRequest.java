package com.taobao.android.fluid.framework.data.remote;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.login4android.session.constants.SessionConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MediaContentDetailRequest implements IMTOPRequest {
    public String contentId;
    private final String API_NAME = "mtop.taobao.content.detail.mix.detail";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public String detailParameters = null;
    public String source = null;
    public String extendParameters = null;

    static {
        t2o.a(468714230);
        t2o.a(468714246);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.taobao.content.detail.mix.detail";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getVersion() {
        return "1.0";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedSession() {
        return true;
    }

    public JSONObject toJsonObjectForCacheCompare() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) "mtop.taobao.content.detail.mix.detail");
        jSONObject.put("v", (Object) "1.0");
        jSONObject.put(SessionConstants.ECODE, (Object) 0);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("contentId", (Object) this.contentId);
        jSONObject2.put("detailParameters", (Object) this.detailParameters);
        jSONObject2.put("source", (Object) this.source);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public String toString() {
        return "MediaContentDetailRequest{API_NAME='mtop.taobao.content.detail.mix.detail', VERSION='1.0', NEED_ECODE=false, NEED_SESSION=true, contentId='" + this.contentId + "', source='" + this.source + "', detailParameters='" + this.detailParameters + "', extendParameters='" + this.extendParameters + "'}";
    }
}
