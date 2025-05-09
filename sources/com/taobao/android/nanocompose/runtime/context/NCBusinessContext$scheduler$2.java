package com.taobao.android.nanocompose.runtime.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.mlz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCBusinessContext$scheduler$2 extends Lambda implements d1a<mlz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NCBusinessContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCBusinessContext$scheduler$2(NCBusinessContext nCBusinessContext) {
        super(0);
        this.this$0 = nCBusinessContext;
    }

    public static /* synthetic */ Object ipc$super(NCBusinessContext$scheduler$2 nCBusinessContext$scheduler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/context/NCBusinessContext$scheduler$2");
    }

    @Override // tb.d1a
    public final mlz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mlz) ipChange.ipc$dispatch("3ade08f9", new Object[]{this}) : new mlz(this.this$0);
    }
}
