package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.e70;
import tb.i70;
import tb.j70;
import tb.k70;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.udb;
import tb.vdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAccsAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336592);
    }

    public static /* synthetic */ Object ipc$super(AbsAccsAbility absAccsAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAccsAbility");
    }

    public abstract void addConnectionListener(kdb kdbVar, e70 e70Var, vdb vdbVar);

    public abstract void bindService(kdb kdbVar, k70 k70Var, udb udbVar);

    public abstract tao<AccsConnectionResult, ErrorResult> connection(kdb kdbVar, e70 e70Var);

    public abstract tao<Object, ErrorResult> removeConnectionListener(kdb kdbVar, i70 i70Var);

    public abstract tao<Object, ErrorResult> send(kdb kdbVar, j70 j70Var);

    public abstract tao<Object, ErrorResult> unBindService(kdb kdbVar, k70 k70Var);
}
