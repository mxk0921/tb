package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.mgy;
import tb.nnb;
import tb.st;
import tb.su3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsClientPrerenderAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336604);
    }

    public static /* synthetic */ Object ipc$super(AbsClientPrerenderAbility absClientPrerenderAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsClientPrerenderAbility");
    }

    public abstract void addPrerenderAttachEventListener(kdb kdbVar, nnb nnbVar);

    public abstract void prerender(kdb kdbVar, mgy mgyVar, jdb jdbVar);

    public abstract void removePrerenderAttachEventListener(kdb kdbVar, jdb jdbVar);

    public abstract void reportPrerenderStatus(kdb kdbVar, su3 su3Var, jdb jdbVar);

    public abstract void start(kdb kdbVar, jdb jdbVar);
}
