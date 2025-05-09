package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.m82;
import tb.mx6;
import tb.p82;
import tb.t2o;
import tb.vq;
import tb.z82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class BehaviXAbilityWrapper extends AbsAbilityWrapper<AbsBehaviXAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336727);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BehaviXAbilityWrapper(AbsBehaviXAbility absBehaviXAbility) {
        super(absBehaviXAbility);
        ckf.g(absBehaviXAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(BehaviXAbilityWrapper behaviXAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/BehaviXAbilityWrapper");
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
            case -1197208125:
                if (!str.equals("trackScrollEnd")) {
                    return null;
                }
                try {
                    getAbilityImpl().trackScrollEnd(kdbVar, new z82(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1197173526:
                if (!str.equals("trackScrolling")) {
                    return null;
                }
                try {
                    getAbilityImpl().trackScrolling(kdbVar, new z82(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 57652928:
                if (!str.equals("getFeature")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFeature(kdbVar, new p82(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 547336010:
                if (!str.equals("trackScrollStart")) {
                    return null;
                }
                try {
                    getAbilityImpl().trackScrollStart(kdbVar, new z82(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1345991308:
                if (!str.equals("commitVisualCenter")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitVisualCenter(kdbVar, new m82(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
