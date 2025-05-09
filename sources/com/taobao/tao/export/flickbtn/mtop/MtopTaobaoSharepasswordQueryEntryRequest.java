package com.taobao.tao.export.flickbtn.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.queryEntry";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String bizcode = null;
    private String extendMap = null;
    private String targetType = null;
    private String id = null;

    static {
        t2o.a(666894405);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getBizcode() {
        return this.bizcode;
    }

    public String getExtendMap() {
        return this.extendMap;
    }

    public String getId() {
        return this.id;
    }

    public String getTargetType() {
        return this.targetType;
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

    public void setBizcode(String str) {
        this.bizcode = str;
    }

    public void setExtendMap(String str) {
        this.extendMap = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setTargetType(String str) {
        this.targetType = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
