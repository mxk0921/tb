package com.taobao.android.ai.api;

import androidx.recyclerview.widget.RecyclerView;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend4.manager.a;
import java.util.Map;
import tb.cmn;
import tb.imn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAfterBuyAiApi {
    void addAISolutionBizParam(String str, Map<String, Object> map);

    void aiRefreshInsert(String str, RecyclerView recyclerView);

    void checkConfig();

    void clearBufferList();

    void clearMemoryBufferList(String str);

    void init(a aVar, imn imnVar);

    void initDiskBufferListToMemory(boolean z, String str, cmn.c cVar);

    void preloadModel(String str, AwesomeGetContainerData awesomeGetContainerData);

    void registerBehavirSolution();

    void resetAiRefreshDeltaData(String str);

    void unRegisterBehavirSolution();

    void updateContainer();

    void updateContainerType();
}
