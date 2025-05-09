package com.taobao.android.festival.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsThemeAbility;
import com.taobao.android.abilityidl.ability.ThemeInfoResult;
import com.taobao.android.abilityidl.ability.ThemeTypeResult;
import com.taobao.android.festival.FestivalMgr;
import tb.dpt;
import tb.f0e;
import tb.g0e;
import tb.kdb;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThemeAbility extends AbsThemeAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519181);
    }

    public static /* synthetic */ Object ipc$super(ThemeAbility themeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/ability/ThemeAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsThemeAbility
    public tao<ThemeInfoResult, ErrorResult> getThemeInfo(kdb kdbVar, dpt dptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("78e7acd9", new Object[]{this, kdbVar, dptVar});
        }
        return new tao<>(FestivalMgr.i().n(dptVar.f18000a), null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsThemeAbility
    public tao<String, ErrorResult> getThemeType(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("abfeaf4f", new Object[]{this, kdbVar});
        }
        return new tao<>(FestivalMgr.i().p(), null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsThemeAbility
    public void requestThemeInfo(kdb kdbVar, dpt dptVar, f0e f0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434f474c", new Object[]{this, kdbVar, dptVar, f0eVar});
        } else {
            f0eVar.t0(FestivalMgr.i().n(dptVar.f18000a));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsThemeAbility
    public void requestThemeType(kdb kdbVar, g0e g0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c529c8", new Object[]{this, kdbVar, g0eVar});
            return;
        }
        ThemeTypeResult themeTypeResult = new ThemeTypeResult();
        themeTypeResult.themeType = FestivalMgr.i().p();
        g0eVar.D(themeTypeResult);
    }
}
