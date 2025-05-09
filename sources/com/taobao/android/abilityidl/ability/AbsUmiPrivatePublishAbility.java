package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b6e;
import tb.c6e;
import tb.d6e;
import tb.e6e;
import tb.f6e;
import tb.iev;
import tb.jdb;
import tb.jev;
import tb.kdb;
import tb.kev;
import tb.lev;
import tb.mev;
import tb.nev;
import tb.oev;
import tb.pev;
import tb.qev;
import tb.rev;
import tb.sev;
import tb.st;
import tb.t2o;
import tb.tev;
import tb.uev;
import tb.v5e;
import tb.vev;
import tb.w5e;
import tb.wev;
import tb.x5e;
import tb.y5e;
import tb.z5e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsUmiPrivatePublishAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336661);
    }

    public static /* synthetic */ Object ipc$super(AbsUmiPrivatePublishAbility absUmiPrivatePublishAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsUmiPrivatePublishAbility");
    }

    public abstract void appendMedia(kdb kdbVar, iev ievVar, v5e v5eVar);

    public abstract void asyncPublish(kdb kdbVar, jev jevVar, jdb jdbVar);

    public abstract void changeCover(kdb kdbVar, kev kevVar, w5e w5eVar);

    public abstract void comprehensionRecommend(kdb kdbVar, rev revVar, c6e c6eVar);

    public abstract void deleteDrafts(kdb kdbVar, lev levVar, jdb jdbVar);

    public abstract void deleteMedia(kdb kdbVar, mev mevVar, jdb jdbVar);

    public abstract void fetchDraftList(kdb kdbVar, nev nevVar, x5e x5eVar);

    public abstract void openImageBrowser(kdb kdbVar, pev pevVar, z5e z5eVar);

    public abstract void openImageEdit(kdb kdbVar, pev pevVar, z5e z5eVar);

    public abstract void openVideoBrowser(kdb kdbVar, wev wevVar, f6e f6eVar);

    public abstract void openVideoEdit(kdb kdbVar, wev wevVar, jdb jdbVar);

    public abstract void queryDraftsSize(kdb kdbVar, qev qevVar, b6e b6eVar);

    public abstract void requestParams(kdb kdbVar, oev oevVar, y5e y5eVar);

    public abstract void saveDraft(kdb kdbVar, sev sevVar, d6e d6eVar);

    public abstract void setCallbackResult(kdb kdbVar, tev tevVar, jdb jdbVar);

    public abstract void setParams(kdb kdbVar, uev uevVar, jdb jdbVar);

    public abstract void submit(kdb kdbVar, vev vevVar, e6e e6eVar);
}
