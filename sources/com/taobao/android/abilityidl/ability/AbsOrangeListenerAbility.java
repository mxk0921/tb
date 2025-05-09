package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cal;
import tb.d4d;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsOrangeListenerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336639);
    }

    public static /* synthetic */ Object ipc$super(AbsOrangeListenerAbility absOrangeListenerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsOrangeListenerAbility");
    }

    public abstract void setListener(kdb kdbVar, cal calVar, d4d d4dVar);

    public abstract void unsetListener(kdb kdbVar, jdb jdbVar);
}
