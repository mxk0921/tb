package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.o3d;
import tb.st;
import tb.t2o;
import tb.y2l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsOpenCartAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336635);
    }

    public static /* synthetic */ Object ipc$super(AbsOpenCartAbility absOpenCartAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsOpenCartAbility");
    }

    public abstract void addBag(kdb kdbVar, y2l y2lVar, o3d o3dVar);
}
