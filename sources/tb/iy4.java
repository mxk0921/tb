package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iy4 implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f21640a;
    public final int b;

    public iy4() {
        this(0.0f, 0);
    }

    @Override // tb.ad2
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "W" + this.f21640a + "$C" + this.b;
    }

    @Override // tb.ad2
    public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
        float f;
        float f2;
        Bitmap.Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (min - bitmap.getWidth()) / 2;
        int height = (min - bitmap.getHeight()) / 2;
        float f3 = min / 2.0f;
        float f4 = this.f21640a;
        if (f4 > 0.0f) {
            f2 = f3 / f4;
            f = f3 + f2;
        } else {
            f = f3;
            f2 = 0.0f;
        }
        int i = (int) (f * 2.0f);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = PexodeOptions.CONFIG;
        }
        Bitmap a2 = aVar.a(i, i, config);
        Canvas canvas = new Canvas(a2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (!(width == 0 && height == 0)) {
            Matrix matrix = new Matrix();
            matrix.setTranslate(width, height);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        canvas.drawCircle(f, f, f3, paint);
        if (this.f21640a > 0.0f) {
            Path path = new Path();
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setColor(this.b);
            paint2.setStrokeWidth(f2);
            path.addCircle(f, f, f - (f2 / 2.0f), Path.Direction.CCW);
            canvas.drawPath(path, paint2);
        }
        return a2;
    }

    public iy4(float f, int i) {
        this.f21640a = f;
        this.b = i;
    }
}
