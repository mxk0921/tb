package com.taobao.android.nanocompose.foundation.condtion;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class ProviderKt$CONDITION_PROVIDER$2 extends FunctionReferenceImpl implements d1a<NCComponentViewHandler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProviderKt$CONDITION_PROVIDER$2 INSTANCE = new ProviderKt$CONDITION_PROVIDER$2();

    public ProviderKt$CONDITION_PROVIDER$2() {
        super(0, NCComponentViewHandler.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(ProviderKt$CONDITION_PROVIDER$2 providerKt$CONDITION_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ProviderKt$CONDITION_PROVIDER$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final NCComponentViewHandler invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NCComponentViewHandler) ipChange.ipc$dispatch("97349f25", new Object[]{this}) : new NCComponentViewHandler();
    }
}
