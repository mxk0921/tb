package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetContainerInnerData implements IContainerInnerDataModel<SectionModel>, IMTOPDataObject {
    private long cacheTime;
    private JSONObject clientCache;
    private long dataCacheTime;
    private String dataType;
    private long expTimeInterval;
    private String expireType;
    private JSONObject ext;
    private JSONObject extSections;
    private JSONObject floatLayerSection;
    private List<JSONObject> homePagePopDatas;
    private String pageName;
    private AwesomeGetPageData pageParams;
    private JSONObject passParams;
    private JSONObject rangerParams;
    private JSONObject remindSection;
    private List<SectionModel> sections;
    private JSONObject stayTimeParams;
    private JSONObject topViewSplashSection;
    private JSONObject versionInfo;
    private boolean dataChange = true;
    private boolean isRemote = true;

    static {
        t2o.a(487587884);
        t2o.a(488636514);
        t2o.a(589299906);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public void abandonData(String str) {
        setCacheTime(0L);
        setExpireType(str);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getCacheTime() {
        return this.cacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getClientCache() {
        return this.clientCache;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getDataCacheTime() {
        return this.dataCacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getDataType() {
        return this.dataType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getExpTimeInterval() {
        return this.expTimeInterval;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getExpireType() {
        return this.expireType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getExt() {
        return this.ext;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getExtSections() {
        return this.extSections;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getFloatLayerSection() {
        return this.floatLayerSection;
    }

    public List<JSONObject> getHomePagePopDatas() {
        return this.homePagePopDatas;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getPageName() {
        return this.pageName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getPassParams() {
        return this.passParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<JSONObject> getPopData() {
        return this.homePagePopDatas;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRangerParams() {
        return this.rangerParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRemindSection() {
        return this.remindSection;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<SectionModel> getSections() {
        return this.sections;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getStayTimeParams() {
        return this.stayTimeParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getTopViewSplashSection() {
        return this.topViewSplashSection;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getVersionInfo() {
        return this.versionInfo;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isAbandoned() {
        if (getCacheTime() + getExpTimeInterval() <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isDataChange() {
        return this.dataChange;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isRemote() {
        return this.isRemote;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public void setClientCache(JSONObject jSONObject) {
        this.clientCache = jSONObject;
    }

    public void setDataCacheTime(long j) {
        this.dataCacheTime = j;
    }

    public void setDataChange(boolean z) {
        this.dataChange = z;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setExpTimeInterval(long j) {
        this.expTimeInterval = j;
    }

    public void setExpireType(String str) {
        this.expireType = str;
    }

    public void setExt(JSONObject jSONObject) {
        this.ext = jSONObject;
    }

    public void setFloatLayerSection(JSONObject jSONObject) {
        this.floatLayerSection = jSONObject;
    }

    public void setHomePagePopDatas(List<JSONObject> list) {
        this.homePagePopDatas = list;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public void setPageParams(AwesomeGetPageData awesomeGetPageData) {
        this.pageParams = awesomeGetPageData;
    }

    public void setPassParams(JSONObject jSONObject) {
        this.passParams = jSONObject;
    }

    public void setRangerParams(JSONObject jSONObject) {
        this.rangerParams = jSONObject;
    }

    public void setRemindSection(JSONObject jSONObject) {
        this.remindSection = jSONObject;
    }

    public void setRemote(boolean z) {
        this.isRemote = z;
    }

    public void setSections(List<SectionModel> list) {
        this.sections = list;
    }

    public void setStayTimeParams(JSONObject jSONObject) {
        this.stayTimeParams = jSONObject;
    }

    public void setTopViewSplashSection(JSONObject jSONObject) {
        this.topViewSplashSection = jSONObject;
    }

    public void setVersionInfo(JSONObject jSONObject) {
        this.versionInfo = jSONObject;
    }

    public AwesomeGetContainerInnerData clone() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = new AwesomeGetContainerInnerData();
        awesomeGetContainerInnerData.cacheTime = this.cacheTime;
        awesomeGetContainerInnerData.clientCache = this.clientCache;
        awesomeGetContainerInnerData.dataType = this.dataType;
        awesomeGetContainerInnerData.expTimeInterval = this.expTimeInterval;
        awesomeGetContainerInnerData.dataChange = this.dataChange;
        JSONObject jSONObject = null;
        awesomeGetContainerInnerData.sections = this.sections == null ? null : new ArrayList(this.sections);
        awesomeGetContainerInnerData.ext = this.ext;
        awesomeGetContainerInnerData.rangerParams = this.rangerParams;
        awesomeGetContainerInnerData.passParams = this.passParams;
        awesomeGetContainerInnerData.pageParams = this.pageParams.clone();
        awesomeGetContainerInnerData.stayTimeParams = this.stayTimeParams;
        awesomeGetContainerInnerData.expireType = this.expireType;
        awesomeGetContainerInnerData.clientCache = this.clientCache;
        awesomeGetContainerInnerData.remindSection = this.remindSection;
        awesomeGetContainerInnerData.versionInfo = this.versionInfo;
        awesomeGetContainerInnerData.topViewSplashSection = this.topViewSplashSection;
        if (this.floatLayerSection != null) {
            jSONObject = new JSONObject(this.floatLayerSection);
        }
        awesomeGetContainerInnerData.floatLayerSection = jSONObject;
        awesomeGetContainerInnerData.homePagePopDatas = this.homePagePopDatas;
        awesomeGetContainerInnerData.extSections = this.extSections;
        return awesomeGetContainerInnerData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public AwesomeGetPageData getPageParams() {
        return this.pageParams;
    }
}
