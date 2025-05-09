package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.e70;
import tb.i70;
import tb.iey;
import tb.j70;
import tb.jey;
import tb.k70;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AccsAbilityWrapper extends AbsAbilityWrapper<AbsAccsAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336673);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccsAbilityWrapper(AbsAccsAbility absAccsAbility) {
        super(absAccsAbility);
        ckf.g(absAccsAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(AccsAbilityWrapper accsAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AccsAbilityWrapper");
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
            case -775651618:
                if (!str.equals("connection")) {
                    return null;
                }
                try {
                    return getAbilityImpl().connection(kdbVar, new e70(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -168753834:
                if (!str.equals("removeConnectionListener")) {
                    return null;
                }
                try {
                    return getAbilityImpl().removeConnectionListener(kdbVar, new i70(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 3526536:
                if (!str.equals("send")) {
                    return null;
                }
                try {
                    return getAbilityImpl().send(kdbVar, new j70(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 136715103:
                if (!str.equals("unBindService")) {
                    return null;
                }
                try {
                    return getAbilityImpl().unBindService(kdbVar, new k70(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1418030008:
                if (!str.equals("bindService")) {
                    return null;
                }
                try {
                    getAbilityImpl().bindService(kdbVar, new k70(map), new iey(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 1767151667:
                if (!str.equals("addConnectionListener")) {
                    return null;
                }
                try {
                    getAbilityImpl().addConnectionListener(kdbVar, new e70(map), new jey(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            default:
                return null;
        }
    }
}
