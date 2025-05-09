package com.taobao.message.lab.comfrm.inner2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.devtools.DojoTracePlugin;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.ConfigManager;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.config.EventInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.ResourceManager;
import com.taobao.message.lab.comfrm.render.ViewQueryService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.list.ListActions;
import com.taobao.message.lab.comfrm.support.ut.UserTrack;
import com.taobao.message.lab.comfrm.support.ut.UserTrackService;
import com.taobao.message.lab.comfrm.support.ut.UserTrackServiceImpl;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.lab.comfrm.util.TimeBuffer;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Container implements IResourceChangePublisher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Container";
    private Activity mActivity;
    private String mBizConfigCode;
    private String mClassNamespace;
    private ConfigInfo mConfigInfo;
    private ConfigManager mConfigManager;
    private IContainerCallback mContainerCallback;
    private String mContainerKey;
    private EventManager mEventManager;
    private String mIdentifier;
    private Plugins mPlugins;
    private WidgetRenderImpl mRender;
    private WidgetRenderImpl.RenderConfig mRenderConfig;
    private Map<String, Object> mRenderContext;
    private IResourceManager mResourceManager;
    private Snapshot mSnapshot;
    private SourceManager mSourceManager;
    private StateManager mStateManager;
    private String mVersion;
    private volatile boolean useSnapshotRender;
    private boolean waitFirstSource = false;
    private boolean canRefreshLayout = true;
    private boolean isCallbackSourceReady = false;

    static {
        t2o.a(537919582);
        t2o.a(537919728);
    }

    public Container(Activity activity, String str, String str2, Map<String, Object> map) {
        appInit(activity, str, null, str2, map, null);
    }

    public static /* synthetic */ String access$000(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a109807a", new Object[]{container});
        }
        return container.mBizConfigCode;
    }

    public static /* synthetic */ WidgetRenderImpl access$100(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderImpl) ipChange.ipc$dispatch("a5abe7d7", new Object[]{container});
        }
        return container.mRender;
    }

    public static /* synthetic */ boolean access$1000(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64875019", new Object[]{container})).booleanValue();
        }
        return container.isCallbackSourceReady;
    }

    public static /* synthetic */ boolean access$1002(Container container, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("609a62a1", new Object[]{container, new Boolean(z)})).booleanValue();
        }
        container.isCallbackSourceReady = z;
        return z;
    }

    public static /* synthetic */ Plugins access$1100(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugins) ipChange.ipc$dispatch("36816630", new Object[]{container});
        }
        return container.mPlugins;
    }

    public static /* synthetic */ EventManager access$1300(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventManager) ipChange.ipc$dispatch("25b49475", new Object[]{container});
        }
        return container.mEventManager;
    }

    public static /* synthetic */ boolean access$200(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d845c76c", new Object[]{container})).booleanValue();
        }
        return container.useSnapshotRender;
    }

    public static /* synthetic */ boolean access$300(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a1cad", new Object[]{container})).booleanValue();
        }
        return container.canRefreshLayout;
    }

    public static /* synthetic */ boolean access$302(Container container, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65e1288d", new Object[]{container, new Boolean(z)})).booleanValue();
        }
        container.canRefreshLayout = z;
        return z;
    }

    public static /* synthetic */ boolean access$400(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aee71ee", new Object[]{container})).booleanValue();
        }
        return container.waitFirstSource;
    }

    public static /* synthetic */ ConfigInfo access$500(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigInfo) ipChange.ipc$dispatch("2db0d57e", new Object[]{container});
        }
        return container.mConfigInfo;
    }

    public static /* synthetic */ StateManager access$600(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateManager) ipChange.ipc$dispatch("3453ff00", new Object[]{container});
        }
        return container.mStateManager;
    }

    public static /* synthetic */ Snapshot access$700(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snapshot) ipChange.ipc$dispatch("edf1f819", new Object[]{container});
        }
        return container.mSnapshot;
    }

    public static /* synthetic */ String access$800(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b35f2772", new Object[]{container});
        }
        return container.mVersion;
    }

    public static /* synthetic */ IContainerCallback access$900(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerCallback) ipChange.ipc$dispatch("1a00e082", new Object[]{container});
        }
        return container.mContainerCallback;
    }

    private void appInit(Activity activity, String str, String str2, String str3, Map<String, Object> map, String str4) {
        Set<String> queryParameterNames;
        TraceUtil.beginSection("ContainerInit");
        this.mResourceManager = new ResourceManager();
        this.mClassNamespace = str4;
        this.mActivity = activity;
        this.mIdentifier = str3;
        this.mBizConfigCode = str;
        this.mVersion = str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mBizConfigCode);
        sb.append(".");
        String str5 = this.mVersion;
        if (str5 == null) {
            str5 = "";
        }
        sb.append(str5);
        sb.append(".dojo.");
        sb.append(ComponentFrmModule.uniqueKey());
        this.mContainerKey = sb.toString();
        ConfigManager configManager = new ConfigManager(this.mResourceManager);
        this.mConfigManager = configManager;
        this.mConfigInfo = configManager.getConfig(str, this.mVersion);
        Plugins plugins = new Plugins(this.mContainerKey, this.mIdentifier, this.mBizConfigCode, this.mVersion, this.mConfigInfo);
        this.mPlugins = plugins;
        plugins.addPlugin(new DojoTracePlugin(this.mContainerKey));
        try {
            if (ApplicationUtil.isDebug()) {
                Class.forName("com.taobao.android.dinamicx.devtools.jsonrpc.mapping.ObjectMapper");
                Plugin plugin = (Plugin) Class.forName("com.taobao.message.lab.comfrm.inner2.DevToolsPlugin").newInstance();
                if (plugin != null) {
                    this.mPlugins.addPlugin(plugin);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
        HashMap hashMap = new HashMap(this.mConfigInfo.props);
        if (map != null) {
            hashMap.putAll(map);
        }
        Intent intent = activity.getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (!(data == null || (queryParameterNames = data.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
            for (String str6 : queryParameterNames) {
                String queryParameter = data.getQueryParameter(str6);
                if (ApplicationUtil.isDebug() && map != null && map.containsKey(str6)) {
                    Object obj = map.get(str6);
                    if (!(obj instanceof String) || !TextUtils.equals((CharSequence) obj, queryParameter)) {
                        throw new RuntimeException("URL中参数覆盖了代码显示传入参数，需要加白名单|key|" + str6 + "|uriParameterValue|" + queryParameter + "|innerParameterValue|" + obj);
                    }
                }
                hashMap.put(str6, queryParameter);
            }
        }
        ArrayList arrayList = new ArrayList();
        List<CI<TransformerItem, Transformer>> arrayList2 = new ArrayList<>();
        for (SourceItem sourceItem : this.mConfigInfo.source.sourceList) {
            arrayList.add(new CI(sourceItem, ClassPool.instance().getInstance(sourceItem.type, (Class<Object>) Source.class, str3, false, this.mClassNamespace)));
        }
        appInitImpl(hashMap, arrayList2, arrayList);
        TraceUtil.endTrace();
    }

    private void appInitImpl(Map<String, Object> map, List<CI<TransformerItem, Transformer>> list, List<CI<SourceItem, Source>> list2) {
        List<String> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fab07cf", new Object[]{this, map, list, list2});
            return;
        }
        WidgetRenderImpl widgetRenderImpl = new WidgetRenderImpl(this.mIdentifier, this.mActivity, this.mClassNamespace);
        this.mRender = widgetRenderImpl;
        widgetRenderImpl.setPlugin(this.mPlugins);
        StateManager stateManager = new StateManager(this.mIdentifier, this.mContainerKey, this.mConfigInfo.transformer, map, false, this.mPlugins, this.mClassNamespace);
        this.mStateManager = stateManager;
        stateManager.setStateListener(new AnonymousClass1(list2));
        this.mSourceManager = new SourceManager(this.mIdentifier, this.mContainerKey, this.mConfigInfo.source, map, this.mStateManager, false, this.mClassNamespace, this.mPlugins);
        String str = this.mIdentifier;
        String str2 = this.mContainerKey;
        IResourceManager iResourceManager = this.mResourceManager;
        EventInfo eventInfo = this.mConfigInfo.event;
        if (eventInfo == null) {
            list3 = null;
        } else {
            list3 = eventInfo.jsFiles;
        }
        EventManager eventManager = new EventManager(str, str2, iResourceManager, false, list3, this.mPlugins, this.mClassNamespace);
        this.mEventManager = eventManager;
        eventManager.init(new ActionDispatcher() { // from class: com.taobao.message.lab.comfrm.inner2.Container.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("865d606c", new Object[]{this, action});
                } else if (!StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
                    Container.access$600(Container.this).dispatch(action);
                }
            }
        }, this.mSourceManager);
        this.mEventManager.registerService(ViewQueryService.class, this.mRender);
        this.mEventManager.registerService(PageService.class, new PageService(this.mActivity));
        this.mEventManager.registerService(UserTrackService.class, new UserTrackServiceImpl(this.mActivity, this.mIdentifier));
    }

    public void addPlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e2512", new Object[]{this, plugin});
        } else {
            this.mPlugins.addPlugin(plugin);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.mSourceManager.dispose();
        this.mStateManager.dispose();
        this.mEventManager.dispose();
        this.mRender.dispose();
        this.mResourceManager.dispose();
        Plugins plugins = this.mPlugins;
        if (plugins != null) {
            plugins.onContainerDisposeFinished();
        }
        ObjectVerifier.check();
        ClassPool.instance().check();
    }

    public void enableSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a45256e", new Object[]{this});
            return;
        }
        ISnapshotCenter iSnapshotCenter = (ISnapshotCenter) GlobalContainer.getInstance().get(ISnapshotCenter.class, this.mIdentifier, "");
        if (iSnapshotCenter != null) {
            this.mSnapshot = iSnapshotCenter.getSnapshot(this.mBizConfigCode, this.mVersion);
        }
    }

    public <T> T getView(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("da059b37", new Object[]{this, cls});
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1013).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mBizConfigCode).build());
        return (T) this.mRender.getView();
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

    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        WidgetRenderImpl widgetRenderImpl = this.mRender;
        if (widgetRenderImpl != null) {
            widgetRenderImpl.postEvent(event);
        }
    }

    public <T> void registerService(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else {
            this.mEventManager.registerService(cls, t);
        }
    }

    public void setCallback(IContainerCallback iContainerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49914755", new Object[]{this, iContainerCallback});
        } else {
            this.mContainerCallback = iContainerCallback;
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
        } else {
            this.mStateManager.dispatch(action);
        }
    }

    public void waitFirstSource(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e120c2b7", new Object[]{this, new Boolean(z)});
        } else {
            this.waitFirstSource = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class EventActionDispatcher implements EventDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Map<String, Object> bindData;
        private final SharedState sharedState;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class EventRunnable implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Event event;
            private final EventHandlerItem eventHandlerItem;
            private final ViewObject viewObject;

            static {
                t2o.a(537919590);
            }

            public EventRunnable(EventHandlerItem eventHandlerItem, ViewObject viewObject, Event event) {
                this.eventHandlerItem = eventHandlerItem;
                this.viewObject = viewObject;
                this.event = event;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventHandleRuntime eventHandleRuntime;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (EventActionDispatcher.access$1200(EventActionDispatcher.this) != null) {
                    EventHandlerItem eventHandlerItem = this.eventHandlerItem;
                    SharedState access$1200 = EventActionDispatcher.access$1200(EventActionDispatcher.this);
                    ViewObject viewObject = this.viewObject;
                    eventHandleRuntime = LayoutProtocol.buildEventRuntime(eventHandlerItem, access$1200, viewObject.indexs, viewObject.bindData);
                } else if (EventActionDispatcher.access$1400(EventActionDispatcher.this) != null) {
                    eventHandleRuntime = LayoutProtocol.buildEventRuntimeWithExpressionMap(this.eventHandlerItem, EventActionDispatcher.access$1400(EventActionDispatcher.this), this.viewObject.indexs);
                } else {
                    eventHandleRuntime = null;
                }
                Container.access$1300(Container.this).handle(this.event, eventHandleRuntime);
            }
        }

        static {
            t2o.a(537919588);
            t2o.a(537919550);
        }

        public EventActionDispatcher(SharedState sharedState) {
            this.sharedState = sharedState;
            this.bindData = null;
        }

        public static /* synthetic */ SharedState access$1200(EventActionDispatcher eventActionDispatcher) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedState) ipChange.ipc$dispatch("1d0fbab6", new Object[]{eventActionDispatcher});
            }
            return eventActionDispatcher.sharedState;
        }

        public static /* synthetic */ Map access$1400(EventActionDispatcher eventActionDispatcher) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54957ebb", new Object[]{eventActionDispatcher});
            }
            return eventActionDispatcher.bindData;
        }

        @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
        public void dispatch(final Event event) {
            List<EventHandlerItem> list;
            LayoutInfo layoutInfo;
            Map<String, List<EventHandlerItem>> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e55a714", new Object[]{this, event});
                return;
            }
            Container.access$1100(Container.this).onEventReceived(event);
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1101).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this), "actioneName", event.getName()).build());
            if (event instanceof WrapperEvent) {
                final ViewObject viewObject = ((WrapperEvent) event).getViewObject();
                if (viewObject == null || (layoutInfo = viewObject.info) == null || (map = layoutInfo.eventHandler) == null) {
                    list = null;
                } else {
                    list = map.get(event.getName());
                }
                if (list != null) {
                    for (EventHandlerItem eventHandlerItem : list) {
                        EventRunnable eventRunnable = new EventRunnable(eventHandlerItem, viewObject, event);
                        if (eventHandlerItem.immediate == 1) {
                            eventRunnable.run();
                        } else {
                            Schedules.logic(eventRunnable);
                        }
                    }
                }
                Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.Container.EventActionDispatcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        ArrayList arrayList;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (ListActions.EVENT_EXPOSED.equals(event.getName())) {
                            arrayList = new ArrayList();
                            if (event.getData() instanceof Map) {
                                for (ViewObject viewObject2 : (List) ((Map) event.getData()).get("viewObjects")) {
                                    UserTrack bindUserTrack = LayoutProtocol.bindUserTrack(viewObject2, event, EventActionDispatcher.access$1200(EventActionDispatcher.this), Container.access$500(Container.this).layout, !Container.access$600(Container.this).isJSAvailable());
                                    if (bindUserTrack != null) {
                                        arrayList.add(bindUserTrack);
                                    }
                                }
                            }
                        } else {
                            arrayList = new ArrayList(1);
                            UserTrack bindUserTrack2 = LayoutProtocol.bindUserTrack(viewObject, event, EventActionDispatcher.access$1200(EventActionDispatcher.this), Container.access$500(Container.this).layout, true ^ Container.access$600(Container.this).isJSAvailable());
                            if (bindUserTrack2 != null) {
                                arrayList.add(bindUserTrack2);
                            }
                        }
                        if (!(Container.access$1300(Container.this).getServicePool() == null || Container.access$1300(Container.this).getServicePool().service(UserTrackService.class) == null)) {
                            ((UserTrackService) Container.access$1300(Container.this).getServicePool().service(UserTrackService.class)).userTrack(arrayList);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException(JSON.toJSONString(event));
        }

        public EventActionDispatcher(Map<String, Object> map) {
            this.sharedState = null;
            this.bindData = map;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.Container.start():void");
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.message.lab.comfrm.inner2.Container$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass1 implements StateManager.StateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final TimeBuffer<Pair<ViewObject, SharedState>> uiRefershBuffer = new TimeBuffer<>(true, 350, new TimeBuffer.LastItemMergeFunction(), new Observer<List<Pair<ViewObject, SharedState>>>() { // from class: com.taobao.message.lab.comfrm.inner2.Container.1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onError(String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                }
            }

            public void onData(List<Pair<ViewObject, SharedState>> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("62cedf21", new Object[]{this, list});
                } else if (!list.isEmpty()) {
                    final Pair<ViewObject, SharedState> pair = list.get(list.size() - 1);
                    Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.Container.1.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1011).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this)).build());
                            Container.access$100(Container.this).render((ViewObject) pair.first, new EventActionDispatcher((SharedState) pair.second));
                        }
                    });
                }
            }
        });
        public final /* synthetic */ List val$sourceList;

        public AnonymousClass1(List list) {
            this.val$sourceList = list;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.StateManager.StateListener
        public void onChanged(Action action, SharedState sharedState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("587fd455", new Object[]{this, action, sharedState});
                return;
            }
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1008).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this), "propsSize", String.valueOf(sharedState.getPropsSize()), "runtimeDataSize", String.valueOf(sharedState.getRuntimeDataSize()), "jsRuntimeDataSize", String.valueOf(sharedState.getJsRuntimeDataSize()), "originalDataSize", String.valueOf(sharedState.getOriginalDataSize()), "runtimeDiffSize", String.valueOf(sharedState.getDiff().runtimeDiff.size()), "originalDiffSize", String.valueOf(sharedState.getDiff().originalDiff.size())).build());
            if (!Container.access$200(Container.this) || !StdActions.COMPONENT_FIRST.equals(action.getName())) {
                if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName()) || this.val$sourceList.isEmpty()) {
                    Container.access$302(Container.this, true);
                }
                if (!Container.access$300(Container.this)) {
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1009).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this), "waitSource", String.valueOf(Container.access$400(Container.this))).build());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ViewObject buildViewObject = LayoutProtocol.buildViewObject(Container.access$500(Container.this).layout, sharedState, null, !Container.access$600(Container.this).isJSAvailable());
                if (!(action.getContext() == null || action.getContext().get("stateSubTraceId") == null)) {
                    buildViewObject.traceId = ValueUtil.getString(action.getContext(), "stateSubTraceId");
                }
                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1010).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this), "layoutBindTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).build());
                this.uiRefershBuffer.produce(new Pair<>(buildViewObject, sharedState));
                if (Container.access$700(Container.this) != null && !StdActions.COMPONENT_FIRST.equals(action.getName())) {
                    Container.access$700(Container.this).saveSnapshot(Container.access$800(Container.this), buildViewObject, sharedState);
                }
                if (Container.access$900(Container.this) != null && !Container.access$1000(Container.this)) {
                    Container.access$1002(Container.this, true);
                    Container.access$900(Container.this).sourceReady();
                    return;
                }
                return;
            }
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1009).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$000(Container.this)).build());
        }
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map) {
        appInit(activity, str, str2, str3, map, null);
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map, String str4) {
        appInit(activity, str, str2, str3, map, str4);
    }

    public Container(Activity activity, String str, String str2) {
        appInit(activity, str, null, str2, null, null);
    }
}
