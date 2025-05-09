package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class VideoShopView$updateSubPageChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isHomePage;
    public final /* synthetic */ VideoShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView$updateSubPageChanged$1(VideoShopView videoShopView, boolean z) {
        super(0);
        this.this$0 = videoShopView;
        this.$isHomePage = z;
    }

    public static /* synthetic */ Object ipc$super(VideoShopView$updateSubPageChanged$1 videoShopView$updateSubPageChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/VideoShopView$updateSubPageChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (this.this$0.getBigCardMode()) {
            kew.d0(this.this$0.getVideoShopTabView(), ((kew.P(1000) - this.this$0.getCommonSecondView().getHeight()) - this.this$0.getFirstHeadContainer().getHeight()) - this.this$0.getStatusBarSize());
        }
        this.this$0.updateContentTopMargin(this.$isHomePage);
    }
}
