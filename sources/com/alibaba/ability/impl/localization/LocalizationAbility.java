package com.alibaba.ability.impl.localization;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilityidl.ability.AbsLocalizationAbility;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.kdb;
import tb.o78;
import tb.t2o;
import tb.tao;
import tb.vah;
import tb.xmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LocalizationAbility extends AbsLocalizationAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(113246210);
    }

    public static /* synthetic */ Object ipc$super(LocalizationAbility localizationAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/localization/LocalizationAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public tao<String, ErrorResult> getLanguage(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("7163064e", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Language h = Localization.h();
        ckf.f(h, "Localization.getLanguage()");
        return new tao<>(h.getTag(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public tao<String, ErrorResult> getLocation(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("48787c51", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        return new tao<>(Localization.j(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public tao<Boolean, ErrorResult> isCnSite(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("894e5d40", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        return new tao<>(Boolean.valueOf(Localization.n()), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public tao<Boolean, ErrorResult> isI18nEdition(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("3ca067e6", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        return new tao<>(Boolean.valueOf(Localization.o()), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocalizationAbility
    public void setLocale(kdb kdbVar, vah vahVar, xmc xmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986216bc", new Object[]{this, kdbVar, vahVar, xmcVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(vahVar, "params");
        ckf.g(xmcVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            Language cast2Enum = Language.cast2Enum(vahVar.f29889a);
            if (cast2Enum != null) {
                String str = vahVar.b;
                ckf.f(str, AdvanceSetting.NETWORK_TYPE);
                if (str.length() <= 0 || !o78.a(str)) {
                    str = null;
                }
                if (str != null) {
                    Localization.t(cast2Enum, str);
                    o78.I(context, vahVar.b, o78.SWITCH_TYPE_SETTING);
                    xmcVar.onSuccess();
                    return;
                }
                ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
                xmcVar.O(aVar.g("param location: " + vahVar.b + " invalid"));
                return;
            }
            ErrorResult.a.C0055a aVar2 = ErrorResult.a.Companion;
            xmcVar.O(aVar2.g("param language: " + vahVar.f29889a + " invalid"));
            return;
        }
        xmcVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }
}
