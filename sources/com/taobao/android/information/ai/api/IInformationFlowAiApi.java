package com.taobao.android.information.ai.api;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.List;
import java.util.Map;
import tb.cfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IInformationFlowAiApi {
    void clearAiCache(String str);

    void create(cfc cfcVar);

    JSONObject createAiRefreshRequestParams(String str, String str2, Map<String, Object> map);

    List<BaseSectionModel<?>> getAiCacheCards(String str);

    void onDataProcess(IContainerDataModel<?> iContainerDataModel);

    void onDataProcessFinish();

    void onDataProcessStart();

    void onDestroy();

    void onRequestParamProcess(Map<String, String> map);
}
