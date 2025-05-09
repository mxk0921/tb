package com.alipay.mobile.beehive.eventbus;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3882a;
    public final Object b;
    public final Method c;
    public final ThreadMode d;
    public final SubscriberConfig e;
    public String f;
    public final int g;

    public EventHandler(Object obj, Object obj2, Method method, ThreadMode threadMode, SubscriberConfig subscriberConfig) {
        if (obj2 == null) {
            throw new IllegalArgumentException("EventHandler subscriber cannot be null");
        } else if (method != null) {
            this.f3882a = obj;
            this.e = subscriberConfig;
            if (isWeakRef()) {
                this.b = new WeakReference(obj2);
            } else {
                this.b = obj2;
            }
            this.c = method;
            method.setAccessible(true);
            this.d = threadMode;
            this.g = ((method.hashCode() + 31) * 31) + obj2.hashCode();
        } else {
            throw new IllegalArgumentException("EventHandler method cannot be null");
        }
    }

    public final WeakReference a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("25ff4d7", new Object[]{this});
        }
        if (!isWeakRef()) {
            return null;
        }
        Object obj = this.b;
        if (obj instanceof WeakReference) {
            return (WeakReference) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventHandler eventHandler = (EventHandler) obj;
        if (isWeakRef() == eventHandler.isWeakRef() && this.c.equals(eventHandler.c) && (getRealSubscriber() == eventHandler.getRealSubscriber() || isSameByUniqueId(eventHandler))) {
            return true;
        }
        return false;
    }

    public Object getEventKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e648590", new Object[]{this});
        }
        return this.f3882a;
    }

    public Object getRealSubscriber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7c36c96f", new Object[]{this});
        }
        if (!isWeakRef() || a() == null) {
            return this.b;
        }
        return a().get();
    }

    public Object getSubscriber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a7d0d3ed", new Object[]{this});
        }
        return this.b;
    }

    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("32e1b18", new Object[]{this});
        }
        return this.d;
    }

    public String getUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        SubscriberConfig subscriberConfig = this.e;
        if (subscriberConfig != null) {
            return subscriberConfig.uniqueId;
        }
        return "";
    }

    public String getWhiteListKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d818cb", new Object[]{this});
        }
        return this.f;
    }

    public void handleEvent(Object obj) throws InvocationTargetException {
        Method method = this.c;
        try {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Object realSubscriber = getRealSubscriber();
                if (realSubscriber != null) {
                    if (realSubscriber instanceof IEventSubscriber) {
                        method.invoke(realSubscriber, this.f3882a, obj);
                    } else if (parameterTypes.length == 1) {
                        method.invoke(realSubscriber, obj);
                    } else if (parameterTypes.length == 0) {
                        method.invoke(realSubscriber, new Object[0]);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw e2;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public boolean isSameByUniqueId(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd8d2e5", new Object[]{this, eventHandler})).booleanValue();
        }
        String uniqueId = getUniqueId();
        if (TextUtils.isEmpty(uniqueId) || !TextUtils.equals(uniqueId, eventHandler.getUniqueId())) {
            return false;
        }
        return true;
    }

    public boolean isSupportSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8846ab19", new Object[]{this})).booleanValue();
        }
        SubscriberConfig subscriberConfig = this.e;
        if (subscriberConfig == null || (!subscriberConfig.supportSticky && !subscriberConfig.supportPending)) {
            return false;
        }
        return true;
    }

    public boolean isWeakRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8014797c", new Object[]{this})).booleanValue();
        }
        SubscriberConfig subscriberConfig = this.e;
        if (subscriberConfig == null || !subscriberConfig.isWeakRef) {
            return false;
        }
        return true;
    }

    public boolean isZombie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69eb747b", new Object[]{this})).booleanValue();
        }
        if (!isWeakRef() || a() == null || a().get() != null) {
            return false;
        }
        return true;
    }

    public void setWhiteListKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c9750b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isWeakRef()) {
            str = this.b.toString() + "->" + getRealSubscriber();
        } else {
            str = this.b.toString();
        }
        return "EventHandler(key=" + this.f3882a + ",subscriber=" + str + ",method=" + this.c.getName() + f7l.BRACKET_END_STR;
    }
}
