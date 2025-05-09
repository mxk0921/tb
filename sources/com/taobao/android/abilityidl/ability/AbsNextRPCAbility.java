package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.n0d;
import tb.r2k;
import tb.s2k;
import tb.st;
import tb.t2o;
import tb.v2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsNextRPCAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336633);
    }

    public static /* synthetic */ Object ipc$super(AbsNextRPCAbility absNextRPCAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsNextRPCAbility");
    }

    public abstract void bind(kdb kdbVar, r2k r2kVar, jdb jdbVar);

    public abstract void cancel(kdb kdbVar, s2k s2kVar, jdb jdbVar);

    public abstract void request(kdb kdbVar, v2k v2kVar, n0d n0dVar);

    public abstract void unbind(kdb kdbVar, r2k r2kVar, jdb jdbVar);
}
