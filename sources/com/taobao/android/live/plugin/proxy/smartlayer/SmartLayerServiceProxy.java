package com.taobao.android.live.plugin.proxy.smartlayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLayerServiceProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import tb.k2n;
import tb.t2o;
import tb.u6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerServiceProxy extends k2n<ISmartLayerServiceProxy> implements ISmartLayerServiceProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartLayerServiceProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final SmartLayerServiceProxy f8768a = new SmartLayerServiceProxy();

        static {
            t2o.a(806355263);
        }

        public static /* synthetic */ SmartLayerServiceProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SmartLayerServiceProxy) ipChange.ipc$dispatch("2e7132d2", new Object[0]);
            }
            return f8768a;
        }
    }

    static {
        t2o.a(806355261);
        t2o.a(806355256);
    }

    public static SmartLayerServiceProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLayerServiceProxy) ipChange.ipc$dispatch("db93f338", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(SmartLayerServiceProxy smartLayerServiceProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/smartlayer/SmartLayerServiceProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ISmartLayerServiceProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLayerServiceProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveSmartLayerServicePlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy
    public ISmartLayerServiceProxy.a getSmartLayerService() {
        ISmartLayerServiceProxy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLayerServiceProxy.a) ipChange.ipc$dispatch("b5a091ef", new Object[]{this});
        }
        ISmartLayerServiceProxy real = getReal();
        if (real != null) {
            aVar = real.getSmartLayerService();
        } else {
            aVar = null;
        }
        FlexaLiveX.w("[SmartLayerServiceProxy#getSmartLayerService]  value: " + aVar);
        return aVar;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return u6q.TAG;
    }

    private SmartLayerServiceProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[SmartLayerServiceProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ISmartLayerServiceProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ISmartLayerServiceProxy) ipChange.ipc$dispatch("9c62655f", new Object[]{this})) : new SmartLayerServiceProxyX();
    }
}
