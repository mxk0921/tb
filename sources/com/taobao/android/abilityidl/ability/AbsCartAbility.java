package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emb;
import tb.fmb;
import tb.ha3;
import tb.ia3;
import tb.ja3;
import tb.jb3;
import tb.jdb;
import tb.kdb;
import tb.nd3;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsCartAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336603);
    }

    public static /* synthetic */ Object ipc$super(AbsCartAbility absCartAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsCartAbility");
    }

    public abstract void callMainInstance(kdb kdbVar, ha3 ha3Var, emb embVar);

    public abstract void callNative(kdb kdbVar, ja3 ja3Var, fmb fmbVar);

    public abstract tao<CartGetGlobalStatusResult, ErrorResult> getGlobalStatus(kdb kdbVar, jb3 jb3Var);

    public abstract void mainInstanceCallback(kdb kdbVar, ia3 ia3Var, jdb jdbVar);

    public abstract tao<CartSetGlobalStatusResult, ErrorResult> setGlobalStatus(kdb kdbVar, nd3 nd3Var);
}
