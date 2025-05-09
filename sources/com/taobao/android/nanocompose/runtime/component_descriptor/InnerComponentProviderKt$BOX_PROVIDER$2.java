package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.b0z;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$BOX_PROVIDER$2 extends FunctionReferenceImpl implements d1a<b0z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$BOX_PROVIDER$2 INSTANCE = new InnerComponentProviderKt$BOX_PROVIDER$2();

    public InnerComponentProviderKt$BOX_PROVIDER$2() {
        super(0, b0z.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$BOX_PROVIDER$2 innerComponentProviderKt$BOX_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$BOX_PROVIDER$2");
    }

    @Override // tb.d1a
    public final b0z invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b0z) ipChange.ipc$dispatch("70b01c9a", new Object[]{this}) : new b0z();
    }
}
