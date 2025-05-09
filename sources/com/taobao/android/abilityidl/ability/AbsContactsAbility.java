package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.al4;
import tb.cqb;
import tb.dqb;
import tb.kdb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsContactsAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336605);
    }

    public static /* synthetic */ Object ipc$super(AbsContactsAbility absContactsAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsContactsAbility");
    }

    public abstract void choose(kdb kdbVar, cqb cqbVar);

    public abstract void query(kdb kdbVar, al4 al4Var, dqb dqbVar);
}
