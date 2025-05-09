package tb;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ste {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f28262a;
    public final RectF b;
    public final RectF c;
    public final float d;
    public final ImageView.ScaleType e;

    public ste(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f, float f2, ImageView.ScaleType scaleType) {
        RectF rectF5 = new RectF();
        this.f28262a = rectF5;
        RectF rectF6 = new RectF();
        this.b = rectF6;
        RectF rectF7 = new RectF();
        this.c = rectF7;
        RectF rectF8 = new RectF();
        PointF pointF2 = new PointF();
        rectF5.set(rectF);
        rectF6.set(rectF2);
        rectF7.set(rectF3);
        this.e = scaleType;
        this.d = f2;
        rectF8.set(rectF4);
        pointF2.set(pointF);
    }
}
