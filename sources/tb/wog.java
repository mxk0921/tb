package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wog implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f30822a;
    public float b;
    public Paint c;
    public final String d;

    static {
        t2o.a(779092311);
        t2o.a(620757008);
    }

    public wog(n3s n3sVar) {
        String str = n3sVar.f24489a;
        this.d = str;
        x5t.k("LimitBitmapProcessor", "load url:" + str);
    }

    @Override // tb.ad2
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return "W" + this.f30822a + "$H" + this.b;
        }
        return "W" + this.f30822a + "$H" + this.b + "url" + this.d;
    }

    @Override // tb.ad2
    public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
        }
        try {
            if (this.c == null) {
                Paint paint = new Paint();
                this.c = paint;
                paint.setAntiAlias(true);
            }
            this.f30822a = bitmap.getWidth();
            this.b = bitmap.getHeight();
            int byteCount = bitmap.getByteCount();
            x5t.k("LimitBitmapProcessor", "process url:" + this.d);
            if (byteCount <= 1048576) {
                return bitmap;
            }
            float f = byteCount > 10485760 ? 0.01f : 0.1f;
            float f2 = this.f30822a * f;
            this.f30822a = f2;
            float f3 = this.b * f;
            this.b = f3;
            Bitmap a2 = aVar.a((int) f2, (int) f3, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                bitmapShader.setLocalMatrix(matrix);
                this.c.setShader(bitmapShader);
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, this.f30822a, this.b);
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.c);
                x5t.k("LimitBitmapProcessor", "scale bitmap size to 0.1:" + this.d);
                HashMap hashMap = new HashMap();
                hashMap.put("url", this.d);
                hashMap.put("size", String.valueOf(byteCount));
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "LoaderBigBitmap", hashMap);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                bitmap = a2;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("t", th.getMessage());
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "LoaderBitmapCrash", hashMap2);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
