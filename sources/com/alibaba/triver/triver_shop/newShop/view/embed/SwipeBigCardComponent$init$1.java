package com.alibaba.triver.triver_shop.newShop.view.embed;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.ozq;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SwipeBigCardComponent$init$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ SwipeBigCardComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeBigCardComponent$init$1(SwipeBigCardComponent swipeBigCardComponent, FragmentActivity fragmentActivity) {
        super(0);
        this.this$0 = swipeBigCardComponent;
        this.$fragmentActivity = fragmentActivity;
    }

    public static /* synthetic */ Object ipc$super(SwipeBigCardComponent$init$1 swipeBigCardComponent$init$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/embed/SwipeBigCardComponent$init$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ozq ozqVar = new ozq(this.this$0);
        FragmentManager supportFragmentManager = this.$fragmentActivity.getSupportFragmentManager();
        ckf.f(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
        SwipeBigCardComponent swipeBigCardComponent = this.this$0;
        shopContainerPageAdapter.k(ozqVar);
        swipeBigCardComponent.j().setAdapter(shopContainerPageAdapter);
        r54.C(new SwipeBigCardComponent$init$1$1$1(swipeBigCardComponent));
    }
}
