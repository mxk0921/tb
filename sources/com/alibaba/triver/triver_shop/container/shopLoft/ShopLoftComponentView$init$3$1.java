package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopLoftComponentView$init$3$1 extends FunctionReferenceImpl implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopLoftComponentView$init$3$1(ShopLoftComponentView shopLoftComponentView) {
        super(0, shopLoftComponentView, ShopLoftComponentView.class, "removeCurrentItem", "removeCurrentItem()V", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentView$init$3$1 shopLoftComponentView$init$3$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$init$3$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            ((ShopLoftComponentView) this.receiver).removeCurrentItem();
        }
    }
}
