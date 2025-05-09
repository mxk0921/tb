package com.alibaba.ability.env;

import com.alibaba.ability.env.PerfTracer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PerfTracer$Companion$upload$dimensionValues$2 extends Lambda implements g1a<Pair<? extends String, ? extends Pair<? extends Double, ? extends Double>>, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PerfTracer$Companion$upload$dimensionValues$2 INSTANCE = new PerfTracer$Companion$upload$dimensionValues$2();

    public PerfTracer$Companion$upload$dimensionValues$2() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(PerfTracer$Companion$upload$dimensionValues$2 perfTracer$Companion$upload$dimensionValues$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/env/PerfTracer$Companion$upload$dimensionValues$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends Pair<? extends Double, ? extends Double>> pair) {
        return invoke2((Pair<String, Pair<Double, Double>>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Pair<String, Pair<Double, Double>> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("dc43f720", new Object[]{this, pair});
        }
        ckf.g(pair, AdvanceSetting.NETWORK_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append(pair.getFirst());
        sb.append("=start:");
        PerfTracer.Companion companion = PerfTracer.Companion;
        sb.append(PerfTracer.Companion.a(companion).format(pair.getSecond().getFirst().doubleValue()));
        sb.append("duration:");
        sb.append(PerfTracer.Companion.a(companion).format(pair.getSecond().getSecond().doubleValue()));
        return sb.toString();
    }
}
