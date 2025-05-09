package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetData implements IBizDataModel<AwesomeGetContainerData>, IMTOPDataObject {
    private Map<String, AwesomeGetContainerData> containers;
    private JSONObject currentPageParams;
    private JSONObject currentUTParams;
    private JSONObject ext;
    private JSONObject globalUTParams;

    static {
        t2o.a(487587885);
        t2o.a(488636512);
        t2o.a(589299906);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public Map<String, AwesomeGetContainerData> getContainers() {
        return this.containers;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel, tb.c6d
    public JSONObject getCurrentPageParams() {
        return this.currentPageParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel, tb.c6d
    public JSONObject getCurrentUTParams() {
        return this.currentUTParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel, tb.c6d
    public JSONObject getExt() {
        return this.ext;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public JSONObject getGlobalUTParams() {
        return this.globalUTParams;
    }

    public void setContainers(Map<String, AwesomeGetContainerData> map) {
        this.containers = map;
    }

    public void setCurrentPageParams(JSONObject jSONObject) {
        this.currentPageParams = jSONObject;
    }

    public void setCurrentUTParams(JSONObject jSONObject) {
        this.currentUTParams = jSONObject;
    }

    public void setExt(JSONObject jSONObject) {
        this.ext = jSONObject;
    }

    public void setGlobalUTParams(JSONObject jSONObject) {
        this.globalUTParams = jSONObject;
    }

    public AwesomeGetData clone() {
        AwesomeGetData awesomeGetData = new AwesomeGetData();
        awesomeGetData.currentPageParams = this.currentPageParams;
        awesomeGetData.currentUTParams = this.currentUTParams;
        awesomeGetData.globalUTParams = this.globalUTParams;
        awesomeGetData.ext = this.ext;
        HashMap hashMap = new HashMap(this.containers.size());
        for (String str : this.containers.keySet()) {
            hashMap.put(str, this.containers.get(str).clone());
        }
        awesomeGetData.containers = hashMap;
        return awesomeGetData;
    }
}
