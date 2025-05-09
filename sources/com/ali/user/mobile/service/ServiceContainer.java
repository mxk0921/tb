package com.ali.user.mobile.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ServiceContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ServiceContainer serviceContainer;
    private Map<Class<?>, ServiceEntry> serviceEntries = new HashMap();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ServiceEntry {
        public Object instance;
        public Map<String, String> properties;
        public Class<?> type;

        static {
            t2o.a(68157616);
        }
    }

    static {
        t2o.a(68157615);
    }

    private ServiceContainer() {
    }

    public static ServiceContainer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceContainer) ipChange.ipc$dispatch("adeb7345", new Object[0]);
        }
        if (serviceContainer == null) {
            synchronized (ServiceContainer.class) {
                try {
                    if (serviceContainer == null) {
                        serviceContainer = new ServiceContainer();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return serviceContainer;
    }

    public <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{this, cls});
        }
        if (cls == null) {
            return null;
        }
        this.lock.readLock().lock();
        try {
            ServiceEntry serviceEntry = this.serviceEntries.get(cls);
            if (serviceEntry == null) {
                return null;
            }
            return cls.cast(serviceEntry.instance);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean registerService(Class<?> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84aaa524", new Object[]{this, cls, obj})).booleanValue();
        }
        if (cls == null || obj == null) {
            throw new IllegalArgumentException("service types and instance must not be null");
        }
        ServiceEntry serviceEntry = new ServiceEntry();
        serviceEntry.instance = obj;
        serviceEntry.type = cls;
        serviceEntry.properties = Collections.synchronizedMap(new HashMap());
        this.lock.writeLock().lock();
        try {
            this.serviceEntries.put(cls, serviceEntry);
            return true;
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
