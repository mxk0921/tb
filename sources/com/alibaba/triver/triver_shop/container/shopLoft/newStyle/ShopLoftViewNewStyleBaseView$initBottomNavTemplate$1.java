package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.jht;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1 extends Lambda implements g1a<View, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView) {
        super(1);
        this.this$0 = shopLoftViewNewStyleBaseView;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1 shopLoftViewNewStyleBaseView$initBottomNavTemplate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(View view) {
        invoke2(view);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, view});
            return;
        }
        ckf.g(view, AdvanceSetting.NETWORK_TYPE);
        this.this$0.I(view);
        this.this$0.k().addView(view);
        jht g = this.this$0.v().g();
        View p = this.this$0.p();
        if (p != null) {
            g.a((DXRootView) p, this.this$0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dinamicx.DXRootView");
    }
}
