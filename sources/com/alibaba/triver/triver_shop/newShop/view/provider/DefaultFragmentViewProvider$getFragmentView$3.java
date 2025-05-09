package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DefaultFragmentViewProvider$getFragmentView$3 extends Lambda implements d1a<wpd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Fragment $outerFragment;
    public final /* synthetic */ DefaultFragmentViewProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFragmentViewProvider$getFragmentView$3(DefaultFragmentViewProvider defaultFragmentViewProvider, Context context, Fragment fragment) {
        super(0);
        this.this$0 = defaultFragmentViewProvider;
        this.$context = context;
        this.$outerFragment = fragment;
    }

    public static /* synthetic */ Object ipc$super(DefaultFragmentViewProvider$getFragmentView$3 defaultFragmentViewProvider$getFragmentView$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/DefaultFragmentViewProvider$getFragmentView$3");
    }

    @Override // tb.d1a
    public final wpd invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpd) ipChange.ipc$dispatch("3e54f78d", new Object[]{this});
        }
        DefaultFragmentViewProvider defaultFragmentViewProvider = this.this$0;
        return DefaultFragmentViewProvider.f(defaultFragmentViewProvider, DefaultFragmentViewProvider.g(defaultFragmentViewProvider), this.$context, this.$outerFragment);
    }
}
