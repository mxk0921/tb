package com.taobao.social.sdk.model;

import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ReportRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.report.add";
    private String VERSION = "1.0";

    static {
        t2o.a(817889339);
    }

    public ReportRequest() {
        setApiName("mtop.taobao.social.report.add");
        setVersion(this.VERSION);
        setNeedEcode(true);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setContent(String str) {
        Map<String, String> map = this.dataParams;
        map.put("content", "" + str);
    }

    public void setExpandAttribute(String str) {
        Map<String, String> map = this.dataParams;
        map.put("expandAttribute", "" + str);
    }

    public void setNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + j);
    }

    public void setPicUrls(String str) {
        Map<String, String> map = this.dataParams;
        map.put("picUrls", "" + str);
    }

    public void setTargetId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + j);
    }

    public void setTargetOwnerId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetOwnerId", "" + j);
    }

    public void setTargetParentId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetParentId", "" + j);
    }

    public void setVideoUrls(String str) {
        Map<String, String> map = this.dataParams;
        map.put("videoUrls", "" + str);
    }
}
