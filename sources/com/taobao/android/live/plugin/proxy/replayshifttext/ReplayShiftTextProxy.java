package com.taobao.android.live.plugin.proxy.replayshifttext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.ReplayShiftTextProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayShiftTextProxy extends k2n<IReplaySiftTextProxy> implements IReplaySiftTextProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ReplayShiftTextProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ReplayShiftTextProxy f8764a = new ReplayShiftTextProxy();

        static {
            t2o.a(806355230);
        }

        public static /* synthetic */ ReplayShiftTextProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ReplayShiftTextProxy) ipChange.ipc$dispatch("28cce34f", new Object[0]);
            }
            return f8764a;
        }
    }

    static {
        t2o.a(806355228);
        t2o.a(806355227);
    }

    public static ReplayShiftTextProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplayShiftTextProxy) ipChange.ipc$dispatch("27e08129", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(ReplayShiftTextProxy replayShiftTextProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/replayshifttext/ReplayShiftTextProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IReplaySiftTextProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.ReplayShiftTextProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveReplayShiftTextPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.replayshifttext.IReplaySiftTextProxy
    public Class<? extends BaseFrame> getReplaySiftTextFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2fb19e4d", new Object[]{this});
        }
        IReplaySiftTextProxy real = getReal();
        if (real != null) {
            cls = real.getReplaySiftTextFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[ReplayShiftTextProxy#getReplaySiftTextFrameClass]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "回放切换讲解";
    }

    private ReplayShiftTextProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[ReplayShiftTextProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IReplaySiftTextProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IReplaySiftTextProxy) ipChange.ipc$dispatch("6e1a3c0e", new Object[]{this})) : new ReplayShiftTextProxyX();
    }
}
