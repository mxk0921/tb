package com.taobao.android.live.plugin.proxy.rank;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.RankProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.mvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RankProxy extends k2n<IRankProxy> implements IRankProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RankProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final RankProxy f8763a = new RankProxy();

        static {
            t2o.a(806355226);
        }

        public static /* synthetic */ RankProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RankProxy) ipChange.ipc$dispatch("acbb5ebd", new Object[0]);
            }
            return f8763a;
        }
    }

    static {
        t2o.a(806355224);
        t2o.a(806355223);
    }

    public static RankProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RankProxy) ipChange.ipc$dispatch("a3cadc17", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(RankProxy rankProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/rank/RankProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IRankProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.RankProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveRankEntrancePlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Pair<Long, mvb> getRankEntranceDXHandler() {
        Pair<Long, mvb> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4eabf62f", new Object[]{this});
        }
        IRankProxy real = getReal();
        if (real != null) {
            pair = real.getRankEntranceDXHandler();
        } else {
            pair = null;
        }
        FlexaLiveX.w("[RankProxy#getRankEntranceDXHandler]  value: " + pair);
        return pair;
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankEntranceFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("10722b57", new Object[]{this});
        }
        IRankProxy real = getReal();
        if (real != null) {
            cls = real.getRankEntranceFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[RankProxy#getRankEntranceFrameClass]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "打赏/榜单/排位赛";
    }

    private RankProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[RankProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IRankProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IRankProxy) ipChange.ipc$dispatch("297b3798", new Object[]{this})) : new RankProxyX();
    }
}
