package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Default2023Shop$initComponent$5 extends FunctionReferenceImpl implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Default2023Shop$initComponent$5(Default2023Shop default2023Shop) {
        super(0, default2023Shop, Default2023Shop.class, "onContentPageStopScroll", "onContentPageStopScroll()V", 0);
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initComponent$5 default2023Shop$initComponent$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initComponent$5");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            Default2023Shop.T1((Default2023Shop) this.receiver);
        }
    }
}
