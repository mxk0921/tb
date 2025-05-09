package com.taobao.activelocation.mtop.pois;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopPoiResponseData implements IMTOPDataObject {
    private String msgCode = null;
    private String msgInfo = null;
    private List<Poi> pois;

    static {
        t2o.a(789577752);
        t2o.a(589299906);
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public String getMsgInfo() {
        return this.msgInfo;
    }

    public List<Poi> getPois() {
        return this.pois;
    }

    public void setMsgCode(String str) {
        this.msgCode = str;
    }

    public void setMsgInfo(String str) {
        this.msgInfo = str;
    }

    public void setPois(List<Poi> list) {
        this.pois = list;
    }
}
