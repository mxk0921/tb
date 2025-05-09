package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ek2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoRoundCornerLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ek2 boxShadowDrawable;
    private int boxShadowOffsetX;
    private int boxShadowOffsetY;
    private float[] mCornerRadii;
    private float mCornerRadius;
    private float strokeWidth;
    private final Path mStrokePath = new Path();
    private final Path mBoxShadowPath = new Path();
    private final Paint mStrokePaint = new Paint();
    private final Path mPath = new Path();
    private final RectF mRectF = new RectF();
    private int widthSplit = 0;
    private int heightSplit = 0;

    static {
        t2o.a(468713779);
    }

    public VideoRoundCornerLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(VideoRoundCornerLayout videoRoundCornerLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/common/view/VideoRoundCornerLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        float[] fArr = this.mCornerRadii;
        if (fArr != null && fArr.length > 0) {
            try {
                this.mPath.reset();
                this.mPath.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), this.mCornerRadii, Path.Direction.CW);
                canvas.clipPath(this.mPath);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (this.mCornerRadius > 0.0f) {
            this.mRectF.set(this.widthSplit, this.heightSplit, getMeasuredWidth() - this.widthSplit, getMeasuredHeight() - this.heightSplit);
            if (this.boxShadowDrawable != null) {
                this.mBoxShadowPath.reset();
                RectF rectF = new RectF(this.mRectF);
                float f = this.strokeWidth;
                rectF.inset(f, f);
                rectF.bottom += this.boxShadowOffsetY;
                rectF.left += this.boxShadowOffsetX;
                Path path = this.mBoxShadowPath;
                float f2 = this.mCornerRadius;
                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.mBoxShadowPath);
                this.boxShadowDrawable.draw(canvas);
                canvas.restore();
            }
            RectF rectF2 = new RectF(this.mRectF);
            try {
                if (this.strokeWidth > 0.0f) {
                    this.mStrokePath.reset();
                    float f3 = this.strokeWidth;
                    rectF2.inset(f3 / 2.0f, f3 / 2.0f);
                    Path path2 = this.mStrokePath;
                    float f4 = this.mCornerRadius;
                    path2.addRoundRect(rectF2, f4, f4, Path.Direction.CW);
                }
                float f5 = this.strokeWidth;
                rectF2.inset(f5 / 2.0f, f5 / 2.0f);
                this.mPath.reset();
                Path path3 = this.mPath;
                float f6 = this.mCornerRadius;
                float f7 = this.strokeWidth;
                path3.addRoundRect(rectF2, f6 - f7, f6 - f7, Path.Direction.CW);
                canvas.save();
                try {
                    canvas.clipPath(this.mPath);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z = false;
            }
            z2 = z;
        } else {
            canvas.drawColor(-16777216);
        }
        super.dispatchDraw(canvas);
        if (z2) {
            canvas.restore();
        }
        if (this.strokeWidth > 0.0f) {
            canvas.save();
            canvas.clipPath(this.mStrokePath);
            canvas.drawPath(this.mStrokePath, this.mStrokePaint);
            canvas.restore();
        }
    }

    public void setBoxShadowDrawable(ek2 ek2Var, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935f4b32", new Object[]{this, ek2Var, new Integer(i), new Integer(i2)});
            return;
        }
        this.boxShadowOffsetX = i;
        this.boxShadowOffsetY = i2;
        this.boxShadowDrawable = ek2Var;
        invalidate();
    }

    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
            return;
        }
        this.mCornerRadii = fArr;
        invalidate();
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
            return;
        }
        this.mCornerRadius = f;
        invalidate();
    }

    public void setScaleSizeRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faebd710", new Object[]{this, new Float(f)});
            return;
        }
        float width = (getWidth() * 1.0f) / getHeight();
        if (width > f) {
            this.heightSplit = 0;
            this.widthSplit = (int) ((getWidth() - (getHeight() * f)) / 2.0f);
        } else if (width < f) {
            this.widthSplit = 0;
            this.heightSplit = (int) ((getHeight() - (getWidth() / f)) / 2.0f);
        } else {
            this.heightSplit = 0;
            this.widthSplit = 0;
        }
        invalidate();
    }

    public void setStrokeInfo(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8e1512", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.strokeWidth = f;
        if (f > 0.0f) {
            this.mStrokePaint.setAntiAlias(true);
            this.mStrokePaint.setColor(i);
            this.mStrokePaint.setStyle(Paint.Style.STROKE);
            this.mStrokePaint.setStrokeWidth(f);
        }
        invalidate();
    }

    public VideoRoundCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
