package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.taobao.R;
import tb.rf9;
import tb.s0m;
import tb.t2o;
import tb.tm1;
import tb.xh2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageInteractCouponView extends BootImageInteractNaitveSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BootImageInteractCouponView";
    private xh2 mCouponPresenter;
    public ImageView mImageIcon;
    public TextView mInteractAdvName;
    public TextView mInteractCoupon;
    public ImageView mInteractCouponReceived;
    public TextView mInteractMoney;
    public TextView mInteractMoneyLabel;
    public TextView mInteractTitle;
    private boolean mIsReceivedCoupon;
    private BootImageWaveAnimView mWaveAnimView;

    static {
        t2o.a(573571109);
    }

    public BootImageInteractCouponView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        this.mCouponPresenter = new xh2(context, bootImageInfo, this);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractCouponView bootImageInteractCouponView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1383171873:
                super.stopInteract();
                return null;
            case -828457319:
                super.onSlide();
                return null;
            case -483678593:
                super.close();
                return null;
            case -165291571:
                super.onAdClick();
                return null;
            case 725636827:
                return super.getSlideActionText();
            case 2144052543:
                super.startInteract();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractCouponView");
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        xh2 xh2Var = this.mCouponPresenter;
        if (xh2Var != null) {
            xh2Var.a();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public int getInteractCartLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25944aeb", new Object[]{this})).intValue();
        }
        return R.layout.bootimage_interact_card_coupon;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public String getSlideActionText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b4056db", new Object[]{this});
        }
        try {
            String slideActionText = super.getSlideActionText();
            if (TextUtils.isEmpty(slideActionText)) {
                return this.mContext.getResources().getString(R.string.bootimage_slide_coupon_text);
            }
            return slideActionText;
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
            return;
        }
        super.onAdClick();
        xh2 xh2Var = this.mCouponPresenter;
        if (xh2Var != null) {
            xh2Var.c();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        super.onSlide();
        xh2 xh2Var = this.mCouponPresenter;
        if (xh2Var != null) {
            xh2Var.c();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        BootImageWaveAnimView bootImageWaveAnimView = this.mWaveAnimView;
        if (bootImageWaveAnimView != null) {
            bootImageWaveAnimView.stopAnim();
            this.mWaveAnimView.setVisibility(8);
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void switchToReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9f057", new Object[]{this});
            return;
        }
        try {
            this.mIsReceivedCoupon = true;
            this.mInteractCouponReceived.setVisibility(0);
            this.mInteractTitle.setEnabled(false);
            this.mInteractMoneyLabel.setEnabled(false);
            this.mInteractMoney.setEnabled(false);
            this.mInteractCoupon.setEnabled(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        } else if (this.mIsReceivedCoupon) {
            tm1.a(TAG, "startInteract_received_coupon");
        } else {
            super.startInteract();
            BootImageWaveAnimView bootImageWaveAnimView = this.mWaveAnimView;
            if (bootImageWaveAnimView != null) {
                bootImageWaveAnimView.setVisibility(0);
                this.mWaveAnimView.startAnim();
            }
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void renderDefaultCard() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83db882", new Object[]{this});
            return;
        }
        try {
            if (this.mBootImageInfo != null) {
                this.mImageIcon = (ImageView) findViewById(R.id.interact_icon);
                this.mInteractTitle = (TextView) findViewById(R.id.interact_title);
                this.mInteractMoneyLabel = (TextView) findViewById(R.id.interact_money_label);
                this.mInteractMoney = (TextView) findViewById(R.id.interact_money);
                this.mInteractCoupon = (TextView) findViewById(R.id.interact_coupon);
                this.mInteractCouponReceived = (ImageView) findViewById(R.id.interact_card_coupon_received);
                this.mInteractAdvName = (TextView) findViewById(R.id.interact_adv_name);
                this.mWaveAnimView = (BootImageWaveAnimView) findViewById(R.id.interact_card_anim_view);
                if (this.mInteractAdvName == null || TextUtils.isEmpty(this.mBootImageInfo.advName) || TextUtils.isEmpty(this.mBootImageInfo.advColor)) {
                    TextView textView = this.mInteractAdvName;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    this.mInteractAdvName.setVisibility(0);
                    this.mInteractAdvName.setText(this.mBootImageInfo.advName);
                    try {
                        Drawable background = this.mInteractAdvName.getBackground();
                        if (background instanceof GradientDrawable) {
                            ((GradientDrawable) background).setColor(Color.parseColor(this.mBootImageInfo.advColor));
                        }
                    } catch (Exception e) {
                        tm1.a(TAG, "setAdvColor:" + e.getMessage());
                        this.mInteractAdvName.setVisibility(8);
                    }
                }
                this.mInteractTitle.setText(this.mBootImageInfo.benefitTitle);
                this.mInteractMoney.setText(String.valueOf(rf9.a(this.mBootImageInfo.benefitAmountCents, "100", 0)));
                this.mInteractCoupon.setText(this.mContext.getString(R.string.bootimage_interact_coupon_discount, String.valueOf(rf9.a(this.mBootImageInfo.benefitThreshold, "100", 0)), this.mInteractMoney.getText()));
                if (TextUtils.isEmpty(this.mBootImageInfo.benefitImageUrl)) {
                    str = BootImageInteractBaseView.BOOTIMAGE_INTERACT_COUPON_DEFAULT_IMAGE;
                } else {
                    str = this.mBootImageInfo.benefitImageUrl;
                }
                if (!TextUtils.isEmpty(str)) {
                    s0m.B().U(BootImageDataMgr.IMAGE_MODULE_NAME, str).into(this.mImageIcon);
                }
                s0m.B().U(BootImageDataMgr.IMAGE_MODULE_NAME, BootImageInteractBaseView.BOOTIAMGE_INTERACT_COUPON_RECEIVED_IMAGE).into(this.mInteractCouponReceived);
                if ("true".equals(this.mBootImageInfo.actionResult)) {
                    switchToReceived();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
