package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessNewRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.shop.single.page.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String sellerId = null;
    public String shopId = null;
    public String pathInfo = null;
    public String pageId = null;

    static {
        t2o.a(668991568);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
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

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public String toString() {
        return "MtopTaobaoWirelessShopRouteProcessNewRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', sellerId='" + this.sellerId + "', shopId='" + this.shopId + "', pathInfo='" + this.pathInfo + "', pageId='" + this.pageId + "'}";
    }
}
