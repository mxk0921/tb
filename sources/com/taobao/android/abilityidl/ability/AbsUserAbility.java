package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bsv;
import tb.j7e;
import tb.jsv;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsUserAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336662);
    }

    public static /* synthetic */ Object ipc$super(AbsUserAbility absUserAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsUserAbility");
    }

    public abstract tao<Boolean, ErrorResult> isLogin(kdb kdbVar);

    public abstract void login(kdb kdbVar, bsv bsvVar, j7e j7eVar);

    public abstract tao<Boolean, ErrorResult> recordAndCheckNeedLogin(kdb kdbVar, jsv jsvVar);
}
