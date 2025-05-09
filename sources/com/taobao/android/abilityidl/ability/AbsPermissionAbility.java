package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k8d;
import tb.kdb;
import tb.lzl;
import tb.myl;
import tb.mzl;
import tb.o8d;
import tb.p8d;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsPermissionAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336640);
    }

    public static /* synthetic */ Object ipc$super(AbsPermissionAbility absPermissionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsPermissionAbility");
    }

    public abstract void check(kdb kdbVar, myl mylVar, k8d k8dVar);

    public abstract void request(kdb kdbVar, lzl lzlVar, o8d o8dVar);

    public abstract void requestPermission(kdb kdbVar, mzl mzlVar, p8d p8dVar);
}
