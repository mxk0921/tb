package com.taobao.android.nanocompose.foundation.components.async_image;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import tb.j2z;
import tb.t2o;
import tb.zbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AsyncImageDefinesKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final j2z f9008a = new j2z(new ComponentDescriptorParameters("AsyncImage", zbn.COMPONENT_ID, null, null, AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1.INSTANCE, AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$2.INSTANCE, false, null, null, 392, null), AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$3.INSTANCE);

    static {
        t2o.a(598736939);
    }

    public static final j2z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("c24584ac", new Object[0]);
        }
        return f9008a;
    }
}
