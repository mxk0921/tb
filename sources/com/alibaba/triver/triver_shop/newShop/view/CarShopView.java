package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.mop;
import tb.r2r;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CarShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean inCarCustomTab;
    private boolean shopHeaderNeedScrollMask;
    private boolean carShopMode = true;
    private boolean canDoAnimation = true;

    static {
        t2o.a(766509613);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final void hideOtherTopAndSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355d6a30", new Object[]{this});
            return;
        }
        kew.C(getCommonSecondView());
        kew.C(getBabyTopView());
        kew.C(getBabySecondView());
    }

    public static /* synthetic */ Object ipc$super(CarShopView carShopView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -37299409) {
            super.changeToBigCardMode();
            return null;
        } else if (hashCode == 267248023) {
            super.init();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/CarShopView");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean canDoAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f785f954", new Object[]{this})).booleanValue();
        }
        if (!this.canDoAnimation || !isAnimationTimeValid()) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
        } else {
            super.changeToBigCardMode();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean getCarShopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13bfa582", new Object[]{this})).booleanValue();
        }
        return this.carShopMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final boolean getShopHeaderNeedScrollMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bcdd293", new Object[]{this})).booleanValue();
        }
        return this.shopHeaderNeedScrollMask;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        kew.e(getFirstHeadContainer(), kew.p(55));
        kew.B(getSecondHeadContainer());
        kew.d0(getContentTopLine(), 0);
        updateSecondHeaderTopPosition(getStatusBarSize() + kew.P(110));
        kew.e(getFirstHeadContainer(), kew.P(110));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b57976c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7c741", new Object[]{this});
            return;
        }
        d1a<Boolean> canSwipeDownDetector = getCanSwipeDownDetector();
        if ((canSwipeDownDetector == null || canSwipeDownDetector.invoke().booleanValue()) && canDoAnimation()) {
            g1a<Boolean, xhv> willHeadCollapsedCallback = getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.invoke(Boolean.TRUE);
            }
            r54.E(new CarShopView$onContainerSwipeDown$1(this), 200L);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
        } else if (canDoAnimation()) {
            g1a<Boolean, xhv> willHeadCollapsedCallback = getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.invoke(Boolean.FALSE);
            }
            r54.E(new CarShopView$onContainerSwipeUp$1(this), 200L);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onHomePageWebViewScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153aca28", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void renderAtmosphereImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c285299c", new Object[]{this, str});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void renderBgImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7bedcf", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setCarShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8325222", new Object[]{this, new Boolean(z)});
        } else {
            this.carShopMode = z;
        }
    }

    public final void setShopHeaderNeedScrollMask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80303099", new Object[]{this, new Boolean(z)});
        } else {
            this.shopHeaderNeedScrollMask = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToBabyBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1dc2ac", new Object[]{this});
            return;
        }
        setInBabyTab(true);
        kew.g0(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToHomePageBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96961df4", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        kew.g0(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToOtherBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd69eef0", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        kew.g0(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        setInHomePage(z);
        r54.C(new CarShopView$updateContentTopMargin$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateSubPageChanged(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
            return;
        }
        setInHomePage(z);
        if (ckf.b(str, "dongtai")) {
            kew.d0(getContentTopLine(), getStatusBarSize() + getFirstHeadContainer().getHeight());
        } else {
            kew.d0(getContentTopLine(), 0);
        }
        if (ckf.b(mop.KEY_CUSTOM_CAR_TAB, str)) {
            onContainerSwipeDown();
            this.inCarCustomTab = true;
            return;
        }
        this.inCarCustomTab = false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        } else if (z) {
            kew.R(getFirstHeadContainer(), getStatusBarView());
        } else {
            getFirstHeadContainer().setBackgroundColor(-1);
            getStatusBarView().setBackgroundColor(-1);
        }
    }

    private final void hideBlackHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705d1396", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            new r2r((Activity) context).a(true);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    private final void showBlackHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe1e33b", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            new r2r((Activity) context).a(false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
