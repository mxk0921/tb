package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.auy;
import tb.buy;
import tb.ckf;
import tb.jbm;
import tb.kbm;
import tb.kdb;
import tb.lbm;
import tb.mx6;
import tb.t2o;
import tb.vq;
import tb.zty;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PopCenterAbilityWrapper extends AbsAbilityWrapper<AbsPopCenterAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337410);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopCenterAbilityWrapper(AbsPopCenterAbility absPopCenterAbility) {
        super(absPopCenterAbility);
        ckf.g(absPopCenterAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(PopCenterAbilityWrapper popCenterAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PopCenterAbilityWrapper");
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
            case -449670347:
                if (!str.equals("setProperties")) {
                    return null;
                }
                try {
                    getAbilityImpl().setProperties(kdbVar, new lbm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -109131914:
                if (!str.equals("checkShouldPop")) {
                    return null;
                }
                try {
                    getAbilityImpl().checkShouldPop(kdbVar, new kbm(map), new zty(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1092811065:
                if (!str.equals("closePop")) {
                    return null;
                }
                getAbilityImpl().closePop(kdbVar, new auy(vqVar));
                return null;
            case 1363503481:
                if (!str.equals("triggerPop")) {
                    return null;
                }
                getAbilityImpl().triggerPop(kdbVar, new buy(vqVar));
                return null;
            case 1724078742:
                if (!str.equals("recordPopAction")) {
                    return null;
                }
                try {
                    getAbilityImpl().recordPopAction(kdbVar, new jbm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            default:
                return null;
        }
    }
}
