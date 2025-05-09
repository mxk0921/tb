package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$currentPageStartScroll$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$currentPageStartScroll$1(WVCallBackContext wVCallBackContext, WVShopApiBridge wVShopApiBridge) {
        super(0);
        this.$callback = wVCallBackContext;
        this.this$0 = wVShopApiBridge;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$currentPageStartScroll$1 wVShopApiBridge$currentPageStartScroll$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$currentPageStartScroll$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShopWrapWebView access$getShopWrapWebView;
        ShopDataParser shopData;
        ShopDataParser.ShopViewContext m1;
        d1a<xhv> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext != null && (access$getShopWrapWebView = WVShopApiBridge.access$getShopWrapWebView(this.this$0, wVCallBackContext)) != null && (shopData = access$getShopWrapWebView.getShopData()) != null && (m1 = shopData.m1()) != null && (g = m1.g()) != null) {
            g.invoke();
        }
    }
}
