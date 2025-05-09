package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BigCardShopView$updateContentTopMargin$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isHomePage;
    public final /* synthetic */ BigCardShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView$updateContentTopMargin$1(boolean z, BigCardShopView bigCardShopView) {
        super(0);
        this.$isHomePage = z;
        this.this$0 = bigCardShopView;
    }

    public static /* synthetic */ Object ipc$super(BigCardShopView$updateContentTopMargin$1 bigCardShopView$updateContentTopMargin$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/BigCardShopView$updateContentTopMargin$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$isHomePage) {
            kew.d0(this.this$0.getContentTopLine(), 0);
        } else {
            BigCardShopView bigCardShopView = this.this$0;
            bigCardShopView.setContentTopMargin(bigCardShopView.getSecondHeadContainer().getHeight() + this.this$0.getStatusBarSize() + this.this$0.getFirstHeadContainer().getHeight());
            if (this.this$0.getHeaderHide()) {
                kew.d0(this.this$0.getContentTopLine(), this.this$0.getStatusBarSize() + this.this$0.getFirstHeadContainer().getHeight());
            } else {
                kew.d0(this.this$0.getContentTopLine(), this.this$0.getContentTopMargin());
            }
        }
    }
}
