package com.alipay.mobile.beehive.eventbus;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SubscribeFinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, Map<Object, Set<Method>>> f3883a = new ConcurrentHashMap();
    public static SubscribeFinder ANNOTATED = new SubscribeFinder();

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            ((ConcurrentHashMap) f3883a).clear();
        }
    }

    public synchronized Map<Object, Set<EventHandler>> findAllSubscribers(Object obj, SubscriberConfig subscriberConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2866c710", new Object[]{this, obj, subscriberConfig});
        }
        HashMap hashMap = new HashMap();
        Map<Object, Set<Method>> findSubscriberMethods = findSubscriberMethods(obj);
        if (!findSubscriberMethods.isEmpty()) {
            for (Map.Entry<Object, Set<Method>> entry : findSubscriberMethods.entrySet()) {
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                for (Method method : entry.getValue()) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    String threadMode = subscribe.threadMode();
                    if (TextUtils.isEmpty(threadMode)) {
                        threadMode = ThreadMode.CURRENT.name();
                    }
                    EventHandler eventHandler = new EventHandler(entry.getKey(), obj, method, ThreadMode.fromString(threadMode), subscriberConfig);
                    eventHandler.setWhiteListKey(subscribe.whiteListKey());
                    copyOnWriteArraySet.add(eventHandler);
                }
                hashMap.put(entry.getKey(), copyOnWriteArraySet);
            }
        }
        return hashMap;
    }

    public Map<Object, Set<Method>> findSubscriberMethods(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee6dba89", new Object[]{this, obj});
        }
        Class<?> cls = obj.getClass();
        Map<Object, Set<Method>> map = (Map) ((ConcurrentHashMap) f3883a).get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        a(cls, hashMap);
        return hashMap;
    }

    public final synchronized void a(Class<?> cls, Map<Object, Set<Method>> map) {
        Method[] methods;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fe4f10", new Object[]{this, cls, map});
            return;
        }
        for (Method method : cls.getMethods()) {
            if (!method.isBridge() && method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 1) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    if (!TextUtils.isEmpty(subscribe.name())) {
                        str = subscribe.name();
                    } else if (parameterTypes.length > 0) {
                        Class<?> cls2 = parameterTypes[0];
                        if (!cls2.isInterface()) {
                            str = cls2;
                            if ((method.getModifiers() & 1) == 0) {
                                if ((method.getModifiers() & 4) != 0) {
                                    str = cls2;
                                } else {
                                    throw new IllegalArgumentException("method:" + method + " @Subscribe方法必须为public或protected");
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("method:" + method + " @Subscribe第一个参数不能为接口类型");
                        }
                    } else {
                        throw new IllegalArgumentException("method:" + method + "@Subscribe方法无参数的时候, 注解参数name不能为空");
                    }
                    Set<Method> set = map.get(str);
                    if (set == null) {
                        set = new CopyOnWriteArraySet<>();
                        map.put(str, set);
                    }
                    set.add(method);
                } else {
                    throw new IllegalArgumentException("method:" + method + "@Subscribe方法参数不能超过1个");
                }
            }
        }
        ((ConcurrentHashMap) f3883a).put(cls, map);
    }
}
