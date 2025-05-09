package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h3l;
import tb.kdb;
import tb.p3d;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsOpenContainerAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336636);
    }

    public static /* synthetic */ Object ipc$super(AbsOpenContainerAbility absOpenContainerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsOpenContainerAbility");
    }

    public abstract void preLoadAppInfo(kdb kdbVar, h3l h3lVar, p3d p3dVar);
}
