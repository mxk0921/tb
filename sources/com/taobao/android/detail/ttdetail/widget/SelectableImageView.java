package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SelectableImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mPaint;
    private Path mStatePath = null;
    private float mStrokeWidth;

    static {
        t2o.a(912262919);
    }

    public SelectableImageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        float f = tq4.d(this).getResources().getDisplayMetrics().density * 4.0f;
        this.mStrokeWidth = f;
        this.mPaint.setStrokeWidth(f);
        this.mPaint.setColor(-65536);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setAntiAlias(true);
    }

    private void initPath(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da221c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Path path = new Path();
        this.mStatePath = path;
        path.moveTo(0.0f, 0.0f);
        float f = i3 - i;
        this.mStatePath.lineTo(f, 0.0f);
        float f2 = i4 - i2;
        this.mStatePath.lineTo(f, f2);
        this.mStatePath.lineTo(0.0f, f2);
        this.mStatePath.close();
    }

    public static /* synthetic */ Object ipc$super(SelectableImageView selectableImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1540204496) {
            super.setSelected(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/SelectableImageView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawPath(this.mStatePath, this.mPaint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        initPath(i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setSelected(z);
        invalidate();
    }

    public SelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
