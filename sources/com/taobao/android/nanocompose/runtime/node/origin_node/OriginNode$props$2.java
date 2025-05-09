package com.taobao.android.nanocompose.runtime.node.origin_node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.i2z;
import tb.jkz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OriginNode$props$2 extends Lambda implements d1a<jkz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OriginNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginNode$props$2(OriginNode originNode) {
        super(0);
        this.this$0 = originNode;
    }

    public static /* synthetic */ Object ipc$super(OriginNode$props$2 originNode$props$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/origin_node/OriginNode$props$2");
    }

    @Override // tb.d1a
    public final jkz invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("577e8c10", new Object[]{this});
        }
        i2z i = this.this$0.i();
        ckf.d(i);
        return i.d();
    }
}
