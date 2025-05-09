package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IFirstScreenDataService extends ISubService {
    public static final String SERVICE_NAME = "FirstScreenDataService";

    JSONObject getFirstScreenExt();

    int getRecStartIndex();

    JSONObject getTopViewSplashData();
}
