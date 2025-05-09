package com.taobao.android.live.plugin.proxy.kmp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import com.taobao.kmp.nexus.arch.openArch.OpenArchProxy;
import com.taobao.kmp.nexus.arch.openArch.service.message.flexa.OpenArchMessageProxy;
import com.taobao.live.liveroom.liveBizComponent.ktProxy.TaoLiveKtBridgeProxyX;
import java.util.HashMap;
import tb.k2n;
import tb.nyd;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveKtBridgeProxy extends k2n<ITaoLiveKtBridgeProxy> implements ITaoLiveKtBridgeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLiveKtBizManagerProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TaoLiveKtBridgeProxy f8753a = new TaoLiveKtBridgeProxy();

        static {
            t2o.a(806355182);
        }

        public static /* synthetic */ TaoLiveKtBridgeProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoLiveKtBridgeProxy) ipChange.ipc$dispatch("66fc186d", new Object[0]);
            }
            return f8753a;
        }
    }

    static {
        t2o.a(806355180);
        t2o.a(1003487258);
    }

    public static TaoLiveKtBridgeProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtBridgeProxy) ipChange.ipc$dispatch("1afa2d47", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtBridgeProxy taoLiveKtBridgeProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/kmp/TaoLiveKtBridgeProxy");
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public void clearBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b13e4e", new Object[]{this});
            return;
        }
        ITaoLiveKtBridgeProxy real = getReal();
        if (real != null) {
            real.clearBizManager();
        }
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public void clearSwitchRoomManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb743b8", new Object[]{this});
            return;
        }
        ITaoLiveKtBridgeProxy real = getReal();
        if (real != null) {
            real.clearSwitchRoomManager();
        }
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public ITaoLiveKtComponentOpenService getBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtComponentOpenService) ipChange.ipc$dispatch("950a88f8", new Object[]{this});
        }
        ITaoLiveKtBridgeProxy real = getReal();
        if (real != null) {
            FlexaLiveX.w("[TaoLiveKtBizManagerProxy#getBizManager] not null");
            return real.getBizManager();
        }
        FlexaLiveX.w("[TaoLiveKtBizManagerProxy#getBizManager] null");
        return null;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return "ITaoLiveKtBridgeProxy";
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.live.liveroom.liveBizComponent.ktProxy.TaoLiveKtBridgeProxyX";
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public IOpenArchMessageProxy getOpenArchMessageProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchMessageProxy) ipChange.ipc$dispatch("c019260e", new Object[]{this});
        }
        if (getReal() != null) {
            return getReal().getOpenArchMessageProxy();
        }
        return new OpenArchMessageProxy();
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public IOpenArchProxy getOpenArchProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchProxy) ipChange.ipc$dispatch("220c832", new Object[]{this});
        }
        if (getReal() != null) {
            getReal().getOpenArchProxy();
        }
        return new OpenArchProxy();
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installTaoLiveKtBridgePlugin";
    }

    @Override // com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy
    public nyd getSwitchRoomManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nyd) ipChange.ipc$dispatch("dcb9598b", new Object[]{this});
        }
        ITaoLiveKtBridgeProxy real = getReal();
        if (real != null) {
            FlexaLiveX.w("[TaoLiveKtBizManagerProxy#getSwitchRoomManager] not null");
            return real.getSwitchRoomManager();
        }
        FlexaLiveX.w("[TaoLiveKtBizManagerProxy#getSwitchRoomManager] null");
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "kmp 远程化接入";
    }

    private TaoLiveKtBridgeProxy() {
        try {
            initCrossPlatform();
            kmpRemoteReport();
        } catch (Throwable th) {
            FlexaLiveX.w("[TaoLiveKtBizManagerProxy<init>] error: " + th.getMessage());
        }
    }

    private void kmpRemoteReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c55c0f", new Object[]{this});
        } else if (v2s.o().s() != null) {
            HashMap hashMap = new HashMap();
            DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(FlexaLiveX.TAOLIVE_CROSSPLATFORM);
            if (dynamicFeatureInfo != null) {
                hashMap.put("book_ver", dynamicFeatureInfo.version);
            }
            hashMap.put("book_success", Boolean.toString(true ^ this.needLocal));
            v2s.o().s().a("kmpremote_report", "kmpremote", hashMap);
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ITaoLiveKtBridgeProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ITaoLiveKtBridgeProxy) ipChange.ipc$dispatch("cc25c622", new Object[]{this})) : new TaoLiveKtBridgeProxyX();
    }
}
