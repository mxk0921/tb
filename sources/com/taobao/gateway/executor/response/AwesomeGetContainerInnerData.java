package com.taobao.gateway.executor.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetContainerInnerData implements IMTOPDataObject, Serializable {
    public long cacheTime;
    public JSONObject clientCache;
    public long dataCacheTime;
    public boolean dataChange = true;
    public String dataType;
    public long expTimeInterval;
    public JSONObject ext;
    public String pageName;
    public AwesomeGetPageData pageParams;
    public JSONObject passParams;
    public JSONObject rangerParams;
    public JSONObject remindSection;
    public List<SectionModel> sections;
    public JSONObject splashSection;
    public JSONObject stayTimeParams;
    public JSONObject versionInfo;

    static {
        t2o.a(729808926);
        t2o.a(589299906);
    }

    public AwesomeGetContainerInnerData clone() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = new AwesomeGetContainerInnerData();
        awesomeGetContainerInnerData.cacheTime = this.cacheTime;
        awesomeGetContainerInnerData.dataType = this.dataType;
        awesomeGetContainerInnerData.expTimeInterval = this.expTimeInterval;
        awesomeGetContainerInnerData.dataChange = this.dataChange;
        awesomeGetContainerInnerData.sections = new ArrayList(this.sections);
        awesomeGetContainerInnerData.ext = this.ext;
        awesomeGetContainerInnerData.rangerParams = this.rangerParams;
        awesomeGetContainerInnerData.passParams = this.passParams;
        awesomeGetContainerInnerData.stayTimeParams = this.stayTimeParams;
        awesomeGetContainerInnerData.remindSection = this.remindSection;
        awesomeGetContainerInnerData.splashSection = this.splashSection;
        awesomeGetContainerInnerData.versionInfo = this.versionInfo;
        return awesomeGetContainerInnerData;
    }
}
