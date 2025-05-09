package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.amm;
import tb.ilm;
import tb.jbd;
import tb.jdb;
import tb.kdb;
import tb.lbd;
import tb.llm;
import tb.mbd;
import tb.nbd;
import tb.nlm;
import tb.obd;
import tb.olm;
import tb.pbd;
import tb.plm;
import tb.qbd;
import tb.qlm;
import tb.sbd;
import tb.slm;
import tb.st;
import tb.t2o;
import tb.tbd;
import tb.tkm;
import tb.ubd;
import tb.vlm;
import tb.xkm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsPowerMsgAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336643);
    }

    public static /* synthetic */ Object ipc$super(AbsPowerMsgAbility absPowerMsgAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsPowerMsgAbility");
    }

    public abstract void addStreamEventListener(kdb kdbVar, nlm nlmVar, sbd sbdVar);

    public abstract void constructClient(kdb kdbVar, tkm tkmVar, lbd lbdVar);

    public abstract void countValue(kdb kdbVar, xkm xkmVar, jbd jbdVar);

    public abstract void destroyClient(kdb kdbVar, tkm tkmVar, jdb jdbVar);

    public abstract void preConnect(kdb kdbVar, jdb jdbVar);

    public abstract void query(kdb kdbVar, olm olmVar, jdb jdbVar);

    public abstract void removeStreamEventListener(kdb kdbVar, plm plmVar, tbd tbdVar);

    public abstract void requestHistoryMessages(kdb kdbVar, vlm vlmVar, mbd mbdVar);

    public abstract void requestTopicStatus(kdb kdbVar, vlm vlmVar, nbd nbdVar);

    public abstract void requestTopicUsers(kdb kdbVar, vlm vlmVar, obd obdVar);

    public abstract void send(kdb kdbVar, qlm qlmVar, ubd ubdVar);

    public abstract void sendMessage(kdb kdbVar, ilm ilmVar, pbd pbdVar);

    public abstract void sendText(kdb kdbVar, llm llmVar, qbd qbdVar);

    public abstract void subscribe(kdb kdbVar, slm slmVar, jdb jdbVar);

    public abstract void unSubscribe(kdb kdbVar, amm ammVar, jdb jdbVar);
}
