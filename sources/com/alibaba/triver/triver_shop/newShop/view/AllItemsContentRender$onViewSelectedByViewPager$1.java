package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AllItemsContentRender$onViewSelectedByViewPager$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AllItemsContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$onViewSelectedByViewPager$1(AllItemsContentRender allItemsContentRender) {
        super(0);
        this.this$0 = allItemsContentRender;
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender$onViewSelectedByViewPager$1 allItemsContentRender$onViewSelectedByViewPager$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender$onViewSelectedByViewPager$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.this$0.F());
        AllItemsContentRender.C(this.this$0);
    }
}
