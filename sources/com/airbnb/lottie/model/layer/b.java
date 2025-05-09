package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.e4g;
import tb.fmh;
import tb.fxv;
import tb.jx0;
import tb.k6g;
import tb.kkh;
import tb.nhp;
import tb.pw1;
import tb.w1w;
import tb.ylh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b extends com.airbnb.lottie.model.layer.a {
    public pw1<Float, Float> D;
    public Boolean I;
    public Boolean J;
    public final List<com.airbnb.lottie.model.layer.a> E = new ArrayList();
    public final RectF F = new RectF();
    public final RectF G = new RectF();
    public final Paint H = new Paint();
    public boolean K = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1857a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f1857a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1857a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, kkh kkhVar) {
        super(lottieDrawable, layer);
        int i;
        com.airbnb.lottie.model.layer.a aVar;
        jx0 u = layer.u();
        if (u != null) {
            pw1<Float, Float> a2 = u.a();
            this.D = a2;
            i(a2);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(kkhVar.k().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size >= 0) {
                Layer layer2 = list.get(size);
                com.airbnb.lottie.model.layer.a u2 = com.airbnb.lottie.model.layer.a.u(this, layer2, lottieDrawable, kkhVar);
                if (u2 != null) {
                    longSparseArray.put(u2.y().d(), u2);
                    if (aVar2 != null) {
                        aVar2.I(u2);
                        aVar2 = null;
                    } else {
                        ((ArrayList) this.E).add(0, u2);
                        int i2 = a.f1857a[layer2.h().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            aVar2 = u2;
                        }
                    }
                }
                size--;
            }
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) longSparseArray.get(longSparseArray.keyAt(i));
            if (!(aVar3 == null || (aVar = (com.airbnb.lottie.model.layer.a) longSparseArray.get(aVar3.y().j())) == null)) {
                aVar3.K(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void H(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.E;
            if (i2 < arrayList.size()) {
                ((com.airbnb.lottie.model.layer.a) arrayList.get(i2)).d(e4gVar, i, list, e4gVar2);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void J(boolean z) {
        super.J(z);
        Iterator it = ((ArrayList) this.E).iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.model.layer.a) it.next()).J(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void L(float f) {
        super.L(f);
        pw1<Float, Float> pw1Var = this.D;
        Layer layer = this.q;
        if (pw1Var != null) {
            f = ((this.D.h().floatValue() * layer.b().i()) - layer.b().p()) / (this.p.L().e() + 0.01f);
        }
        if (this.D == null) {
            f -= layer.r();
        }
        if (layer.v() != 0.0f && !"__container".equals(layer.i())) {
            f /= layer.v();
        }
        ArrayList arrayList = (ArrayList) this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).L(f);
        }
    }

    public boolean O() {
        if (this.J == null) {
            List<com.airbnb.lottie.model.layer.a> list = this.E;
            for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                com.airbnb.lottie.model.layer.a aVar = (com.airbnb.lottie.model.layer.a) ((ArrayList) list).get(size);
                if (aVar instanceof nhp) {
                    if (aVar.z()) {
                        this.J = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof b) && ((b) aVar).O()) {
                    this.J = Boolean.TRUE;
                    return true;
                }
            }
            this.J = Boolean.FALSE;
        }
        return this.J.booleanValue();
    }

    public boolean P() {
        if (this.I == null) {
            if (A()) {
                this.I = Boolean.TRUE;
                return true;
            }
            ArrayList arrayList = (ArrayList) this.E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((com.airbnb.lottie.model.layer.a) arrayList.get(size)).A()) {
                    this.I = Boolean.TRUE;
                    return true;
                }
            }
            this.I = Boolean.FALSE;
        }
        return this.I.booleanValue();
    }

    public void Q(boolean z) {
        this.K = z;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        if (t != ylh.TIME_REMAP) {
            return;
        }
        if (fmhVar == null) {
            pw1<Float, Float> pw1Var = this.D;
            if (pw1Var != null) {
                pw1Var.n(null);
                return;
            }
            return;
        }
        w1w w1wVar = new w1w(fmhVar);
        this.D = w1wVar;
        w1wVar.a(this);
        i(this.D);
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        List<com.airbnb.lottie.model.layer.a> list = this.E;
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((com.airbnb.lottie.model.layer.a) ((ArrayList) list).get(size)).e(rectF2, this.o, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        RectF rectF = this.G;
        Layer layer = this.q;
        rectF.set(0.0f, 0.0f, layer.l(), layer.k());
        matrix.mapRect(rectF);
        boolean i0 = this.p.i0();
        List<com.airbnb.lottie.model.layer.a> list = this.E;
        if (!i0 || ((ArrayList) list).size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Paint paint = this.H;
            paint.setAlpha(i);
            fxv.m(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        ArrayList arrayList = (ArrayList) list;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((this.K || !"__container".equals(layer.i())) && !rectF.isEmpty()) {
                z2 = canvas.clipRect(rectF);
            } else {
                z2 = true;
            }
            if (z2) {
                ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).b(canvas, matrix, i);
            }
        }
        canvas.restore();
        k6g.a("CompositionLayer#draw");
    }
}
