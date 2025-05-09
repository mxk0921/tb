package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30827a;
    public final int b;
    public final Paint c;
    public final RectF d = new RectF();
    public final int e;
    public final int f;
    public Paint g;

    static {
        t2o.a(815792571);
    }

    public wop(int i, int i2, int i3, int i4) {
        this.b = i2;
        this.f30827a = i;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(i);
        this.e = i3;
        this.f = i4;
    }

    public void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d195dda", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
        } else if (this.f30827a != 0) {
            this.d.set(0.0f, 0.0f, i, i2);
            RectF rectF = this.d;
            int i3 = this.b;
            canvas.drawRoundRect(rectF, i3, i3, this.c);
            Paint paint = this.g;
            if (paint != null) {
                RectF rectF2 = this.d;
                int i4 = this.b;
                canvas.drawRoundRect(rectF2, i4, i4, paint);
            }
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.c.setColor(i);
        this.f30827a = i;
    }

    public final void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f)});
        } else {
            this.c.setAlpha((int) (Math.min(Math.max(f, 0.0f), 1.0f) * 255.0f));
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            Paint paint = new Paint();
            this.g = paint;
            paint.setColor(i);
            this.g.setStyle(Paint.Style.STROKE);
            this.g.setStrokeWidth(p1p.a(0.5f));
        } else {
            this.g = null;
        }
    }

    public static wop d(JSONObject jSONObject) {
        wop wopVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wop) ipChange.ipc$dispatch("3f18fd16", new Object[]{jSONObject});
        }
        int b = qrl.b(jSONObject.getString(vaj.KEY_BG_COLOR), 0);
        String string = jSONObject.getString("radius");
        String string2 = jSONObject.getString("paddingLeft");
        String string3 = jSONObject.getString("paddingRight");
        int e = TextUtils.isEmpty(string2) ? 0 : (int) fxh.e(string2);
        int e2 = TextUtils.isEmpty(string3) ? 0 : (int) fxh.e(string3);
        if (TextUtils.isEmpty(string)) {
            wopVar = new wop(b, 0, e, e2);
        } else {
            wopVar = new wop(b, (int) fxh.e(string), e, e2);
        }
        String string4 = jSONObject.getString("opacity");
        if (!TextUtils.isEmpty(string4)) {
            wopVar.f(qrl.d(string4, 1.0f));
        }
        wopVar.g(qrl.b(jSONObject.getString("borderColor"), 0));
        return wopVar;
    }
}
