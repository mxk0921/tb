package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.Map;
import tb.ckf;
import tb.dty;
import tb.ety;
import tb.fty;
import tb.kdb;
import tb.lzl;
import tb.myl;
import tb.mzl;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PermissionAbilityWrapper extends AbsAbilityWrapper<AbsPermissionAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337365);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionAbilityWrapper(AbsPermissionAbility absPermissionAbility) {
        super(absPermissionAbility);
        ckf.g(absPermissionAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(PermissionAbilityWrapper permissionAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PermissionAbilityWrapper");
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
        if (hashCode != 94627080) {
            if (hashCode != 746581438) {
                if (hashCode != 1095692943 || !str.equals("request")) {
                    return null;
                }
                try {
                    getAbilityImpl().request(kdbVar, new lzl(map), new ety(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals(TBRunTimePermission.REQUEST_PERMISSION_API_NAME)) {
                return null;
            } else {
                try {
                    getAbilityImpl().requestPermission(kdbVar, new mzl(map), new fty(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("check")) {
            return null;
        } else {
            try {
                getAbilityImpl().check(kdbVar, new myl(map), new dty(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
