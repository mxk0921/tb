package tb;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.uikit.iconlist.a;
import tb.mv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class yxa<HINT extends mv1> extends Drawable implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float g = o1p.b(3);
    public static final float h = o1p.b(2);

    /* renamed from: a  reason: collision with root package name */
    public final HINT f32406a;
    public final boolean b;
    public TextPaint c;
    public Paint d;
    public float e;
    public final float f = 0.35f;

    static {
        t2o.a(815793080);
        t2o.a(815792570);
    }

    public yxa(HINT hint, boolean z) {
        this.f32406a = hint;
        this.b = z;
        d();
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    }

    public static /* synthetic */ Object ipc$super(yxa yxaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/drawable/HintDrawable");
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da7e2ec2", new Object[]{this})).floatValue();
        }
        float abs = Math.abs(this.c.getFontMetrics().ascent);
        if (this.d != null) {
            return abs + h;
        }
        return abs;
    }

    public abstract float b();

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43444421", new Object[]{this})).floatValue();
        }
        if (this.e == 0.0f) {
            Paint.FontMetrics fontMetrics = this.c.getFontMetrics();
            this.e = fontMetrics.descent - fontMetrics.ascent;
        }
        return this.e;
    }

    public abstract void d();

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        int c = (int) c();
        if (this.d != null) {
            return (int) (c + (h * 2.0f));
        }
        return c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        float b = b();
        if (this.d != null) {
            b += g * 2.0f;
        }
        return (int) b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.d
    public boolean isLayoutRequested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb97a465", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
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
