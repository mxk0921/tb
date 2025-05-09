package com.taobao.search.musie.lottie;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hdz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LottieWrapView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LottieAnimationView lottieView;
    private a onDrawErrorListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(815792749);
    }

    public LottieWrapView(Context context) {
        super(context);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.lottieView = lottieAnimationView;
        addView(lottieAnimationView, new ViewGroup.LayoutParams(-1, -1));
    }

    public static /* synthetic */ Object ipc$super(LottieWrapView lottieWrapView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/lottie/LottieWrapView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            if (this.onDrawErrorListener != null) {
                ((hdz) this.onDrawErrorListener).a(th);
            }
        }
    }

    public LottieAnimationView getLottieView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("6b68ec03", new Object[]{this});
        }
        return this.lottieView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.lottieView.isAnimating()) {
            this.lottieView.resumeAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.lottieView.pauseAnimation();
    }

    public void setOnDrawErrorListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1942d2c", new Object[]{this, aVar});
        } else {
            this.onDrawErrorListener = aVar;
        }
    }
}
