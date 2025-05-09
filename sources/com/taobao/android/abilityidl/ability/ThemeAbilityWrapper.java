package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.dpt;
import tb.gxy;
import tb.hxy;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ThemeAbilityWrapper extends AbsAbilityWrapper<AbsThemeAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337540);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeAbilityWrapper(AbsThemeAbility absThemeAbility) {
        super(absThemeAbility);
        ckf.g(absThemeAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ThemeAbilityWrapper themeAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ThemeAbilityWrapper");
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
            case -1327636408:
                if (!str.equals("requestThemeInfo")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestThemeInfo(kdbVar, new dpt(map), new gxy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1327297836:
                if (!str.equals("requestThemeType")) {
                    return null;
                }
                getAbilityImpl().requestThemeType(kdbVar, new hxy(vqVar));
                return null;
            case 7451489:
                if (!str.equals("getThemeInfo")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getThemeInfo(kdbVar, new dpt(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 7790061:
                if (str.equals("getThemeType")) {
                    return getAbilityImpl().getThemeType(kdbVar).e();
                }
                return null;
            default:
                return null;
        }
    }
}
