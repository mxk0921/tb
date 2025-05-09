package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.pmj;
import tb.rmj;
import tb.smj;
import tb.st;
import tb.t2o;
import tb.tmj;
import tb.umj;
import tb.uyc;
import tb.vmj;
import tb.vyc;
import tb.wmj;
import tb.xmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsNavBarAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336631);
    }

    public static /* synthetic */ Object ipc$super(AbsNavBarAbility absNavBarAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsNavBarAbility");
    }

    public abstract void hide(kdb kdbVar, xmj xmjVar, jdb jdbVar);

    public abstract void hideBackButton(kdb kdbVar, jdb jdbVar);

    public abstract void hideRightItem(kdb kdbVar, jdb jdbVar);

    public abstract void hideStatusBar(kdb kdbVar, jdb jdbVar);

    public abstract void setBgColor(kdb kdbVar, pmj pmjVar, jdb jdbVar);

    public abstract void setImmersive(kdb kdbVar, rmj rmjVar, jdb jdbVar);

    public abstract void setRightItem(kdb kdbVar, smj smjVar, uyc uycVar);

    public abstract void setShareConfig(kdb kdbVar, tmj tmjVar, vyc vycVar);

    public abstract void setTheme(kdb kdbVar, umj umjVar, jdb jdbVar);

    public abstract void setTitle(kdb kdbVar, vmj vmjVar, jdb jdbVar);

    public abstract void setTitleColor(kdb kdbVar, pmj pmjVar, jdb jdbVar);

    public abstract void setTitleImage(kdb kdbVar, wmj wmjVar, jdb jdbVar);

    public abstract void show(kdb kdbVar, xmj xmjVar, jdb jdbVar);

    public abstract void showBackButton(kdb kdbVar, jdb jdbVar);

    public abstract void showStatusBar(kdb kdbVar, jdb jdbVar);
}
