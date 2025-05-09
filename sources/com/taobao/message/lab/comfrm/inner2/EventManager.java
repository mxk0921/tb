package com.taobao.message.lab.comfrm.inner2;

import android.os.Looper;
import android.os.SystemClock;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.event.ForwardEventService;
import com.taobao.message.lab.comfrm.event.StateService;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.inner2.event.JsEventHandler;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.c21;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EventManager implements Disposable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDemoteDevice;
    private ActionDispatcher mActionDispatcher;
    private String mClassNamespace;
    private CommandHandler mCommandHandler;
    private String mContainerKey;
    private String mIdentifier;
    private final JsEventHandler mJsEventHandler;
    private final Plugin mPlugin;
    private boolean mUseRemote;
    private volatile CountDownLatch weakDependenceCountDown;
    private volatile boolean weakDependenceTimeout;
    private volatile boolean weakOnlyOnceFlag;
    private Map<Class, Object> mPrivateStatePool = new ConcurrentHashMap();
    private EventRuntimeInfo mEventRuntimeInfo = new EventRuntimeInfo();
    private final ServicePool mServicePool = new ServicePool();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class EventRuntimeInfo {
        public List<Error> errors = new ArrayList();

        static {
            t2o.a(537919611);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StateServiceImpl implements StateService {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private EventHandler mEventHandler;
        public Map<Class, Object> mPrivateStatePool;

        static {
            t2o.a(537919612);
            t2o.a(537919561);
        }

        public StateServiceImpl(EventHandler eventHandler, Map<Class, Object> map) {
            this.mEventHandler = eventHandler;
            this.mPrivateStatePool = map;
        }

        @Override // com.taobao.message.lab.comfrm.event.StateService
        public <T> T getPrivateState(Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("8d67cca0", new Object[]{this, cls});
            }
            T t = (T) this.mPrivateStatePool.get(this.mEventHandler.getClass());
            ObjectVerifier.addCheckObject(t, "EventPrivateState");
            return t;
        }

        @Override // com.taobao.message.lab.comfrm.event.StateService
        public void setPrivateState(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c699af3", new Object[]{this, obj});
            } else {
                this.mPrivateStatePool.put(this.mEventHandler.getClass(), obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TraceSpan {
        public long allTime;
        public long dataConvertTime;
        public long executeEventHandlerTime;

        static {
            t2o.a(537919613);
        }
    }

    static {
        t2o.a(537919602);
        t2o.a(537919598);
    }

    @Deprecated
    public EventManager(ActionDispatcher actionDispatcher, CommandHandler commandHandler, IResourceManager iResourceManager, List<String> list, Plugin plugin, String str) {
        this.mActionDispatcher = actionDispatcher;
        this.mCommandHandler = commandHandler;
        this.mJsEventHandler = new JsEventHandler("non-ContainerKey", iResourceManager, list);
        this.mPlugin = plugin;
        this.mClassNamespace = str;
        if (c21.g().getInt("deviceLevel", -1) >= 2) {
            this.isDemoteDevice = true;
        }
    }

    public static /* synthetic */ CountDownLatch access$002(EventManager eventManager, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("402488c8", new Object[]{eventManager, countDownLatch});
        }
        eventManager.weakDependenceCountDown = countDownLatch;
        return countDownLatch;
    }

    public static /* synthetic */ Plugin access$100(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugin) ipChange.ipc$dispatch("fb8c1612", new Object[]{eventManager});
        }
        return eventManager.mPlugin;
    }

    public static /* synthetic */ EventRuntimeInfo access$200(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventRuntimeInfo) ipChange.ipc$dispatch("e8717bd5", new Object[]{eventManager});
        }
        return eventManager.mEventRuntimeInfo;
    }

    public static /* synthetic */ String access$300(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ada640d", new Object[]{eventManager});
        }
        return eventManager.mContainerKey;
    }

    public static /* synthetic */ ServicePool access$400(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServicePool) ipChange.ipc$dispatch("a4264dc3", new Object[]{eventManager});
        }
        return eventManager.mServicePool;
    }

    public static /* synthetic */ ActionDispatcher access$500(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionDispatcher) ipChange.ipc$dispatch("a7136287", new Object[]{eventManager});
        }
        return eventManager.mActionDispatcher;
    }

    public static /* synthetic */ CommandHandler access$600(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommandHandler) ipChange.ipc$dispatch("2b9e1b61", new Object[]{eventManager});
        }
        return eventManager.mCommandHandler;
    }

    public static /* synthetic */ JsEventHandler access$700(EventManager eventManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsEventHandler) ipChange.ipc$dispatch("ceb18e11", new Object[]{eventManager});
        }
        return eventManager.mJsEventHandler;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Logger.e("EventManager", "dispose mJsEventHandler");
                    EventManager.access$700(EventManager.this).dispose();
                }
            });
        }
    }

    public synchronized void enterOnlyWeakDependence() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c384279a", new Object[]{this});
            return;
        }
        if (!this.weakOnlyOnceFlag) {
            Logger.e("EventManager", "enterOnlyWeakDependence");
            this.weakDependenceCountDown = new CountDownLatch(1);
            this.weakOnlyOnceFlag = true;
        }
    }

    public ServicePool getServicePool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServicePool) ipChange.ipc$dispatch("4a7c5993", new Object[]{this});
        }
        return this.mServicePool;
    }

    @Deprecated
    public void handle(Action action, CI<EventHandlerItem, EventHandler> ci) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2ccdbc", new Object[]{this, action, ci});
        } else {
            handeInner(action, ci.getInstance(), ci.getConfig().runtimeType, null);
        }
    }

    public void init(ActionDispatcher actionDispatcher, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfee9912", new Object[]{this, actionDispatcher, commandHandler});
            return;
        }
        this.mActionDispatcher = actionDispatcher;
        this.mCommandHandler = commandHandler;
    }

    public <T> void registerService(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else {
            this.mServicePool.register(cls, t);
        }
    }

    public synchronized void tryExitOnlyWeakDependence() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7e9b7b", new Object[]{this});
            return;
        }
        Logger.e("EventManager", "tryExitOnlyWeakDependence11");
        if (this.weakDependenceCountDown != null) {
            Logger.e("EventManager", "tryExitOnlyWeakDependence22");
            this.weakDependenceCountDown.countDown();
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        EventManager.access$002(EventManager.this, null);
                    }
                }
            });
        }
    }

    public void handle(Event event, List<EventHandleRuntime> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ed933", new Object[]{this, event, list});
            return;
        }
        for (EventHandleRuntime eventHandleRuntime : list) {
            handle(event, eventHandleRuntime);
        }
    }

    public void handeInner(final Action action, EventHandler eventHandler, String str, final ServiceProvider serviceProvider) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9bb03e", new Object[]{this, action, eventHandler, str, serviceProvider});
        } else if (this.mActionDispatcher == null || this.mCommandHandler == null) {
            throw new IllegalStateException("Please Init EventManager#init");
        } else {
            final ServiceProvider serviceProvider2 = new ServiceProvider() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
                public <T> T service(Class<T> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (T) ipChange2.ipc$dispatch("6b653b51", new Object[]{this, cls});
                    }
                    ServiceProvider serviceProvider3 = serviceProvider;
                    if (serviceProvider3 == null || serviceProvider3.service(cls) == null) {
                        return (T) EventManager.access$400(EventManager.this).service(cls);
                    }
                    return (T) serviceProvider.service(cls);
                }

                @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
                public <T> T service(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (T) ipChange2.ipc$dispatch("a9acf86c", new Object[]{this, str2});
                    }
                    if (serviceProvider.service(str2) != null) {
                        return (T) serviceProvider.service(str2);
                    }
                    return (T) EventManager.access$400(EventManager.this).service(str2);
                }
            };
            if ("js".equals(str)) {
                if (this.isDemoteDevice && "eventhandler.message.dai.trigger".equals(action.getName())) {
                    return;
                }
                if (VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
                    Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                EventManager.access$700(EventManager.this).handle(action, EventManager.access$500(EventManager.this), EventManager.access$600(EventManager.this), serviceProvider2);
                            }
                        }
                    });
                } else {
                    this.mJsEventHandler.handle(action, this.mActionDispatcher, this.mCommandHandler, serviceProvider2);
                }
            } else if (eventHandler != null) {
                if (this.weakDependenceCountDown != null && !(eventHandler instanceof WeakDependence)) {
                    if (VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
                        this.mPlugin.onEventHandleAwaitDependenceStart(action, eventHandler, str);
                        if (!this.weakDependenceTimeout) {
                            try {
                                z = this.weakDependenceCountDown.await(10000L, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        this.mPlugin.onEventHandleAwaitDependenceEnd(action, eventHandler, str, z);
                        if (!z) {
                            this.weakDependenceTimeout = true;
                            return;
                        }
                    } else if (ApplicationUtil.isDebug()) {
                        throw new IllegalStateException("未初始化完全，主线程无法处理非弱依赖");
                    }
                }
                eventHandler.handle(action, this.mActionDispatcher, this.mCommandHandler, serviceProvider2);
            }
        }
    }

    public void handle(Event event, EventHandleRuntime eventHandleRuntime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28aef3", new Object[]{this, event, eventHandleRuntime});
        } else {
            handle(event, eventHandleRuntime, false);
        }
    }

    public void handle(final Event event, final EventHandleRuntime eventHandleRuntime, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ede241", new Object[]{this, event, eventHandleRuntime, new Boolean(z)});
        } else if (eventHandleRuntime.enable) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String str = eventHandleRuntime.type;
            EventHandler eventHandler = !"js".equals(eventHandleRuntime.runtimeType) ? (EventHandler) ClassPool.instance().getInstance(str, EventHandler.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace) : null;
            boolean z2 = eventHandler instanceof BeanSupport;
            Object obj = eventHandleRuntime.data;
            if (!z2 && !z) {
                obj = JSON.parseObject(JSON.toJSONString(obj, SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.DisableCircularReferenceDetect));
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            Action build = new Action.Build(str).data(obj).context(event.getContext()).build();
            Map<String, Object> map = eventHandleRuntime.data;
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1102).ext("containerKey", this.mContainerKey, "eventHandlerType", eventHandleRuntime.type, "dataSize", String.valueOf(map != null ? map.size() : 0)).build());
            Map<String, List<EventHandleRuntime>> map2 = eventHandleRuntime.next;
            final ForwardEventService forwardEventService = (map2 == null || map2.isEmpty()) ? null : new ForwardEventService() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.event.ForwardEventService
                public void loopback(Event event2) {
                    List<EventHandleRuntime> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12110665", new Object[]{this, event2});
                        return;
                    }
                    if (EventManager.access$100(EventManager.this) != null) {
                        EventManager.access$100(EventManager.this).onEventReceived(event2);
                    }
                    HashMap hashMap = new HashMap();
                    if (event.getContext() != null) {
                        hashMap.putAll(event.getContext());
                    }
                    if (event2.getContext() != null) {
                        hashMap.putAll(event2.getContext());
                    }
                    hashMap.put("__loopbackName", event2.getName());
                    hashMap.put("event", event2);
                    Event build2 = new Event.Build(event2.getName()).data(event2.getData()).context(hashMap).build();
                    Map<String, List<EventHandleRuntime>> map3 = eventHandleRuntime.next;
                    if (map3 != null) {
                        list = map3.get(event2.getName());
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        EventManager.this.handle(build2, list);
                    }
                }
            };
            final ErrorDispatcher errorDispatcher = new ErrorDispatcher() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.inner2.ErrorDispatcher
                public void error(Object obj2, final Error error) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8325e4b3", new Object[]{this, obj2, error});
                        return;
                    }
                    EventManager.access$200(EventManager.this).errors.add(error);
                    if (ApplicationUtil.isDebug()) {
                        Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Toast.makeText(ApplicationUtil.getApplication(), EventManager.access$300(EventManager.this) + "/" + eventHandleRuntime.type + "报告错误/" + error.errorCode + "/" + error.errorMsg, 1).show();
                            }
                        });
                    }
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(-1001).ext("containerKey", EventManager.access$300(EventManager.this), "eventHandlerType", eventHandleRuntime.type).build());
                }
            };
            final StateServiceImpl stateServiceImpl = new StateServiceImpl(eventHandler, this.mPrivateStatePool);
            handeInner(build, eventHandler, eventHandleRuntime.runtimeType, new ServiceProvider() { // from class: com.taobao.message.lab.comfrm.inner2.EventManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
                public <T> T service(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (T) ipChange2.ipc$dispatch("a9acf86c", new Object[]{this, str2});
                    }
                    return null;
                }

                @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
                public <T> T service(Class<T> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (T) ipChange2.ipc$dispatch("6b653b51", new Object[]{this, cls});
                    }
                    if (cls.equals(ForwardEventService.class)) {
                        return (T) forwardEventService;
                    }
                    if (cls.equals(ErrorDispatcher.class)) {
                        return (T) errorDispatcher;
                    }
                    if (cls.equals(StateService.class)) {
                        return (T) stateServiceImpl;
                    }
                    return null;
                }
            });
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (this.mPlugin != null) {
                TraceSpan traceSpan = new TraceSpan();
                traceSpan.allTime = uptimeMillis3 - uptimeMillis;
                traceSpan.dataConvertTime = uptimeMillis2 - uptimeMillis;
                traceSpan.executeEventHandlerTime = uptimeMillis3 - uptimeMillis2;
                this.mPlugin.onEventHandlerExecuted(this.mEventRuntimeInfo, build, eventHandleRuntime, traceSpan);
            }
        }
    }

    public EventManager(String str, String str2, IResourceManager iResourceManager, boolean z, List<String> list, Plugin plugin, String str3) {
        this.mIdentifier = str;
        this.mContainerKey = str2;
        this.mUseRemote = z;
        this.mJsEventHandler = new JsEventHandler(str2, iResourceManager, list);
        this.mPlugin = plugin;
        this.mClassNamespace = str3;
    }
}
