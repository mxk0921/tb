package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ahy;
import tb.an4;
import tb.ckf;
import tb.dn4;
import tb.en4;
import tb.hl4;
import tb.il4;
import tb.in4;
import tb.jn4;
import tb.kdb;
import tb.kn4;
import tb.ln4;
import tb.ml4;
import tb.mn4;
import tb.mx6;
import tb.pm4;
import tb.pn4;
import tb.rn4;
import tb.sm4;
import tb.sn4;
import tb.t2o;
import tb.tn4;
import tb.un4;
import tb.vgy;
import tb.vn4;
import tb.vq;
import tb.wgy;
import tb.wn4;
import tb.xgy;
import tb.ygy;
import tb.ym4;
import tb.zgy;
import tb.zm4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ContainerAbilityWrapper extends AbsAbilityWrapper<AbsContainerAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336786);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerAbilityWrapper(AbsContainerAbility absContainerAbility) {
        super(absContainerAbility);
        ckf.g(absContainerAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ContainerAbilityWrapper containerAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerAbilityWrapper");
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
            case -2119262196:
                if (!str.equals("slideTo")) {
                    return null;
                }
                try {
                    getAbilityImpl().slideTo(kdbVar, new mn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1896221285:
                if (!str.equals("removePageResizeListener")) {
                    return null;
                }
                getAbilityImpl().removePageResizeListener(kdbVar, new mx6(vqVar));
                return null;
            case -1707869230:
                if (!str.equals("registerPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().registerPage(kdbVar, new ym4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1568433273:
                if (!str.equals("hideSwiperHeader")) {
                    return null;
                }
                getAbilityImpl().hideSwiperHeader(kdbVar, new mx6(vqVar));
                return null;
            case -1238336753:
                if (!str.equals("disableInterceptPageClose")) {
                    return null;
                }
                getAbilityImpl().disableInterceptPageClose(kdbVar, new mx6(vqVar));
                return null;
            case -844402364:
                if (!str.equals("removeSwiperSwitchListener")) {
                    return null;
                }
                getAbilityImpl().removeSwiperSwitchListener(kdbVar, new mx6(vqVar));
                return null;
            case -746243005:
                if (!str.equals("setTabBarBadge")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarBadge(kdbVar, new un4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -703775786:
                if (!str.equals("prewarmResource")) {
                    return null;
                }
                try {
                    getAbilityImpl().prewarmResource(kdbVar, new en4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -604604703:
                if (!str.equals("removeTabBarBadge")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeTabBarBadge(kdbVar, new tn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case -358441180:
                if (!str.equals("removeTabItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeTabItem(kdbVar, new an4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case -311904710:
                if (!str.equals("showErrorPage")) {
                    return null;
                }
                getAbilityImpl().showErrorPage(kdbVar, new mx6(vqVar));
                return null;
            case -160055071:
                if (!str.equals("addSwiperSwitchListener")) {
                    return null;
                }
                getAbilityImpl().addSwiperSwitchListener(kdbVar, new ygy(vqVar));
                return null;
            case -76116900:
                if (!str.equals("addTabSwitchListener")) {
                    return null;
                }
                getAbilityImpl().addTabSwitchListener(kdbVar, new ahy(vqVar));
                return null;
            case 39684216:
                if (!str.equals("addPageResizeListener")) {
                    return null;
                }
                getAbilityImpl().addPageResizeListener(kdbVar, new wgy(vqVar));
                return null;
            case 149252304:
                if (!str.equals("reportSubPagePreRenderStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().reportSubPagePreRenderStatus(kdbVar, new pn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case 253249139:
                if (!str.equals("setTabBarItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarItem(kdbVar, new kn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case 253363459:
                if (!str.equals("setTabBarMode")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarMode(kdbVar, new vn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case 354301031:
                if (!str.equals("addTabItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().addTabItem(kdbVar, new il4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case 443461646:
                if (!str.equals("setOrientation")) {
                    return null;
                }
                try {
                    getAbilityImpl().setOrientation(kdbVar, new in4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th11) {
                    return ErrorResult.a.Companion.g(th11.getMessage());
                }
            case 483875628:
                if (!str.equals("addSwiperItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().addSwiperItem(kdbVar, new hl4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th12) {
                    return ErrorResult.a.Companion.g(th12.getMessage());
                }
            case 511694541:
                if (!str.equals("setPageBgColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setPageBgColor(kdbVar, new ml4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th13) {
                    return ErrorResult.a.Companion.g(th13.getMessage());
                }
            case 578515349:
                if (!str.equals("hideErrorPage")) {
                    return null;
                }
                getAbilityImpl().hideErrorPage(kdbVar, new mx6(vqVar));
                return null;
            case 596564383:
                if (!str.equals("prewarmMultiResource")) {
                    return null;
                }
                try {
                    getAbilityImpl().prewarmMultiResource(kdbVar, new dn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th14) {
                    return ErrorResult.a.Companion.g(th14.getMessage());
                }
            case 832406984:
                if (!str.equals("interceptTabBarClick")) {
                    return null;
                }
                getAbilityImpl().interceptTabBarClick(kdbVar, new zgy(vqVar));
                return null;
            case 912607987:
                if (!str.equals("hideTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().hideTab(kdbVar, new sn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th15) {
                    return ErrorResult.a.Companion.g(th15.getMessage());
                }
            case 1290438151:
                if (!str.equals("interceptPageClose")) {
                    return null;
                }
                try {
                    getAbilityImpl().interceptPageClose(kdbVar, new pm4(map), new vgy(vqVar));
                    return null;
                } catch (Throwable th16) {
                    return ErrorResult.a.Companion.g(th16.getMessage());
                }
            case 1345414647:
                if (!str.equals("swizzleTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().swizzleTab(kdbVar, new rn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th17) {
                    return ErrorResult.a.Companion.g(th17.getMessage());
                }
            case 1488915869:
                if (!str.equals("setSwiperEnable")) {
                    return null;
                }
                try {
                    getAbilityImpl().setSwiperEnable(kdbVar, new jn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th18) {
                    return ErrorResult.a.Companion.g(th18.getMessage());
                }
            case 1498979151:
                if (!str.equals("removeSwiperItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeSwiperItem(kdbVar, new zm4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th19) {
                    return ErrorResult.a.Companion.g(th19.getMessage());
                }
            case 1524002521:
                if (!str.equals("removeTabSwitchListener")) {
                    return null;
                }
                getAbilityImpl().removeTabSwitchListener(kdbVar, new mx6(vqVar));
                return null;
            case 1529287830:
                if (!str.equals("preRenderSubPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().preRenderSubPage(kdbVar, new sm4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th20) {
                    return ErrorResult.a.Companion.g(th20.getMessage());
                }
            case 1651364801:
                if (!str.equals("switchTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().switchTab(kdbVar, new wn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th21) {
                    return ErrorResult.a.Companion.g(th21.getMessage());
                }
            case 1926436347:
                if (!str.equals("requestContainerPosition")) {
                    return null;
                }
                getAbilityImpl().requestContainerPosition(kdbVar, new xgy(vqVar));
                return null;
            case 1940576450:
                if (!str.equals("showSwiperHeader")) {
                    return null;
                }
                try {
                    getAbilityImpl().showSwiperHeader(kdbVar, new ln4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th22) {
                    return ErrorResult.a.Companion.g(th22.getMessage());
                }
            case 2067279704:
                if (!str.equals("showTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().showTab(kdbVar, new sn4(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th23) {
                    return ErrorResult.a.Companion.g(th23.getMessage());
                }
            default:
                return null;
        }
    }
}
