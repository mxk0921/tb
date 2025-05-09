package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.pg1;
import tb.pny;
import tb.r2k;
import tb.s2k;
import tb.t2o;
import tb.v2k;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class NextRPCAbilityWrapper extends AbsAbilityWrapper<AbsNextRPCAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337312);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextRPCAbilityWrapper(AbsNextRPCAbility absNextRPCAbility) {
        super(absNextRPCAbility);
        ckf.g(absNextRPCAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(NextRPCAbilityWrapper nextRPCAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NextRPCAbilityWrapper");
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
            case -1367724422:
                if (!str.equals("cancel")) {
                    return null;
                }
                try {
                    getAbilityImpl().cancel(kdbVar, new s2k(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -840745386:
                if (!str.equals("unbind")) {
                    return null;
                }
                try {
                    getAbilityImpl().unbind(kdbVar, new r2k(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 3023933:
                if (!str.equals(pg1.ATOM_EXT_bind)) {
                    return null;
                }
                try {
                    getAbilityImpl().bind(kdbVar, new r2k(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1095692943:
                if (!str.equals("request")) {
                    return null;
                }
                try {
                    getAbilityImpl().request(kdbVar, new v2k(map), new pny(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            default:
                return null;
        }
    }
}
