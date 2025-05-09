package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetBeanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f4148a = new HashMap();

    public static final void clearAllBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b3dc6b", new Object[0]);
        } else {
            ((HashMap) f4148a).clear();
        }
    }

    public static final <T> T getBean(Class<T> cls) {
        T t = (T) getObject(cls);
        if (t != null) {
            return t;
        }
        synchronized (cls) {
            T t2 = (T) getObject(cls);
            if (t2 != null) {
                return t2;
            }
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            T newInstance = declaredConstructor.newInstance(new Object[0]);
            ((HashMap) f4148a).put(cls.getName(), newInstance);
            return newInstance;
        }
    }

    public static final <T> T getObject(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9dbd9ad1", new Object[]{cls});
        }
        try {
            T t = (T) ((HashMap) f4148a).get(cls.getName());
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error("NetBeanFactory", "1. BEAN_MAP.get exception. " + th.toString());
            return null;
        }
    }
}
