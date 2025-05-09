package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ai1;
import tb.jdb;
import tb.kdb;
import tb.shb;
import tb.st;
import tb.t2o;
import tb.xh1;
import tb.yh1;
import tb.zh1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsAudioContextAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336598);
    }

    public static /* synthetic */ Object ipc$super(AbsAudioContextAbility absAudioContextAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsAudioContextAbility");
    }

    public abstract void pause(kdb kdbVar, jdb jdbVar);

    public abstract void play(kdb kdbVar, jdb jdbVar);

    public abstract void prepare(kdb kdbVar, zh1 zh1Var, jdb jdbVar);

    public abstract void seek(kdb kdbVar, ai1 ai1Var, jdb jdbVar);

    public abstract void setEventListener(kdb kdbVar, shb shbVar);

    public abstract void setLoop(kdb kdbVar, xh1 xh1Var, jdb jdbVar);

    public abstract void setMuted(kdb kdbVar, xh1 xh1Var, jdb jdbVar);

    public abstract void setPauseInBackground(kdb kdbVar, xh1 xh1Var, jdb jdbVar);

    public abstract void setVolume(kdb kdbVar, yh1 yh1Var, jdb jdbVar);

    public abstract void stop(kdb kdbVar, jdb jdbVar);
}
