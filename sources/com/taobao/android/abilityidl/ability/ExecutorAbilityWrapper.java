package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.fiy;
import tb.hn8;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ExecutorAbilityWrapper extends AbsAbilityWrapper<AbsExecutorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336889);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutorAbilityWrapper(AbsExecutorAbility absExecutorAbility) {
        super(absExecutorAbility);
        ckf.g(absExecutorAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ExecutorAbilityWrapper executorAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ExecutorAbilityWrapper");
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
        if (str.hashCode() != -1401748773 || !str.equals("batchExecute")) {
            return null;
        }
        try {
            getAbilityImpl().batchExecute(kdbVar, new hn8(map), new fiy(vqVar));
            return null;
        } catch (Throwable th) {
            return ErrorResult.a.Companion.g(th.getMessage());
        }
    }
}
