package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f6a;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.w8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsGeneralSettingAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336618);
    }

    public static /* synthetic */ Object ipc$super(AbsGeneralSettingAbility absGeneralSettingAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsGeneralSettingAbility");
    }

    public abstract tao<String, ErrorResult> get(kdb kdbVar, f6a f6aVar);

    public abstract void setChangeListener(kdb kdbVar, f6a f6aVar, w8c w8cVar);

    public abstract tao<Object, ErrorResult> unsetChangeListener(kdb kdbVar, f6a f6aVar);
}
