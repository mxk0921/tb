package com.alipay.mobile.common.transport;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalTransportCallbackRegistrar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static GlobalTransportCallbackRegistrar b;

    /* renamed from: a  reason: collision with root package name */
    public List<TransportCallback> f4046a;

    public static final GlobalTransportCallbackRegistrar getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalTransportCallbackRegistrar) ipChange.ipc$dispatch("154dc3ad", new Object[0]);
        }
        GlobalTransportCallbackRegistrar globalTransportCallbackRegistrar = b;
        if (globalTransportCallbackRegistrar != null) {
            return globalTransportCallbackRegistrar;
        }
        synchronized (GlobalTransportCallbackRegistrar.class) {
            try {
                GlobalTransportCallbackRegistrar globalTransportCallbackRegistrar2 = b;
                if (globalTransportCallbackRegistrar2 != null) {
                    return globalTransportCallbackRegistrar2;
                }
                GlobalTransportCallbackRegistrar globalTransportCallbackRegistrar3 = new GlobalTransportCallbackRegistrar();
                b = globalTransportCallbackRegistrar3;
                return globalTransportCallbackRegistrar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c4e369", new Object[]{this, transportCallback});
        } else if (transportCallback == null) {
            LogCatUtil.warn("GlobalTransportCallbackRegistrar", "[addTransportCallback] transportCallback is null.");
        } else {
            try {
                getCallbackList().add(transportCallback);
                LogCatUtil.info("GlobalTransportCallbackRegistrar", "[addTransportCallback] transportCallback class name = ".concat(transportCallback.getClass().getName()));
            } catch (Throwable th) {
                LogCatUtil.error("GlobalTransportCallbackRegistrar", "[addTransportCallback] Exception = " + th.toString(), th);
            }
        }
    }

    public List<TransportCallback> getCallbackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3b76a547", new Object[]{this});
        }
        List<TransportCallback> list = this.f4046a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            try {
                List<TransportCallback> list2 = this.f4046a;
                if (list2 != null) {
                    return list2;
                }
                List<TransportCallback> synchronizedList = Collections.synchronizedList(new ArrayList(1));
                this.f4046a = synchronizedList;
                return synchronizedList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<TransportCallback> refCallbackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6930946a", new Object[]{this});
        }
        return this.f4046a;
    }

    public void removeTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9eb3fa6", new Object[]{this, transportCallback});
        } else if (transportCallback == null) {
            LogCatUtil.warn("GlobalTransportCallbackRegistrar", "[removeTransportCallback] transportCallback is null.");
        } else {
            try {
                getCallbackList().remove(transportCallback);
                LogCatUtil.info("GlobalTransportCallbackRegistrar", "[removeTransportCallback] transportCallback class name = ".concat(transportCallback.getClass().getName()));
            } catch (Throwable th) {
                LogCatUtil.error("GlobalTransportCallbackRegistrar", "[removeTransportCallback] Exception = " + th.toString(), th);
            }
        }
    }
}
