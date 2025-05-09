package com.alibaba.triver.triver_shop.jsapi;

import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$updateShopLoftWebDialogStatus$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isDialogOpen;
    public final /* synthetic */ ShopWrapWebView $shopWrapWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$updateShopLoftWebDialogStatus$1(ShopWrapWebView shopWrapWebView, boolean z) {
        super(0);
        this.$shopWrapWebView = shopWrapWebView;
        this.$isDialogOpen = z;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$updateShopLoftWebDialogStatus$1 wVShopApiBridge$updateShopLoftWebDialogStatus$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$updateShopLoftWebDialogStatus$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        this.$shopWrapWebView.getShopLoftWebViewBizAdapter().u(this.$isDialogOpen);
        if (this.$isDialogOpen) {
            xpd.c c = this.$shopWrapWebView.getShopLoftWebViewBizAdapter().c();
            if (c != null) {
                c.p(xpd.c.EVENT_ON_SCROLL_DISABLE, null);
                return;
            }
            return;
        }
        xpd.c c2 = this.$shopWrapWebView.getShopLoftWebViewBizAdapter().c();
        if (c2 != null) {
            c2.p(xpd.c.EVENT_ON_SCROLL_ENABLE, null);
        }
    }
}
