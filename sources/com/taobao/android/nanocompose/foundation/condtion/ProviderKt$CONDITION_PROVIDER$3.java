package com.taobao.android.nanocompose.foundation.condtion;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.q2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class ProviderKt$CONDITION_PROVIDER$3 extends FunctionReferenceImpl implements g1a<OriginNode, q2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProviderKt$CONDITION_PROVIDER$3 INSTANCE = new ProviderKt$CONDITION_PROVIDER$3();

    public ProviderKt$CONDITION_PROVIDER$3() {
        super(1, q2z.class, "<init>", "<init>(Lcom/taobao/android/nanocompose/runtime/node/origin_node/OriginNode;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(ProviderKt$CONDITION_PROVIDER$3 providerKt$CONDITION_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ProviderKt$CONDITION_PROVIDER$3");
    }

    public final q2z invoke(OriginNode originNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2z) ipChange.ipc$dispatch("fc375743", new Object[]{this, originNode});
        }
        ckf.g(originNode, "p0");
        return new q2z(originNode);
    }
}
