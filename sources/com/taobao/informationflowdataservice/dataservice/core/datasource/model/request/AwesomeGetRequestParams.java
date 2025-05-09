package com.taobao.informationflowdataservice.dataservice.core.datasource.model.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetRequestParams implements IRequestParams<AwesomeGetContainerParams>, IMTOPDataObject {
    private String acookie;
    private String address;
    private String areaCode;
    private String areaName;
    private String cityCode;
    private String cityName;
    private String commonBizParams;
    private String countryCode;
    private String countryName;
    private String edition;
    private String encryptUserId;
    private String latitude;
    private String longitude;
    private String nick;
    private long poiRefreshTime;
    private String previewParam;
    private String provinceCode;
    private String provinceName;
    private JSONObject switchVersionRequest;
    private String townName;
    private String userId;
    private String utdid;
    public String API_NAME = "mtop.taobao.wireless.home.awesome.get";
    public String VERSION = "1.0";
    public final boolean NEED_ECODE = false;
    public final boolean NEED_SESSION = true;
    private String gatewayVersion = "2.0";
    private Map<String, AwesomeGetContainerParams> containerParams = new HashMap(4);
    private boolean tryRequest = false;

    static {
        t2o.a(487587882);
        t2o.a(488636509);
        t2o.a(589299906);
    }

    public String getAcookie() {
        return this.acookie;
    }

    public String getAddress() {
        return this.address;
    }

    public String getApiName() {
        return this.API_NAME;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCommonBizParams() {
        return this.commonBizParams;
    }

    public Map<String, AwesomeGetContainerParams> getContainerParams() {
        return this.containerParams;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getEdition() {
        return this.edition;
    }

    public String getEncryptUserId() {
        return this.encryptUserId;
    }

    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getNick() {
        return this.nick;
    }

    public long getPoiRefreshTime() {
        return this.poiRefreshTime;
    }

    public String getPreviewParam() {
        return this.previewParam;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public JSONObject getSwitchVersionRequest() {
        return this.switchVersionRequest;
    }

    public String getTownName() {
        return this.townName;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUtdid() {
        return this.utdid;
    }

    public String getVersion() {
        return this.VERSION;
    }

    public boolean isTryRequest() {
        return this.tryRequest;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAcookie(String str) {
        this.acookie = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAddress(String str) {
        this.address = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setApiName(String str) {
        this.API_NAME = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAreaCode(String str) {
        this.areaCode = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAreaName(String str) {
        this.areaName = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCityCode(String str) {
        this.cityCode = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCommonBizParams(String str) {
        this.commonBizParams = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setContainerParams(Map<String, AwesomeGetContainerParams> map) {
        this.containerParams = this.containerParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCountryName(String str) {
        this.countryName = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setEdition(String str) {
        this.edition = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setEncryptUserId(String str) {
        this.encryptUserId = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setGatewayVersion(String str) {
        this.gatewayVersion = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setLatitude(String str) {
        this.latitude = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setLongitude(String str) {
        this.longitude = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setNick(String str) {
        this.nick = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setPoiRefreshTime(long j) {
        this.poiRefreshTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setPreviewParam(String str) {
        this.previewParam = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setProvinceCode(String str) {
        this.provinceCode = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setProvinceName(String str) {
        this.provinceName = str;
    }

    public void setSwitchVersionRequest(JSONObject jSONObject) {
        this.switchVersionRequest = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setTownName(String str) {
        this.townName = str;
    }

    public void setTryRequest(boolean z) {
        this.tryRequest = z;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setUserId(String str) {
        this.userId = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setUtdid(String str) {
        this.utdid = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setVersion(String str) {
        this.VERSION = str;
    }
}
