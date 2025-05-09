package com.taobao.android.fluid.framework.preload.weex;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.core.FluidService;
import java.util.List;
import tb.ntm;
import tb.pvh;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPreloadWeexService extends FluidService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(com.taobao.android.weex_framework.a aVar, List<vrp> list);
    }

    void createWeexInstance(Context context, com.taobao.android.fluid.framework.data.datamodel.a aVar);

    void detachWeexInstance();

    boolean getWeexInstance(String str, String str2, a aVar);

    void handleMessage(JSONObject jSONObject, pvh pvhVar);

    boolean isPreloadWeexInstanceEnabled();

    void startRender(Context context, ViewGroup viewGroup, ntm ntmVar);
}
