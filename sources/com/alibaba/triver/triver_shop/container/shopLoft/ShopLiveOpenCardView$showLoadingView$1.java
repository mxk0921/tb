package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLiveOpenCardView$showLoadingView$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLiveOpenCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLiveOpenCardView$showLoadingView$1(ShopLiveOpenCardView shopLiveOpenCardView) {
        super(0);
        this.this$0 = shopLiveOpenCardView;
    }

    public static /* synthetic */ Object ipc$super(ShopLiveOpenCardView$showLoadingView$1 shopLiveOpenCardView$showLoadingView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLiveOpenCardView$showLoadingView$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        View a2 = ShopLiveOpenCardView.a(this.this$0);
        if ((a2 == null ? null : a2.getParent()) != null) {
            View a3 = ShopLiveOpenCardView.a(this.this$0);
            if (a3 != null) {
                kew.h(a3);
            }
            ShopLiveOpenCardView.c(this.this$0);
        }
    }
}
