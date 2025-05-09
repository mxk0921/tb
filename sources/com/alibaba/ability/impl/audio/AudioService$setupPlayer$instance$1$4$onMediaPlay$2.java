package com.alibaba.ability.impl.audio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.kei;
import tb.lfi;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioService$setupPlayer$instance$1$4$onMediaPlay$2 extends Lambda implements u1a<lfi, kei, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AudioService$setupPlayer$instance$1$4$onMediaPlay$2 INSTANCE = new AudioService$setupPlayer$instance$1$4$onMediaPlay$2();

    public AudioService$setupPlayer$instance$1$4$onMediaPlay$2() {
        super(2);
    }

    public static /* synthetic */ Object ipc$super(AudioService$setupPlayer$instance$1$4$onMediaPlay$2 audioService$setupPlayer$instance$1$4$onMediaPlay$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService$setupPlayer$instance$1$4$onMediaPlay$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(lfi lfiVar, kei keiVar) {
        invoke2(lfiVar, keiVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(lfi lfiVar, kei keiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa25972", new Object[]{this, lfiVar, keiVar});
            return;
        }
        ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
        ckf.g(keiVar, "info");
        lfiVar.f(keiVar);
    }
}
