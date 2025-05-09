package com.taobao.android.weex_framework;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.Map;
import tb.ade;
import tb.dde;
import tb.kq2;
import tb.l5x;
import tb.npc;
import tb.pce;
import tb.pvh;
import tb.rvh;
import tb.w6a;
import tb.xid;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_framework.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0518a {
        void onNativeEvent(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void onNativeStateChange(String str, String str2);
    }

    void addEventListener(String str, pvh pvhVar);

    void addInstanceEnv(String str, String str2);

    boolean canGoBack();

    void destroy();

    void dispatchEvent(MUSEventTarget mUSEventTarget, String str, JSONObject jSONObject);

    @Deprecated
    void dispatchEvent(String str, MUSValue mUSValue);

    void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException;

    void execute(MUSValue[] mUSValueArr);

    @Deprecated
    void fireEvent(int i, String str, JSONObject jSONObject);

    void fireEventOnNode(int i, String str, JSONObject jSONObject);

    void fireNativeEvent(String str, String str2);

    rvh getContext();

    Object getExecuteContext();

    int getInstanceId();

    Map<String, Object> getInstanceTags();

    c getMonitorInfo();

    String getNativeState(String str);

    double getPerformance(int i);

    xid getRenderComponent();

    View getRenderRoot();

    View getRenderView();

    int getRootHeight();

    int getRootWidth();

    Object getTag(String str);

    Context getUIContext();

    void goBack();

    void initWithData(byte[] bArr, Uri uri);

    void initWithURL(Uri uri);

    boolean isDestroyed();

    boolean isInvalid();

    boolean isRenderCalled();

    boolean isUIReady();

    void offScreenRendering();

    void onActivityPause();

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    void onScreenRendering();

    void onViewAppear();

    void prepare(byte[] bArr, Map<String, Object> map);

    void refresh(JSONObject jSONObject, Map<String, Object> map);

    void register(JSONArray jSONArray, String str);

    void registerNativeEventCallback(String str, AbstractC0518a aVar);

    void registerRenderListener(npc npcVar);

    void registerReportInfoListener(ade adeVar);

    void removeEventListener(String str);

    void removeRenderListener();

    void render(JSONObject jSONObject, Map<String, Object> map);

    void renderByUrl(String str, String str2, JSONObject jSONObject, Map<String, Object> map);

    void resetContext(Context context);

    void scrollToDecelerate(int i);

    void sendInstanceMessage(String str, JSONObject jSONObject);

    void sendInstanceMessage(String str, String str2, JSONObject jSONObject);

    void setConstrainedSize(kq2 kq2Var);

    void setExecuteContext(Object obj);

    void setGestureConsumptionView(View view);

    void setGestureEventListener(pce pceVar);

    @Deprecated
    void setGestureStateListener(w6a w6aVar);

    void setMonitorDetailDims(String str, String str2);

    void setMonitorDetailTime(String str, long j);

    void setScrollEnabled(boolean z);

    void setTag(String str, Object obj);

    void setWeexScrollListener(dde ddeVar);

    void updateBaseFontSize(float f);

    void updateNativeState(String str, String str2);

    void updateViewport();
}
