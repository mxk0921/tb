package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Default2023Shop$initComponent$2 extends FunctionReferenceImpl implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Default2023Shop$initComponent$2(Default2023Shop default2023Shop) {
        super(1, default2023Shop, Default2023Shop.class, "canPullDownSplitHeader", "canPullDownSplitHeader(Z)V", 0);
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initComponent$2 default2023Shop$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initComponent$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            Default2023Shop.d1((Default2023Shop) this.receiver, z);
        }
    }
}
