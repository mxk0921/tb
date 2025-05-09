package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gru;
import tb.hru;
import tb.i3e;
import tb.iru;
import tb.jru;
import tb.kdb;
import tb.kru;
import tb.lru;
import tb.mru;
import tb.nru;
import tb.st;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsUBFAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336659);
    }

    public static /* synthetic */ Object ipc$super(AbsUBFAbility absUBFAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsUBFAbility");
    }

    public abstract void beginComponent(kdb kdbVar, gru gruVar, i3e i3eVar);

    public abstract void beginPage(kdb kdbVar, hru hruVar, i3e i3eVar);

    public abstract void beginUBF(kdb kdbVar, iru iruVar, i3e i3eVar);

    public abstract void endComponent(kdb kdbVar, jru jruVar, i3e i3eVar);

    public abstract void endPage(kdb kdbVar, kru kruVar, i3e i3eVar);

    public abstract void endUBF(kdb kdbVar, kru kruVar, i3e i3eVar);

    public abstract void sendEvent(kdb kdbVar, lru lruVar, i3e i3eVar);

    public abstract void updateComponent(kdb kdbVar, mru mruVar, i3e i3eVar);

    public abstract void updatePage(kdb kdbVar, nru nruVar, i3e i3eVar);

    public abstract void updateUBF(kdb kdbVar, nru nruVar, i3e i3eVar);
}
