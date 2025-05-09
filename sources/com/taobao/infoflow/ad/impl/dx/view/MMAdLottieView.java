package com.taobao.infoflow.ad.impl.dx.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import tb.plh;
import tb.ulh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MMAdLottieView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HImageView bottomImageView;
    private LottieAnimationView lottieAnimationView;

    public MMAdLottieView(Context context) {
        this(context, null);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.lottieAnimationView = new LottieAnimationView(getContext());
            this.bottomImageView = new HImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            addView(this.bottomImageView, layoutParams);
            addView(this.lottieAnimationView, layoutParams);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(MMAdLottieView mMAdLottieView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/MMAdLottieView");
    }

    public void addLottieOnCompositionLoadedListener(ulh ulhVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e000ac", new Object[]{this, ulhVar});
        } else if (ulhVar != null && (lottieAnimationView = this.lottieAnimationView) != null) {
            lottieAnimationView.addLottieOnCompositionLoadedListener(ulhVar);
        }
    }

    public HImageView getBottomImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("a39c9427", new Object[]{this});
        }
        return this.bottomImageView;
    }

    public LottieAnimationView getLottieAnimationView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("4040ac5d", new Object[]{this});
        }
        return this.lottieAnimationView;
    }

    public float getProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5d61a30", new Object[]{this})).floatValue();
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return 0.0f;
        }
        return lottieAnimationView.getProgress();
    }

    public void hideBottomImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d053cd5", new Object[]{this});
            return;
        }
        HImageView hImageView = this.bottomImageView;
        if (hImageView != null) {
            hImageView.setVisibility(8);
        }
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null || !lottieAnimationView.isAnimating()) {
            return false;
        }
        return true;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.playAnimation();
        }
    }

    public void removeLottieOnCompositionLoadedListener(ulh ulhVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507802cf", new Object[]{this, ulhVar});
        } else if (ulhVar != null && (lottieAnimationView = this.lottieAnimationView) != null) {
            lottieAnimationView.removeLottieOnCompositionLoadedListener(ulhVar);
        }
    }

    public void setFailureListener(plh<Throwable> plhVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1b1584", new Object[]{this, plhVar});
        } else if (plhVar != null && (lottieAnimationView = this.lottieAnimationView) != null) {
            lottieAnimationView.setFailureListener(plhVar);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (this.bottomImageView != null && !TextUtils.isEmpty(str)) {
            this.bottomImageView.setImageUrl(str);
        }
    }

    public void setLottieProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaed44b", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress(f);
        }
    }

    public void setLottieUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a4b31f", new Object[]{this, str});
        } else if (this.lottieAnimationView != null && !TextUtils.isEmpty(str)) {
            this.lottieAnimationView.setAnimationFromUrl(str);
        }
    }

    public void setProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36908c", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress(f);
        }
    }

    public void setRepeatCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e802a", new Object[]{this, new Integer(i)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(i);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        HImageView hImageView = this.bottomImageView;
        if (hImageView != null) {
            hImageView.setScaleType(scaleType);
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setScaleType(scaleType);
        }
    }

    public MMAdLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
