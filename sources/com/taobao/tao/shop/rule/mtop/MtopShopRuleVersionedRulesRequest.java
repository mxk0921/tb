package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopShopRuleVersionedRulesRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.shop.rule.versioned.rules";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String version = null;
    private String bizType = null;

    static {
        t2o.a(668991565);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getBizType() {
        return this.bizType;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public String getVersion() {
        return this.version;
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

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
