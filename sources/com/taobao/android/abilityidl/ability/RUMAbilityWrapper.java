package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.dcn;
import tb.ecn;
import tb.kdb;
import tb.t2o;
import tb.uuy;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class RUMAbilityWrapper extends AbsAbilityWrapper<AbsRUMAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337465);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RUMAbilityWrapper(AbsRUMAbility absRUMAbility) {
        super(absRUMAbility);
        ckf.g(absRUMAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(RUMAbilityWrapper rUMAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/RUMAbilityWrapper");
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
            case -2066880736:
                if (!str.equals("addStandardStage")) {
                    return null;
                }
                try {
                    getAbilityImpl().addStandardStage(kdbVar, new ecn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1645850308:
                if (str.equals("getCurrentPageData")) {
                    return getAbilityImpl().getCurrentPageData(kdbVar).e();
                }
                return null;
            case -1475550361:
                if (!str.equals("addCustomProperty")) {
                    return null;
                }
                try {
                    getAbilityImpl().addCustomProperty(kdbVar, new dcn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1167460692:
                if (!str.equals("addCustomStage")) {
                    return null;
                }
                try {
                    getAbilityImpl().addCustomStage(kdbVar, new ecn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1112848898:
                if (!str.equals("addContainerStage")) {
                    return null;
                }
                try {
                    getAbilityImpl().addContainerStage(kdbVar, new ecn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 202878579:
                if (!str.equals("addStandardProperty")) {
                    return null;
                }
                try {
                    getAbilityImpl().addStandardProperty(kdbVar, new dcn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 1966766805:
                if (!str.equals("addContainerProperty")) {
                    return null;
                }
                try {
                    getAbilityImpl().addContainerProperty(kdbVar, new dcn(map), new uuy(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            default:
                return null;
        }
    }
}
