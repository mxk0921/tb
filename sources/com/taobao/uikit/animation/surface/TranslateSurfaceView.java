package com.taobao.uikit.animation.surface;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.animation.animator.AnimatorParams;
import com.taobao.uikit.animation.animator.ValueAnimatorExtend;
import com.taobao.uikit.animation.api.AnimationStageListener;
import com.taobao.uikit.animation.api.PixelCopyListener;
import com.taobao.uikit.animation.api.PlaceHolderProvider;
import com.taobao.uikit.animation.model.AnimationErrorInfo;
import com.taobao.uikit.animation.surface.BaseSurfaceView;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TranslateSurfaceView extends BaseSurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_START_X_PERCENT = 0.6f;
    public static final String TAG = "uikit_animation.TranslateSurfaceView";
    private Rect mAnimationRect;
    private AnimationStageListener mAnimationStageListener;
    private ValueAnimator mAnimator;
    private AnimatorParams mAnimatorParams;
    private Bitmap mBackground;
    private View mBackgroundView;
    private Window mBackgroundWindow;
    private View mCloneView;
    private Bitmap mContent;
    private final AnimationStageListener mDefaultAnimationStageListener;
    private int mMoveX;
    private PlaceHolderProvider mPlaceHolderProvider;
    private Bitmap mPreloadedBackground;
    private Bitmap mPreloadedContent;
    private float mAnimationValue = -2.0f;
    private final Paint mPaint = new Paint();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final Runnable mWatchDog = new Runnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TranslateSurfaceView.access$000(TranslateSurfaceView.this) == -1.0f || TranslateSurfaceView.access$000(TranslateSurfaceView.this) == -2.0f || TranslateSurfaceView.access$000(TranslateSurfaceView.this) == 0.0f) {
                AnimationStageListener access$100 = TranslateSurfaceView.access$100(TranslateSurfaceView.this);
                access$100.onError(new AnimationErrorInfo(3, "mAnimationValue: " + TranslateSurfaceView.access$000(TranslateSurfaceView.this)));
                TranslateSurfaceView.access$002(TranslateSurfaceView.this, 1.0f);
                TranslateSurfaceView.access$202(TranslateSurfaceView.this, true);
                TranslateSurfaceView.this.onFrameDrawFinish();
                TLog.loge(TranslateSurfaceView.TAG, "watchDog: animation didn't start, draw finish");
            }
        }
    };
    private boolean mIsCloneViewFirstFrameDrawn = false;
    private boolean mIsAnimationFirstFrameDrawn = false;
    private long mAnimatorStartUptime = -2;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.animation.surface.TranslateSurfaceView$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TranslateSurfaceView translateSurfaceView = TranslateSurfaceView.this;
            translateSurfaceView.screenshotOnWindow(TranslateSurfaceView.access$300(translateSurfaceView), TranslateSurfaceView.access$400(TranslateSurfaceView.this), new PixelCopyListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.animation.api.PixelCopyListener
                public void onPixelCopyFinished(int i, Bitmap bitmap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("72755660", new Object[]{this, new Integer(i), bitmap});
                    } else if (i != 0) {
                        TLog.loge(TranslateSurfaceView.TAG, "setBackgroundView: copyResult: " + i);
                        AnimationStageListener access$100 = TranslateSurfaceView.access$100(TranslateSurfaceView.this);
                        access$100.onError(new AnimationErrorInfo(2, "copyResult: " + i));
                    } else if (TranslateSurfaceView.access$000(TranslateSurfaceView.this) == -1.0f || TranslateSurfaceView.access$000(TranslateSurfaceView.this) == -2.0f) {
                        TranslateSurfaceView.access$502(TranslateSurfaceView.this, bitmap);
                        TranslateSurfaceView.this.drawOneFrameAsync(new BaseSurfaceView.OneFrameRunnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.3.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(C07891 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/animation/surface/TranslateSurfaceView$3$1$1");
                            }

                            @Override // com.taobao.uikit.animation.surface.BaseSurfaceView.OneFrameRunnable
                            public void onFrameDraw(Canvas canvas) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5747a6cc", new Object[]{this, canvas});
                                    return;
                                }
                                canvas.drawBitmap(TranslateSurfaceView.access$500(TranslateSurfaceView.this), 0.0f, 0.0f, TranslateSurfaceView.access$600(TranslateSurfaceView.this));
                                TLog.loge(TranslateSurfaceView.TAG, "setBackgroundView: draw background");
                                TranslateSurfaceView.access$100(TranslateSurfaceView.this).onBackgroundDraw();
                            }
                        });
                    } else {
                        TLog.loge(TranslateSurfaceView.TAG, "setBackgroundView: draw background failed. mAnimationValue: " + TranslateSurfaceView.access$000(TranslateSurfaceView.this));
                        AnimationStageListener access$1002 = TranslateSurfaceView.access$100(TranslateSurfaceView.this);
                        access$1002.onError(new AnimationErrorInfo(2, "mAnimationValue: " + ((int) TranslateSurfaceView.access$000(TranslateSurfaceView.this))));
                    }
                }
            });
        }
    }

    static {
        t2o.a(929038351);
    }

    public TranslateSurfaceView(Context context) {
        super(context);
        AnimationStageListener animationStageListener = new AnimationStageListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onBackgroundDraw() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("463cb58", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onBackgroundDraw: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onCreate() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onCreate: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onDestroy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6532022", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onDestroy: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onError(AnimationErrorInfo animationErrorInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("caae67ae", new Object[]{this, animationErrorInfo});
                    return;
                }
                TLog.loge(TranslateSurfaceView.TAG, "onError: " + animationErrorInfo);
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onFirstFrame() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onFirstFrame: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onStart: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onEnd: ");
                }
            }
        };
        this.mDefaultAnimationStageListener = animationStageListener;
        this.mAnimationStageListener = animationStageListener;
    }

    public static /* synthetic */ float access$000(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a31929", new Object[]{translateSurfaceView})).floatValue();
        }
        return translateSurfaceView.mAnimationValue;
    }

    public static /* synthetic */ float access$002(TranslateSurfaceView translateSurfaceView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54df7e19", new Object[]{translateSurfaceView, new Float(f)})).floatValue();
        }
        translateSurfaceView.mAnimationValue = f;
        return f;
    }

    public static /* synthetic */ AnimationStageListener access$100(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationStageListener) ipChange.ipc$dispatch("bd182e1b", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mAnimationStageListener;
    }

    public static /* synthetic */ Bitmap access$1000(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6e12bbc8", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mContent;
    }

    public static /* synthetic */ Bitmap access$1002(TranslateSurfaceView translateSurfaceView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f7de89e4", new Object[]{translateSurfaceView, bitmap});
        }
        translateSurfaceView.mContent = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$1100(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85f0ec9", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.ensureMoveXValid();
        }
    }

    public static /* synthetic */ void access$1200(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c012a8", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.ensureAnimatorValid();
        }
    }

    public static /* synthetic */ void access$1300(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5211687", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.loadFirstContentAndStartAnimator();
        }
    }

    public static /* synthetic */ void access$1400(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23821a66", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.listenMainThreadFirstFrame();
        }
    }

    public static /* synthetic */ View access$1500(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1e028f47", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mCloneView;
    }

    public static /* synthetic */ void access$1600(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20442224", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.startAnimator();
        }
    }

    public static /* synthetic */ void access$1700(TranslateSurfaceView translateSurfaceView, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5624cc2", new Object[]{translateSurfaceView, canvas});
        } else {
            translateSurfaceView.clearCanvas(canvas);
        }
    }

    public static /* synthetic */ void access$1800(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0629e2", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.resetParams();
        }
    }

    public static /* synthetic */ boolean access$202(TranslateSurfaceView translateSurfaceView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f05eb943", new Object[]{translateSurfaceView, new Boolean(z)})).booleanValue();
        }
        translateSurfaceView.mIsCloneViewFirstFrameDrawn = z;
        return z;
    }

    public static /* synthetic */ Window access$300(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("5c02b2d", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mBackgroundWindow;
    }

    public static /* synthetic */ Bitmap access$400(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4441e893", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mBackground;
    }

    public static /* synthetic */ Bitmap access$500(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a69cff72", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mPreloadedBackground;
    }

    public static /* synthetic */ Bitmap access$502(TranslateSurfaceView translateSurfaceView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a9a6d97a", new Object[]{translateSurfaceView, bitmap});
        }
        translateSurfaceView.mPreloadedBackground = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Paint access$600(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("f6aff198", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mPaint;
    }

    public static /* synthetic */ void access$700(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4a3452", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.preloadPlaceHolder();
        }
    }

    public static /* synthetic */ Handler access$800(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fa277ef5", new Object[]{translateSurfaceView});
        }
        return translateSurfaceView.mMainHandler;
    }

    public static /* synthetic */ void access$900(TranslateSurfaceView translateSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80c3c10", new Object[]{translateSurfaceView});
        } else {
            translateSurfaceView.addWatchDog();
        }
    }

    private void addWatchDog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85868b35", new Object[]{this});
            return;
        }
        removeWatchDog();
        this.mRenderHandler.postDelayed(this.mWatchDog, 1000L);
        TLog.loge(TAG, "addWatchDog: add watch dog");
    }

    private void clearCanvas(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d251bad9", new Object[]{this, canvas});
            return;
        }
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPaint(this.mPaint);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void ensureAnimatorValid() {
        long j;
        TimeInterpolator timeInterpolator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9394e6be", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            valueAnimator = ValueAnimatorExtend.getDefaultAnimator();
        }
        AnimatorParams animatorParams = this.mAnimatorParams;
        if (animatorParams == null) {
            this.mAnimator = valueAnimator;
            return;
        }
        valueAnimator.setFloatValues(0.0f, 1.0f);
        if (animatorParams.getDuration() == -1) {
            j = valueAnimator.getDuration();
        } else {
            j = animatorParams.getDuration();
        }
        valueAnimator.setDuration(j);
        if (animatorParams.getInterpolator() == null) {
            timeInterpolator = valueAnimator.getInterpolator();
        } else {
            timeInterpolator = animatorParams.getInterpolator();
        }
        valueAnimator.setInterpolator(timeInterpolator);
        this.mAnimator = valueAnimator;
    }

    private void ensureMoveXValid() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d5477a", new Object[]{this});
            return;
        }
        int defaultWidth = getDefaultWidth();
        this.mMoveX = defaultWidth;
        AnimatorParams animatorParams = this.mAnimatorParams;
        float f2 = defaultWidth;
        if (animatorParams == null) {
            f = 0.6f;
        } else {
            f = animatorParams.getFromXPercent();
        }
        this.mMoveX = (int) (f2 * f);
    }

    public static /* synthetic */ Object ipc$super(TranslateSurfaceView translateSurfaceView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2063758590) {
            super.surfaceCreated((SurfaceHolder) objArr[0]);
            return null;
        } else if (hashCode == -1481161357) {
            super.surfaceDestroyed((SurfaceHolder) objArr[0]);
            return null;
        } else if (hashCode == 267248023) {
            super.init();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/animation/surface/TranslateSurfaceView");
        }
    }

    private void listenMainThreadFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143bb38e", new Object[]{this});
        } else {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                        return;
                    }
                    TLog.loge(TranslateSurfaceView.TAG, "main thread first frame callback: ");
                    TranslateSurfaceView.access$800(TranslateSurfaceView.this).post(new Runnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TranslateSurfaceView.access$202(TranslateSurfaceView.this, true);
                            TLog.loge(TranslateSurfaceView.TAG, "listenMainThreadFirstFrame: main thread first frame get");
                            TranslateSurfaceView.this.onFrameDrawFinish();
                        }
                    });
                }
            });
        }
    }

    private void removeWatchDog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b84e98", new Object[]{this});
        } else {
            this.mRenderHandler.removeCallbacks(this.mWatchDog);
        }
    }

    private void resetParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58972dbc", new Object[]{this});
            return;
        }
        this.mBackgroundView = null;
        this.mBackgroundWindow = null;
        this.mContent = null;
        this.mBackground = null;
        this.mPreloadedBackground = null;
        this.mPreloadedContent = null;
        this.mCloneView = null;
        this.mPlaceHolderProvider = null;
        this.mIsCloneViewFirstFrameDrawn = false;
        this.mAnimator = null;
        this.mAnimatorStartUptime = -2L;
        this.mIsAnimationFirstFrameDrawn = false;
    }

    private void resizeContent() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb66a72c", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.mContent;
        if (bitmap != null) {
            Rect rect = this.mAnimationRect;
            if (rect == null) {
                i = getDefaultWidth();
            } else {
                i = rect.width();
            }
            Rect rect2 = this.mAnimationRect;
            if (rect2 == null) {
                i2 = getDefaultHeight();
            } else {
                i2 = rect2.height();
            }
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                this.mContent = Bitmap.createScaledBitmap(bitmap, i, i2, false);
            }
        }
    }

    private void startAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ba7970", new Object[]{this});
        } else if (this.mAnimator != null) {
            this.mAnimatorStartUptime = SystemClock.uptimeMillis();
        }
    }

    private void updateAnimatedValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108a54c", new Object[]{this});
        } else if (this.mAnimatorStartUptime == -2) {
            this.mAnimationValue = 1.0f;
        } else {
            this.mAnimator.setCurrentPlayTime(SystemClock.uptimeMillis() - this.mAnimatorStartUptime);
            this.mAnimationValue = ((Float) this.mAnimator.getAnimatedValue()).floatValue();
        }
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public int getDefaultWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10a88975", new Object[]{this})).intValue();
        }
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        setRenderFramePerSecond(120);
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public void onFrameDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5747a6cc", new Object[]{this, canvas});
            return;
        }
        updateAnimatedValue();
        Bitmap bitmap = this.mContent;
        if (bitmap != null && this.mBackground != null) {
            clearCanvas(canvas);
            int i = this.mMoveX;
            float f = this.mAnimationValue;
            int i2 = (int) (i * (-1) * f);
            int i3 = (int) (i * (1.0f - f));
            canvas.drawBitmap(this.mBackground, i2, 0.0f, this.mPaint);
            canvas.drawBitmap(this.mContent, i3, 0.0f, this.mPaint);
            TLog.loge(TAG, "onFrameDraw: " + this.mAnimationValue + " background dx: " + i2 + " foreground dx: " + i3);
        } else if (bitmap == null) {
            this.mAnimator.cancel();
            this.mAnimationValue = 1.0f;
            TLog.loge(TAG, "onFrameDraw: mContent is null, cancel animation.");
        }
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public void onFrameDrawFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b71e6c", new Object[]{this});
            return;
        }
        if (!this.mIsAnimationFirstFrameDrawn) {
            this.mAnimationStageListener.onFirstFrame();
            this.mIsAnimationFirstFrameDrawn = true;
        }
        if (this.mAnimationValue >= 1.0f) {
            if (this.mIsCloneViewFirstFrameDrawn) {
                removeWatchDog();
                drawOneFrameSync(new BaseSurfaceView.OneFrameRunnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/animation/surface/TranslateSurfaceView$8");
                    }

                    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView.OneFrameRunnable
                    public void onFrameDraw(Canvas canvas) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5747a6cc", new Object[]{this, canvas});
                            return;
                        }
                        TranslateSurfaceView.access$1700(TranslateSurfaceView.this, canvas);
                        TLog.loge(TranslateSurfaceView.TAG, "onFrameDrawFinish: clearCanvas");
                        TranslateSurfaceView.access$1800(TranslateSurfaceView.this);
                        TranslateSurfaceView.access$100(TranslateSurfaceView.this).onStop();
                    }
                });
            }
            this.mAnimationValue = 2.0f;
        }
    }

    public Bitmap screenshotOnView(View view, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("be9fe5ab", new Object[]{this, view, bitmap});
        }
        if (view == null) {
            return bitmap;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            view.draw(new Canvas(createBitmap));
        } catch (Exception unused) {
            createBitmap = null;
        }
        if (createBitmap == null) {
            return bitmap;
        }
        return createBitmap;
    }

    public void setAnimationRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af56a02c", new Object[]{this, rect});
        } else if (rect != null) {
            this.mAnimationRect = rect;
        }
    }

    public void setAnimationStageListener(AnimationStageListener animationStageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff977bc", new Object[]{this, animationStageListener});
        } else if (animationStageListener == null) {
            this.mAnimationStageListener = this.mDefaultAnimationStageListener;
        } else {
            this.mAnimationStageListener = animationStageListener;
            TLog.loge(TAG, "setAnimationStageListener: " + animationStageListener);
        }
    }

    public void setAnimator(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaff4c4", new Object[]{this, valueAnimator});
        } else if (valueAnimator != null) {
            ValueAnimator valueAnimator2 = this.mAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.mAnimator = valueAnimator;
        }
    }

    public void setAnimatorParams(AnimatorParams animatorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73e05db", new Object[]{this, animatorParams});
        } else if (animatorParams == null) {
            TLog.loge(TAG, "setAnimatorParams: animatorParams is null");
        } else if (!animatorParams.isValid()) {
            TLog.loge(TAG, "setAnimatorParams: animatorParams is not valid");
        } else {
            this.mAnimatorParams = animatorParams;
        }
    }

    public void setBackgroundView(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc7396b", new Object[]{this, window});
        } else if (window == null) {
            TLog.loge(TAG, "setBackgroundView: phoneWindow is null");
        } else {
            float f = this.mAnimationValue;
            if (f < 0.0f || f > 1.0f) {
                this.mBackgroundWindow = window;
                this.mBackgroundView = window.getDecorView();
                this.mAnimationValue = -2.0f;
                addWatchDog();
                Coordinator.execute(new AnonymousClass3());
                Coordinator.execute(new Runnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TranslateSurfaceView.access$700(TranslateSurfaceView.this);
                        TLog.loge(TranslateSurfaceView.TAG, "setBackgroundView: preload placeHolder at draw background");
                    }
                });
                return;
            }
            TLog.loge(TAG, "startAnimation: animation already started");
        }
    }

    public void setCloneView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b8ad8b", new Object[]{this, view});
        } else {
            this.mCloneView = view;
        }
    }

    public void setIsKeyEventBlockerOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee5e331", new Object[]{this, new Boolean(z)});
        }
    }

    public void setPlaceHolderProvider(PlaceHolderProvider placeHolderProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8279b4", new Object[]{this, placeHolderProvider});
        } else {
            this.mPlaceHolderProvider = placeHolderProvider;
        }
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView
    public boolean shouldRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ece9b934", new Object[]{this})).booleanValue();
        }
        if (this.mAnimationValue <= 1.0f) {
            return true;
        }
        return false;
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        float f = this.mAnimationValue;
        if (f < 0.0f || f > 1.0f) {
            TLog.loge(TAG, "startAnimation: ");
            this.mRenderHandler.post(new Runnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TranslateSurfaceView.access$100(TranslateSurfaceView.this).onStart();
                    TranslateSurfaceView.access$900(TranslateSurfaceView.this);
                    TranslateSurfaceView.access$002(TranslateSurfaceView.this, -1.0f);
                    TranslateSurfaceView.access$1002(TranslateSurfaceView.this, null);
                    TranslateSurfaceView.access$202(TranslateSurfaceView.this, false);
                    TranslateSurfaceView.access$1100(TranslateSurfaceView.this);
                    TranslateSurfaceView.access$1200(TranslateSurfaceView.this);
                    TranslateSurfaceView.access$1300(TranslateSurfaceView.this);
                    TranslateSurfaceView.access$1400(TranslateSurfaceView.this);
                }
            });
            return;
        }
        TLog.loge(TAG, "startAnimation: animation already started");
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        super.surfaceCreated(surfaceHolder);
        this.mAnimationStageListener.onCreate();
    }

    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        super.surfaceDestroyed(surfaceHolder);
        this.mAnimationStageListener.onDestroy();
    }

    private Bitmap getPlaceHolderSafety() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("61fddb74", new Object[]{this});
        }
        try {
            PlaceHolderProvider placeHolderProvider = this.mPlaceHolderProvider;
            if (placeHolderProvider == null) {
                TLog.loge(TAG, "getPlaceHolderSafety: mPlaceHolderProvider is null");
                return null;
            }
            placeHolderProvider.getClass().getName();
            return this.mPlaceHolderProvider.onProvidePlaceHolder();
        } catch (Throwable th) {
            TLog.loge(TAG, "getPlaceHolderSafety: " + th.getMessage());
            this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "get place holder error: ".concat("UNKNOWN")));
            return null;
        }
    }

    private void loadFirstContentAndStartAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62852a8", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.mPreloadedBackground;
        if (bitmap != null) {
            this.mBackground = bitmap;
        } else {
            this.mBackground = screenshotOnView(this.mBackgroundView, this.mBackground);
        }
        if (this.mPreloadedContent != null) {
            TLog.loge(TAG, "loadFirstContentAndStartAnimator: content preloaded, use it");
            this.mContent = this.mPreloadedContent;
            resizeContent();
            startAnimator();
            drawFirstFrame();
            this.mPreloadedContent = null;
            return;
        }
        if (this.mPlaceHolderProvider != null) {
            TLog.loge(TAG, "loadFirstContentAndStartAnimator: providerPlaceHolder at updateBitmap");
            Bitmap placeHolderSafety = getPlaceHolderSafety();
            if (placeHolderSafety != null) {
                this.mContent = placeHolderSafety;
                resizeContent();
                startAnimator();
                drawFirstFrame();
                return;
            }
        }
        this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "downgrade to sync screenshot"));
        View view = this.mCloneView;
        if (view == null) {
            this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "mCloneView is null"));
            return;
        }
        try {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver == null) {
                this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "viewTreeObserver is null when add"));
            } else {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                        }
                        TLog.loge(TranslateSurfaceView.TAG, "loadFirstContentAndStartAnimator: onPreDraw: start");
                        TranslateSurfaceView translateSurfaceView = TranslateSurfaceView.this;
                        TranslateSurfaceView.access$1002(translateSurfaceView, translateSurfaceView.screenshotOnView(TranslateSurfaceView.access$1500(translateSurfaceView), TranslateSurfaceView.access$1000(TranslateSurfaceView.this)));
                        TranslateSurfaceView.access$1600(TranslateSurfaceView.this);
                        TranslateSurfaceView.this.drawFirstFrame();
                        TLog.loge(TranslateSurfaceView.TAG, "loadFirstContentAndStartAnimator: onPreDraw: end; drawFirstFrame");
                        viewTreeObserver.removeOnPreDrawListener(this);
                        return true;
                    }
                });
            }
        } catch (Throwable unused) {
            this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "downgrade to sync screenshot failed"));
        }
    }

    private void preloadPlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299f4b51", new Object[]{this});
            return;
        }
        try {
            PlaceHolderProvider placeHolderProvider = this.mPlaceHolderProvider;
            if (placeHolderProvider == null) {
                TLog.loge(TAG, "preloadPlaceHolder: mPlaceHolderProvider is null");
                return;
            }
            placeHolderProvider.getClass().getName();
            this.mPreloadedContent = this.mPlaceHolderProvider.onPreloadPlaceHolder();
        } catch (Throwable th) {
            TLog.loge(TAG, "preloadPlaceHolder: " + th.getMessage());
            this.mAnimationStageListener.onError(new AnimationErrorInfo(1, "preload place holder error: ".concat("UNKNOWN")));
        }
    }

    public void screenshotOnWindow(Window window, final Bitmap bitmap, final PixelCopyListener pixelCopyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb57603", new Object[]{this, window, bitmap, pixelCopyListener});
        } else if (window == null) {
            pixelCopyListener.onPixelCopyFinished(5, bitmap);
        } else {
            View decorView = window.getDecorView();
            final WeakReference weakReference = new WeakReference(decorView);
            if (Build.VERSION.SDK_INT < 26) {
                Coordinator.execute(new Runnable() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        View view = (View) weakReference.get();
                        if (view == null) {
                            pixelCopyListener.onPixelCopyFinished(5, bitmap);
                            return;
                        }
                        Bitmap screenshotOnView = TranslateSurfaceView.this.screenshotOnView(view, null);
                        PixelCopyListener pixelCopyListener2 = pixelCopyListener;
                        if (screenshotOnView == null) {
                            screenshotOnView = bitmap;
                        }
                        pixelCopyListener2.onPixelCopyFinished(0, screenshotOnView);
                    }
                });
                return;
            }
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            if (width <= 0 || height <= 0) {
                pixelCopyListener.onPixelCopyFinished(5, bitmap);
                return;
            }
            final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            try {
                PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public void onPixelCopyFinished(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                        } else {
                            pixelCopyListener.onPixelCopyFinished(i, createBitmap);
                        }
                    }
                }, this.mRenderHandler);
            } catch (Throwable th) {
                TLog.loge(TAG, "screenshotOnWindow: " + th.getMessage());
                pixelCopyListener.onPixelCopyFinished(1, bitmap);
            }
        }
    }

    public TranslateSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnimationStageListener animationStageListener = new AnimationStageListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onBackgroundDraw() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("463cb58", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onBackgroundDraw: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onCreate() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onCreate: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onDestroy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6532022", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onDestroy: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onError(AnimationErrorInfo animationErrorInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("caae67ae", new Object[]{this, animationErrorInfo});
                    return;
                }
                TLog.loge(TranslateSurfaceView.TAG, "onError: " + animationErrorInfo);
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onFirstFrame() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onFirstFrame: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onStart: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onEnd: ");
                }
            }
        };
        this.mDefaultAnimationStageListener = animationStageListener;
        this.mAnimationStageListener = animationStageListener;
    }

    public TranslateSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationStageListener animationStageListener = new AnimationStageListener() { // from class: com.taobao.uikit.animation.surface.TranslateSurfaceView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onBackgroundDraw() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("463cb58", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onBackgroundDraw: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onCreate() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onCreate: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onDestroy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6532022", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onDestroy: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onError(AnimationErrorInfo animationErrorInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("caae67ae", new Object[]{this, animationErrorInfo});
                    return;
                }
                TLog.loge(TranslateSurfaceView.TAG, "onError: " + animationErrorInfo);
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onFirstFrame() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onFirstFrame: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onStart: ");
                }
            }

            @Override // com.taobao.uikit.animation.api.AnimationStageListener
            public void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                } else {
                    TLog.loge(TranslateSurfaceView.TAG, "onEnd: ");
                }
            }
        };
        this.mDefaultAnimationStageListener = animationStageListener;
        this.mAnimationStageListener = animationStageListener;
    }
}
