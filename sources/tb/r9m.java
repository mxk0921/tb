package tb;

import android.graphics.PointF;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r9m extends x4g<PointF> {
    public final PointF i = new PointF();

    public r9m(List<w4g<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF i(w4g<PointF> w4gVar, float f) {
        return j(w4gVar, f, f, f);
    }

    /* renamed from: q */
    public PointF j(w4g<PointF> w4gVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = w4gVar.b;
        if (pointF2 == null || (pointF = w4gVar.c) == null) {
            zhh.b("Missing values for keyframe.");
            return new PointF();
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            PointF pointF5 = (PointF) fmhVar.b(w4gVar.g, w4gVar.h.floatValue(), pointF3, pointF4, f, e(), f());
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.i;
        float f4 = pointF3.x;
        float f5 = f4 + (f2 * (pointF4.x - f4));
        float f6 = pointF3.y;
        pointF6.set(f5, f6 + (f3 * (pointF4.y - f6)));
        return pointF6;
    }
}
