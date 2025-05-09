package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.jxy;
import tb.kdb;
import tb.kxy;
import tb.mx6;
import tb.t2o;
import tb.vq;
import tb.ywt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class TinyAppAbilityWrapper extends AbsAbilityWrapper<AbsTinyAppAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337548);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppAbilityWrapper(AbsTinyAppAbility absTinyAppAbility) {
        super(absTinyAppAbility);
        ckf.g(absTinyAppAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(TinyAppAbilityWrapper tinyAppAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TinyAppAbilityWrapper");
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
            case -1213411207:
                if (!str.equals("removeUserActiveAddIconListener")) {
                    return null;
                }
                getAbilityImpl().removeUserActiveAddIconListener(kdbVar, new mx6(vqVar));
                return null;
            case -1041609130:
                if (!str.equals("showICONChangeGuide")) {
                    return null;
                }
                try {
                    getAbilityImpl().showICONChangeGuide(kdbVar, new ywt(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -440088476:
                if (!str.equals("checkAddIconButton")) {
                    return null;
                }
                getAbilityImpl().checkAddIconButton(kdbVar, new jxy(vqVar));
                return null;
            case 465996379:
                if (!str.equals("showActiveReplacePopup")) {
                    return null;
                }
                getAbilityImpl().showActiveReplacePopup(kdbVar, new mx6(vqVar));
                return null;
            case 1474607868:
                if (!str.equals("addUserActiveAddIconListener")) {
                    return null;
                }
                getAbilityImpl().addUserActiveAddIconListener(kdbVar, new kxy(vqVar));
                return null;
            default:
                return null;
        }
    }
}
