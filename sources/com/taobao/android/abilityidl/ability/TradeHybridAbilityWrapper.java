package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.ncu;
import tb.oxy;
import tb.pcu;
import tb.pxy;
import tb.qcu;
import tb.rcu;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class TradeHybridAbilityWrapper extends AbsAbilityWrapper<AbsTradeHybridAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337560);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeHybridAbilityWrapper(AbsTradeHybridAbility absTradeHybridAbility) {
        super(absTradeHybridAbility);
        ckf.g(absTradeHybridAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(TradeHybridAbilityWrapper tradeHybridAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TradeHybridAbilityWrapper");
    }

    @Override // com.alibaba.ability.AbsAbilityWrapper, tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        switch (str.hashCode()) {
            case -1991295420:
                if (!str.equals("unexpectedReachDone")) {
                    return null;
                }
                try {
                    getAbilityImpl().unexpectedReachDone(kdbVar, new rcu(map), new pxy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1991040625:
                if (!str.equals("unexpectedReachMark")) {
                    return null;
                }
                try {
                    getAbilityImpl().unexpectedReachMark(kdbVar, new rcu(map), new pxy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1753718475:
                if (!str.equals("notifyStage")) {
                    return null;
                }
                try {
                    getAbilityImpl().notifyStage(kdbVar, new qcu(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -406701423:
                if (!str.equals("onBindPreData")) {
                    return null;
                }
                try {
                    getAbilityImpl().onBindPreData(kdbVar, new pcu(map), new oxy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 432067968:
                if (!str.equals("notifyBizLifecycle")) {
                    return null;
                }
                try {
                    getAbilityImpl().notifyBizLifecycle(kdbVar, new ncu(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
