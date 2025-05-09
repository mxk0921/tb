package com.taobao.tao.recommend3.gateway.model.response;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubSectionModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.yyj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetData implements IMTOPDataObject, Serializable, IBizDataModel<AwesomeGetContainerData> {
    public Map<String, AwesomeGetContainerData> containers;
    public JSONObject currentPageParams;
    public JSONObject currentUTParams;
    public JSONObject ext;
    public SecondExtraParamsData extraParams;
    public JSONObject globalUTParams;
    public boolean isFirstReturn = false;
    public boolean isSecondReturn = false;
    public SecondRenderData renderParams;

    static {
        t2o.a(729809701);
        t2o.a(589299906);
        t2o.a(488636512);
    }

    public static <T> T getTFromJsonObj(JSONObject jSONObject, Class<T> cls, String... strArr) {
        T t = null;
        if (jSONObject == null) {
            return null;
        }
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (i != strArr.length - 1) {
                    jSONObject = jSONObject.getJSONObject(strArr[i]);
                    if (jSONObject == null) {
                        break;
                    }
                } else if (cls == String.class) {
                    t = (T) jSONObject.getString(strArr[i]);
                } else if (cls == JSONObject.class) {
                    t = (T) jSONObject.getJSONObject(strArr[i]);
                }
            }
        }
        return t;
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

    /* JADX WARN: Type inference failed for: r1v17, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    public void mergeSecondReturnData(AwesomeGetData awesomeGetData) {
        int i;
        if (!(awesomeGetData == null || awesomeGetData.containers == null)) {
            HashMap hashMap = new HashMap(awesomeGetData.containers.size());
            for (String str : awesomeGetData.containers.keySet()) {
                hashMap.put(str, awesomeGetData.containers.get(str).clone());
            }
            this.containers = hashMap;
        }
        this.currentPageParams = awesomeGetData.currentPageParams;
        this.currentUTParams = awesomeGetData.currentUTParams;
        this.globalUTParams = awesomeGetData.globalUTParams;
        this.ext = awesomeGetData.ext;
        Map<String, AwesomeGetContainerData> map = this.containers;
        if (map != null) {
            AwesomeGetContainerData awesomeGetContainerData = map.get(yyj.l().f32522a);
            if (!(awesomeGetContainerData == null || awesomeGetContainerData.getBase() == null)) {
                if (this.extraParams != null) {
                    awesomeGetContainerData.getBase().passParams = this.extraParams.getSubPassParam();
                    if (awesomeGetContainerData.getBase().getExt() != null) {
                        awesomeGetContainerData.getBase().getExt().put("updatePassParams", (Object) this.extraParams.getSubUpdatePassParams());
                    }
                    if (awesomeGetContainerData.getBase().getPageParams() != null) {
                        awesomeGetContainerData.getBase().getPageParams().requestInAdvance = this.extraParams.getRequestInAdvance();
                    }
                }
                if (!(this.extraParams == null || this.renderParams == null || awesomeGetContainerData.getBase() == null || awesomeGetContainerData.getBase().sections == null)) {
                    JSONObject overlaysMap = this.extraParams.getOverlaysMap();
                    handleOverlayMap(awesomeGetContainerData.getBase().sections, overlaysMap);
                    if (this.renderParams.getSections() != null) {
                        handleOverlayMap(this.renderParams.getSections(), overlaysMap);
                        if (awesomeGetContainerData.getBase().getPageParams() != null && awesomeGetContainerData.getBase().getPageParams().pageNum == 0) {
                            awesomeGetContainerData.getBase().sections.addAll(this.renderParams.getSections());
                        }
                    }
                }
                if (awesomeGetContainerData.getPageParams() != null && ((i = awesomeGetContainerData.getPageParams().requestInAdvance) < 0 || i > 10)) {
                    awesomeGetContainerData.getPageParams().firstRequestInAdvance = -1;
                    awesomeGetContainerData.getBase().initCacheRequestInAdvance();
                }
            }
            AwesomeGetContainerData awesomeGetContainerData2 = this.containers.get(yyj.e().f());
            if (!(awesomeGetContainerData2 == null || awesomeGetContainerData2.getBase() == null || this.extraParams == null)) {
                if (awesomeGetContainerData2.getBase().getExt() != null) {
                    awesomeGetContainerData2.getBase().getExt().put("updatePassParams", (Object) this.extraParams.getMainUpdatePassParams());
                }
                awesomeGetContainerData2.getBase().passParams = this.extraParams.getMainPassParam();
            }
        }
    }

    private void handleOverlayMap(List<SectionModel> list, JSONObject jSONObject) {
        if (!(list == null || jSONObject == null || list.isEmpty() || jSONObject.isEmpty())) {
            for (SectionModel sectionModel : list) {
                String string = sectionModel.containsKey("index") ? sectionModel.getString("index") : null;
                if (!TextUtils.isEmpty(string)) {
                    SubSectionModel subSection = sectionModel.getSubSection();
                    if (subSection == null) {
                        subSection = new SubSectionModel(new JSONObject(1));
                        sectionModel.put("subSection", (Object) subSection);
                    }
                    subSection.put("overlay", (Object) jSONObject.getJSONObject(string));
                }
            }
        }
    }
}
