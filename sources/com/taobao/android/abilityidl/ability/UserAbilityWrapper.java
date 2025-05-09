package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bsv;
import tb.ckf;
import tb.hyy;
import tb.jsv;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UserAbilityWrapper extends AbsAbilityWrapper<AbsUserAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337649);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAbilityWrapper(AbsUserAbility absUserAbility) {
        super(absUserAbility);
        ckf.g(absUserAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(UserAbilityWrapper userAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UserAbilityWrapper");
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
        if (hashCode != -1130796623) {
            if (hashCode != 103149417) {
                if (hashCode == 2064555103 && str.equals("isLogin")) {
                    return getAbilityImpl().isLogin(kdbVar).e();
                }
                return null;
            } else if (!str.equals("login")) {
                return null;
            } else {
                try {
                    getAbilityImpl().login(kdbVar, new bsv(map), new hyy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            }
        } else if (!str.equals("recordAndCheckNeedLogin")) {
            return null;
        } else {
            try {
                return getAbilityImpl().recordAndCheckNeedLogin(kdbVar, new jsv(map)).e();
            } catch (Throwable th2) {
                return ErrorResult.a.Companion.g(th2.getMessage());
            }
        }
    }
}
