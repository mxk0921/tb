package com.taobao.android.nanocompose.runtime.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.qgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCBusinessContext$eventDispatcher$2 extends Lambda implements d1a<qgz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NCBusinessContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCBusinessContext$eventDispatcher$2(NCBusinessContext nCBusinessContext) {
        super(0);
        this.this$0 = nCBusinessContext;
    }

    public static /* synthetic */ Object ipc$super(NCBusinessContext$eventDispatcher$2 nCBusinessContext$eventDispatcher$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/context/NCBusinessContext$eventDispatcher$2");
    }

    @Override // tb.d1a
    public final qgz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qgz) ipChange.ipc$dispatch("86767d8a", new Object[]{this}) : new qgz(this.this$0);
    }
}
