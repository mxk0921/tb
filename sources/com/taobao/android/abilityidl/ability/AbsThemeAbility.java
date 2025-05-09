package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dpt;
import tb.f0e;
import tb.g0e;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsThemeAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336654);
    }

    public static /* synthetic */ Object ipc$super(AbsThemeAbility absThemeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsThemeAbility");
    }

    public abstract tao<ThemeInfoResult, ErrorResult> getThemeInfo(kdb kdbVar, dpt dptVar);

    public abstract tao<String, ErrorResult> getThemeType(kdb kdbVar);

    public abstract void requestThemeInfo(kdb kdbVar, dpt dptVar, f0e f0eVar);

    public abstract void requestThemeType(kdb kdbVar, g0e g0eVar);
}
