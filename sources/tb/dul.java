package tb;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dul extends w4g<PointF> {
    public Path q;
    public final w4g<PointF> r;

    public dul(kkh kkhVar, w4g<PointF> w4gVar) {
        super(kkhVar, w4gVar.b, w4gVar.c, w4gVar.d, w4gVar.e, w4gVar.f, w4gVar.g, w4gVar.h);
        this.r = w4gVar;
        i();
    }

    public void i() {
        boolean z;
        T t;
        T t2 = this.c;
        T t3 = this.b;
        if (!(t2 == 0 || t3 == 0)) {
            PointF pointF = (PointF) t2;
            if (((PointF) t3).equals(pointF.x, pointF.y)) {
                z = true;
                if (t3 != 0 && (t = this.c) != 0 && !z) {
                    w4g<PointF> w4gVar = this.r;
                    this.q = fxv.d((PointF) t3, (PointF) t, w4gVar.o, w4gVar.p);
                    return;
                }
                return;
            }
        }
        z = false;
        if (t3 != 0) {
        }
    }

    public Path j() {
        return this.q;
    }
}
