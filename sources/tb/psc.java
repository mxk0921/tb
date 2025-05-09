package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import kotlin.jvm.JvmDefault;
import tb.ekb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class psc {
    @JvmDefault
    public static void a(qsc qscVar, BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
        ckf.g(broadcastAddListenerEventResult, "result");
    }

    @JvmDefault
    public static void b(qsc qscVar, ErrorResult errorResult) {
        ckf.g(errorResult, "result");
        ekb.a.a(qscVar, errorResult);
    }

    @JvmDefault
    public static void c(qsc qscVar, BroadcastEventResult broadcastEventResult) {
        ckf.g(broadcastEventResult, "result");
    }
}
