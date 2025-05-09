package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a5l;
import tb.b3l;
import tb.d4l;
import tb.kdb;
import tb.n3d;
import tb.r3l;
import tb.st;
import tb.t2o;
import tb.t3d;
import tb.x2l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsOpenAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336634);
    }

    public static /* synthetic */ Object ipc$super(AbsOpenAbility absOpenAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsOpenAbility");
    }

    public abstract void check(kdb kdbVar, d4l d4lVar, n3d n3dVar);

    public abstract void checkAuth(kdb kdbVar, b3l b3lVar, n3d n3dVar);

    public abstract void clearAccessToken(kdb kdbVar, n3d n3dVar);

    public abstract void getAuthTokenInfo(kdb kdbVar, n3d n3dVar);

    public abstract void getAuthorize(kdb kdbVar, x2l x2lVar, n3d n3dVar);

    public abstract void getSetting(kdb kdbVar, r3l r3lVar, n3d n3dVar);

    public abstract void loadSubPackage(kdb kdbVar, a5l a5lVar, t3d t3dVar);
}
