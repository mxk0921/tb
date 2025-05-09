package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CarShopView$updateContentTopMargin$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CarShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView$updateContentTopMargin$1(CarShopView carShopView) {
        super(0);
        this.this$0 = carShopView;
    }

    public static /* synthetic */ Object ipc$super(CarShopView$updateContentTopMargin$1 carShopView$updateContentTopMargin$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/CarShopView$updateContentTopMargin$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            kew.d0(this.this$0.getContentTopLine(), 0);
        }
    }
}
