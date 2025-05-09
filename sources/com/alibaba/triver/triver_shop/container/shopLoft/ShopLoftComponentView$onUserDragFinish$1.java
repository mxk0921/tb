package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponentView$onUserDragFinish$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftComponentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView$onUserDragFinish$1(ShopLoftComponentView shopLoftComponentView) {
        super(0);
        this.this$0 = shopLoftComponentView;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentView$onUserDragFinish$1 shopLoftComponentView$onUserDragFinish$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentView$onUserDragFinish$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            ShopLoftComponentView.access$setUserCanDrag$p(this.this$0, true);
        }
    }
}
