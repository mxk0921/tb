package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.el2;
import tb.kdb;
import tb.lfy;
import tb.ll2;
import tb.mx6;
import tb.t2o;
import tb.vl2;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class BroadcastAbilityWrapper extends AbsAbilityWrapper<AbsBroadcastAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336734);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastAbilityWrapper(AbsBroadcastAbility absBroadcastAbility) {
        super(absBroadcastAbility);
        ckf.g(absBroadcastAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(BroadcastAbilityWrapper broadcastAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/BroadcastAbilityWrapper");
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
        if (hashCode != -2140931520) {
            if (hashCode != -625809843) {
                if (hashCode != -541487286 || !str.equals("removeEventListener")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeEventListener(kdbVar, new vl2(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals("addEventListener")) {
                return null;
            } else {
                try {
                    getAbilityImpl().addEventListener(kdbVar, new el2(map), new lfy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("dispatchEvent")) {
            return null;
        } else {
            try {
                getAbilityImpl().dispatchEvent(kdbVar, new ll2(map), new mx6(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
