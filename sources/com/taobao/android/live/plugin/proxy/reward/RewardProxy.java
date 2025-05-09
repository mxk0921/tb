package com.taobao.android.live.plugin.proxy.reward;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.RewardProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RewardProxy extends k2n<IRewardProxy> implements IRewardProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RewardProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final RewardProxy f8765a = new RewardProxy();

        static {
            t2o.a(806355235);
        }

        public static /* synthetic */ RewardProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RewardProxy) ipChange.ipc$dispatch("e075b3dc", new Object[0]);
            }
            return f8765a;
        }
    }

    static {
        t2o.a(806355234);
        t2o.a(806355231);
    }

    public RewardProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[RewardProxy<init>] error: " + th.getMessage());
        }
    }

    public static RewardProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RewardProxy) ipChange.ipc$dispatch("92027877", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ Object ipc$super(RewardProxy rewardProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/reward/RewardProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy
    public IRewardProxy.a createRecharge() {
        IRewardProxy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRewardProxy.a) ipChange.ipc$dispatch("8a2288c6", new Object[]{this});
        }
        IRewardProxy real = getReal();
        if (real != null) {
            aVar = real.createRecharge();
        } else {
            aVar = null;
        }
        FlexaLiveX.w("[RewardProxy#createRecharge]  recharge: " + aVar);
        return aVar;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IRewardProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.RewardProxyX";
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
        return "Reward";
    }

    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy
    public boolean isRewardEnable(TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e31c2c8", new Object[]{this, tBLiveDataModel, ux9Var})).booleanValue();
        }
        IRewardProxy real = getReal();
        if (real != null) {
            z = real.isRewardEnable(tBLiveDataModel, ux9Var);
        }
        FlexaLiveX.w("[RewardProxy#isRewardEnable]  value: " + z);
        return z;
    }

    @Override // tb.k2n
    public <ProxyType extends IRewardProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IRewardProxy) ipChange.ipc$dispatch("1f09b01e", new Object[]{this})) : new RewardProxyX();
    }
}
