package com.taobao.android.nanocompose.runtime.node.origin_node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.ejz;
import tb.g1a;
import tb.i2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OriginNode$originNodeCoordinator$2 extends Lambda implements d1a<ejz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OriginNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginNode$originNodeCoordinator$2(OriginNode originNode) {
        super(0);
        this.this$0 = originNode;
    }

    public static /* synthetic */ Object ipc$super(OriginNode$originNodeCoordinator$2 originNode$originNodeCoordinator$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/origin_node/OriginNode$originNodeCoordinator$2");
    }

    @Override // tb.d1a
    public final ejz invoke() {
        g1a<OriginNode, ejz> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejz) ipChange.ipc$dispatch("d76f346e", new Object[]{this});
        }
        i2z i = this.this$0.i();
        ejz ejzVar = null;
        if (!(i == null || (g = i.g()) == null)) {
            ejzVar = g.invoke(this.this$0);
        }
        return ejzVar == null ? new ejz(this.this$0) : ejzVar;
    }
}
