package com.taobao.weex;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.aliweex.adapter.adapter.WXAPMGeneratorAdapter;
import com.alibaba.aliweex.adapter.adapter.WXExceptionAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.ClassLoaderAdapter;
import com.taobao.weex.adapter.DefaultUriAdapter;
import com.taobao.weex.adapter.DefaultWXHttpAdapter;
import com.taobao.weex.adapter.ICrashInfoReporter;
import com.taobao.weex.adapter.IDrawableLoader;
import com.taobao.weex.adapter.ITracingAdapter;
import com.taobao.weex.adapter.IWXAccessibilityRoleAdapter;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXCoreLoader;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.adapter.IWXJSEngineManager;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.adapter.IWXJsFileLoaderAdapter;
import com.taobao.weex.adapter.IWXJscProcessManager;
import com.taobao.weex.adapter.IWXSoLoaderAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.adapter.URIAdapter;
import com.taobao.weex.adapter.WXInitAdapter;
import com.taobao.weex.common.WXRefreshData;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.common.WXWorkThreadManager;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.WXRenderManager;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dgb;
import tb.ebe;
import tb.gzc;
import tb.heb;
import tb.hu9;
import tb.jbe;
import tb.nid;
import tb.nxo;
import tb.t2o;
import tb.ube;
import tb.zae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXSDKManager implements nid<IWXBridgeManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_VIEWPORT_WIDTH = 750;
    private static volatile WXSDKManager sManager;
    private heb mActivityNavBarSetter;
    private Map<String, WXSDKInstance> mAllInstanceMap;
    private dgb mApmGenerater;
    private IWXBridgeManager mBridgeManager;
    private ClassLoaderAdapter mClassLoaderAdapter;
    private IWXConfigAdapter mConfigAdapter;
    private ICrashInfoReporter mCrashInfo;
    private IDrawableLoader mDrawableLoader;
    private hu9 mFontAdapter;
    private IWXHttpAdapter mIWXHttpAdapter;
    private IWXImgLoaderAdapter mIWXImgLoaderAdapter;
    private IWXJSExceptionAdapter mIWXJSExceptionAdapter;
    private IWXSoLoaderAdapter mIWXSoLoaderAdapter;
    private com.taobao.weex.appfram.storage.b mIWXStorageAdapter;
    private IWXUserTrackAdapter mIWXUserTrackAdapter;
    private ube mIWebSocketAdapterFactory;
    private List<a> mInitListeners;
    private volatile int mJsEngineType;
    private List<b> mLifeCycleCallbacks;
    private gzc mNavigator;
    private boolean mNeedInitV8;
    private ebe mRecorderGenerator;
    private IWXAccessibilityRoleAdapter mRoleAdapter;
    private jbe mStatisticsListener;
    private ITracingAdapter mTracingAdapter;
    private URIAdapter mURIAdapter;
    private List<zae> mWXAnalyzerList;
    private IWXCoreLoader mWXCoreLoader;
    private IWXFoldDeviceAdapter mWXFoldDeviceAdapter;
    private IWXInitTaskAdapter mWXInitTaskAdapter;
    private IWXJSEngineManager mWXJSEngineManager;
    private IWXJsFileLoaderAdapter mWXJsFileLoaderAdapter;
    private IWXJscProcessManager mWXJscProcessManager;
    public WXRenderManager mWXRenderManager;
    private final WXWorkThreadManager mWXWorkThreadManager;
    private static AtomicInteger sInstanceId = new AtomicInteger(0);
    private static volatile boolean isUseSingleProcess = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str, String str2);

        void onInitSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(String str);

        void b(String str);
    }

    static {
        t2o.a(985661489);
        t2o.a(985661634);
    }

    private WXSDKManager() {
        this(new WXRenderManager());
    }

    public static WXSDKManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKManager) ipChange.ipc$dispatch("29225cc4", new Object[0]);
        }
        if (sManager == null) {
            synchronized (WXSDKManager.class) {
                try {
                    if (sManager == null) {
                        sManager = new WXSDKManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sManager;
    }

    public static int getInstanceViewPortWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e944119", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = getInstance().getSDKInstance(str);
        if (sDKInstance == null) {
            return 750;
        }
        return sDKInstance.P();
    }

    public static void initInstance(WXRenderManager wXRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920225a5", new Object[]{wXRenderManager});
        } else {
            sManager = new WXSDKManager(wXRenderManager);
        }
    }

    public static void setInstance(WXSDKManager wXSDKManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2102fc5e", new Object[]{wXSDKManager});
        } else {
            sManager = wXSDKManager;
        }
    }

    public void addWXAnalyzer(zae zaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea22395c", new Object[]{this, zaeVar});
        } else if (!this.mWXAnalyzerList.contains(zaeVar)) {
            this.mWXAnalyzerList.add(zaeVar);
        }
    }

    @Deprecated
    public void callback(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344f625", new Object[]{this, str, str2, map});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.callback(str, str2, map, false);
        }
    }

    public void createInstance(WXSDKInstance wXSDKInstance, nxo nxoVar, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de1dd70", new Object[]{this, wXSDKInstance, nxoVar, map, str});
            return;
        }
        this.mWXRenderManager.registerInstance(wXSDKInstance);
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.createInstance(wXSDKInstance.N(), nxoVar, map, str);
        }
        List<b> list = this.mLifeCycleCallbacks;
        if (list != null) {
            for (b bVar : list) {
                bVar.a(wXSDKInstance.N());
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WXWorkThreadManager wXWorkThreadManager = this.mWXWorkThreadManager;
        if (wXWorkThreadManager != null) {
            wXWorkThreadManager.destroy();
        }
        this.mAllInstanceMap.clear();
    }

    public void destroyInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929a7c00", new Object[]{this, str});
            return;
        }
        setCrashInfo(WXEnvironment.WEEX_CURRENT_KEY, "");
        if (!TextUtils.isEmpty(str)) {
            if (WXUtils.isUiThread()) {
                List<b> list = this.mLifeCycleCallbacks;
                if (list != null) {
                    for (b bVar : list) {
                        bVar.b(str);
                    }
                }
                this.mWXRenderManager.removeRenderStatement(str);
                IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
                if (iWXBridgeManager != null) {
                    iWXBridgeManager.destroyInstance(str);
                    return;
                }
                return;
            }
            throw new WXRuntimeException("[WXSDKManager] destroyInstance error");
        }
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b8ec29", new Object[]{this, str, str2, str3});
        } else {
            fireEvent(str, str2, str3, new HashMap());
        }
    }

    public String generateInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a15034", new Object[]{this});
        }
        return String.valueOf(sInstanceId.incrementAndGet());
    }

    public IWXAccessibilityRoleAdapter getAccessibilityRoleAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXAccessibilityRoleAdapter) ipChange.ipc$dispatch("f3dd3d7f", new Object[]{this});
        }
        return this.mRoleAdapter;
    }

    public heb getActivityNavBarSetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (heb) ipChange.ipc$dispatch("fa97988e", new Object[]{this});
        }
        return this.mActivityNavBarSetter;
    }

    public Map<String, WXSDKInstance> getAllInstanceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69974098", new Object[]{this});
        }
        return this.mAllInstanceMap;
    }

    public dgb getApmGenerater() {
        if (this.mApmGenerater == null) {
            try {
                IpChange ipChange = WXAPMGeneratorAdapter.$ipChange;
                this.mApmGenerater = (dgb) WXAPMGeneratorAdapter.class.newInstance();
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
        return this.mApmGenerater;
    }

    public ClassLoaderAdapter getClassLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoaderAdapter) ipChange.ipc$dispatch("85275ee5", new Object[]{this});
        }
        if (this.mClassLoaderAdapter == null) {
            this.mClassLoaderAdapter = new ClassLoaderAdapter();
        }
        return this.mClassLoaderAdapter;
    }

    public IDrawableLoader getDrawableLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDrawableLoader) ipChange.ipc$dispatch("e8074480", new Object[]{this});
        }
        return this.mDrawableLoader;
    }

    public hu9 getFontAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hu9) ipChange.ipc$dispatch("73d75019", new Object[]{this});
        }
        if (this.mFontAdapter == null) {
            synchronized (this) {
                try {
                    if (this.mFontAdapter == null) {
                        this.mFontAdapter = new hu9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.mFontAdapter;
    }

    public IWXHttpAdapter getIWXHttpAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter) ipChange.ipc$dispatch("7691e633", new Object[]{this});
        }
        if (this.mIWXHttpAdapter == null) {
            this.mIWXHttpAdapter = new DefaultWXHttpAdapter();
        }
        return this.mIWXHttpAdapter;
    }

    public IWXImgLoaderAdapter getIWXImgLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("7a9f42bd", new Object[]{this});
        }
        return this.mIWXImgLoaderAdapter;
    }

    public IWXJSExceptionAdapter getIWXJSExceptionAdapter() {
        if (this.mIWXJSExceptionAdapter == null) {
            try {
                IpChange ipChange = WXExceptionAdapter.$ipChange;
                this.mIWXJSExceptionAdapter = (IWXJSExceptionAdapter) WXExceptionAdapter.class.newInstance();
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
        return this.mIWXJSExceptionAdapter;
    }

    public IWXJsFileLoaderAdapter getIWXJsFileLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("10baebd3", new Object[]{this});
        }
        return this.mWXJsFileLoaderAdapter;
    }

    public IWXSoLoaderAdapter getIWXSoLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXSoLoaderAdapter) ipChange.ipc$dispatch("3a634c81", new Object[]{this});
        }
        return this.mIWXSoLoaderAdapter;
    }

    public com.taobao.weex.appfram.storage.b getIWXStorageAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("1fdb427", new Object[]{this});
        }
        return this.mIWXStorageAdapter;
    }

    public IWXUserTrackAdapter getIWXUserTrackAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXUserTrackAdapter) ipChange.ipc$dispatch("ab33057d", new Object[]{this});
        }
        return this.mIWXUserTrackAdapter;
    }

    public com.taobao.weex.appfram.websocket.a getIWXWebSocketAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.websocket.a) ipChange.ipc$dispatch("2412745c", new Object[]{this});
        }
        ube ubeVar = this.mIWebSocketAdapterFactory;
        if (ubeVar != null) {
            return ubeVar.a();
        }
        return null;
    }

    public int getJsEngineType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4530b035", new Object[]{this})).intValue();
        }
        return IWXJSEngineManager.EngineType.QuickJS.engineValue();
    }

    public gzc getNavigator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzc) ipChange.ipc$dispatch("aab7b546", new Object[]{this});
        }
        return this.mNavigator;
    }

    public ebe getRecorderGenerator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebe) ipChange.ipc$dispatch("79a391fa", new Object[]{this});
        }
        return this.mRecorderGenerator;
    }

    public WXSDKInstance getSDKInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("24a7b6e8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WXSDKInstance wXSDKInstance = this.mWXRenderManager.getWXSDKInstance(str);
        if (wXSDKInstance == null) {
            return getAllInstanceMap().get(str);
        }
        return wXSDKInstance;
    }

    public ITracingAdapter getTracingAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITracingAdapter) ipChange.ipc$dispatch("6beea600", new Object[]{this});
        }
        return this.mTracingAdapter;
    }

    public URIAdapter getURIAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("348c27a7", new Object[]{this});
        }
        if (this.mURIAdapter == null) {
            this.mURIAdapter = new DefaultUriAdapter();
        }
        return this.mURIAdapter;
    }

    public synchronized boolean getUseSingleProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc0c0fc1", new Object[]{this})).booleanValue();
        }
        return isUseSingleProcess;
    }

    public List<zae> getWXAnalyzerList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41652245", new Object[]{this});
        }
        return this.mWXAnalyzerList;
    }

    public IWXBridgeManager getWXBridgeManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXBridgeManager) ipChange.ipc$dispatch("86cfb83d", new Object[]{this});
        }
        return this.mBridgeManager;
    }

    public IWXCoreLoader getWXCoreLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXCoreLoader) ipChange.ipc$dispatch("bba0d140", new Object[]{this});
        }
        return this.mWXCoreLoader;
    }

    public IWXFoldDeviceAdapter getWXFoldDeviceAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("8c5b8074", new Object[]{this});
        }
        return this.mWXFoldDeviceAdapter;
    }

    public IWXInitTaskAdapter getWXInitTaskAdapter() {
        if (this.mWXInitTaskAdapter == null) {
            try {
                IpChange ipChange = WXInitAdapter.$ipChange;
                this.mWXInitTaskAdapter = (IWXInitTaskAdapter) WXInitAdapter.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
        return this.mWXInitTaskAdapter;
    }

    public IWXJSEngineManager getWXJSEngineManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJSEngineManager) ipChange.ipc$dispatch("4548c0e0", new Object[]{this});
        }
        return this.mWXJSEngineManager;
    }

    public IWXJscProcessManager getWXJscProcessManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJscProcessManager) ipChange.ipc$dispatch("6afda974", new Object[]{this});
        }
        return this.mWXJscProcessManager;
    }

    public WXRenderManager getWXRenderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRenderManager) ipChange.ipc$dispatch("d24adc08", new Object[]{this});
        }
        return this.mWXRenderManager;
    }

    public jbe getWXStatisticsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbe) ipChange.ipc$dispatch("919a7be0", new Object[]{this});
        }
        return this.mStatisticsListener;
    }

    public WXWorkThreadManager getWXWorkThreadManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXWorkThreadManager) ipChange.ipc$dispatch("3d001e9b", new Object[]{this});
        }
        return this.mWXWorkThreadManager;
    }

    public IWXConfigAdapter getWxConfigAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXConfigAdapter) ipChange.ipc$dispatch("b34f952a", new Object[]{this});
        }
        return this.mConfigAdapter;
    }

    public void initScriptsFramework(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62298d17", new Object[]{this, str});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.initScriptsFramework(str);
        }
    }

    public boolean needInitV8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e15ce873", new Object[]{this})).booleanValue();
        }
        return this.mNeedInitV8;
    }

    public void notifyInitSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80690951", new Object[]{this});
            return;
        }
        WXLogUtils.e("notifyInitSuccess");
        for (a aVar : this.mInitListeners) {
            aVar.onInitSuccess();
        }
        this.mInitListeners.clear();
    }

    public void onSDKEngineInitialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcfdd74", new Object[]{this});
            return;
        }
        jbe jbeVar = this.mStatisticsListener;
        if (jbeVar != null) {
            jbeVar.a();
        }
    }

    public void postOnUiThread(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa4df02", new Object[]{this, runnable, new Long(j)});
        } else {
            this.mWXRenderManager.postOnUiThread(WXThread.secure(runnable), j);
        }
    }

    public void refreshInstance(String str, WXRefreshData wXRefreshData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a6f515", new Object[]{this, str, wXRefreshData});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.refreshInstance(str, wXRefreshData);
        }
    }

    public void registerComponents(List<Map<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba3fb11", new Object[]{this, list});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.registerComponents(list);
        }
    }

    public void registerInstanceLifeCycleCallbacks(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8016310", new Object[]{this, bVar});
            return;
        }
        if (this.mLifeCycleCallbacks == null) {
            this.mLifeCycleCallbacks = new ArrayList();
        }
        this.mLifeCycleCallbacks.add(bVar);
    }

    public void registerModules(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6079523a", new Object[]{this, map});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.registerModules(map);
        }
    }

    public void registerStatisticsListener(jbe jbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182933a", new Object[]{this, jbeVar});
        } else {
            this.mStatisticsListener = jbeVar;
        }
    }

    public void removeInitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7ba586", new Object[]{this, aVar});
        } else if (this.mInitListeners.contains(aVar)) {
            this.mInitListeners.remove(aVar);
        }
    }

    public void restartBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0beaeff", new Object[]{this});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.restart();
        }
    }

    public void rmWXAnalyzer(zae zaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4dde82", new Object[]{this, zaeVar});
        } else {
            this.mWXAnalyzerList.remove(zaeVar);
        }
    }

    public void setAccessibilityRoleAdapter(IWXAccessibilityRoleAdapter iWXAccessibilityRoleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78987ef3", new Object[]{this, iWXAccessibilityRoleAdapter});
        } else {
            this.mRoleAdapter = iWXAccessibilityRoleAdapter;
        }
    }

    public void setActivityNavBarSetter(heb hebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6943fc", new Object[]{this, hebVar});
        } else {
            this.mActivityNavBarSetter = hebVar;
        }
    }

    public void setCrashInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956f95ce", new Object[]{this, str, str2});
            return;
        }
        ICrashInfoReporter iCrashInfoReporter = this.mCrashInfo;
        if (iCrashInfoReporter != null) {
            iCrashInfoReporter.addCrashInfo(str, str2);
        }
    }

    public void setCrashInfoReporter(ICrashInfoReporter iCrashInfoReporter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cbc542", new Object[]{this, iCrashInfoReporter});
        } else {
            this.mCrashInfo = iCrashInfoReporter;
        }
    }

    public void setIWXJSExceptionAdapter(IWXJSExceptionAdapter iWXJSExceptionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7592051", new Object[]{this, iWXJSExceptionAdapter});
        } else {
            this.mIWXJSExceptionAdapter = iWXJSExceptionAdapter;
        }
    }

    public void setInitConfig(com.taobao.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7355acbd", new Object[]{this, aVar});
            return;
        }
        this.mIWXHttpAdapter = aVar.w();
        this.mIWXImgLoaderAdapter = aVar.y();
        this.mDrawableLoader = aVar.t();
        this.mIWXStorageAdapter = aVar.E();
        this.mIWXUserTrackAdapter = aVar.G();
        this.mURIAdapter = aVar.F();
        this.mIWebSocketAdapterFactory = aVar.H();
        this.mIWXJSExceptionAdapter = aVar.z();
        this.mIWXSoLoaderAdapter = aVar.x();
        this.mClassLoaderAdapter = aVar.s();
        this.mApmGenerater = aVar.r();
        this.mWXJsFileLoaderAdapter = aVar.A();
        this.mWXJscProcessManager = aVar.B();
        this.mWXFoldDeviceAdapter = aVar.u();
        this.mRecorderGenerator = aVar.D();
    }

    public void setInitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68751864", new Object[]{this, aVar});
        } else if (WXSDKEngine.isInitialized()) {
            WXLogUtils.e("onInitSuccess");
            aVar.onInitSuccess();
        } else {
            WXLogUtils.e("wait init success");
            this.mInitListeners.add(aVar);
        }
    }

    public void setJsEngineType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7bd775", new Object[]{this, new Integer(i)});
        } else if (this.mJsEngineType == 0) {
            synchronized (WXSDKManager.class) {
                try {
                    if (this.mJsEngineType == 0) {
                        this.mJsEngineType = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setNavigator(gzc gzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e6a534", new Object[]{this, gzcVar});
        } else {
            this.mNavigator = gzcVar;
        }
    }

    public void setNeedInitV8(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65794383", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedInitV8 = z;
        }
    }

    public void setTracingAdapter(ITracingAdapter iTracingAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92429b0", new Object[]{this, iTracingAdapter});
        } else {
            this.mTracingAdapter = iTracingAdapter;
        }
    }

    public synchronized void setUseSingleProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95894d2b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z != isUseSingleProcess) {
            isUseSingleProcess = z;
        }
    }

    public void setWXCoreLoader(IWXCoreLoader iWXCoreLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91108e4", new Object[]{this, iWXCoreLoader});
        } else {
            this.mWXCoreLoader = iWXCoreLoader;
        }
    }

    public void setWXFoldDeviceAdapter(IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee6fe2", new Object[]{this, iWXFoldDeviceAdapter});
        } else {
            this.mWXFoldDeviceAdapter = iWXFoldDeviceAdapter;
        }
    }

    public void setWXInitTaskAdapter(IWXInitTaskAdapter iWXInitTaskAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f18462", new Object[]{this, iWXInitTaskAdapter});
        } else {
            this.mWXInitTaskAdapter = iWXInitTaskAdapter;
        }
    }

    public void setWXJSEngineManager(IWXJSEngineManager iWXJSEngineManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47020762", new Object[]{this, iWXJSEngineManager});
        } else if (this.mWXJSEngineManager == null) {
            synchronized (WXSDKManager.class) {
                try {
                    if (this.mWXJSEngineManager == null) {
                        this.mWXJSEngineManager = iWXJSEngineManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setWxConfigAdapter(IWXConfigAdapter iWXConfigAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed09a62", new Object[]{this, iWXConfigAdapter});
        } else {
            this.mConfigAdapter = iWXConfigAdapter;
        }
    }

    private WXSDKManager(WXRenderManager wXRenderManager) {
        this.mWXFoldDeviceAdapter = null;
        this.mNeedInitV8 = true;
        this.mJsEngineType = 0;
        this.mWXRenderManager = wXRenderManager;
        this.mWXWorkThreadManager = new WXWorkThreadManager();
        this.mWXAnalyzerList = new CopyOnWriteArrayList();
        this.mAllInstanceMap = new HashMap();
        this.mInitListeners = new CopyOnWriteArrayList();
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17ff83c", new Object[]{this, str, str2, str3, map});
        } else {
            fireEvent(str, str2, str3, map, null);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.nid
    public IWXBridgeManager getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXBridgeManager) ipChange.ipc$dispatch("7cc34ce6", new Object[]{this}) : this.mBridgeManager;
    }

    public void setImpl(IWXBridgeManager iWXBridgeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb25d50", new Object[]{this, iWXBridgeManager});
        } else {
            this.mBridgeManager = iWXBridgeManager;
        }
    }

    @Deprecated
    public void callback(String str, String str2, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55a814f", new Object[]{this, str, str2, map, new Boolean(z)});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.callback(str, str2, map, z);
        }
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9612e3c9", new Object[]{this, str, str2, str3, map, map2});
        } else if (!WXEnvironment.isApkDebugable() || Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
            if (iWXBridgeManager != null) {
                iWXBridgeManager.fireEventOnNode(str, str2, str3, map, map2);
            }
        } else {
            throw new WXRuntimeException("[WXSDKManager]  fireEvent error");
        }
    }
}
