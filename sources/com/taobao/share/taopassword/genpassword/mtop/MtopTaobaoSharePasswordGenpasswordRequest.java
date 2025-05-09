package com.taobao.share.taopassword.genpassword.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.bwr;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoSharePasswordGenpasswordRequest implements IMTOPDataObject {
    private String target;
    private String API_NAME = bwr.GENPASSWORD;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String sourceType = null;
    private String picUrl = null;
    private String targetUrl = null;
    private String bizId = null;
    private String passwordType = null;
    private String password = null;
    private String title = null;
    private String templateId = null;
    private long expireTime = 0;
    private String extendInfo = null;
    private String popType = null;
    private String popUrl = null;

    static {
        t2o.a(665845920);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getBizId() {
        return this.bizId;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPasswordType() {
        return this.passwordType;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getPopType() {
        return this.popType;
    }

    public String getPopUrl() {
        return this.popUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public String getTarget() {
        return this.target;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPasswordType(String str) {
        this.passwordType = str;
    }

    public void setPicUrl(String str) {
        this.picUrl = str;
    }

    public void setPopType(String str) {
        this.popType = str;
    }

    public void setPopUrl(String str) {
        this.popUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
