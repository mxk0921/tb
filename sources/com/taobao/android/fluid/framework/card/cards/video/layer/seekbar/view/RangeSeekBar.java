package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import tb.akt;
import tb.b93;
import tb.ir9;
import tb.itk;
import tb.jxv;
import tb.r8p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RangeSeekBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROGRESS_DARK_DEFAULT_COLOR = "#26FFFFFF";
    private static final String PROGRESS_DEFAULT_COLOR = "#222222";
    public static final int SEEKBAR_MODE_RANGE = 2;
    public static final int SEEKBAR_MODE_SINGLE = 1;
    private static final String TAG = "RangeSeekBar";
    public static final int TICK_MARK_GRAVITY_CENTER = 1;
    public static final int TICK_MARK_GRAVITY_LEFT = 0;
    public static final int TICK_MARK_GRAVITY_RIGHT = 2;
    public static final int TRICK_MARK_MODE_NUMBER = 0;
    public static final int TRICK_MARK_MODE_OTHER = 1;
    private itk callback;
    public SeekBar currTouchSB;
    private boolean enableSmoothSeek;
    private boolean enableThumbOverlap;
    private int gravity;
    private boolean isEnable;
    private final boolean isEnableWeexUponSeekBar;
    public boolean isScaleThumb;
    private boolean isSeekBarSeeking;
    private boolean isTouchEventDragging;
    public SeekBar leftSB;
    private float maxProgress;
    private float minInterval;
    private float minProgress;
    private int normalProgressHeight;
    public final Paint paint;
    public Bitmap progressBitmap;
    private int progressBottom;
    private int progressColor;
    public Bitmap progressDefaultBitmap;
    private int progressDefaultColor;
    private int progressDefaultDrawableId;
    public final RectF progressDefaultDstRect;
    private int progressDrawableId;
    public final RectF progressDstRect;
    private int progressHeight;
    private int progressLeft;
    private int progressPaddingRight;
    private float progressRadius;
    private int progressRight;
    public final Rect progressSrcRect;
    private int progressTop;
    private int progressWidth;
    public float reservePercent;
    public SeekBar rightSB;
    private int seekBarMode;
    public Bitmap seekingProgressBitmap;
    private int seekingProgressDrawableId;
    private final Handler smoothProgressHandler;
    private int smoothStepWidth;
    private int smoothUpdateDuration;
    private int smoothUpdateInterval;
    public final RectF stepDivRect;
    private int steps;
    private boolean stepsAutoBonding;
    public final List<Bitmap> stepsBitmaps;
    private int stepsColor;
    private int stepsDrawableId;
    private float stepsHeight;
    private float stepsRadius;
    private float stepsWidth;
    private int targetProgress;
    private int thumbProgressColor;
    private int thumbProgressHeight;
    public Rect tickMarkTextRect;
    public float touchDownX;
    public float touchDownY;
    private final int touchSlop;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface GravityDef {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/view/RangeSeekBar$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int progress = RangeSeekBar.this.getProgress();
            if (RangeSeekBar.access$000(RangeSeekBar.this) > progress) {
                RangeSeekBar rangeSeekBar = RangeSeekBar.this;
                rangeSeekBar.setProgress(Math.min(RangeSeekBar.access$000(rangeSeekBar), RangeSeekBar.access$100(RangeSeekBar.this) + progress), RangeSeekBar.access$200(RangeSeekBar.this));
                if (RangeSeekBar.access$000(RangeSeekBar.this) > progress + RangeSeekBar.access$100(RangeSeekBar.this)) {
                    sendEmptyMessageDelayed(0, RangeSeekBar.access$300(RangeSeekBar.this));
                }
            }
        }
    }

    static {
        t2o.a(468714023);
    }

    public RangeSeekBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$000(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4c9c79d", new Object[]{rangeSeekBar})).intValue();
        }
        return rangeSeekBar.targetProgress;
    }

    public static /* synthetic */ int access$100(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f056fc", new Object[]{rangeSeekBar})).intValue();
        }
        return rangeSeekBar.smoothStepWidth;
    }

    public static /* synthetic */ float access$200(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a316e658", new Object[]{rangeSeekBar})).floatValue();
        }
        return rangeSeekBar.maxProgress;
    }

    public static /* synthetic */ int access$300(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a23d75ba", new Object[]{rangeSeekBar})).intValue();
        }
        return rangeSeekBar.smoothUpdateInterval;
    }

    private void changeThumbActivateState(boolean z) {
        SeekBar seekBar;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52720d35", new Object[]{this, new Boolean(z)});
        } else if (!z || (seekBar = this.currTouchSB) == null) {
            this.leftSB.A(false);
            if (this.seekBarMode == 2) {
                this.rightSB.A(false);
            }
        } else {
            SeekBar seekBar2 = this.leftSB;
            if (seekBar == seekBar2) {
                z2 = true;
            }
            seekBar2.A(z2);
            if (this.seekBarMode == 2) {
                this.rightSB.A(true ^ z2);
            }
        }
    }

    private FscrmidFavorFrameLayout findFscrmidFavorFrameLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FscrmidFavorFrameLayout) ipChange.ipc$dispatch("cfe4bacb", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof FscrmidFavorFrameLayout) {
                return (FscrmidFavorFrameLayout) parent;
            }
        }
        return null;
    }

    private void initAttrs(AttributeSet attributeSet) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed4775", new Object[]{this, attributeSet});
            return;
        }
        this.seekBarMode = 1;
        this.minProgress = 0.0f;
        this.maxProgress = 100.0f;
        this.minInterval = 0.0f;
        this.gravity = 2;
        this.progressColor = Color.parseColor("#80FFFFFF");
        this.progressRadius = -1.0f;
        if (isInDarkTheme(getContext())) {
            str = PROGRESS_DARK_DEFAULT_COLOR;
        } else {
            str = PROGRESS_DEFAULT_COLOR;
        }
        this.progressDefaultColor = Color.parseColor(str);
        this.thumbProgressColor = Color.parseColor("#80FFFFFF");
        int b = jxv.b(getContext(), 2.0f);
        this.progressHeight = b;
        this.normalProgressHeight = b;
        this.thumbProgressHeight = b * 2;
    }

    private void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.progressDefaultColor);
    }

    private void initProgressBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbfcd73", new Object[]{this});
            return;
        }
        if (this.progressBitmap == null) {
            this.progressBitmap = jxv.f(getContext(), this.progressWidth, this.progressHeight, this.progressDrawableId);
        }
        if (this.progressDefaultBitmap == null) {
            this.progressDefaultBitmap = jxv.f(getContext(), this.progressWidth, this.progressHeight, this.progressDefaultDrawableId);
        }
        if (this.seekingProgressBitmap == null) {
            this.seekingProgressBitmap = jxv.f(getContext(), this.progressWidth, this.progressHeight, this.seekingProgressDrawableId);
        }
    }

    private void initSeekBar(AttributeSet attributeSet) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e6a27c", new Object[]{this, attributeSet});
            return;
        }
        this.leftSB = new SeekBar(this, attributeSet, true);
        SeekBar seekBar = new SeekBar(this, attributeSet, false);
        this.rightSB = seekBar;
        if (this.seekBarMode == 1) {
            z = false;
        }
        seekBar.I(z);
    }

    private void initStepsBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5018d", new Object[]{this});
        } else if (verifyStepsMode() && this.stepsDrawableId != 0 && this.stepsBitmaps.isEmpty()) {
            Bitmap f = jxv.f(getContext(), (int) this.stepsWidth, (int) this.stepsHeight, this.stepsDrawableId);
            for (int i = 0; i <= this.steps; i++) {
                this.stepsBitmaps.add(f);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(RangeSeekBar rangeSeekBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1269932558:
                super.setEnabled(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/view/RangeSeekBar");
        }
    }

    private static boolean isInDarkTheme(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private void onFinish(MotionEvent motionEvent) {
        float f;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d831bae", new Object[]{this, motionEvent});
            return;
        }
        if (verifyStepsMode() && this.stepsAutoBonding) {
            float calculateSeekBarPercent = calculateSeekBarPercent(getEventX(motionEvent));
            this.currTouchSB.J(new BigDecimal(calculateSeekBarPercent / f).setScale(0, RoundingMode.HALF_UP).intValue() * (1.0f / this.steps));
        }
        if (this.seekBarMode == 2) {
            this.rightSB.C(false);
        }
        this.leftSB.C(false);
        this.currTouchSB.u();
        resetCurrentSeekBarThumb();
        r8p[] rangeSeekBarState = getRangeSeekBarState();
        float f2 = rangeSeekBarState[0].b;
        float f3 = rangeSeekBarState[1].b;
        itk itkVar = this.callback;
        if (itkVar != null) {
            itkVar.I(this, f2, f3, false);
        }
        itk itkVar2 = this.callback;
        if (itkVar2 != null) {
            if (this.currTouchSB != this.leftSB) {
                z = false;
            }
            itkVar2.m(this, z);
        }
        this.isSeekBarSeeking = false;
        setThumbEnabled(false);
        changeThumbActivateState(false);
        this.targetProgress = (int) f2;
        this.smoothProgressHandler.removeMessages(0);
    }

    private void onMoved(float f) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eecc85", new Object[]{this, new Float(f)});
            return;
        }
        if (this.seekBarMode == 2 && this.leftSB.l == this.rightSB.l) {
            this.currTouchSB.u();
            itk itkVar = this.callback;
            if (itkVar != null) {
                if (this.currTouchSB == this.leftSB) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                itkVar.m(this, z2);
            }
            this.isSeekBarSeeking = false;
            setThumbEnabled(false);
            if (f - this.touchDownX > 0.0f) {
                SeekBar seekBar = this.currTouchSB;
                if (seekBar != this.rightSB) {
                    seekBar.C(false);
                    resetCurrentSeekBarThumb();
                    this.currTouchSB = this.rightSB;
                }
            } else {
                SeekBar seekBar2 = this.currTouchSB;
                if (seekBar2 != this.leftSB) {
                    seekBar2.C(false);
                    resetCurrentSeekBarThumb();
                    this.currTouchSB = this.leftSB;
                }
            }
            itk itkVar2 = this.callback;
            if (itkVar2 != null) {
                if (this.currTouchSB == this.leftSB) {
                    z = true;
                } else {
                    z = false;
                }
                itkVar2.G(this, z);
            }
            this.isSeekBarSeeking = true;
            setThumbEnabled(true);
        }
        scaleCurrentSeekBarThumb();
        SeekBar seekBar3 = this.currTouchSB;
        float f2 = seekBar3.m;
        float f3 = 1.0f;
        if (f2 < 1.0f) {
            f3 = 0.1f + f2;
        }
        seekBar3.m = f3;
        seekBar3.J(calculateSeekBarPercent(f));
        this.currTouchSB.C(true);
        this.touchDownX = f;
        if (this.callback != null) {
            r8p[] rangeSeekBarState = getRangeSeekBarState();
            this.callback.I(this, rangeSeekBarState[0].b, rangeSeekBarState[1].b, true);
        }
        invalidate();
        changeThumbActivateState(true);
    }

    private void onStart(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c453365f", new Object[]{this, motionEvent});
            return;
        }
        if (this.seekBarMode != 2) {
            this.currTouchSB = this.leftSB;
            scaleCurrentSeekBarThumb();
        } else if (this.rightSB.l >= 1.0f && this.leftSB.a(getEventX(motionEvent), getEventY(motionEvent))) {
            this.currTouchSB = this.leftSB;
            scaleCurrentSeekBarThumb();
        } else if (this.rightSB.a(getEventX(motionEvent), getEventY(motionEvent))) {
            this.currTouchSB = this.rightSB;
            scaleCurrentSeekBarThumb();
        } else {
            float progressLeft = (this.touchDownX - getProgressLeft()) / this.progressWidth;
            if (Math.abs(this.leftSB.l - progressLeft) < Math.abs(this.rightSB.l - progressLeft)) {
                this.currTouchSB = this.leftSB;
            } else {
                this.currTouchSB = this.rightSB;
            }
            this.currTouchSB.J(calculateSeekBarPercent(this.touchDownX));
        }
        itk itkVar = this.callback;
        if (itkVar != null) {
            if (this.currTouchSB == this.leftSB) {
                z = true;
            }
            itkVar.G(this, z);
        }
        this.isSeekBarSeeking = true;
        setThumbEnabled(true);
        changeThumbActivateState(true);
    }

    private void resetCurrentSeekBarThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f88346c", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.currTouchSB;
        if (seekBar != null && seekBar.o() > 1.0f && this.isScaleThumb) {
            this.isScaleThumb = false;
            this.currTouchSB.y();
        }
    }

    private void scaleCurrentSeekBarThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a9fe11", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.currTouchSB;
        if (seekBar != null && seekBar.o() > 1.0f && !this.isScaleThumb) {
            this.isScaleThumb = true;
            this.currTouchSB.z();
        }
    }

    private void updateProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6e269f", new Object[]{this, new Integer(i)});
            return;
        }
        this.progressHeight = i;
        int paddingTop = getPaddingTop();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
        int i2 = this.progressHeight;
        int i3 = paddingTop + ((measuredHeight - i2) / 2);
        this.progressTop = i3;
        this.progressBottom = i3 + i2;
        this.progressDefaultDstRect.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
        this.progressRadius = (i * 1.0f) / 2.0f;
    }

    private boolean verifyStepsMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bc48fc", new Object[]{this})).booleanValue();
        }
        if (this.steps < 1 || this.stepsHeight <= 0.0f || this.stepsWidth <= 0.0f) {
            return false;
        }
        return true;
    }

    public float calculateSeekBarPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a58b7b9", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = 0.0f;
        if (this.currTouchSB == null) {
            return 0.0f;
        }
        getProgressLeft();
        if (f >= getProgressLeft()) {
            getProgressRight();
        }
        float f3 = (f - this.touchDownX) / this.progressWidth;
        float f4 = this.currTouchSB.l;
        float f5 = f4 + f3;
        if (f5 > 1.0f) {
            f2 = 1.0f;
        } else if (f5 >= 0.0f) {
            f2 = f5;
        }
        ir9.b(TAG, "calculateCurrentSeekBarPercent() touchDownX=" + f + "; lastTouchDownX=" + this.touchDownX + "; relativePercent=" + f3 + "; currPercent=" + f4 + "; percent=" + f2);
        if (this.seekBarMode != 2) {
            return f2;
        }
        SeekBar seekBar = this.currTouchSB;
        SeekBar seekBar2 = this.leftSB;
        if (seekBar == seekBar2) {
            float f6 = this.rightSB.l;
            float f7 = this.reservePercent;
            if (f2 > f6 - f7) {
                return f6 - f7;
            }
            return f2;
        } else if (seekBar != this.rightSB) {
            return f2;
        } else {
            float f8 = seekBar2.l;
            float f9 = this.reservePercent;
            if (f2 < f8 + f9) {
                return f8 + f9;
            }
            return f2;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return true;
    }

    public float getEventX(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("731a74c0", new Object[]{this, motionEvent})).floatValue();
        }
        return motionEvent.getX();
    }

    public float getEventY(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88033d01", new Object[]{this, motionEvent})).floatValue();
        }
        return motionEvent.getY();
    }

    public int getGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue();
        }
        return this.gravity;
    }

    public SeekBar getLeftSeekBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SeekBar) ipChange.ipc$dispatch("f709bc07", new Object[]{this});
        }
        return this.leftSB;
    }

    public float getMaxProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdc13d72", new Object[]{this})).floatValue();
        }
        return this.maxProgress;
    }

    public float getMinProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b914960", new Object[]{this})).floatValue();
        }
        return this.minProgress;
    }

    public int getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue();
        }
        return getRangeSeekBarState()[0].b;
    }

    public int getProgressBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccffd28", new Object[]{this})).intValue();
        }
        return this.progressBottom;
    }

    public int getProgressHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9ef1624", new Object[]{this})).intValue();
        }
        return this.progressHeight;
    }

    public int getProgressLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e87d9c4", new Object[]{this})).intValue();
        }
        return this.progressLeft;
    }

    public int getProgressPaddingRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("298a5d48", new Object[]{this})).intValue();
        }
        return this.progressPaddingRight;
    }

    public int getProgressRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfdbe033", new Object[]{this})).intValue();
        }
        return this.progressRight;
    }

    public int getProgressTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f58de2c", new Object[]{this})).intValue();
        }
        return this.progressTop;
    }

    public int getProgressWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5066dd", new Object[]{this})).intValue();
        }
        return this.progressWidth;
    }

    public r8p[] getRangeSeekBarState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8p[]) ipChange.ipc$dispatch("9ba46446", new Object[]{this});
        }
        r8p r8pVar = new r8p();
        int j = this.leftSB.j();
        r8pVar.b = j;
        r8pVar.f27195a = String.valueOf(j);
        if (jxv.a(r8pVar.b, this.minProgress) == 0) {
            r8pVar.c = true;
        } else if (jxv.a(r8pVar.b, this.maxProgress) == 0) {
            r8pVar.d = true;
        }
        r8p r8pVar2 = new r8p();
        if (this.seekBarMode == 2) {
            int j2 = this.rightSB.j();
            r8pVar2.b = j2;
            r8pVar2.f27195a = String.valueOf(j2);
            if (jxv.a(this.rightSB.l, this.minProgress) == 0) {
                r8pVar2.c = true;
            } else if (jxv.a(this.rightSB.l, this.maxProgress) == 0) {
                r8pVar2.d = true;
            }
        }
        return new r8p[]{r8pVar, r8pVar2};
    }

    public float getRawHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3ec68b0", new Object[]{this})).floatValue();
        }
        if (this.seekBarMode == 1) {
            return this.leftSB.k();
        }
        return Math.max(this.leftSB.k(), this.rightSB.k());
    }

    public int getThumbProgressHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("562e006e", new Object[]{this})).intValue();
        }
        return this.thumbProgressHeight;
    }

    public boolean isTouchInRangeSeekBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3daa5b8", new Object[]{this, motionEvent})).booleanValue();
        }
        int b = jxv.b(getContext(), 20.0f);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        int height = getHeight();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX <= i || rawX >= i + width || rawY <= i2 - b || rawY >= i2 + height + b) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        onDrawProgressBar(canvas, this.paint);
        onDrawSteps(canvas, this.paint);
        onDrawSeekBar(canvas);
    }

    public void onDrawProgressBar(Canvas canvas, Paint paint) {
        SeekBar seekBar;
        SeekBar seekBar2;
        SeekBar seekBar3;
        SeekBar seekBar4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee131d0", new Object[]{this, canvas, paint});
            return;
        }
        if (jxv.h(this.progressDefaultBitmap)) {
            canvas.drawBitmap(this.progressDefaultBitmap, (Rect) null, this.progressDefaultDstRect, paint);
        } else {
            paint.setColor(this.progressDefaultColor);
            RectF rectF = this.progressDefaultDstRect;
            float f = this.progressRadius;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        if (this.seekBarMode == 2) {
            this.progressDstRect.top = getProgressTop();
            this.progressDstRect.left = seekBar3.h + (this.leftSB.p() / 2.0f) + (this.progressWidth * this.leftSB.l);
            this.progressDstRect.right = seekBar4.h + (this.rightSB.p() / 2.0f) + (this.progressWidth * this.rightSB.l);
            this.progressDstRect.bottom = getProgressBottom();
        } else {
            this.progressDstRect.top = getProgressTop();
            this.progressDstRect.left = seekBar.h + (this.leftSB.p() / 2.0f);
            this.progressDstRect.right = seekBar2.h + (this.leftSB.p() / 2.0f) + (this.progressWidth * this.leftSB.l);
            this.progressDstRect.bottom = getProgressBottom();
        }
        if (this.isSeekBarSeeking) {
            if (jxv.h(this.seekingProgressBitmap)) {
                Rect rect = this.progressSrcRect;
                rect.top = 0;
                rect.bottom = this.seekingProgressBitmap.getHeight();
                int width = this.seekingProgressBitmap.getWidth();
                if (this.seekBarMode == 2) {
                    Rect rect2 = this.progressSrcRect;
                    float f2 = width;
                    rect2.left = (int) (this.leftSB.l * f2);
                    rect2.right = (int) (f2 * this.rightSB.l);
                } else {
                    Rect rect3 = this.progressSrcRect;
                    rect3.left = 0;
                    rect3.right = (int) (width * this.leftSB.l);
                }
                canvas.drawBitmap(this.seekingProgressBitmap, this.progressSrcRect, this.progressDstRect, (Paint) null);
                return;
            }
            paint.setColor(this.thumbProgressColor);
            RectF rectF2 = this.progressDstRect;
            float f3 = this.progressRadius;
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        } else if (jxv.h(this.progressBitmap)) {
            Rect rect4 = this.progressSrcRect;
            rect4.top = 0;
            rect4.bottom = this.progressBitmap.getHeight();
            int width2 = this.progressBitmap.getWidth();
            if (this.seekBarMode == 2) {
                Rect rect5 = this.progressSrcRect;
                float f4 = width2;
                rect5.left = (int) (this.leftSB.l * f4);
                rect5.right = (int) (f4 * this.rightSB.l);
            } else {
                Rect rect6 = this.progressSrcRect;
                rect6.left = 0;
                rect6.right = (int) (width2 * this.leftSB.l);
            }
            canvas.drawBitmap(this.progressBitmap, this.progressSrcRect, this.progressDstRect, (Paint) null);
        } else {
            paint.setColor(this.progressColor);
            RectF rectF3 = this.progressDstRect;
            float f5 = this.progressRadius;
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
    }

    public void onDrawSeekBar(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2d7486", new Object[]{this, canvas});
            return;
        }
        if (this.leftSB.i() == 3) {
            this.leftSB.C(true);
        }
        this.leftSB.b(canvas);
        if (this.seekBarMode == 2) {
            if (this.rightSB.i() == 3) {
                this.rightSB.C(true);
            }
            this.rightSB.b(canvas);
        }
    }

    public void onDrawSteps(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862d8a2f", new Object[]{this, canvas, paint});
        } else if (verifyStepsMode()) {
            int progressWidth = getProgressWidth() / this.steps;
            float progressHeight = (this.stepsHeight - getProgressHeight()) / 2.0f;
            for (int i = 0; i <= this.steps; i++) {
                float progressLeft = (getProgressLeft() + (i * progressWidth)) - (this.stepsWidth / 2.0f);
                this.stepDivRect.set(progressLeft, getProgressTop() - progressHeight, this.stepsWidth + progressLeft, getProgressBottom() + progressHeight);
                if (this.stepsBitmaps.isEmpty() || this.stepsBitmaps.size() <= i) {
                    paint.setColor(this.stepsColor);
                    RectF rectF = this.stepDivRect;
                    float f = this.stepsRadius;
                    canvas.drawRoundRect(rectF, f, f, paint);
                } else {
                    canvas.drawBitmap(this.stepsBitmaps.get(i), (Rect) null, this.stepDivRect, paint);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        } else if (mode == Integer.MIN_VALUE && (getParent() instanceof ViewGroup) && size == -1) {
            i3 = View.MeasureSpec.makeMeasureSpec(((ViewGroup) getParent()).getMeasuredHeight(), Integer.MIN_VALUE);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(((int) getRawHeight()) + getPaddingTop() + getPaddingBottom(), 1073741824);
        }
        super.onMeasure(i, i3);
    }

    public void onMeasureProgress(int i, int i2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e233f3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingBottom = (i2 - getPaddingBottom()) - getPaddingTop();
        if (i2 > 0) {
            int i3 = this.gravity;
            if (i3 == 0) {
                if (this.leftSB.i() == 1 && this.rightSB.i() == 1) {
                    f = 0.0f;
                } else {
                    f = Math.max(this.leftSB.h(), this.rightSB.h());
                }
                float max = Math.max(this.leftSB.n(), this.rightSB.n());
                int i4 = this.progressHeight;
                int i5 = (int) (f + (((max - (i4 / 2.0f)) - i4) / 2.0f));
                this.progressTop = i5;
                this.progressBottom = i5 + i4;
            } else if (i3 == 1) {
                float max2 = paddingBottom - (Math.max(this.leftSB.n(), this.rightSB.n()) / 2.0f);
                int i6 = this.progressHeight;
                int i7 = (int) (max2 + (i6 / 2.0f));
                this.progressBottom = i7;
                this.progressTop = i7 - i6;
            } else {
                int paddingTop = getPaddingTop();
                int i8 = this.progressHeight;
                int i9 = paddingTop + ((paddingBottom - i8) / 2);
                this.progressTop = i9;
                this.progressBottom = i9 + i8;
            }
            this.progressLeft = getPaddingLeft();
            int paddingRight = i - getPaddingRight();
            this.progressRight = paddingRight;
            this.progressWidth = paddingRight - this.progressLeft;
            this.progressDefaultDstRect.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
            this.progressPaddingRight = i - this.progressRight;
            if (this.progressRadius <= 0.0f) {
                this.progressRadius = (int) (this.progressHeight * 0.5f);
            }
            initProgressBitmap();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        try {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setRange(savedState.minValue, savedState.maxValue, savedState.rangeInterval);
            setProgress(savedState.currSelectedMin, savedState.currSelectedMax);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.minValue = this.minProgress;
        savedState.maxValue = this.maxProgress;
        savedState.rangeInterval = this.minInterval;
        r8p[] rangeSeekBarState = getRangeSeekBarState();
        savedState.currSelectedMin = rangeSeekBarState[0].b;
        savedState.currSelectedMax = rangeSeekBarState[1].b;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        onMeasureProgress(i, i2);
        setRange(this.minProgress, this.maxProgress, this.minInterval);
        int progressBottom = (getProgressBottom() + getProgressTop()) / 2;
        this.leftSB.x(getProgressLeft(), progressBottom);
        if (this.seekBarMode == 2) {
            this.rightSB.x(getProgressLeft(), progressBottom);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r3 != 3) goto L_0x008f;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            boolean r3 = r5.isEnable
            if (r3 != 0) goto L_0x0021
            return r0
        L_0x0021:
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r3 = r5.findFscrmidFavorFrameLayout()
            if (r3 == 0) goto L_0x0030
            r3.touchInRangeSeekBar(r0)
            boolean r6 = r5.isEnableWeexUponSeekBar
            if (r6 == 0) goto L_0x002f
            return r0
        L_0x002f:
            return r1
        L_0x0030:
            int r3 = r6.getAction()
            if (r3 == 0) goto L_0x0094
            if (r3 == r0) goto L_0x0074
            if (r3 == r2) goto L_0x003e
            r0 = 3
            if (r3 == r0) goto L_0x0074
            goto L_0x008f
        L_0x003e:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L_0x004b
            android.view.ViewParent r1 = r5.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x004b:
            float r1 = r5.getEventX(r6)
            boolean r2 = r5.isTouchEventDragging
            if (r2 != 0) goto L_0x0067
            float r2 = r5.touchDownX
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r5.touchSlop
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0067
            r5.isTouchEventDragging = r0
            r5.onStart(r6)
        L_0x0067:
            boolean r0 = r5.isTouchEventDragging
            if (r0 != 0) goto L_0x0070
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x0070:
            r5.onMoved(r1)
            goto L_0x008f
        L_0x0074:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x0081
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0081:
            boolean r0 = r5.isTouchEventDragging
            if (r0 != 0) goto L_0x008a
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x008a:
            r5.isTouchEventDragging = r1
            r5.onFinish(r6)
        L_0x008f:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x0094:
            r5.isTouchEventDragging = r1
            float r1 = r5.getEventX(r6)
            r5.touchDownX = r1
            float r6 = r5.getEventY(r6)
            r5.touchDownY = r6
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L_0x00af
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r0)
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r4 != 3) goto L_0x00d0;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.Boolean, java.lang.Boolean> onTouchEventProxyWeexUponSeekBar(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEventProxyWeexUponSeekBar(android.view.MotionEvent):android.util.Pair");
    }

    public void setEnableSmoothSeek(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92d6a62", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSmoothSeek = z;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setEnabled(z);
        this.isEnable = z;
    }

    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
        } else {
            this.gravity = i;
        }
    }

    public void setOnRangeChangedListener(itk itkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872ef551", new Object[]{this, itkVar});
        } else {
            this.callback = itkVar;
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        this.targetProgress = (int) f;
        if (this.enableSmoothSeek) {
            this.smoothProgressHandler.removeMessages(0);
            if (f == this.minProgress || f == this.maxProgress) {
                this.smoothUpdateInterval = 0;
                setProgress(f, this.maxProgress);
                return;
            }
            int progress = getProgress();
            int i = this.targetProgress - progress;
            int i2 = this.smoothStepWidth;
            if (i > i2 * 2) {
                setProgress(i2 + progress, this.maxProgress);
                int i3 = this.smoothStepWidth;
                int i4 = this.smoothUpdateDuration / (((this.targetProgress - progress) - i3) / i3);
                this.smoothUpdateInterval = i4;
                this.smoothProgressHandler.sendEmptyMessageDelayed(0, i4);
                return;
            }
            this.smoothUpdateInterval = 0;
            setProgress(f, this.maxProgress);
            return;
        }
        setProgress(f, this.maxProgress);
    }

    public void setProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238e266", new Object[]{this, new Integer(i)});
            return;
        }
        this.normalProgressHeight = i;
        updateProgressHeight(i);
    }

    public void setRange(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe90c882", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            setRange(f, f2, this.minInterval);
        }
    }

    public void setSmoothStepWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44507612", new Object[]{this, new Integer(i)});
        } else {
            this.smoothStepWidth = i;
        }
    }

    public void setSmoothUpdateDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6557b12f", new Object[]{this, new Integer(i)});
        } else {
            this.smoothUpdateDuration = i;
        }
    }

    public void setThumbEnabled(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8259d40", new Object[]{this, new Boolean(z)});
            return;
        }
        this.leftSB.E(z);
        if (!z || (i = this.thumbProgressHeight) <= 0) {
            i = this.normalProgressHeight;
        }
        updateProgressHeight(i);
        invalidate();
    }

    public void setThumbProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f4af4", new Object[]{this, new Integer(i)});
        } else {
            this.thumbProgressHeight = i;
        }
    }

    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else {
            this.paint.setTypeface(typeface);
        }
    }

    public void updateProgressDefaultColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba64f384", new Object[]{this, new Integer(i)});
            return;
        }
        this.progressDefaultColor = i;
        this.paint.setColor(i);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
        this.progressDefaultDstRect = new RectF();
        this.progressDstRect = new RectF();
        this.progressSrcRect = new Rect();
        this.stepDivRect = new RectF();
        this.stepsBitmaps = new ArrayList();
        this.isScaleThumb = false;
        this.tickMarkTextRect = new Rect();
        this.isEnable = true;
        this.enableSmoothSeek = akt.p2("ShortVideo.enableSmoothSeek", true);
        this.smoothStepWidth = 20;
        this.smoothUpdateDuration = 100;
        this.smoothProgressHandler = new a(Looper.getMainLooper());
        initAttrs(attributeSet);
        initPaint();
        initSeekBar(attributeSet);
        initStepsBitmap();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.isEnableWeexUponSeekBar = b93.u();
    }

    public void setRange(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d388af7e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (f2 <= f) {
            ir9.b(TAG, "setRange() max must be greater than min ! #max:" + f2 + " #min:" + f);
        } else if (f3 < 0.0f) {
            ir9.b(TAG, "setRange() interval must be greater than zero ! #minInterval:" + f3);
        } else {
            float f4 = f2 - f;
            if (f3 >= f4) {
                ir9.b(TAG, "setRange() interval must be less than (max - min) ! #minInterval:" + f3 + " #max - min:" + f4);
                return;
            }
            this.maxProgress = f2;
            this.minProgress = f;
            this.minInterval = f3;
            float f5 = f3 / f4;
            this.reservePercent = f5;
            if (this.seekBarMode == 2) {
                SeekBar seekBar = this.leftSB;
                float f6 = seekBar.l;
                if (f6 + f5 <= 1.0f) {
                    SeekBar seekBar2 = this.rightSB;
                    if (f6 + f5 > seekBar2.l) {
                        seekBar2.l = f6 + f5;
                    }
                }
                float f7 = this.rightSB.l;
                if (f7 - f5 >= 0.0f && f7 - f5 < f6) {
                    seekBar.l = f7 - f5;
                }
            }
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4 != 3) goto L_0x009f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEventProxy(android.view.ViewGroup r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "6bd7b6cf"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            boolean r4 = r6.isEnable
            if (r4 != 0) goto L_0x0024
            return r2
        L_0x0024:
            int r4 = r8.getAction()
            if (r4 == 0) goto L_0x003d
            if (r4 == r1) goto L_0x0031
            if (r4 == r0) goto L_0x004b
            if (r4 == r3) goto L_0x0031
            goto L_0x009f
        L_0x0031:
            r6.isTouchEventDragging = r2
            if (r7 == 0) goto L_0x009f
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r2)
            goto L_0x009f
        L_0x003d:
            r6.isTouchEventDragging = r2
            float r0 = r6.getEventX(r8)
            r6.touchDownX = r0
            float r0 = r6.getEventY(r8)
            r6.touchDownY = r0
        L_0x004b:
            float r0 = r6.getEventX(r8)
            float r3 = r6.getEventY(r8)
            float r4 = r6.touchDownX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            float r5 = r6.touchDownY
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x006b
            r2 = 1
        L_0x006b:
            boolean r3 = r6.isTouchEventDragging
            if (r3 != 0) goto L_0x009f
            if (r2 == 0) goto L_0x009f
            float r2 = r6.touchDownX
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r6.touchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            r6.isTouchEventDragging = r1
            boolean r0 = r7 instanceof com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "RangeSeekBar"
            java.lang.String r2 = "onTouchEventProxy: clearPendingEvent"
            tb.ir9.b(r0, r2)
            r0 = r7
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r0 = (com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout) r0
            r0.clearPendingEvent()
        L_0x0093:
            r6.onStart(r8)
            if (r7 == 0) goto L_0x009f
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
        L_0x009f:
            boolean r7 = r6.isTouchEventDragging
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onInterceptTouchEventProxy(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4 != 3) goto L_0x00ab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEventProxy(android.view.ViewGroup r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "eb9aac13"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            boolean r4 = r6.isEnable
            if (r4 != 0) goto L_0x0024
            return r1
        L_0x0024:
            int r4 = r8.getAction()
            if (r4 == 0) goto L_0x00ac
            if (r4 == r1) goto L_0x0094
            if (r4 == r0) goto L_0x0032
            if (r4 == r3) goto L_0x0094
            goto L_0x00ab
        L_0x0032:
            float r0 = r6.getEventX(r8)
            float r3 = r6.getEventY(r8)
            float r4 = r6.touchDownX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            float r5 = r6.touchDownY
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0052
            r2 = 1
        L_0x0052:
            boolean r3 = r6.isTouchEventDragging
            if (r3 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0087
            float r2 = r6.touchDownX
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r6.touchSlop
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0087
            r6.isTouchEventDragging = r1
            boolean r2 = r7 instanceof com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = "RangeSeekBar"
            java.lang.String r3 = "onTouchEventProxy: clearPendingEvent"
            tb.ir9.b(r2, r3)
            r2 = r7
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r2 = (com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout) r2
            r2.clearPendingEvent()
        L_0x007b:
            r6.onStart(r8)
            if (r7 == 0) goto L_0x0087
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
        L_0x0087:
            boolean r7 = r6.isTouchEventDragging
            if (r7 != 0) goto L_0x0090
            boolean r7 = super.onTouchEvent(r8)
            return r7
        L_0x0090:
            r6.onMoved(r0)
            goto L_0x00ab
        L_0x0094:
            if (r7 == 0) goto L_0x009d
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r2)
        L_0x009d:
            boolean r7 = r6.isTouchEventDragging
            if (r7 != 0) goto L_0x00a6
            boolean r7 = super.onTouchEvent(r8)
            return r7
        L_0x00a6:
            r6.isTouchEventDragging = r2
            r6.onFinish(r8)
        L_0x00ab:
            return r1
        L_0x00ac:
            r6.isTouchEventDragging = r2
            float r7 = r6.getEventX(r8)
            r6.touchDownX = r7
            float r7 = r6.getEventY(r8)
            r6.touchDownY = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEventProxy(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }

    public void setProgress(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2155836", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        float min = Math.min(f, f2);
        float max = Math.max(min, f2);
        float f3 = this.minInterval;
        if (max - min < f3) {
            min = max - f3;
        }
        if (min < this.minProgress) {
            ir9.b(TAG, "setProgress() min < (preset min - offsetValue) . #min:" + min + " #preset min:" + max);
            return;
        }
        if (max > this.maxProgress) {
            ir9.b(TAG, "setProgress() max > (preset max - offsetValue) . #max:" + max + " #preset max:" + max);
        }
        float f4 = this.maxProgress;
        float f5 = this.minProgress;
        float f6 = f4 - f5;
        this.leftSB.l = Math.abs(min - f5) / f6;
        if (this.seekBarMode == 2) {
            this.rightSB.l = Math.abs(max - this.minProgress) / f6;
        }
        itk itkVar = this.callback;
        if (itkVar != null) {
            itkVar.I(this, min, max, false);
        }
        invalidate();
    }
}
