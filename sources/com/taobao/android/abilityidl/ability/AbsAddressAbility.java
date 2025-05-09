package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.lf0;
import tb.oeb;
import tb.peb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAddressAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336593);
    }

    public static /* synthetic */ Object ipc$super(AbsAddressAbility absAddressAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAddressAbility");
    }

    public abstract void close(kdb kdbVar, AddressParams addressParams, oeb oebVar);

    public abstract void open(kdb kdbVar, lf0 lf0Var, peb pebVar);

    public abstract void requestParams(kdb kdbVar, AddressParams addressParams, oeb oebVar);
}
