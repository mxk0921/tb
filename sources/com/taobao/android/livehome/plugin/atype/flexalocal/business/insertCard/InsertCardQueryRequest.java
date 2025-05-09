package com.taobao.android.livehome.plugin.atype.flexalocal.business.insertCard;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InsertCardQueryRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.tblive.recommend.insertcard.query";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private long mockUserId = 0;
    private String appVersion = null;
    private long queryAd = 0;
    private String contentId = null;
    private long moduleIndex = 0;
    private String extendCommonParams = null;
    private String channelType = null;
    private String subContentId = null;
    private long n = 0;
    private String extendParams = null;
    private long s = 0;
    private String sjsdLiveId = null;
    private String isChannelUpgradation = null;
    private String sjsdItemId = null;
    private String subChannelType = null;
    private String channelId = null;

    static {
        t2o.a(310378520);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public String getContentId() {
        return this.contentId;
    }

    public String getExtendCommonParams() {
        return this.extendCommonParams;
    }

    public String getExtendParams() {
        return this.extendParams;
    }

    public String getIsChannelUpgradation() {
        return this.isChannelUpgradation;
    }

    public long getMockUserId() {
        return this.mockUserId;
    }

    public long getModuleIndex() {
        return this.moduleIndex;
    }

    public long getN() {
        return this.n;
    }

    public long getQueryAd() {
        return this.queryAd;
    }

    public long getS() {
        return this.s;
    }

    public String getSjsdItemId() {
        return this.sjsdItemId;
    }

    public String getSjsdLiveId() {
        return this.sjsdLiveId;
    }

    public String getSubChannelType() {
        return this.subChannelType;
    }

    public String getSubContentId() {
        return this.subContentId;
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

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setChannelType(String str) {
        this.channelType = str;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public void setExtendCommonParams(String str) {
        this.extendCommonParams = str;
    }

    public void setExtendParams(String str) {
        this.extendParams = str;
    }

    public void setIsChannelUpgradation(String str) {
        this.isChannelUpgradation = str;
    }

    public void setMockUserId(long j) {
        this.mockUserId = j;
    }

    public void setModuleIndex(long j) {
        this.moduleIndex = j;
    }

    public void setN(long j) {
        this.n = j;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setQueryAd(long j) {
        this.queryAd = j;
    }

    public void setS(long j) {
        this.s = j;
    }

    public void setSjsdItemId(String str) {
        this.sjsdItemId = str;
    }

    public void setSjsdLiveId(String str) {
        this.sjsdLiveId = str;
    }

    public void setSubChannelType(String str) {
        this.subChannelType = str;
    }

    public void setSubContentId(String str) {
        this.subContentId = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
