package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.lgy;
import tb.mgy;
import tb.mx6;
import tb.su3;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ClientPrerenderAbilityWrapper extends AbsAbilityWrapper<AbsClientPrerenderAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336767);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientPrerenderAbilityWrapper(AbsClientPrerenderAbility absClientPrerenderAbility) {
        super(absClientPrerenderAbility);
        ckf.g(absClientPrerenderAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ClientPrerenderAbilityWrapper clientPrerenderAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ClientPrerenderAbilityWrapper");
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
            case -1967064655:
                if (!str.equals("addPrerenderAttachEventListener")) {
                    return null;
                }
                getAbilityImpl().addPrerenderAttachEventListener(kdbVar, new lgy(vqVar));
                return null;
            case -1078094060:
                if (!str.equals("removePrerenderAttachEventListener")) {
                    return null;
                }
                getAbilityImpl().removePrerenderAttachEventListener(kdbVar, new mx6(vqVar));
                return null;
            case -950587911:
                if (!str.equals("prerender")) {
                    return null;
                }
                try {
                    getAbilityImpl().prerender(kdbVar, new mgy(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 109757538:
                if (!str.equals("start")) {
                    return null;
                }
                getAbilityImpl().start(kdbVar, new mx6(vqVar));
                return null;
            case 1169596279:
                if (!str.equals("reportPrerenderStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().reportPrerenderStatus(kdbVar, new su3(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            default:
                return null;
        }
    }
}
