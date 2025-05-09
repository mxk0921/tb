package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h40;
import tb.jdb;
import tb.kdb;
import tb.rdb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAccelerometerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336591);
    }

    public static /* synthetic */ Object ipc$super(AbsAccelerometerAbility absAccelerometerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAccelerometerAbility");
    }

    public abstract void setShakeListener(kdb kdbVar, h40 h40Var, rdb rdbVar);

    public abstract void unsetShakeListener(kdb kdbVar, jdb jdbVar);
}
