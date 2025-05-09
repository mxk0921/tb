package com.alipay.mobile.common.transport.interceptors;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransportInterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TransportInterceptorManager b;

    /* renamed from: a  reason: collision with root package name */
    public List<TransportInterceptor> f4117a;

    public static final TransportInterceptorManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportInterceptorManager) ipChange.ipc$dispatch("dc40247f", new Object[0]);
        }
        TransportInterceptorManager transportInterceptorManager = b;
        if (transportInterceptorManager != null) {
            return transportInterceptorManager;
        }
        synchronized (TransportInterceptorManager.class) {
            try {
                TransportInterceptorManager transportInterceptorManager2 = b;
                if (transportInterceptorManager2 != null) {
                    return transportInterceptorManager2;
                }
                TransportInterceptorManager transportInterceptorManager3 = new TransportInterceptorManager();
                b = transportInterceptorManager3;
                return transportInterceptorManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<TransportInterceptor> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<TransportInterceptor> list = this.f4117a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            try {
                List<TransportInterceptor> list2 = this.f4117a;
                if (list2 != null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(1);
                this.f4117a = arrayList;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addInterceptor(TransportInterceptor transportInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca87fb1", new Object[]{this, transportInterceptor});
        } else if (transportInterceptor == null) {
            LogCatUtil.warn("TransportInterceptorManager", "addInterceptor.   Illegal argument, transportInterceptor maybe null");
        } else if (a().contains(transportInterceptor)) {
            LogCatUtil.warn("TransportInterceptorManager", "addInterceptor.   Illegal argument, transportInterceptor already exists.");
        } else {
            a().add(transportInterceptor);
        }
    }

    public synchronized void onPreTransportInterceptor(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6160e734", new Object[]{this, str, map});
            return;
        }
        List<TransportInterceptor> list = this.f4117a;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.f4117a).iterator();
            while (it.hasNext()) {
                TransportInterceptor transportInterceptor = (TransportInterceptor) it.next();
                long currentTimeMillis = System.currentTimeMillis();
                transportInterceptor.preRequestInterceptor(str, map);
                LogCatUtil.warn("TransportInterceptorManager", "preRequestInterceptor finish. obj = [" + transportInterceptor.getClass().getName() + "], cost time: " + (System.currentTimeMillis() + currentTimeMillis));
            }
        }
    }

    public synchronized void removeInterceptor(TransportInterceptor transportInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720a73ae", new Object[]{this, transportInterceptor});
            return;
        }
        List<TransportInterceptor> list = this.f4117a;
        if (list != null && !((ArrayList) list).isEmpty()) {
            if (transportInterceptor != null) {
                a().remove(transportInterceptor);
            }
        }
    }
}
