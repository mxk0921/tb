package com.taobao.android.live.plugin.proxy.taolivemore;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.TaoliveMoreBTypeProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoliveMoreBTypeProxy extends k2n<ITaoliveMoreBTypeProxy> implements ITaoliveMoreBTypeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TaoliveMoreBTypeProxy.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TaoliveMoreBTypeProxy f8770a = new TaoliveMoreBTypeProxy();

        static {
            t2o.a(806355270);
        }

        public static /* synthetic */ TaoliveMoreBTypeProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoliveMoreBTypeProxy) ipChange.ipc$dispatch("d0332ff2", new Object[0]);
            }
            return f8770a;
        }
    }

    static {
        t2o.a(806355269);
        t2o.a(806355268);
    }

    public TaoliveMoreBTypeProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[" + TAG + "<init>] error: " + th.getMessage());
        }
    }

    public static TaoliveMoreBTypeProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveMoreBTypeProxy) ipChange.ipc$dispatch("965741f7", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ Object ipc$super(TaoliveMoreBTypeProxy taoliveMoreBTypeProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/taolivemore/TaoliveMoreBTypeProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ITaoliveMoreBTypeProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.TaoliveMoreBTypeProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return LiveAvatarController.MORE_LIVE;
    }

    @Override // com.taobao.android.live.plugin.proxy.taolivemore.ITaoliveMoreBTypeProxy
    public void initTaoliveMore() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98263da", new Object[]{this});
            return;
        }
        ITaoliveMoreBTypeProxy real = getReal();
        if (real != null) {
            real.initTaoliveMore();
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(TAG);
        sb.append("#initTaoliveMore]  value: ");
        if (real != null) {
            z = true;
        }
        sb.append(String.valueOf(z));
        FlexaLiveX.w(sb.toString());
    }

    @Override // tb.k2n
    public <ProxyType extends ITaoliveMoreBTypeProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ITaoliveMoreBTypeProxy) ipChange.ipc$dispatch("ed6b4d4a", new Object[]{this})) : new TaoliveMoreBTypeProxyX();
    }
}
