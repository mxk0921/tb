package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class kw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792317);
    }

    public static final void a(Canvas canvas, Paint paint, float f, String str, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6115368", new Object[]{canvas, paint, new Float(f), str, new Float(f2), new Float(f3)});
            return;
        }
        ckf.g(canvas, "canvas");
        ckf.g(paint, "paint");
        ckf.g(str, "text");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        ckf.f(fontMetrics, "getFontMetrics(...)");
        canvas.drawText(str, f, f2 + ((((f3 - f2) - fontMetrics.bottom) - fontMetrics.top) / 2.0f), paint);
    }
}
