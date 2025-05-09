package com.taobao.android.nanocompose.foundation.components.rich_text;

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
public final class RichTextDefinesKt$RICH_TEXT_PROVIDER$3 extends Lambda implements g1a<ComponentDescriptorParameters, i2z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RichTextDefinesKt$RICH_TEXT_PROVIDER$3 INSTANCE = new RichTextDefinesKt$RICH_TEXT_PROVIDER$3();

    public RichTextDefinesKt$RICH_TEXT_PROVIDER$3() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(RichTextDefinesKt$RICH_TEXT_PROVIDER$3 richTextDefinesKt$RICH_TEXT_PROVIDER$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/rich_text/RichTextDefinesKt$RICH_TEXT_PROVIDER$3");
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
