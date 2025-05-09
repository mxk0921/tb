package com.taobao.infoflow.protocol.subservice.base;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IJsBridgeService extends ISubService {
    public static final String SERVICE_NAME = "JsBridgeService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {

        /* compiled from: Taobao */
        /* renamed from: com.taobao.infoflow.protocol.subservice.base.IJsBridgeService$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public interface AbstractC0565a {
            void a(Map<String, Object> map);

            void error(String str);
        }

        String a();

        void b(JSONObject jSONObject, AbstractC0565a aVar);
    }

    void registerJsNativeFeature(a aVar);

    void unRegisterJsNativeFeature(a aVar);
}
