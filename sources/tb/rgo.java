package tb;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rgo extends Drawable implements ImageLoader.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public int B;
    public int C;

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f27366a;
    public int c;
    public PorterDuff.Mode d;
    public boolean e;
    public String f;
    public ImageLoader.e g;
    public ImageLoader h;
    public boolean i;
    public Bitmap j;
    public final int k;
    public Paint n;
    public BitmapShader o;
    public float q;
    public float[] r;
    public int s;
    public int t;
    public PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public final int l = 119;
    public final Paint m = new Paint(3);
    public final Matrix p = new Matrix();
    public final Path u = new Path();
    public final Path v = new Path();
    public final Rect w = new Rect();
    public final RectF x = new RectF();
    public final RectF y = new RectF();
    public boolean z = true;

    static {
        t2o.a(503317224);
        t2o.a(503316617);
    }

    public rgo(Resources resources) {
        this.k = 160;
        if (resources != null) {
            this.k = resources.getDisplayMetrics().densityDpi;
        }
        this.j = null;
    }

    public static boolean e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357b8844", new Object[]{new Float(f)})).booleanValue();
        }
        if (f > 0.05f) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(rgo rgoVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/drawable/RoundedBitmapDrawable");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05a6e", new Object[]{this});
            return;
        }
        this.A = this.j.getScaledWidth(this.k);
        this.B = this.j.getScaledHeight(this.k);
    }

    public final Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.j;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        return this.f;
    }

    public void d(int i, int i2, int i3, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7667887e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), rect, rect2});
        } else {
            GravityCompat.apply(i, i2, i3, rect, rect2, 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Bitmap bitmap = this.j;
        if (bitmap != null || this.C != 0) {
            int i = this.C;
            if (i != 0) {
                canvas.drawColor(i);
                return;
            }
            q();
            if (this.m.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.w, this.m);
            } else if (this.r == null) {
                int i2 = this.s;
                if (i2 > 0) {
                    RectF rectF = this.x;
                    float f = this.q - i2;
                    canvas.drawRoundRect(rectF, f, f, this.m);
                    RectF rectF2 = this.y;
                    float f2 = this.q;
                    canvas.drawRoundRect(rectF2, f2, f2, this.n);
                    return;
                }
                RectF rectF3 = this.x;
                float f3 = this.q;
                canvas.drawRoundRect(rectF3, f3, f3, this.m);
            } else if (this.s > 0) {
                canvas.drawPath(this.u, this.m);
                canvas.drawPath(this.v, this.n);
            } else {
                canvas.drawPath(this.u, this.m);
            }
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c889e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.h == null) {
            this.h = od0.D().a();
        }
        this.h.h(!z);
        if (z && this.h.a() == 1) {
            o(this.f);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f27366a = null;
        this.d = null;
        this.c = 0;
        this.e = false;
        this.b = PorterDuff.Mode.SRC_IN;
        this.C = 0;
        this.j = null;
        this.w.setEmpty();
        this.y.setEmpty();
        this.x.setEmpty();
        this.p.reset();
        this.r = null;
        this.q = 0.0f;
        this.s = 0;
        this.B = -1;
        this.A = -1;
        this.o = null;
        this.m.reset();
        Paint paint = this.n;
        if (paint != null) {
            paint.reset();
        }
        this.z = true;
        this.g = null;
        this.f = null;
        this.u.reset();
        this.v.reset();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
        }
        return this.m.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorFilter) ipChange.ipc$dispatch("65433e22", new Object[]{this});
        }
        return this.m.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        if (this.l != 119 || (bitmap = this.j) == null || bitmap.hasAlpha() || this.m.getAlpha() < 255 || e(this.q)) {
            return -3;
        }
        return -1;
    }

    public void h(Bitmap bitmap) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
        } else if (this.j != bitmap) {
            this.C = 0;
            this.j = bitmap;
            if (bitmap != null) {
                a();
                int width = this.j.getWidth();
                int height = this.j.getHeight();
                int width2 = getBounds().width();
                int height2 = getBounds().height();
                float f3 = 0.0f;
                if (width * height2 > width2 * height) {
                    f = height2 / height;
                    f3 = (width2 - (width * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    float f4 = width2 / width;
                    f2 = (height2 - (height * f4)) * 0.5f;
                    f = f4;
                }
                this.p.setScale(f, f);
                this.p.postTranslate(Math.round(f3), Math.round(f2));
                Bitmap bitmap2 = this.j;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.o = new BitmapShader(bitmap2, tileMode, tileMode);
            } else {
                this.B = -1;
                this.A = -1;
                this.o = null;
            }
            this.z = true;
            invalidateSelf();
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.C = i;
        this.j = null;
        invalidateSelf();
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63a9a90", new Object[]{this, new Integer(i)});
        } else if (this.t != i) {
            this.t = i;
            if (this.n == null) {
                Paint paint = new Paint(3);
                this.n = paint;
                paint.setStyle(Paint.Style.STROKE);
            }
            this.n.setColor(i);
            invalidateSelf();
        }
    }

    public void k(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
            return;
        }
        float[] fArr2 = this.r;
        if (fArr != fArr2) {
            if (fArr == null || fArr2 == null || fArr[0] != fArr2[0] || fArr[1] != fArr2[1] || fArr[2] != fArr2[2] || fArr[3] != fArr2[3]) {
                this.q = 0.0f;
                this.r = fArr;
                this.m.setShader(this.o);
                invalidateSelf();
            }
        }
    }

    public void l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (this.q != f) {
            this.r = null;
            if (e(f)) {
                this.m.setShader(this.o);
            } else {
                this.m.setShader(null);
            }
            this.q = f;
            invalidateSelf();
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac2220d", new Object[]{this, new Integer(i)});
        } else if (this.s != i) {
            this.s = i;
            if (this.n == null) {
                Paint paint = new Paint(3);
                this.n = paint;
                paint.setStyle(Paint.Style.STROKE);
            }
            this.n.setStrokeWidth(i);
            invalidateSelf();
        }
    }

    public void n(ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56ebe52", new Object[]{this, eVar});
        } else {
            this.g = eVar;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (str == null || !str.startsWith(gpe.BASE64_TAG)) {
            if (this.h == null) {
                this.h = od0.D().a();
            }
            this.h.e(o.J(), str, -1, -1, this);
            return;
        }
        Bitmap a2 = s6o.a(str);
        if (a2 != null) {
            h(a2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.z = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            return;
        }
        ImageLoader.e eVar = this.g;
        if (eVar == null) {
            return;
        }
        if (eVar instanceof ImageLoader.d) {
            ((ImageLoader.d) eVar).onImageLoadFailed(i);
        } else {
            eVar.onImageLoadFailed();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf70c36", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        if (z) {
            this.f = null;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c4e8c7", new Object[]{this});
        } else if (this.z) {
            d(this.l, this.A, this.B, getBounds(), this.w);
            this.x.set(this.w);
            if (this.s > 0) {
                this.y.set(this.w);
                RectF rectF = this.y;
                float f = this.s / 2;
                rectF.inset(f, f);
                Rect rect = this.w;
                int i = this.s;
                rect.inset(i, i);
                this.x.set(this.w);
            }
            float[] fArr = this.r;
            if (fArr != null) {
                Path path = this.v;
                RectF rectF2 = this.y;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, fArr, direction);
                this.u.addRoundRect(this.x, this.r, direction);
            }
            BitmapShader bitmapShader = this.o;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.p);
                this.m.setShader(this.o);
            }
            this.z = false;
        }
    }

    public final boolean r(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c6663d", new Object[]{this, iArr})).booleanValue();
        }
        ColorStateList colorStateList = this.f27366a;
        if (colorStateList == null || this.b == null) {
            this.e = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            PorterDuff.Mode mode = this.b;
            if (!(this.e && colorForState == this.c && mode == this.d)) {
                setColorFilter(colorForState, mode);
                this.c = colorForState;
                this.d = mode;
                this.e = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (i != this.m.getAlpha()) {
            this.m.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2271105", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b194884", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dac540", new Object[]{this, colorStateList});
            return;
        }
        this.f27366a = colorStateList;
        r(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8699ed2", new Object[]{this, mode});
            return;
        }
        this.b = mode;
        r(getState());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
        } else if (!this.i) {
            h(bitmapDrawable.getBitmap());
            ImageLoader.e eVar = this.g;
            if (eVar == null) {
                return;
            }
            if (eVar instanceof ImageLoader.d) {
                ((ImageLoader.d) eVar).onImageLoaded(str, bitmapDrawable);
            } else {
                eVar.onImageLoaded(bitmapDrawable);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
    public void onImageLoadFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            return;
        }
        ImageLoader.e eVar = this.g;
        if (eVar != null) {
            eVar.onImageLoadFailed();
        }
    }
}
