package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.drb;
import tb.kdb;
import tb.mo4;
import tb.no4;
import tb.oo4;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsContentCommissionAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336607);
    }

    public static /* synthetic */ Object ipc$super(AbsContentCommissionAbility absContentCommissionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsContentCommissionAbility");
    }

    public abstract void commitContentCommissionTrack(kdb kdbVar, mo4 mo4Var, drb drbVar);

    public abstract void commitLiveCommissionTrack(kdb kdbVar, no4 no4Var, drb drbVar);

    public abstract void commitOuterCommissionTrack(kdb kdbVar, oo4 oo4Var, drb drbVar);
}
