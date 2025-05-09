package com.taobao.social.sdk.model;

import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LikeRemoveRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.like.remove";
    private String VERSION = "1.0";

    static {
        t2o.a(817889338);
    }

    public LikeRemoveRequest() {
        setApiName("mtop.taobao.social.like.remove");
        setVersion(this.VERSION);
        setNeedEcode(true);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + j);
    }

    public void setTargetId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + j);
    }

    public void setNamespace(String str) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + str);
    }

    public void setTargetId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + str);
    }
}
