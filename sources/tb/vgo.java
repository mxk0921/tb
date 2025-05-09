package tb;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vgo implements ohp, pw1.b {

    /* renamed from: a  reason: collision with root package name */
    public final LottieDrawable f30008a;
    public final pw1<Float, Float> b;
    public ghp c;

    public vgo(LottieDrawable lottieDrawable, a aVar, ugo ugoVar) {
        this.f30008a = lottieDrawable;
        ugoVar.c();
        pw1<Float, Float> a2 = ugoVar.b().a();
        this.b = a2;
        aVar.i(a2);
        a2.a(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) >= 0 || i2 * i3 == i) {
            return i3;
        }
        return i3 - 1;
    }

    public static int d(int i, int i2) {
        return i - (a(i, i2) * i2);
    }

    public pw1<Float, Float> f() {
        return this.b;
    }

    @Override // tb.pw1.b
    public void g() {
        this.f30008a.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r7 == (r0.size() - 1)) goto L_0x00a1;
     */
    @Override // tb.ohp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.ghp h(tb.ghp r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vgo.h(tb.ghp):tb.ghp");
    }

    public final ghp i(ghp ghpVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        List<xy4> a2 = ghpVar.a();
        boolean d = ghpVar.d();
        int i = 0;
        for (int size = a2.size() - 1; size >= 0; size--) {
            xy4 xy4Var = a2.get(size);
            xy4 xy4Var2 = a2.get(d(size - 1, a2.size()));
            if (size != 0 || d) {
                pointF = xy4Var2.c();
            } else {
                pointF = ghpVar.b();
            }
            if (size != 0 || d) {
                pointF2 = xy4Var2.b();
            } else {
                pointF2 = pointF;
            }
            PointF a3 = xy4Var.a();
            if (!ghpVar.d() && size == 0 && size == a2.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (!pointF2.equals(pointF) || !a3.equals(pointF) || z) {
                i++;
            } else {
                i += 2;
            }
        }
        ghp ghpVar2 = this.c;
        if (ghpVar2 == null || ghpVar2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new xy4());
            }
            this.c = new ghp(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.c.e(d);
        return this.c;
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
    }
}
