package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class VideoShopView$initBigCardIfNeeded$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ VideoShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView$initBigCardIfNeeded$3(VideoShopView videoShopView) {
        super(0);
        this.this$0 = videoShopView;
    }

    public static /* synthetic */ Object ipc$super(VideoShopView$initBigCardIfNeeded$3 videoShopView$initBigCardIfNeeded$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/VideoShopView$initBigCardIfNeeded$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        View access$getSecondFloorView$p = VideoShopView.access$getSecondFloorView$p(this.this$0);
        if (access$getSecondFloorView$p != null) {
            kew.U(access$getSecondFloorView$p, this.this$0.getVideoShopTabView().getHeight() - kew.p(18));
        }
    }
}
