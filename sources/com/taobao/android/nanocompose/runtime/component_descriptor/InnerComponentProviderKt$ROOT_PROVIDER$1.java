package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.root.RootMeasurePolicy;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.mdz;
import tb.ndz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class InnerComponentProviderKt$ROOT_PROVIDER$1 extends Lambda implements g1a<ndz, mdz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$ROOT_PROVIDER$1 INSTANCE = new InnerComponentProviderKt$ROOT_PROVIDER$1();

    public InnerComponentProviderKt$ROOT_PROVIDER$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$ROOT_PROVIDER$1 innerComponentProviderKt$ROOT_PROVIDER$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$ROOT_PROVIDER$1");
    }

    public final mdz invoke(ndz ndzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("213b4179", new Object[]{this, ndzVar});
        }
        ckf.g(ndzVar, "measurePolicyCreateParams");
        return new RootMeasurePolicy();
    }
}
