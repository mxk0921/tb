package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import kotlin.jvm.JvmDefault;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lii implements qsc {
    static {
        t2o.a(525337689);
        t2o.a(525337676);
    }

    @Override // tb.jdb
    public /* synthetic */ void O(ErrorResult errorResult) {
        psc.b(this, errorResult);
    }

    @Override // tb.ekb
    public /* synthetic */ void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
        psc.a(this, broadcastAddListenerEventResult);
    }

    @Override // tb.qsc, tb.ekb
    @JvmDefault
    public /* bridge */ /* synthetic */ void onEvent(BroadcastEventResult broadcastEventResult) {
        psc.c(this, broadcastEventResult);
    }
}
