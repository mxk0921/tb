package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MnnRealtimeDetectUnit$Companion$instance$2 extends Lambda implements d1a<MnnRealtimeDetectUnit> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MnnRealtimeDetectUnit$Companion$instance$2 INSTANCE = new MnnRealtimeDetectUnit$Companion$instance$2();

    public MnnRealtimeDetectUnit$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MnnRealtimeDetectUnit$Companion$instance$2 mnnRealtimeDetectUnit$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/realtime/MnnRealtimeDetectUnit$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final MnnRealtimeDetectUnit invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MnnRealtimeDetectUnit) ipChange.ipc$dispatch("74e34284", new Object[]{this}) : new MnnRealtimeDetectUnit(null);
    }
}
