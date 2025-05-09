package com.taobao.android.nanocompose.foundation.components.image_span;

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
public final class ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3 extends Lambda implements g1a<ComponentDescriptorParameters, i2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3 INSTANCE = new ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3();

    public ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3 imageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/image_span/ImageSpanDefinesKt$IMAGE_SPAN_PROVIDER$3");
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
