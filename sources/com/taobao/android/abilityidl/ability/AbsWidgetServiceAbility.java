package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cee;
import tb.kdb;
import tb.lcx;
import tb.mcx;
import tb.ocx;
import tb.scx;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsWidgetServiceAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336664);
    }

    public static /* synthetic */ Object ipc$super(AbsWidgetServiceAbility absWidgetServiceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsWidgetServiceAbility");
    }

    public abstract tao<Boolean, ErrorResult> addWidget(kdb kdbVar, lcx lcxVar);

    public abstract void editWidget(kdb kdbVar, mcx mcxVar, cee ceeVar);

    public abstract void isInstalled(kdb kdbVar, ocx ocxVar, cee ceeVar);

    public abstract tao<Boolean, ErrorResult> isSupported(kdb kdbVar, scx scxVar);
}
