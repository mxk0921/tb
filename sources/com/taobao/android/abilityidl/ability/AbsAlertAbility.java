package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cfb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.xk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAlertAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336594);
    }

    public static /* synthetic */ Object ipc$super(AbsAlertAbility absAlertAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAlertAbility");
    }

    public abstract void show(kdb kdbVar, xk0 xk0Var, cfb cfbVar);
}
