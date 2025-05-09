package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.CommandID;
import java.util.Map;
import tb.ai1;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.tey;
import tb.vq;
import tb.xh1;
import tb.yh1;
import tb.zh1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AudioContextAbilityWrapper extends AbsAbilityWrapper<AbsAudioContextAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336717);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioContextAbilityWrapper(AbsAudioContextAbility absAudioContextAbility) {
        super(absAudioContextAbility);
        ckf.g(absAudioContextAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(AudioContextAbilityWrapper audioContextAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AudioContextAbilityWrapper");
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
            case -430792441:
                if (!str.equals("setPauseInBackground")) {
                    return null;
                }
                try {
                    getAbilityImpl().setPauseInBackground(kdbVar, new xh1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -318370553:
                if (!str.equals("prepare")) {
                    return null;
                }
                try {
                    getAbilityImpl().prepare(kdbVar, new zh1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 3443508:
                if (!str.equals("play")) {
                    return null;
                }
                getAbilityImpl().play(kdbVar, new mx6(vqVar));
                return null;
            case 3526264:
                if (!str.equals("seek")) {
                    return null;
                }
                try {
                    getAbilityImpl().seek(kdbVar, new ai1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 3540994:
                if (!str.equals("stop")) {
                    return null;
                }
                getAbilityImpl().stop(kdbVar, new mx6(vqVar));
                return null;
            case 106440182:
                if (!str.equals("pause")) {
                    return null;
                }
                getAbilityImpl().pause(kdbVar, new mx6(vqVar));
                return null;
            case 670514716:
                if (!str.equals(CommandID.setVolume)) {
                    return null;
                }
                try {
                    getAbilityImpl().setVolume(kdbVar, new yh1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 783057964:
                if (!str.equals("setEventListener")) {
                    return null;
                }
                getAbilityImpl().setEventListener(kdbVar, new tey(vqVar));
                return null;
            case 1398977065:
                if (!str.equals(CommandID.setMuted)) {
                    return null;
                }
                try {
                    getAbilityImpl().setMuted(kdbVar, new xh1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case 1984755238:
                if (!str.equals("setLoop")) {
                    return null;
                }
                try {
                    getAbilityImpl().setLoop(kdbVar, new xh1(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            default:
                return null;
        }
    }
}
