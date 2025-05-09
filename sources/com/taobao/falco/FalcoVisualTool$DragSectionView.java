package com.taobao.falco;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$DragSectionView extends View implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mBarHeight;
    private Paint mBarPaint;
    private RectF mBarRect;
    private final int mCornerRadius;
    private vz8.g mDraggingListener;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private boolean mIsDragging;
    private final float mBarWidthScale = 0.35f;
    private final int mBarColor = -1;

    public FalcoVisualTool$DragSectionView(Context context) {
        super(context);
        this.mBarHeight = vz8.h(context, 6);
        this.mCornerRadius = vz8.h(context, 6);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mBarPaint = new Paint(1);
        this.mBarRect = new RectF();
        setOnTouchListener(this);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$DragSectionView falcoVisualTool$DragSectionView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$DragSectionView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = (int) (width * this.mBarWidthScale);
        int min = Math.min(height, this.mBarHeight);
        int i2 = (width - i) / 2;
        int i3 = (height - min) / 2;
        this.mBarRect.set(i2, i3, i2 + i, i3 + min);
        this.mBarPaint.setColor(this.mBarColor);
        RectF rectF = this.mBarRect;
        int i4 = this.mCornerRadius;
        canvas.drawRoundRect(rectF, i4, i4, this.mBarPaint);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        vz8.g gVar;
        vz8.g gVar2;
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
            return true;
        } else if (action == 1) {
            if (this.mIsDragging && (gVar = this.mDraggingListener) != null) {
                gVar.b(view);
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
            if (this.mIsDragging && (gVar2 = this.mDraggingListener) != null) {
                gVar2.a(view, this.mInitialTouchX, this.mInitialTouchY, rawX, rawY);
            }
            return true;
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
}
