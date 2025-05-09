package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopContentRecyclerView$notifyPositionChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopContentRecyclerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopContentRecyclerView$notifyPositionChanged$1(ShopContentRecyclerView shopContentRecyclerView) {
        super(0);
        this.this$0 = shopContentRecyclerView;
    }

    public static /* synthetic */ Object ipc$super(ShopContentRecyclerView$notifyPositionChanged$1 shopContentRecyclerView$notifyPositionChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopContentRecyclerView$notifyPositionChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        try {
            ShopContentRecyclerView.b access$getSwipeToItemCallback$p = ShopContentRecyclerView.access$getSwipeToItemCallback$p(this.this$0);
            if (access$getSwipeToItemCallback$p == null) {
                xhvVar = null;
            } else {
                access$getSwipeToItemCallback$p.b();
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }
}
