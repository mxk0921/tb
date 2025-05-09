package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBLoftDWShopVideoView$initMediaPlayer$1 extends Lambda implements g1a<s.d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $targetHeight;
    public final /* synthetic */ int $windowWidth;
    public final /* synthetic */ TBLoftDWShopVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBLoftDWShopVideoView$initMediaPlayer$1(TBLoftDWShopVideoView tBLoftDWShopVideoView, int i, int i2) {
        super(1);
        this.this$0 = tBLoftDWShopVideoView;
        this.$windowWidth = i;
        this.$targetHeight = i2;
    }

    public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView$initMediaPlayer$1 tBLoftDWShopVideoView$initMediaPlayer$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$initMediaPlayer$1");
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
        dVar.m = TBLoftDWShopVideoView.X(this.this$0);
        dVar.l = TBLoftDWShopVideoView.Z(this.this$0);
        dVar.k = 1;
        dVar.x = this.$windowWidth;
        dVar.y = this.$targetHeight;
        if (aqp.Companion.o()) {
            dVar.s = true;
        }
        dVar.n = "shop";
        dVar.i = ShopExtKt.y();
    }
}
