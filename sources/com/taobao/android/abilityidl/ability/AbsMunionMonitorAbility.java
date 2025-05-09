package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acj;
import tb.bcj;
import tb.ccj;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.zbj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsMunionMonitorAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336630);
    }

    public static /* synthetic */ Object ipc$super(AbsMunionMonitorAbility absMunionMonitorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsMunionMonitorAbility");
    }

    public abstract void commitIFSTrack(kdb kdbVar, acj acjVar, jdb jdbVar);

    public abstract void commitInteractTrack(kdb kdbVar, bcj bcjVar, jdb jdbVar);

    public abstract void commitTaokeTrack(kdb kdbVar, ccj ccjVar, jdb jdbVar);

    public abstract tao<String, ErrorResult> generateClickIdBy(kdb kdbVar, zbj zbjVar);

    public abstract tao<String, ErrorResult> handleAdUrl(kdb kdbVar, zbj zbjVar);
}
