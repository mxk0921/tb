package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.tq2;
import tb.uq2;
import tb.vq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsCLDRFormatAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336601);
    }

    public static /* synthetic */ Object ipc$super(AbsCLDRFormatAbility absCLDRFormatAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsCLDRFormatAbility");
    }

    public abstract tao<String, ErrorResult> getFormatCustomDateTime(kdb kdbVar, tq2 tq2Var);

    public abstract tao<String, ErrorResult> getFormatDate(kdb kdbVar, uq2 uq2Var);

    public abstract tao<String, ErrorResult> getFormatDateTime(kdb kdbVar, uq2 uq2Var);

    public abstract tao<String, ErrorResult> getFormatNumber(kdb kdbVar, vq2 vq2Var);

    public abstract tao<String, ErrorResult> getFormatTime(kdb kdbVar, uq2 uq2Var);
}
