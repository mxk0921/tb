package com.taobao.mmad.data;

import com.taobao.bootimage.data.BootImageInfo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BaseMmAdModel extends BootImageInfo {
    private String creativeId;
    private String dataType;
    private String interactVideo;
    private String targetUrl;

    static {
        t2o.a(573571129);
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getInteractVideo() {
        return this.interactVideo;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setInteractVideo(String str) {
        this.interactVideo = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }
}
