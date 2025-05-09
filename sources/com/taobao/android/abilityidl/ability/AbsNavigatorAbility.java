package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iqj;
import tb.izc;
import tb.jdb;
import tb.jzc;
import tb.kdb;
import tb.kqj;
import tb.kzc;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsNavigatorAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336632);
    }

    public static /* synthetic */ Object ipc$super(AbsNavigatorAbility absNavigatorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsNavigatorAbility");
    }

    public abstract void close(kdb kdbVar, iqj iqjVar, izc izcVar);

    public abstract void openExternalURL(kdb kdbVar, kqj kqjVar, jzc jzcVar);

    public abstract void openURL(kdb kdbVar, kqj kqjVar, izc izcVar);

    public abstract void removeSystemBackBlockListener(kdb kdbVar, jdb jdbVar);

    public abstract void replace(kdb kdbVar, kqj kqjVar, izc izcVar);

    public abstract void setSystemBackBlockListener(kdb kdbVar, kzc kzcVar);
}
