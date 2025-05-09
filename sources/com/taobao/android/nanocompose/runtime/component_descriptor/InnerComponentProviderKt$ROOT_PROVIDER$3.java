package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.kgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$ROOT_PROVIDER$3 extends FunctionReferenceImpl implements d1a<kgz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$ROOT_PROVIDER$3 INSTANCE = new InnerComponentProviderKt$ROOT_PROVIDER$3();

    public InnerComponentProviderKt$ROOT_PROVIDER$3() {
        super(0, kgz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$ROOT_PROVIDER$3 innerComponentProviderKt$ROOT_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$ROOT_PROVIDER$3");
    }

    @Override // tb.d1a
    public final kgz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kgz) ipChange.ipc$dispatch("b215699f", new Object[]{this}) : new kgz();
    }
}
