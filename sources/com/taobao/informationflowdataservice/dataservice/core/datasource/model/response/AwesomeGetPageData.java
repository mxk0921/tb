package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.t5a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetPageData implements IPageDataModel, IMTOPDataObject {
    private String isLastPage;
    private String itemLastCount;
    private int pageNum;
    private int requestInAdvance = 10;
    private int firstRequestInAdvance = -1;

    static {
        t2o.a(487587886);
        t2o.a(488636515);
        t2o.a(589299906);
    }

    public int getFirstRequestInAdvance() {
        return this.firstRequestInAdvance;
    }

    public String getIsLastPage() {
        return this.isLastPage;
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

    public void setFirstRequestInAdvance(int i) {
        this.firstRequestInAdvance = i;
    }

    public void setIsLastPage(String str) {
        this.isLastPage = str;
    }

    public void setItemLastCount(String str) {
        this.itemLastCount = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public void setPageNum(int i) {
        this.pageNum = i;
    }

    public void setRequestInAdvance(int i) {
        this.requestInAdvance = i;
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "', requestInAdvance='" + this.requestInAdvance + "', firstRequestInAdvance='" + this.firstRequestInAdvance + "'}";
    }

    public AwesomeGetPageData clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        awesomeGetPageData.requestInAdvance = this.requestInAdvance;
        awesomeGetPageData.firstRequestInAdvance = this.firstRequestInAdvance;
        return awesomeGetPageData;
    }
}
