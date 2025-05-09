package com.taobao.android.nanocompose.foundation.condtion;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.i2z;
import tb.n2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ProviderKt$CONDITION_PROVIDER$5 extends Lambda implements g1a<ComponentDescriptorParameters, i2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProviderKt$CONDITION_PROVIDER$5 INSTANCE = new ProviderKt$CONDITION_PROVIDER$5();

    public ProviderKt$CONDITION_PROVIDER$5() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(ProviderKt$CONDITION_PROVIDER$5 providerKt$CONDITION_PROVIDER$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ProviderKt$CONDITION_PROVIDER$5");
    }

    public final i2z invoke(ComponentDescriptorParameters componentDescriptorParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2z) ipChange.ipc$dispatch("4015af37", new Object[]{this, componentDescriptorParameters});
        }
        ckf.g(componentDescriptorParameters, "componentDescriptorParameters");
        return new n2z(componentDescriptorParameters);
    }
}
