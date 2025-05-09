package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewVideoViewWithDW$getWebView$3 extends Lambda implements g1a<Float, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getWebView$3$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float $rate;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW, float f) {
            super(0);
            this.this$0 = shopLoftNewVideoViewWithDW;
            this.$rate = f;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$3$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            r T = ShopLoftNewVideoViewWithDW.T(this.this$0);
            if (T != null) {
                T.z0(this.$rate);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$getWebView$3(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(1);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getWebView$3 shopLoftNewVideoViewWithDW$getWebView$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Float f) {
        invoke(f.floatValue());
        return xhv.INSTANCE;
    }

    public final void invoke(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b93aa1", new Object[]{this, new Float(f)});
        } else {
            r54.C(new AnonymousClass1(this.this$0, f));
        }
    }
}
