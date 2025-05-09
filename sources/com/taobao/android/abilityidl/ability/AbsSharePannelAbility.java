package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdb;
import tb.ppd;
import tb.qpd;
import tb.rjp;
import tb.rpd;
import tb.sjp;
import tb.st;
import tb.t2o;
import tb.tjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsSharePannelAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336650);
    }

    public static /* synthetic */ Object ipc$super(AbsSharePannelAbility absSharePannelAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsSharePannelAbility");
    }

    public abstract void open(kdb kdbVar, rjp rjpVar, ppd ppdVar);

    public abstract void requestShortLinkQRCode(kdb kdbVar, sjp sjpVar, qpd qpdVar);

    public abstract void saveImage(kdb kdbVar, tjp tjpVar, rpd rpdVar);
}
