package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBMarketShopVideoView$initWithData$1 extends Lambda implements g1a<s.d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBMarketShopVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBMarketShopVideoView$initWithData$1(TBMarketShopVideoView tBMarketShopVideoView) {
        super(1);
        this.this$0 = tBMarketShopVideoView;
    }

    public static /* synthetic */ Object ipc$super(TBMarketShopVideoView$initWithData$1 tBMarketShopVideoView$initWithData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBMarketShopVideoView$initWithData$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(s.d dVar) {
        invoke2(dVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(s.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c86998b", new Object[]{this, dVar});
            return;
        }
        ckf.g(dVar, "$this$createPlayer");
        dVar.l = TBMarketShopVideoView.c(this.this$0);
        if (TBMarketShopVideoView.a(this.this$0)) {
            dVar.q = DWAspectRatio.DW_CENTER_CROP;
        } else {
            dVar.q = DWAspectRatio.DW_FIT_CENTER;
        }
    }
}
