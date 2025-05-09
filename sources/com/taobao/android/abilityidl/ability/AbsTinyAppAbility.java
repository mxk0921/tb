package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.u0e;
import tb.w0e;
import tb.ywt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsTinyAppAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336655);
    }

    public static /* synthetic */ Object ipc$super(AbsTinyAppAbility absTinyAppAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsTinyAppAbility");
    }

    public abstract void addUserActiveAddIconListener(kdb kdbVar, w0e w0eVar);

    public abstract void checkAddIconButton(kdb kdbVar, u0e u0eVar);

    public abstract void removeUserActiveAddIconListener(kdb kdbVar, jdb jdbVar);

    public abstract void showActiveReplacePopup(kdb kdbVar, jdb jdbVar);

    public abstract void showICONChangeGuide(kdb kdbVar, ywt ywtVar, jdb jdbVar);
}
