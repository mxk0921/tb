package com.alibaba.poplayer;

import android.app.Activity;
import android.app.Application;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.manager.ConfigManager;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.IFaceAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.norm.IPopLayerViewAdapter;
import com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter;
import com.alibaba.poplayer.norm.ITriggerAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.a;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fig;
import tb.hst;
import tb.pjc;
import tb.rjl;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_BROADCAST_ACTION_FIRST_PAGE_READY = "PopFirstPageReady";
    public static final String ACTION_BROADCAST_ACTION_UCPTRACKER = "UCPTracker";
    public static final String ACTION_FRAGMENT_SWITCH = "com.alibaba.poplayer.PopLayer.action.FRAGMENT_SWITCH";
    public static final String ACTION_OUT_CONFIG_UPDATED = "com.alibaba.poplayer.PopLayer.action.out.CONFIG_UPDATED";
    public static final String ACTION_OUT_DISMISS = "com.alibaba.poplayer.PopLayer.action.out.CLOSE";
    public static final String ACTION_OUT_DISPLAY = "com.alibaba.poplayer.PopLayer.action.out.DISPLAY";
    public static final String ACTION_OUT_VIEW_ADDED = "com.alibaba.poplayer.PopLayer.action.out.VIEW_ADDED";
    public static final String ACTION_OUT_VIEW_REMOVED = "com.alibaba.poplayer.PopLayer.action.out.VIEW_REMOVED";
    public static final String ACTION_POP = "com.alibaba.poplayer.PopLayer.action.POP";
    public static final String ACTION_PRE_DEAL_CUSTOM_TRIGGER = "com.alibaba.poplayer.PopLayer.action.PRE_DEAL_CUSTOM_EVENT";
    public static final String EXTRA_KEY_EVENT = "event";
    public static final String EXTRA_KEY_EXTRA_PARAMS = "extra_params";
    public static final String EXTRA_KEY_FRAGMENT_NAME = "fragment_name";
    public static final String EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM = "fragment_need_activity_param";
    public static final String EXTRA_KEY_FRAGMENT_PARAM = "fragment_param";
    public static final String EXTRA_KEY_PARAM = "param";
    public static final String EXTRA_KEY_TRIGGER_SROUCE = "triggetSrouce";
    public static final String SCHEMA = "poplayer";
    private static PopLayer sPopLayer;
    @Monitor.TargetField(name = rjl.MONITOR_ADAPTER_VERSION)
    private String mAdapterVersion;
    public IConfigAdapter mConfigAdapter;
    @Monitor.TargetField
    private ConfigManager mConfigMgr;
    private Application mContext;
    public final IFaceAdapter mFaceAdapter;
    private ITriggerAdapter mITriggerAdapter;
    @Monitor.TargetField
    private pjc mLayerMgrAdapter;
    public INewConfigAdapter mNewConfigAdapter;
    @Monitor.TargetField
    private PageTriggerService mPageTriggerService;
    private IPopLayerViewAdapter mPopLayerViewAdapter;
    private IPopLayerViewFactoryAdapter mPopLayerViewFactoryAdapter;
    @Monitor.TargetField(name = rjl.MONITOR_TIMEZONE)
    private String mTimeZoneId;
    @Monitor.TargetField
    private InternalTriggerController mTriggerController;
    public static boolean DEBUG = true;
    private static final AtomicBoolean sSetupStarted = new AtomicBoolean(false);
    private static final AtomicBoolean sSetupDone = new AtomicBoolean(false);
    public final CopyOnWriteArraySet<String> mManualPopPages = new CopyOnWriteArraySet<>();
    @Monitor.TargetField(name = "version")
    private String mVersion = "";

    /* compiled from: Taobao */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface PopupAllowedFromFragment {
        String tag() default "";
    }

    /* compiled from: Taobao */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface PopupOnlyManually {
        String tag() default "";
    }

    static {
        t2o.a(625999874);
    }

    public PopLayer(IFaceAdapter iFaceAdapter, IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter, pjc pjcVar) {
        this.mFaceAdapter = iFaceAdapter;
        this.mConfigAdapter = iConfigAdapter;
        this.mNewConfigAdapter = iNewConfigAdapter;
        this.mLayerMgrAdapter = pjcVar;
        if (sPopLayer == null) {
            sPopLayer = this;
        }
    }

    public static PopLayer getReference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayer) ipChange.ipc$dispatch("283a5adf", new Object[0]);
        }
        return sPopLayer;
    }

    public static boolean isSetup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a30b7a7e", new Object[0])).booleanValue();
        }
        return sSetupDone.get();
    }

    public static synchronized JSONObject queryNowPopCount() {
        synchronized (PopLayer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5c6731f3", new Object[0]);
            } else if (!isSetup()) {
                return new JSONObject();
            } else {
                return PageTriggerService.instance().getCurPageRequestInfo();
            }
        }
    }

    public synchronized Map<String, String> filterFatigue(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b910101c", new Object[]{this, list});
        } else if (!isSetup()) {
            return new HashMap();
        } else {
            return this.mConfigMgr.filterFatigue(list);
        }
    }

    public Application getApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f3384fc1", new Object[]{this});
        }
        return this.mContext;
    }

    public ConfigManager getConfigMgr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigManager) ipChange.ipc$dispatch("dda06bee", new Object[]{this});
        }
        return this.mConfigMgr;
    }

    public long getCurrentTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c918edee", new Object[]{this})).longValue() : getCurrentTimeStamp(true);
    }

    public IFaceAdapter getFaceAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFaceAdapter) ipChange.ipc$dispatch("6f55f94", new Object[]{this});
        }
        return this.mFaceAdapter;
    }

    public IPopLayerViewAdapter getPopLayerViewAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopLayerViewAdapter) ipChange.ipc$dispatch("d5d0a064", new Object[]{this});
        }
        return this.mPopLayerViewAdapter;
    }

    public IPopLayerViewFactoryAdapter getPopLayerViewFactoryAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopLayerViewFactoryAdapter) ipChange.ipc$dispatch("1ca68cca", new Object[]{this});
        }
        return this.mPopLayerViewFactoryAdapter;
    }

    public String getTimeZoneFromGMT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b7f8e64", new Object[]{this});
        }
        return this.mTimeZoneId;
    }

    public ITriggerAdapter getTriggerAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITriggerAdapter) ipChange.ipc$dispatch("aa9ef22a", new Object[]{this});
        }
        return this.mITriggerAdapter;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return "";
    }

    public Activity internalGetCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2760f452", new Object[]{this});
        }
        return this.mTriggerController.getCurrentActivity();
    }

    public boolean isMunualPopPageContains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebffad0", new Object[]{this, str})).booleanValue();
        }
        return this.mManualPopPages.contains(str);
    }

    public boolean isValidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b37f77e", new Object[]{this, activity})).booleanValue();
        }
        return true;
    }

    public boolean isValidConfig(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb6545f", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    public boolean isValidConfigBeforeMonitor(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb0152c", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    public Pair<Boolean, String> isValidConfigWithReason(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1bd0ced2", new Object[]{this, aVar});
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public void onPageClean(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fafc2b4", new Object[]{this, activity});
        }
    }

    public void onSwitchedNewPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62422f38", new Object[]{this, str, str2});
        }
    }

    public boolean registerManualPopPage(Class<Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d216203", new Object[]{this, cls})).booleanValue();
        }
        String name = cls.getName();
        boolean add = this.mManualPopPages.add(name);
        wdm.d("PopLayer.registerManualPopPage?activityClazz=%s.return?add=%s", name, Boolean.valueOf(add));
        return add;
    }

    public void registerPopLayerViewAdapter(IPopLayerViewAdapter iPopLayerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a526a1b7", new Object[]{this, iPopLayerViewAdapter});
        } else {
            this.mPopLayerViewAdapter = iPopLayerViewAdapter;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            hst.b(new Runnable() { // from class: tb.mdm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayer.this.doRelease();
                }
            });
        }
    }

    public void removeRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed71acfe", new Object[]{this, popRequest});
        } else if (popRequest != null) {
            PageTriggerService.instance().removeRequest(popRequest);
        }
    }

    public void setTimeZoneFromGMT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9a12fa", new Object[]{this, str});
        } else {
            this.mTimeZoneId = str;
        }
    }

    public void setTriggerAdapter(ITriggerAdapter iTriggerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece0d8c6", new Object[]{this, iTriggerAdapter});
        } else {
            this.mITriggerAdapter = iTriggerAdapter;
        }
    }

    public List<a> tryOpenRequestControl(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("234f7d1c", new Object[]{this, list});
        }
        return list;
    }

    public boolean unregisterManualPopPage(Class<Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54b215c", new Object[]{this, cls})).booleanValue();
        }
        String name = cls.getName();
        boolean remove = this.mManualPopPages.remove(name);
        wdm.d("PopLayer.unregisterManualPopPage?activityClazz=%s.return?remove=%s", name, Boolean.valueOf(remove));
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1443783", new Object[]{this});
            return;
        }
        try {
            String curActivityKeyCode = InternalTriggerController.getCurActivityKeyCode();
            PageTriggerService.instance().pageClean(curActivityKeyCode, curActivityKeyCode, true);
            getReference().onPageClean(internalGetCurrentActivity());
        } catch (Throwable th) {
            wdm.h("PopLayer.release.error.", th);
        }
    }

    public long getCurrentTimeStamp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a05840e", new Object[]{this, new Boolean(z)})).longValue();
        }
        if (z) {
            return this.mFaceAdapter.getCurrentTimeStamp(this.mContext) + (PopLayerMockManager.instance().getTimeTravelSec() * 1000);
        }
        return this.mFaceAdapter.getCurrentTimeStamp(this.mContext);
    }

    public final void registerViewType(IPopLayerViewFactoryAdapter iPopLayerViewFactoryAdapter, List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cccce5", new Object[]{this, iPopLayerViewFactoryAdapter, list, str});
            return;
        }
        try {
            this.mPopLayerViewFactoryAdapter = iPopLayerViewFactoryAdapter;
            fig.c().d(list, str);
            wdm.d("PopLayerAction.registerViewType success!", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopLayerAction.registerViewType fail!", th);
        }
    }

    public void setupNew(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cac3f", new Object[]{this, application, new Boolean(z)});
            return;
        }
        try {
            if (sSetupStarted.getAndSet(true)) {
                wdm.c(wdm.CATEGORY_LIFE_CYCLE, "", "PopLayer.setup.alreadySetup");
                return;
            }
            this.mContext = application;
            DEBUG = z;
            this.mTriggerController = new InternalTriggerController(application);
            this.mPageTriggerService = PageTriggerService.instance();
            ConfigManager configManager = new ConfigManager(this.mConfigAdapter, this.mNewConfigAdapter);
            this.mConfigMgr = configManager;
            configManager.startFetchConfig(false);
            new d(this.mLayerMgrAdapter).s();
            this.mFaceAdapter.registerTrackViewTypes(application);
            sSetupDone.set(true);
        } catch (Throwable th) {
            sSetupStarted.set(false);
            wdm.h("PopLayer.setupNew.fail.", th);
        }
    }
}
