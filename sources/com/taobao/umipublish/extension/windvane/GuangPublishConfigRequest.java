package com.taobao.umipublish.extension.windvane;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GuangPublishConfigRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.media.guang.publish.publishConfig";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String params = null;

    static {
        t2o.a(944767065);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getParams() {
        return this.params;
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

    public void setParams(String str) {
        this.params = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
