package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.n0c;
import tb.st;
import tb.t2o;
import tb.xv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsDownloaderAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336609);
    }

    public static /* synthetic */ Object ipc$super(AbsDownloaderAbility absDownloaderAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsDownloaderAbility");
    }

    public abstract void cancel(kdb kdbVar, jdb jdbVar);

    public abstract void download(kdb kdbVar, xv7 xv7Var, n0c n0cVar);
}
