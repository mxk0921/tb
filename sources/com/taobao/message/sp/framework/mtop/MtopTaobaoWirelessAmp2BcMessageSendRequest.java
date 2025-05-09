package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageSendRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp2.bc.message.send";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long receiverId = 0;
    private String receiverEncryptId = null;
    private String message = null;
    private String receiverNick = null;

    static {
        t2o.a(552599694);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReceiverEncryptId() {
        return this.receiverEncryptId;
    }

    public long getReceiverId() {
        return this.receiverId;
    }

    public String getReceiverNick() {
        return this.receiverNick;
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

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setReceiverEncryptId(String str) {
        this.receiverEncryptId = str;
    }

    public void setReceiverId(long j) {
        this.receiverId = j;
    }

    public void setReceiverNick(String str) {
        this.receiverNick = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
