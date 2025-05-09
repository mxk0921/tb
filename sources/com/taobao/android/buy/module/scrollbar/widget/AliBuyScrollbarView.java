package com.taobao.android.buy.module.scrollbar.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ai;
import tb.pn;
import tb.pxo;
import tb.t2o;
import tb.yn0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliBuyScrollbarView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mAnchorPaint;
    private int mAnchorSize;
    private int mBarHeight;
    private int mBarWidth;
    private Paint mBgPaint;
    private float mCenterYOfThumb;
    private final Handler mDelayHandler;
    private final int mDelayMillis;
    private LinearGradient mGradient;
    private Runnable mHideScrollBar;
    private boolean mInitFlag;
    private int mItemCount;
    private float mPercent;
    private Paint mProgressPaint;
    private float mRadius;
    private float mRatio;
    private yn0 mScrollListener;
    public int mStartPosition;
    private float mStartY;
    private float mStopY;
    private Rect mTouchRect;
    private boolean scrollConflict;
    private boolean upOrCancel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AliBuyScrollbarView.this.setVisibility(4);
            }
        }
    }

    static {
        t2o.a(301990081);
    }

    public AliBuyScrollbarView(Context context) {
        this(context, null);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setClickable(true);
        setVisibility(4);
        int i = this.mBarHeight;
        float f = this.mRatio;
        this.mStartY = (i * (1.0f - f)) / 2.0f;
        this.mStopY = (i * (f + 1.0f)) / 2.0f;
        this.mHideScrollBar = new a();
        Rect rect = new Rect();
        this.mTouchRect = rect;
        rect.set(pxo.g, pxo.h, pxo.i, pxo.j);
        this.mGradient = new LinearGradient(pxo.d, 0.0f, 0.0f, 0.0f, -1, 0, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.mBgPaint = paint;
        paint.setColor(-1);
        this.mBgPaint.setAlpha(255);
        Paint paint2 = new Paint();
        this.mProgressPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setStrokeWidth(this.mBarWidth);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setColor(855638016);
        Paint paint3 = new Paint();
        this.mAnchorPaint = paint3;
        paint3.setStrokeWidth(4.0f);
        this.mInitFlag = true;
    }

    public static /* synthetic */ Object ipc$super(AliBuyScrollbarView aliBuyScrollbarView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/module/scrollbar/widget/AliBuyScrollbarView");
        }
    }

    private void refreshThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87eec2", new Object[]{this});
            return;
        }
        float f = this.mStopY;
        float f2 = this.mStartY;
        this.mCenterYOfThumb = ((f - f2) * this.mPercent) + f2;
        postInvalidate();
    }

    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.mItemCount;
    }

    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        return this.mInitFlag;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.mDelayHandler.postDelayed(this.mHideScrollBar, 1000L);
        }
    }

    public void onDataChange(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7ccc45", new Object[]{this, map});
            return;
        }
        this.mBarWidth = ai.a(pn.c((String) map.get(pxo.f26381a), 5));
        this.mAnchorSize = ai.a(pn.c((String) map.get(pxo.b), 9));
        this.mRatio = pn.b((String) map.get(pxo.c), 0.6f);
        this.mRadius = this.mAnchorSize / 2.0f;
        init();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.mBgPaint.setShader(this.mGradient);
        canvas.drawRect(0.0f, 0.0f, pxo.d, getHeight(), this.mBgPaint);
        int i = this.mBarWidth;
        int i2 = pxo.e;
        canvas.drawLine((i / 2.0f) + i2, this.mStartY, (i / 2.0f) + i2, this.mStopY, this.mProgressPaint);
        this.mAnchorPaint.setAntiAlias(true);
        this.mAnchorPaint.setStyle(Paint.Style.FILL);
        this.mAnchorPaint.setColor(-1);
        float f = this.mRadius;
        int i3 = pxo.f;
        canvas.drawCircle(i3 + f, this.mCenterYOfThumb, f - this.mAnchorPaint.getStrokeWidth(), this.mAnchorPaint);
        this.mAnchorPaint.setStyle(Paint.Style.STROKE);
        this.mAnchorPaint.setColor(-16777216);
        float f2 = this.mRadius;
        canvas.drawCircle(i3 + f2, this.mCenterYOfThumb, f2 - (this.mAnchorPaint.getStrokeWidth() / 2.0f), this.mAnchorPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(pxo.d, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9 != 3) goto L_0x0095;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            java.lang.Object r9 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001c:
            float r3 = r9.getX()
            float r4 = r9.getY()
            float r5 = r8.mStartY
            float r4 = java.lang.Math.max(r5, r4)
            float r5 = r8.mStopY
            float r4 = java.lang.Math.min(r4, r5)
            float r5 = r8.mStartY
            float r6 = r4 - r5
            float r7 = r8.mStopY
            float r7 = r7 - r5
            float r6 = r6 / r7
            android.graphics.Rect r5 = r8.mTouchRect
            int r3 = (int) r3
            int r4 = (int) r4
            boolean r5 = r5.contains(r3, r4)
            if (r5 == 0) goto L_0x0049
            android.os.Handler r5 = r8.mDelayHandler
            java.lang.Runnable r7 = r8.mHideScrollBar
            r5.removeCallbacks(r7)
        L_0x0049:
            int r9 = r9.getActionMasked()
            if (r9 == 0) goto L_0x007c
            if (r9 == r0) goto L_0x0064
            if (r9 == r2) goto L_0x0057
            r2 = 3
            if (r9 == r2) goto L_0x0064
            goto L_0x0095
        L_0x0057:
            tb.yn0 r9 = r8.mScrollListener
            float r1 = r8.mPercent
            r9.b(r1, r6)
            r8.mPercent = r6
            r8.refreshThumb()
            goto L_0x0095
        L_0x0064:
            r8.scrollConflict = r1
            r8.upOrCancel = r0
            tb.yn0 r9 = r8.mScrollListener
            float r2 = r8.mPercent
            r9.a(r2, r6)
            r8.mPercent = r6
            r8.refreshThumb()
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0095
        L_0x007c:
            android.graphics.Rect r9 = r8.mTouchRect
            boolean r9 = r9.contains(r3, r4)
            if (r9 != 0) goto L_0x0085
            return r1
        L_0x0085:
            r8.scrollConflict = r0
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r0)
            tb.yn0 r9 = r8.mScrollListener
            float r1 = r8.mPercent
            r9.c(r1, r6)
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void scrollToPercent(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf75d47", new Object[]{this, new Float(f), new Integer(i)});
        } else if (this.upOrCancel) {
            this.upOrCancel = false;
        } else if (!this.scrollConflict) {
            this.mDelayHandler.removeCallbacks(this.mHideScrollBar);
            if ((i == 1 && f > this.mPercent) || (i == -1 && f < this.mPercent)) {
                this.mPercent = f;
                refreshThumb();
            }
        }
    }

    public void setBarHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d42b584", new Object[]{this, new Integer(i)});
        } else {
            this.mBarHeight = i;
        }
    }

    public void setItemCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else {
            this.mItemCount = i;
        }
    }

    public void setListener(yn0 yn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f04315", new Object[]{this, yn0Var});
        } else {
            this.mScrollListener = yn0Var;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }

    public AliBuyScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AliBuyScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDelayHandler = new Handler();
        this.mDelayMillis = 1000;
        this.mItemCount = 0;
        this.mStartPosition = -1;
    }
}
