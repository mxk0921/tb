package com.taobao.weex.ui.view.border;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wn9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BorderCorner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float SWEEP_ANGLE = 45.0f;
    public float mAngleBisector;
    private RectF mBorderBox;
    private float mOvalBottom;
    private float mOvalLeft;
    private float mOvalRight;
    private float mOvalTop;
    private float mRoundCornerEndX;
    private float mRoundCornerEndY;
    private float mRoundCornerStartX;
    private float mRoundCornerStartY;
    private float mCornerRadius = 0.0f;
    private float mPreBorderWidth = 0.0f;
    private float mPostBorderWidth = 0.0f;
    private boolean hasInnerCorner = false;
    private boolean hasOuterCorner = false;

    static {
        t2o.a(985661738);
    }

    public final void drawRoundedCorner(Canvas canvas, Paint paint, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8e6b4b", new Object[]{this, canvas, paint, new Float(f)});
        } else if (hasOuterCorner()) {
            canvas.drawArc(this.mOvalLeft, this.mOvalTop, this.mOvalRight, this.mOvalBottom, f, 45.0f, false, paint);
        } else {
            canvas.drawLine(getRoundCornerStartX(), getRoundCornerStartY(), getRoundCornerEndX(), getRoundCornerEndY(), paint);
        }
    }

    public final float getAngleBisectorDegree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b24d258d", new Object[]{this})).floatValue();
        }
        return this.mAngleBisector;
    }

    public final RectF getBorderBox() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("d9336417", new Object[]{this});
        }
        return this.mBorderBox;
    }

    public final float getOuterCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2946123", new Object[]{this})).floatValue();
        }
        return this.mCornerRadius;
    }

    public final float getPostBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d18a47b", new Object[]{this})).floatValue();
        }
        return this.mPostBorderWidth;
    }

    public final float getPreBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a166944", new Object[]{this})).floatValue();
        }
        return this.mPreBorderWidth;
    }

    public final float getRoundCornerEndX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce359c41", new Object[]{this})).floatValue();
        }
        return this.mRoundCornerEndX;
    }

    public final float getRoundCornerEndY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce43b3c2", new Object[]{this})).floatValue();
        }
        return this.mRoundCornerEndY;
    }

    public final float getRoundCornerStartX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eb655da", new Object[]{this})).floatValue();
        }
        return this.mRoundCornerStartX;
    }

    public final float getRoundCornerStartY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ec46d5b", new Object[]{this})).floatValue();
        }
        return this.mRoundCornerStartY;
    }

    public boolean hasInnerCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("290dd95c", new Object[]{this})).booleanValue();
        }
        return this.hasInnerCorner;
    }

    public boolean hasOuterCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8550141", new Object[]{this})).booleanValue();
        }
        return this.hasOuterCorner;
    }

    public abstract void prepareOval();

    public abstract void prepareRoundCorner();

    public final void set(float f, float f2, float f3, RectF rectF, float f4) {
        boolean z;
        RectF rectF2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20f6b78", new Object[]{this, new Float(f), new Float(f2), new Float(f3), rectF, new Float(f4)});
        } else if (!wn9.a(this.mCornerRadius, f) || !wn9.a(this.mPreBorderWidth, f2) || !wn9.a(this.mPostBorderWidth, f3) || !wn9.a(this.mAngleBisector, f4) || ((rectF2 = this.mBorderBox) != null && rectF2.equals(rectF))) {
            this.mCornerRadius = f;
            this.mPreBorderWidth = f2;
            this.mPostBorderWidth = f3;
            this.mBorderBox = rectF;
            this.mAngleBisector = f4;
            if (f <= 0.0f || wn9.a(0.0f, f)) {
                z = false;
            } else {
                z = true;
            }
            this.hasOuterCorner = z;
            if (!z || getPreBorderWidth() < 0.0f || getPostBorderWidth() < 0.0f || getOuterCornerRadius() <= getPreBorderWidth() || getOuterCornerRadius() <= getPostBorderWidth()) {
                z2 = false;
            }
            this.hasInnerCorner = z2;
            if (this.hasOuterCorner) {
                prepareOval();
            }
            prepareRoundCorner();
        }
    }

    public final void setOvalBottom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875cc5a", new Object[]{this, new Float(f)});
        } else {
            this.mOvalBottom = f;
        }
    }

    public final void setOvalLeft(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfc82fe", new Object[]{this, new Float(f)});
        } else {
            this.mOvalLeft = f;
        }
    }

    public final void setOvalRight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f3271", new Object[]{this, new Float(f)});
        } else {
            this.mOvalRight = f;
        }
    }

    public final void setOvalTop(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cffbd8", new Object[]{this, new Float(f)});
        } else {
            this.mOvalTop = f;
        }
    }

    public final void setRoundCornerEndX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d1849b", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerEndX = f;
        }
    }

    public final void setRoundCornerEndY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74865d3a", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerEndY = f;
        }
    }

    public final void setRoundCornerStartX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a586b22", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerStartX = f;
        }
    }

    public final void setRoundCornerStartY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0d43c1", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerStartY = f;
        }
    }
}
