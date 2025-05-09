package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.dmz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$ROW_PROVIDER$2 extends FunctionReferenceImpl implements d1a<dmz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$ROW_PROVIDER$2 INSTANCE = new InnerComponentProviderKt$ROW_PROVIDER$2();

    public InnerComponentProviderKt$ROW_PROVIDER$2() {
        super(0, dmz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$ROW_PROVIDER$2 innerComponentProviderKt$ROW_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$ROW_PROVIDER$2");
    }

    @Override // tb.d1a
    public final dmz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dmz) ipChange.ipc$dispatch("6aca810e", new Object[]{this}) : new dmz();
    }
}
