package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.gwy;
import tb.j3r;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.t6s;
import tb.u2r;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SystemAbilityWrapper extends AbsAbilityWrapper<AbsSystemAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337527);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAbilityWrapper(AbsSystemAbility absSystemAbility) {
        super(absSystemAbility);
        ckf.g(absSystemAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(SystemAbilityWrapper systemAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SystemAbilityWrapper");
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
            case -1582326245:
                if (str.equals("isVoiceOverOn")) {
                    return getAbilityImpl().isVoiceOverOn(kdbVar).e();
                }
                return null;
            case -821636766:
                if (!str.equals("openLocationSettings")) {
                    return null;
                }
                getAbilityImpl().openLocationSettings(kdbVar, new mx6(vqVar));
                return null;
            case -45886082:
                if (!str.equals(t6s.BRIDGE_ACTION_OPENBROWSER)) {
                    return null;
                }
                try {
                    getAbilityImpl().openBrowser(kdbVar, new j3r(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 20734173:
                if (str.equals("checkLocation")) {
                    return getAbilityImpl().checkLocation(kdbVar).e();
                }
                return null;
            case 193924596:
                if (!str.equals("checkAppInstallStatus")) {
                    return null;
                }
                try {
                    return getAbilityImpl().checkAppInstallStatus(kdbVar, new u2r(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 339335005:
                if (!str.equals("requestNotificationSettings")) {
                    return null;
                }
                getAbilityImpl().requestNotificationSettings(kdbVar, new gwy(vqVar));
                return null;
            case 347240634:
                if (!str.equals("openAppSettings")) {
                    return null;
                }
                getAbilityImpl().openAppSettings(kdbVar, new mx6(vqVar));
                return null;
            case 354860483:
                if (str.equals("isNFCReadingSupported")) {
                    return getAbilityImpl().isNFCReadingSupported(kdbVar).e();
                }
                return null;
            case 457367448:
                if (!str.equals("openNotificationSettings")) {
                    return null;
                }
                getAbilityImpl().openNotificationSettings(kdbVar, new mx6(vqVar));
                return null;
            default:
                return null;
        }
    }
}
