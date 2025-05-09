package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2025HeaderNativeComponent$curState$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2025HeaderNativeComponent$curState$1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        super(0);
        this.this$0 = shop2025HeaderNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2025HeaderNativeComponent$curState$1 shop2025HeaderNativeComponent$curState$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$curState$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
        if (v != null) {
            a1v.t(v, "Page_Shop_2Flivecard-hidestrip", null, 4, null);
        } else {
            ckf.y("shopData");
            throw null;
        }
    }
}
