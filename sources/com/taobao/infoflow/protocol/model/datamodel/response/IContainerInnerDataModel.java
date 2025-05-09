package com.taobao.infoflow.protocol.model.datamodel.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IContainerInnerDataModel<M extends BaseSectionModel> extends Serializable {
    void abandonData(String str);

    long getCacheTime();

    JSONObject getClientCache();

    long getDataCacheTime();

    String getDataType();

    long getExpTimeInterval();

    String getExpireType();

    JSONObject getExt();

    JSONObject getExtSections();

    JSONObject getFloatLayerSection();

    String getPageName();

    IPageDataModel getPageParams();

    JSONObject getPassParams();

    List<JSONObject> getPopData();

    JSONObject getRangerParams();

    JSONObject getRemindSection();

    List<M> getSections();

    JSONObject getStayTimeParams();

    JSONObject getTopViewSplashSection();

    JSONObject getVersionInfo();

    boolean isAbandoned();

    boolean isDataChange();

    boolean isRemote();
}
