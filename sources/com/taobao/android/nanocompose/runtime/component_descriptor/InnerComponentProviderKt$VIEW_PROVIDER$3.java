package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.n2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class InnerComponentProviderKt$VIEW_PROVIDER$3 extends FunctionReferenceImpl implements g1a<ComponentDescriptorParameters, n2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final InnerComponentProviderKt$VIEW_PROVIDER$3 INSTANCE = new InnerComponentProviderKt$VIEW_PROVIDER$3();

    public InnerComponentProviderKt$VIEW_PROVIDER$3() {
        super(1, n2z.class, "<init>", "<init>(Lcom/taobao/android/nanocompose/runtime/component_descriptor/ComponentDescriptorParameters;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(InnerComponentProviderKt$VIEW_PROVIDER$3 innerComponentProviderKt$VIEW_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/InnerComponentProviderKt$VIEW_PROVIDER$3");
    }

    public final n2z invoke(ComponentDescriptorParameters componentDescriptorParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2z) ipChange.ipc$dispatch("b9e8b95c", new Object[]{this, componentDescriptorParameters});
        }
        ckf.g(componentDescriptorParameters, "p0");
        return new n2z(componentDescriptorParameters);
    }
}
