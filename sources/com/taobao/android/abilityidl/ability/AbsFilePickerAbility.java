package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ed9;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.t6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsFilePickerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336616);
    }

    public static /* synthetic */ Object ipc$super(AbsFilePickerAbility absFilePickerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsFilePickerAbility");
    }

    public abstract void open(kdb kdbVar, ed9 ed9Var, t6c t6cVar);
}
