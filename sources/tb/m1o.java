package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m1o implements ty7, bul, wja, pw1.b, g4g {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f23723a = new Matrix();
    public final Path b = new Path();
    public final LottieDrawable c;
    public final a d;
    public final String e;
    public final boolean f;
    public final pw1<Float, Float> g;
    public final pw1<Float, Float> h;
    public final aeu i;
    public xo4 j;

    public m1o(LottieDrawable lottieDrawable, a aVar, l1o l1oVar) {
        this.c = lottieDrawable;
        this.d = aVar;
        this.e = l1oVar.c();
        this.f = l1oVar.f();
        pw1<Float, Float> a2 = l1oVar.b().a();
        this.g = a2;
        aVar.i(a2);
        a2.a(this);
        pw1<Float, Float> a3 = l1oVar.d().a();
        this.h = a3;
        aVar.i(a3);
        a3.a(this);
        aeu b = l1oVar.e().b();
        this.i = b;
        b.a(aVar);
        b.b(this);
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        if (!this.i.c(t, fmhVar)) {
            if (t == ylh.REPEATER_COPIES) {
                this.g.n(fmhVar);
            } else if (t == ylh.REPEATER_OFFSET) {
                this.h.n(fmhVar);
            }
        }
    }

    @Override // tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        aeu aeuVar = this.i;
        float floatValue3 = aeuVar.i().h().floatValue() / 100.0f;
        float floatValue4 = aeuVar.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f23723a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(aeuVar.g(f + floatValue2));
            this.j.b(canvas, matrix2, (int) (i * uvi.k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        this.j.c(list, list2);
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // tb.wja
    public void f(ListIterator<fo4> listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new xo4(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // tb.pw1.b
    public void g() {
        this.c.invalidateSelf();
    }

    @Override // tb.fo4
    public String getName() {
        return this.e;
    }

    @Override // tb.bul
    public Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f23723a;
            matrix.set(this.i.g(i + floatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
