package com.taobao.android.nanocompose.foundation.condtion;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.o2z;
import tb.waz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class ProviderKt$CONDITION_PROVIDER$4 extends FunctionReferenceImpl implements g1a<waz, o2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProviderKt$CONDITION_PROVIDER$4 INSTANCE = new ProviderKt$CONDITION_PROVIDER$4();

    public ProviderKt$CONDITION_PROVIDER$4() {
        super(1, o2z.class, "<init>", "<init>(Lcom/taobao/android/nanocompose/runtime/node/LayoutNode;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(ProviderKt$CONDITION_PROVIDER$4 providerKt$CONDITION_PROVIDER$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ProviderKt$CONDITION_PROVIDER$4");
    }

    public final o2z invoke(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2z) ipChange.ipc$dispatch("af50cc57", new Object[]{this, wazVar});
        }
        ckf.g(wazVar, "p0");
        return new o2z(wazVar);
    }
}
