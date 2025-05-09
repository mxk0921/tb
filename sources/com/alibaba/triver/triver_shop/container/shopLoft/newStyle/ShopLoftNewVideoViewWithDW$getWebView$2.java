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
public final class ShopLoftNewVideoViewWithDW$getWebView$2 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getWebView$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int $position;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW, int i) {
            super(0);
            this.this$0 = shopLoftNewVideoViewWithDW;
            this.$position = i;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$2$1");
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
                T.d0(this.$position);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$getWebView$2(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(1);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getWebView$2 shopLoftNewVideoViewWithDW$getWebView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getWebView$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            r54.C(new AnonymousClass1(this.this$0, i));
        }
    }
}
