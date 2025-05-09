package com.taobao.gateway.executor.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.a3b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetContainerData implements Serializable, IMTOPDataObject {
    public AwesomeGetContainerInnerData base;
    public AwesomeGetContainerInnerData delta;
    public List<SectionModel> totalSectionList = new ArrayList();

    static {
        t2o.a(729808925);
        t2o.a(589299906);
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
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null || (list = awesomeGetContainerInnerData.sections) == null || list.isEmpty()) {
            return null;
        }
        return this.delta.sections;
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

    public int getPageNum() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return 0;
        }
        return awesomeGetPageData.pageNum;
    }

    public JSONObject getPassParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.passParams;
    }

    public JSONObject getRangerParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.rangerParams;
    }

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

    public boolean isLastPage() {
        AwesomeGetPageData awesomeGetPageData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || (awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null) {
            return true;
        }
        return a3b.o(awesomeGetPageData.isLastPage);
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

    public AwesomeGetContainerData clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        awesomeGetContainerData.base = this.base.clone();
        awesomeGetContainerData.delta = this.delta.clone();
        return awesomeGetContainerData;
    }
}
