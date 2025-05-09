package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a2v;
import tb.a4v;
import tb.b4v;
import tb.c4v;
import tb.e4v;
import tb.kdb;
import tb.l0v;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.u3v;
import tb.v3v;
import tb.w3v;
import tb.x3v;
import tb.y3v;
import tb.y4e;
import tb.z3v;
import tb.z4e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsUTAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336660);
    }

    public static /* synthetic */ Object ipc$super(AbsUTAbility absUTAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsUTAbility");
    }

    public abstract void commitEvent(kdb kdbVar, l0v l0vVar, y4e y4eVar);

    public abstract tao<UTPageSpmPreResult, ErrorResult> getPageSpmPre(kdb kdbVar, e4v e4vVar);

    public abstract tao<UTPageSpmUrlResult, ErrorResult> getPageSpmUrl(kdb kdbVar, e4v e4vVar);

    public abstract void pageAppear(kdb kdbVar, a2v a2vVar, y4e y4eVar);

    public abstract void pageAppearDonotSkip(kdb kdbVar, a2v a2vVar, y4e y4eVar);

    public abstract void pageDisAppear(kdb kdbVar, e4v e4vVar, y4e y4eVar);

    public abstract void requestPageAllProperties(kdb kdbVar, e4v e4vVar, z4e z4eVar);

    public abstract void skipPage(kdb kdbVar, e4v e4vVar, y4e y4eVar);

    public abstract void updateNextPageProperties(kdb kdbVar, u3v u3vVar, y4e y4eVar);

    public abstract void updateNextPageUtparam(kdb kdbVar, w3v w3vVar, y4e y4eVar);

    public abstract void updateNextPageUtparamCnt(kdb kdbVar, v3v v3vVar, y4e y4eVar);

    public abstract void updatePageName(kdb kdbVar, x3v x3vVar, y4e y4eVar);

    public abstract void updatePageProperties(kdb kdbVar, y3v y3vVar, y4e y4eVar);

    public abstract void updatePageStatus(kdb kdbVar, z3v z3vVar, y4e y4eVar);

    public abstract void updatePageUrl(kdb kdbVar, a4v a4vVar, y4e y4eVar);

    public abstract void updatePageUtparam(kdb kdbVar, b4v b4vVar, y4e y4eVar);

    public abstract void updateSessionProperties(kdb kdbVar, c4v c4vVar, y4e y4eVar);
}
