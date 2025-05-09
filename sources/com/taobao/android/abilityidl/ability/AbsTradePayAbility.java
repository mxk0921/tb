package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.xrz;
import tb.yrz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsTradePayAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336658);
    }

    public static /* synthetic */ Object ipc$super(AbsTradePayAbility absTradePayAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsTradePayAbility");
    }

    public abstract void openAlipayEntrust(kdb kdbVar, xrz xrzVar, jdb jdbVar);

    public abstract void openWeChatEntrust(kdb kdbVar, yrz yrzVar, jdb jdbVar);
}
