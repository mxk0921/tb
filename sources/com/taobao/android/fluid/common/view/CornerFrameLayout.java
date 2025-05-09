package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CornerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Path path;
    private float[] radii;
    private RectF rectF;

    static {
        t2o.a(468713768);
    }

    public CornerFrameLayout(Context context, float f, float f2, float f3, float f4) {
        super(context);
        this.rectF = new RectF();
        this.path = new Path();
        this.radii = new float[8];
        setCorner(f, f2, f3, f4);
    }

    private void init(AttributeSet attributeSet) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        float f4 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.CornerFrameLayout);
            float dimension = obtainStyledAttributes.getDimension(R.styleable.CornerFrameLayout_lt_radius, 0.0f);
            f3 = obtainStyledAttributes.getDimension(R.styleable.CornerFrameLayout_rt_radius, 0.0f);
            f2 = obtainStyledAttributes.getDimension(R.styleable.CornerFrameLayout_rb_radius, 0.0f);
            float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CornerFrameLayout_lb_radius, 0.0f);
            obtainStyledAttributes.recycle();
            f = dimension2;
            f4 = dimension;
        } else {
            f = 0.0f;
            f3 = 0.0f;
            f2 = 0.0f;
        }
        setCorner(f4, f3, f2, f);
    }

    public static /* synthetic */ Object ipc$super(CornerFrameLayout cornerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/common/view/CornerFrameLayout");
        }
    }

    private void setCorner(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d45b5e", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float[] fArr = this.radii;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Path path = this.path;
        if (path != null && !path.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.path.reset();
        this.path.addRoundRect(this.rectF, this.radii, Path.Direction.CW);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        setCorner(f, f2, f3, f4);
        this.path.reset();
        this.path.addRoundRect(this.rectF, this.radii, Path.Direction.CW);
        invalidate();
    }

    public CornerFrameLayout(Context context) {
        super(context);
        this.rectF = new RectF();
        this.path = new Path();
        this.radii = new float[8];
    }

    public CornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rectF = new RectF();
        this.path = new Path();
        this.radii = new float[8];
        init(attributeSet);
    }

    public CornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rectF = new RectF();
        this.path = new Path();
        this.radii = new float[8];
        init(attributeSet);
    }
}
