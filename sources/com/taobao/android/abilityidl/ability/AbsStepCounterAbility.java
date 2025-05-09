package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.amq;
import tb.bmq;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.usd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsStepCounterAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336652);
    }

    public static /* synthetic */ Object ipc$super(AbsStepCounterAbility absStepCounterAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsStepCounterAbility");
    }

    public abstract void requestDailySteps(kdb kdbVar, usd usdVar);

    public abstract void requestStepCountSupportStatus(kdb kdbVar, usd usdVar);

    public abstract void requestStepsAutoUploadStatus(kdb kdbVar, usd usdVar);

    public abstract void requestStepsHistory(kdb kdbVar, amq amqVar, usd usdVar);

    public abstract void setStepsAutoUploadStatus(kdb kdbVar, bmq bmqVar, usd usdVar);

    public abstract void uploadSteps(kdb kdbVar, usd usdVar);
}
