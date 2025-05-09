package com.alibaba.triver.cannal_engine;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITRWidgetInstance extends Proxiable {
    void destroy();

    App getApp();

    View getRootView();

    JSONObject getWidgetMonitor();

    TRWidgetInstance.j getWidgetState();

    void onAttach(JSONObject jSONObject);

    void onDetach(JSONObject jSONObject);

    void onVisibilityChanged(int i);

    void pause();

    void registerWidgetExceptionListener(TRWidgetInstance.e eVar);

    void registerWidgetInitListener(TRWidgetInstance.f fVar);

    void registerWidgetJSLogListener(TRWidgetInstance.g gVar);

    void registerWidgetMonitorListener(TRWidgetInstance.h hVar);

    void registerWidgetRenderListener(TRWidgetInstance.i iVar);

    void render(WidgetStartParams widgetStartParams);

    void render(WidgetStartParams widgetStartParams, TRWidgetInstance.c cVar);

    void resume();

    void setFragment(Fragment fragment);

    void setRootContainer(WidgetRenderContainer widgetRenderContainer);

    void stop();

    void updateSize(int i, int i2);

    void updateSize(JSONObject jSONObject);
}
