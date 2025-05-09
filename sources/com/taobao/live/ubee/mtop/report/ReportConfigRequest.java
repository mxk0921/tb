package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ReportConfigRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.iliad.event.report.config";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        t2o.a(779092261);
        t2o.a(589299906);
    }

    public void setApiName(String str) {
        this.API_NAME = str;
    }

    public void setNeedeCode(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setVersion(String str) {
        this.VERSION = str;
    }
}
