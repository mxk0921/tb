package com.taobao.infoflow.protocol.engine.invoke.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ITopViewService extends ISubService {
    public static final String SERVICE_NAME = "TopViewService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a();

        void b(String str);
    }

    void addTopViewShowListener(a aVar);

    boolean expendTopViewRecord();

    JSONObject getSubTabSearchBarData();

    void removeTopViewShowListener(a aVar);
}
