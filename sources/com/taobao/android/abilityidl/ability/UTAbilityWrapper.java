package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a1v;
import tb.a2v;
import tb.a4v;
import tb.b4v;
import tb.c4v;
import tb.ckf;
import tb.e4v;
import tb.kdb;
import tb.l0v;
import tb.rxy;
import tb.sxy;
import tb.t2o;
import tb.u3v;
import tb.v3v;
import tb.vq;
import tb.w3v;
import tb.x3v;
import tb.y3v;
import tb.z3v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UTAbilityWrapper extends AbsAbilityWrapper<AbsUTAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337587);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTAbilityWrapper(AbsUTAbility absUTAbility) {
        super(absUTAbility);
        ckf.g(absUTAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(UTAbilityWrapper uTAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UTAbilityWrapper");
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
            case -1887716704:
                if (!str.equals(a1v.UPDATE_SESSION_PROPERTY)) {
                    return null;
                }
                try {
                    getAbilityImpl().updateSessionProperties(kdbVar, new c4v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1773402202:
                if (!str.equals("updateNextPageUtparamCnt")) {
                    return null;
                }
                try {
                    getAbilityImpl().updateNextPageUtparamCnt(kdbVar, new v3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1025553932:
                if (!str.equals("pageDisAppear")) {
                    return null;
                }
                try {
                    getAbilityImpl().pageDisAppear(kdbVar, new e4v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -439577013:
                if (!str.equals(a1v.UPDATE_PAGE_PROPERTIES)) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePageProperties(kdbVar, new y3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 2958602:
                if (!str.equals("updatePageStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePageStatus(kdbVar, new z3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 199951203:
                if (!str.equals("pageAppearDonotSkip")) {
                    return null;
                }
                try {
                    getAbilityImpl().pageAppearDonotSkip(kdbVar, new a2v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case 768062724:
                if (!str.equals(a1v.PAGE_APPEAR)) {
                    return null;
                }
                try {
                    getAbilityImpl().pageAppear(kdbVar, new a2v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case 985529912:
                if (!str.equals(a1v.GET_PAGE_SPM_PRE)) {
                    return null;
                }
                try {
                    return getAbilityImpl().getPageSpmPre(kdbVar, new e4v(map)).e();
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case 985534724:
                if (!str.equals(a1v.GET_PAGE_SPM_URL)) {
                    return null;
                }
                try {
                    return getAbilityImpl().getPageSpmUrl(kdbVar, new e4v(map)).e();
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case 1152682910:
                if (!str.equals(a1v.UPDATE_NEXT_PAGE_PROPERTIES)) {
                    return null;
                }
                try {
                    getAbilityImpl().updateNextPageProperties(kdbVar, new u3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case 1227135126:
                if (!str.equals("requestPageAllProperties")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestPageAllProperties(kdbVar, new e4v(map), new sxy(vqVar));
                    return null;
                } catch (Throwable th11) {
                    return ErrorResult.a.Companion.g(th11.getMessage());
                }
            case 1421600451:
                if (!str.equals("updateNextPageUtparam")) {
                    return null;
                }
                try {
                    getAbilityImpl().updateNextPageUtparam(kdbVar, new w3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th12) {
                    return ErrorResult.a.Companion.g(th12.getMessage());
                }
            case 1487963043:
                if (!str.equals("commitEvent")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitEvent(kdbVar, new l0v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th13) {
                    return ErrorResult.a.Companion.g(th13.getMessage());
                }
            case 1729443235:
                if (!str.equals("updatePageName")) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePageName(kdbVar, new x3v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th14) {
                    return ErrorResult.a.Companion.g(th14.getMessage());
                }
            case 1880007478:
                if (!str.equals(a1v.UPDATE_PAGE_UTPARAM)) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePageUtparam(kdbVar, new b4v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th15) {
                    return ErrorResult.a.Companion.g(th15.getMessage());
                }
            case 1995458391:
                if (!str.equals(a1v.UPDATE_PAGEURL)) {
                    return null;
                }
                try {
                    getAbilityImpl().updatePageUrl(kdbVar, new a4v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th16) {
                    return ErrorResult.a.Companion.g(th16.getMessage());
                }
            case 2145313966:
                if (!str.equals(a1v.SKIP_PAGE)) {
                    return null;
                }
                try {
                    getAbilityImpl().skipPage(kdbVar, new e4v(map), new rxy(vqVar));
                    return null;
                } catch (Throwable th17) {
                    return ErrorResult.a.Companion.g(th17.getMessage());
                }
            default:
                return null;
        }
    }
}
