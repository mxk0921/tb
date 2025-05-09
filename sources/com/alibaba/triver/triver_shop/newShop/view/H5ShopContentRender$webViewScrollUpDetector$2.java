package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class H5ShopContentRender$webViewScrollUpDetector$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ H5ShopContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender$webViewScrollUpDetector$2(H5ShopContentRender h5ShopContentRender) {
        super(0);
        this.this$0 = h5ShopContentRender;
    }

    public static /* synthetic */ Object ipc$super(H5ShopContentRender$webViewScrollUpDetector$2 h5ShopContentRender$webViewScrollUpDetector$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/H5ShopContentRender$webViewScrollUpDetector$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShopDataParser.ShopViewContext m1;
        d1a<xhv> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser o = H5ShopContentRender.y(this.this$0).o();
        if (o != null && (m1 = o.m1()) != null && (h = m1.h()) != null) {
            h.invoke();
        }
    }
}
