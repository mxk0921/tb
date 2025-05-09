package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.ty8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsFalcoAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336613);
    }

    public static /* synthetic */ Object ipc$super(AbsFalcoAbility absFalcoAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsFalcoAbility");
    }

    public abstract void updateScreenshotMonitorParams(kdb kdbVar, ty8 ty8Var, jdb jdbVar);
}
