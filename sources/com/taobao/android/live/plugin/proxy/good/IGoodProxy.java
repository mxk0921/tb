package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.b2e;
import tb.beb;
import tb.mac;
import tb.nac;
import tb.qyc;
import tb.s9z;
import tb.stk;
import tb.tac;
import tb.ux9;
import tb.wbc;
import tb.yac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IGoodProxy extends IProxy {
    public static final String KEY = "GoodProxy";

    @Deprecated
    void activityDestroy();

    s9z createAtmosphere(Context context, ux9 ux9Var, ViewGroup viewGroup);

    BaseFrame createBigCardKandianFrame(Activity activity, ux9 ux9Var, LiveItem liveItem, FrameLayout frameLayout);

    DXRootView createDX(Context context, String str);

    mac createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var);

    mac createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var);

    Object createUltronInstanceAndInitServerConfig(Context context);

    void destroy(Object obj);

    void destroyDXManger();

    void follow(stk stkVar, String str);

    beb getActionAdapter();

    String getCurrentAnchorId();

    DinamicXEngine getDynamicXEngine();

    boolean getFollowState();

    Object getGLConfig(ux9 ux9Var, String str);

    tac getGoodHandlerProxy();

    String getItemListXEageleeyeId();

    HashMap<String, String> getLastClickItemInfo(yac yacVar);

    b2e getTrackAdapter();

    @Deprecated
    void initUltronServerConfig(Context context);

    boolean isListShow(yac yacVar);

    boolean isMultiStateSecKill(LiveItem liveItem);

    Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z);

    void preloadLVContainers(Context context);

    void registShowcaseFrame();

    void renderDX(DXRootView dXRootView, JSONObject jSONObject);

    void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions);

    void setActionAdapter(beb bebVar);

    void setGoodFrameAdapter(nac nacVar);

    void setH5TabFrameAdapter(wbc wbcVar);

    void setListCacheData(yac yacVar, String str, String str2);

    void setNavAdapter(qyc qycVar);

    void setTemplateString(String str);

    void setTrackAdapter(b2e b2eVar);
}
