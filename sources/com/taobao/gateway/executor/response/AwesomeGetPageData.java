package com.taobao.gateway.executor.response;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetPageData implements Serializable, IMTOPDataObject {
    public String isLastPage;
    public String itemLastCount;
    public int pageNum;

    static {
        t2o.a(729808927);
        t2o.a(589299906);
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "'}";
    }

    public AwesomeGetPageData clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        return awesomeGetPageData;
    }
}
