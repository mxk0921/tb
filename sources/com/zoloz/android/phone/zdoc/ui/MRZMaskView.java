package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MRZMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float[] BOTTOM_RADII = {0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 30.0f, 30.0f, 30.0f};
    public static final float ROUND_CORNER = 30.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends BaseMaskView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245366975);
        }

        public a(Path path) {
            super(MRZMaskView.this, path);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/MRZMaskView$MRZMarkDrawer");
        }

        @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView.a
        public void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
                return;
            }
            canvas.save();
            canvas.clipPath(this.f15162a, Region.Op.INTERSECT);
            canvas.drawColor(ContextCompat.getColor(MRZMaskView.this.getContext(), R.color.z_white_50));
            canvas.restore();
        }
    }

    static {
        t2o.a(245366974);
    }

    public MRZMaskView(Context context) {
        super(context);
    }

    private Path createFramePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("dec0d285", new Object[]{this});
        }
        Path path = new Path();
        RectF rectF = this.mCaptureRect;
        float height = rectF.top + (rectF.height() * 0.75f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("ff378070", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createWriteCoverPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("f0523ea8", new Object[]{this});
        }
        RectF rectF = new RectF(this.mCaptureRect);
        RectF rectF2 = this.mCaptureRect;
        rectF.top = rectF2.top + (rectF2.height() * 0.75f);
        Path path = new Path();
        path.addRoundRect(rectF, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    public static /* synthetic */ Object ipc$super(MRZMaskView mRZMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/MRZMaskView");
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
        return new RectF((int) (0.05f * f), (int) (i2 * 0.2f), (int) f3, (int) (((f3 * 500.0f) / 712.0f) + f2));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.b(this, createPath()), new a(createWriteCoverPath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.c(this, createFramePath()));
    }

    public MRZMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MRZMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
