package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DefaultMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mCornerPaint;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends BaseMaskView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245366970);
        }

        public a(Path path) {
            super(DefaultMaskView.this, path);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/DefaultMaskView$CornerFrameDrawer");
        }

        @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView.a
        public void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
                return;
            }
            if (DefaultMaskView.access$000(DefaultMaskView.this) == null) {
                DefaultMaskView.access$100(DefaultMaskView.this);
            }
            canvas.save();
            canvas.drawPath(this.f15162a, DefaultMaskView.access$000(DefaultMaskView.this));
            canvas.restore();
        }
    }

    static {
        t2o.a(245366969);
    }

    public DefaultMaskView(Context context) {
        super(context);
    }

    public static /* synthetic */ Paint access$000(DefaultMaskView defaultMaskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("8b6d078d", new Object[]{defaultMaskView});
        }
        return defaultMaskView.mCornerPaint;
    }

    public static /* synthetic */ void access$100(DefaultMaskView defaultMaskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9cbcfd", new Object[]{defaultMaskView});
        } else {
            defaultMaskView.createPaint();
        }
    }

    private Path createCornersPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("b3e25516", new Object[]{this});
        }
        RectF rectF = this.mCaptureRect;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        Path path = new Path();
        float f5 = (int) (getContext().getResources().getDisplayMetrics().density * 20.0f);
        float f6 = f2 + f5;
        path.moveTo(f, f6);
        path.lineTo(f, f2);
        float f7 = f + f5;
        path.lineTo(f7, f2);
        float f8 = f3 - f5;
        path.moveTo(f8, f2);
        path.lineTo(f3, f2);
        path.lineTo(f3, f6);
        float f9 = f4 - f5;
        path.moveTo(f, f9);
        path.lineTo(f, f4);
        path.lineTo(f7, f4);
        path.moveTo(f8, f4);
        path.lineTo(f3, f4);
        path.lineTo(f3, f9);
        return path;
    }

    private void createPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5789f849", new Object[]{this});
            return;
        }
        CornerPathEffect cornerPathEffect = new CornerPathEffect((int) (getContext().getResources().getDisplayMetrics().density * 5.0f));
        int color = getResources().getColor(R.color.zdoc_line_cornor_color);
        Paint paint = new Paint(4);
        this.mCornerPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mCornerPaint.setColor(color);
        this.mCornerPaint.setAntiAlias(true);
        this.mCornerPaint.setStrokeWidth(((int) (getStokeWidth() * getContext().getResources().getDisplayMetrics().density)) * 3);
        this.mCornerPaint.setPathEffect(cornerPathEffect);
    }

    private Path createPath(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("d10026d0", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 0.0f, 0.0f, Path.Direction.CCW);
        return path;
    }

    public static /* synthetic */ Object ipc$super(DefaultMaskView defaultMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/DefaultMaskView");
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        float f3 = i * 0.95f;
        return new RectF((int) (0.05f * f), (int) (i2 * 0.2f), (int) f3, (int) (((f3 * 436.0f) / 682.0f) + f2));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.b(this, createPath(i, i2)));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.c(this, createPath(i, i2)), new a(createCornersPath()));
    }

    public DefaultMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DefaultMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
