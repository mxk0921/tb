package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qlt extends com.airbnb.lottie.model.layer.a {
    public final StringBuilder D = new StringBuilder(2);
    public final RectF E = new RectF();
    public final Matrix F = new Matrix();
    public final Paint G = new a(this, 1);
    public final Paint H = new b(this, 1);
    public final Map<mu9, List<xo4>> I = new HashMap();
    public final LongSparseArray<String> J = new LongSparseArray<>();
    public final plt K;
    public final LottieDrawable L;
    public final kkh M;
    public final pw1<Integer, Integer> N;
    public pw1<Integer, Integer> O;
    public final pw1<Integer, Integer> P;
    public pw1<Integer, Integer> Q;
    public final pw1<Float, Float> R;
    public pw1<Float, Float> S;
    public final pw1<Float, Float> T;
    public pw1<Float, Float> U;
    public pw1<Float, Float> V;
    public pw1<Typeface, Typeface> W;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Paint {
        public a(qlt qltVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends Paint {
        public b(qlt qltVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26818a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f26818a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26818a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26818a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public qlt(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        jx0 jx0Var;
        jx0 jx0Var2;
        ix0 ix0Var;
        ix0 ix0Var2;
        this.L = lottieDrawable;
        this.M = layer.b();
        plt d = layer.s().a();
        this.K = d;
        d.a(this);
        i(d);
        tx0 t = layer.t();
        if (!(t == null || (ix0Var2 = t.f29013a) == null)) {
            pw1<Integer, Integer> a2 = ix0Var2.a();
            this.N = a2;
            a2.a(this);
            i(a2);
        }
        if (!(t == null || (ix0Var = t.b) == null)) {
            pw1<Integer, Integer> a3 = ix0Var.a();
            this.P = a3;
            a3.a(this);
            i(a3);
        }
        if (!(t == null || (jx0Var2 = t.c) == null)) {
            pw1<Float, Float> a4 = jx0Var2.a();
            this.R = a4;
            a4.a(this);
            i(a4);
        }
        if (t != null && (jx0Var = t.d) != null) {
            pw1<Float, Float> a5 = jx0Var.a();
            this.T = a5;
            a5.a(this);
            i(a5);
        }
    }

    public final void O(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = c.f26818a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    public final String P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        LongSparseArray<String> longSparseArray = this.J;
        long j = codePointAt;
        if (longSparseArray.indexOfKey(j) >= 0) {
            return longSparseArray.get(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        longSparseArray.put(j, sb2);
        return sb2;
    }

    public final void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public final void R(mu9 mu9Var, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        List<xo4> Y = Y(mu9Var);
        for (int i = 0; i < Y.size(); i++) {
            Path path = Y.get(i).getPath();
            path.computeBounds(this.E, false);
            Matrix matrix2 = this.F;
            matrix2.set(matrix);
            matrix2.preTranslate(0.0f, (-documentData.g) * fxv.e());
            matrix2.preScale(f, f);
            path.transform(matrix2);
            boolean z = documentData.k;
            Paint paint = this.H;
            Paint paint2 = this.G;
            if (z) {
                U(path, paint2, canvas);
                U(path, paint, canvas);
            } else {
                U(path, paint, canvas);
                U(path, paint2, canvas);
            }
        }
    }

    public final void S(String str, DocumentData documentData, Canvas canvas) {
        boolean z = documentData.k;
        Paint paint = this.H;
        Paint paint2 = this.G;
        if (z) {
            Q(str, paint2, canvas);
            Q(str, paint, canvas);
            return;
        }
        Q(str, paint, canvas);
        Q(str, paint2, canvas);
    }

    public final void T(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String P = P(str, i);
            i += P.length();
            S(P, documentData, canvas);
            canvas.translate(this.G.measureText(P) + f, 0.0f);
        }
    }

    public final void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final void V(String str, DocumentData documentData, Matrix matrix, gu9 gu9Var, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            mu9 mu9Var = this.M.c().get(mu9.c(str.charAt(i), gu9Var.a(), gu9Var.c()));
            if (mu9Var != null) {
                R(mu9Var, matrix, f2, documentData, canvas);
                float b2 = ((float) mu9Var.b()) * f2 * fxv.e() * f;
                float f3 = documentData.e / 10.0f;
                pw1<Float, Float> pw1Var = this.U;
                if (pw1Var != null) {
                    floatValue = pw1Var.h().floatValue();
                } else {
                    pw1<Float, Float> pw1Var2 = this.T;
                    if (pw1Var2 != null) {
                        floatValue = pw1Var2.h().floatValue();
                    }
                    canvas.translate(b2 + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(b2 + (f3 * f), 0.0f);
            }
        }
    }

    public final void W(DocumentData documentData, Matrix matrix, gu9 gu9Var, Canvas canvas) {
        float f;
        pw1<Float, Float> pw1Var = this.V;
        if (pw1Var != null) {
            f = pw1Var.h().floatValue();
        } else {
            f = documentData.c;
        }
        float f2 = f / 100.0f;
        float g = fxv.g(matrix);
        String str = documentData.f1846a;
        float e = documentData.f * fxv.e();
        List<String> a0 = a0(str);
        int size = a0.size();
        for (int i = 0; i < size; i++) {
            String str2 = a0.get(i);
            float Z = Z(str2, gu9Var, f2, g);
            canvas.save();
            O(documentData.d, canvas, Z);
            canvas.translate(0.0f, (i * e) - (((size - 1) * e) / 2.0f));
            V(str2, documentData, matrix, gu9Var, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[LOOP:0: B:20:0x0089->B:21:0x008b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(com.airbnb.lottie.model.DocumentData r9, tb.gu9 r10, android.graphics.Canvas r11) {
        /*
            r8 = this;
            android.graphics.Typeface r10 = r8.b0(r10)
            if (r10 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r9.f1846a
            com.airbnb.lottie.LottieDrawable r1 = r8.L
            tb.vkt r1 = r1.b0()
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = r8.getName()
            java.lang.String r0 = r1.a(r2, r0)
        L_0x0019:
            android.graphics.Paint r1 = r8.G
            r1.setTypeface(r10)
            tb.pw1<java.lang.Float, java.lang.Float> r10 = r8.V
            if (r10 == 0) goto L_0x002d
            java.lang.Object r10 = r10.h()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x002f
        L_0x002d:
            float r10 = r9.c
        L_0x002f:
            float r2 = tb.fxv.e()
            float r2 = r2 * r10
            r1.setTextSize(r2)
            android.graphics.Paint r2 = r8.H
            android.graphics.Typeface r3 = r1.getTypeface()
            r2.setTypeface(r3)
            float r1 = r1.getTextSize()
            r2.setTextSize(r1)
            float r1 = r9.f
            float r3 = tb.fxv.e()
            float r1 = r1 * r3
            int r3 = r9.e
            float r3 = (float) r3
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 / r4
            tb.pw1<java.lang.Float, java.lang.Float> r4 = r8.U
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r4.h()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
        L_0x0064:
            float r3 = r3 + r4
            goto L_0x0075
        L_0x0066:
            tb.pw1<java.lang.Float, java.lang.Float> r4 = r8.T
            if (r4 == 0) goto L_0x0075
            java.lang.Object r4 = r4.h()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0064
        L_0x0075:
            float r4 = tb.fxv.e()
            float r3 = r3 * r4
            float r3 = r3 * r10
            r10 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r10
            java.util.List r10 = r8.a0(r0)
            int r0 = r10.size()
            r4 = 0
        L_0x0089:
            if (r4 >= r0) goto L_0x00c0
            java.lang.Object r5 = r10.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            float r6 = r2.measureText(r5)
            int r7 = r5.length()
            int r7 = r7 + (-1)
            float r7 = (float) r7
            float r7 = r7 * r3
            float r6 = r6 + r7
            r11.save()
            com.airbnb.lottie.model.DocumentData$Justification r7 = r9.d
            r8.O(r7, r11, r6)
            int r6 = r0 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r1
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r7 = (float) r4
            float r7 = r7 * r1
            float r7 = r7 - r6
            r6 = 0
            r11.translate(r6, r7)
            r8.T(r5, r9, r11, r3)
            r11.restore()
            int r4 = r4 + 1
            goto L_0x0089
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qlt.X(com.airbnb.lottie.model.DocumentData, tb.gu9, android.graphics.Canvas):void");
    }

    public final List<xo4> Y(mu9 mu9Var) {
        HashMap hashMap = (HashMap) this.I;
        if (hashMap.containsKey(mu9Var)) {
            return (List) hashMap.get(mu9Var);
        }
        List<khp> a2 = mu9Var.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new xo4(this.L, this, a2.get(i)));
        }
        hashMap.put(mu9Var, arrayList);
        return arrayList;
    }

    public final float Z(String str, gu9 gu9Var, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            mu9 mu9Var = this.M.c().get(mu9.c(str.charAt(i), gu9Var.a(), gu9Var.c()));
            if (mu9Var != null) {
                f3 = (float) (f3 + (mu9Var.b() * f * fxv.e() * f2));
            }
        }
        return f3;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        if (t == ylh.COLOR) {
            pw1<Integer, Integer> pw1Var = this.O;
            if (pw1Var != null) {
                G(pw1Var);
            }
            if (fmhVar == null) {
                this.O = null;
                return;
            }
            w1w w1wVar = new w1w(fmhVar);
            this.O = w1wVar;
            w1wVar.a(this);
            i(this.O);
        } else if (t == ylh.STROKE_COLOR) {
            pw1<Integer, Integer> pw1Var2 = this.Q;
            if (pw1Var2 != null) {
                G(pw1Var2);
            }
            if (fmhVar == null) {
                this.Q = null;
                return;
            }
            w1w w1wVar2 = new w1w(fmhVar);
            this.Q = w1wVar2;
            w1wVar2.a(this);
            i(this.Q);
        } else if (t == ylh.STROKE_WIDTH) {
            pw1<Float, Float> pw1Var3 = this.S;
            if (pw1Var3 != null) {
                G(pw1Var3);
            }
            if (fmhVar == null) {
                this.S = null;
                return;
            }
            w1w w1wVar3 = new w1w(fmhVar);
            this.S = w1wVar3;
            w1wVar3.a(this);
            i(this.S);
        } else if (t == ylh.TEXT_TRACKING) {
            pw1<Float, Float> pw1Var4 = this.U;
            if (pw1Var4 != null) {
                G(pw1Var4);
            }
            if (fmhVar == null) {
                this.U = null;
                return;
            }
            w1w w1wVar4 = new w1w(fmhVar);
            this.U = w1wVar4;
            w1wVar4.a(this);
            i(this.U);
        } else if (t == ylh.TEXT_SIZE) {
            pw1<Float, Float> pw1Var5 = this.V;
            if (pw1Var5 != null) {
                G(pw1Var5);
            }
            if (fmhVar == null) {
                this.V = null;
                return;
            }
            w1w w1wVar5 = new w1w(fmhVar);
            this.V = w1wVar5;
            w1wVar5.a(this);
            i(this.V);
        } else if (t == ylh.TYPEFACE) {
            pw1<Typeface, Typeface> pw1Var6 = this.W;
            if (pw1Var6 != null) {
                G(pw1Var6);
            }
            if (fmhVar == null) {
                this.W = null;
                return;
            }
            w1w w1wVar6 = new w1w(fmhVar);
            this.W = w1wVar6;
            w1wVar6.a(this);
            i(this.W);
        } else if (t == ylh.TEXT) {
            this.K.q(fmhVar);
        }
    }

    public final List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final Typeface b0(gu9 gu9Var) {
        Typeface h;
        pw1<Typeface, Typeface> pw1Var = this.W;
        if (pw1Var != null && (h = pw1Var.h()) != null) {
            return h;
        }
        Typeface c0 = this.L.c0(gu9Var.a(), gu9Var.c());
        if (c0 != null) {
            return c0;
        }
        return null;
    }

    public final boolean c0(int i) {
        if (Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        kkh kkhVar = this.M;
        rectF.set(0.0f, 0.0f, kkhVar.b().width(), kkhVar.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        int i2;
        canvas.save();
        LottieDrawable lottieDrawable = this.L;
        if (!lottieDrawable.p1()) {
            canvas.concat(matrix);
        }
        DocumentData h = this.K.h();
        gu9 gu9Var = this.M.g().get(h.b);
        if (gu9Var == null) {
            canvas.restore();
            return;
        }
        pw1<Integer, Integer> pw1Var = this.O;
        Paint paint = this.G;
        if (pw1Var != null) {
            paint.setColor(pw1Var.h().intValue());
        } else {
            pw1<Integer, Integer> pw1Var2 = this.N;
            if (pw1Var2 != null) {
                paint.setColor(pw1Var2.h().intValue());
            } else {
                paint.setColor(h.h);
            }
        }
        pw1<Integer, Integer> pw1Var3 = this.Q;
        Paint paint2 = this.H;
        if (pw1Var3 != null) {
            paint2.setColor(pw1Var3.h().intValue());
        } else {
            pw1<Integer, Integer> pw1Var4 = this.P;
            if (pw1Var4 != null) {
                paint2.setColor(pw1Var4.h().intValue());
            } else {
                paint2.setColor(h.i);
            }
        }
        aeu aeuVar = this.x;
        if (aeuVar.h() == null) {
            i2 = 100;
        } else {
            i2 = aeuVar.h().h().intValue();
        }
        int i3 = (i2 * 255) / 100;
        paint.setAlpha(i3);
        paint2.setAlpha(i3);
        pw1<Float, Float> pw1Var5 = this.S;
        if (pw1Var5 != null) {
            paint2.setStrokeWidth(pw1Var5.h().floatValue());
        } else {
            pw1<Float, Float> pw1Var6 = this.R;
            if (pw1Var6 != null) {
                paint2.setStrokeWidth(pw1Var6.h().floatValue());
            } else {
                paint2.setStrokeWidth(h.j * fxv.e() * fxv.g(matrix));
            }
        }
        if (lottieDrawable.p1()) {
            W(h, matrix, gu9Var, canvas);
        } else {
            X(h, gu9Var, canvas);
        }
        canvas.restore();
    }
}
