package com.taobao.search.musie.img;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import tb.bwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSImageView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int filterColor;
    private final Paint filterPaint;
    private UIImageDrawable innerDrawable;

    static {
        t2o.a(815792728);
    }

    public MUSImageView(Context context) {
        super(context);
        bwh bwhVar = new bwh();
        this.innerDrawable = bwhVar;
        bwhVar.setCallback(this);
        Paint paint = new Paint(1);
        this.filterPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static /* synthetic */ Object ipc$super(MUSImageView mUSImageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/MUSImageView");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        this.innerDrawable.draw(canvas);
        if (this.filterColor != 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.filterPaint);
        }
    }

    public UIImageDrawable getInnerDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UIImageDrawable) ipChange.ipc$dispatch("c54eb43a", new Object[]{this});
        }
        return this.innerDrawable;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.innerDrawable.setBounds(0, 0, i, i2);
        }
    }

    public void setFilterColor(int i) {
        boolean z = true;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bab23f3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.filterColor == i) {
            z = false;
        }
        this.filterColor = i;
        this.filterPaint.setColor(i);
        if (i != 0) {
            i2 = 2;
        }
        setLayerType(i2, null);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }
}
