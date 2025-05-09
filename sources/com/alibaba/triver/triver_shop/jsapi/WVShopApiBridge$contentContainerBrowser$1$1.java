package com.alibaba.triver.triver_shop.jsapi;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023ImageViewer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$contentContainerBrowser$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ String $it;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$contentContainerBrowser$1$1(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext, String str) {
        super(0);
        this.this$0 = wVShopApiBridge;
        this.$callback = wVCallBackContext;
        this.$it = str;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$contentContainerBrowser$1$1 wVShopApiBridge$contentContainerBrowser$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$contentContainerBrowser$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser access$getShopData = WVShopApiBridge.access$getShopData(this.this$0, this.$callback);
        Context Q = access$getShopData == null ? null : access$getShopData.Q();
        if (Q != null) {
            new Shop2023ImageViewer().E2(WVShopApiBridge.access$getShopData(this.this$0, this.$callback)).J2(Q, this.$it);
            WVCallBackContext wVCallBackContext = this.$callback;
            if (wVCallBackContext != null) {
                wVCallBackContext.success(brf.a(jpu.a("success", Boolean.TRUE)).toJSONString());
            }
        }
    }
}
