package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ajy;
import tb.ckf;
import tb.f6a;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class GeneralSettingAbilityWrapper extends AbsAbilityWrapper<AbsGeneralSettingAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336960);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingAbilityWrapper(AbsGeneralSettingAbility absGeneralSettingAbility) {
        super(absGeneralSettingAbility);
        ckf.g(absGeneralSettingAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(GeneralSettingAbilityWrapper generalSettingAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/GeneralSettingAbilityWrapper");
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
        if (hashCode != -171589242) {
            if (hashCode != 102230) {
                if (hashCode != 1800640525 || !str.equals("unsetChangeListener")) {
                    return null;
                }
                try {
                    return getAbilityImpl().unsetChangeListener(kdbVar, new f6a(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals("get")) {
                return null;
            } else {
                try {
                    return getAbilityImpl().get(kdbVar, new f6a(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("setChangeListener")) {
            return null;
        } else {
            try {
                getAbilityImpl().setChangeListener(kdbVar, new f6a(map), new ajy(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
