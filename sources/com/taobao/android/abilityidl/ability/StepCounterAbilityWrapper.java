package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.amq;
import tb.bmq;
import tb.ckf;
import tb.dwy;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class StepCounterAbilityWrapper extends AbsAbilityWrapper<AbsStepCounterAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337523);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepCounterAbilityWrapper(AbsStepCounterAbility absStepCounterAbility) {
        super(absStepCounterAbility);
        ckf.g(absStepCounterAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(StepCounterAbilityWrapper stepCounterAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/StepCounterAbilityWrapper");
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
            case -1712712025:
                if (!str.equals("setStepsAutoUploadStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().setStepsAutoUploadStatus(kdbVar, new bmq(map), new dwy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1526000339:
                if (!str.equals("requestStepCountSupportStatus")) {
                    return null;
                }
                getAbilityImpl().requestStepCountSupportStatus(kdbVar, new dwy(vqVar));
                return null;
            case -1514728323:
                if (!str.equals("requestDailySteps")) {
                    return null;
                }
                getAbilityImpl().requestDailySteps(kdbVar, new dwy(vqVar));
                return null;
            case -174297446:
                if (!str.equals("requestStepsAutoUploadStatus")) {
                    return null;
                }
                getAbilityImpl().requestStepsAutoUploadStatus(kdbVar, new dwy(vqVar));
                return null;
            case 1053912486:
                if (!str.equals("uploadSteps")) {
                    return null;
                }
                getAbilityImpl().uploadSteps(kdbVar, new dwy(vqVar));
                return null;
            case 1298663324:
                if (!str.equals("requestStepsHistory")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestStepsHistory(kdbVar, new amq(map), new dwy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            default:
                return null;
        }
    }
}
