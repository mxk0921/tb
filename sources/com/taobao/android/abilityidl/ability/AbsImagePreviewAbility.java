package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gec;
import tb.jdb;
import tb.kdb;
import tb.one;
import tb.qne;
import tb.sne;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsImagePreviewAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336622);
    }

    public static /* synthetic */ Object ipc$super(AbsImagePreviewAbility absImagePreviewAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsImagePreviewAbility");
    }

    public abstract void insert(kdb kdbVar, one oneVar, jdb jdbVar);

    public abstract void remove(kdb kdbVar, qne qneVar, jdb jdbVar);

    public abstract void show(kdb kdbVar, sne sneVar, gec gecVar);
}
