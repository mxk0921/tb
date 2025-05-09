package com.alibaba.ability.env;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PerfTracer$Companion$doubleFormat$2 extends Lambda implements d1a<DecimalFormat> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PerfTracer$Companion$doubleFormat$2 INSTANCE = new PerfTracer$Companion$doubleFormat$2();

    public PerfTracer$Companion$doubleFormat$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(PerfTracer$Companion$doubleFormat$2 perfTracer$Companion$doubleFormat$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/env/PerfTracer$Companion$doubleFormat$2");
    }

    @Override // tb.d1a
    public final DecimalFormat invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecimalFormat) ipChange.ipc$dispatch("bf9ee65d", new Object[]{this}) : new DecimalFormat("0.##");
    }
}
