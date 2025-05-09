package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftNewDetailView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewDetailView$rootView$2 extends Lambda implements d1a<ShopLoftNewDetailView.HorizontalSwipeLayoutV2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewDetailView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewDetailView$rootView$2(ShopLoftNewDetailView shopLoftNewDetailView) {
        super(0);
        this.this$0 = shopLoftNewDetailView;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewDetailView$rootView$2 shopLoftNewDetailView$rootView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftNewDetailView$rootView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ShopLoftNewDetailView.HorizontalSwipeLayoutV2 invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftNewDetailView.HorizontalSwipeLayoutV2) ipChange.ipc$dispatch("2750fb1b", new Object[]{this});
        }
        ShopLoftNewDetailView shopLoftNewDetailView = this.this$0;
        Context a2 = ShopLoftNewDetailView.a(shopLoftNewDetailView);
        if (a2 != null) {
            ShopLoftNewDetailView.HorizontalSwipeLayoutV2 horizontalSwipeLayoutV2 = new ShopLoftNewDetailView.HorizontalSwipeLayoutV2(shopLoftNewDetailView, a2);
            horizontalSwipeLayoutV2.setSwipeThreshold(aqp.Companion.Q0());
            return horizontalSwipeLayoutV2;
        }
        ckf.y("context");
        throw null;
    }
}
