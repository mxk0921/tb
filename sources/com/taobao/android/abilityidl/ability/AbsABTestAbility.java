package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.j0;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsABTestAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336589);
    }

    public static /* synthetic */ Object ipc$super(AbsABTestAbility absABTestAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsABTestAbility");
    }

    public abstract tao<String, ErrorResult> getVariation(kdb kdbVar, j0 j0Var);

    public abstract tao<ABTestExperimentInfo, ErrorResult> getVariationAndExperimentInfo(kdb kdbVar, j0 j0Var);
}
