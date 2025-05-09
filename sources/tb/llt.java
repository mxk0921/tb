package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.IconBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class llt extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int h = p1p.a(0.5f);
    public static final int i = p1p.a(13.0f);
    public static final int j = p1p.a(6.0f);

    /* renamed from: a  reason: collision with root package name */
    public final Paint f23402a;
    public final Paint b = new Paint();
    public final Paint c;
    public final IconBean d;
    public final RectF e;
    public final boolean f;
    public final int g;

    static {
        t2o.a(815792596);
    }

    public llt(IconBean iconBean, SearchDomBean searchDomBean) {
        Paint paint = new Paint();
        this.f23402a = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        RectF rectF = new RectF();
        this.e = rectF;
        this.f = false;
        this.d = iconBean;
        b(searchDomBean);
        e(searchDomBean);
        d(searchDomBean);
        paint.setAntiAlias(true);
        this.f = c(searchDomBean);
        paint2.setStrokeWidth(h);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        int measureText = ((int) paint.measureText(iconBean.text)) + (j * 2);
        this.g = measureText;
        rectF.set(0.0f, 0.0f, measureText, i);
    }

    public static /* synthetic */ Object ipc$super(llt lltVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/viewholder/helper/TextIconDrawable");
    }

    public final boolean a(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7860ce7", new Object[]{this, searchDomBean})).booleanValue();
        }
        if (TextUtils.isEmpty(searchDomBean.backgroundGradientStart) || TextUtils.isEmpty(searchDomBean.backgroundGradientEnd)) {
            return false;
        }
        return true;
    }

    public final void b(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf51fda", new Object[]{this, searchDomBean});
            return;
        }
        this.b.setColor(srl.c(searchDomBean.backgroundColor, 0));
        if (a(searchDomBean)) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, searchDomBean.width, 0.0f, Color.parseColor(searchDomBean.backgroundGradientStart), Color.parseColor(searchDomBean.backgroundGradientEnd), Shader.TileMode.CLAMP);
            this.b.setColor(-16711936);
            this.b.setShader(linearGradient);
            return;
        }
        this.b.setShader(null);
    }

    public final boolean c(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a96ba01d", new Object[]{this, searchDomBean})).booleanValue();
        }
        String str = searchDomBean.borderColor;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.c.setColor(srl.c(str, 0));
        return true;
    }

    public final void d(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef799fb", new Object[]{this, searchDomBean});
        } else {
            this.f23402a.setColor(srl.c(searchDomBean.textColor, -1));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.clipRect(this.e);
        if (this.f) {
            RectF rectF = this.e;
            int i3 = h;
            rectF.inset(i3 / 2, i3 / 2);
        }
        RectF rectF2 = this.e;
        int i4 = i;
        canvas.drawRoundRect(rectF2, i4 / 2, i4 / 2, this.b);
        if (this.f) {
            canvas.drawRoundRect(this.e, i4 / 2, i4 / 2, this.c);
        }
        if (this.f || this.b.getColor() != 0) {
            i2 = j;
        }
        canvas.drawText(this.d.text, i2, i4 - this.f23402a.descent(), this.f23402a);
    }

    public final void e(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd577f9f", new Object[]{this, searchDomBean});
            return;
        }
        float f = searchDomBean.textSize;
        if (f > 0.0f) {
            this.f23402a.setTextSize(p1p.a(f));
        } else {
            this.f23402a.setTextSize(p1p.a(10.0f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.g;
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
    public void setAlpha(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i2)});
            return;
        }
        this.f23402a.setAlpha(i2);
        this.b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.b.setColorFilter(colorFilter);
        this.f23402a.setColorFilter(colorFilter);
    }
}
