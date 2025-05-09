package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.vah;
import tb.xmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsLocalizationAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336626);
    }

    public static /* synthetic */ Object ipc$super(AbsLocalizationAbility absLocalizationAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsLocalizationAbility");
    }

    public abstract tao<String, ErrorResult> getLanguage(kdb kdbVar);

    public abstract tao<String, ErrorResult> getLocation(kdb kdbVar);

    public abstract tao<Boolean, ErrorResult> isCnSite(kdb kdbVar);

    public abstract tao<Boolean, ErrorResult> isI18nEdition(kdb kdbVar);

    public abstract void setLocale(kdb kdbVar, vah vahVar, xmc xmcVar);
}
