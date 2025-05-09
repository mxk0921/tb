package com.taobao.android.live.plugin.proxy.taoliveactionutils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.TaoLiveActionUtilsProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.geb;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveActionUtilsProxy extends k2n<ITaoLiveActionUtilsProxy> implements ITaoLiveActionUtilsProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLiveActionUtilsProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TaoLiveActionUtilsProxy f8769a = new TaoLiveActionUtilsProxy();

        static {
            t2o.a(806355267);
        }

        public static /* synthetic */ TaoLiveActionUtilsProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoLiveActionUtilsProxy) ipChange.ipc$dispatch("391767fd", new Object[0]);
            }
            return f8769a;
        }
    }

    static {
        t2o.a(806355265);
        t2o.a(806355264);
    }

    public static TaoLiveActionUtilsProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveActionUtilsProxy) ipChange.ipc$dispatch("9c4fba57", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveActionUtilsProxy taoLiveActionUtilsProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/taoliveactionutils/TaoLiveActionUtilsProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ITaoLiveActionUtilsProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.TaoLiveActionUtilsProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installTaoLiveActionUtilsPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "TaoLiveActionUtils远程化";
    }

    @Override // com.taobao.android.live.plugin.proxy.taoliveactionutils.ITaoLiveActionUtilsProxy
    public geb newActionUtils() {
        geb gebVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (geb) ipChange.ipc$dispatch("86f88612", new Object[]{this});
        }
        ITaoLiveActionUtilsProxy real = getReal();
        if (real != null) {
            gebVar = real.newActionUtils();
        } else {
            gebVar = null;
        }
        FlexaLiveX.w("[TaoLiveActionUtilsProxy#initTaoLiveActionUtils] " + gebVar);
        return gebVar;
    }

    private TaoLiveActionUtilsProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[TaoLiveActionUtilsProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ITaoLiveActionUtilsProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ITaoLiveActionUtilsProxy) ipChange.ipc$dispatch("c53770ba", new Object[]{this})) : new TaoLiveActionUtilsProxyX();
    }
}
