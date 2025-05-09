package com.alipay.android.msp.ui.widget.gifimage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BorderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Path f3744a = new Path();
    public Rect b = new Rect();
    public RectF c = new RectF();
    public int d = -1;
    public GradientDrawable e = null;
    public int f = -1;
    public int g = -1;

    public void clipBorder(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168c38a2", new Object[]{this, canvas});
            return;
        }
        if (this.g > 0 || this.d > 0) {
            canvas.getClipBounds(this.b);
        }
        if (this.d > 0) {
            try {
                this.c.set(this.b);
                Path path = this.f3744a;
                RectF rectF = this.c;
                int i = this.d;
                path.addRoundRect(rectF, i, i, Path.Direction.CW);
                canvas.clipPath(this.f3744a);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.e = null;
        this.b = null;
        this.c = null;
    }

    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.g > 0 || this.d > 0) {
            if (this.e == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                this.e = gradientDrawable;
                gradientDrawable.setShape(0);
                int i = this.g;
                if (i > 0) {
                    this.e.setStroke(i, this.f);
                }
                this.e.setColor(0);
                int i2 = this.d;
                if (i2 > 0) {
                    this.e.setCornerRadius(i2);
                }
            }
            this.e.setBounds(this.b);
            this.e.draw(canvas);
        }
    }

    public void setBorder(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i == this.f && i2 == this.g) {
            z = false;
        }
        this.f = i;
        this.g = i2;
        if (z) {
            this.e = null;
        }
    }

    public void setBorderadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcabadc6", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
