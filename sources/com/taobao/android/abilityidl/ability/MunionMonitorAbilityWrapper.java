package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.acj;
import tb.bcj;
import tb.ccj;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.vq;
import tb.zbj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MunionMonitorAbilityWrapper extends AbsAbilityWrapper<AbsMunionMonitorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337281);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MunionMonitorAbilityWrapper(AbsMunionMonitorAbility absMunionMonitorAbility) {
        super(absMunionMonitorAbility);
        ckf.g(absMunionMonitorAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(MunionMonitorAbilityWrapper munionMonitorAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/MunionMonitorAbilityWrapper");
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
            case -1202377018:
                if (!str.equals("commitTaokeTrack")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitTaokeTrack(kdbVar, new ccj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 658296453:
                if (!str.equals("generateClickIdBy")) {
                    return null;
                }
                try {
                    return getAbilityImpl().generateClickIdBy(kdbVar, new zbj(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 670684350:
                if (!str.equals("commitInteractTrack")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitInteractTrack(kdbVar, new bcj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1465312516:
                if (!str.equals("handleAdUrl")) {
                    return null;
                }
                try {
                    return getAbilityImpl().handleAdUrl(kdbVar, new zbj(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 2036022860:
                if (!str.equals("commitIFSTrack")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitIFSTrack(kdbVar, new acj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
