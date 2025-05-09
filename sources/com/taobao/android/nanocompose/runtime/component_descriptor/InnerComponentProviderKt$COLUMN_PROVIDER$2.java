package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.t1z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$COLUMN_PROVIDER$2 extends FunctionReferenceImpl implements d1a<t1z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$COLUMN_PROVIDER$2 INSTANCE = new InnerComponentProviderKt$COLUMN_PROVIDER$2();

    public InnerComponentProviderKt$COLUMN_PROVIDER$2() {
        super(0, t1z.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$COLUMN_PROVIDER$2 innerComponentProviderKt$COLUMN_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$COLUMN_PROVIDER$2");
    }

    @Override // tb.d1a
    public final t1z invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t1z) ipChange.ipc$dispatch("6c17c958", new Object[]{this}) : new t1z();
    }
}
