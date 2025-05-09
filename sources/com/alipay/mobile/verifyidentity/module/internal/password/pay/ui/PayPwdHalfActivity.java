package com.alipay.mobile.verifyidentity.module.internal.password.pay.ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APImageView;
import com.alipay.mobile.verifyidentity.ui.APScrollView;
import com.alipay.mobile.verifyidentity.ui.APTextView;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.taobao.R;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayPwdHalfActivity extends PayPwdCommonActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int g;
    public int h;
    public LinearLayout i;

    public static /* synthetic */ void access$000(PayPwdHalfActivity payPwdHalfActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54e5a22", new Object[]{payPwdHalfActivity});
            return;
        }
        VerifyLogCat.d("PayPwdHalfActivity", "animation up");
        payPwdHalfActivity.mWrapper.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(payPwdHalfActivity, R.anim.anim_pwd_up);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                PayPwdHalfActivity.access$300(PayPwdHalfActivity.this).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("df7e7eb3", new Object[]{this});
                            return;
                        }
                        VerifyLogCat.d(PayPwdHalfActivity.access$100(), "mKeyBoardLayout onGlobalLayout");
                        PayPwdHalfActivity.access$200(PayPwdHalfActivity.this);
                    }
                });
                PayPwdHalfActivity.this.showKeyBoardDelay(200L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        });
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, 2130706432);
        ofObject.setDuration(200L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                View view = PayPwdHalfActivity.this.mRoot;
                if (view != null) {
                    view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        payPwdHalfActivity.mRoot.setVisibility(0);
        ofObject.start();
        payPwdHalfActivity.mWrapper.startAnimation(loadAnimation);
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "PayPwdHalfActivity";
    }

    public static /* synthetic */ LinearLayout access$300(PayPwdHalfActivity payPwdHalfActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("c34b3516", new Object[]{payPwdHalfActivity});
        }
        return payPwdHalfActivity.i;
    }

    public static /* synthetic */ Object ipc$super(PayPwdHalfActivity payPwdHalfActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012646654) {
            super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/internal/password/pay/ui/PayPwdHalfActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void initTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c402d2", new Object[]{this});
            return;
        }
        this.mTitle = (APTextView) findViewById(R.id.paypwd_title);
        APImageView aPImageView = (APImageView) findViewById(R.id.paypwd_back);
        this.mBack = aPImageView;
        aPImageView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                PayPwdHalfActivity payPwdHalfActivity = PayPwdHalfActivity.this;
                payPwdHalfActivity.alert("", payPwdHalfActivity.getLocaleStringResource(R.string.sg_pwd_alert_tip), PayPwdHalfActivity.this.getLocaleStringResource(R.string.sg_pwd_alert_ok), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PayPwdHalfActivity.this.notifyCancel("102");
                        PayPwdHalfActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-2", "USER_CLICK_BACK", "wallet_macao");
                    }
                }, PayPwdHalfActivity.this.getLocaleStringResource(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        }
                    }
                });
            }
        });
        if (getIntent() != null && getIntent().getExtras() != null) {
            String string = getIntent().getExtras().getString("title");
            if (!TextUtils.isEmpty(string)) {
                this.mTitle.setText(string);
            } else {
                this.mTitle.setText(getLocaleStringResource(R.string.sg_pwd_default_title));
            }
        }
    }

    public void initViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484d0be3", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        this.g = i;
        this.h = (i * 2) / 3;
        int dip2px = DensityUtil.dip2px(this, 400.0f);
        APScrollView aPScrollView = this.mWrapper;
        if (aPScrollView != null) {
            ViewGroup.LayoutParams layoutParams = aPScrollView.getLayoutParams();
            int i2 = this.h;
            if (i2 <= dip2px) {
                i2 = dip2px;
            }
            this.mViewHeight = i2;
            VerifyLogCat.d("PayPwdHalfActivity", "mScreenHeight: " + this.g + ", mViewReckonedHeight: " + this.h + ", minHeight: " + dip2px + ", mViewHeight: " + this.mViewHeight);
            layoutParams.height = this.mViewHeight;
            this.mWrapper.setLayoutParams(layoutParams);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        VerifyLogCat.d("PayPwdHalfActivity", "animation down");
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_pwd_down);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    PayPwdHalfActivity.this.mBack.performClick();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(true);
        View view = this.mRoot;
        if (view != null) {
            view.setVisibility(0);
            this.mRoot.startAnimation(alphaAnimation);
        }
        APScrollView aPScrollView = this.mWrapper;
        if (aPScrollView != null) {
            aPScrollView.startAnimation(loadAnimation);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        APScrollView aPScrollView = this.mWrapper;
        if (aPScrollView == null || aPScrollView.getVisibility() == 0) {
            VerifyLogCat.d("PayPwdHalfActivity", "already visible");
        } else if (z) {
            getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PayPwdHalfActivity.access$000(PayPwdHalfActivity.this);
                    }
                }
            }, 100L);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        VerifyLogCat.i("PayPwdHalfActivity", "onCreate");
        if (!this.mIsLogicInterrupted && getIntent() != null && getIntent().getExtras() != null) {
            setContentView(R.layout.activity_paypwd_internal_half);
            this.pageStyle = BottomSheetComponentInterface.State.HALF;
            this.mRoot = findViewById(R.id.paypwd_bg);
            APScrollView aPScrollView = (APScrollView) findViewById(R.id.pwd_wrapper);
            this.mWrapper = aPScrollView;
            if (aPScrollView != null) {
                aPScrollView.setVisibility(8);
            }
            this.i = (LinearLayout) findViewById(R.id.keyboard_layout);
            initViewHeight();
            initTitleBar();
            initSubtitle(false);
            initKeyBoard(this.i);
            initInput();
            initProgress();
            if (!this.isIpay) {
                initContent();
            }
            initGoOther();
        }
    }

    public static /* synthetic */ void access$200(PayPwdHalfActivity payPwdHalfActivity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39b78e0", new Object[]{payPwdHalfActivity});
            return;
        }
        int[] iArr = new int[2];
        payPwdHalfActivity.i.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        VerifyLogCat.d("PayPwdHalfActivity", "getReferenceViewHeight");
        if (payPwdHalfActivity.mOther.getVisibility() == 0) {
            payPwdHalfActivity.mOther.getLocationInWindow(iArr2);
            i = payPwdHalfActivity.mOther.getHeight();
        } else {
            payPwdHalfActivity.mPwdInputLayout.getLocationInWindow(iArr2);
            i = payPwdHalfActivity.mPwdInputLayout.getHeight();
        }
        int i2 = ((i + 10) + iArr2[1]) - iArr[1];
        VerifyLogCat.d("PayPwdHalfActivity", "keyBoardPosition[0]:" + iArr[0] + ", keyBoardPosition[1]: " + iArr[1] + "position[0]:" + iArr2[0] + "position[1]:" + iArr2[1] + ", referenceViewHeigh: " + i + ", coverHeight: " + i2);
        ViewGroup.LayoutParams layoutParams = payPwdHalfActivity.mWrapper.getLayoutParams();
        if (i2 > 0) {
            layoutParams.height = payPwdHalfActivity.mWrapper.getHeight() + i2;
            payPwdHalfActivity.mWrapper.setLayoutParams(layoutParams);
        } else if (i2 < 0 && layoutParams.height != payPwdHalfActivity.mViewHeight) {
            VerifyLogCat.d("PayPwdHalfActivity", "lp.height + coverHeight: " + layoutParams.height + i2 + ", mViewHeight: " + payPwdHalfActivity.mViewHeight);
            layoutParams.height = payPwdHalfActivity.mViewHeight;
            payPwdHalfActivity.mWrapper.setLayoutParams(layoutParams);
        }
    }
}
