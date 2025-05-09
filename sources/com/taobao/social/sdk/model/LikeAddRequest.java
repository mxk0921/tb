package com.taobao.social.sdk.model;

import com.taobao.adaemon.TriggerChannelService;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LikeAddRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.like.add";
    private String VERSION = "2.0";

    static {
        t2o.a(817889337);
    }

    public LikeAddRequest() {
        setApiName("mtop.taobao.social.like.add");
        setVersion(this.VERSION);
        setNeedEcode(true);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + j);
    }

    public void setOrigin(String str) {
        this.dataParams.put(TriggerChannelService.EXTRA_ORIGIN, str);
    }

    public void setTargetCover(String str) {
        this.dataParams.put("targetCover", str);
    }

    public void setTargetId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + j);
    }

    public void setTargetOwnerId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetOwnerId", "" + j);
    }

    public void setTargetTitle(String str) {
        this.dataParams.put("targetTitle", str);
    }

    public void setTargetUrl(String str) {
        this.dataParams.put("targetUrl", str);
    }

    public void setNamespace(String str) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + str);
    }

    public void setTargetId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + str);
    }

    public void setTargetOwnerId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetOwnerId", "" + str);
    }
}
