package com.etao.feimagesearch.intelli.realtime;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DataPool$Companion$instance$2 extends Lambda implements d1a<DataPool> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DataPool$Companion$instance$2 INSTANCE = new DataPool$Companion$instance$2();

    public DataPool$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DataPool$Companion$instance$2 dataPool$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/DataPool$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final DataPool invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataPool) ipChange.ipc$dispatch("c43d8da7", new Object[]{this}) : new DataPool(null);
    }
}
