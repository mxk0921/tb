package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SendCpmInfoRequest implements IMTOPDataObject {
    private String accept;
    private String clickid;
    private String cna;
    private String e;
    private String ext;
    private String referer;
    private String useragent;
    private String utdid;
    public String API_NAME = "mtop.wdcmunion.sendCpmClickLog";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(1018167354);
        t2o.a(589299906);
    }

    public String getAccept() {
        return this.accept;
    }

    public String getClickid() {
        return this.clickid;
    }

    public String getCna() {
        return this.cna;
    }

    public String getE() {
        return this.e;
    }

    public String getExt() {
        return this.ext;
    }

    public String getReferer() {
        return this.referer;
    }

    public String getUseragent() {
        return this.useragent;
    }

    public String getUtdid() {
        return this.utdid;
    }

    public void setAccept(String str) {
        this.accept = str;
    }

    public void setClickid(String str) {
        this.clickid = str;
    }

    public void setCna(String str) {
        this.cna = str;
    }

    public void setE(String str) {
        this.e = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setReferer(String str) {
        this.referer = str;
    }

    public void setUseragent(String str) {
        this.useragent = str;
    }

    public void setUtdid(String str) {
        this.utdid = str;
    }
}
