package com.alibaba.triver.cannal_engine.widgetInfo;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetterImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface TRWidgetInfoGetter extends Proxiable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(String str, String str2, String str3);

        void onSuccess(JSONArray jSONArray);
    }

    void request(JSONObject jSONObject, a aVar);

    void request(JSONObject jSONObject, Boolean bool, a aVar);
}
