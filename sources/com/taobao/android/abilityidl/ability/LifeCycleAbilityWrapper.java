package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.tly;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LifeCycleAbilityWrapper extends AbsAbilityWrapper<AbsLifeCycleAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337242);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeCycleAbilityWrapper(AbsLifeCycleAbility absLifeCycleAbility) {
        super(absLifeCycleAbility);
        ckf.g(absLifeCycleAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(LifeCycleAbilityWrapper lifeCycleAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LifeCycleAbilityWrapper");
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
        if (hashCode != -329066194) {
            if (hashCode != -68995797 || !str.equals("removePageLifeCycleListener")) {
                return null;
            }
            getAbilityImpl().removePageLifeCycleListener(kdbVar, new mx6(vqVar));
            return null;
        } else if (!str.equals("addPageLifeCycleListener")) {
            return null;
        } else {
            getAbilityImpl().addPageLifeCycleListener(kdbVar, new tly(vqVar));
            return null;
        }
    }
}
