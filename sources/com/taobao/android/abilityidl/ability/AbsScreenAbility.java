package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bnd;
import tb.cnd;
import tb.cvo;
import tb.jdb;
import tb.jvo;
import tb.kdb;
import tb.rvo;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.zmd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsScreenAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336648);
    }

    public static /* synthetic */ Object ipc$super(AbsScreenAbility absScreenAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsScreenAbility");
    }

    public abstract tao<Integer, ErrorResult> getBrightness(kdb kdbVar);

    public abstract tao<ScreenInfoResult, ErrorResult> getInfo(kdb kdbVar);

    public abstract tao<String, ErrorResult> getOrientation(kdb kdbVar);

    public abstract tao<Integer, ErrorResult> getStatusBarHeight(kdb kdbVar);

    public abstract void keepOn(kdb kdbVar, jvo jvoVar, jdb jdbVar);

    public abstract void requestBrightness(kdb kdbVar, zmd zmdVar);

    public abstract void setBrightness(kdb kdbVar, ScreenSetBrightnessParams screenSetBrightnessParams, jdb jdbVar);

    public abstract void setCaptureEnabled(kdb kdbVar, cvo cvoVar, jdb jdbVar);

    public abstract void setCaptureEnabledForAndroid(kdb kdbVar, cvo cvoVar, jdb jdbVar);

    public abstract void setCaptureListener(kdb kdbVar, bnd bndVar);

    public abstract void setOrientation(kdb kdbVar, rvo rvoVar, jdb jdbVar);

    public abstract void setOrientationListener(kdb kdbVar, cnd cndVar);

    public abstract void unsetCaptureListener(kdb kdbVar, jdb jdbVar);

    public abstract void unsetOrientationListener(kdb kdbVar, jdb jdbVar);
}
