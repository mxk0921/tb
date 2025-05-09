package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.an4;
import tb.dn4;
import tb.en4;
import tb.hl4;
import tb.il4;
import tb.in4;
import tb.jdb;
import tb.jn4;
import tb.kdb;
import tb.kn4;
import tb.ln4;
import tb.ml4;
import tb.mn4;
import tb.pm4;
import tb.pn4;
import tb.rn4;
import tb.rqb;
import tb.sm4;
import tb.sn4;
import tb.sqb;
import tb.st;
import tb.t2o;
import tb.tn4;
import tb.tqb;
import tb.un4;
import tb.vn4;
import tb.wn4;
import tb.xqb;
import tb.ym4;
import tb.yqb;
import tb.zm4;
import tb.zqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsContainerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336606);
    }

    public static /* synthetic */ Object ipc$super(AbsContainerAbility absContainerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsContainerAbility");
    }

    public abstract void addPageResizeListener(kdb kdbVar, sqb sqbVar);

    public abstract void addSwiperItem(kdb kdbVar, hl4 hl4Var, jdb jdbVar);

    public abstract void addSwiperSwitchListener(kdb kdbVar, xqb xqbVar);

    public abstract void addTabItem(kdb kdbVar, il4 il4Var, jdb jdbVar);

    public abstract void addTabSwitchListener(kdb kdbVar, zqb zqbVar);

    public abstract void disableInterceptPageClose(kdb kdbVar, jdb jdbVar);

    public abstract void hideErrorPage(kdb kdbVar, jdb jdbVar);

    public abstract void hideSwiperHeader(kdb kdbVar, jdb jdbVar);

    public abstract void hideTab(kdb kdbVar, sn4 sn4Var, jdb jdbVar);

    public abstract void interceptPageClose(kdb kdbVar, pm4 pm4Var, rqb rqbVar);

    public abstract void interceptTabBarClick(kdb kdbVar, yqb yqbVar);

    public abstract void preRenderSubPage(kdb kdbVar, sm4 sm4Var, jdb jdbVar);

    public abstract void prewarmMultiResource(kdb kdbVar, dn4 dn4Var, jdb jdbVar);

    public abstract void prewarmResource(kdb kdbVar, en4 en4Var, jdb jdbVar);

    public abstract void registerPage(kdb kdbVar, ym4 ym4Var, jdb jdbVar);

    public abstract void removePageResizeListener(kdb kdbVar, jdb jdbVar);

    public abstract void removeSwiperItem(kdb kdbVar, zm4 zm4Var, jdb jdbVar);

    public abstract void removeSwiperSwitchListener(kdb kdbVar, jdb jdbVar);

    public abstract void removeTabBarBadge(kdb kdbVar, tn4 tn4Var, jdb jdbVar);

    public abstract void removeTabItem(kdb kdbVar, an4 an4Var, jdb jdbVar);

    public abstract void removeTabSwitchListener(kdb kdbVar, jdb jdbVar);

    public abstract void reportSubPagePreRenderStatus(kdb kdbVar, pn4 pn4Var, jdb jdbVar);

    public abstract void requestContainerPosition(kdb kdbVar, tqb tqbVar);

    public abstract void setOrientation(kdb kdbVar, in4 in4Var, jdb jdbVar);

    public abstract void setPageBgColor(kdb kdbVar, ml4 ml4Var, jdb jdbVar);

    public abstract void setSwiperEnable(kdb kdbVar, jn4 jn4Var, jdb jdbVar);

    public abstract void setTabBarBadge(kdb kdbVar, un4 un4Var, jdb jdbVar);

    public abstract void setTabBarItem(kdb kdbVar, kn4 kn4Var, jdb jdbVar);

    public abstract void setTabBarMode(kdb kdbVar, vn4 vn4Var, jdb jdbVar);

    public abstract void showErrorPage(kdb kdbVar, jdb jdbVar);

    public abstract void showSwiperHeader(kdb kdbVar, ln4 ln4Var, jdb jdbVar);

    public abstract void showTab(kdb kdbVar, sn4 sn4Var, jdb jdbVar);

    public abstract void slideTo(kdb kdbVar, mn4 mn4Var, jdb jdbVar);

    public abstract void switchTab(kdb kdbVar, wn4 wn4Var, jdb jdbVar);

    public abstract void swizzleTab(kdb kdbVar, rn4 rn4Var, jdb jdbVar);
}
