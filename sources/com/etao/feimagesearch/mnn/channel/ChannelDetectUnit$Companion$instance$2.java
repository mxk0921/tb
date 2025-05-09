package com.etao.feimagesearch.mnn.channel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ChannelDetectUnit$Companion$instance$2 extends Lambda implements d1a<ChannelDetectUnit> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ChannelDetectUnit$Companion$instance$2 INSTANCE = new ChannelDetectUnit$Companion$instance$2();

    public ChannelDetectUnit$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ChannelDetectUnit$Companion$instance$2 channelDetectUnit$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/channel/ChannelDetectUnit$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ChannelDetectUnit invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChannelDetectUnit) ipChange.ipc$dispatch("1d9551f9", new Object[]{this}) : new ChannelDetectUnit(null);
    }
}
