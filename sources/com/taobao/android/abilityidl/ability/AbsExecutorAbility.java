package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hn8;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.y3c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsExecutorAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336612);
    }

    public static /* synthetic */ Object ipc$super(AbsExecutorAbility absExecutorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsExecutorAbility");
    }

    public abstract void batchExecute(kdb kdbVar, hn8 hn8Var, y3c y3cVar);
}
