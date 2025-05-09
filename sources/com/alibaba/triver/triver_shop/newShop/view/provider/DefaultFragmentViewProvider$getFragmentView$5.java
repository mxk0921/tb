package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.view.ShopWidgetContentRender;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DefaultFragmentViewProvider$getFragmentView$5 extends Lambda implements d1a<wpd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DefaultFragmentViewProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFragmentViewProvider$getFragmentView$5(Context context, DefaultFragmentViewProvider defaultFragmentViewProvider) {
        super(0);
        this.$context = context;
        this.this$0 = defaultFragmentViewProvider;
    }

    public static /* synthetic */ Object ipc$super(DefaultFragmentViewProvider$getFragmentView$5 defaultFragmentViewProvider$getFragmentView$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/DefaultFragmentViewProvider$getFragmentView$5");
    }

    @Override // tb.d1a
    public final wpd invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (wpd) ipChange.ipc$dispatch("3e54f78d", new Object[]{this}) : new ShopWidgetContentRender(this.$context, DefaultFragmentViewProvider.g(this.this$0));
    }
}
