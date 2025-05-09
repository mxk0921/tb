package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ayy;
import tb.byy;
import tb.ckf;
import tb.cyy;
import tb.iev;
import tb.jev;
import tb.kdb;
import tb.kev;
import tb.lev;
import tb.mev;
import tb.mx6;
import tb.nev;
import tb.oev;
import tb.pev;
import tb.qev;
import tb.rev;
import tb.sev;
import tb.t2o;
import tb.tev;
import tb.txy;
import tb.uev;
import tb.uxy;
import tb.vev;
import tb.vq;
import tb.vxy;
import tb.wev;
import tb.wxy;
import tb.xxy;
import tb.yxy;
import tb.zxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UmiPrivatePublishAbilityWrapper extends AbsAbilityWrapper<AbsUmiPrivatePublishAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337610);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UmiPrivatePublishAbilityWrapper(AbsUmiPrivatePublishAbility absUmiPrivatePublishAbility) {
        super(absUmiPrivatePublishAbility);
        ckf.g(absUmiPrivatePublishAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(UmiPrivatePublishAbilityWrapper umiPrivatePublishAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishAbilityWrapper");
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
            case -1903226646:
                if (!str.equals("appendMedia")) {
                    return null;
                }
                try {
                    getAbilityImpl().appendMedia(kdbVar, new iev(map), new txy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1680466457:
                if (!str.equals("changeCover")) {
                    return null;
                }
                try {
                    getAbilityImpl().changeCover(kdbVar, new kev(map), new uxy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1191837571:
                if (!str.equals("deleteDrafts")) {
                    return null;
                }
                try {
                    getAbilityImpl().deleteDrafts(kdbVar, new lev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1138897671:
                if (!str.equals("deleteMedia")) {
                    return null;
                }
                try {
                    getAbilityImpl().deleteMedia(kdbVar, new mev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -1055909481:
                if (!str.equals("openVideoBrowser")) {
                    return null;
                }
                try {
                    getAbilityImpl().openVideoBrowser(kdbVar, new wev(map), new cyy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case -1050357029:
                if (!str.equals("openImageEdit")) {
                    return null;
                }
                try {
                    getAbilityImpl().openImageEdit(kdbVar, new pev(map), new xxy(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case -891535336:
                if (!str.equals("submit")) {
                    return null;
                }
                try {
                    getAbilityImpl().submit(kdbVar, new vev(map), new byy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case -887427003:
                if (!str.equals("fetchDraftList")) {
                    return null;
                }
                try {
                    getAbilityImpl().fetchDraftList(kdbVar, new nev(map), new vxy(vqVar));
                    return null;
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case -310490953:
                if (!str.equals("openImageBrowser")) {
                    return null;
                }
                try {
                    getAbilityImpl().openImageBrowser(kdbVar, new pev(map), new xxy(vqVar));
                    return null;
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case -241966853:
                if (!str.equals("queryDraftsSize")) {
                    return null;
                }
                try {
                    getAbilityImpl().queryDraftsSize(kdbVar, new qev(map), new yxy(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case 159133220:
                if (!str.equals("saveDraft")) {
                    return null;
                }
                try {
                    getAbilityImpl().saveDraft(kdbVar, new sev(map), new ayy(vqVar));
                    return null;
                } catch (Throwable th11) {
                    return ErrorResult.a.Companion.g(th11.getMessage());
                }
            case 175309252:
                if (!str.equals("setCallbackResult")) {
                    return null;
                }
                try {
                    getAbilityImpl().setCallbackResult(kdbVar, new tev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th12) {
                    return ErrorResult.a.Companion.g(th12.getMessage());
                }
            case 477147032:
                if (!str.equals("comprehensionRecommend")) {
                    return null;
                }
                try {
                    getAbilityImpl().comprehensionRecommend(kdbVar, new rev(map), new zxy(vqVar));
                    return null;
                } catch (Throwable th13) {
                    return ErrorResult.a.Companion.g(th13.getMessage());
                }
            case 485970056:
                if (!str.equals("setParams")) {
                    return null;
                }
                try {
                    getAbilityImpl().setParams(kdbVar, new uev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th14) {
                    return ErrorResult.a.Companion.g(th14.getMessage());
                }
            case 1160752635:
                if (!str.equals("openVideoEdit")) {
                    return null;
                }
                try {
                    getAbilityImpl().openVideoEdit(kdbVar, new wev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th15) {
                    return ErrorResult.a.Companion.g(th15.getMessage());
                }
            case 1300001013:
                if (!str.equals("requestParams")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestParams(kdbVar, new oev(map), new wxy(vqVar));
                    return null;
                } catch (Throwable th16) {
                    return ErrorResult.a.Companion.g(th16.getMessage());
                }
            case 2054139635:
                if (!str.equals("asyncPublish")) {
                    return null;
                }
                try {
                    getAbilityImpl().asyncPublish(kdbVar, new jev(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th17) {
                    return ErrorResult.a.Companion.g(th17.getMessage());
                }
            default:
                return null;
        }
    }
}
