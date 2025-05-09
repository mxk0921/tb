package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmp2BcConversationCreateRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp2.bc.conversation.create";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String receiverMainEncryptId = null;
    private String receiverMainNick = null;

    static {
        t2o.a(552599688);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getReceiverMainEncryptId() {
        return this.receiverMainEncryptId;
    }

    public String getReceiverMainNick() {
        return this.receiverMainNick;
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

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setReceiverMainEncryptId(String str) {
        this.receiverMainEncryptId = str;
    }

    public void setReceiverMainNick(String str) {
        this.receiverMainNick = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
