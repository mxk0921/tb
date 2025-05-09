package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.mey;
import tb.t2o;
import tb.vq;
import tb.xk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AlertAbilityWrapper extends AbsAbilityWrapper<AbsAlertAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336693);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertAbilityWrapper(AbsAlertAbility absAlertAbility) {
        super(absAlertAbility);
        ckf.g(absAlertAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(AlertAbilityWrapper alertAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AlertAbilityWrapper");
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
        if (str.hashCode() != 3529469 || !str.equals("show")) {
            return null;
        }
        try {
            getAbilityImpl().show(kdbVar, new xk0(map), new mey(vqVar));
            return null;
        } catch (Throwable th) {
            return ErrorResult.a.Companion.g(th.getMessage());
        }
    }
}
