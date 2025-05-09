package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.ggz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$COLUMN_PROVIDER$3 extends FunctionReferenceImpl implements d1a<ggz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$COLUMN_PROVIDER$3 INSTANCE = new InnerComponentProviderKt$COLUMN_PROVIDER$3();

    public InnerComponentProviderKt$COLUMN_PROVIDER$3() {
        super(0, ggz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$COLUMN_PROVIDER$3 innerComponentProviderKt$COLUMN_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$COLUMN_PROVIDER$3");
    }

    @Override // tb.d1a
    public final ggz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggz) ipChange.ipc$dispatch("71fa6053", new Object[]{this}) : new ggz();
    }
}
