package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xbw extends pq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<c> f = new ArrayList();
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public int l;
    public int m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Comparator<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xbw xbwVar) {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("28b08235", new Object[]{this, cVar, cVar2})).intValue();
            }
            int i = cVar.j;
            int i2 = cVar2.j;
            if (i < i2) {
                return 1;
            }
            if (i > i2) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31290a;
        public boolean b;
        public int c;

        static {
            t2o.a(482345004);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float[] f31291a;
        public float[] b;
        public int e;
        public int j;
        public int c = 1;
        public int f = -1;
        public final List<Float> g = new ArrayList();
        public final List<RectF> h = new ArrayList();
        public int i = 1;
        public float d = 1000.0f;

        static {
            t2o.a(482345005);
        }

        public c(float[] fArr, int i) {
            this.f31291a = fArr;
            float[] fArr2 = new float[fArr.length];
            this.b = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = i;
        }

        public static /* synthetic */ List a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2b7bf225", new Object[]{cVar});
            }
            return cVar.g;
        }

        public static /* synthetic */ List b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("5a2d5c44", new Object[]{cVar});
            }
            return cVar.h;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86f8d757", new Object[]{cVar})).intValue();
            }
            return cVar.i;
        }

        public static /* synthetic */ int d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4f4975f", new Object[]{cVar})).intValue();
            }
            int i = cVar.i;
            cVar.i = 1 + i;
            return i;
        }

        public static /* synthetic */ float[] e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("f490125c", new Object[]{cVar});
            }
            return cVar.f31291a;
        }

        public static /* synthetic */ float[] f(c cVar, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("4c678def", new Object[]{cVar, fArr});
            }
            cVar.f31291a = fArr;
            return fArr;
        }

        public static /* synthetic */ float g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e7bced6", new Object[]{cVar})).floatValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ float h(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("655d85c8", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.d = f;
            return f;
        }

        public static /* synthetic */ int i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a3d4a9a", new Object[]{cVar})).intValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ int j(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1cb8d6d", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.e = i;
            return i;
        }

        public static /* synthetic */ float[] k(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("c9da0779", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ float[] l(c cVar, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("f708afcc", new Object[]{cVar, fArr});
            }
            cVar.b = fArr;
            return fArr;
        }

        public static /* synthetic */ int m(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1c0421c", new Object[]{cVar})).intValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ int n(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3aa7862b", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.c = i;
            return i;
        }

        public static /* synthetic */ int o(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3fbc0224", new Object[]{cVar})).intValue();
            }
            int i = cVar.c;
            cVar.c = 1 + i;
            return i;
        }
    }

    static {
        t2o.a(482345002);
    }

    public xbw(wbw wbwVar) {
        super(wbwVar);
        this.g = wbwVar.k();
        this.h = wbwVar.m();
        this.i = wbwVar.l();
        this.j = wbwVar.o();
        this.k = wbwVar.n();
    }

    public static /* synthetic */ Object ipc$super(xbw xbwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/model/VideoTrackModel");
    }

    public static float o(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2c9215d", new Object[]{fArr, fArr2})).floatValue();
        }
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = fArr[i];
            float f3 = fArr2[i];
            f += (f2 - f3) * (f2 - f3);
        }
        return (float) Math.sqrt(f);
    }

    public static float[] r(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("617f58e2", new Object[]{fArr});
        }
        float[] fArr2 = new float[fArr.length];
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2 * f2;
        }
        if (f != 0.0f) {
            float sqrt = (float) Math.sqrt(f);
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = fArr[i] / sqrt;
            }
        }
        return fArr2;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a68e2a", new Object[]{this});
        } else {
            this.l++;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e9afd91", new Object[]{this})).intValue();
        }
        for (int i = 0; i < ((ArrayList) this.f).size(); i++) {
            List b2 = c.b((c) ((ArrayList) this.f).get(i));
            List a2 = c.a((c) ((ArrayList) this.f).get(i));
            for (int i2 = 0; i2 < b2.size(); i2++) {
                RectF rectF = (RectF) b2.get(i2);
                float floatValue = ((Float) a2.get(i2)).floatValue();
                float width = rectF.width() * rectF.height();
                if (floatValue > this.h && width > this.i) {
                    ((c) ((ArrayList) this.f).get(i)).j++;
                }
            }
        }
        if (((ArrayList) this.f).size() > 1) {
            Collections.sort(this.f, new a(this));
            float f = ((c) ((ArrayList) this.f).get(0)).j * 1.0f;
            if (f / Math.max(1, ((c) ((ArrayList) this.f).get(1)).j) > this.k || f / this.l > this.j) {
                return ((c) ((ArrayList) this.f).get(0)).f;
            }
        }
        return this.m - 1;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4af3004", new Object[]{this})).booleanValue();
        }
        if (e()) {
            return true;
        }
        this.e |= 8;
        wbw wbwVar = (wbw) this.d;
        this.c = ss0.b(wbwVar.i(), wbwVar.j(), AliNNImageProcess.Format.RGB, AliNNImageProcess.Filter.BILINEAL);
        this.e = (g() | this.e) & (-9);
        return true;
    }

    public b s(Bitmap bitmap, int i, RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1387cc9e", new Object[]{this, bitmap, new Integer(i), rectF, new Float(f)});
        }
        try {
            b bVar = new b();
            AliNNNetInstance.d.a a2 = this.b.a(null);
            Matrix matrix = new Matrix();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            wbw wbwVar = (wbw) this.d;
            matrix.postScale(wbwVar.h() / width, wbwVar.g() / height);
            matrix.invert(matrix);
            AliNNImageProcess.a(bitmap, a2, this.c, matrix);
            m();
            float[] r = r(this.b.b("output").c());
            int N3 = lg4.N3();
            if (((ArrayList) this.f).isEmpty()) {
                c cVar = new c(r, i);
                c.a(cVar).add(Float.valueOf(f));
                c.b(cVar).add(rectF);
                ((ArrayList) this.f).add(cVar);
                bVar.f31290a = false;
                if (c.c(cVar) < N3) {
                    bVar = null;
                }
                if (bVar != null) {
                    int i2 = this.m;
                    this.m = 1 + i2;
                    cVar.f = i2;
                }
                return bVar;
            }
            Iterator it = ((ArrayList) this.f).iterator();
            float f2 = Float.MAX_VALUE;
            c cVar2 = null;
            while (it.hasNext()) {
                c cVar3 = (c) it.next();
                if (c.e(cVar3) != null) {
                    float o = o(c.e(cVar3), r);
                    if (o <= this.g && o < f2) {
                        bVar.f31290a = true;
                        cVar2 = cVar3;
                        f2 = o;
                    }
                }
            }
            if (cVar2 == null) {
                c cVar4 = new c(r, i);
                c.a(cVar4).add(Float.valueOf(f));
                c.b(cVar4).add(rectF);
                ((ArrayList) this.f).add(cVar4);
                bVar.f31290a = false;
                if (c.c(cVar4) < N3) {
                    bVar = null;
                }
                if (bVar != null) {
                    int i3 = this.m;
                    this.m = 1 + i3;
                    cVar4.f = i3;
                }
                return bVar;
            }
            c.d(cVar2);
            c.a(cVar2).add(Float.valueOf(f));
            c.b(cVar2).add(rectF);
            bVar.f31290a = bVar.f31290a && c.c(cVar2) > N3;
            if (c.g(cVar2) > f2) {
                c.h(cVar2, f2);
                int i4 = c.i(cVar2);
                c.j(cVar2, i);
                bVar.b = true;
                bVar.c = i4;
            }
            if (c.e(cVar2) == null) {
                c.f(cVar2, r);
                c.l(cVar2, new float[r.length]);
                c.n(cVar2, 1);
                System.arraycopy(c.e(cVar2), 0, c.k(cVar2), 0, c.e(cVar2).length);
            } else {
                c.o(cVar2);
                for (int i5 = 0; i5 < c.e(cVar2).length; i5++) {
                    float[] k = c.k(cVar2);
                    k[i5] = k[i5] + r[i5];
                    c.e(cVar2)[i5] = c.k(cVar2)[i5] / c.m(cVar2);
                }
            }
            if (c.c(cVar2) < N3) {
                bVar = null;
            }
            if (bVar != null && !bVar.f31290a && cVar2.f < 0) {
                int i6 = this.m;
                this.m = 1 + i6;
                cVar2.f = i6;
            }
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
