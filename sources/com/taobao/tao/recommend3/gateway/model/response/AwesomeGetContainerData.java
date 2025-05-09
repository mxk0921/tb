package com.taobao.tao.recommend3.gateway.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.bqa;
import tb.kmn;
import tb.t2o;
import tb.t5a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetContainerData implements Serializable, IMTOPDataObject, IContainerDataModel<SectionModel> {
    private static final String TAG = "AwesomeGetContainerData";
    public AwesomeGetContainerInnerData base;
    public String containerId;
    public AwesomeGetContainerInnerData delta;
    public JSONObject parentExt;
    public String requestType;
    public int r4uAnchor = Integer.MAX_VALUE;
    public List<SectionModel> totalSectionList = new ArrayList();

    static {
        t2o.a(729809699);
        t2o.a(589299906);
        t2o.a(488636513);
    }

    private boolean isCacheTimeout(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.cacheTime + awesomeGetContainerInnerData.expTimeInterval <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void abandonData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.cacheTime = 0L;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerInnerData2.cacheTime = 0L;
        }
    }

    public List<SectionModel> getBaseData() {
        List<SectionModel> list;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (list = awesomeGetContainerInnerData.sections) == null || list.isEmpty()) {
            return null;
        }
        return this.base.sections;
    }

    public JSONObject getBaseRemind() {
        JSONObject jSONObject;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (jSONObject = awesomeGetContainerInnerData.remindSection) == null) {
            return null;
        }
        return jSONObject;
    }

    public JSONObject getClientCache() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.clientCache;
    }

    public JSONObject getClientCacheDelta() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.clientCache;
    }

    public List<SectionModel> getDeltaData() {
        List<SectionModel> list;
        try {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
            if (!(awesomeGetContainerInnerData == null || (list = awesomeGetContainerInnerData.sections) == null || list.isEmpty())) {
                return this.delta.sections;
            }
            return null;
        } catch (Throwable th) {
            bqa.d(TAG, th.getMessage());
            return null;
        }
    }

    public JSONObject getDeltaExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.ext;
    }

    public JSONObject getExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.ext;
    }

    public JSONObject getInsertParam() {
        JSONObject ext = getExt();
        if (ext == null) {
            return null;
        }
        return ext.getJSONObject("insertExpParams");
    }

    public List<SectionModel> getInsertSections() {
        List<SectionModel> list;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (list = awesomeGetContainerInnerData.insertSections) == null) {
            return null;
        }
        return list;
    }

    public int getPageNum() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return 0;
        }
        return awesomeGetPageData.pageNum;
    }

    public AwesomeGetPageData getPageParams() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return null;
        }
        return awesomeGetPageData;
    }

    public JSONObject getParentExt() {
        JSONObject jSONObject = this.parentExt;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public JSONObject getPassParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.passParams;
    }

    public int getR4uAnchor() {
        return this.r4uAnchor;
    }

    public JSONObject getRangerParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.rangerParams;
    }

    public int getRequestInAdvanceNum() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return 10;
        }
        return awesomeGetPageData.requestInAdvance;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public List<SectionModel> getTotalData() {
        if (this.totalSectionList == null) {
            this.totalSectionList = new ArrayList();
        }
        return this.totalSectionList;
    }

    public JSONObject getVersionInfo() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.versionInfo;
    }

    public boolean isBaseAbandoned() {
        return isCacheTimeout(this.base);
    }

    public boolean isDeltaAbandoned() {
        return isCacheTimeout(this.delta);
    }

    public boolean isEmpty() {
        return getTotalData().isEmpty();
    }

    public synchronized boolean isEmptySync() {
        return getTotalData().isEmpty();
    }

    public boolean isLastPage() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return true;
        }
        return t5a.b(awesomeGetPageData.isLastPage);
    }

    public synchronized void setBaseSync(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.base = awesomeGetContainerInnerData;
    }

    public synchronized void setTotalSectionListSync(List<SectionModel> list) {
        this.totalSectionList = list;
    }

    public boolean supportInsertSections() {
        if (this.base == null) {
            return false;
        }
        JSONObject insertParam = getInsertParam();
        List<SectionModel> list = this.base.insertSections;
        return list != null && !list.isEmpty() && insertParam != null && !insertParam.getBooleanValue("hasInsert");
    }

    public String toString() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData != null && this.base != null) {
            return "[delta,base]";
        }
        if (awesomeGetContainerInnerData != null) {
            return "[delta]";
        }
        if (this.base != null) {
            return "[base]";
        }
        return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateBaseSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.sections = list;
            this.totalSectionList = kmn.n(this.containerId, this, this);
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateDeltaSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.sections = list;
            this.totalSectionList = kmn.n(this.containerId, this, this);
        }
    }

    public AwesomeGetContainerData clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerData.base = awesomeGetContainerInnerData.clone();
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerData.delta = awesomeGetContainerInnerData2.clone();
        }
        return awesomeGetContainerData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public IContainerInnerDataModel<SectionModel> getBase() {
        return this.base;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public IContainerInnerDataModel<SectionModel> getDelta() {
        return this.delta;
    }
}
