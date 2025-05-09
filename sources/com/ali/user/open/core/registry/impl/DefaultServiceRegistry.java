package com.ali.user.open.core.registry.impl;

import com.ali.user.open.core.registry.ServiceRegistration;
import com.ali.user.open.core.registry.ServiceRegistry;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DefaultServiceRegistry implements ServiceRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<Class<?>, List<ServiceEntry>> typeServiceEntries = new HashMap();
    private Map<ServiceRegistration, ServiceEntry> registrationServiceEntries = new HashMap();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class InternalServiceRegistration implements ServiceRegistration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, String> properties;
        private ServiceRegistry serviceRegistry;
        private final String uuid = UUID.randomUUID().toString();

        static {
            t2o.a(71303212);
            t2o.a(71303209);
        }

        public InternalServiceRegistration(ServiceRegistry serviceRegistry, Map<String, String> map) {
            this.serviceRegistry = serviceRegistry;
            this.properties = map;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.uuid.equals(((InternalServiceRegistration) obj).uuid);
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.uuid;
            if (str != null) {
                i = str.hashCode();
            }
            return 31 + i;
        }

        @Override // com.ali.user.open.core.registry.ServiceRegistration
        public void setProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5217c6c9", new Object[]{this, map});
            } else if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!(entry.getKey() == null || entry.getValue() == null)) {
                        this.properties.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        @Override // com.ali.user.open.core.registry.ServiceRegistration
        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.serviceRegistry.unregisterService(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ServiceEntry {
        public Object instance;
        public Map<String, String> properties;
        public Class<?>[] types;

        static {
            t2o.a(71303213);
        }
    }

    static {
        t2o.a(71303211);
        t2o.a(71303210);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T getService(Class<T> cls, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("53e3dec4", new Object[]{this, cls, map});
        }
        this.lock.readLock().lock();
        try {
            List<ServiceEntry> list = this.typeServiceEntries.get(cls);
            if (!(list == null || list.size() == 0)) {
                if (!(map == null || map.size() == 0)) {
                    for (ServiceEntry serviceEntry : list) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String str = serviceEntry.properties.get(entry.getKey());
                            if (str != null) {
                                if (!str.equals(entry.getValue())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        T cast = cls.cast(serviceEntry.instance);
                        this.lock.readLock().unlock();
                        return cast;
                    }
                }
                T cast2 = cls.cast(list.get(0).instance);
                this.lock.readLock().unlock();
                return cast2;
            }
            return null;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T[] getServices(Class<T> cls, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("71717aa4", new Object[]{this, cls, map}));
        }
        this.lock.readLock().lock();
        try {
            List<ServiceEntry> list = this.typeServiceEntries.get(cls);
            if (!(list == null || list.size() == 0)) {
                if (!(map == null || map.size() == 0)) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (ServiceEntry serviceEntry : list) {
                        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                arrayList.add(cls.cast(serviceEntry.instance));
                                break;
                            }
                            Map.Entry<String, String> next = it.next();
                            String str = serviceEntry.properties.get(next.getKey());
                            if (str != null) {
                                if (!str.equals(next.getValue())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    T[] tArr = (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
                    this.lock.readLock().unlock();
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, list.size()));
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    tArr2[i] = cls.cast(list.get(i).instance);
                }
                this.lock.readLock().unlock();
                return tArr2;
            }
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
            this.lock.readLock().unlock();
            return tArr3;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public Object unregisterService(ServiceRegistration serviceRegistration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dd33253d", new Object[]{this, serviceRegistration});
        }
        if (serviceRegistration == null) {
            return null;
        }
        this.lock.writeLock().lock();
        try {
            ServiceEntry remove = this.registrationServiceEntries.remove(serviceRegistration);
            if (remove == null) {
                this.lock.writeLock().unlock();
                return null;
            }
            Class<?>[] clsArr = remove.types;
            if (clsArr != null) {
                for (Class<?> cls : clsArr) {
                    List<ServiceEntry> list = this.typeServiceEntries.get(cls);
                    Iterator<ServiceEntry> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() == remove) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (list.size() == 0) {
                        this.typeServiceEntries.remove(cls);
                    }
                }
            }
            Object obj = remove.instance;
            this.lock.writeLock().unlock();
            return obj;
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceRegistration) ipChange.ipc$dispatch("b40bb38d", new Object[]{this, clsArr, obj, map});
        }
        if (clsArr == null || clsArr.length == 0 || obj == null) {
            throw new IllegalArgumentException("service types and instance must not be null");
        }
        ServiceEntry serviceEntry = new ServiceEntry();
        serviceEntry.instance = obj;
        serviceEntry.types = clsArr;
        serviceEntry.properties = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    serviceEntry.properties.put(entry.getKey(), entry.getValue());
                }
            }
        }
        this.lock.writeLock().lock();
        try {
            for (Class<?> cls : clsArr) {
                List<ServiceEntry> list = this.typeServiceEntries.get(cls);
                if (list == null) {
                    list = new ArrayList<>(2);
                    this.typeServiceEntries.put(cls, list);
                }
                list.add(serviceEntry);
            }
            InternalServiceRegistration internalServiceRegistration = new InternalServiceRegistration(this, serviceEntry.properties);
            this.registrationServiceEntries.put(internalServiceRegistration, serviceEntry);
            this.lock.writeLock().unlock();
            return internalServiceRegistration;
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }
}
