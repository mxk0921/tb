package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.awy;
import tb.ckf;
import tb.ibq;
import tb.jbq;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.txq;
import tb.vq;
import tb.zvy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SpeechRecognitionAbilityWrapper extends AbsAbilityWrapper<AbsSpeechRecognitionAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337514);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognitionAbilityWrapper(AbsSpeechRecognitionAbility absSpeechRecognitionAbility) {
        super(absSpeechRecognitionAbility);
        ckf.g(absSpeechRecognitionAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognitionAbilityWrapper speechRecognitionAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SpeechRecognitionAbilityWrapper");
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
            case -1917741817:
                if (!str.equals("showPanel")) {
                    return null;
                }
                try {
                    getAbilityImpl().showPanel(kdbVar, new ibq(map), new zvy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -318370553:
                if (!str.equals("prepare")) {
                    return null;
                }
                getAbilityImpl().prepare(kdbVar, new mx6(vqVar));
                return null;
            case 3540994:
                if (!str.equals("stop")) {
                    return null;
                }
                getAbilityImpl().stop(kdbVar, new mx6(vqVar));
                return null;
            case 109757538:
                if (!str.equals("start")) {
                    return null;
                }
                try {
                    getAbilityImpl().start(kdbVar, new jbq(map), new awy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1860421445:
                if (str.equals(txq.IS_SUPPORT_KEY)) {
                    return getAbilityImpl().isSupport(kdbVar).e();
                }
                return null;
            default:
                return null;
        }
    }
}
