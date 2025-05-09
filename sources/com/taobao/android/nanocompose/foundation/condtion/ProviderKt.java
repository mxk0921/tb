package com.taobao.android.nanocompose.foundation.condtion;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import tb.j2z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ProviderKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final j2z f9010a = new j2z(new ComponentDescriptorParameters("Condition", -662091605, null, null, ProviderKt$CONDITION_PROVIDER$1.INSTANCE, ProviderKt$CONDITION_PROVIDER$2.INSTANCE, true, ProviderKt$CONDITION_PROVIDER$3.INSTANCE, ProviderKt$CONDITION_PROVIDER$4.INSTANCE, 12, null), ProviderKt$CONDITION_PROVIDER$5.INSTANCE);
    public static final j2z b = new j2z(new ComponentDescriptorParameters("ConditionNode", 279425813, null, null, ProviderKt$CONDITION_NODE_PROVIDER$1.INSTANCE, ProviderKt$CONDITION_NODE_PROVIDER$2.INSTANCE, true, null, null, 396, null), ProviderKt$CONDITION_NODE_PROVIDER$3.INSTANCE);

    static {
        t2o.a(598736983);
    }

    public static final j2z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("60865dd2", new Object[0]);
        }
        return b;
    }

    public static final j2z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("355cd8a9", new Object[0]);
        }
        return f9010a;
    }
}
