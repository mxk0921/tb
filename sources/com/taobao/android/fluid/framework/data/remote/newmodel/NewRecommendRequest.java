package com.taobao.android.fluid.framework.data.remote.newmodel;

import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class NewRecommendRequest implements IMTOPRequest {
    public String appId;
    private final String API_NAME = "mtop.relationrecommend.wirelessrecommend.recommend";
    private final String VERSION = "2.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public String asac = null;
    public String params = null;

    static {
        t2o.a(468714249);
        t2o.a(468714246);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.relationrecommend.wirelessrecommend.recommend";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getVersion() {
        return "2.0";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedSession() {
        return true;
    }

    public String toString() {
        return "NewRecommendRequest{API_NAME='39, VERSION='2.0', NEED_ECODE=false, NEED_SESSION=true, appId='" + this.appId + "', asac='" + this.asac + "', params='" + this.params + "'}";
    }
}
