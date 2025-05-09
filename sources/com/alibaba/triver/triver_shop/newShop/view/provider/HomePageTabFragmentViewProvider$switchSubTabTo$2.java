package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class HomePageTabFragmentViewProvider$switchSubTabTo$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $index;
    public final /* synthetic */ HomePageTabFragmentViewProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageTabFragmentViewProvider$switchSubTabTo$2(HomePageTabFragmentViewProvider homePageTabFragmentViewProvider, int i) {
        super(0);
        this.this$0 = homePageTabFragmentViewProvider;
        this.$index = i;
    }

    public static /* synthetic */ Object ipc$super(HomePageTabFragmentViewProvider$switchSubTabTo$2 homePageTabFragmentViewProvider$switchSubTabTo$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/HomePageTabFragmentViewProvider$switchSubTabTo$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.d(this.$index);
        }
    }
}
