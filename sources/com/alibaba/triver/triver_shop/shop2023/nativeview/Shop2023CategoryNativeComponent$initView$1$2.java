package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023CategoryNativeComponent$initView$1$2 extends Lambda implements g1a<RecyclerView, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023CategoryNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$initView$1$2(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        super(1);
        this.this$0 = shop2023CategoryNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023CategoryNativeComponent$initView$1$2 shop2023CategoryNativeComponent$initView$1$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$initView$1$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(RecyclerView recyclerView) {
        invoke2(recyclerView);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca66e18", new Object[]{this, recyclerView});
            return;
        }
        ckf.g(recyclerView, "$this$RecyclerView");
        Shop2023CategoryNativeComponent.s(this.this$0, recyclerView);
        kew.f0(recyclerView, kew.v(6));
        recyclerView.setBackgroundColor(Shop2023CategoryNativeComponent.a(this.this$0));
        kew.Z(recyclerView, kew.v(Integer.valueOf((int) Result.ALIPAY_GENERATE_UNREG_NODE_FAILED)));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            xhv xhvVar = xhv.INSTANCE;
            recyclerView.setLayoutParams(layoutParams3);
        } else {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        recyclerView.setAdapter(new Shop2023CategoryNativeComponent.MyAdapter(this.this$0));
    }
}
