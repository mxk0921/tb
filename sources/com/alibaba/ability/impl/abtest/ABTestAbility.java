package com.alibaba.ability.impl.abtest;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ABTestExperimentInfo;
import com.taobao.android.abilityidl.ability.AbsABTestAbility;
import tb.j0;
import tb.kdb;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ABTestAbility extends AbsABTestAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544193);
    }

    public static /* synthetic */ Object ipc$super(ABTestAbility aBTestAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/abtest/ABTestAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsABTestAbility
    public tao<String, ErrorResult> getVariation(kdb kdbVar, j0 j0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f2e19f7e", new Object[]{this, kdbVar, j0Var});
        }
        if (j0Var == null) {
            return new tao<>(null, new ErrorResult("INVALID_PARAM", "Invalid Params"));
        }
        VariationSet activate = UTABTest.activate(j0Var.f21673a, j0Var.b);
        if (activate == null) {
            return new tao<>(null, new ErrorResult("EXPERIMENT_NOT_FOUND", "Experiment Not Found"));
        }
        Variation variation = activate.getVariation(j0Var.c);
        if (variation == null) {
            return new tao<>(null, new ErrorResult("VARIATION_NOT_FOUND", "Variation Not Found"));
        }
        return new tao<>(variation.getValueAsString(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsABTestAbility
    public tao<ABTestExperimentInfo, ErrorResult> getVariationAndExperimentInfo(kdb kdbVar, j0 j0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("cd34e7b6", new Object[]{this, kdbVar, j0Var});
        }
        if (j0Var == null) {
            return new tao<>(null, new ErrorResult("INVALID_PARAM", "Invalid Params"));
        }
        VariationSet activate = UTABTest.activate(j0Var.f21673a, j0Var.b);
        if (activate == null) {
            return new tao<>(null, new ErrorResult("EXPERIMENT_NOT_FOUND", "Experiment Not Found"));
        }
        Variation variation = activate.getVariation(j0Var.c);
        if (variation == null) {
            return new tao<>(null, new ErrorResult("VARIATION_NOT_FOUND", "Variation Not Found"));
        }
        ABTestExperimentInfo aBTestExperimentInfo = new ABTestExperimentInfo();
        aBTestExperimentInfo.experimentID = String.valueOf(activate.getExperimentId());
        aBTestExperimentInfo.releaseID = String.valueOf(activate.getExperimentReleaseId());
        aBTestExperimentInfo.bucket = String.valueOf(activate.getExperimentBucketId());
        aBTestExperimentInfo.variation = variation.getValueAsString(null);
        return new tao<>(aBTestExperimentInfo);
    }
}
