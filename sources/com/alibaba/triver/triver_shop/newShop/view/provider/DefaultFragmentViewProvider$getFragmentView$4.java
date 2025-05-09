package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.khu;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DefaultFragmentViewProvider$getFragmentView$4 extends Lambda implements w1a<d1a<? extends xhv>, d1a<? extends xhv>, g1a<? super Integer, ? extends xhv>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DefaultFragmentViewProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFragmentViewProvider$getFragmentView$4(DefaultFragmentViewProvider defaultFragmentViewProvider, Context context) {
        super(3);
        this.this$0 = defaultFragmentViewProvider;
        this.$context = context;
    }

    public static /* synthetic */ Object ipc$super(DefaultFragmentViewProvider$getFragmentView$4 defaultFragmentViewProvider$getFragmentView$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/DefaultFragmentViewProvider$getFragmentView$4");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(d1a<? extends xhv> d1aVar, d1a<? extends xhv> d1aVar2, g1a<? super Integer, ? extends xhv> g1aVar) {
        invoke2((d1a<xhv>) d1aVar, (d1a<xhv>) d1aVar2, (g1a<? super Integer, xhv>) g1aVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(d1a<xhv> d1aVar, d1a<xhv> d1aVar2, g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c80593", new Object[]{this, d1aVar, d1aVar2, g1aVar});
            return;
        }
        ckf.g(d1aVar, "initFinishCallback");
        ckf.g(d1aVar2, "initFailedCallback");
        ckf.g(g1aVar, "progressCallback");
        ShopDataParser o = DefaultFragmentViewProvider.g(this.this$0).o();
        khu.i("shopMember", o == null ? null : o.W0(), this.$context, d1aVar, d1aVar2, g1aVar);
    }
}
