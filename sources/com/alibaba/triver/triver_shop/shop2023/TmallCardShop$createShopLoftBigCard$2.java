package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class TmallCardShop$createShopLoftBigCard$2 extends FunctionReferenceImpl implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TmallCardShop$createShopLoftBigCard$2(TmallCardShop tmallCardShop) {
        super(0, tmallCardShop, TmallCardShop.class, "onShopLoftLiveClick", "onShopLoftLiveClick()V", 0);
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$createShopLoftBigCard$2 tmallCardShop$createShopLoftBigCard$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$createShopLoftBigCard$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            TmallCardShop.q1((TmallCardShop) this.receiver);
        }
    }
}
