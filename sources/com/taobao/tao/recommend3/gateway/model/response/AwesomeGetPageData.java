package com.taobao.tao.recommend3.gateway.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.t5a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetPageData implements Serializable, IMTOPDataObject, IPageDataModel {
    public String isLastPage;
    public String itemLastCount;
    public int pageNum;
    public int virtualPageNum;
    public int requestInAdvance = 10;
    public int firstRequestInAdvance = -1;

    static {
        t2o.a(729809702);
        t2o.a(589299906);
        t2o.a(488636515);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public String getItemLastCount() {
        return this.itemLastCount;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public int getPageNum() {
        return this.pageNum;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public int getRequestInAdvance() {
        return this.requestInAdvance;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public boolean isLastPage() {
        return t5a.b(this.isLastPage);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public void setPageNum(int i) {
        this.pageNum = i;
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + "virtualPageNum=" + this.virtualPageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "', requestInAdvance='" + this.requestInAdvance + "', firstRequestInAdvance='" + this.firstRequestInAdvance + "'}";
    }

    public AwesomeGetPageData clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.virtualPageNum = this.virtualPageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        awesomeGetPageData.requestInAdvance = this.requestInAdvance;
        awesomeGetPageData.firstRequestInAdvance = this.firstRequestInAdvance;
        return awesomeGetPageData;
    }
}
