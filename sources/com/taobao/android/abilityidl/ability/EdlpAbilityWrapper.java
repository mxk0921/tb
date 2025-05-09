package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.c98;
import tb.ckf;
import tb.d98;
import tb.kdb;
import tb.t2o;
import tb.vq;
import tb.zhy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class EdlpAbilityWrapper extends AbsAbilityWrapper<AbsEdlpAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336872);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdlpAbilityWrapper(AbsEdlpAbility absEdlpAbility) {
        super(absEdlpAbility);
        ckf.g(absEdlpAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(EdlpAbilityWrapper edlpAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/EdlpAbilityWrapper");
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
        if (hashCode != -960808764) {
            if (hashCode != -106464444 || !str.equals("requestPreloadData")) {
                return null;
            }
            try {
                getAbilityImpl().requestPreloadData(kdbVar, new c98(map), new zhy(vqVar));
                return null;
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        } else if (!str.equals("notifyRenderSuccess")) {
            return null;
        } else {
            try {
                return getAbilityImpl().notifyRenderSuccess(kdbVar, new d98(map)).e();
            } catch (Throwable th2) {
                return ErrorResult.a.Companion.g(th2.getMessage());
            }
        }
    }
}
