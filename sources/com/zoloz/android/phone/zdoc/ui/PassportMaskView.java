package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PassportMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366978);
    }

    public PassportMaskView(Context context) {
        super(context);
    }

    private Path createCoverPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("13d9df4f", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        return path;
    }

    private Path createFramePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("dec0d285", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        RectF rectF = this.mCaptureRect;
        float height = rectF.top + (rectF.height() / 2.0f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        RectF rectF2 = this.mCaptureRect;
        float height2 = rectF2.top + ((rectF2.height() * 388.0f) / 448.0f);
        path.moveTo(this.mCaptureRect.left, height2);
        path.lineTo(this.mCaptureRect.right, height2);
        return path;
    }

    public static /* synthetic */ Object ipc$super(PassportMaskView passportMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/PassportMaskView");
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        double d = i;
        int i4 = (int) (0.1d * d);
        int i5 = (int) (0.9d * d);
        double d2 = i2;
        int i6 = (int) (0.15d * d2);
        int i7 = (int) (i6 + (((d * 0.8d) * 448.0d) / 315.0d));
        if (getInvisibleHeight() + i7 > getHeight()) {
            i7 = (int) ((getHeight() - getInvisibleHeight()) - (d2 * 0.05d));
            int width = (int) ((getWidth() - i3) / 2.0f);
            i5 = width + ((int) (((i7 - i6) * 315) / 448.0f));
            i4 = width;
        }
        return new RectF(i4, i6, i5, i7);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.b(this, createCoverPath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return toList(new BaseMaskView.c(this, createFramePath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue();
        }
        return (int) (getHeight() * 0.85d);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
