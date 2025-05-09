package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpConversationListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp.conversation.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private boolean unRead = false;
    private long fetchCount = 0;
    private String appName = null;
    private String startTime = null;
    private String msgChannelTypeList = null;
    private String source = null;

    static {
        t2o.a(552599697);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getAppName() {
        return this.appName;
    }

    public long getFetchCount() {
        return this.fetchCount;
    }

    public String getMsgChannelTypeList() {
        return this.msgChannelTypeList;
    }

    public String getSource() {
        return this.source;
    }

    public String getStartTime() {
        return this.startTime;
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

    public boolean isUnRead() {
        return this.unRead;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setFetchCount(long j) {
        this.fetchCount = j;
    }

    public void setMsgChannelTypeList(String str) {
        this.msgChannelTypeList = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setUnRead(boolean z) {
        this.unRead = z;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
