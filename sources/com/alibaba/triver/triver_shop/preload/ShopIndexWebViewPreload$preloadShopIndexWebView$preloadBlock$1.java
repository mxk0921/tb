package com.alibaba.triver.triver_shop.preload;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1(Context context) {
        super(0);
        this.$context = context;
    }

    public static /* synthetic */ Object ipc$super(ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1 shopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (ShopIndexWebViewPreload.a() == null) {
            ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.$context.getApplicationContext());
            shopWrapWebView.setUseSharedApiThread(false);
            shopWrapWebView.startPreloadShopIndexWeb();
            ShopIndexWebViewPreload.b(shopWrapWebView);
        }
    }
}
