package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;
import tb.ckf;
import tb.jny;
import tb.kdb;
import tb.kny;
import tb.mx6;
import tb.pmj;
import tb.rmj;
import tb.smj;
import tb.t2o;
import tb.tmj;
import tb.umj;
import tb.vmj;
import tb.vq;
import tb.wmj;
import tb.xmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class NavBarAbilityWrapper extends AbsAbilityWrapper<AbsNavBarAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337286);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarAbilityWrapper(AbsNavBarAbility absNavBarAbility) {
        super(absNavBarAbility);
        ckf.g(absNavBarAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(NavBarAbilityWrapper navBarAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NavBarAbilityWrapper");
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
            case -1821121633:
                if (!str.equals("hideStatusBar")) {
                    return null;
                }
                getAbilityImpl().hideStatusBar(kdbVar, new mx6(vqVar));
                return null;
            case -1617961863:
                if (!str.equals("setImmersive")) {
                    return null;
                }
                try {
                    getAbilityImpl().setImmersive(kdbVar, new rmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1526161572:
                if (!str.equals("setBgColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setBgColor(kdbVar, new pmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1322984979:
                if (!str.equals("setTitleColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitleColor(kdbVar, new pmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1320333267:
                if (!str.equals("hideRightItem")) {
                    return null;
                }
                getAbilityImpl().hideRightItem(kdbVar, new mx6(vqVar));
                return null;
            case -1317514267:
                if (!str.equals("setTitleImage")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitleImage(kdbVar, new wmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -794464810:
                if (!str.equals("showBackButton")) {
                    return null;
                }
                getAbilityImpl().showBackButton(kdbVar, new mx6(vqVar));
                return null;
            case -30051059:
                if (!str.equals("setRightItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().setRightItem(kdbVar, new smj(map), new jny(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 3202370:
                if (!str.equals("hide")) {
                    return null;
                }
                try {
                    getAbilityImpl().hide(kdbVar, new xmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case 3529469:
                if (!str.equals("show")) {
                    return null;
                }
                try {
                    getAbilityImpl().show(kdbVar, new xmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case 1038753243:
                if (!str.equals("hideBackButton")) {
                    return null;
                }
                getAbilityImpl().hideBackButton(kdbVar, new mx6(vqVar));
                return null;
            case 1405040263:
                if (!str.equals("setTheme")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTheme(kdbVar, new umj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case 1405084438:
                if (!str.equals("setTitle")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitle(kdbVar, new vmj(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case 1484510783:
                if (!str.equals("setShareConfig")) {
                    return null;
                }
                try {
                    getAbilityImpl().setShareConfig(kdbVar, new tmj(map), new kny(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case 1583425604:
                if (!str.equals(DxContainerActivity.PARAMS_SHOW_STATUS_BAR)) {
                    return null;
                }
                getAbilityImpl().showStatusBar(kdbVar, new mx6(vqVar));
                return null;
            default:
                return null;
        }
    }
}
