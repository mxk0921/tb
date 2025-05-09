package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d3c;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.ui8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsErrorViewWidgetAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336611);
    }

    public static /* synthetic */ Object ipc$super(AbsErrorViewWidgetAbility absErrorViewWidgetAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsErrorViewWidgetAbility");
    }

    public abstract void dismiss(kdb kdbVar, jdb jdbVar);

    public abstract void show(kdb kdbVar, ui8 ui8Var, d3c d3cVar);
}
