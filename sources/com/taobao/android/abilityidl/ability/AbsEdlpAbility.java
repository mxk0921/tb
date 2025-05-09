package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c98;
import tb.d98;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.v1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsEdlpAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336610);
    }

    public static /* synthetic */ Object ipc$super(AbsEdlpAbility absEdlpAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsEdlpAbility");
    }

    public abstract tao<Object, ErrorResult> notifyRenderSuccess(kdb kdbVar, d98 d98Var);

    public abstract void requestPreloadData(kdb kdbVar, c98 c98Var, v1c v1cVar);
}
