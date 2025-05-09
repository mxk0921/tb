package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eg7;
import tb.fg7;
import tb.kdb;
import tb.qf7;
import tb.st;
import tb.t2o;
import tb.zyb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsDetailAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336608);
    }

    public static /* synthetic */ Object ipc$super(AbsDetailAbility absDetailAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsDetailAbility");
    }

    public abstract void openInnerSKU(kdb kdbVar, fg7 fg7Var, zyb zybVar);

    public abstract void openLightOff(kdb kdbVar, eg7 eg7Var, zyb zybVar);

    public abstract void requestPicGallery(kdb kdbVar, qf7 qf7Var, zyb zybVar);
}
