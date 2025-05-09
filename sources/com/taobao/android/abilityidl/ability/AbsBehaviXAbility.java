package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.m82;
import tb.p82;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.z82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsBehaviXAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336599);
    }

    public static /* synthetic */ Object ipc$super(AbsBehaviXAbility absBehaviXAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsBehaviXAbility");
    }

    public abstract void commitVisualCenter(kdb kdbVar, m82 m82Var, jdb jdbVar);

    public abstract tao<String, ErrorResult> getFeature(kdb kdbVar, p82 p82Var);

    public abstract void trackScrollEnd(kdb kdbVar, z82 z82Var, jdb jdbVar);

    public abstract void trackScrollStart(kdb kdbVar, z82 z82Var, jdb jdbVar);

    public abstract void trackScrolling(kdb kdbVar, z82 z82Var, jdb jdbVar);
}
