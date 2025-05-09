package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.k2e;
import tb.kdb;
import tb.m2e;
import tb.ncu;
import tb.pcu;
import tb.qcu;
import tb.rcu;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsTradeHybridAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336657);
    }

    public static /* synthetic */ Object ipc$super(AbsTradeHybridAbility absTradeHybridAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsTradeHybridAbility");
    }

    public abstract void notifyBizLifecycle(kdb kdbVar, ncu ncuVar, jdb jdbVar);

    public abstract void notifyStage(kdb kdbVar, qcu qcuVar, jdb jdbVar);

    public abstract void onBindPreData(kdb kdbVar, pcu pcuVar, k2e k2eVar);

    public abstract void unexpectedReachDone(kdb kdbVar, rcu rcuVar, m2e m2eVar);

    public abstract void unexpectedReachMark(kdb kdbVar, rcu rcuVar, m2e m2eVar);
}
