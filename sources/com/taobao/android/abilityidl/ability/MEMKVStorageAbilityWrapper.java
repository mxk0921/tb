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
import tb.soh;
import tb.t2o;
import tb.toh;
import tb.uoh;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MEMKVStorageAbilityWrapper extends AbsAbilityWrapper<AbsMEMKVStorageAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337272);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEMKVStorageAbilityWrapper(AbsMEMKVStorageAbility absMEMKVStorageAbility) {
        super(absMEMKVStorageAbility);
        ckf.g(absMEMKVStorageAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(MEMKVStorageAbilityWrapper mEMKVStorageAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/MEMKVStorageAbilityWrapper");
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
            case -1141913181:
                if (!str.equals("getItemTTL")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getItemTTL(kdbVar, new soh(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -75439223:
                if (!str.equals("getItem")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getItem(kdbVar, new soh(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 794892055:
                if (!str.equals("setItemTTL")) {
                    return null;
                }
                try {
                    getAbilityImpl().setItemTTL(kdbVar, new uoh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1098253751:
                if (!str.equals("removeItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeItem(kdbVar, new soh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1984670357:
                if (!str.equals("setItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().setItem(kdbVar, new toh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
