package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.kew;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BigCardShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean bigCardMode = true;

    static {
        t2o.a(766509609);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final void bigCardModeUpdateTopViewTransparentStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f546304", new Object[]{this});
        } else {
            kew.R(getStatusBarView(), getFirstHeadContainer(), getSecondHeadContainer());
        }
    }

    public static /* synthetic */ Object ipc$super(BigCardShopView bigCardShopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/BigCardShopView");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean getBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57d26c8", new Object[]{this})).booleanValue();
        }
        return this.bigCardMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        } else if (z) {
            updateBottomGuidLineEnd(0);
            kew.C(getFirstHeadContainer());
            kew.C(getSecondHeadContainer());
            kew.C(getBottomContainer());
        } else {
            updateBottomGuidLineEnd(kew.p(Float.valueOf(83.0f)));
            kew.g0(getFirstHeadContainer());
            kew.g0(getSecondHeadContainer());
            kew.g0(getBottomContainer());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setBigCardMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e24f99c", new Object[]{this, new Boolean(z)});
        } else {
            this.bigCardMode = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
        } else if (!getInHomePage()) {
            kew.T(getFirstHeadContainer());
            kew.T(getStatusBarView());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
            return;
        }
        if (getBigCardMode() && getInHomePage()) {
            getSecondHeadContainer().setBackgroundColor(-1);
        }
        if (getBigCardMode() && getInHomePage()) {
            updateTopViewTransparentStyle(true);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        setInHomePage(z);
        r54.F(new BigCardShopView$updateContentTopMargin$1(z, this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        } else if (z) {
            kew.g0(getBigCardModeHeaderBG());
            bigCardModeUpdateTopViewTransparentStyle();
        } else {
            kew.C(getBigCardModeHeaderBG());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
