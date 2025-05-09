package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Shop2023BaseComponent$initShopViewContextFunction$1 extends FunctionReferenceImpl implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseComponent$initShopViewContextFunction$1(Shop2023BaseComponent shop2023BaseComponent) {
        super(0, shop2023BaseComponent, Shop2023BaseComponent.class, "getRootLayoutHeight", "getRootLayoutHeight()I", 0);
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseComponent$initShopViewContextFunction$1 shop2023BaseComponent$initShopViewContextFunction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Shop2023BaseComponent$initShopViewContextFunction$1");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.Integer] */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue() : ((Shop2023BaseComponent) this.receiver).a1();
    }
}
