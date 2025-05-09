package com.taobao.share.taopassword.busniess.mtop.response;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData implements IMTOPDataObject {
    private String content;
    private String createTime;
    private String longUrl;
    private String password;
    public String shareDataTrack;
    private String switchNewWx;
    private String url;
    private String validDate;

    static {
        t2o.a(665845891);
        t2o.a(589299906);
    }

    public String getContent() {
        return this.content;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getLongUrl() {
        return this.longUrl;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSwitchNewWx() {
        return this.switchNewWx;
    }

    public String getUrl() {
        return this.url;
    }

    public String getValidDate() {
        return this.validDate;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setLongUrl(String str) {
        this.longUrl = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSwitchNewWx(String str) {
        this.switchNewWx = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setValidDate(String str) {
        this.validDate = str;
    }
}
