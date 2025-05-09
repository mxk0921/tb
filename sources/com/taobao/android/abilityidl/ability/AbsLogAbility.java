package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.heh;
import tb.jdb;
import tb.kdb;
import tb.meh;
import tb.st;
import tb.t2o;
import tb.xeh;
import tb.ygh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsLogAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336628);
    }

    public static /* synthetic */ Object ipc$super(AbsLogAbility absLogAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsLogAbility");
    }

    public abstract void debug(kdb kdbVar, heh hehVar, jdb jdbVar);

    public abstract void error(kdb kdbVar, meh mehVar, jdb jdbVar);

    public abstract void info(kdb kdbVar, xeh xehVar, jdb jdbVar);

    public abstract void warn(kdb kdbVar, ygh yghVar, jdb jdbVar);
}
