package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAppAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336596);
    }

    public static /* synthetic */ Object ipc$super(AbsAppAbility absAppAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAppAbility");
    }

    public abstract tao<Double, ErrorResult> getBottomBarHeight(kdb kdbVar);

    public abstract tao<String, ErrorResult> getEnv(kdb kdbVar);

    public abstract tao<AppGetInfoResult, ErrorResult> getInfo(kdb kdbVar);

    public abstract tao<Double, ErrorResult> getNavBarHeight(kdb kdbVar);

    public abstract tao<String, ErrorResult> getTTID(kdb kdbVar);

    public abstract tao<String, ErrorResult> getUTDID(kdb kdbVar);

    public abstract tao<String, ErrorResult> getVersion(kdb kdbVar);

    public abstract tao<Boolean, ErrorResult> isForeground(kdb kdbVar);

    public abstract void suspend(kdb kdbVar, jdb jdbVar);
}
