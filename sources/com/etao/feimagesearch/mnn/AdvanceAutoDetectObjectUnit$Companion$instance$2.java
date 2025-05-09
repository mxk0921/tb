package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AdvanceAutoDetectObjectUnit$Companion$instance$2 extends Lambda implements d1a<AdvanceAutoDetectObjectUnit> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AdvanceAutoDetectObjectUnit$Companion$instance$2 INSTANCE = new AdvanceAutoDetectObjectUnit$Companion$instance$2();

    public AdvanceAutoDetectObjectUnit$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(AdvanceAutoDetectObjectUnit$Companion$instance$2 advanceAutoDetectObjectUnit$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/AdvanceAutoDetectObjectUnit$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final AdvanceAutoDetectObjectUnit invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdvanceAutoDetectObjectUnit) ipChange.ipc$dispatch("a4b7dc60", new Object[]{this}) : new AdvanceAutoDetectObjectUnit(null);
    }
}
