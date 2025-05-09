package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.v7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IIconService extends ISubService {
    public static final String SERVICE_NAME = "IconService";

    void clearPopLayerData(String str);

    int getCurrentPageIndex();

    int getInitPageIndex();

    JSONObject getPopLayerData(String str);

    boolean isPassPopLayerDataAvailable(String str);

    void passPopLayerData(v7d v7dVar, String str);

    void setCurrentPageIndex(int i);

    void setSectionBizCode(String str);

    void syncInitPageIndex();
}
