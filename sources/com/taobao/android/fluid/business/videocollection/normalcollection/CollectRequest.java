package com.taobao.android.fluid.business.videocollection.normalcollection;

import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CollectRequest extends MtopRequest {
    private String API_NAME = "mtop.cogman.container.center.login";
    private String VERSION = "1.0";
    public String appId;
    private String entityId;
    private String params;

    static {
        t2o.a(468713717);
    }

    public String getApi() {
        return this.appId;
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public String getVersion() {
        return this.VERSION;
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public boolean isNeedSession() {
        return false;
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setParams(String str) {
        this.params = str;
    }
}
