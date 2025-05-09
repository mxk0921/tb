package com.taobao.android.fluid.framework.data.remote;

import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaContentDetailRecommendRequest implements IMTOPRequest {
    public String contentId;
    public String sceneId;
    private final String API_NAME = "mtop.taobao.content.detail.mix.recommend";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public long pageIndex = 0;
    public String bizParameters = null;
    public long pageSize = 0;
    public String source = null;
    public String extendParameters = null;

    static {
        t2o.a(468714229);
        t2o.a(468714246);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.taobao.content.detail.mix.recommend";
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

    public String toString() {
        return "MediaContentDetailRecommendRequest{API_NAME='mtop.taobao.content.detail.mix.recommend', VERSION='1.0', NEED_ECODE=false, NEED_SESSION=true, pageIndex=" + this.pageIndex + ", contentId='" + this.contentId + "', sceneId='" + this.sceneId + "', pageSize=" + this.pageSize + ", source='" + this.source + "', bizParameters='" + this.bizParameters + "', extendParameters='" + this.extendParameters + "'}";
    }
}
