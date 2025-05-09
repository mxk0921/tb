package com.ali.user.open.core.registry.impl;

import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.registry.ServiceRegistration;
import com.ali.user.open.core.registry.ServiceRegistry;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ProxyEnabledServiceRegistryDelegator implements ServiceRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceRegistry delegator;

    static {
        t2o.a(71303214);
        t2o.a(71303210);
    }

    public ProxyEnabledServiceRegistryDelegator(ServiceRegistry serviceRegistry) {
        this.delegator = serviceRegistry;
    }

    public static /* synthetic */ ServiceRegistry access$000(ProxyEnabledServiceRegistryDelegator proxyEnabledServiceRegistryDelegator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceRegistry) ipChange.ipc$dispatch("f026a27a", new Object[]{proxyEnabledServiceRegistryDelegator});
        }
        return proxyEnabledServiceRegistryDelegator.delegator;
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T getService(final Class<T> cls, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("53e3dec4", new Object[]{this, cls, map});
        }
        T t = (T) this.delegator.getService(cls, map);
        if (t != null || map == null || !cls.isInterface()) {
            return t;
        }
        return cls.cast(Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.ali.user.open.core.registry.impl.ProxyEnabledServiceRegistryDelegator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                Object service = ProxyEnabledServiceRegistryDelegator.access$000(ProxyEnabledServiceRegistryDelegator.this).getService(cls, map);
                if (service != null) {
                    return method.invoke(service, objArr);
                }
                SDKLogger.e(KernelContext.TAG, "SERVICE_NOT_AVAILABLE_ERROR");
                return null;
            }
        }));
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T[] getServices(Class<T> cls, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("71717aa4", new Object[]{this, cls, map}));
        }
        return (T[]) this.delegator.getServices(cls, map);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceRegistration) ipChange.ipc$dispatch("b40bb38d", new Object[]{this, clsArr, obj, map});
        }
        return this.delegator.registerService(clsArr, obj, map);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public Object unregisterService(ServiceRegistration serviceRegistration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dd33253d", new Object[]{this, serviceRegistration});
        }
        return this.delegator.unregisterService(serviceRegistration);
    }
}
