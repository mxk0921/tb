package com.taobao.message.unread;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpMessageUnreadcountRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp.message.unreadcount";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long startTime = 0;
    private String msgChannelTypeList = null;
    private String source = null;

    static {
        t2o.a(530579499);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getMsgChannelTypeList() {
        return this.msgChannelTypeList;
    }

    public String getSource() {
        return this.source;
    }

    public long getStartTime() {
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

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
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

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
