package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class H5ShopContentRender$onViewSelectedByViewPager$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef<ShopWrapWebView> $preloadWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender$onViewSelectedByViewPager$2(Ref$ObjectRef<ShopWrapWebView> ref$ObjectRef) {
        super(0);
        this.$preloadWebView = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(H5ShopContentRender$onViewSelectedByViewPager$2 h5ShopContentRender$onViewSelectedByViewPager$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/H5ShopContentRender$onViewSelectedByViewPager$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.$preloadWebView.element;
        if (shopWrapWebView != null) {
            shopWrapWebView.destroy();
        }
    }
}
