package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.cpp;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBLoftDWShopVideoView$onMediaComplete$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBLoftDWShopVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBLoftDWShopVideoView$onMediaComplete$1(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        super(0);
        this.this$0 = tBLoftDWShopVideoView;
    }

    public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView$onMediaComplete$1 tBLoftDWShopVideoView$onMediaComplete$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$onMediaComplete$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        cpp V = TBLoftDWShopVideoView.V(this.this$0);
        if (V != null) {
            d1a<xhv> f = V.f();
            if (f != null) {
                f.invoke();
                return;
            }
            return;
        }
        ckf.y("shopLoftFeedsController");
        throw null;
    }
}
