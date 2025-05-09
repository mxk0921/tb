package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbm;
import tb.jdb;
import tb.kad;
import tb.kbm;
import tb.kdb;
import tb.lad;
import tb.lbm;
import tb.nad;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsPopCenterAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336642);
    }

    public static /* synthetic */ Object ipc$super(AbsPopCenterAbility absPopCenterAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsPopCenterAbility");
    }

    public abstract void checkShouldPop(kdb kdbVar, kbm kbmVar, kad kadVar);

    public abstract void closePop(kdb kdbVar, lad ladVar);

    public abstract void recordPopAction(kdb kdbVar, jbm jbmVar, jdb jdbVar);

    public abstract void setProperties(kdb kdbVar, lbm lbmVar, jdb jdbVar);

    public abstract void triggerPop(kdb kdbVar, nad nadVar);
}
