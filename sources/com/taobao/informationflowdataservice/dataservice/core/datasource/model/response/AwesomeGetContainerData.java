package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.jtv;
import tb.t2o;
import tb.ugh;
import tb.xli;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetContainerData implements IContainerDataModel<SectionModel>, IMTOPDataObject {
    public static final String FLAG_CACHE = "1";
    private static final String TAG = "AwesomeGetContainerData";
    private AwesomeGetContainerInnerData base;
    private String containerId;
    private AwesomeGetContainerInnerData delta;
    private boolean isContainsTab;
    private List<SectionModel> totalSectionList = new ArrayList();

    static {
        t2o.a(487587883);
        t2o.a(488636513);
        t2o.a(589299906);
    }

    private boolean isCacheTimeout(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getCacheTime() + awesomeGetContainerInnerData.getExpTimeInterval() <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void abandonData(String str) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.setCacheTime(0L);
            this.base.setExpireType(str);
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerInnerData2.setCacheTime(0L);
        }
    }

    public List<SectionModel> getBaseData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getSections() == null || this.base.getSections().isEmpty()) {
            return null;
        }
        return this.base.getSections();
    }

    public JSONObject getBaseRemind() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getRemindSection() == null) {
            return null;
        }
        return this.base.getRemindSection();
    }

    public JSONObject getClientCache() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getClientCache();
    }

    public JSONObject getClientCacheDelta() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getClientCache();
    }

    public String getContainerId() {
        return this.containerId;
    }

    public List<SectionModel> getDeltaData() {
        try {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
            if (!(awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getSections() == null || this.delta.getSections().isEmpty())) {
                return this.delta.getSections();
            }
            return null;
        } catch (Throwable th) {
            ugh.c(TAG, th.getMessage());
            return null;
        }
    }

    public JSONObject getDeltaExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getExt();
    }

    public JSONObject getExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getExt();
    }

    public int getPageNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getPageParams() == null) {
            return 0;
        }
        return this.base.getPageParams().getPageNum();
    }

    public AwesomeGetPageData getPageParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getPageParams() == null) {
            return null;
        }
        return this.base.getPageParams();
    }

    public JSONObject getPassParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getPassParams();
    }

    public JSONObject getRangerParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getRangerParams();
    }

    public int getRequestInAdvanceNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getPageParams() == null) {
            return 10;
        }
        return this.base.getPageParams().getRequestInAdvance();
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
        return awesomeGetContainerInnerData.getVersionInfo();
    }

    public boolean isBaseAbandoned() {
        return isCacheTimeout(this.base);
    }

    public boolean isBaseDataChange() {
        if (getBase() == null || !getBase().isDataChange()) {
            return false;
        }
        return true;
    }

    public boolean isContainsTab() {
        return this.isContainsTab;
    }

    public boolean isDeltaAbandoned() {
        return isCacheTimeout(this.delta);
    }

    public boolean isDeltaDataChange() {
        if (getDelta() == null || !getDelta().isDataChange()) {
            return false;
        }
        return true;
    }

    public boolean isLastPage() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getPageParams() == null) {
            return true;
        }
        return this.base.getPageParams().isLastPage();
    }

    public boolean isRemoteData() {
        JSONObject jSONObject;
        try {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
            if (!(awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getSections() == null || this.base.getSections().size() < 1 || (jSONObject = this.base.getSections().get(0).getJSONObject("args")) == null)) {
                if (!"1".equals(jSONObject.get(jtv.S_ARGS_IS_CLIENT_CACHE))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            ugh.c(TAG, "isRemoteData error : " + th.getMessage());
        }
        return false;
    }

    public void setBase(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.base = awesomeGetContainerInnerData;
    }

    public void setContainerId(String str) {
        this.containerId = str;
    }

    public void setContainsTab(boolean z) {
        this.isContainsTab = z;
    }

    public void setDelta(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.delta = awesomeGetContainerInnerData;
    }

    public void setTotalData(List<SectionModel> list) {
        this.totalSectionList = list;
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
            awesomeGetContainerInnerData.setSections(list);
            this.totalSectionList = new xli().l(null, this.containerId, this, this);
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateDeltaSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.setSections(list);
            this.totalSectionList = new xli().l(null, this.containerId, this, this);
        }
    }

    public AwesomeGetContainerData clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = null;
        awesomeGetContainerData.base = awesomeGetContainerInnerData == null ? null : awesomeGetContainerInnerData.clone();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData3 = this.delta;
        if (awesomeGetContainerInnerData3 != null) {
            awesomeGetContainerInnerData2 = awesomeGetContainerInnerData3.clone();
        }
        awesomeGetContainerData.delta = awesomeGetContainerInnerData2;
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
