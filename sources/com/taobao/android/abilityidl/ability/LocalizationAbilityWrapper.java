package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.qmy;
import tb.t2o;
import tb.vah;
import tb.vq;
import tb.vqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LocalizationAbilityWrapper extends AbsAbilityWrapper<AbsLocalizationAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337250);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizationAbilityWrapper(AbsLocalizationAbility absLocalizationAbility) {
        super(absLocalizationAbility);
        ckf.g(absLocalizationAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(LocalizationAbilityWrapper localizationAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LocalizationAbilityWrapper");
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
            case -2076528074:
                if (str.equals("isI18nEdition")) {
                    return getAbilityImpl().isI18nEdition(kdbVar).e();
                }
                return null;
            case -682482660:
                if (str.equals("isCnSite")) {
                    return getAbilityImpl().isCnSite(kdbVar).e();
                }
                return null;
            case -316023509:
                if (str.equals("getLocation")) {
                    return getAbilityImpl().getLocation(kdbVar).e();
                }
                return null;
            case 383935836:
                if (!str.equals("setLocale")) {
                    return null;
                }
                try {
                    getAbilityImpl().setLocale(kdbVar, new vah(map), new qmy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 464310478:
                if (str.equals(vqx.HUMMER_FOUNDATION_GET_LANGUAGE)) {
                    return getAbilityImpl().getLanguage(kdbVar).e();
                }
                return null;
            default:
                return null;
        }
    }
}
