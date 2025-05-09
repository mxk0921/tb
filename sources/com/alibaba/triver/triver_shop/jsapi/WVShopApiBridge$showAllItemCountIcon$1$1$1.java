package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$showAllItemCountIcon$1$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ float $iconBottomPadding;
    public final /* synthetic */ float $iconRightPadding;
    public final /* synthetic */ String $visible;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$showAllItemCountIcon$1$1$1(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext, String str, float f, float f2) {
        super(0);
        this.this$0 = wVShopApiBridge;
        this.$callback = wVCallBackContext;
        this.$visible = str;
        this.$iconBottomPadding = f;
        this.$iconRightPadding = f2;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$showAllItemCountIcon$1$1$1 wVShopApiBridge$showAllItemCountIcon$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$showAllItemCountIcon$1$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShopDataParser.ShopViewContext m1;
        w1a<Boolean, Integer, Integer, xhv> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser access$getShopData = WVShopApiBridge.access$getShopData(this.this$0, this.$callback);
        if (!(access$getShopData == null || (m1 = access$getShopData.m1()) == null || (k = m1.k()) == null)) {
            k.invoke(Boolean.valueOf(ckf.b(this.$visible, "true")), Integer.valueOf(kew.P(Float.valueOf(this.$iconBottomPadding))), Integer.valueOf(kew.P(Float.valueOf(this.$iconRightPadding))));
        }
        this.$callback.success();
    }
}
