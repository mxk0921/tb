package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.e71;
import tb.g71;
import tb.i71;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAppMonitorAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336597);
    }

    public static /* synthetic */ Object ipc$super(AbsAppMonitorAbility absAppMonitorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAppMonitorAbility");
    }

    public abstract void alarmFail(kdb kdbVar, g71 g71Var, jdb jdbVar);

    public abstract void alarmSuccess(kdb kdbVar, i71 i71Var, jdb jdbVar);

    public abstract void counter(kdb kdbVar, e71 e71Var, jdb jdbVar);
}
