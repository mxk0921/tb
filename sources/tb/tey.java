package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AudioContextStatusInfo;
import com.taobao.android.abilityidl.ability.AudioContextTimeUpdateInfo;
import com.uc.webview.export.media.MessageID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tey extends mx6 implements shb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336718);
        t2o.a(525337003);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(tey teyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AudioContextAudioEventImpl");
    }

    @Override // tb.shb
    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be465e92", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onSeeking"));
        }
    }

    @Override // tb.shb
    public void W0(AudioContextStatusInfo audioContextStatusInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9769347", new Object[]{this, audioContextStatusInfo});
            return;
        }
        ckf.g(audioContextStatusInfo, "result");
        Object json = JSON.toJSON(audioContextStatusInfo);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onReady"));
    }

    @Override // tb.shb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150378ba", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onPlay"));
        }
    }

    @Override // tb.shb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b967c2a", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onLoop"));
        }
    }

    @Override // tb.shb
    public void c1(AudioContextTimeUpdateInfo audioContextTimeUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ff1eb4", new Object[]{this, audioContextTimeUpdateInfo});
            return;
        }
        ckf.g(audioContextTimeUpdateInfo, "result");
        Object json = JSON.toJSON(audioContextTimeUpdateInfo);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onTimeUpdate"));
    }

    @Override // tb.shb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a753d7", new Object[]{this});
        } else {
            b().c(new FinishResult(null, MessageID.onSeekComplete));
        }
    }

    @Override // tb.shb
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onEnd"));
        }
    }

    @Override // tb.shb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onPause"));
        }
    }

    @Override // tb.shb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onStop"));
        }
    }
}
