package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.gru;
import tb.hru;
import tb.iru;
import tb.jru;
import tb.kdb;
import tb.kru;
import tb.lru;
import tb.mru;
import tb.nru;
import tb.qxy;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UBFAbilityWrapper extends AbsAbilityWrapper<AbsUBFAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337576);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UBFAbilityWrapper(AbsUBFAbility absUBFAbility) {
        super(absUBFAbility);
        ckf.g(absUBFAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(UBFAbilityWrapper uBFAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UBFAbilityWrapper");
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
            case -1949209104:
                if (!str.equals("updateUBF")) {
                    return null;
                }
                try {
                    getAbilityImpl().updateUBF(kdbVar, new nru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1811121566:
                if (!str.equals("endComponent")) {
                    return null;
                }
                try {
                    getAbilityImpl().endComponent(kdbVar, new jru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1607370230:
                if (!str.equals("endPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().endPage(kdbVar, new kru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1298772834:
                if (!str.equals("endUBF")) {
                    return null;
                }
                try {
                    getAbilityImpl().endUBF(kdbVar, new kru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -1072966952:
                if (!str.equals("beginPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().beginPage(kdbVar, new hru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case -697339308:
                if (!str.equals("beginComponent")) {
                    return null;
                }
                try {
                    getAbilityImpl().beginComponent(kdbVar, new gru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case -296058120:
                if (!str.equals("updatePage")) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePage(kdbVar, new nru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case -194390476:
                if (!str.equals("updateComponent")) {
                    return null;
                }
                try {
                    getAbilityImpl().updateComponent(kdbVar, new mru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case 2762738:
                if (!str.equals("sendEvent")) {
                    return null;
                }
                try {
                    getAbilityImpl().sendEvent(kdbVar, new lru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case 1489412624:
                if (!str.equals("beginUBF")) {
                    return null;
                }
                try {
                    getAbilityImpl().beginUBF(kdbVar, new iru(map), new qxy(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            default:
                return null;
        }
    }
}
