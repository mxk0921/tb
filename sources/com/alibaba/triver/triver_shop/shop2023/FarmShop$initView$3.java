package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class FarmShop$initView$3 extends FunctionReferenceImpl implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FarmShop$initView$3(FarmShop farmShop) {
        super(0, farmShop, FarmShop.class, "onBigCardClick", "onBigCardClick()V", 0);
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initView$3 farmShop$initView$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initView$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            FarmShop.y1((FarmShop) this.receiver);
        }
    }
}
