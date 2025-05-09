package com.taobao.bootimage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FilletLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FilletLinearLayout";
    private float cornerSize;

    static {
        t2o.a(736100481);
    }

    public FilletLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FilletLinearLayout filletLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/view/FilletLinearLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            if (this.cornerSize > 0.0f) {
                Path path = new Path();
                RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f = this.cornerSize;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
            }
            super.dispatchDraw(canvas);
        } catch (Exception e) {
            tm1.b(TAG, "dispatchDraw error", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setCornerSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68125521", new Object[]{this, new Float(f)});
        } else if (Math.abs(this.cornerSize - f) >= 1.0f) {
            this.cornerSize = f;
            invalidate();
        }
    }

    public FilletLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilletLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
