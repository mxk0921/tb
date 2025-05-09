package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.hgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$VIEW_PROVIDER$2 extends FunctionReferenceImpl implements d1a<hgz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$VIEW_PROVIDER$2 INSTANCE = new InnerComponentProviderKt$VIEW_PROVIDER$2();

    public InnerComponentProviderKt$VIEW_PROVIDER$2() {
        super(0, hgz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$VIEW_PROVIDER$2 innerComponentProviderKt$VIEW_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$VIEW_PROVIDER$2");
    }

    @Override // tb.d1a
    public final hgz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgz) ipChange.ipc$dispatch("71217bd0", new Object[]{this}) : new hgz();
    }
}
