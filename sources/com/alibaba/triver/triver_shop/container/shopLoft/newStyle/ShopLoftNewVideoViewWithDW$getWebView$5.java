package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.cpp;
import tb.d1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewVideoViewWithDW$getWebView$5 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getWebView$5$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
            super(0);
            this.this$0 = shopLoftNewVideoViewWithDW;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$5$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            cpp V = ShopLoftNewVideoViewWithDW.V(this.this$0);
            if (V != null) {
                d1a<xhv> e = V.e();
                if (e != null) {
                    e.invoke();
                    return;
                }
                return;
            }
            ckf.y("shopLoftFeedsController");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$getWebView$5(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(0);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getWebView$5 shopLoftNewVideoViewWithDW$getWebView$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$5");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            r54.C(new AnonymousClass1(this.this$0));
        }
    }
}
