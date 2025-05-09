package com.alipay.android.msp.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProgressLoadingView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private View pA;
    private View pB;
    private View pC;
    private AnimatorSet pz;

    public ProgressLoadingView(Context context) {
        this(context, null);
    }

    private static void a(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ed485", new Object[]{animator});
        } else if (animator != null) {
            try {
                animator.start();
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "ProgressLoadingView:startPointAnimation", th);
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static /* synthetic */ AnimatorSet access$000(ProgressLoadingView progressLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("87f8cc3f", new Object[]{progressLoadingView});
        }
        return progressLoadingView.pz;
    }

    public static /* synthetic */ void access$100(ProgressLoadingView progressLoadingView, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be8b5c", new Object[]{progressLoadingView, animator});
        } else {
            a(animator);
        }
    }

    public static /* synthetic */ Object ipc$super(ProgressLoadingView progressLoadingView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/ProgressLoadingView");
    }

    public void stopPointAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169029fd", new Object[]{this});
            return;
        }
        LogUtil.record(2, "ProgressLoadingView:stopPointAnimation", "");
        this.pz = null;
    }

    public ProgressLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pz = null;
        this.mContext = context;
        View.inflate(context, R.layout.flybird_dialog_progress_view, this);
        this.pA = findViewById(R.id.v_point_one);
        this.pB = findViewById(R.id.v_point_two);
        this.pC = findViewById(R.id.v_point_three);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getResources().getColor(R.color.C_white));
        gradientDrawable.setCornerRadius(UIUtil.getDp(this.mContext) * 1.0f);
        this.pA.setBackgroundDrawable(gradientDrawable);
        this.pB.setBackgroundDrawable(gradientDrawable);
        this.pC.setBackgroundDrawable(gradientDrawable);
    }

    public void startPointAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef928e5d", new Object[]{this});
        } else if (this.mContext != null && this.pA != null && this.pz == null) {
            LogUtil.record(2, "ProgressLoadingView:startPointAnimation", "");
            float dp = UIUtil.getDp(this.mContext) * 4.0f;
            float f = -dp;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pA, "translationY", 0.0f, f, dp, 0.0f);
            ofFloat.setDuration(550L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pB, "translationY", 0.0f, f, dp, 0.0f);
            ofFloat2.setDuration(550L);
            ofFloat2.setStartDelay(100L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.pC, "translationY", 0.0f, f, dp * 2.0f, 0.0f);
            ofFloat3.setDuration(550L);
            ofFloat3.setStartDelay(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.pz = animatorSet;
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            this.pz.setStartDelay(320L);
            this.pz.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.msp.ui.widget.ProgressLoadingView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    ProgressLoadingView progressLoadingView = ProgressLoadingView.this;
                    ProgressLoadingView.access$100(progressLoadingView, ProgressLoadingView.access$000(progressLoadingView));
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }
            });
            a(this.pz);
        }
    }
}
