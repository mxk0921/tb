package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hud;
import tb.j3r;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.u2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsSystemAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336653);
    }

    public static /* synthetic */ Object ipc$super(AbsSystemAbility absSystemAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsSystemAbility");
    }

    public abstract tao<String, ErrorResult> checkAppInstallStatus(kdb kdbVar, u2r u2rVar);

    public abstract tao<String, ErrorResult> checkLocation(kdb kdbVar);

    public abstract tao<Boolean, ErrorResult> isNFCReadingSupported(kdb kdbVar);

    public abstract tao<Boolean, ErrorResult> isVoiceOverOn(kdb kdbVar);

    public abstract void openAppSettings(kdb kdbVar, jdb jdbVar);

    public abstract void openBrowser(kdb kdbVar, j3r j3rVar, jdb jdbVar);

    public abstract void openLocationSettings(kdb kdbVar, jdb jdbVar);

    public abstract void openNotificationSettings(kdb kdbVar, jdb jdbVar);

    public abstract void requestNotificationSettings(kdb kdbVar, hud hudVar);
}
