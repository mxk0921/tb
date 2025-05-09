package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.axo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ShopTabTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Paint mPaint;
    private final Path mTempPath;

    static {
        t2o.a(912262610);
    }

    public ShopTabTextView(Context context) {
        this(context, null);
    }

    private void createArrowPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04c15b9", new Object[]{this});
            return;
        }
        float height = getHeight() / 3.0f;
        int width = getWidth();
        this.mTempPath.reset();
        float f = width;
        float f2 = height / 4.0f;
        float f3 = f + f2;
        float f4 = height / 12.0f;
        this.mTempPath.moveTo(f3, height - f4);
        float f5 = f - f4;
        float f6 = (height * 7.0f) / 12.0f;
        this.mTempPath.lineTo(f5, f6);
        this.mTempPath.lineTo(f3, f2);
        this.mTempPath.moveTo(f5, f6);
        this.mTempPath.lineTo(f + f6, f6);
        this.mPaint.setColor(getCurrentTextColor());
    }

    private void createViewClipPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62931fd", new Object[]{this});
            return;
        }
        float height = getHeight() / 3.0f;
        int width = getWidth();
        this.mTempPath.reset();
        this.mTempPath.moveTo(0.0f, 0.0f);
        float f = width;
        this.mTempPath.lineTo(f - height, 0.0f);
        this.mTempPath.lineTo(f, height);
        this.mTempPath.lineTo(f, getHeight());
        this.mTempPath.lineTo(0.0f, getHeight());
        this.mTempPath.lineTo(0.0f, 0.0f);
        this.mTempPath.close();
    }

    public static /* synthetic */ Object ipc$super(ShopTabTextView shopTabTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1903493017) {
            super.setShadowLayer(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/skeleton/navbar/ShopTabTextView");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        createViewClipPath();
        int save = canvas.save();
        canvas.clipPath(this.mTempPath);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        createArrowPath();
        canvas.drawPath(this.mTempPath, this.mPaint);
    }

    @Override // android.widget.TextView
    public void setShadowLayer(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7174ff99", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
            return;
        }
        super.setShadowLayer(f, f2, f3, i);
        this.mPaint.setShadowLayer(f, f2, f3, i);
    }

    public ShopTabTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShopTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempPath = new Path();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(axo.a(context, 1.5f));
    }
}
