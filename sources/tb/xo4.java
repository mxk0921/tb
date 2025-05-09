package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xo4 implements ty7, bul, pw1.b, f4g {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f31493a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<fo4> h;
    public final LottieDrawable i;
    public List<bul> j;
    public final aeu k;

    public xo4(LottieDrawable lottieDrawable, a aVar, khp khpVar) {
        this(lottieDrawable, aVar, khpVar.c(), khpVar.d(), f(lottieDrawable, aVar, khpVar.b()), i(khpVar.b()));
    }

    public static List<fo4> f(LottieDrawable lottieDrawable, a aVar, List<tp4> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            fo4 a2 = list.get(i).a(lottieDrawable, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static vx0 i(List<tp4> list) {
        for (int i = 0; i < list.size(); i++) {
            tp4 tp4Var = list.get(i);
            if (tp4Var instanceof vx0) {
                return (vx0) tp4Var;
            }
        }
        return null;
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        aeu aeuVar = this.k;
        if (aeuVar != null) {
            aeuVar.c(t, fmhVar);
        }
    }

    @Override // tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.g) {
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            aeu aeuVar = this.k;
            if (aeuVar != null) {
                matrix2.preConcat(aeuVar.f());
                if (aeuVar.h() == null) {
                    i2 = 100;
                } else {
                    i2 = aeuVar.h().h().intValue();
                }
                i = (int) ((((i2 / 100.0f) * i) / 255.0f) * 255.0f);
            }
            if (!this.i.i0() || !l() || i == 255) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                e(rectF, matrix2, true);
                Paint paint = this.f31493a;
                paint.setAlpha(i);
                fxv.m(canvas, rectF, paint);
            }
            if (z) {
                i = 255;
            }
            List<fo4> list = this.h;
            for (int size = list.size() - 1; size >= 0; size--) {
                fo4 fo4Var = list.get(size);
                if (fo4Var instanceof ty7) {
                    ((ty7) fo4Var).b(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        int size = list.size();
        List<fo4> list3 = this.h;
        ArrayList arrayList = new ArrayList(size + list3.size());
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            fo4 fo4Var = list3.get(size2);
            fo4Var.c(arrayList, list3.subList(0, size2));
            arrayList.add(fo4Var);
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        if (e4gVar.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                e4gVar2 = e4gVar2.a(getName());
                if (e4gVar.c(getName(), i)) {
                    list.add(e4gVar2.i(this));
                }
            }
            if (e4gVar.h(getName(), i)) {
                int e = i + e4gVar.e(getName(), i);
                int i2 = 0;
                while (true) {
                    List<fo4> list2 = this.h;
                    if (i2 < list2.size()) {
                        fo4 fo4Var = list2.get(i2);
                        if (fo4Var instanceof f4g) {
                            ((f4g) fo4Var).d(e4gVar, e, list, e4gVar2);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        aeu aeuVar = this.k;
        if (aeuVar != null) {
            matrix2.preConcat(aeuVar.f());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<fo4> list = this.h;
        for (int size = list.size() - 1; size >= 0; size--) {
            fo4 fo4Var = list.get(size);
            if (fo4Var instanceof ty7) {
                ((ty7) fo4Var).e(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // tb.pw1.b
    public void g() {
        this.i.invalidateSelf();
    }

    @Override // tb.fo4
    public String getName() {
        return this.f;
    }

    @Override // tb.bul
    public Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        aeu aeuVar = this.k;
        if (aeuVar != null) {
            matrix.set(aeuVar.f());
        }
        Path path = this.d;
        path.reset();
        if (this.g) {
            return path;
        }
        List<fo4> list = this.h;
        for (int size = list.size() - 1; size >= 0; size--) {
            fo4 fo4Var = list.get(size);
            if (fo4Var instanceof bul) {
                path.addPath(((bul) fo4Var).getPath(), matrix);
            }
        }
        return path;
    }

    public List<bul> j() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                List<fo4> list = this.h;
                if (i >= list.size()) {
                    break;
                }
                fo4 fo4Var = list.get(i);
                if (fo4Var instanceof bul) {
                    this.j.add((bul) fo4Var);
                }
                i++;
            }
        }
        return this.j;
    }

    public Matrix k() {
        aeu aeuVar = this.k;
        if (aeuVar != null) {
            return aeuVar.f();
        }
        Matrix matrix = this.c;
        matrix.reset();
        return matrix;
    }

    public final boolean l() {
        int i = 0;
        int i2 = 0;
        while (true) {
            List<fo4> list = this.h;
            if (i >= list.size()) {
                return false;
            }
            if ((list.get(i) instanceof ty7) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public xo4(LottieDrawable lottieDrawable, a aVar, String str, boolean z, List<fo4> list, vx0 vx0Var) {
        this.f31493a = new qdg();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = lottieDrawable;
        this.g = z;
        this.h = list;
        if (vx0Var != null) {
            aeu b = vx0Var.b();
            this.k = b;
            b.a(aVar);
            b.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            fo4 fo4Var = list.get(size);
            if (fo4Var instanceof wja) {
                arrayList.add((wja) fo4Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((wja) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
