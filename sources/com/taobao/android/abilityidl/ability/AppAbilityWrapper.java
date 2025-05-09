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
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AppAbilityWrapper extends AbsAbilityWrapper<AbsAppAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336709);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAbilityWrapper(AbsAppAbility absAppAbility) {
        super(absAppAbility);
        ckf.g(absAppAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(AppAbilityWrapper appAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AppAbilityWrapper");
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
            case -1852006340:
                if (!str.equals("suspend")) {
                    return null;
                }
                getAbilityImpl().suspend(kdbVar, new mx6(vqVar));
                return null;
            case -1249363529:
                if (str.equals("getEnv")) {
                    return getAbilityImpl().getEnv(kdbVar).e();
                }
                return null;
            case -139237875:
                if (str.equals("isForeground")) {
                    return getAbilityImpl().isForeground(kdbVar).e();
                }
                return null;
            case -75444956:
                if (str.equals("getInfo")) {
                    return getAbilityImpl().getInfo(kdbVar).e();
                }
                return null;
            case -75143183:
                if (str.equals("getTTID")) {
                    return getAbilityImpl().getTTID(kdbVar).e();
                }
                return null;
            case 15857401:
                if (str.equals("getBottomBarHeight")) {
                    return getAbilityImpl().getBottomBarHeight(kdbVar).e();
                }
                return null;
            case 1388468386:
                if (str.equals("getVersion")) {
                    return getAbilityImpl().getVersion(kdbVar).e();
                }
                return null;
            case 1491337133:
                if (str.equals("getNavBarHeight")) {
                    return getAbilityImpl().getNavBarHeight(kdbVar).e();
                }
                return null;
            case 1966447562:
                if (str.equals("getUTDID")) {
                    return getAbilityImpl().getUTDID(kdbVar).e();
                }
                return null;
            default:
                return null;
        }
    }
}
