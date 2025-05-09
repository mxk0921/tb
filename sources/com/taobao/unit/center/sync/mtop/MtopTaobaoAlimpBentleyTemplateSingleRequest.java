package com.taobao.unit.center.sync.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSingleRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.alimp.bentley.template.single";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String templateIds = null;

    static {
        t2o.a(552599809);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getTemplateIds() {
        return this.templateIds;
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

    public void setTemplateIds(String str) {
        this.templateIds = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
