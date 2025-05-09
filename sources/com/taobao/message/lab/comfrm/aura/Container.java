package com.taobao.message.lab.comfrm.aura;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.aura.DojoRenderService;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.devtools.DojoLogPlugin;
import com.taobao.message.lab.comfrm.devtools.DojoMonitorPlugin;
import com.taobao.message.lab.comfrm.devtools.DojoTracePlugin;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.Plugins;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.ConfigManager;
import com.taobao.message.lab.comfrm.inner2.config.EventInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.lazy.LazyInitObjectRef;
import com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.ResourceManager;
import com.taobao.message.lab.comfrm.render.ViewQueryService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.BlockingQueueSync;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.tao.Globals;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Container implements IResourceChangePublisher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AURAContainer";
    private final DojoEventService eventService;
    private Activity mActivity;
    private final String mBizConfigCode;
    private final String mClassNamespace;
    private int mCntStep;
    private final ConfigInfo mConfigInfo;
    private final String mContainerKey;
    private final LazyInitObjectRef<DojoPageContext> mDojoPageContextRef;
    private EventManager mEventManager;
    private boolean mFinishLoadStateAndObject;
    private boolean mFinishSendFirsstAction;
    private final String mIdentifier;
    private final Map<Class, Object> mInjectServicePool;
    private LockOnGlobalLayoutListener mLockOnGlobalLayoutListener;
    private final Plugins mPlugins;
    private final Map<String, Object> mProps;
    private WidgetRenderImpl mRender;
    private WidgetRenderImpl.RenderConfig mRenderConfig;
    private Map<String, Object> mRenderContext;
    private final IResourceManager mResourceManager;
    private Snapshot mSnapshot;
    private boolean mUseRemote;
    private Snapshot.SnapshotData mUseSuccessSnapshotData;
    private final String mVersion;
    private final BlockingQueueSync mViewFirstLock;
    private final DojoRenderService renderService;
    private final DojoSourceService sourceService;
    private final DojoStateService stateService;
    private final DojoTemplateService templateService;
    public static int END_STEP_SNAPSHOT = 1;
    public static int END_STEP_FULL = Integer.MAX_VALUE;
    private static final boolean isOpenTrace = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgEnableTrace");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class LockOnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean awaitViewFirstLock;
        private int callBackCount = 0;
        private final BlockingQueueSync finalViewFirstLock;
        private final boolean messageDelayVSyncResume;

        static {
            t2o.a(537919514);
        }

        public LockOnGlobalLayoutListener(BlockingQueueSync blockingQueueSync, boolean z, boolean z2) {
            this.finalViewFirstLock = blockingQueueSync;
            this.awaitViewFirstLock = z;
            this.messageDelayVSyncResume = z2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.callBackCount++;
            Container.access$1200(Container.this);
            Logger.e(Container.TAG, "onGlobalLayout");
            if (Container.access$1100(Container.this) != null) {
                Container.access$1100(Container.this).onGlobalLayout(Container.access$800(Container.this), this.callBackCount);
            }
            if (this.callBackCount <= 1) {
                if (this.messageDelayVSyncResume) {
                    Container.this.postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
                }
                if (!this.awaitViewFirstLock) {
                    Container.access$1400(Container.this).noUse();
                } else if (ABGlobal.isFeatureOpened(Container.access$1300(Container.this), "auraNeedWait")) {
                    Container.access$1400(Container.this).noUse();
                } else {
                    boolean await = this.finalViewFirstLock.await(500L);
                    if (!await) {
                        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-503").errMsg("viewFirstLock timeout").build());
                        MonitorUtil.commitCount(Constants.Monitor.MODULE_MONITOR, "viewFirstLock", 1.0d);
                    }
                    Container.access$1100(Container.this).onAwaitFinished(await);
                }
            }
        }
    }

    public Container(Activity activity, String str, String str2, Map<String, Object> map) {
        this(activity.getIntent(), str, (String) null, str2, map, (String) null);
        attachPage(activity);
    }

    public static /* synthetic */ DojoStateService access$000(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoStateService) ipChange.ipc$dispatch("4996dbe2", new Object[]{container});
        }
        return container.stateService;
    }

    public static /* synthetic */ DojoTemplateService access$100(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoTemplateService) ipChange.ipc$dispatch("204dd434", new Object[]{container});
        }
        return container.templateService;
    }

    public static /* synthetic */ WidgetRenderImpl access$1000(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderImpl) ipChange.ipc$dispatch("f39df7de", new Object[]{container});
        }
        return container.mRender;
    }

    public static /* synthetic */ Plugins access$1100(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugins) ipChange.ipc$dispatch("f3d68137", new Object[]{container});
        }
        return container.mPlugins;
    }

    public static /* synthetic */ void access$1200(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99038070", new Object[]{container});
        } else {
            container.tryDisposeLockGlobalListener();
        }
    }

    public static /* synthetic */ Activity access$1300(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("435ef957", new Object[]{container});
        }
        return container.mActivity;
    }

    public static /* synthetic */ BlockingQueueSync access$1400(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueueSync) ipChange.ipc$dispatch("91ff297", new Object[]{container});
        }
        return container.mViewFirstLock;
    }

    public static /* synthetic */ DojoRenderService access$200(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoRenderService) ipChange.ipc$dispatch("eef6f76f", new Object[]{container});
        }
        return container.renderService;
    }

    public static /* synthetic */ DojoEventService access$300(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoEventService) ipChange.ipc$dispatch("a24359ee", new Object[]{container});
        }
        return container.eventService;
    }

    public static /* synthetic */ DojoSourceService access$400(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoSourceService) ipChange.ipc$dispatch("e71d4332", new Object[]{container});
        }
        return container.sourceService;
    }

    public static /* synthetic */ Snapshot access$500(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snapshot) ipChange.ipc$dispatch("6a2de830", new Object[]{container});
        }
        return container.mSnapshot;
    }

    public static /* synthetic */ String access$600(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a229bbbb", new Object[]{container});
        }
        return container.mVersion;
    }

    public static /* synthetic */ Snapshot.SnapshotData access$700(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snapshot.SnapshotData) ipChange.ipc$dispatch("e5ef8692", new Object[]{container});
        }
        return container.mUseSuccessSnapshotData;
    }

    public static /* synthetic */ String access$800(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13ea7cf9", new Object[]{container});
        }
        return container.mBizConfigCode;
    }

    public static /* synthetic */ ConfigInfo access$900(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigInfo) ipChange.ipc$dispatch("a63a0001", new Object[]{container});
        }
        return container.mConfigInfo;
    }

    private void tryDisposeLockGlobalListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451040d", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null && this.mLockOnGlobalLayoutListener != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.mLockOnGlobalLayoutListener);
            this.mLockOnGlobalLayoutListener = null;
        }
    }

    public void addPlugin(Plugin plugin) {
        LazyInitObjectRef<DojoPageContext> lazyInitObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e2512", new Object[]{this, plugin});
        } else if (!ApplicationUtil.isDebug() || (lazyInitObjectRef = this.mDojoPageContextRef) == null || !lazyInitObjectRef.isInit()) {
            this.mPlugins.addPlugin(plugin);
        } else {
            throw new RuntimeException("registerService must precede call start()");
        }
    }

    public void attachPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddabfe0d", new Object[]{this, activity});
        } else if (!ApplicationUtil.isDebug() || VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                this.mActivity = activity;
            } else if (activity2 != activity) {
                throw new IllegalArgumentException("重复使用不同Activity初始化");
            }
        } else {
            throw new RuntimeException("非主线程调用Container.attachPage");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (!ApplicationUtil.isDebug() || VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
            tryDisposeLockGlobalListener();
            DojoSourceService dojoSourceService = this.sourceService;
            if (dojoSourceService != null) {
                dojoSourceService.onDestroy();
            }
            DojoStateService dojoStateService = this.stateService;
            if (dojoStateService != null) {
                dojoStateService.onDestroy();
            }
            DojoEventService dojoEventService = this.eventService;
            if (dojoEventService != null) {
                dojoEventService.onDestroy();
            }
            if (this.mRender != null) {
                Logger.e("EventManager", "dispose Container mRender");
                Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Logger.e("EventManager", "dispose Container mRender2222");
                        if (Container.access$1000(Container.this) != null) {
                            Container.access$1000(Container.this).dispose();
                        }
                    }
                });
            } else {
                Logger.e("EventManager", "skip dispose Container mRender");
            }
            if (this.mEventManager != null) {
                Logger.e("EventManager", "dispose Container mEventManager");
                this.mEventManager.dispose();
            } else {
                Logger.e("EventManager", "skip dispose Container mEventManager");
            }
            this.mResourceManager.dispose();
            Plugins plugins = this.mPlugins;
            if (plugins != null) {
                plugins.onContainerDisposeFinished();
            }
            ObjectVerifier.check();
            ClassPool.instance().check();
        } else {
            throw new RuntimeException("非主线程调用dispose");
        }
    }

    public void enableSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a45256e", new Object[]{this});
            return;
        }
        ISnapshotCenter iSnapshotCenter = (ISnapshotCenter) GlobalContainer.getInstance().get(ISnapshotCenter.class, this.mIdentifier, "");
        if (iSnapshotCenter != null) {
            if (!TextUtils.isEmpty(this.mVersion)) {
                this.mSnapshot = iSnapshotCenter.getSnapshot(this.mBizConfigCode, this.mVersion);
            } else {
                this.mSnapshot = iSnapshotCenter.getSnapshot(this.mBizConfigCode);
            }
            addPlugin(new PluginAdapter() { // from class: com.taobao.message.lab.comfrm.aura.Container.6
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private SharedState buildSharedState;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/aura/Container$6");
                }

                @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
                public void onBuildViewObjectDataEnd(ViewObject viewObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5fa128ba", new Object[]{this, viewObject});
                        return;
                    }
                    if (!(Container.access$500(Container.this) == null || viewObject == null || !viewObject.isStateLoadSourceReady)) {
                        Container.access$500(Container.this).saveSnapshot(Container.access$600(Container.this), viewObject, this.buildSharedState);
                    }
                    this.buildSharedState = null;
                }

                @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
                public void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("397e4b1b", new Object[]{this, layoutInfo, sharedState});
                    } else {
                        this.buildSharedState = sharedState;
                    }
                }
            });
        }
    }

    public String getContainerKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9b82e5", new Object[]{this});
        }
        return this.mContainerKey;
    }

    public Plugins getPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugins) ipChange.ipc$dispatch("7f7b7875", new Object[]{this});
        }
        return this.mPlugins;
    }

    public ViewQueryService getViewQueryService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewQueryService) ipChange.ipc$dispatch("c4a428e7", new Object[]{this});
        }
        return this.mRender;
    }

    public void initSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4429452", new Object[]{this});
        } else if (!this.mFinishLoadStateAndObject) {
            TraceUtil.beginSection(StdActions.COMMAND_INIT_SOURCE);
            this.sourceService.onExecute(new Command.Build(null, StdActions.COMMAND_INIT_SOURCE).build());
            TraceUtil.endTrace();
            this.mFinishLoadStateAndObject = true;
        }
    }

    public boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue();
        }
        IResourceManager iResourceManager = this.mResourceManager;
        if (iResourceManager != null) {
            return iResourceManager.isResourceChanged();
        }
        return false;
    }

    public void notifyCommand(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280c59ee", new Object[]{this, command});
            return;
        }
        DojoSourceService dojoSourceService = this.sourceService;
        if (dojoSourceService != null) {
            dojoSourceService.onExecute(command);
        }
    }

    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        DojoRenderService dojoRenderService = this.renderService;
        if (dojoRenderService != null) {
            dojoRenderService.dispatch(event);
        }
    }

    public EventManager preCreateEventMananger() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventManager) ipChange.ipc$dispatch("bf07d5cc", new Object[]{this});
        }
        String str = this.mIdentifier;
        String str2 = this.mContainerKey;
        IResourceManager iResourceManager = this.mResourceManager;
        boolean z = this.mUseRemote;
        EventInfo eventInfo = this.mConfigInfo.event;
        if (eventInfo == null) {
            list = null;
        } else {
            list = eventInfo.jsFiles;
        }
        EventManager eventManager = new EventManager(str, str2, iResourceManager, z, list, this.mPlugins, this.mClassNamespace);
        this.mEventManager = eventManager;
        return eventManager;
    }

    public <T> void registerService(Class<T> cls, T t) {
        LazyInitObjectRef<DojoPageContext> lazyInitObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else if (!ApplicationUtil.isDebug() || (lazyInitObjectRef = this.mDojoPageContextRef) == null || !lazyInitObjectRef.isInit()) {
            this.mInjectServicePool.put(cls, t);
        } else {
            throw new RuntimeException("registerService must precede call start()");
        }
    }

    public void saveSnapshotToDiskForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2355179", new Object[]{this});
            return;
        }
        Snapshot snapshot = this.mSnapshot;
        if (snapshot != null) {
            snapshot.saveSnapshotToDiskForce();
        }
    }

    public void setRenderConfig(WidgetRenderImpl.RenderConfig renderConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
        } else {
            this.mRenderConfig = renderConfig;
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
        } else {
            this.mRenderContext = map;
        }
    }

    public void setUseRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4262fa2", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseRemote = z;
        }
    }

    public void start(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e50928", new Object[]{this, viewGroup});
            return;
        }
        this.mPlugins.onContainerStartStart(this.mContainerKey, this.mBizConfigCode, this.mVersion);
        stepStart(viewGroup, false, END_STEP_FULL, null);
        this.mPlugins.onContainerStartEnd(this.mConfigInfo);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
            return;
        }
        IResourceManager iResourceManager = this.mResourceManager;
        if (iResourceManager != null) {
            iResourceManager.subscribeResourceChange(iResourceChangeObserver);
        }
    }

    public void updateState(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa6b5de", new Object[]{this, action});
            return;
        }
        DojoStateService dojoStateService = this.stateService;
        if (dojoStateService != null) {
            dojoStateService.dispatch(action);
        }
    }

    public void sendFirstAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4eef1e5", new Object[]{this});
        } else if (!this.mFinishSendFirsstAction) {
            if (!ABGlobal.isFeatureOpened(Globals.getApplication(), "msgCloseSendFirstAction")) {
                TraceUtil.beginSection("sendFirstAction");
                this.stateService.dispatch(new Action.Build(StdActions.COMPONENT_FIRST).build());
                TraceUtil.endTrace();
            }
            this.mFinishSendFirsstAction = true;
        }
    }

    public void stepStart(ViewGroup viewGroup, boolean z, int i, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904410ba", new Object[]{this, viewGroup, new Boolean(z), new Integer(i), map});
        } else if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用start或stepStart");
        } else if (this.mCntStep != END_STEP_FULL) {
            if (map != null) {
                this.mPlugins.onContainerStepStart(this.mContainerKey, this.mBizConfigCode, this.mVersion, i, map);
            }
            if (this.mActivity != null) {
                Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1001);
                String str2 = this.mBizConfigCode;
                if (this.mSnapshot == null) {
                    str = "0";
                } else {
                    str = "1";
                }
                Logger.ftl(point.ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, str2, "snapshot", str, "endStep", String.valueOf(i)).build());
                if (map != null) {
                    if (ApplicationUtil.isDebug()) {
                        if (this.mFinishLoadStateAndObject) {
                            throw new RuntimeException("loadStateAndObject已经执行，source开始访问props后不允许修改");
                        } else if (this.mFinishSendFirsstAction) {
                            throw new RuntimeException("sendFirsstAction，state.props对外暴露后不允许修改");
                        }
                    }
                    this.mProps.putAll(map);
                }
                int i2 = this.mCntStep;
                int i3 = END_STEP_SNAPSHOT;
                if (i2 < i3 && i >= i3) {
                    if (viewGroup.getChildCount() <= 0) {
                        this.mRender = new WidgetRenderImpl(this.mIdentifier, this.mActivity, this.mClassNamespace);
                        if (viewGroup.getChildCount() == 0) {
                            if (this.mRenderContext != null) {
                                this.mRender.setRenderContext(Collections.unmodifiableMap(new HashMap(this.mRenderContext)));
                            }
                            WidgetRenderImpl.RenderConfig renderConfig = this.mRenderConfig;
                            if (renderConfig != null) {
                                this.mRender.setRenderConfig(renderConfig);
                            }
                            this.mRender.setPlugin(this.mPlugins);
                            this.mRender.setUseRemote(this.mUseRemote);
                            viewGroup.addView(this.mRender.getView(), -1, -1);
                        }
                        DojoPageContext dojoPageContext = new DojoPageContext();
                        dojoPageContext.mainRender = this.mRender;
                        if (this.mEventManager == null) {
                            preCreateEventMananger();
                            if (i == END_STEP_SNAPSHOT) {
                                this.mEventManager.enterOnlyWeakDependence();
                            }
                        }
                        this.mInjectServicePool.put(ViewQueryService.class, this.mRender);
                        dojoPageContext.activity = this.mActivity;
                        dojoPageContext.eventManager = this.mEventManager;
                        dojoPageContext.injectServicePool = this.mInjectServicePool;
                        this.mDojoPageContextRef.initObject(dojoPageContext);
                        final EventDispatcher eventDispatcher = new EventDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
                            public void dispatch(Event event) {
                                Map<String, Object> map2;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("4e55a714", new Object[]{this, event});
                                    return;
                                }
                                TraceUtil.beginSection("Snapshot-Event-", event.getName());
                                if (Container.access$700(Container.this) != null) {
                                    map2 = Container.access$700(Container.this).preBindData;
                                } else {
                                    map2 = new HashMap<>();
                                }
                                Container.access$300(Container.this).executeSnapshotEvent((WrapperEvent) event, map2);
                                TraceUtil.endTrace();
                            }
                        };
                        Snapshot.SnapshotData renderSnapshot = renderSnapshot(eventDispatcher);
                        this.mUseSuccessSnapshotData = renderSnapshot;
                        if (renderSnapshot == null && i == END_STEP_SNAPSHOT) {
                            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.8
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1002).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$800(Container.this)).build());
                                    Container.access$1000(Container.this).render(LayoutProtocol.buildViewObject(Container.access$900(Container.this).layout, new HashMap(), null, true), eventDispatcher);
                                }
                            });
                        }
                        this.mCntStep = END_STEP_SNAPSHOT;
                    } else {
                        throw new IllegalArgumentException("container|start|containerView has childView");
                    }
                }
                int i4 = this.mCntStep;
                int i5 = END_STEP_FULL;
                if (i4 < i5 && i >= i5) {
                    initSource();
                    if (this.mUseSuccessSnapshotData == null) {
                        sendFirstAction();
                    }
                    boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.mActivity, "messageDelayVSyncResume");
                    if (!isFeatureOpened) {
                        if (ABGlobal.isFeatureOpened(this.mActivity, "postRESUME_RENDER")) {
                            UIHandler.postFront(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.9
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        Container.this.postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
                                    }
                                }
                            });
                        } else {
                            postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
                        }
                    }
                    TraceUtil.beginSection("awaitRender");
                    this.mLockOnGlobalLayoutListener = new LockOnGlobalLayoutListener(this.mViewFirstLock, z, isFeatureOpened);
                    this.mActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.mLockOnGlobalLayoutListener);
                    TraceUtil.endTrace();
                    this.mEventManager.tryExitOnlyWeakDependence();
                    this.mCntStep = END_STEP_FULL;
                }
                if (map != null) {
                    this.mPlugins.onContainerStepStart(this.mContainerKey, this.mBizConfigCode, this.mVersion, i, map);
                    return;
                }
                return;
            }
            throw new IllegalStateException("调用stepStart之前，需要先绑定Activity");
        } else if (ApplicationUtil.isDebug()) {
            throw new RuntimeException("Container重复初始化");
        }
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map) {
        this(activity.getIntent(), str, str2, str3, map, (String) null);
        attachPage(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.message.lab.comfrm.inner2.Snapshot.SnapshotData renderSnapshot(final com.taobao.message.lab.comfrm.core.EventDispatcher r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.aura.Container.renderSnapshot(com.taobao.message.lab.comfrm.core.EventDispatcher):com.taobao.message.lab.comfrm.inner2.Snapshot$SnapshotData");
    }

    static {
        t2o.a(537919502);
        t2o.a(537919728);
    }

    public void start(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abcceac", new Object[]{this, viewGroup, new Boolean(z)});
            return;
        }
        this.mPlugins.onContainerStartStart(this.mContainerKey, this.mBizConfigCode, this.mVersion);
        stepStart(viewGroup, z, END_STEP_FULL, null);
        this.mPlugins.onContainerStartEnd(this.mConfigInfo);
    }

    public Container(Activity activity, String str, String str2) {
        this(activity.getIntent(), str, (String) null, str2, (Map<String, Object>) null, (String) null);
        attachPage(activity);
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map, String str4) {
        this(activity.getIntent(), str, str2, str3, map, str4);
        attachPage(activity);
    }

    public Container(Intent intent, String str, String str2, String str3, Map<String, Object> map, String str4) {
        Set<String> queryParameterNames;
        Map<String, Object> map2;
        Plugin plugin;
        this.mInjectServicePool = new HashMap(0);
        this.mUseRemote = false;
        this.mCntStep = 0;
        this.mFinishSendFirsstAction = false;
        this.mFinishLoadStateAndObject = false;
        ResourceManager resourceManager = new ResourceManager();
        this.mResourceManager = resourceManager;
        this.mClassNamespace = str4;
        this.mIdentifier = str3;
        this.mBizConfigCode = str;
        this.mVersion = str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2 == null ? "" : str2);
        sb.append(".aura.");
        sb.append(ComponentFrmModule.uniqueKey());
        String sb2 = sb.toString();
        this.mContainerKey = sb2;
        ConfigInfo config = new ConfigManager(resourceManager).getConfig(str, str2);
        this.mConfigInfo = config;
        if (config == null) {
            AppMonitor.Counter.commit("AuraContainer", "ConfigInfoError", str + "_" + str2, 1.0d);
        }
        Plugins plugins = new Plugins(sb2, str3, str, str2, config);
        this.mPlugins = plugins;
        if (isOpenTrace) {
            plugins.addPlugin(new DojoTracePlugin(sb2));
        }
        map = map == null ? new HashMap<>() : map;
        if (ApplicationUtil.isDebug()) {
            plugins.addPlugin(new DojoLogPlugin(sb2, str, map));
        }
        if (map.containsKey("sceneName") && ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgEnableMonitorPlugin")) {
            plugins.addPlugin(new DojoMonitorPlugin(sb2, str, map, plugins));
        }
        try {
            if (ApplicationUtil.isDebug() && (plugin = (Plugin) Class.forName("com.taobao.message.lab.comfrm.inner2.DevToolsPlugin").newInstance()) != null) {
                plugins.addPlugin(plugin);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        this.mProps = hashMap;
        ConfigInfo configInfo = this.mConfigInfo;
        if (!(configInfo == null || (map2 = configInfo.props) == null)) {
            hashMap.putAll(map2);
        }
        Uri data = intent != null ? intent.getData() : null;
        if (!(data == null || (queryParameterNames = data.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
            for (String str5 : queryParameterNames) {
                this.mProps.put(str5, data.getQueryParameter(str5));
            }
        }
        this.mProps.putAll(map);
        this.mProps.put("auraContainerKey", this.mContainerKey);
        TraceUtil.beginSection("pipeInit");
        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1201).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mBizConfigCode, "snapshot", this.mSnapshot == null ? "0" : "1").build());
        DojoContext dojoContext = new DojoContext();
        dojoContext.containerKey = this.mContainerKey;
        dojoContext.props = this.mProps;
        dojoContext.bizConfigCode = this.mBizConfigCode;
        dojoContext.version = this.mVersion;
        dojoContext.configInfo = this.mConfigInfo;
        dojoContext.plugin = this.mPlugins;
        dojoContext.identifier = this.mIdentifier;
        dojoContext.useRemote = this.mUseRemote;
        dojoContext.resourceManager = this.mResourceManager;
        dojoContext.classNamespace = this.mClassNamespace;
        LazyInitObjectRef<DojoPageContext> lazyInitObjectRef = new LazyInitObjectRef<>();
        this.mDojoPageContextRef = lazyInitObjectRef;
        BlockingQueueSync blockingQueueSync = new BlockingQueueSync();
        this.mViewFirstLock = blockingQueueSync;
        this.sourceService = new DojoSourceService(dojoContext, this.mPlugins, new ActionDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                } else {
                    Container.access$000(Container.this).dispatch(action);
                }
            }
        });
        this.stateService = new DojoStateService(dojoContext, this.mPlugins, new StateManager.StateListener() { // from class: com.taobao.message.lab.comfrm.aura.Container.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.StateManager.StateListener
            public void onChanged(Action action, SharedState sharedState) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("587fd455", new Object[]{this, action, sharedState});
                } else {
                    Container.access$200(Container.this).renderConsume(Container.access$100(Container.this).onExecute(sharedState, ValueUtil.getString(action.getContext(), "stateSubTraceId")));
                }
            }
        });
        this.templateService = new DojoTemplateService(dojoContext, this.mPlugins);
        this.renderService = new DojoRenderService(dojoContext, lazyInitObjectRef, blockingQueueSync, new DojoRenderService.Dispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.aura.DojoRenderService.Dispatcher
            public void dispatch(ViewObject viewObject, Event event) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f86f7b71", new Object[]{this, viewObject, event});
                } else {
                    Container.access$300(Container.this).onExecute(viewObject.sharedState, event);
                }
            }
        });
        this.eventService = new DojoEventService(dojoContext, lazyInitObjectRef, new ActionDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                } else {
                    Container.access$000(Container.this).dispatch(action);
                }
            }
        }, new CommandHandler() { // from class: com.taobao.message.lab.comfrm.aura.Container.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
            public void handle(Command command) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("db6b56d4", new Object[]{this, command});
                } else {
                    Container.access$400(Container.this).onExecute(command);
                }
            }
        });
        TraceUtil.endTrace();
    }
}
