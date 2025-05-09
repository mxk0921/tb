package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.t2o;
import tb.tq2;
import tb.uq2;
import tb.vq;
import tb.vq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CLDRFormatAbilityWrapper extends AbsAbilityWrapper<AbsCLDRFormatAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336744);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLDRFormatAbilityWrapper(AbsCLDRFormatAbility absCLDRFormatAbility) {
        super(absCLDRFormatAbility);
        ckf.g(absCLDRFormatAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(CLDRFormatAbilityWrapper cLDRFormatAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/CLDRFormatAbilityWrapper");
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
            case -1120935303:
                if (!str.equals("getFormatCustomDateTime")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFormatCustomDateTime(kdbVar, new tq2(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -887210858:
                if (!str.equals("getFormatNumber")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFormatNumber(kdbVar, new vq2(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 25575483:
                if (!str.equals("getFormatDate")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFormatDate(kdbVar, new uq2(map)).e();
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 26059610:
                if (!str.equals("getFormatTime")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFormatTime(kdbVar, new uq2(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1473081768:
                if (!str.equals("getFormatDateTime")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFormatDateTime(kdbVar, new uq2(map)).e();
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
