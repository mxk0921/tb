package com.taobao.informationflowdataservice.dataservice.core.datasource.model.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetContainerParams implements IContainerParams<AwesomeGetPageData>, IMTOPDataObject {
    private long baseCacheTime;
    private JSONObject bizParams;
    private long clientReqOffsetTime;
    private long clientReqTime;
    private long deltaCacheTime;
    private List<String> deltaSections;
    private AwesomeGetPageData pageParams;
    private JSONObject passParams;
    private long realBaseCacheTime;
    private String requestType;

    static {
        t2o.a(487587881);
        t2o.a(488636508);
        t2o.a(589299906);
    }

    public long getBaseCacheTime() {
        return this.baseCacheTime;
    }

    public JSONObject getBizParams() {
        return this.bizParams;
    }

    public long getClientReqOffsetTime() {
        return this.clientReqOffsetTime;
    }

    public long getClientReqTime() {
        return this.clientReqTime;
    }

    public long getDeltaCacheTime() {
        return this.deltaCacheTime;
    }

    public List<String> getDeltaSections() {
        return this.deltaSections;
    }

    public AwesomeGetPageData getPageParams() {
        return this.pageParams;
    }

    public JSONObject getPassParams() {
        return this.passParams;
    }

    public long getRealBaseCacheTime() {
        return this.realBaseCacheTime;
    }

    public String getRequestType() {
        return this.requestType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setBaseCacheTime(long j) {
        this.baseCacheTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setBizParams(JSONObject jSONObject) {
        this.bizParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setClientReqOffsetTime(long j) {
        this.clientReqOffsetTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setClientReqTime(long j) {
        this.clientReqTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setDeltaCacheTime(long j) {
        this.deltaCacheTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setDeltaSections(List<String> list) {
        this.deltaSections = list;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setPassParams(JSONObject jSONObject) {
        this.passParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setRealBaseCacheTime(long j) {
        this.realBaseCacheTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setRequestType(String str) {
        this.requestType = str;
    }

    public void setPageParams(AwesomeGetPageData awesomeGetPageData) {
        this.pageParams = awesomeGetPageData;
    }
}
