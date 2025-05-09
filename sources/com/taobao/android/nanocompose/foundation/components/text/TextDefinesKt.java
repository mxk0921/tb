package com.taobao.android.nanocompose.foundation.components.text;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import tb.j2z;
import tb.t2o;
import tb.trz;
import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TextDefinesKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final j2z f9009a = new j2z(new ComponentDescriptorParameters(vbm.TYPE_TEXT, trz.COMPONENT_ID, null, null, TextDefinesKt$TEXT_PROVIDER$1.INSTANCE, TextDefinesKt$TEXT_PROVIDER$2.INSTANCE, false, null, null, 456, null), TextDefinesKt$TEXT_PROVIDER$3.INSTANCE);

    static {
        t2o.a(598736966);
    }

    public static final j2z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("b4c6a04b", new Object[0]);
        }
        return f9009a;
    }
}
