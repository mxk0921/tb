package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ci9 extends UIImageDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int p;
    public Drawable q;

    static {
        t2o.a(815792721);
    }

    public static /* synthetic */ Object ipc$super(ci9 ci9Var, String str, Object... objArr) {
        if (str.hashCode() == 1458294084) {
            super.c((Drawable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/FilterImageDrawable");
    }

    public void G(int i) {
        Drawable drawable;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bab23f3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.p == i) {
            z = false;
        }
        this.p = i;
        if (z && (drawable = this.q) != null) {
            c(drawable);
            invalidateSelf();
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            return;
        }
        this.q = drawable;
        if ((drawable instanceof BitmapDrawable) && this.p != 0) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Canvas canvas = new Canvas();
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            canvas.setBitmap(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            paint.setColor(this.p);
            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
            drawable = new BitmapDrawable(createBitmap);
        }
        super.c(drawable);
    }
}
