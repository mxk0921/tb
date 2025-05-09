package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d3 extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f17535a;
    public final List<Integer> b;
    public final float c;
    public final Paint e;
    public int g;
    public final Paint d = new Paint(1);
    public final ArrayList<Shader> f = new ArrayList<>();
    public final Path h = new Path();

    static {
        t2o.a(815793038);
    }

    public d3(float f, List<Integer> list, float f2, int i) {
        ckf.g(list, "colorList");
        this.f17535a = f;
        this.b = list;
        this.c = f2;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(i);
    }

    public static /* synthetic */ Object ipc$super(d3 d3Var, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AICommonInputBackground");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.h);
        float width = getBounds().width() / (this.b.size() - 1);
        int size = this.f.size();
        while (i < size) {
            this.d.setShader(this.f.get(i));
            int i2 = i + 1;
            canvas.drawRect(i * width, 0.0f, i2 * width, getBounds().height(), this.d);
            i = i2;
        }
        float f = this.c;
        float f2 = this.f17535a;
        canvas.drawRoundRect(f, f, getBounds().width() - this.c, getBounds().height() - this.c, f2, f2, this.e);
        canvas.restore();
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
    public void onBoundsChange(Rect rect) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        ckf.g(rect, "bounds");
        super.onBoundsChange(rect);
        int width = rect.width();
        if (width != this.g) {
            this.h.reset();
            float f = width;
            this.h.addRoundRect(0.0f, 0.0f, f, rect.height(), this.f17535a + o1p.a(0.5f), this.f17535a + o1p.a(0.5f), Path.Direction.CW);
            this.g = width;
            int size = this.b.size() - 1;
            float f2 = f / size;
            this.f.clear();
            while (i < size) {
                int i2 = i + 1;
                this.f.add(new LinearGradient(i * f2, 0.0f, i2 * f2, 0.0f, this.b.get(i).intValue(), this.b.get(i2).intValue(), Shader.TileMode.CLAMP));
                i = i2;
            }
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
