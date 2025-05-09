package com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoOpenlinkBizQrCodeMappingRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.openlink.biz.qr.code.mapping";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String originUrl = null;

    static {
        t2o.a(760217680);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getOriginUrl() {
        return this.originUrl;
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

    public void setOriginUrl(String str) {
        this.originUrl = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
