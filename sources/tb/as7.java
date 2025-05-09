package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class as7 extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM = 2;
    public static final int CENTER = 1;
    public static final int TOP = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f15972a;
    public RectF b;
    public int d;
    public int c = 0;
    public int e = 1;

    static {
        t2o.a(806355518);
    }

    public as7(Context context) {
        this.d = a(context, 2.0f);
        Paint paint = new Paint();
        this.f15972a = paint;
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
    }

    public static /* synthetic */ Object ipc$super(as7 as7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1924089730) {
            super.setBounds(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == -1028087344) {
            return new Integer(super.getIntrinsicHeight());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/widget/tab/DividerDrawable");
        }
    }

    public int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{this, context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.f15972a.setColor(i);
        }
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0b321f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i;
        this.c = i2;
        invalidateSelf();
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
        } else if (i == 0 || i == 1 || i == 2) {
            this.e = i;
        } else {
            throw new IllegalArgumentException("Gravity must be one of 0(DividerDrawable.TOP)、1(DividerDrawable.CENTER) and 2(DividerDrawable.BOTTOM)");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0);
        int i = this.c;
        if (i != 0) {
            RectF rectF = this.b;
            float f = rectF.bottom;
            if (i < f) {
                int i2 = (int) ((f - i) / 2.0f);
                int i3 = this.e;
                if (i3 == 0) {
                    canvas.drawRect(rectF.left, rectF.top, rectF.right, f - (i2 * 2), this.f15972a);
                    return;
                } else if (i3 == 1) {
                    float f2 = i2;
                    canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, f - f2, this.f15972a);
                    return;
                } else if (i3 == 2) {
                    canvas.drawRect(rectF.left, rectF.top + (i2 * 2), rectF.right, f, this.f15972a);
                    return;
                } else {
                    return;
                }
            }
        }
        canvas.drawRect(this.b, this.f15972a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.f15972a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.setBounds(i, i2, i3, i4);
        this.b = new RectF(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.f15972a.setColorFilter(colorFilter);
        }
    }
}
