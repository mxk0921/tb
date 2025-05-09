package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.player.MediaAspectRatio;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBMiniShopVideoView$initWithData$1 extends Lambda implements g1a<s.d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBMiniShopVideoView this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(766509222);
            int[] iArr = new int[MediaAspectRatio.values().length];
            iArr[MediaAspectRatio.DW_CENTER_CROP.ordinal()] = 1;
            iArr[MediaAspectRatio.DW_FIT_CENTER.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBMiniShopVideoView$initWithData$1(TBMiniShopVideoView tBMiniShopVideoView) {
        super(1);
        this.this$0 = tBMiniShopVideoView;
    }

    public static /* synthetic */ Object ipc$super(TBMiniShopVideoView$initWithData$1 tBMiniShopVideoView$initWithData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBMiniShopVideoView$initWithData$1");
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
        dVar.l = TBMiniShopVideoView.access$getUrl$p(this.this$0);
        int i = a.$EnumSwitchMapping$0[this.this$0.getAspectRatio().ordinal()];
        if (i == 1) {
            dVar.q = DWAspectRatio.DW_CENTER_CROP;
        } else if (i == 2) {
            dVar.q = DWAspectRatio.DW_FIT_CENTER;
        }
    }
}
