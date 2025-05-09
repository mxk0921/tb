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
import tb.t2o;
import tb.vq;
import tb.xrz;
import tb.yrz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class TradePayAbilityWrapper extends AbsAbilityWrapper<AbsTradePayAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337573);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePayAbilityWrapper(AbsTradePayAbility absTradePayAbility) {
        super(absTradePayAbility);
        ckf.g(absTradePayAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(TradePayAbilityWrapper tradePayAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TradePayAbilityWrapper");
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
        int hashCode = str.hashCode();
        if (hashCode != -1141521665) {
            if (hashCode != 909290363 || !str.equals("openAlipayEntrust")) {
                return null;
            }
            try {
                getAbilityImpl().openAlipayEntrust(kdbVar, new xrz(map), new mx6(vqVar));
                return null;
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        } else if (!str.equals("openWeChatEntrust")) {
            return null;
        } else {
            try {
                getAbilityImpl().openWeChatEntrust(kdbVar, new yrz(map), new mx6(vqVar));
                return null;
            } catch (Throwable th2) {
                return ErrorResult.a.Companion.g(th2.getMessage());
            }
        }
    }
}
