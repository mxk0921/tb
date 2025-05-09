package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopLoftComponent$init$1 extends FunctionReferenceImpl implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopLoftComponent$init$1(ShopLoftComponent shopLoftComponent) {
        super(0, shopLoftComponent, ShopLoftComponent.class, "onClosePage", "onClosePage()V", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponent$init$1 shopLoftComponent$init$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$init$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            ShopLoftComponent.o((ShopLoftComponent) this.receiver);
        }
    }
}
