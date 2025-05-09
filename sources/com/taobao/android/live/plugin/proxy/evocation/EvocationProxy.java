package com.taobao.android.live.plugin.proxy.evocation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.EvocationProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EvocationProxy extends k2n<IEvocationProxy> implements IEvocationProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EvocationProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final EvocationProxy f8745a = new EvocationProxy();

        static {
            t2o.a(806355142);
        }

        public static /* synthetic */ EvocationProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EvocationProxy) ipChange.ipc$dispatch("c012d7df", new Object[0]);
            }
            return f8745a;
        }
    }

    static {
        t2o.a(806355140);
        t2o.a(806355143);
    }

    public static EvocationProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EvocationProxy) ipChange.ipc$dispatch("7410ecb9", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(EvocationProxy evocationProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/evocation/EvocationProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void appLinkRegisterPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea0658", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.appLinkRegisterPlugin();
        }
        FlexaLiveX.w("[EvocationProxy#appLinkRegisterPlugin]");
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void appLinkRegisterWXModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c389732", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.appLinkRegisterWXModule();
        }
        FlexaLiveX.w("[EvocationProxy#appLinkRegisterWXModule]");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IEvocationProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.EvocationProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "点淘唤端功能";
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void initTaoLiveEvocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba19079", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.initTaoLiveEvocation();
        }
        FlexaLiveX.w("[EvocationProxy#initTaoLiveEvocation]");
    }

    private EvocationProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[EvocationProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IEvocationProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IEvocationProxy) ipChange.ipc$dispatch("65a5ba0c", new Object[]{this})) : new EvocationProxyX();
    }
}
