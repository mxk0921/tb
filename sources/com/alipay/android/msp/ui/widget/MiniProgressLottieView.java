package com.alipay.android.msp.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.ILottiePLugin;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MiniProgressLottieView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private CharSequence mMessage;
    private TextView pc;
    private ProgressLoadingView pd;
    private View pe;
    private ILottiePLugin pf;
    private boolean pg;

    public MiniProgressLottieView(Context context) {
        this(context, null);
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.pe != null) {
            float f2 = -ResUtils.dip2px(this.mContext, 10.0f);
            if (f > 1.0f) {
                f2 = -f2;
            }
            this.pe.animate().scaleX(f).scaleY(f).translationY(f2).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.alipay.android.msp.ui.widget.MiniProgressLottieView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MiniProgressLottieView$1");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    MiniProgressLottieView.access$000(MiniProgressLottieView.this).setTranslationY(0.0f);
                    MiniProgressLottieView.access$000(MiniProgressLottieView.this).setScaleX(1.0f);
                    MiniProgressLottieView.access$000(MiniProgressLottieView.this).setScaleY(1.0f);
                    MiniProgressLottieView.access$100(MiniProgressLottieView.this);
                }
            }).withLayer().start();
        }
    }

    public static /* synthetic */ View access$000(MiniProgressLottieView miniProgressLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("675cb818", new Object[]{miniProgressLottieView});
        }
        return miniProgressLottieView.pe;
    }

    public static /* synthetic */ void access$100(MiniProgressLottieView miniProgressLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f28d35", new Object[]{miniProgressLottieView});
        } else {
            miniProgressLottieView.aq();
        }
    }

    private void aq() {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
        } else if (this.pe != null) {
            if (TextUtils.isEmpty(this.mMessage)) {
                TextView textView = this.pc;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                layoutParams = new LinearLayout.LayoutParams(ResUtils.dip2px(this.mContext, 68.0f), ResUtils.dip2px(this.mContext, 55.0f));
            } else {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ResUtils.dip2px(this.mContext, 60.0f), ResUtils.dip2px(this.mContext, 49.0f));
                TextView textView2 = this.pc;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                layoutParams = layoutParams2;
            }
            this.pe.setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ Object ipc$super(MiniProgressLottieView miniProgressLottieView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MiniProgressLottieView");
    }

    public String getProgressMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94705a95", new Object[]{this});
        }
        CharSequence charSequence = this.mMessage;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public void startDismissAnimation(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9628674f", new Object[]{this, animationListener});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:startDismissAnimation", "");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(animationListener);
        clearAnimation();
        startAnimation(alphaAnimation);
    }

    public void startShowAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dda1cc", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:startShowAnimation", "");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        clearAnimation();
        startAnimation(alphaAnimation);
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
        } else if (this.pg) {
            this.pf.stopAnimation();
        } else {
            ProgressLoadingView progressLoadingView = this.pd;
            if (progressLoadingView != null) {
                progressLoadingView.stopPointAnimation();
            }
        }
    }

    public MiniProgressLottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MiniProgressLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        this.pf = PhoneCashierMspEngine.getMspWallet().getLottiePlugin();
        this.pg = !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_LOTTIE_LOADING, false, context) && this.pf != null && (Build.VERSION.SDK_INT >= 28);
        LogUtil.record(2, "MiniProgressLottieView:initView", "ShowLottie =" + this.pg);
        if (this.pg) {
            LogUtil.record(2, "MiniProgressLottieView:initLottieView", "activity =" + this.mContext);
            View.inflate(this.mContext, R.layout.flybird_dialog_progress_lottie, this);
            TextView textView = (TextView) findViewById(R.id.tv_flybird_dialog_layout);
            this.pc = textView;
            textView.setText(LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]));
            this.pe = this.pf.CreateLottieView(this.mContext);
            ((LinearLayout) findViewById(R.id.flybird_dialog_layout)).addView(this.pe, 0);
            aq();
            this.pf.setAnimation("alipay_msp_lottie/msp_loading.zip");
            this.pf.setLoop(true);
            this.pf.setAutoplay(true);
            this.pf.startAnimation();
        } else {
            LogUtil.record(2, "MiniProgressLottieView:initProcessDialogView", "activity =" + this.mContext);
            View.inflate(this.mContext, R.layout.flybird_dialog_progress, this);
            TextView textView2 = (TextView) findViewById(R.id.tv_flybird_dialog_layout);
            this.pc = textView2;
            textView2.setText(LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]));
            this.pd = new ProgressLoadingView(this.mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            this.pd.setLayoutParams(layoutParams);
            ((LinearLayout) findViewById(R.id.flybird_dialog_layout)).addView(this.pd);
            this.pd.startPointAnimation();
        }
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setGravity(17);
        startShowAnimation();
    }

    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            return;
        }
        LogUtil.record(2, "MiniProgressLottieView:setMessage", "message =".concat(String.valueOf(charSequence)));
        if (!this.pg && TextUtils.isEmpty(charSequence)) {
            charSequence = LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]);
        }
        if (!TextUtils.equals(charSequence, this.mMessage)) {
            if (TextUtils.isEmpty(this.mMessage)) {
                a(0.88f);
            } else if (TextUtils.isEmpty(charSequence)) {
                a(1.12f);
            } else {
                aq();
            }
            this.mMessage = charSequence;
            TextView textView = this.pc;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }
}
