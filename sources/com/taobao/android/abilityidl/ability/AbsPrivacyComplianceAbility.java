package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.ldd;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsPrivacyComplianceAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336644);
    }

    public static /* synthetic */ Object ipc$super(AbsPrivacyComplianceAbility absPrivacyComplianceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsPrivacyComplianceAbility");
    }

    public abstract void requestMinorsStatus(kdb kdbVar, ldd lddVar);
}
