package com.alipay.android.msp.lottie;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.alipay.android.msp.lottie.LottiePlugin;
import com.alipay.android.msp.plugin.ILottiePLugin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kkh;
import tb.ulh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LottiePlugin implements ILottiePLugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LottieAnimationView maLottieView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoplay$0(boolean z, kkh kkhVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5832c38", new Object[]{this, new Boolean(z), kkhVar});
        } else if (z && (lottieAnimationView = this.maLottieView) != null) {
            lottieAnimationView.playAnimation();
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public View CreateLottieView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("26495e03", new Object[]{this, context});
        }
        if (this.maLottieView == null) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            this.maLottieView = lottieAnimationView;
            lottieAnimationView.setIgnoreDisabledSystemAnimations(true);
        }
        return this.maLottieView;
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d772b5a", new Object[]{this, new Integer(i)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation(i);
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAutoplay(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            lottieAnimationView.addLottieOnCompositionLoadedListener(new ulh() { // from class: tb.xlh
                @Override // tb.ulh
                public final void onCompositionLoaded(kkh kkhVar) {
                    LottiePlugin.this.lambda$setAutoplay$0(z, kkhVar);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setLoop(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            if (z) {
                i = -1;
            }
            lottieAnimationView.setRepeatCount(i);
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            lottieAnimationView.playAnimation();
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8294a53", new Object[]{this, str});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation(str);
        }
    }
}
