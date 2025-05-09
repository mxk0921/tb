package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowLottieAnimationView extends LottieAnimationView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Animator.AnimatorListener mAnimation;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            int visibility = InfoFlowLottieAnimationView.this.getVisibility();
            if (visibility == 0) {
                InfoFlowLottieAnimationView.this.setVisibility(4);
                InfoFlowLottieAnimationView.this.cancelAnimation();
                InfoFlowLottieAnimationView.this.setVisibility(visibility);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        t2o.a(486539418);
    }

    public InfoFlowLottieAnimationView(Context context) {
        super(context);
        a aVar = new a();
        this.mAnimation = aVar;
        addAnimatorListener(aVar);
    }

    public static /* synthetic */ Object ipc$super(InfoFlowLottieAnimationView infoFlowLottieAnimationView, String str, Object... objArr) {
        if (str.hashCode() == 917485879) {
            super.onVisibilityAggregated(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/InfoFlowLottieAnimationView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onVisibilityAggregated(boolean z) {
        LottieDrawable lottieDrawable;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36afb937", new Object[]{this, new Boolean(z)});
            return;
        }
        int visibility = getVisibility();
        Drawable drawable = getDrawable();
        if (drawable instanceof LottieDrawable) {
            lottieDrawable = (LottieDrawable) drawable;
        } else {
            lottieDrawable = null;
        }
        if (lottieDrawable == null) {
            super.onVisibilityAggregated(z);
            return;
        }
        if (visibility != 0) {
            z2 = false;
        }
        if (z2 != z || !lottieDrawable.isRunning()) {
            super.onVisibilityAggregated(z);
        }
    }
}
