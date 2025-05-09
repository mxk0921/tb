package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.impl.rocketbundle.RocketBundleAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.lep;
import tb.mep;
import tb.pg1;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SessionKVStorageAbilityWrapper extends AbsAbilityWrapper<AbsSessionKVStorageAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337494);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionKVStorageAbilityWrapper(AbsSessionKVStorageAbility absSessionKVStorageAbility) {
        super(absSessionKVStorageAbility);
        ckf.g(absSessionKVStorageAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(SessionKVStorageAbilityWrapper sessionKVStorageAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SessionKVStorageAbilityWrapper");
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
            case -75439223:
                if (!str.equals("getItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getItem(kdbVar, new lep(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -39356271:
                if (str.equals(RocketBundleAbility.API_GET_CURRENT_INFO)) {
                    return getAbilityImpl().getCurrentInfo(kdbVar).e();
                }
                return null;
            case 94746189:
                if (str.equals(pg1.ATOM_EXT_clear)) {
                    return getAbilityImpl().clear(kdbVar).e();
                }
                return null;
            case 124428031:
                if (str.equals("getAllKeys")) {
                    return getAbilityImpl().getAllKeys(kdbVar).e();
                }
                return null;
            case 1098253751:
                if (!str.equals("removeItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().removeItem(kdbVar, new lep(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1984670357:
                if (!str.equals("setItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().setItem(kdbVar, new mep(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            default:
                return null;
        }
    }
}
