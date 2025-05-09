package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.impl.nfc.NfcAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.outter.PowerMsgAbility;
import java.util.Map;
import tb.amm;
import tb.ckf;
import tb.guy;
import tb.huy;
import tb.ilm;
import tb.iuy;
import tb.juy;
import tb.kdb;
import tb.kuy;
import tb.llm;
import tb.luy;
import tb.muy;
import tb.mx6;
import tb.nlm;
import tb.nuy;
import tb.olm;
import tb.ouy;
import tb.plm;
import tb.puy;
import tb.qlm;
import tb.slm;
import tb.t2o;
import tb.tkm;
import tb.vlm;
import tb.vq;
import tb.xkm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgAbilityWrapper extends AbsAbilityWrapper<AbsPowerMsgAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337421);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerMsgAbilityWrapper(AbsPowerMsgAbility absPowerMsgAbility) {
        super(absPowerMsgAbility);
        ckf.g(absPowerMsgAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(PowerMsgAbilityWrapper powerMsgAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgAbilityWrapper");
    }

    @Override // com.alibaba.ability.AbsAbilityWrapper, tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        switch (str.hashCode()) {
            case -1707717967:
                if (!str.equals(NfcAbility.API_UNSUBSCRIBE)) {
                    return null;
                }
                try {
                    getAbilityImpl().unSubscribe(kdbVar, new amm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1044012638:
                if (!str.equals("countValue")) {
                    return null;
                }
                try {
                    getAbilityImpl().countValue(kdbVar, new xkm(map), new guy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -55055503:
                if (!str.equals("requestHistoryMessages")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestHistoryMessages(kdbVar, new vlm(map), new iuy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 3526536:
                if (!str.equals("send")) {
                    return null;
                }
                try {
                    getAbilityImpl().send(kdbVar, new qlm(map), new puy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 99319794:
                if (!str.equals("requestTopicStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestTopicStatus(kdbVar, new vlm(map), new juy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 107944136:
                if (!str.equals("query")) {
                    return null;
                }
                try {
                    getAbilityImpl().query(kdbVar, new olm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case 420666888:
                if (!str.equals("requestTopicUsers")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestTopicUsers(kdbVar, new vlm(map), new kuy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case 514841930:
                if (!str.equals("subscribe")) {
                    return null;
                }
                try {
                    getAbilityImpl().subscribe(kdbVar, new slm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case 691453791:
                if (!str.equals("sendMessage")) {
                    return null;
                }
                try {
                    getAbilityImpl().sendMessage(kdbVar, new ilm(map), new luy(vqVar));
                    return null;
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case 1083819650:
                if (!str.equals("constructClient")) {
                    return null;
                }
                try {
                    getAbilityImpl().constructClient(kdbVar, new tkm(map), new huy(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case 1247446229:
                if (!str.equals("sendText")) {
                    return null;
                }
                try {
                    getAbilityImpl().sendText(kdbVar, new llm(map), new muy(vqVar));
                    return null;
                } catch (Throwable th11) {
                    return ErrorResult.a.Companion.g(th11.getMessage());
                }
            case 1339331437:
                if (!str.equals(PowerMsgAbility.API_ADD_EVENT_LISTENER)) {
                    return null;
                }
                try {
                    getAbilityImpl().addStreamEventListener(kdbVar, new nlm(map), new nuy(vqVar));
                    return null;
                } catch (Throwable th12) {
                    return ErrorResult.a.Companion.g(th12.getMessage());
                }
            case 1387142245:
                if (!str.equals("destroyClient")) {
                    return null;
                }
                try {
                    getAbilityImpl().destroyClient(kdbVar, new tkm(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th13) {
                    return ErrorResult.a.Companion.g(th13.getMessage());
                }
            case 1455803050:
                if (!str.equals(PowerMsgAbility.API_REMOVE_EVENT_LISTENER)) {
                    return null;
                }
                try {
                    getAbilityImpl().removeStreamEventListener(kdbVar, new plm(map), new ouy(vqVar));
                    return null;
                } catch (Throwable th14) {
                    return ErrorResult.a.Companion.g(th14.getMessage());
                }
            case 2120134855:
                if (!str.equals(PowerMsgAbility.API_PRE_CONNECT)) {
                    return null;
                }
                getAbilityImpl().preConnect(kdbVar, new mx6(vqVar));
                return null;
            default:
                return null;
        }
    }
}
