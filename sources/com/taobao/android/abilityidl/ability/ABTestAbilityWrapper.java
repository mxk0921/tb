package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.j0;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ABTestAbilityWrapper extends AbsAbilityWrapper<AbsABTestAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336578);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABTestAbilityWrapper(AbsABTestAbility absABTestAbility) {
        super(absABTestAbility);
        ckf.g(absABTestAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ABTestAbilityWrapper aBTestAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ABTestAbilityWrapper");
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
        if (hashCode != -91548835) {
            if (hashCode != 167502373 || !str.equals("getVariationAndExperimentInfo")) {
                return null;
            }
            try {
                return getAbilityImpl().getVariationAndExperimentInfo(kdbVar, new j0(map)).e();
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        } else if (!str.equals("getVariation")) {
            return null;
        } else {
            try {
                return getAbilityImpl().getVariation(kdbVar, new j0(map)).e();
            } catch (Throwable th2) {
                return ErrorResult.a.Companion.g(th2.getMessage());
            }
        }
    }
}
