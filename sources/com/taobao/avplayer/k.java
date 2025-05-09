package com.taobao.avplayer;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10188a;
    public final /* synthetic */ int b;
    public final /* synthetic */ DWVideoViewController c;

    public k(DWVideoViewController dWVideoViewController, int i, int i2) {
        this.c = dWVideoViewController;
        this.f10188a = i;
        this.b = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoViewController.v(this.c).getLayoutParams();
        layoutParams.width = (int) (this.f10188a + (((DWVideoViewController.w(this.c) - this.f10188a) * abs) / 90.0f));
        layoutParams.height = (int) (this.b + (((DWVideoViewController.x(this.c) - this.b) * abs) / 90.0f));
        DWVideoViewController.v(this.c).requestLayout();
    }
}
