package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cey;
import tb.ckf;
import tb.dey;
import tb.kdb;
import tb.mc;
import tb.nc;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class APMAbilityWrapper extends AbsAbilityWrapper<AbsAPMAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336583);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APMAbilityWrapper(AbsAPMAbility absAPMAbility) {
        super(absAPMAbility);
        ckf.g(absAPMAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(APMAbilityWrapper aPMAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/APMAbilityWrapper");
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
            case -1435343664:
                if (str.equals("getCurrentProcedure")) {
                    return getAbilityImpl().getCurrentProcedure(kdbVar).e();
                }
                return null;
            case -715880251:
                if (!str.equals("addPageProperty")) {
                    return null;
                }
                try {
                    getAbilityImpl().addPageProperty(kdbVar, new mc(map), new dey(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 105764011:
                if (!str.equals("requestSubCurrentProcedure")) {
                    return null;
                }
                getAbilityImpl().requestSubCurrentProcedure(kdbVar, new cey(vqVar));
                return null;
            case 734887438:
                if (!str.equals("addPageStage")) {
                    return null;
                }
                try {
                    getAbilityImpl().addPageStage(kdbVar, new nc(map), new dey(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            default:
                return null;
        }
    }
}
