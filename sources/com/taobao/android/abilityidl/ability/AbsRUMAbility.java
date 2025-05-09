package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dcn;
import tb.ecn;
import tb.kdb;
import tb.qgd;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsRUMAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336645);
    }

    public static /* synthetic */ Object ipc$super(AbsRUMAbility absRUMAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsRUMAbility");
    }

    public abstract void addContainerProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar);

    public abstract void addContainerStage(kdb kdbVar, ecn ecnVar, qgd qgdVar);

    public abstract void addCustomProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar);

    public abstract void addCustomStage(kdb kdbVar, ecn ecnVar, qgd qgdVar);

    public abstract void addStandardProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar);

    public abstract void addStandardStage(kdb kdbVar, ecn ecnVar, qgd qgdVar);

    public abstract tao<RUMDataResult, ErrorResult> getCurrentPageData(kdb kdbVar);
}
