package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cho;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.t6s;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class RouterAbilityWrapper extends AbsAbilityWrapper<AbsRouterAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337471);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterAbilityWrapper(AbsRouterAbility absRouterAbility) {
        super(absRouterAbility);
        ckf.g(absRouterAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(RouterAbilityWrapper routerAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/RouterAbilityWrapper");
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
            case -1561908306:
                if (!str.equals("popToRoot")) {
                    return null;
                }
                getAbilityImpl().popToRoot(kdbVar, new mx6(vqVar));
                return null;
            case -749616679:
                if (!str.equals("resetToPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().resetToPage(kdbVar, new cho(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -395052928:
                if (!str.equals("popPage")) {
                    return null;
                }
                getAbilityImpl().popPage(kdbVar, new mx6(vqVar));
                return null;
            case 430051171:
                if (!str.equals("replacePage")) {
                    return null;
                }
                try {
                    getAbilityImpl().replacePage(kdbVar, new cho(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 860367211:
                if (str.equals("getPageProps")) {
                    return getAbilityImpl().getPageProps(kdbVar).e();
                }
                return null;
            case 1092796681:
                if (!str.equals("closeApp")) {
                    return null;
                }
                getAbilityImpl().closeApp(kdbVar, new mx6(vqVar));
                return null;
            case 1775855817:
                if (!str.equals(t6s.BRIDGE_ACTION_PUSHPAGE)) {
                    return null;
                }
                try {
                    getAbilityImpl().pushPage(kdbVar, new cho(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            default:
                return null;
        }
    }
}
