package tb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ghp {

    /* renamed from: a  reason: collision with root package name */
    public final List<xy4> f20011a;
    public PointF b;
    public boolean c;

    public ghp(PointF pointF, boolean z, List<xy4> list) {
        this.b = pointF;
        this.c = z;
        this.f20011a = new ArrayList(list);
    }

    public List<xy4> a() {
        return this.f20011a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(ghp ghpVar, ghp ghpVar2, float f) {
        boolean z;
        if (this.b == null) {
            this.b = new PointF();
        }
        if (ghpVar.d() || ghpVar2.d()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (ghpVar.a().size() != ghpVar2.a().size()) {
            zhh.b("Curves must have the same number of control points. Shape 1: " + ghpVar.a().size() + "\tShape 2: " + ghpVar2.a().size());
        }
        int min = Math.min(ghpVar.a().size(), ghpVar2.a().size());
        ArrayList arrayList = (ArrayList) this.f20011a;
        if (arrayList.size() < min) {
            for (int size = arrayList.size(); size < min; size++) {
                arrayList.add(new xy4());
            }
        } else if (arrayList.size() > min) {
            for (int size2 = arrayList.size() - 1; size2 >= min; size2--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF b = ghpVar.b();
        PointF b2 = ghpVar2.b();
        f(uvi.k(b.x, b2.x, f), uvi.k(b.y, b2.y, f));
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            xy4 xy4Var = ghpVar.a().get(size3);
            xy4 xy4Var2 = ghpVar2.a().get(size3);
            PointF a2 = xy4Var.a();
            PointF b3 = xy4Var.b();
            PointF c = xy4Var.c();
            PointF a3 = xy4Var2.a();
            PointF b4 = xy4Var2.b();
            PointF c2 = xy4Var2.c();
            ((xy4) arrayList.get(size3)).d(uvi.k(a2.x, a3.x, f), uvi.k(a2.y, a3.y, f));
            ((xy4) arrayList.get(size3)).e(uvi.k(b3.x, b4.x, f), uvi.k(b3.y, b4.y, f));
            ((xy4) arrayList.get(size3)).f(uvi.k(c.x, c2.x, f), uvi.k(c.y, c2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f20011a.size() + "closed=" + this.c + '}';
    }

    public ghp() {
        this.f20011a = new ArrayList();
    }
}
