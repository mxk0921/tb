package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ibq;
import tb.jbq;
import tb.jdb;
import tb.kdb;
import tb.prd;
import tb.qrd;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsSpeechRecognitionAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336651);
    }

    public static /* synthetic */ Object ipc$super(AbsSpeechRecognitionAbility absSpeechRecognitionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsSpeechRecognitionAbility");
    }

    public abstract tao<Boolean, ErrorResult> isSupport(kdb kdbVar);

    public abstract void prepare(kdb kdbVar, jdb jdbVar);

    public abstract void showPanel(kdb kdbVar, ibq ibqVar, prd prdVar);

    public abstract void start(kdb kdbVar, jbq jbqVar, qrd qrdVar);

    public abstract void stop(kdb kdbVar, jdb jdbVar);
}
