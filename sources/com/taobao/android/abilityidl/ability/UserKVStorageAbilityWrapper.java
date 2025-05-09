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
import tb.pg1;
import tb.t2o;
import tb.vq;
import tb.vrv;
import tb.wrv;
import tb.xrv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UserKVStorageAbilityWrapper extends AbsAbilityWrapper<AbsUserKVStorageAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337652);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserKVStorageAbilityWrapper(AbsUserKVStorageAbility absUserKVStorageAbility) {
        super(absUserKVStorageAbility);
        ckf.g(absUserKVStorageAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(UserKVStorageAbilityWrapper userKVStorageAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UserKVStorageAbilityWrapper");
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
                    return getAbilityImpl().getItem(kdbVar, new wrv(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -39356271:
                if (!str.equals(RocketBundleAbility.API_GET_CURRENT_INFO)) {
                    return null;
                }
                try {
                    return getAbilityImpl().getCurrentInfo(kdbVar, new vrv(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 94746189:
                if (!str.equals(pg1.ATOM_EXT_clear)) {
                    return null;
                }
                try {
                    return getAbilityImpl().clear(kdbVar, new vrv(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 124428031:
                if (!str.equals("getAllKeys")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getAllKeys(kdbVar, new vrv(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1098253751:
                if (!str.equals("removeItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().removeItem(kdbVar, new wrv(map)).e();
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 1984670357:
                if (!str.equals("setItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().setItem(kdbVar, new xrv(map)).e();
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            default:
                return null;
        }
    }
}
