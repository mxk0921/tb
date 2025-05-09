package tb;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.RpxConfigVM;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tx3 extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float g = 10.0f;
    public static final int h = o1p.a(3.0f);
    public static final float i = 14.0f;
    public static final int j = o1p.a(2.0f);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f29014a;
    public final String b;
    public final TextPaint c;
    public final Paint d;
    public int e;
    public float f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793007);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793006);
    }

    public tx3(Activity activity, String str, int i2, int i3) {
        ckf.g(activity, "context");
        ckf.g(str, "text");
        this.f29014a = activity;
        this.b = str;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        Paint paint = new Paint(1);
        this.d = paint;
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        this.f = aVar.f(activity, i);
        textPaint.setTextSize(aVar.f(activity, g));
        paint.setColor(i2);
        textPaint.setColor(i3);
    }

    public static /* synthetic */ Object ipc$super(tx3 tx3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/ClueDrawable");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf664ed", new Object[]{this});
        } else if (this.e == 0) {
            this.e = (int) this.c.measureText(this.b);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66473ff1", new Object[]{this});
            return;
        }
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        this.f = aVar.f(this.f29014a, i);
        this.c.setTextSize(aVar.f(this.f29014a, g));
        this.e = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        float intrinsicWidth = getIntrinsicWidth();
        float intrinsicHeight = getIntrinsicHeight();
        int i2 = h;
        canvas.drawRoundRect(0.0f, 0.0f, intrinsicWidth, intrinsicHeight, i2, i2, this.d);
        int i3 = j;
        canvas.translate(i3, 0.0f);
        kw1.a(canvas, this.c, 0.0f, this.b, 0.0f, getIntrinsicHeight());
        canvas.translate(-i3, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return (int) this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.e + (j * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i2)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }
}
