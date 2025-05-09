package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iv9;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.z7c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsFootprintAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336617);
    }

    public static /* synthetic */ Object ipc$super(AbsFootprintAbility absFootprintAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsFootprintAbility");
    }

    public abstract void requestFootprintList(kdb kdbVar, iv9 iv9Var, z7c z7cVar);
}
