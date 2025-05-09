package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.mmd;
import tb.st;
import tb.t2o;
import tb.yro;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsScanCodeAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336647);
    }

    public static /* synthetic */ Object ipc$super(AbsScanCodeAbility absScanCodeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsScanCodeAbility");
    }

    public abstract void scan(kdb kdbVar, yro yroVar, mmd mmdVar);
}
