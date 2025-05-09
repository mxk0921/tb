package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.g1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$setCrossStoreHeaderStatus$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ boolean $showCrossStoreHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$setCrossStoreHeaderStatus$1(ShopDataParser shopDataParser, boolean z, WVCallBackContext wVCallBackContext) {
        super(0);
        this.$shopData = shopDataParser;
        this.$showCrossStoreHeader = z;
        this.$callback = wVCallBackContext;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$setCrossStoreHeaderStatus$1 wVShopApiBridge$setCrossStoreHeaderStatus$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$setCrossStoreHeaderStatus$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Boolean invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        g1a<Boolean, Boolean> l = this.$shopData.m1().l();
        boolean booleanValue = (l == null || (invoke = l.invoke(Boolean.valueOf(this.$showCrossStoreHeader))) == null) ? false : invoke.booleanValue();
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(brf.a(jpu.a("success", Boolean.valueOf(booleanValue))).toString());
        }
    }
}
