package com.taobao.share.taopassword.busniess.mtop.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopJudgePasswordRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.judgepassword";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String passwordContent = null;
    private String passwordType = null;

    static {
        t2o.a(665845884);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getPasswordContent() {
        return this.passwordContent;
    }

    public String getPasswordType() {
        return this.passwordType;
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

    public void setPasswordContent(String str) {
        this.passwordContent = str;
    }

    public void setPasswordType(String str) {
        this.passwordType = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
