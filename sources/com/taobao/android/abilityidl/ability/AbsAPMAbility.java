package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.mc;
import tb.nab;
import tb.nc;
import tb.oab;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAPMAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336590);
    }

    public static /* synthetic */ Object ipc$super(AbsAPMAbility absAPMAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAPMAbility");
    }

    public abstract void addPageProperty(kdb kdbVar, mc mcVar, oab oabVar);

    public abstract void addPageStage(kdb kdbVar, nc ncVar, oab oabVar);

    public abstract tao<APMProcedureResult, ErrorResult> getCurrentProcedure(kdb kdbVar);

    public abstract void requestSubCurrentProcedure(kdb kdbVar, nab nabVar);
}
