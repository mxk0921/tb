package com.taobao.falco;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$LevitatedSphereView extends View implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int height;
    private Paint mBackgroundPaint;
    private View.OnClickListener mClickListener;
    private vz8.g mDraggingListener;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private boolean mIsDragging;
    private View.OnLongClickListener mLongClickListener;
    private final int mRadius;
    private Paint mRingPaint;
    private final int mRingWidth;
    private Paint mTextPaint;
    private final int mTextSize;
    private long mTouchDownTime;
    public final int width;
    private final int mRingColor = Color.argb(77, 255, 255, 255);
    private final int mBackgroundColor = Color.argb(204, 0, 0, 0);
    private final int mTextColor = -1;
    private final String mText = "Falco";

    public FalcoVisualTool$LevitatedSphereView(Context context) {
        super(context);
        int h = vz8.h(context, 25);
        this.mRadius = h;
        int h2 = vz8.h(context, 8);
        this.mRingWidth = h2;
        int i = (h + h2) * 2;
        this.width = i;
        this.height = i;
        this.mTextSize = vz8.h(context, 15);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Paint paint = new Paint(1);
        this.mRingPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.mBackgroundPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.mTextPaint = paint3;
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        setOnTouchListener(this);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$LevitatedSphereView falcoVisualTool$LevitatedSphereView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$LevitatedSphereView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.mRingPaint.setStrokeWidth(this.mRingWidth);
        this.mRingPaint.setColor(this.mRingColor);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setColor(this.mTextColor);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, this.mRadius, this.mRingPaint);
        canvas.drawCircle(width, height, this.mRadius, this.mBackgroundPaint);
        Paint.FontMetrics fontMetrics = this.mTextPaint.getFontMetrics();
        canvas.drawText(this.mText, width, height - ((fontMetrics.top + fontMetrics.bottom) / 2.0f), this.mTextPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = (this.mRadius + this.mRingWidth) * 2;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        vz8.g gVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsDragging = false;
            this.mInitialTouchX = motionEvent.getRawX();
            this.mInitialTouchY = motionEvent.getRawY();
            this.mTouchDownTime = System.currentTimeMillis();
            return true;
        } else if (action == 1) {
            if (this.mIsDragging) {
                vz8.g gVar2 = this.mDraggingListener;
                if (gVar2 != null) {
                    gVar2.b(view);
                }
            } else if (System.currentTimeMillis() - this.mTouchDownTime >= 1000) {
                View.OnLongClickListener onLongClickListener = this.mLongClickListener;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(view);
                }
            } else {
                View.OnClickListener onClickListener = this.mClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
            return true;
        } else if (action != 2) {
            return false;
        } else {
            int rawX = (int) (motionEvent.getRawX() - this.mInitialTouchX);
            int rawY = (int) (motionEvent.getRawY() - this.mInitialTouchY);
            if (!this.mIsDragging) {
                if (Math.abs(rawX) > 5 || Math.abs(rawY) > 5) {
                    z = true;
                }
                this.mIsDragging = z;
            }
            if (this.mIsDragging && (gVar = this.mDraggingListener) != null) {
                gVar.a(view, this.mInitialTouchX, this.mInitialTouchY, rawX, rawY);
            }
            return true;
        }
    }

    public void setCustomClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d22b389", new Object[]{this, onClickListener});
        } else {
            this.mClickListener = onClickListener;
        }
    }

    public void setCustomDraggingListener(vz8.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177934ce", new Object[]{this, gVar});
        } else {
            this.mDraggingListener = gVar;
        }
    }

    public void setCustomLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14174c1", new Object[]{this, onLongClickListener});
        } else {
            this.mLongClickListener = onLongClickListener;
        }
    }
}
