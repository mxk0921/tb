package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.wpa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsHDUserIntentAnalyzerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336620);
    }

    public static /* synthetic */ Object ipc$super(AbsHDUserIntentAnalyzerAbility absHDUserIntentAnalyzerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsHDUserIntentAnalyzerAbility");
    }

    public abstract void trigger(kdb kdbVar, wpa wpaVar, jdb jdbVar);
}
