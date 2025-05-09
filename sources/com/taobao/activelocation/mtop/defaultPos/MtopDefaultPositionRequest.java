package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopDefaultPositionRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.arctic.nearby.position.defaultPosition";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String ssId = null;
    private String bssId = null;
    private String utdId = null;

    static {
        t2o.a(789577748);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getBssId() {
        return this.bssId;
    }

    public String getSsId() {
        return this.ssId;
    }

    public String getUtdId() {
        return this.utdId;
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

    public void setBssId(String str) {
        this.bssId = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setSsId(String str) {
        this.ssId = str;
    }

    public void setUtdId(String str) {
        this.utdId = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
