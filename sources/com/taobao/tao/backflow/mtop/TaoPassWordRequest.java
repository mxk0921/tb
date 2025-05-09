package com.taobao.tao.backflow.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoPassWordRequest implements IMTOPDataObject {
    public String passwordContent;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String API_NAME = "mtop.taobao.sharepassword.userTipOff";

    static {
        t2o.a(666894365);
        t2o.a(589299906);
    }

    public String getPasswordContent() {
        return this.passwordContent;
    }

    public void setPasswordContent(String str) {
        this.passwordContent = str;
    }
}
