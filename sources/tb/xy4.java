package tb;

import android.graphics.PointF;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xy4 {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f31677a;
    public final PointF b;
    public final PointF c;

    public xy4() {
        this.f31677a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.f31677a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.f31677a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(float f, float f2) {
        this.c.set(f, f2);
    }

    public String toString() {
        PointF pointF = this.c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f31677a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public xy4(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f31677a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
