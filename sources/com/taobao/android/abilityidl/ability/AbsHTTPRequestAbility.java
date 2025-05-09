package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.nqa;
import tb.st;
import tb.t2o;
import tb.xbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsHTTPRequestAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336621);
    }

    public static /* synthetic */ Object ipc$super(AbsHTTPRequestAbility absHTTPRequestAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsHTTPRequestAbility");
    }

    public abstract void send(kdb kdbVar, nqa nqaVar, xbc xbcVar);
}
