package com.taobao.mmad.linkage.pop.big;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import tb.ecj;
import tb.i4v;
import tb.ja2;
import tb.jgh;
import tb.kkh;
import tb.lf4;
import tb.nwi;
import tb.p4q;
import tb.plh;
import tb.t2o;
import tb.ulh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageBigPopView extends FrameLayout implements View.OnClickListener, ulh, ValueAnimator.AnimatorUpdateListener, plh<Throwable>, Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOTTIE_END_ANIM_DURATION = 300;
    private static final String TAG = "BootImageBigPopView";
    private nwi adContext;
    private ObjectAnimator mEndAnimator;
    private Handler mExitHandler;
    private boolean mHasClose;
    private boolean mHasLoadLottie;
    private boolean mHasPlayEndAnim;
    private boolean mIsShowing;
    private int mLottieDuration;
    private int mLottieHeight;
    private FileInputStream mLottieInputStream;
    private int mLottieMaxDuration;
    private LottieAnimationView mLottiePop;
    private int mLottieWidth;
    private p4q mPopPlayEndListener;
    private View mTopLayer;
    private TextView mTvSkip;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/linkage/pop/big/BootImageBigPopView$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            jgh.a(BootImageBigPopView.TAG, "cancel");
            BootImageBigPopView.this.close();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            jgh.a(BootImageBigPopView.TAG, "auto_close");
            BootImageBigPopView.this.close();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jgh.a(BootImageBigPopView.TAG, "force_close");
            BootImageBigPopView.this.close();
        }
    }

    static {
        t2o.a(573571149);
    }

    public BootImageBigPopView(Context context, nwi nwiVar) {
        super(context);
        try {
            this.adContext = nwiVar;
            LayoutInflater.from(context).inflate(R.layout.bootimage_big_pop, this);
            this.mTopLayer = findViewById(R.id.bootimage_ad_top_layer);
            this.mTvSkip = (TextView) findViewById(R.id.bootimage_ad_pop_skip);
            this.mLottiePop = (LottieAnimationView) findViewById(R.id.bootimage_pop_lottie);
            this.mLottieMaxDuration = lf4.h();
            setOnClickListener(this);
            this.mTvSkip.setOnClickListener(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void closeLottieStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ca771e", new Object[]{this});
            return;
        }
        try {
            try {
                FileInputStream fileInputStream = this.mLottieInputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                jgh.a(TAG, "load_lottie_error:" + e.getMessage());
                e.printStackTrace();
            }
        } finally {
            this.mLottieInputStream = null;
        }
    }

    public static /* synthetic */ Object ipc$super(BootImageBigPopView bootImageBigPopView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/linkage/pop/big/BootImageBigPopView");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.mHasClose) {
            jgh.a(TAG, "close filter");
        } else {
            this.mHasClose = true;
            this.mIsShowing = false;
            try {
                jgh.a(TAG, "close");
                closeLottieStream();
                Handler handler = this.mExitHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mExitHandler = null;
                }
                LottieAnimationView lottieAnimationView = this.mLottiePop;
                if (lottieAnimationView != null && lottieAnimationView.isAnimating()) {
                    this.mLottiePop.cancelAnimation();
                }
                ObjectAnimator objectAnimator = this.mEndAnimator;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    this.mEndAnimator.cancel();
                }
                LottieAnimationView lottieAnimationView2 = this.mLottiePop;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(8);
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    jgh.a(TAG, "close:" + th.getMessage());
                    p4q p4qVar = this.mPopPlayEndListener;
                    if (p4qVar == null) {
                    }
                } finally {
                    p4q p4qVar2 = this.mPopPlayEndListener;
                    if (p4qVar2 != null) {
                        ((ja2.a) p4qVar2).a();
                        this.mPopPlayEndListener = null;
                    }
                }
            }
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.mIsShowing;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        jgh.a(TAG, "EndAnimation onAnimationCancel");
        close();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        jgh.a(TAG, "EndAnimation onAnimationEnd");
        close();
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

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.mLottieDuration;
        if (i - (animatedFraction * i) <= 300.0f) {
            playEndAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            if (view.getId() == R.id.bootimage_ad_pop_skip) {
                jgh.a(TAG, "click_play_end_anim");
                ecj.a(this.adContext, 3);
                i4v.j(this.adContext);
                playEndAnimation();
            }
        } catch (Throwable th) {
            th.printStackTrace();
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
        close();
    }

    public void preload(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420af387", new Object[]{this, file});
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.mLottieInputStream = fileInputStream;
            this.mLottiePop.setAnimation(fileInputStream, file.getName());
            this.mLottiePop.addLottieOnCompositionLoadedListener(this);
            this.mLottiePop.setFailureListener(this);
        } catch (Throwable th) {
            th.printStackTrace();
            jgh.a(TAG, "lottie_preload_fail:" + th.getMessage());
        }
    }

    private void playEndAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2194844", new Object[]{this});
            return;
        }
        try {
            if (this.mLottieDuration <= 300) {
                jgh.a(TAG, "lottie_duration_less_than_endDuration:" + this.mLottieDuration);
                close();
            } else if (!this.mHasPlayEndAnim) {
                jgh.a(TAG, "play_end_anim");
                this.mHasPlayEndAnim = true;
                this.mTvSkip.setVisibility(8);
                this.mTopLayer.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mLottiePop, "alpha", 1.0f, 0.0f);
                this.mEndAnimator = ofFloat;
                ofFloat.setDuration(300L);
                this.mEndAnimator.addListener(this);
                this.mEndAnimator.start();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.ulh
    public void onCompositionLoaded(kkh kkhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
            return;
        }
        jgh.a(TAG, "lottie_preload_success");
        closeLottieStream();
        this.mHasLoadLottie = true;
        if (kkhVar != null) {
            this.mLottieDuration = (int) kkhVar.d();
            Rect b2 = kkhVar.b();
            if (b2 != null) {
                this.mLottieWidth = b2.width();
                this.mLottieHeight = b2.height();
            }
        }
    }

    public void onResult(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
            return;
        }
        jgh.a(TAG, "playFail:" + th.getMessage());
        i4v.g(this.adContext, th.getMessage());
    }

    public boolean show(p4q p4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a301d9", new Object[]{this, p4qVar})).booleanValue();
        }
        try {
            this.mPopPlayEndListener = p4qVar;
            if (this.adContext == null) {
                return false;
            }
            jgh.a(TAG, "duration=" + this.mLottieDuration + ";w=" + this.mLottieWidth + ";h=" + this.mLottieHeight + ";maxDuration=" + this.mLottieMaxDuration);
            if (!this.mHasLoadLottie) {
                ecj.f(this.adContext, "lottie_has_not_load", 12);
                return false;
            }
            int i = this.mLottieDuration;
            if (i > 0 && i < this.mLottieMaxDuration) {
                if (this.mLottieWidth > 0 && this.mLottieHeight > 0) {
                    if (this.mIsShowing) {
                        jgh.a(TAG, "isShowing");
                        return false;
                    }
                    jgh.a(TAG, "startShow_lottie_url:" + this.adContext.d().a().animationLottie);
                    this.mIsShowing = true;
                    setVisibility(0);
                    LottieAnimationView lottieAnimationView = this.mLottiePop;
                    if (lottieAnimationView == null) {
                        return false;
                    }
                    lottieAnimationView.playAnimation();
                    this.mLottiePop.addAnimatorListener(new a());
                    this.mLottiePop.addAnimatorUpdateListener(this);
                    i4v.i(this.adContext, this.mLottieDuration, this.mLottieWidth, this.mLottieHeight);
                    if (this.mExitHandler == null) {
                        Handler handler = new Handler(Looper.getMainLooper());
                        this.mExitHandler = handler;
                        handler.postDelayed(new b(), this.mLottieDuration + 100);
                    }
                    return true;
                }
                nwi nwiVar = this.adContext;
                ecj.f(nwiVar, "lottie_size_check_fail:width=" + this.mLottieWidth + ";height=" + this.mLottieHeight, 12);
                return false;
            }
            ecj.f(this.adContext, "lottie_duration_error", 12);
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
