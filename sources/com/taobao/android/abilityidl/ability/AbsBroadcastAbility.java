package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ekb;
import tb.el2;
import tb.jdb;
import tb.kdb;
import tb.ll2;
import tb.st;
import tb.t2o;
import tb.vl2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsBroadcastAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336600);
    }

    public static /* synthetic */ Object ipc$super(AbsBroadcastAbility absBroadcastAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsBroadcastAbility");
    }

    public abstract void addEventListener(kdb kdbVar, el2 el2Var, ekb ekbVar);

    public abstract void dispatchEvent(kdb kdbVar, ll2 ll2Var, jdb jdbVar);

    public abstract void removeEventListener(kdb kdbVar, vl2 vl2Var, jdb jdbVar);
}
