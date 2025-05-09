package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import java.util.Map;
import tb.ckf;
import tb.cvo;
import tb.hvy;
import tb.ivy;
import tb.jvo;
import tb.jvy;
import tb.kdb;
import tb.mx6;
import tb.rvo;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ScreenAbilityWrapper extends AbsAbilityWrapper<AbsScreenAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337480);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenAbilityWrapper(AbsScreenAbility absScreenAbility) {
        super(absScreenAbility);
        ckf.g(absScreenAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ScreenAbilityWrapper screenAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ScreenAbilityWrapper");
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
            case -2079769446:
                if (str.equals("getOrientation")) {
                    return getAbilityImpl().getOrientation(kdbVar).e();
                }
                return null;
            case -2003857565:
                if (!str.equals("setCaptureEnabledForAndroid")) {
                    return null;
                }
                try {
                    getAbilityImpl().setCaptureEnabledForAndroid(kdbVar, new cvo(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1135253436:
                if (!str.equals("keepOn")) {
                    return null;
                }
                try {
                    getAbilityImpl().keepOn(kdbVar, new jvo(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -449556206:
                if (str.equals(WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT)) {
                    return getAbilityImpl().getStatusBarHeight(kdbVar).e();
                }
                return null;
            case -297880232:
                if (!str.equals("setCaptureListener")) {
                    return null;
                }
                getAbilityImpl().setCaptureListener(kdbVar, new ivy(vqVar));
                return null;
            case -277154275:
                if (!str.equals("setCaptureEnabled")) {
                    return null;
                }
                try {
                    getAbilityImpl().setCaptureEnabled(kdbVar, new cvo(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -75444956:
                if (str.equals("getInfo")) {
                    return getAbilityImpl().getInfo(kdbVar).e();
                }
                return null;
            case 350413895:
                if (str.equals("getBrightness")) {
                    return getAbilityImpl().getBrightness(kdbVar).e();
                }
                return null;
            case 443461646:
                if (!str.equals("setOrientation")) {
                    return null;
                }
                try {
                    getAbilityImpl().setOrientation(kdbVar, new rvo(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 711700401:
                if (!str.equals("unsetCaptureListener")) {
                    return null;
                }
                getAbilityImpl().unsetCaptureListener(kdbVar, new mx6(vqVar));
                return null;
            case 1124545107:
                if (!str.equals("setBrightness")) {
                    return null;
                }
                try {
                    getAbilityImpl().setBrightness(kdbVar, new ScreenSetBrightnessParams(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 1217653474:
                if (!str.equals("setOrientationListener")) {
                    return null;
                }
                getAbilityImpl().setOrientationListener(kdbVar, new jvy(vqVar));
                return null;
            case 1452937403:
                if (!str.equals("unsetOrientationListener")) {
                    return null;
                }
                getAbilityImpl().unsetOrientationListener(kdbVar, new mx6(vqVar));
                return null;
            case 1912362048:
                if (!str.equals("requestBrightness")) {
                    return null;
                }
                getAbilityImpl().requestBrightness(kdbVar, new hvy(vqVar));
                return null;
            default:
                return null;
        }
    }
}
