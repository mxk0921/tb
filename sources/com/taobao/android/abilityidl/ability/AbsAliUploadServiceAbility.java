package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gr0;
import tb.jdb;
import tb.jfb;
import tb.kdb;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAliUploadServiceAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336595);
    }

    public static /* synthetic */ Object ipc$super(AbsAliUploadServiceAbility absAliUploadServiceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAliUploadServiceAbility");
    }

    public abstract void cancel(kdb kdbVar, jdb jdbVar);

    public abstract void upload(kdb kdbVar, gr0 gr0Var, jfb jfbVar);
}
