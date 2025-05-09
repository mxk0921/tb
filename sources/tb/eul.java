package tb;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eul extends x4g<PointF> {
    public final PointF i = new PointF();
    public final float[] j = new float[2];
    public final PathMeasure k = new PathMeasure();
    public dul l;

    public eul(List<? extends w4g<PointF>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public PointF i(w4g<PointF> w4gVar, float f) {
        dul dulVar = (dul) w4gVar;
        Path j = dulVar.j();
        if (j == null) {
            return w4gVar.b;
        }
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            PointF pointF = (PointF) fmhVar.b(dulVar.g, dulVar.h.floatValue(), dulVar.b, dulVar.c, e(), f, f());
            if (pointF != null) {
                return pointF;
            }
        }
        dul dulVar2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (dulVar2 != dulVar) {
            pathMeasure.setPath(j, false);
            this.l = dulVar;
        }
        float length = f * pathMeasure.getLength();
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
