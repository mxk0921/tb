package com.taobao.infoflow.protocol.model.datamodel.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.io.Serializable;
import java.util.Map;
import tb.c6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IBizDataModel<CDM extends IContainerDataModel> extends Serializable, c6d {
    Map<String, CDM> getContainers();

    @Override // tb.c6d
    /* synthetic */ JSONObject getCurrentPageParams();

    @Override // tb.c6d
    /* synthetic */ JSONObject getCurrentUTParams();

    @Override // tb.c6d
    JSONObject getExt();

    /* synthetic */ JSONObject getGlobalUTParams();
}
