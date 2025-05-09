package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a2m;
import tb.c2m;
import tb.f2m;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.u8d;
import tb.v8d;
import tb.w8d;
import tb.x8d;
import tb.z1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsPhotoAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336641);
    }

    public static /* synthetic */ Object ipc$super(AbsPhotoAbility absPhotoAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsPhotoAbility");
    }

    public abstract void saveMediaToAlbum(kdb kdbVar, a2m a2mVar, v8d v8dVar);

    public abstract void saveToAlbum(kdb kdbVar, c2m c2mVar, w8d w8dVar);

    public abstract void takeFromCamera(kdb kdbVar, z1m z1mVar, u8d u8dVar);

    public abstract void takeFromPhotoLibrary(kdb kdbVar, z1m z1mVar, u8d u8dVar);

    public abstract void takeFromScreen(kdb kdbVar, f2m f2mVar, x8d x8dVar);
}
