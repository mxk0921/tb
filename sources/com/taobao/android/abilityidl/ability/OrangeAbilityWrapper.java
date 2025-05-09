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
import tb.p8l;
import tb.r9l;
import tb.s9l;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OrangeAbilityWrapper extends AbsAbilityWrapper<AbsOrangeAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrangeAbilityWrapper(AbsOrangeAbility absOrangeAbility) {
        super(absOrangeAbility);
        ckf.g(absOrangeAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(OrangeAbilityWrapper orangeAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OrangeAbilityWrapper");
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
            case -2011030666:
                if (!str.equals("downloadConfigWithParams")) {
                    return null;
                }
                try {
                    getAbilityImpl().downloadConfigWithParams(kdbVar, new p8l(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1206776874:
                if (str.equals("getIndexAndConfigs")) {
                    return getAbilityImpl().getIndexAndConfigs(kdbVar).e();
                }
                return null;
            case 102230:
                if (!str.equals("get")) {
                    return null;
                }
                try {
                    return getAbilityImpl().get(kdbVar, new s9l(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1162301964:
                if (!str.equals("getStandardGroup")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getStandardGroup(kdbVar, new r9l(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1854947416:
                if (!str.equals("getCustomGroup")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getCustomGroup(kdbVar, new r9l(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            default:
                return null;
        }
    }
}
