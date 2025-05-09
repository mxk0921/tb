package com.taobao.taolive.ui.view;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import java.util.ArrayList;
import java.util.Iterator;
import tb.bx0;
import tb.nz0;
import tb.qp0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NewDetailMaskFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECK_ACTIVITY_TIME = 800;
    public static final int DEFAULT_AUTO_ADAPTER_ANIM_DURATION_SPEED = 1;
    public static final int DEFAULT_AUTO_DEVICE_DURATION_MULTIPLIER = -2;
    public static final int DEFAULT_FRAME_SPEED_AVG_CHECK_COUNT = 3;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 460;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_MIN_FRAME_TIME = 17;
    public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 280;
    public static final String KEY_EXTRA_AUTO_ADAPTER_SPEED = "extraAutoAdapterSpeed";
    public static final String KEY_EXTRA_PRE_BOTTOM_BAR_COLOR = "extraPreBottomBarColor";
    private static int sFrameSpeedAvgCheckCount;
    private static long sFrameSpeedAvgDuration;
    private static long sFrameSpeedCheckStartTime;
    private static long sFrameSpeedLastTokenTime;
    private Activity mActivity;
    private Bundle mActivityBundle;
    private Context mContext;
    private boolean mDetachedFromWindow;
    private int mDeviceScore;
    private int mFrozenCountDown;
    private int mFrozenLayoutCount;
    private int mFrozenOutLayoutCount;
    private Handler mHandler;
    private boolean mHasCatchException;
    private boolean mHasConvertActivityFromTranslucent;
    private boolean mHasConvertActivityToTranslucent;
    private boolean mHasFrozenOuterSuccessLayout;
    private boolean mHasSetMaskViewFullAlpha;
    private boolean mHasSetRootViewFullAlpha;
    private boolean mHasSetScaleImageViewZeroAlpha;
    private float mImageViewScreenStartX;
    private float mImageViewScreenStartY;
    private float mImageViewStartHeight;
    private float mImageViewStartLeftMargin;
    private float mImageViewStartTopMargin;
    private float mImageViewStartWidth;
    private boolean mIsDestroy;
    private View mItemWhiteHolderView;
    private ImageView mMainViewHolderIv;
    private View mMaskView;
    private FrameLayout mParentFrameLayout;
    private ImageView mScaleImageView;
    private int mScreenHeight;
    private int mScreenWidth;
    private l mNewDetailMaskFrameLayoutContext = new l(null);
    private boolean mHasShowAnim = false;
    private boolean mHasSetBottomBarColor = false;
    private int mCurrentPageBottomBarColor = -1;
    private float mRootLayoutRealStartPreProcess = -1.0f;
    private float mRootLayoutRealStartProcess = -1.0f;
    private int val_animItemIsRunning = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13321a;

        public a(int i) {
            this.f13321a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
                l.c(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                try {
                    NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                } catch (Throwable th) {
                    k n = l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this));
                    String m = l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m();
                    n.c(m, "resumeLayout with error. currentCheckActivityTime = " + this.f13321a, th);
                }
                if (NewDetailMaskFrameLayout.access$1600(NewDetailMaskFrameLayout.this)) {
                    NewDetailMaskFrameLayout.this.autoCheckAnimEndStatusForV2();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f13322a;
        public final /* synthetic */ long b;

        public b(long j, long j2) {
            this.f13322a = j;
            this.b = j2;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else if (this.f13322a == NewDetailMaskFrameLayout.access$2100()) {
                long currentTimeMillis = System.currentTimeMillis();
                long access$2200 = currentTimeMillis - NewDetailMaskFrameLayout.access$2200();
                long j2 = this.b;
                if (access$2200 > j2) {
                    access$2200 = j2;
                }
                NewDetailMaskFrameLayout.access$2202(currentTimeMillis);
                if (access$2200 > 16) {
                    if (NewDetailMaskFrameLayout.access$2300() != 0) {
                        access$2200 = (NewDetailMaskFrameLayout.access$2300() + access$2200) / 2;
                    }
                    NewDetailMaskFrameLayout.access$2302(access$2200);
                }
                if (NewDetailMaskFrameLayout.access$2406() > 0) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13323a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;
        public final /* synthetic */ float m;

        public c(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            this.f13323a = z;
            this.b = z2;
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
            this.i = f7;
            this.j = f8;
            this.k = f9;
            this.l = f10;
            this.m = f11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this) && !NewDetailMaskFrameLayout.access$2500(NewDetailMaskFrameLayout.this)) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (this.f13323a) {
                        if (floatValue < 0.2d) {
                            NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                        } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                            NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                            NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                        }
                    }
                    if ((!this.b || !l.m(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this))) && floatValue <= this.c) {
                        NewDetailMaskFrameLayout.access$3102(NewDetailMaskFrameLayout.this, floatValue);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - (this.g * floatValue));
                    } else if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                        if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                            NewDetailMaskFrameLayout newDetailMaskFrameLayout = NewDetailMaskFrameLayout.this;
                            NewDetailMaskFrameLayout.access$3002(newDetailMaskFrameLayout, NewDetailMaskFrameLayout.access$3100(newDetailMaskFrameLayout) > 0.0f ? NewDetailMaskFrameLayout.access$3100(NewDetailMaskFrameLayout.this) : floatValue);
                        }
                        float access$3000 = ((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * this.d) + this.e;
                        float min = Math.min(((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * this.f) + this.e, 1.0f);
                        if (access$3000 > 1.0f) {
                            NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                        } else {
                            NewDetailMaskFrameLayout.this.setAlpha(min);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - access$3000);
                        }
                    }
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(this.h * floatValue);
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(this.i * floatValue);
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((this.j - 1.0f) * floatValue) + 1.0f);
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((this.k - 1.0f) * floatValue) + 1.0f);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = NewDetailMaskFrameLayout.this;
                    float f = this.l;
                    newDetailMaskFrameLayout2.setScaleX(((1.0f - f) * floatValue) + f);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout3 = NewDetailMaskFrameLayout.this;
                    float f2 = this.m;
                    newDetailMaskFrameLayout3.setScaleY(((1.0f - f2) * floatValue) + f2);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout4 = NewDetailMaskFrameLayout.this;
                    float f3 = 1.0f - floatValue;
                    newDetailMaskFrameLayout4.setTranslationX(NewDetailMaskFrameLayout.access$3300(newDetailMaskFrameLayout4) * f3);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout5 = NewDetailMaskFrameLayout.this;
                    newDetailMaskFrameLayout5.setTranslationY(NewDetailMaskFrameLayout.access$3400(newDetailMaskFrameLayout5) * f3);
                    if ((l.m(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).C()) {
                        NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                        l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).b(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                    }
                    if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                        NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                    }
                    NewDetailMaskFrameLayout.this.invalidate();
                }
            } catch (Throwable th) {
                NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13326a;
        public final /* synthetic */ float b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;

        public e(boolean z, float f, boolean z2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.f13326a = z;
            this.b = f;
            this.c = z2;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
            this.i = f7;
            this.j = f8;
            this.k = f9;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this) && !NewDetailMaskFrameLayout.access$2500(NewDetailMaskFrameLayout.this)) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (this.f13326a) {
                        if (floatValue < 0.2d) {
                            NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                        } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                            NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                            NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                        }
                    }
                    if (NewDetailMaskFrameLayout.access$4500(NewDetailMaskFrameLayout.this).F()) {
                        NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                        NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                    }
                    if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                        float f2 = this.b * floatValue;
                        if (f2 > 1.0f) {
                            NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                        } else {
                            NewDetailMaskFrameLayout.this.setAlpha(f2);
                        }
                    }
                    if (this.c) {
                        float f3 = this.d;
                        if (f3 > 0.0f) {
                            f = floatValue > f3 ? (floatValue - f3) * this.e : 0.0f;
                        } else {
                            f = this.e * floatValue;
                        }
                        if (NewDetailMaskFrameLayout.access$4600(NewDetailMaskFrameLayout.this) || f <= 1.0f) {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - f);
                        } else {
                            NewDetailMaskFrameLayout.access$4602(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                        }
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(this.f * floatValue);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(this.g * floatValue);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((this.h - 1.0f) * floatValue) + 1.0f);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((this.i - 1.0f) * floatValue) + 1.0f);
                    }
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout = NewDetailMaskFrameLayout.this;
                    float f4 = this.j;
                    newDetailMaskFrameLayout.setScaleX(((1.0f - f4) * floatValue) + f4);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = NewDetailMaskFrameLayout.this;
                    float f5 = this.k;
                    newDetailMaskFrameLayout2.setScaleY(((1.0f - f5) * floatValue) + f5);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout3 = NewDetailMaskFrameLayout.this;
                    float f6 = 1.0f - floatValue;
                    newDetailMaskFrameLayout3.setTranslationX(NewDetailMaskFrameLayout.access$3300(newDetailMaskFrameLayout3) * f6);
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout4 = NewDetailMaskFrameLayout.this;
                    newDetailMaskFrameLayout4.setTranslationY(NewDetailMaskFrameLayout.access$3400(newDetailMaskFrameLayout4) * f6);
                    if ((l.m(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).C()) {
                        NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                        l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).b(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                    }
                    if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                        NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                    }
                    NewDetailMaskFrameLayout.this.invalidate();
                }
            } catch (Throwable th) {
                NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13327a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                    NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                }
            }
        }

        public f(boolean z) {
            this.f13327a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                onAnimationEnd(animator);
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
                return;
            }
            try {
                if (l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).K()) {
                    NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                }
            } catch (Throwable th) {
                l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "动画开始时，场景冻结出错。", th);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                l.c(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                    NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                }
                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                NewDetailMaskFrameLayout.this.getMainHandler().postDelayed(new a(), NewDetailMaskFrameLayout.access$4500(NewDetailMaskFrameLayout.this).f());
                if (this.f13327a) {
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                }
                try {
                    NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                    NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                } catch (Throwable th) {
                    l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "新转场完成后，主视图恢复出错。", th);
                }
                NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_CUSTOM_ANIMATION_FRAME_MAX_COUNT = 12;
        public static final int DEFAULT_CUSTOM_ANIMATION_MIN_FRAME_FIT = 32;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_GT80_MAX_VALUE = 260;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT40_MAX_VALUE = 320;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT60_MAX_VALUE = 310;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 280;
        public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 240;
        public static final int DEFAULT_VALUE_MASK_FRAME_GT80_ANIM_DURATION = 230;
        public static final int DEFAULT_VALUE_MASK_FRAME_LT40_ANIM_DURATION = 280;
        public static final int DEFAULT_VALUE_MASK_FRAME_LT60_ANIM_DURATION = 270;
        public static final int MASK_ANIM_VERSION_V1 = 101;
        public static final int MASK_ANIM_VERSION_V2 = 201;
        public static final int MASK_ANIM_VERSION_V3 = 301;

        static {
            t2o.a(779093559);
        }

        public static /* synthetic */ Drawable a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("323938f8", new Object[]{context});
            }
            return h(context);
        }

        public static /* synthetic */ int b(int i, k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9900d8b8", new Object[]{new Integer(i), kVar})).intValue();
            }
            return d(i, kVar);
        }

        public static Bundle c(Context context) {
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("bdffc29c", new Object[]{context});
            }
            if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
                return intent.getBundleExtra("nav_animation_extra");
            }
            return null;
        }

        public static int d(int i, k kVar) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6be85c0", new Object[]{new Integer(i), kVar})).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            int h = kVar.h();
            if (h > 0) {
                long i3 = kVar.i();
                if (NewDetailMaskFrameLayout.access$2300() > i3) {
                    int g = kVar.g();
                    int j = kVar.j();
                    int n = kVar.n();
                    int p = n - kVar.p();
                    float access$2300 = (float) ((NewDetailMaskFrameLayout.access$2300() - i3) * h);
                    if (j != -2 && deviceScore > p && deviceScore < 101) {
                        if (deviceScore > n) {
                            i2 = (Math.min(kVar.s(), deviceScore) - n) * j;
                        } else {
                            i2 = ((deviceScore - p) * j) / 2;
                        }
                        g -= i2;
                        access$2300 = Math.max(access$2300 - i2, 0.0f);
                    }
                    int i4 = (int) (i + access$2300);
                    if (i4 <= g) {
                        g = i4;
                    }
                    if (g >= i) {
                        i = g;
                    }
                    kVar.b(kVar.m(), "animDuration frameSpeedDuration Result: " + i + " sFrameSpeedAvgDuration: " + NewDetailMaskFrameLayout.access$2300() + " DeviceScore:" + deviceScore + " deviceMultiplier:" + j + " deviceReduce:" + i2);
                }
            }
            return i;
        }

        public static int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d268dc6", new Object[0])).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            if (deviceScore < 40) {
                return 320;
            }
            if (deviceScore < 60) {
                return 310;
            }
            if (deviceScore < 80) {
                return 280;
            }
            return 260;
        }

        public static int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5352c305", new Object[0])).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            if (deviceScore < 40) {
                return 280;
            }
            if (deviceScore < 60) {
                return 270;
            }
            if (deviceScore < 80) {
                return 240;
            }
            return 230;
        }

        public static BitmapBinder g(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapBinder) ipChange.ipc$dispatch("69abc2b9", new Object[]{bundle});
            }
            if (bundle == null) {
                return null;
            }
            return NewDetailMaskFrameLayout.access$5300(bundle.getBinder("view_source_drawable"));
        }

        public static Drawable h(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("2d55b6cd", new Object[]{context});
            }
            BitmapBinder g = g(c(context));
            if (g != null) {
                return g.getDrawable();
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class i extends j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long c;

        static {
            t2o.a(779093564);
        }

        public static /* synthetic */ long f(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("541ed4c", new Object[]{iVar})).longValue();
            }
            return iVar.c;
        }

        public static /* synthetic */ long g(i iVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f1f3e7e2", new Object[]{iVar, new Long(j)})).longValue();
            }
            iVar.c = j;
            return j;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/ui/view/NewDetailMaskFrameLayout$DelayRecordTaskRunnable");
        }

        public long h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d22922b4", new Object[]{this})).longValue();
            }
            return this.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private k f13332a;
        private l b;

        static {
            t2o.a(779093565);
        }

        public static /* synthetic */ k a(j jVar, k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("286f81f0", new Object[]{jVar, kVar});
            }
            jVar.f13332a = kVar;
            return kVar;
        }

        public static /* synthetic */ l b(j jVar, l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("6e709b11", new Object[]{jVar, lVar});
            }
            jVar.b = lVar;
            return lVar;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 0L;
        }

        public abstract String d();

        public abstract void e();

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                k kVar = this.f13332a;
                if (kVar != null) {
                    String m = kVar.m();
                    kVar.b(m, "DelayTask runTask 开始执行: " + d());
                }
                e();
            } catch (Throwable th) {
                th.printStackTrace();
                k kVar2 = this.f13332a;
                if (kVar2 != null) {
                    kVar2.c(kVar2.m(), "未知异常，runTask . throwable  ", th);
                }
            }
            try {
                l lVar = this.b;
                if (lVar != null && !l.a(lVar)) {
                    l.l(this.b);
                    if (l.i(this.b) <= 0) {
                        l.b(this.b, true);
                        k kVar3 = this.f13332a;
                        if (kVar3 != null) {
                            kVar3.b(kVar3.m(), "on task end.mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        }
                    }
                }
            } catch (Throwable th2) {
                k kVar4 = this.f13332a;
                if (kVar4 != null) {
                    kVar4.c(kVar4.m(), "未知异常，runTask end.", th2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public NewDetailMaskFrameLayout f13333a;
        public int b = -1;

        static {
            t2o.a(779093566);
        }

        public static /* synthetic */ NewDetailMaskFrameLayout a(k kVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NewDetailMaskFrameLayout) ipChange.ipc$dispatch("918dd1d0", new Object[]{kVar, newDetailMaskFrameLayout});
            }
            kVar.f13333a = newDetailMaskFrameLayout;
            return newDetailMaskFrameLayout;
        }

        public void A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2016d0c7", new Object[]{this});
            }
        }

        public void B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d01d14", new Object[]{this});
            }
        }

        public boolean C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("517f71f8", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58aff94c", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45a248ad", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean F() {
            NewDetailMaskFrameLayout newDetailMaskFrameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4b15140", new Object[]{this})).booleanValue();
            }
            if (this.b == -1 && (newDetailMaskFrameLayout = this.f13333a) != null) {
                this.b = newDetailMaskFrameLayout.supportFullAlpha() ? 1 : 0;
            }
            if (this.b == 1) {
                return true;
            }
            return false;
        }

        public boolean G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b08c31b9", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d172c5b", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean I() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b9ea9c23", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean J() {
            NewDetailMaskFrameLayout newDetailMaskFrameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c245bf9", new Object[]{this})).booleanValue();
            }
            if (!y() || !F() || ((newDetailMaskFrameLayout = this.f13333a) != null && newDetailMaskFrameLayout.animItemIsRunning())) {
                return true;
            }
            return false;
        }

        public boolean K() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("966081bf", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75a85d94", new Object[]{this, str, str2});
            } else {
                Log.e(str, str2);
            }
        }

        public void c(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fda44fa5", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("701fb09c", new Object[]{this})).intValue();
            }
            return 10;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e6421f56", new Object[]{this})).intValue();
            }
            return g.e();
        }

        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6428b2", new Object[]{this})).intValue();
            }
            return 0;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4629b9ac", new Object[]{this})).intValue();
            }
            return 17;
        }

        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5366272a", new Object[]{this})).intValue();
            }
            return -2;
        }

        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f32ae7b5", new Object[]{this})).intValue();
            }
            return 12;
        }

        public int l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("71e80ab3", new Object[]{this})).intValue();
            }
            return 32;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fec598ca", new Object[]{this});
            }
            return "无极缩放Default";
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2339b08f", new Object[]{this})).intValue();
            }
            return 80;
        }

        public float o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2bc17881", new Object[]{this})).floatValue();
            }
            if (y()) {
                return 3.0f;
            }
            return 1.8f;
        }

        public int p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3304b26", new Object[]{this})).intValue();
            }
            return 10;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6e166ebf", new Object[]{this})).intValue();
            }
            return 201;
        }

        public int r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9de920a", new Object[]{this})).intValue();
            }
            return g.f();
        }

        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d2ff5b6", new Object[]{this})).intValue();
            }
            return 92;
        }

        public float t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f69808a5", new Object[]{this})).floatValue();
            }
            if (!y()) {
                return 0.3f;
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f13333a;
            if (newDetailMaskFrameLayout == null || !newDetailMaskFrameLayout.animItemIsRunning()) {
                return 4.0f;
            }
            return 2.0f;
        }

        public float u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bff8b45d", new Object[]{this})).floatValue();
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f13333a;
            if (newDetailMaskFrameLayout == null || !newDetailMaskFrameLayout.animItemIsRunning()) {
                return -1.0f;
            }
            return 0.3f;
        }

        public float v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac43df93", new Object[]{this})).floatValue();
            }
            return 0.3f;
        }

        public TimeInterpolator w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TimeInterpolator) ipChange.ipc$dispatch("86291875", new Object[]{this});
            }
            return new AccelerateDecelerateInterpolator();
        }

        @Deprecated
        public boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c017b8f", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public final boolean y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue();
            }
            if (q() == 201) {
                return true;
            }
            return false;
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdf9c9cb", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<j> f13334a;
        public boolean b;
        public int c;
        public long d;
        public boolean e;
        public Handler f;
        public k g;

        static {
            t2o.a(779093567);
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        public static /* synthetic */ boolean a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("201cf39f", new Object[]{lVar})).booleanValue();
            }
            return lVar.e;
        }

        public static /* synthetic */ boolean b(l lVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fd7441f", new Object[]{lVar, new Boolean(z)})).booleanValue();
            }
            lVar.e = z;
            return z;
        }

        public static /* synthetic */ boolean c(l lVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3075510", new Object[]{lVar, new Boolean(z)})).booleanValue();
            }
            lVar.getClass();
            return z;
        }

        public static /* synthetic */ RecyclerView d(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("5eb8ad", new Object[]{lVar});
            }
            lVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean e(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("78df4d69", new Object[]{lVar})).booleanValue();
            }
            return lVar.b;
        }

        public static /* synthetic */ boolean f(l lVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2f602395", new Object[]{lVar, new Boolean(z)})).booleanValue();
            }
            lVar.b = z;
            return z;
        }

        public static /* synthetic */ ArrayList g(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("4986b69e", new Object[]{lVar});
            }
            return lVar.f13334a;
        }

        public static /* synthetic */ ArrayList h(l lVar, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("5083bc2", new Object[]{lVar, arrayList});
            }
            lVar.f13334a = arrayList;
            return arrayList;
        }

        public static /* synthetic */ int i(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1f4382ed", new Object[]{lVar})).intValue();
            }
            return lVar.c;
        }

        public static /* synthetic */ long j(l lVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1c5370c", new Object[]{lVar, new Long(j)})).longValue();
            }
            lVar.d = j;
            return j;
        }

        public static /* synthetic */ int k(l lVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("558260be", new Object[]{lVar, new Integer(i)})).intValue();
            }
            lVar.c = i;
            return i;
        }

        public static /* synthetic */ int l(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e56e0bae", new Object[]{lVar})).intValue();
            }
            int i = lVar.c;
            lVar.c = i - 1;
            return i;
        }

        public static /* synthetic */ boolean m(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e8aa9ea", new Object[]{lVar})).booleanValue();
            }
            lVar.getClass();
            return false;
        }

        public static /* synthetic */ k n(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("4d2f650a", new Object[]{lVar});
            }
            return lVar.g;
        }

        public static /* synthetic */ k o(l lVar, k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("c1ee0dc3", new Object[]{lVar, kVar});
            }
            lVar.g = kVar;
            return kVar;
        }

        public static /* synthetic */ Handler p(l lVar, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("44181fe4", new Object[]{lVar, handler});
            }
            lVar.f = handler;
            return handler;
        }

        public void q(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b2507d5", new Object[]{this, jVar});
                return;
            }
            try {
                r(jVar);
            } catch (Throwable th) {
                this.g.c(this.g.m(), "示知异常，任务入队失败。", th);
            }
        }

        public boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
            }
            return this.g.d();
        }

        public l() {
            this.g = new k();
        }

        public void r(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a842b5ac", new Object[]{this, jVar});
            } else if (jVar == null) {
            } else {
                if (this.g.e()) {
                    jVar.run();
                } else if (!this.b) {
                    if (this.f13334a == null) {
                        this.f13334a = new ArrayList<>(15);
                    }
                    j.a(jVar, this.g);
                    j.b(jVar, this);
                    this.f13334a.add(jVar);
                } else if (this.e) {
                    jVar.run();
                } else {
                    if (this.c <= 0) {
                        k kVar = this.g;
                        kVar.b(kVar.m(), "mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    } else if (System.currentTimeMillis() - this.d > 5000) {
                        k kVar2 = this.g;
                        kVar2.b(kVar2.m(), "mHasStartProcessAllTask and mDelayTaskStartProcessTime is timed out , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    }
                    if (this.e) {
                        jVar.run();
                    } else if (jVar.c() > 0) {
                        if (this.f == null) {
                            this.f = new Handler(Looper.getMainLooper());
                        }
                        this.f.postDelayed(jVar, jVar.c());
                    } else {
                        jVar.run();
                    }
                }
            }
        }
    }

    static {
        t2o.a(779093550);
    }

    public NewDetailMaskFrameLayout(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ void access$1000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cadd7e", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryConvertActivityFromTranslucent();
        }
    }

    public static /* synthetic */ void access$1100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcea8dd", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryProcessDelayTask();
        }
    }

    public static /* synthetic */ l access$1200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("39f069ff", new Object[]{newDetailMaskFrameLayout});
        }
        return newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext;
    }

    public static /* synthetic */ void access$1400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dda0afa", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$1500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ddd659", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$1600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e1a1bc", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.isV2Version();
    }

    public static /* synthetic */ long access$2100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b25cba", new Object[0])).longValue();
        }
        return sFrameSpeedLastTokenTime;
    }

    public static /* synthetic */ long access$2200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("179897fb", new Object[0])).longValue();
        }
        return sFrameSpeedCheckStartTime;
    }

    public static /* synthetic */ long access$2202(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dee490cf", new Object[]{new Long(j2)})).longValue();
        }
        sFrameSpeedCheckStartTime = j2;
        return j2;
    }

    public static /* synthetic */ long access$2300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c7ed33c", new Object[0])).longValue();
        }
        return sFrameSpeedAvgDuration;
    }

    public static /* synthetic */ long access$2302(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46c5bdae", new Object[]{new Long(j2)})).longValue();
        }
        sFrameSpeedAvgDuration = j2;
        return j2;
    }

    public static /* synthetic */ int access$2406() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81b99b82", new Object[0])).intValue();
        }
        int i2 = sFrameSpeedAvgCheckCount - 1;
        sFrameSpeedAvgCheckCount = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$2500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee5376de", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasCatchException;
    }

    public static /* synthetic */ boolean access$2502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd87b0c0", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasCatchException = z;
        return z;
    }

    public static /* synthetic */ View access$2600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8d391e3b", new Object[]{newDetailMaskFrameLayout});
        }
        return newDetailMaskFrameLayout.mMaskView;
    }

    public static /* synthetic */ boolean access$2700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa5b0d9c", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2702(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7272f1c2", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ boolean access$2900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("662a45a", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasSetRootViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2902(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e75e32c4", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetRootViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ float access$3000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ab61e70", new Object[]{newDetailMaskFrameLayout})).floatValue();
        }
        return newDetailMaskFrameLayout.mRootLayoutRealStartProcess;
    }

    public static /* synthetic */ float access$3002(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed79b2b2", new Object[]{newDetailMaskFrameLayout, new Float(f2)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartProcess = f2;
        return f2;
    }

    public static /* synthetic */ float access$3100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90b9e9cf", new Object[]{newDetailMaskFrameLayout})).floatValue();
        }
        return newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess;
    }

    public static /* synthetic */ float access$3102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7ef5333", new Object[]{newDetailMaskFrameLayout, new Float(f2)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess = f2;
        return f2;
    }

    public static /* synthetic */ ImageView access$3200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("c0f48c12", new Object[]{newDetailMaskFrameLayout});
        }
        return newDetailMaskFrameLayout.mScaleImageView;
    }

    public static /* synthetic */ float access$3300(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cc1808d", new Object[]{newDetailMaskFrameLayout})).floatValue();
        }
        return newDetailMaskFrameLayout.mImageViewStartLeftMargin;
    }

    public static /* synthetic */ float access$3400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2c54bec", new Object[]{newDetailMaskFrameLayout})).floatValue();
        }
        return newDetailMaskFrameLayout.mImageViewStartTopMargin;
    }

    public static /* synthetic */ boolean access$3500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8c9175f", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout;
    }

    public static /* synthetic */ boolean access$3502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c6205f", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout = z;
        return z;
    }

    public static /* synthetic */ int access$3610(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf82af6e", new Object[]{newDetailMaskFrameLayout})).intValue();
        }
        int i2 = newDetailMaskFrameLayout.mFrozenCountDown;
        newDetailMaskFrameLayout.mFrozenCountDown = i2 - 1;
        return i2;
    }

    public static /* synthetic */ void access$3700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d0ae19", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$3800(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad47978", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$3900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d844db", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasSetBottomBarColor;
    }

    public static /* synthetic */ void access$4000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452bbf01", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.setCurrentBottomBarColor();
        }
    }

    public static /* synthetic */ int access$4102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2dce18", new Object[]{newDetailMaskFrameLayout, new Integer(i2)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenLayoutCount = i2;
        return i2;
    }

    public static /* synthetic */ int access$4202(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6a36e99", new Object[]{newDetailMaskFrameLayout, new Integer(i2)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenOutLayoutCount = i2;
        return i2;
    }

    public static /* synthetic */ k access$4500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("85c63aa3", new Object[]{newDetailMaskFrameLayout});
        }
        return newDetailMaskFrameLayout.getMaskHandler();
    }

    public static /* synthetic */ boolean access$4600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6942833f", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha;
    }

    public static /* synthetic */ boolean access$4602(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07a307f", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha = z;
        return z;
    }

    public static /* synthetic */ BitmapBinder access$5300(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("eefef21a", new Object[]{iBinder});
        }
        return tryConvertBitmapBinder(iBinder);
    }

    public static /* synthetic */ boolean access$900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("113b91a8", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.isDestroy();
    }

    private int adapterCurrentCheckActivityTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f055d9f5", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (i2 < getMaskHandler().r() + 200) {
            return getMaskHandler().r() + 200;
        }
        return i2;
    }

    private void addAnimAllListenerAndStartAnim(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        int i2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13898b2", new Object[]{this, valueAnimator, animatorUpdateListener, animatorListener});
        } else if (valueAnimator != null && animatorUpdateListener != null && animatorListener != null) {
            if (getMaskHandler().E()) {
                h hVar = new h(null);
                h.b(hVar, animatorUpdateListener);
                h.d(hVar, valueAnimator);
                h.f(hVar, animatorListener);
                int k2 = getMaskHandler().k();
                if (k2 > 0) {
                    if (getMaskHandler().l() > 0) {
                        if (sFrameSpeedAvgDuration > getMaskHandler().l()) {
                            i2 = 16;
                        } else {
                            k2 = (k2 * 2) / 3;
                            i2 = 18;
                        }
                        h.h(hVar, i2);
                    }
                    h.j(hVar, k2);
                    k maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.b(logTag, "TikTest customVerticalSyncAnimation currentRealMinFrameFit:" + h.g(hVar) + " frameMaxCount:" + h.i(hVar));
                    z = hVar.t();
                }
            }
            if (!z) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.addListener(animatorListener);
                valueAnimator.start();
            }
        }
    }

    private void checkAndTryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c0dc0", new Object[]{this});
        } else if (!isDestroy()) {
            tryConvertActivityFromTranslucent();
        }
    }

    private void checkAndTryProcessDelayTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41765ac", new Object[]{this});
            return;
        }
        try {
            directProcessDelayTask();
        } catch (Throwable th) {
            l.n(this.mNewDetailMaskFrameLayoutContext).c(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "新转场完成后，非核心任务恢复出错。", th);
        }
    }

    private void createItemWhiteHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a487852", new Object[]{this});
            return;
        }
        View view = new View(this.mContext);
        this.mItemWhiteHolderView = view;
        view.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
        layoutParams.gravity = 51;
        layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
        layoutParams.topMargin = (int) this.mImageViewScreenStartY;
        this.mParentFrameLayout.addView(this.mItemWhiteHolderView, 0, layoutParams);
    }

    private void createMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28adfed4", new Object[]{this});
        } else if (this.mActivity != null && this.mContext != null && this.mParentFrameLayout != null && l.n(this.mNewDetailMaskFrameLayoutContext).D()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            View view = new View(this.mContext);
            this.mMaskView = view;
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.mMaskView.setLayoutParams(layoutParams);
            this.mMaskView.setAlpha(0.001f);
            this.mParentFrameLayout.addView(this.mMaskView, 0);
        }
    }

    public static boolean degradeToOldTransition(Activity activity, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3c8188", new Object[]{activity, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(i2, i3);
        return true;
    }

    private void directProcessDelayTask() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26025989", new Object[]{this});
        } else if (!l.e(this.mNewDetailMaskFrameLayoutContext)) {
            l.f(this.mNewDetailMaskFrameLayoutContext, true);
            ArrayList g2 = l.g(this.mNewDetailMaskFrameLayoutContext);
            l.h(this.mNewDetailMaskFrameLayoutContext, null);
            if (g2 != null && !g2.isEmpty()) {
                l.k(this.mNewDetailMaskFrameLayoutContext, g2.size());
                l.j(this.mNewDetailMaskFrameLayoutContext, System.currentTimeMillis());
                Iterator it = g2.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    i2++;
                    this.mHandler.postDelayed(jVar, i2 + jVar.c());
                }
            }
        }
    }

    private void frozenNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c8bc8", new Object[]{this});
        } else if (!l.n(this.mNewDetailMaskFrameLayoutContext).e()) {
            this.mFrozenLayoutCount++;
            if (l.d(this.mNewDetailMaskFrameLayoutContext) != null && !l.d(this.mNewDetailMaskFrameLayoutContext).isLayoutFrozen()) {
                l.d(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(true);
            }
        }
    }

    private void frozenOuterNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6977ca23", new Object[]{this});
        } else if (!l.n(this.mNewDetailMaskFrameLayoutContext).e()) {
            this.mFrozenOutLayoutCount++;
            l.n(this.mNewDetailMaskFrameLayoutContext).A();
        }
    }

    public static int getAdapterSpeedFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd85776b", new Object[]{intent})).intValue();
        }
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra("extraAutoAdapterSpeed", -1);
    }

    public static int getAndSetFromPageBottomBarColor(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dda0417c", new Object[]{context, intent})).intValue();
        }
        if (intent == null || context == null) {
            return -1;
        }
        int bottomBarColor = getBottomBarColor(context);
        setFromPageBottomBarColor(bottomBarColor, intent);
        return bottomBarColor;
    }

    public static int getBottomBarColor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b59b4363", new Object[]{context})).intValue();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getNavigationBarColor();
        }
        return -1;
    }

    private float getCardMainImageViewHeight(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c866bc", new Object[]{this, intent})).floatValue();
        }
        if (intent == null) {
            return -1.0f;
        }
        return intent.getFloatExtra(bx0.PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, -1.0f);
    }

    public static int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[0])).intValue();
        }
        int c2 = (int) qp0.c();
        if (c2 < 0 || c2 > 100) {
            return 80;
        }
        return c2;
    }

    private String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return l.n(this.mNewDetailMaskFrameLayoutContext).m();
    }

    private k getMaskHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("e2bee90", new Object[]{this});
        }
        return l.n(this.mNewDetailMaskFrameLayoutContext);
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    private void initActivityAndAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3893b8ad", new Object[]{this});
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.mHandler = handler;
        l.p(this.mNewDetailMaskFrameLayoutContext, handler);
        Context context = getContext();
        this.mContext = context;
        if (context instanceof Activity) {
            this.mActivity = (Activity) context;
        }
    }

    private void initScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a289c4", new Object[]{this});
        } else if (this.mScreenWidth <= 0 || this.mScreenHeight <= 0) {
            this.mScreenWidth = getScreenWidth(this.mContext);
            this.mScreenHeight = getScreenHeight(this.mContext);
        }
    }

    private void initTargetSizeForV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5838deea", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(NewDetailMaskFrameLayout newDetailMaskFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/ui/view/NewDetailMaskFrameLayout");
    }

    private boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        if (this.mDetachedFromWindow || this.mIsDestroy) {
            return true;
        }
        return false;
    }

    private boolean isV1Version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770f1ade", new Object[]{this})).booleanValue();
        }
        if (l.n(this.mNewDetailMaskFrameLayoutContext).q() <= 101) {
            return true;
        }
        return false;
    }

    private boolean isV2Version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue();
        }
        if (l.n(this.mNewDetailMaskFrameLayoutContext).q() <= 201) {
            return true;
        }
        return false;
    }

    private void resumeNoneCoreLayout() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef05d815", new Object[]{this});
        } else if (!l.n(this.mNewDetailMaskFrameLayoutContext).e() && (i2 = this.mFrozenLayoutCount) > 0) {
            this.mFrozenLayoutCount = i2 - 1;
            if (l.d(this.mNewDetailMaskFrameLayoutContext) != null) {
                l.d(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(false);
            }
        }
    }

    private void resumeOuterNoneCoreLayout() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401325f6", new Object[]{this});
        } else if (!l.n(this.mNewDetailMaskFrameLayoutContext).e() && (i2 = this.mFrozenOutLayoutCount) > 0) {
            this.mFrozenOutLayoutCount = i2 - 1;
            l.n(this.mNewDetailMaskFrameLayoutContext).B();
        }
    }

    private void saveCurrentBottomBarColor(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b499090", new Object[]{this, activity});
        } else if (l.n(this.mNewDetailMaskFrameLayoutContext).z()) {
            this.mCurrentPageBottomBarColor = getBottomBarColor(activity);
        }
    }

    public static void setAdapterSpeedAndStartCheckStatus(int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd18804", new Object[]{new Integer(i2), intent});
        } else if (i2 > 0 && intent != null) {
            intent.putExtra("extraAutoAdapterSpeed", i2);
            startCheckCurrentDeviceStatus(3);
        }
    }

    private static void setBottomBarColor(Activity activity, int i2, boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf15c67", new Object[]{activity, new Integer(i2), new Boolean(z)});
        } else if (activity != null) {
            if ((z || i2 >= 0) && (window = activity.getWindow()) != null) {
                window.setNavigationBarColor(i2);
            }
        }
    }

    private void setBottomBarColorAsPrePage(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c097f3c", new Object[]{this, activity});
        } else if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                int intExtra = intent.getIntExtra("extraPreBottomBarColor", -1);
                if (l.n(this.mNewDetailMaskFrameLayoutContext).G() || intExtra >= 0) {
                    setBottomBarColor(activity, intExtra, l.n(this.mNewDetailMaskFrameLayoutContext).G());
                }
            } catch (Throwable th) {
                l.n(this.mNewDetailMaskFrameLayoutContext).c(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "未知异常。 BottomBarColor 处理失败。Pre 。", th);
            }
        }
    }

    public static void setFromPageBottomBarColor(int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91853fc3", new Object[]{new Integer(i2), intent});
        } else if (i2 >= 0 && intent != null) {
            intent.putExtra("extraPreBottomBarColor", i2);
        }
    }

    public static void startCheckCurrentDeviceStatus(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2581e1", new Object[]{new Integer(i2)});
            return;
        }
        sFrameSpeedAvgCheckCount = i2;
        long min = Math.min((sFrameSpeedAvgDuration / 2) + 70, 120L);
        sFrameSpeedAvgDuration = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        sFrameSpeedCheckStartTime = currentTimeMillis;
        sFrameSpeedLastTokenTime = currentTimeMillis;
        Choreographer.getInstance().postFrameCallback(new b(currentTimeMillis, min));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void startFrameLayoutAnim() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.startFrameLayoutAnim():void");
    }

    private void startFrameLayoutAnimV2() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4c6d89", new Object[]{this});
        } else if (!this.mHasShowAnim) {
            this.mHasShowAnim = true;
            k.a(getMaskHandler(), this);
            if (getMaskHandler().F()) {
                setAlpha(1.0f);
            }
            float f2 = this.mScreenWidth;
            float f3 = this.mImageViewStartWidth;
            float f4 = this.mScreenHeight;
            float f5 = this.mImageViewStartHeight;
            float f6 = (int) (f2 - f3);
            float f7 = (int) (f4 - f5);
            float f8 = f4 / f5;
            float f9 = f2 / f3;
            float f10 = (-(this.mImageViewStartLeftMargin / f6)) * f6;
            float f11 = (-(this.mImageViewStartTopMargin / f7)) * f7;
            if (this.mScaleImageView == null || !getMaskHandler().J()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.mScaleImageView.setPivotX(0.0f);
                this.mScaleImageView.setPivotY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(g.b(getMaskHandler().r(), getMaskHandler()));
            ofFloat.setInterpolator(getMaskHandler().w());
            float f12 = this.mImageViewStartWidth / this.mScreenWidth;
            float f13 = this.mImageViewStartHeight / this.mScreenHeight;
            setPivotX(0.0f);
            setPivotY(0.0f);
            setScaleX(f12);
            setScaleY(f13);
            setTranslationX(this.mImageViewStartLeftMargin);
            setTranslationY(this.mImageViewStartTopMargin);
            float t = getMaskHandler().t();
            float u = getMaskHandler().u();
            float o = getMaskHandler().o();
            if (getMaskHandler().H()) {
                bindItemCardMainView(this.mParentFrameLayout);
            }
            addAnimAllListenerAndStartAnim(ofFloat, new e(l.n(this.mNewDetailMaskFrameLayoutContext).D(), o, z, u, t, f10, f11, f9, f8, f12, f13), new f(z));
        }
    }

    private static BitmapBinder tryConvertBitmapBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("8cb3e647", new Object[]{iBinder});
        }
        if (iBinder instanceof BitmapBinder) {
            return (BitmapBinder) iBinder;
        }
        return null;
    }

    public boolean animItemIsRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb108cdc", new Object[]{this})).booleanValue();
        }
        if (this.val_animItemIsRunning == -1) {
            Intent intent = this.mActivity.getIntent();
            if (intent == null || !intent.getBooleanExtra(bx0.PARAMS_KEY_ANIM_ITEM_IS_RUNNING, false)) {
                this.val_animItemIsRunning = 0;
            } else {
                this.val_animItemIsRunning = 1;
            }
        }
        if (this.val_animItemIsRunning == 1) {
            return true;
        }
        return false;
    }

    public void autoCheckAnimEndStatusForV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7e1ce9", new Object[]{this});
            return;
        }
        ImageView imageView = this.mMainViewHolderIv;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void bindItemCardMainView(View view) {
        Drawable a2;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3142ed", new Object[]{this, view});
        } else if (this.mNewDetailMaskFrameLayoutContext.s() && view != null && (a2 = g.a(view.getContext())) != null) {
            if (view instanceof ImageView) {
                imageView = (ImageView) view;
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
                layoutParams.gravity = 51;
                layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
                layoutParams.topMargin = (int) this.mImageViewScreenStartY;
                ImageView imageView2 = new ImageView(view.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                float floatExtra = this.mActivity.getIntent().getFloatExtra(bx0.PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, -1.0f);
                if (floatExtra > 0.0f) {
                    layoutParams.height = (int) floatExtra;
                    k maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.b(logTag, "anim_main_image_view_height = " + floatExtra);
                }
                imageView2.setLayoutParams(layoutParams);
                imageView = imageView2;
            }
            this.mMainViewHolderIv = imageView;
            imageView.setImageDrawable(a2);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(imageView, 0);
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mIsDestroy = true;
        }
    }

    public BitmapBinder getCurrentFrameBitmapBinder() {
        Intent intent;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("b1c0995c", new Object[]{this});
        }
        Activity activity = this.mActivity;
        if (activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null || !extras.containsKey("anim_item_running_frame")) {
            return null;
        }
        return tryConvertBitmapBinder(extras.getBinder("anim_item_running_frame"));
    }

    public Handler getMainHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    public l getNewDetailMaskFrameLayoutContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("fd3645c9", new Object[]{this});
        }
        return this.mNewDetailMaskFrameLayoutContext;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        tryConvertActivityFromTranslucent();
        super.onDetachedFromWindow();
        this.mDetachedFromWindow = true;
    }

    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            tryConvertActivityFromTranslucent();
        }
    }

    public boolean prepareActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bbe66c1", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (context instanceof Activity) {
            return prepareActivity((Activity) context);
        }
        return false;
    }

    public void setMaskFrameLayoutHandler(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82876291", new Object[]{this, kVar});
            return;
        }
        k.a(kVar, this);
        l.o(this.mNewDetailMaskFrameLayoutContext, kVar);
    }

    public void setParentFrameLayout(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84474b35", new Object[]{this, frameLayout});
        } else {
            this.mParentFrameLayout = frameLayout;
        }
    }

    public boolean supportFullAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a2dd8b", new Object[]{this})).booleanValue();
        }
        Intent intent = this.mActivity.getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("anim_item_support_full_alpha", false);
    }

    public void tryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc0ac2f", new Object[]{this});
        } else if (!this.mHasConvertActivityFromTranslucent && this.mHasConvertActivityToTranslucent) {
            nz0.a((Activity) getContext());
            this.mHasConvertActivityFromTranslucent = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Animation.AnimationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        }

        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                onAnimationEnd(animator);
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
                return;
            }
            try {
                if (l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).K()) {
                    NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                }
            } catch (Throwable th) {
                l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "动画开始时，场景冻结出错。", th);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            try {
            } catch (Throwable th) {
                l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "新转场完成后，主页面恢复失败。", th);
            }
            if (!NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                l.c(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                    NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                }
                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                    float alpha = NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).getAlpha();
                    if (alpha > 0.001f) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, 0.0f);
                        alphaAnimation.setFillAfter(true);
                        alphaAnimation.setDuration(500L);
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setAnimationListener(new a());
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).startAnimation(alphaAnimation);
                    } else {
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                    }
                } else {
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                }
                try {
                    NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                    NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                } catch (Throwable th2) {
                    l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(l.n(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m(), "新转场完成后，主视图恢复出错。", th2);
                }
                NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
            }
        }
    }

    private void setCurrentBottomBarColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c83c79", new Object[]{this});
            return;
        }
        try {
            this.mHasSetBottomBarColor = true;
            if (l.n(this.mNewDetailMaskFrameLayoutContext).G()) {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor, true);
            } else {
                Activity activity = this.mActivity;
                int i2 = this.mCurrentPageBottomBarColor;
                if (i2 < 0) {
                    i2 = -16777216;
                }
                setBottomBarColor(activity, i2, l.n(this.mNewDetailMaskFrameLayoutContext).G());
            }
        } catch (Throwable th) {
            l.n(this.mNewDetailMaskFrameLayoutContext).c(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "未知异常。 BottomBarColor 处理失败。Current 。", th);
        }
    }

    public static boolean checkHasMaskFrameAnimParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f304b", new Object[]{bundle})).booleanValue();
        }
        return bundle != null && bundle.containsKey("view_screen_start_x") && bundle.containsKey("view_screen_start_y") && bundle.getFloat("view_height", -1.0f) > 0.0f && bundle.getFloat("view_width", -1.0f) > 0.0f;
    }

    private boolean createScaleImageView() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a38d0c1d", new Object[]{this})).booleanValue();
        }
        if (!(this.mActivity == null || this.mContext == null || this.mParentFrameLayout == null)) {
            this.mScaleImageView = new ImageView(this.mContext);
            Intent intent = this.mActivity.getIntent();
            Bundle bundleExtra = intent.getBundleExtra("nav_animation_extra");
            this.mActivityBundle = bundleExtra;
            if (bundleExtra == null) {
                l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "createScaleImageView bundle is null.");
                return false;
            }
            this.mImageViewScreenStartX = bundleExtra.getFloat("view_screen_start_x", -1.0f);
            this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
            this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
            this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
            if (supportFullAlpha()) {
                float cardMainImageViewHeight = getCardMainImageViewHeight(intent);
                if (cardMainImageViewHeight > 0.0f) {
                    this.mImageViewStartHeight = cardMainImageViewHeight;
                }
                if (this.mScreenWidth <= 0) {
                    initScreenSize();
                }
                float f2 = (this.mImageViewStartWidth * this.mScreenHeight) / this.mScreenWidth;
                this.mImageViewScreenStartY += (f2 - this.mImageViewStartHeight) / 2.0f;
                this.mImageViewStartHeight = f2;
            }
            if (this.mImageViewStartHeight <= 0.0f || this.mImageViewStartWidth <= 0.0f) {
                l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
                layoutParams.gravity = 51;
                int i2 = (int) this.mImageViewScreenStartX;
                layoutParams.leftMargin = i2;
                int i3 = (int) this.mImageViewScreenStartY;
                layoutParams.topMargin = i3;
                this.mImageViewStartLeftMargin = i2;
                this.mImageViewStartTopMargin = i3;
                this.mParentFrameLayout.addView(this.mScaleImageView, layoutParams);
                if (animItemIsRunning()) {
                    BitmapBinder currentFrameBitmapBinder = getCurrentFrameBitmapBinder();
                    if (currentFrameBitmapBinder == null) {
                        Drawable a2 = g.a(this.mActivity);
                        if (a2 != null) {
                            l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "startProcessAnim ,animItemIsRunning sourceDrawable is not null");
                            this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.mScaleImageView.setImageDrawable(a2);
                            return true;
                        }
                    } else {
                        Bitmap bitmap2 = currentFrameBitmapBinder.getBitmap();
                        if (bitmap2 == null) {
                            Drawable drawable = currentFrameBitmapBinder.getDrawable();
                            if (drawable != null) {
                                l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "startProcessAnim ,animItemIsRunning currentFrameBinder drawable is not null");
                                this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                this.mScaleImageView.setImageDrawable(drawable);
                                return true;
                            }
                        } else {
                            l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "startProcessAnim ,animItemIsRunning currentFrameBinder bitmap is not null");
                            this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.mScaleImageView.setImageBitmap(bitmap2);
                            return true;
                        }
                    }
                }
                IBinder binder = this.mActivityBundle.getBinder("view_screenshot");
                if ((binder instanceof BitmapBinder) && (bitmap = ((BitmapBinder) binder).getBitmap()) != null) {
                    l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "startProcessAnim bitmap is not null");
                    this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.mScaleImageView.setImageBitmap(bitmap);
                }
                return true;
            }
        }
        return false;
    }

    private boolean initBasicScaleViewData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a000ea06", new Object[]{this})).booleanValue();
        }
        Activity activity = this.mActivity;
        if (!(activity == null || this.mContext == null || this.mParentFrameLayout == null)) {
            Intent intent = activity.getIntent();
            Bundle bundleExtra = intent.getBundleExtra("nav_animation_extra");
            this.mActivityBundle = bundleExtra;
            if (bundleExtra == null) {
                l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "createScaleImageView bundle is null.");
                return false;
            }
            this.mImageViewScreenStartX = bundleExtra.getFloat("view_screen_start_x", -1.0f);
            this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
            this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
            this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
            float cardMainImageViewHeight = getCardMainImageViewHeight(intent);
            if (cardMainImageViewHeight > 0.0f) {
                this.mImageViewStartHeight = cardMainImageViewHeight;
            }
            if (supportFullAlpha()) {
                if (this.mScreenWidth <= 0) {
                    initScreenSize();
                }
                float f2 = (this.mImageViewStartWidth * this.mScreenHeight) / this.mScreenWidth;
                this.mImageViewScreenStartY -= (f2 - this.mImageViewStartHeight) / 2.0f;
                this.mImageViewStartHeight = f2;
            }
            if (this.mImageViewStartHeight <= 0.0f || this.mImageViewStartWidth <= 0.0f) {
                l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            } else {
                this.mImageViewStartLeftMargin = (int) this.mImageViewScreenStartX;
                this.mImageViewStartTopMargin = (int) this.mImageViewScreenStartY;
                return true;
            }
        }
        return false;
    }

    public boolean initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579f8f4c", new Object[]{this})).booleanValue();
        }
        if (!l.n(this.mNewDetailMaskFrameLayoutContext).d()) {
            return false;
        }
        initActivityAndAlpha();
        if (this.mContext == null) {
            return false;
        }
        initScreenSize();
        if (this.mScreenWidth <= 0 || this.mScreenHeight <= 0) {
            k maskHandler = getMaskHandler();
            String logTag = getLogTag();
            maskHandler.b(logTag, "initAnim error, initScreenSize error . mScreenWidth = " + this.mScreenWidth + " mScreenHeight = " + this.mScreenHeight);
            return false;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            l.n(this.mNewDetailMaskFrameLayoutContext).b(l.n(this.mNewDetailMaskFrameLayoutContext).m(), "initAnim 出错。mActivity 为空。");
            checkAndTryProcessDelayTask();
            return false;
        } else if (!nz0.b(activity)) {
            checkAndTryProcessDelayTask();
            return false;
        } else {
            int deviceScore = getDeviceScore();
            this.mDeviceScore = deviceScore;
            this.mHasConvertActivityToTranslucent = true;
            int i2 = ((100 - this.mDeviceScore) * (deviceScore > l.n(this.mNewDetailMaskFrameLayoutContext).n() ? 20 : 40)) + 800;
            this.mHandler.postDelayed(new a(i2), i2);
            l.c(this.mNewDetailMaskFrameLayoutContext, true);
            createMaskView();
            if (getMaskHandler().J()) {
                if (!createScaleImageView()) {
                    checkAndTryProcessDelayTask();
                    return false;
                }
            } else if (!initBasicScaleViewData()) {
                checkAndTryProcessDelayTask();
                return false;
            }
            if (getMaskHandler().I()) {
                getMaskHandler().b(getLogTag(), "supportItemWhiteHolderView,will createItemWhiteHolderView.");
                createItemWhiteHolderView();
            }
            setAlpha(0.001f);
            initScreenSize();
            if (isV1Version()) {
                startFrameLayoutAnim();
            } else {
                initTargetSizeForV2();
                startFrameLayoutAnimV2();
            }
            saveCurrentBottomBarColor(this.mActivity);
            setBottomBarColorAsPrePage(this.mActivity);
            return true;
        }
    }

    public boolean prepareActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c3c8253", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(0, 0);
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13329a;
        public int b;
        public ValueAnimator.AnimatorUpdateListener c;
        public ValueAnimator d;
        public Animator.AnimatorListener e;
        public int f;
        public ValueAnimator g;
        public float h;
        public long i;
        public long j;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a extends ValueAnimator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/ui/view/NewDetailMaskFrameLayout$CustomVerticalSyncAnimation$1");
            }

            @Override // android.animation.ValueAnimator
            public Object getAnimatedValue() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("e009a6b3", new Object[]{this});
                }
                return Float.valueOf(h.k(h.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Choreographer f13331a;

            public b(Choreographer choreographer) {
                this.f13331a = choreographer;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else if (h.m(h.this) > h.i(h.this)) {
                    h.l(h.this, 1.0f);
                    h.a(h.this).onAnimationUpdate(h.o(h.this));
                    h.e(h.this).onAnimationEnd(h.c(h.this));
                } else {
                    h.q(h.this, System.currentTimeMillis());
                    if (h.p(h.this) - h.r(h.this) < h.g(h.this)) {
                        this.f13331a.postFrameCallback(this);
                        return;
                    }
                    h hVar = h.this;
                    h.s(hVar, h.p(hVar));
                    h hVar2 = h.this;
                    h.l(hVar2, h.m(hVar2) / h.i(h.this));
                    h.a(h.this).onAnimationUpdate(h.o(h.this));
                    this.f13331a.postFrameCallback(this);
                    h.n(h.this);
                }
            }
        }

        static {
            t2o.a(779093561);
        }

        public h() {
            this.f13329a = 12;
            this.b = 1;
            this.i = 0L;
            this.j = 0L;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("ab5476cf", new Object[]{hVar});
            }
            return hVar.c;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener b(h hVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("8c9d7e1d", new Object[]{hVar, animatorUpdateListener});
            }
            hVar.c = animatorUpdateListener;
            return animatorUpdateListener;
        }

        public static /* synthetic */ ValueAnimator c(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("7cb345e", new Object[]{hVar});
            }
            return hVar.d;
        }

        public static /* synthetic */ ValueAnimator d(h hVar, ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("4b352060", new Object[]{hVar, valueAnimator});
            }
            hVar.d = valueAnimator;
            return valueAnimator;
        }

        public static /* synthetic */ Animator.AnimatorListener e(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator.AnimatorListener) ipChange.ipc$dispatch("ed0aba88", new Object[]{hVar});
            }
            return hVar.e;
        }

        public static /* synthetic */ Animator.AnimatorListener f(h hVar, Animator.AnimatorListener animatorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator.AnimatorListener) ipChange.ipc$dispatch("1d1163f6", new Object[]{hVar, animatorListener});
            }
            hVar.e = animatorListener;
            return animatorListener;
        }

        public static /* synthetic */ int g(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("717840f6", new Object[]{hVar})).intValue();
            }
            return hVar.f;
        }

        public static /* synthetic */ int h(h hVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9a9e74d5", new Object[]{hVar, new Integer(i)})).intValue();
            }
            hVar.f = i;
            return i;
        }

        public static /* synthetic */ int i(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3d357d5", new Object[]{hVar})).intValue();
            }
            return hVar.f13329a;
        }

        public static /* synthetic */ int j(h hVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("83a639d6", new Object[]{hVar, new Integer(i)})).intValue();
            }
            hVar.f13329a = i;
            return i;
        }

        public static /* synthetic */ float k(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("98898590", new Object[]{hVar})).floatValue();
            }
            return hVar.h;
        }

        public static /* synthetic */ float l(h hVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("55b5b892", new Object[]{hVar, new Float(f)})).floatValue();
            }
            hVar.h = f;
            return f;
        }

        public static /* synthetic */ int m(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fae49c72", new Object[]{hVar})).intValue();
            }
            return hVar.b;
        }

        public static /* synthetic */ int n(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("27eeb16a", new Object[]{hVar})).intValue();
            }
            int i = hVar.b;
            hVar.b = 1 + i;
            return i;
        }

        public static /* synthetic */ ValueAnimator o(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("780724c2", new Object[]{hVar});
            }
            return hVar.g;
        }

        public static /* synthetic */ long p(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf9aca31", new Object[]{hVar})).longValue();
            }
            return hVar.j;
        }

        public static /* synthetic */ long q(h hVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("10cd169d", new Object[]{hVar, new Long(j)})).longValue();
            }
            hVar.j = j;
            return j;
        }

        public static /* synthetic */ long r(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("21f5e110", new Object[]{hVar})).longValue();
            }
            return hVar.i;
        }

        public static /* synthetic */ long s(h hVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9d4db9e", new Object[]{hVar, new Long(j)})).longValue();
            }
            hVar.i = j;
            return j;
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("579958cd", new Object[]{this})).booleanValue();
            }
            if (this.c == null || this.d == null || this.e == null) {
                return false;
            }
            this.g = new a();
            b bVar = new b(Choreographer.getInstance());
            this.e.onAnimationStart(this.d);
            bVar.doFrame(0L);
            return true;
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }
}
