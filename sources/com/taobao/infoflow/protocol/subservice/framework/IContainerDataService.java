package com.taobao.infoflow.protocol.subservice.framework;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.c6d;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IContainerDataService<DATA extends IContainerDataModel> extends ISubService {
    public static final String SERVICE_NAME = "DataService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface Event {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void j(w1e w1eVar);

        void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel);

        void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onPrefetch(String str, HashMap<String, String> hashMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str);

        void b(w1e w1eVar, String str, String str2, String str3);

        void c(w1e w1eVar, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void a(String str, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        Map<String, String> a(w1e w1eVar, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface f {
        Map<String, String> a(w1e w1eVar, String str);
    }

    void addDataProcessListener(a aVar);

    void addMTopPreRequestListener(b bVar);

    void addRequestBizParamsCreator(e eVar);

    void addRequestCommonBizParamsCreator(f fVar);

    void addRequestListener(c cVar);

    void addTriggerEventListener(d dVar);

    BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject);

    DATA getContainerData();

    c6d getPageInfo();

    void removeDataProcessListener(a aVar);

    void removeMTopPreRequestListener(b bVar);

    void removeRequestBizParamsCreator(e eVar);

    void removeRequestCommonBizParamsCreator(f fVar);

    void removeRequestListener(c cVar);

    void removeTriggerEventListener(d dVar);

    boolean triggerEvent(String str, JSONObject jSONObject);

    boolean triggerEvent(String str, JSONObject jSONObject, w1e w1eVar);
}
