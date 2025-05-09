package com.taobao.passivelocation.business.report_location;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopLbsPosServiceResponseData implements IMTOPDataObject {
    private String msgCode = null;
    private String msgInfo = null;
    private boolean success = false;

    static {
        t2o.a(789577835);
        t2o.a(589299906);
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public String getMsgInfo() {
        return this.msgInfo;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setMsgCode(String str) {
        this.msgCode = str;
    }

    public void setMsgInfo(String str) {
        this.msgInfo = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
