package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.cpp;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewVideoViewWithDW$onVideoComplete$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$onVideoComplete$1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(0);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$onVideoComplete$1 shopLoftNewVideoViewWithDW$onVideoComplete$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$onVideoComplete$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        cpp V = ShopLoftNewVideoViewWithDW.V(this.this$0);
        if (V != null) {
            d1a<xhv> f = V.f();
            if (f != null) {
                f.invoke();
                return;
            }
            return;
        }
        ckf.y("shopLoftFeedsController");
        throw null;
    }
}
