package com.taobao.android.weex_framework;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.android.weex_framework.ui.INode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ade;
import tb.apc;
import tb.dde;
import tb.dpc;
import tb.egb;
import tb.f9x;
import tb.fpc;
import tb.hpc;
import tb.kpc;
import tb.kq2;
import tb.l5x;
import tb.npc;
import tb.pce;
import tb.ppc;
import tb.pvh;
import tb.rvh;
import tb.t2o;
import tb.w6a;
import tb.xid;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class MUSDKInstance implements com.taobao.android.weex_framework.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AtomicInteger INSTANCE_ID_COUNTER = new AtomicInteger(0);
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String UNICORN_CONFIG_GROUP = "weexv2_option_abconfig";
    public static final String UNICORN_WHITE_SCREEN_CONFIG_GROUP = "unicorn_ws_pixel_threshold";
    private String tempTagName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(982516004);
        t2o.a(982516016);
    }

    @Override // com.taobao.android.weex_framework.a
    public abstract void addEventListener(String str, pvh pvhVar);

    public abstract void addGoBackEventCallback(Runnable runnable);

    @Override // com.taobao.android.weex_framework.a
    public abstract void addInstanceEnv(String str, String str2);

    public abstract void addModule(String str, MUSModule mUSModule);

    public void addPerformance(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d7f5f1", new Object[]{this, new Integer(i), new Double(d)});
        }
    }

    public abstract void addWeexStats(String str, long j);

    public abstract void beginUpdate();

    public abstract void bindRenderComponent(xid xidVar);

    public abstract MUSValue callModuleMethod(MUSValue mUSValue, MUSValue mUSValue2, MUSValue[] mUSValueArr);

    public abstract void callNativeUINode(int i, String str, MUSValue[] mUSValueArr);

    @Override // com.taobao.android.weex_framework.a
    public abstract boolean canGoBack();

    public abstract void clearGoBackEventCallbacks();

    public abstract void createAppContext();

    public abstract void debugHideInstIdTag();

    public abstract void debugShowInstIdTag();

    @Override // com.taobao.android.weex_framework.a
    public abstract void destroy();

    public abstract void dispatchDOMEvent(int i, String str, JSONObject jSONObject);

    @Override // com.taobao.android.weex_framework.a
    public abstract void dispatchEvent(MUSEventTarget mUSEventTarget, String str, JSONObject jSONObject);

    @Override // com.taobao.android.weex_framework.a
    public abstract void dispatchEvent(String str, MUSValue mUSValue);

    @Override // com.taobao.android.weex_framework.a
    public abstract void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException;

    public abstract void dumpEngine();

    public abstract boolean enabledPreRender();

    public abstract void endUpdate();

    public abstract void enqueueTask(Runnable runnable);

    public abstract void enqueueTaskToJS(Runnable runnable);

    @Override // com.taobao.android.weex_framework.a
    public abstract void execute(MUSValue[] mUSValueArr);

    public abstract void executeFail(int i, String str);

    public abstract void executeScript(byte[] bArr, String str);

    public abstract void executeScript(byte[] bArr, String str, String str2);

    public abstract void executeSuccess();

    public abstract INode findNodeById(int i);

    @Override // com.taobao.android.weex_framework.a
    public abstract void fireEvent(int i, String str, JSONObject jSONObject);

    @Override // com.taobao.android.weex_framework.a
    public abstract void fireEventOnNode(int i, String str, JSONObject jSONObject);

    public abstract void fireEventOnNode(int i, String str, JSONObject jSONObject, boolean z);

    public abstract void fireGlobalEvent(String str, Object... objArr);

    @Override // com.taobao.android.weex_framework.a
    public abstract void fireNativeEvent(String str, String str2);

    public abstract void forceBeginFrame();

    public abstract apc getActivityNav();

    public abstract egb getApmGenerator();

    @Override // com.taobao.android.weex_framework.a
    public abstract rvh getContext();

    public abstract int getCurrentPhase();

    @Override // com.taobao.android.weex_framework.a
    public abstract Object getExecuteContext();

    public abstract String getExtConfig(String str);

    public abstract Set<String> getExtConfigs();

    public abstract Map<String, Object> getExtEnv();

    public abstract hpc getImageAdapter();

    public abstract MUSInstanceConfig getInstanceConfig();

    public abstract String getInstanceEnv(String str);

    public abstract Map<String, String> getInstanceEnv();

    public abstract Set<String> getInstanceEnvs();

    @Override // com.taobao.android.weex_framework.a
    public abstract int getInstanceId();

    @Override // com.taobao.android.weex_framework.a
    public abstract Map<String, Object> getInstanceTags();

    public Map<String, Object> getJSBridgeEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("378ce8cb", new Object[]{this, str});
        }
        f9x.a(false);
        return null;
    }

    public String getJustCreateTagName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e27e6ef2", new Object[]{this});
        }
        return this.tempTagName;
    }

    public abstract MUSModule getModule(String str);

    public abstract MUSMonitor getMonitor();

    @Override // com.taobao.android.weex_framework.a
    public abstract c getMonitorInfo();

    public abstract long getNativePtr();

    @Override // com.taobao.android.weex_framework.a
    public abstract String getNativeState(String str);

    public abstract String getOriginURLString();

    @Override // com.taobao.android.weex_framework.a
    public abstract double getPerformance(int i);

    public abstract HashMap<String, String> getPerformanceInfo();

    @Override // com.taobao.android.weex_framework.a
    public abstract xid getRenderComponent();

    public abstract npc getRenderListener();

    public abstract ppc getRenderManager();

    @Override // com.taobao.android.weex_framework.a
    public abstract View getRenderRoot();

    @Override // com.taobao.android.weex_framework.a
    public abstract View getRenderView();

    @Override // com.taobao.android.weex_framework.a
    public abstract int getRootHeight();

    @Override // com.taobao.android.weex_framework.a
    public abstract int getRootWidth();

    public abstract float getRpxPerRem();

    @Override // com.taobao.android.weex_framework.a
    public abstract Object getTag(String str);

    public abstract Object getToken();

    @Override // com.taobao.android.weex_framework.a
    public abstract Context getUIContext();

    public abstract WMInstanceApm getWeexInstanceApm();

    public abstract fpc getWorkHandler();

    @Override // com.taobao.android.weex_framework.a
    public abstract void goBack();

    public abstract void init(Map<String, Object> map);

    @Override // com.taobao.android.weex_framework.a
    public abstract void initWithData(byte[] bArr, Uri uri);

    @Override // com.taobao.android.weex_framework.a
    public abstract void initWithURL(Uri uri);

    public abstract void inspect(String str);

    public abstract void invokeCallback(int i, MUSValue[] mUSValueArr, boolean z);

    public abstract void invokeCallbackSync(int i, MUSValue[] mUSValueArr, boolean z);

    @Override // com.taobao.android.weex_framework.a
    public abstract boolean isDestroyed();

    public abstract boolean isDisplayed();

    public abstract boolean isIncremental();

    @Override // com.taobao.android.weex_framework.a
    public abstract boolean isInvalid();

    public abstract boolean isNativeDestroyed();

    public abstract boolean isPreciseExpose();

    public abstract boolean isPrepared();

    @Override // com.taobao.android.weex_framework.a
    public abstract boolean isRenderCalled();

    @Override // com.taobao.android.weex_framework.a
    public abstract boolean isUIReady();

    public abstract boolean isUnicornRender();

    public abstract boolean isUseExternalHandler();

    public abstract boolean isWeexInstanceAdaptor();

    @Override // com.taobao.android.weex_framework.a
    public abstract void offScreenRendering();

    @Override // com.taobao.android.weex_framework.a
    public abstract void onActivityPause();

    @Override // com.taobao.android.weex_framework.a
    public abstract void onActivityResult(int i, int i2, Intent intent);

    @Override // com.taobao.android.weex_framework.a
    public abstract void onActivityResume();

    @Override // com.taobao.android.weex_framework.a
    public abstract void onActivityStart();

    @Override // com.taobao.android.weex_framework.a
    public abstract void onActivityStop();

    public abstract void onPreRendering(int i, int i2);

    @Override // com.taobao.android.weex_framework.a
    public abstract void onScreenRendering();

    @Override // com.taobao.android.weex_framework.a
    public abstract void onViewAppear();

    public abstract void onViewDisappear();

    public abstract void postTaskToJs(Runnable runnable);

    public abstract void postTaskToMain(Runnable runnable);

    public abstract void postTaskToMainDelay(Runnable runnable, long j);

    @Override // com.taobao.android.weex_framework.a
    public abstract void prepare(byte[] bArr, Map<String, Object> map);

    public abstract void prepareSuccess();

    @Override // com.taobao.android.weex_framework.a
    public abstract void refresh(JSONObject jSONObject, Map<String, Object> map);

    public abstract void refreshFail(int i, String str);

    public abstract void refreshPixelCheckTime();

    public abstract void refreshSuccess();

    @Override // com.taobao.android.weex_framework.a
    public abstract void register(JSONArray jSONArray, String str);

    public abstract void registerCSSRule(String str, JSONObject jSONObject);

    public abstract void registerExecuteListener(dpc dpcVar);

    public abstract void registerJSBindingPlugin(long j, String str);

    public abstract void registerJSPlugin(String str, String str2);

    @Override // com.taobao.android.weex_framework.a
    public abstract void registerNativeEventCallback(String str, a.AbstractC0518a aVar);

    public abstract void registerNativeStateListener(String str, a.b bVar);

    public abstract void registerRenderComponentListener(a aVar);

    @Override // com.taobao.android.weex_framework.a
    public abstract void registerRenderListener(npc npcVar);

    @Override // com.taobao.android.weex_framework.a
    public abstract void registerReportInfoListener(ade adeVar);

    public abstract void reload();

    public abstract void reloadSuccess();

    @Override // com.taobao.android.weex_framework.a
    public abstract void removeEventListener(String str);

    public abstract void removeNativeEventCallback(String str, a.AbstractC0518a aVar);

    @Override // com.taobao.android.weex_framework.a
    public abstract void removeRenderListener();

    public abstract void removeTaskFromMain(Runnable runnable);

    @Override // com.taobao.android.weex_framework.a
    public abstract void render(JSONObject jSONObject, Map<String, Object> map);

    @Override // com.taobao.android.weex_framework.a
    public abstract void renderByUrl(String str, String str2, JSONObject jSONObject, Map<String, Object> map);

    public abstract void renderFail(int i, String str);

    public abstract void renderSuccess();

    public abstract void reportErrorToExceptionManager(int i, String str, String str2, String str3);

    public abstract void reportFatalError(int i, String str);

    public abstract void reportJsException(int i, String str);

    @Override // com.taobao.android.weex_framework.a
    public abstract void resetContext(Context context);

    public abstract boolean resetCorePropsOnPreInit(kpc kpcVar, Context context);

    @Override // com.taobao.android.weex_framework.a
    public abstract void scrollToDecelerate(int i);

    @Override // com.taobao.android.weex_framework.a
    public abstract void sendInstanceMessage(String str, JSONObject jSONObject);

    @Override // com.taobao.android.weex_framework.a
    public abstract void sendInstanceMessage(String str, String str2, JSONObject jSONObject);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setConstrainedSize(kq2 kq2Var);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setExecuteContext(Object obj);

    public abstract void setExecuteContextInternal(Object obj);

    public abstract void setForceQuickJS(boolean z);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setGestureConsumptionView(View view);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setGestureEventListener(pce pceVar);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setGestureStateListener(w6a w6aVar);

    public abstract void setIgnoreWhiteScreenReport(boolean z);

    public void setJSBridgeEnv(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc573cbb", new Object[]{this, str, map});
        } else {
            f9x.a(false);
        }
    }

    public void setJustCreateTagName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ace772c", new Object[]{this, str});
        } else {
            this.tempTagName = str;
        }
    }

    @Override // com.taobao.android.weex_framework.a
    public abstract void setMonitorDetailDims(String str, String str2);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setMonitorDetailTime(String str, long j);

    public abstract void setRenderManager(ppc ppcVar);

    public abstract void setRootHeight(int i);

    public abstract void setRootNode(INode iNode);

    public abstract void setRootWidth(int i);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setScrollEnabled(boolean z);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setTag(String str, Object obj);

    @Override // com.taobao.android.weex_framework.a
    public abstract void setWeexScrollListener(dde ddeVar);

    public abstract void stopPixelCheck();

    public abstract void switchToBackground();

    public abstract boolean switchToForeground();

    public abstract void unregisterNativeStateListener(String str, a.b bVar);

    @Override // com.taobao.android.weex_framework.a
    public abstract void updateBaseFontSize(float f);

    public abstract void updateContainerSize(float f, float f2);

    public abstract void updateContainerSize(float f, float f2, boolean z);

    @Override // com.taobao.android.weex_framework.a
    public abstract void updateNativeState(String str, String str2);

    @Override // com.taobao.android.weex_framework.a
    public abstract void updateViewport();

    public abstract boolean useDomAPI();

    public abstract boolean useXRAPI();
}
