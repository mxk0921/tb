package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class iwa extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f21609a;
    public Path b = new Path();
    public final Drawable c;

    static {
        t2o.a(689963197);
    }

    public iwa(Drawable drawable) {
        ckf.g(drawable, "innerDrawable");
        this.c = drawable;
        Paint paint = new Paint(1);
        this.f21609a = paint;
        paint.setColor(-1);
    }

    public static /* synthetic */ Object ipc$super(iwa iwaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/view/HighLightDrawable");
    }

    public final void a(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2577128a", new Object[]{this, path});
        } else {
            this.b = path;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        this.c.setBounds(getBounds());
        Path path = this.b;
        if (path != null) {
            ckf.d(path);
            if (!path.isEmpty()) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f21609a, 31);
                this.c.draw(canvas);
                this.f21609a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Path path2 = this.b;
                ckf.d(path2);
                canvas.drawPath(path2, this.f21609a);
                this.f21609a.setXfermode(null);
                canvas.restoreToCount(saveLayer);
                return;
            }
        }
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return this.c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }
}
