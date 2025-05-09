package com.taobao.detail.rate.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.j5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateListDetailRequest implements IMTOPDataObject {
    public String andQueryCondition;
    public String auctionNumId;
    public String expression;
    public String extraInfoMap;
    public String extraInfoString;
    public String feature;
    public String feedId;
    public String foldFlag;
    public String fromImpr;
    public String hasPic;
    public String invokeSource;
    public String orderType;
    public String pageNo;
    public String pageSize;
    public String rateSrc;
    public String rateType;
    public String searchImpr;
    public String skuVids;
    public String storeId;
    public String API_NAME = "mtop.taobao.rate.detaillist.get";
    public String VERSION = j5m.API_VERSION;
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

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
}
