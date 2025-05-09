package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Shop2023BaseComponent$initShopViewContextFunction$3 extends FunctionReferenceImpl implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseComponent$initShopViewContextFunction$3(Shop2023BaseComponent shop2023BaseComponent) {
        super(1, shop2023BaseComponent, Shop2023BaseComponent.class, "onContentPageScrollToTopCallback", "onContentPageScrollToTopCallback(Ljava/lang/String;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseComponent$initShopViewContextFunction$3 shop2023BaseComponent$initShopViewContextFunction$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Shop2023BaseComponent$initShopViewContextFunction$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        ckf.g(str, "p0");
        ((Shop2023BaseComponent) this.receiver).W(str);
    }
}
