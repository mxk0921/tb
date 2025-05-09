package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aac;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.zba;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsGlobalMenuAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336619);
    }

    public static /* synthetic */ Object ipc$super(AbsGlobalMenuAbility absGlobalMenuAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsGlobalMenuAbility");
    }

    public abstract void show(kdb kdbVar, zba zbaVar, aac aacVar);
}
