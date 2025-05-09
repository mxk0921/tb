package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.ggy;
import tb.ha3;
import tb.hgy;
import tb.ia3;
import tb.ja3;
import tb.jb3;
import tb.kdb;
import tb.mx6;
import tb.nd3;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CartAbilityWrapper extends AbsAbilityWrapper<AbsCartAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336753);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartAbilityWrapper(AbsCartAbility absCartAbility) {
        super(absCartAbility);
        ckf.g(absCartAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(CartAbilityWrapper cartAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/CartAbilityWrapper");
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
            case -135108884:
                if (!str.equals("callMainInstance")) {
                    return null;
                }
                try {
                    getAbilityImpl().callMainInstance(kdbVar, new ha3(map), new ggy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 616328147:
                if (!str.equals("mainInstanceCallback")) {
                    return null;
                }
                try {
                    getAbilityImpl().mainInstanceCallback(kdbVar, new ia3(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 966249451:
                if (!str.equals("getGlobalStatus")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getGlobalStatus(kdbVar, new jb3(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1427896341:
                if (!str.equals("callNative")) {
                    return null;
                }
                try {
                    getAbilityImpl().callNative(kdbVar, new ja3(map), new hgy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1877001975:
                if (!str.equals("setGlobalStatus")) {
                    return null;
                }
                try {
                    return getAbilityImpl().setGlobalStatus(kdbVar, new nd3(map)).e();
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
