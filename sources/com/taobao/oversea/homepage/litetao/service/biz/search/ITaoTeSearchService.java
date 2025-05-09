package com.taobao.oversea.homepage.litetao.service.biz.search;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoTeSearchService extends ISubService {
    public static final String SERVICE_NAME = "TaoTeSearchService";

    JSONObject getSearchData();
}
