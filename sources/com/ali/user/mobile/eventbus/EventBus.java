package com.ali.user.mobile.eventbus;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EventBus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final EventBus INSTANCE = new EventBus();
    private final ConcurrentHashMap<String, List<EventListener>> eventListeners = new ConcurrentHashMap<>();
    private final Map<String, Event> persistentEvents = Collections.synchronizedMap(new LinkedHashMap());

    static {
        t2o.a(68157479);
    }

    public static EventBus getDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventBus) ipChange.ipc$dispatch("98921c5c", new Object[0]);
        }
        return INSTANCE;
    }

    public void registerEventListener(String str, EventListener eventListener) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e78b1e", new Object[]{this, str, eventListener});
            return;
        }
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (eventListener != null) {
            z2 = false;
        }
        if (!z2 && !z) {
            List<EventListener> list = this.eventListeners.get(str);
            if (list == null) {
                this.eventListeners.putIfAbsent(str, new CopyOnWriteArrayList());
                list = this.eventListeners.get(str);
            }
            list.add(eventListener);
            if (this.persistentEvents.get(str) != null) {
                sendEvent(str);
            }
        }
    }

    public void sendEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc10103", new Object[]{this, str});
        } else {
            sendEvent(str, null);
        }
    }

    public void unregisterEventListener(String str, EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16986865", new Object[]{this, str, eventListener});
            return;
        }
        List<EventListener> list = this.eventListeners.get(str);
        if (list != null) {
            list.remove(eventListener);
        }
    }

    public void sendEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88045422", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            sendEvent(Event.newEvent(str, map));
        }
    }

    private void sendEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754f838f", new Object[]{this, event});
            return;
        }
        List<EventListener> list = this.eventListeners.get(event.name);
        if (list == null || list.size() == 0) {
            this.persistentEvents.put(event.name, event);
            return;
        }
        for (EventListener eventListener : list) {
            try {
                eventListener.onEvent(event);
            } catch (Throwable th) {
                LoginTLogAdapter.e("eventBus", "fail to execute the event " + event.name + " the error message is " + th.getMessage(), th);
            }
        }
    }
}
