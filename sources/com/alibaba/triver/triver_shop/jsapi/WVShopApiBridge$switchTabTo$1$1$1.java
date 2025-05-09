package com.alibaba.triver.triver_shop.jsapi;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.vpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$switchTabTo$1$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $direction;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ String $tabName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$switchTabTo$1$1$1(String str, ShopDataParser shopDataParser, String str2) {
        super(0);
        this.$direction = str;
        this.$shopData = shopDataParser;
        this.$tabName = str2;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$switchTabTo$1$1$1 wVShopApiBridge$switchTabTo$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$switchTabTo$1$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        vpd I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$direction != null) {
            g1a<String, xhv> n = this.$shopData.m1().n();
            if (n != null) {
                String str = this.$direction;
                ckf.f(str, "direction");
                n.invoke(str);
            }
        } else if (this.$tabName != null && (I = this.$shopData.I()) != null) {
            I.d(this.$tabName, null);
        }
    }
}
