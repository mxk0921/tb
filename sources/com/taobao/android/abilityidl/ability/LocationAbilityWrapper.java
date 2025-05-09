package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kch;
import tb.kdb;
import tb.rmy;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LocationAbilityWrapper extends AbsAbilityWrapper<AbsLocationAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337255);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationAbilityWrapper(AbsLocationAbility absLocationAbility) {
        super(absLocationAbility);
        ckf.g(absLocationAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(LocationAbilityWrapper locationAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LocationAbilityWrapper");
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
        if (hashCode != 1095692943) {
            if (hashCode == 1950242252 && str.equals("getCache")) {
                return getAbilityImpl().getCache(kdbVar).e();
            }
            return null;
        } else if (!str.equals("request")) {
            return null;
        } else {
            try {
                getAbilityImpl().request(kdbVar, new kch(map), new rmy(vqVar));
                return null;
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        }
    }
}
