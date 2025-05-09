package com.alipay.mobile.beehive.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventBusManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EventBus";
    public static EventBusManager g;

    /* renamed from: a  reason: collision with root package name */
    public final String f3881a;
    public ConcurrentHashMap<Object, Set<EventHandler>> b;
    public ConcurrentHashMap<Object, List<String>> c;
    public ConcurrentLinkedQueue<Event> d;
    public Handler e;
    public SubscribeFinder f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class EventHandlerWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Event event;
        public final EventConfig eventConfig;
        public final EventHandler handler;

        public EventHandlerWrapper(Event event, EventHandler eventHandler, EventConfig eventConfig) {
            this.event = event;
            this.handler = eventHandler;
            this.eventConfig = eventConfig;
        }

        public Object getEventData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7e8dff9d", new Object[]{this});
            }
            Event event = this.event;
            if (event != null) {
                return event.data;
            }
            return null;
        }

        public Object getEventName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("bb2cbb5c", new Object[]{this});
            }
            Event event = this.event;
            if (event != null) {
                return event.name;
            }
            return null;
        }
    }

    public EventBusManager() {
        this.f3881a = "DEFAULT";
        t();
    }

    public static /* synthetic */ void access$000(EventBusManager eventBusManager, EventHandlerWrapper eventHandlerWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977ec734", new Object[]{eventBusManager, eventHandlerWrapper});
        } else {
            c(eventHandlerWrapper);
        }
    }

    public static void c(EventHandlerWrapper eventHandlerWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc369ba7", new Object[]{eventHandlerWrapper});
            return;
        }
        try {
            eventHandlerWrapper.handler.handleEvent(eventHandlerWrapper.event.data);
        } catch (InvocationTargetException e) {
            LoggerFactory.getTraceLogger().warn(TAG, e);
        }
    }

    public static synchronized EventBusManager getInstance() {
        synchronized (EventBusManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EventBusManager) ipChange.ipc$dispatch("78edc3c2", new Object[0]);
            }
            if (g == null) {
                g = new EventBusManager();
            }
            return g;
        }
    }

    public static void h(Queue<Event> queue, Event event, Set<EventHandler> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73f974c", new Object[]{queue, event, set});
        } else if (event != null) {
            ArrayList arrayList = new ArrayList();
            for (EventHandler eventHandler : set) {
                if (eventHandler != null && TextUtils.isEmpty(eventHandler.getUniqueId())) {
                    arrayList.add(eventHandler.getUniqueId());
                }
            }
            if (queue.add(event)) {
                event.setUniqueIds(arrayList);
                g(queue);
            }
        }
    }

    public static boolean q(Set<EventHandler> set, Set<EventHandler> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3306504d", new Object[]{set, set2})).booleanValue();
        }
        Set<EventHandler> r = r(set, set2);
        if (r == null || r.isEmpty()) {
            return false;
        }
        return set.removeAll(r);
    }

    public static Set<EventHandler> r(Set<EventHandler> set, Set<EventHandler> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("168a1279", new Object[]{set, set2});
        }
        CopyOnWriteArraySet copyOnWriteArraySet = null;
        for (EventHandler eventHandler : set) {
            Iterator<EventHandler> it = set2.iterator();
            while (true) {
                if (it.hasNext()) {
                    EventHandler next = it.next();
                    if (eventHandler.equals(next)) {
                        if (copyOnWriteArraySet == null) {
                            copyOnWriteArraySet = new CopyOnWriteArraySet();
                        }
                        copyOnWriteArraySet.add(next);
                    }
                }
            }
        }
        return copyOnWriteArraySet;
    }

    public static Set<EventHandler> s(Set<EventHandler> set, Set<EventHandler> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("1613ac7a", new Object[]{set, set2});
        }
        if (set == null || set.isEmpty()) {
            return set2;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = null;
        for (EventHandler eventHandler : set2) {
            Iterator<EventHandler> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(eventHandler)) {
                        break;
                    }
                } else {
                    if (copyOnWriteArraySet == null) {
                        copyOnWriteArraySet = new CopyOnWriteArraySet();
                    }
                    copyOnWriteArraySet.add(eventHandler);
                }
            }
        }
        return copyOnWriteArraySet;
    }

    public final Set<EventHandler> a(Object obj, Set<EventHandler> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9fcf84aa", new Object[]{this, obj, set});
        }
        List<String> list = this.c.get(obj);
        if (list == null || list.isEmpty()) {
            return set;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        for (EventHandler eventHandler : set) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(eventHandler.getWhiteListKey(), it.next())) {
                        copyOnWriteArraySet.add(eventHandler);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return copyOnWriteArraySet;
    }

    public void addWhiteList(Object obj, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2035a3da", new Object[]{this, obj, list});
        } else if (obj == null || list == null || list.isEmpty()) {
            LoggerFactory.getTraceLogger().warn(TAG, "values to add white list must not be null");
        } else {
            this.c.remove(obj);
            this.c.put(obj, list);
        }
    }

    public final void d(IEventSubscriber iEventSubscriber, ThreadMode threadMode, SubscriberConfig subscriberConfig, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e74c12", new Object[]{this, iEventSubscriber, threadMode, subscriberConfig, strArr});
        } else if (strArr != null) {
            for (String str : strArr) {
                innerRegisterWithInterface(iEventSubscriber, threadMode, subscriberConfig, str);
            }
        }
    }

    public void dispatchEventToThread(final EventHandlerWrapper eventHandlerWrapper) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a95240b", new Object[]{this, eventHandlerWrapper});
            return;
        }
        EventHandler eventHandler = eventHandlerWrapper.handler;
        if (eventHandler.getThreadMode() == ThreadMode.CURRENT) {
            c(eventHandlerWrapper);
        } else if (eventHandler.getThreadMode() == ThreadMode.BACKGROUND) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.mobile.beehive.eventbus.EventBusManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        EventBusManager.access$000(EventBusManager.this, eventHandlerWrapper);
                    }
                }
            });
        } else if (eventHandler.getThreadMode() == ThreadMode.UI) {
            Handler handler = this.e;
            Runnable runnable = new Runnable() { // from class: com.alipay.mobile.beehive.eventbus.EventBusManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        EventBusManager.access$000(EventBusManager.this, eventHandlerWrapper);
                    }
                }
            };
            EventConfig eventConfig = eventHandlerWrapper.eventConfig;
            if (eventConfig == null || !eventConfig.isAtFront) {
                if (eventConfig != null) {
                    j = eventConfig.timestamp;
                } else {
                    j = 0;
                }
                if (j <= 0) {
                    handler.post(runnable);
                } else {
                    handler.postAtTime(runnable, j);
                }
            } else {
                handler.postAtFrontOfQueue(runnable);
            }
        }
    }

    public synchronized void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.b.clear();
        this.f.dispose();
    }

    public final void e(IEventSubscriber iEventSubscriber, boolean z, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258c1155", new Object[]{this, iEventSubscriber, new Boolean(z), strArr});
        } else if (strArr != null) {
            for (String str : strArr) {
                innerUnregisterWithInterface(iEventSubscriber, z, str);
            }
        }
    }

    public final void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        for (Set<EventHandler> set : this.b.values()) {
            if (set != null && !set.isEmpty()) {
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                for (EventHandler eventHandler : set) {
                    if (obj == eventHandler.getRealSubscriber()) {
                        copyOnWriteArraySet.add(eventHandler);
                    }
                }
                k(set, copyOnWriteArraySet);
            }
        }
    }

    public boolean innerRegisterWithInterface(IEventSubscriber iEventSubscriber, ThreadMode threadMode, SubscriberConfig subscriberConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0d76742", new Object[]{this, iEventSubscriber, threadMode, subscriberConfig, str})).booleanValue();
        }
        if (iEventSubscriber == null) {
            throw new IllegalArgumentException("target to register must not be null.");
        } else if (!TextUtils.isEmpty(str)) {
            return l(subscriberConfig, b(str, iEventSubscriber, threadMode, subscriberConfig), str);
        } else {
            throw new IllegalArgumentException("register eventName must not be empty");
        }
    }

    public void innerUnregister(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f964031f", new Object[]{this, obj, new Boolean(z)});
        } else if (obj != null) {
            SubscriberConfig subscriberConfig = new SubscriberConfig();
            subscriberConfig.isWeakRef = z;
            if (obj instanceof IEventSubscriber) {
                f(obj);
            } else {
                Map<Object, Set<EventHandler>> findAllSubscribers = this.f.findAllSubscribers(obj, subscriberConfig);
                for (Object obj2 : findAllSubscribers.keySet()) {
                    Set<EventHandler> set = this.b.get(obj2);
                    if (set != null) {
                        k(set, findAllSubscribers.get(obj2));
                    }
                }
            }
            o();
        } else {
            throw new IllegalArgumentException("待注销的subscriber不能为null");
        }
    }

    public void innerUnregisterWithInterface(IEventSubscriber iEventSubscriber, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302b8f74", new Object[]{this, iEventSubscriber, new Boolean(z), str});
        } else if (iEventSubscriber == null) {
            throw new IllegalArgumentException("target to unregister must not be null.");
        } else if (!TextUtils.isEmpty(str)) {
            Set<EventHandler> set = this.b.get(str);
            if (set != null) {
                SubscriberConfig subscriberConfig = new SubscriberConfig();
                subscriberConfig.isWeakRef = z;
                k(set, b(str, iEventSubscriber, ThreadMode.CURRENT, subscriberConfig));
                o();
            }
        } else {
            throw new IllegalArgumentException("unregister eventName must not be empty");
        }
    }

    public final void j(Set<EventHandler> set, Event event, EventConfig eventConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869441cb", new Object[]{this, set, event, eventConfig});
        } else {
            p(set, event, eventConfig);
        }
    }

    public final boolean l(SubscriberConfig subscriberConfig, Set<EventHandler> set, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0173e6", new Object[]{this, subscriberConfig, set, obj})).booleanValue();
        }
        boolean n = n(set, obj);
        if (n && subscriberConfig.isSupportSticky()) {
            i(this.d, obj, subscriberConfig.uniqueId, set);
        }
        return n;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93da808", new Object[]{this});
            return;
        }
        try {
            Iterator<Map.Entry<Object, Set<EventHandler>>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Set<EventHandler> value = it.next().getValue();
                if (value != null && !value.isEmpty()) {
                    if (!value.isEmpty()) {
                        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                        for (EventHandler eventHandler : value) {
                            if (eventHandler != null && eventHandler.isZombie()) {
                                copyOnWriteArraySet.add(eventHandler);
                            }
                        }
                        value.removeAll(copyOnWriteArraySet);
                    }
                }
                it.remove();
            }
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().warn(TAG, e);
        }
    }

    public final void p(Set<EventHandler> set, Event event, EventConfig eventConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70f576a", new Object[]{this, set, event, eventConfig});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (EventHandler eventHandler : set) {
            if (eventHandler != null) {
                arrayList.add(new EventHandlerWrapper(event, eventHandler, eventConfig));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EventHandlerWrapper eventHandlerWrapper = (EventHandlerWrapper) it.next();
            if (!(eventHandlerWrapper == null || eventHandlerWrapper.event == null || eventHandlerWrapper.handler == null)) {
                dispatchEventToThread(eventHandlerWrapper);
            }
        }
    }

    public void post(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8c6143", new Object[]{this, obj});
        } else {
            post(obj, "");
        }
    }

    public void postAtFront(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae044ea3", new Object[]{this, obj, str});
            return;
        }
        EventConfig eventConfig = new EventConfig();
        eventConfig.isAtFront = true;
        post(obj, str, eventConfig);
    }

    public void postByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89f4153", new Object[]{this, str});
        } else {
            post(null, str);
        }
    }

    public void postDelayed(Object obj, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386ba294", new Object[]{this, obj, str, new Integer(i)});
            return;
        }
        EventConfig eventConfig = new EventConfig();
        eventConfig.timestamp = SystemClock.uptimeMillis() + i;
        post(obj, str, eventConfig);
    }

    public boolean register(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba54430a", new Object[]{this, obj})).booleanValue();
        }
        SubscriberConfig subscriberConfig = new SubscriberConfig();
        subscriberConfig.isWeakRef = true;
        return m(obj, subscriberConfig);
    }

    public boolean registerRaw(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6b896c", new Object[]{this, obj})).booleanValue();
        }
        SubscriberConfig subscriberConfig = new SubscriberConfig();
        subscriberConfig.isWeakRef = false;
        return m(obj, subscriberConfig);
    }

    public void removeWhiteList(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cb4ca6", new Object[]{this, obj});
        } else if (obj == null) {
            LoggerFactory.getTraceLogger().warn(TAG, "event to remove from white list must not be null");
        } else {
            this.c.remove(obj);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentLinkedQueue<>();
        this.f = SubscribeFinder.ANNOTATED;
        this.e = new Handler(Looper.getMainLooper());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[Bus \"" + this.f3881a + "\"]";
    }

    public void unregister(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4677fdf", new Object[]{this, obj});
        } else {
            innerUnregister(obj, true);
        }
    }

    public void unregisterRaw(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22171ef", new Object[]{this, obj});
        } else {
            innerUnregister(obj, false);
        }
    }

    public static void k(Set<EventHandler> set, Set<EventHandler> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2d9088", new Object[]{set, set2});
        } else if (set2 != null) {
            try {
                if (set2.isEmpty()) {
                    return;
                }
                if (!q(set, set2)) {
                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                    traceLogger.info(TAG, "注销事件失败: 可能未注册或已注销, " + set2.toString());
                    return;
                }
                LogUtil.record(2, "EventBusManager", "注销事件成功:" + set2.toString());
            } catch (Exception e) {
                LoggerFactory.getTraceLogger().warn(TAG, e);
            }
        }
    }

    public final void i(Queue<Event> queue, Object obj, String str, Set<EventHandler> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e23851", new Object[]{this, queue, obj, str, set});
        } else if (set != null && !set.isEmpty()) {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            EventConfig eventConfig = new EventConfig();
            Iterator<Event> it = queue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Event next = it.next();
                if (Event.keyEqual(obj, next.key) && !next.isConsumed(str)) {
                    LogUtil.record(2, "EventBusManager", "消费pending队列事件: " + next.toString());
                    j(set, next, eventConfig);
                    concurrentLinkedQueue.add(next);
                    break;
                }
            }
            if (!concurrentLinkedQueue.isEmpty()) {
                queue.removeAll(concurrentLinkedQueue);
            }
        }
    }

    public final boolean m(Object obj, SubscriberConfig subscriberConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baa47bc1", new Object[]{this, obj, subscriberConfig})).booleanValue();
        }
        if (obj != null) {
            Map<Object, Set<EventHandler>> findAllSubscribers = this.f.findAllSubscribers(obj, subscriberConfig);
            for (Object obj2 : findAllSubscribers.keySet()) {
                l(subscriberConfig, a(obj2, findAllSubscribers.get(obj2)), obj2);
            }
            return true;
        }
        throw new IllegalArgumentException("subscriber to register must not be null.");
    }

    public void post(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f2e04d", new Object[]{this, obj, str});
        } else {
            post(obj, str, null);
        }
    }

    public void unregister(IEventSubscriber iEventSubscriber, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1a3fb0", new Object[]{this, iEventSubscriber, strArr});
        } else {
            e(iEventSubscriber, true, strArr);
        }
    }

    public void unregisterRaw(IEventSubscriber iEventSubscriber, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f005c0", new Object[]{this, iEventSubscriber, strArr});
        } else {
            e(iEventSubscriber, false, strArr);
        }
    }

    public static void g(Queue<Event> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840e3e08", new Object[]{queue});
        } else if (queue.size() > 32) {
            int size = queue.size() - 32;
            LogUtil.record(2, "EventBusManager", "pending事件队列超限: 删除前" + String.valueOf(size) + "个事件");
            for (int i = 0; i < size; i++) {
                queue.poll();
            }
        }
    }

    public final boolean n(Set<EventHandler> set, Object obj) {
        Set<EventHandler> putIfAbsent;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5193d77", new Object[]{this, set, obj})).booleanValue();
        }
        Set<EventHandler> set2 = this.b.get(obj);
        if (set2 == null && (putIfAbsent = this.b.putIfAbsent(obj, (set2 = new CopyOnWriteArraySet<>()))) != null) {
            set2 = putIfAbsent;
        }
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    Set<EventHandler> s = s(set2, set);
                    if (s == null || s.isEmpty()) {
                        LogUtil.record(2, "EventBusManager", "注册事件失败: (" + obj + ")=> " + set.toString() + ", 可能已经注册过?");
                    } else {
                        z = set2.addAll(s);
                        LogUtil.record(2, "EventBusManager", "注册事件成功: " + set.toString());
                    }
                }
            } catch (Exception e) {
                LoggerFactory.getTraceLogger().warn(TAG, e);
            }
        }
        return z;
    }

    public void post(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d235772", new Object[]{this, event});
        } else {
            post(event.data, event.name, null);
        }
    }

    public EventBusManager(String str) {
        if (!"DEFAULT".equals(str)) {
            this.f3881a = str;
            t();
            return;
        }
        throw new IllegalArgumentException("cannot create 'DEFAULT' event bus, because 'DEFAULT' is global event bus");
    }

    public static Set<EventHandler> b(String str, IEventSubscriber iEventSubscriber, ThreadMode threadMode, SubscriberConfig subscriberConfig) {
        Method method;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("256efa12", new Object[]{str, iEventSubscriber, threadMode, subscriberConfig});
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        try {
            method = iEventSubscriber.getClass().getMethod(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, String.class, Object.class);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn(TAG, th.getMessage());
        }
        if (method != null && (method.getModifiers() & 1024) == 0) {
            copyOnWriteArraySet.add(new EventHandler(str, iEventSubscriber, method, threadMode, subscriberConfig));
            return copyOnWriteArraySet;
        }
        LoggerFactory.getTraceLogger().warn(TAG, "target未实现onEvent方法, 是否被混淆了?");
        return copyOnWriteArraySet;
    }

    public void post(Object obj, String str, EventConfig eventConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e5c76", new Object[]{this, obj, str, eventConfig});
            return;
        }
        Event event = new Event(str, obj);
        if (!Event.isValid(event)) {
            LogUtil.record(2, "EventBusManager", "事件无效,事件key名或事件数据不能都为null");
            return;
        }
        if (eventConfig == null) {
            eventConfig = new EventConfig();
        }
        Set<EventHandler> set = this.b.get(event.key);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        if (set != null) {
            for (EventHandler eventHandler : set) {
                if (eventHandler.getRealSubscriber() != null) {
                    copyOnWriteArraySet.add(eventHandler);
                }
            }
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            j(copyOnWriteArraySet, event, eventConfig);
        } else if (MspConfig.getInstance().isDebug()) {
            LogUtil.record(2, "EventBusManager", toString() + " 分发事件失败(未找到监听者): " + event.name);
        }
        if (eventConfig.isSticky) {
            LogUtil.record(2, "EventBusManager", "添加pending事件入队列: " + event.toString());
            h(this.d, event, copyOnWriteArraySet);
        }
    }

    public void register(IEventSubscriber iEventSubscriber, ThreadMode threadMode, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20b1509", new Object[]{this, iEventSubscriber, threadMode, strArr});
            return;
        }
        SubscriberConfig subscriberConfig = new SubscriberConfig();
        subscriberConfig.isWeakRef = true;
        d(iEventSubscriber, threadMode, subscriberConfig, strArr);
    }

    public void registerRaw(IEventSubscriber iEventSubscriber, ThreadMode threadMode, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6193e7", new Object[]{this, iEventSubscriber, threadMode, strArr});
            return;
        }
        SubscriberConfig subscriberConfig = new SubscriberConfig();
        subscriberConfig.isWeakRef = false;
        d(iEventSubscriber, threadMode, subscriberConfig, strArr);
    }

    public void register(Object obj, SubscriberConfig subscriberConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5669403b", new Object[]{this, obj, subscriberConfig});
        } else {
            m(obj, subscriberConfig);
        }
    }

    public void register(IEventSubscriber iEventSubscriber, ThreadMode threadMode, SubscriberConfig subscriberConfig, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3030e54", new Object[]{this, iEventSubscriber, threadMode, subscriberConfig, strArr});
        } else {
            d(iEventSubscriber, threadMode, subscriberConfig, strArr);
        }
    }
}
