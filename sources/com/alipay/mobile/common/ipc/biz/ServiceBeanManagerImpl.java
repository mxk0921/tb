package com.alipay.mobile.common.ipc.biz;

import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ServiceBeanManagerImpl implements ServiceBeanManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f3930a = new ConcurrentHashMap();

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public Object getServiceBean(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("299c8312", new Object[]{this, str});
        }
        Object obj = ((ConcurrentHashMap) this.f3930a).get(str);
        StringBuilder sb = new StringBuilder("getServiceBean className=");
        sb.append(str);
        sb.append(",obj is ");
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        sb.append(str2);
        LogCatUtil.info("IPC_ServiceBeanManager", sb.toString());
        return obj;
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public int getServiceBeanCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a92f5bfa", new Object[]{this})).intValue();
        }
        return ((ConcurrentHashMap) this.f3930a).size();
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void register(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9797d0", new Object[]{this, str, obj});
        } else if (((ConcurrentHashMap) this.f3930a).get(str) == null) {
            ((ConcurrentHashMap) this.f3930a).put(str, obj);
            LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "ihashcode=[" + hashCode() + "]   register className=" + str);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void registerAndOverride(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b7a04d", new Object[]{this, str, obj});
            return;
        }
        ((ConcurrentHashMap) this.f3930a).put(str, obj);
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "ihashcode=[" + hashCode() + "]  registerAndOverride className=" + str);
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void unregister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
            return;
        }
        ((ConcurrentHashMap) this.f3930a).remove(str);
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "unregister className=" + str);
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void unregisterAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.f3930a).clear();
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "unregisterAll");
    }
}
