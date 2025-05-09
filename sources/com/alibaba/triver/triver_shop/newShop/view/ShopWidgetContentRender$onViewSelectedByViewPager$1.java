package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.jpu;
import tb.v3i;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWidgetContentRender$onViewSelectedByViewPager$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopWidgetContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWidgetContentRender$onViewSelectedByViewPager$1(ShopWidgetContentRender shopWidgetContentRender) {
        super(0);
        this.this$0 = shopWidgetContentRender;
    }

    public static /* synthetic */ Object ipc$super(ShopWidgetContentRender$onViewSelectedByViewPager$1 shopWidgetContentRender$onViewSelectedByViewPager$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopWidgetContentRender$onViewSelectedByViewPager$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        String str = "a2141.b61969235." + ((Object) ShopWidgetContentRender.A(this.this$0)) + ".0";
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(ShopWidgetContentRender.v(this.this$0));
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(ShopWidgetContentRender.v(this.this$0), "Page_Shop_brandshop_tab3");
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        Context v = ShopWidgetContentRender.v(this.this$0);
        Pair a2 = jpu.a("spm-cnt", str);
        ShopDataParser o = ShopWidgetContentRender.y(this.this$0).o();
        String str2 = null;
        Pair a3 = jpu.a("seller_id", o == null ? null : o.N0());
        ShopDataParser o2 = ShopWidgetContentRender.y(this.this$0).o();
        if (o2 != null) {
            str2 = o2.W0();
        }
        defaultTracker.updatePageProperties(v, a.i(a2, a3, jpu.a("shop_id", str2)));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(v3i.f(jpu.a("spm-url", str)));
    }
}
