package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.k75;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpImbaMessageSessionListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp.imba.message.session.list";
    private String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String lastMsgId = null;
    private String accessKey = null;
    private String conversationId = null;
    private long pageSize = 0;
    private String tag = null;
    private String accessToken = null;
    private long lastMsgTime = 0;
    private long direction = 0;

    static {
        t2o.a(552599700);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getDirection() {
        return this.direction;
    }

    public String getLastMsgId() {
        return this.lastMsgId;
    }

    public long getLastMsgTime() {
        return this.lastMsgTime;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public String getTag() {
        return this.tag;
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

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setDirection(long j) {
        this.direction = j;
    }

    public void setLastMsgId(String str) {
        this.lastMsgId = str;
    }

    public void setLastMsgTime(long j) {
        this.lastMsgTime = j;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setPageSize(long j) {
        this.pageSize = j;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
