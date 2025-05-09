package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kvn extends pq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float[] f = {0.0f, 0.0f, 0.0f};
    public final int[] g = new int[3];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Comparator<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(kvn kvnVar) {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be29af7d", new Object[]{this, bVar, bVar2})).intValue();
            }
            if (b.b(bVar) > b.b(bVar2)) {
                return -1;
            }
            if (b.b(bVar) < b.b(bVar2)) {
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<RectF> f22951a;
        public final List<Float> b;

        static {
            t2o.a(482345000);
        }

        public c(kvn kvnVar, List<RectF> list, List<Float> list2) {
            this.f22951a = list;
            this.b = list2;
        }

        public List<RectF> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("38860ea3", new Object[]{this});
            }
            return this.f22951a;
        }
    }

    static {
        t2o.a(482344997);
    }

    public kvn(String str) {
        super(new tck(str));
    }

    public static /* synthetic */ Object ipc$super(kvn kvnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/model/RegionObjectDetectModel");
    }

    public final float n(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98250f14", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        return Math.min(Math.max(f, f2), f3);
    }

    public final void o(AliNNNetInstance.d.a aVar, int i, float[] fArr, List<b> list) {
        int i2;
        int i3;
        int i4;
        List<b> list2;
        int i5;
        kvn kvnVar = this;
        int i6 = i;
        List<b> list3 = list;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc8f572", new Object[]{kvnVar, aVar, new Integer(i6), fArr, list3});
            return;
        }
        float[] c2 = aVar.c();
        int length = c2.length;
        for (int i8 = 0; i8 < length; i8++) {
            c2[i8] = kvnVar.w(c2[i8]);
        }
        tck tckVar = (tck) kvnVar.d;
        int[] b2 = aVar.b();
        int i9 = b2[1];
        int i10 = b2[2];
        int i11 = b2[3];
        int i12 = b2[4];
        int i13 = 0;
        while (i13 < i9) {
            int i14 = 0;
            while (i14 < i10) {
                while (i7 < i11) {
                    int i15 = (i13 * i10 * i11 * i12) + (i14 * i11 * i12) + (i7 * i12);
                    int i16 = i15 + 4;
                    if (c2[i16] > tckVar.n()) {
                        b bVar = new b(kvnVar, null);
                        i2 = i9;
                        i4 = i10;
                        double d = i6;
                        float f = (float) ((((c2[i15] * 2.0f) - 0.5d) + i7) * d);
                        i3 = i7;
                        float f2 = (float) ((((c2[i15 + 1] * 2.0f) - 0.5d) + i14) * d);
                        float f3 = c2[i15 + 2];
                        int i17 = i13 * 2;
                        float f4 = f3 * f3 * 4.0f * fArr[i17];
                        float f5 = c2[i15 + 3];
                        float f6 = f5 * f5 * 4.0f * fArr[i17 + 1];
                        float f7 = f4 / 2.0f;
                        b.a(bVar)[0] = f - f7;
                        float f8 = f6 / 2.0f;
                        b.a(bVar)[1] = f2 - f8;
                        b.a(bVar)[2] = f + f7;
                        b.a(bVar)[3] = f2 + f8;
                        b.c(bVar, c2[i16]);
                        float f9 = 0.0f;
                        int i18 = 5;
                        int i19 = -1;
                        while (i18 < i12) {
                            if (i19 == -1 || c2[i15 + i18] > f9) {
                                f9 = c2[i15 + i18];
                                i5 = i18 - 5;
                            } else {
                                i5 = i19;
                            }
                            i18++;
                            i19 = i5;
                        }
                        list2 = list;
                        list2.add(bVar);
                    } else {
                        i3 = i7;
                        i2 = i9;
                        i4 = i10;
                        list2 = list3;
                    }
                    i9 = i2;
                    i6 = i;
                    list3 = list2;
                    i10 = i4;
                    i7 = i3 + 1;
                    kvnVar = this;
                }
                i14++;
                kvnVar = this;
                i9 = i9;
                i6 = i;
                list3 = list3;
                i7 = 0;
            }
            i13++;
            kvnVar = this;
            i9 = i9;
            i6 = i;
            list3 = list3;
            i7 = 0;
        }
    }

    public void p(List<b> list, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec3ec51", new Object[]{this, list, zArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!zArr[i]) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            list.remove(((Integer) arrayList.get(size)).intValue());
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4af3004", new Object[]{this})).booleanValue();
        }
        if (e()) {
            return true;
        }
        khj khjVar = this.d;
        if (khjVar == null || TextUtils.isEmpty(khjVar.b) || TextUtils.isEmpty(this.d.c)) {
            return false;
        }
        this.e |= 8;
        lxl.b().c("INIT_OBJECT_REGION_DETECTION_MODEL", -1);
        tck tckVar = (tck) this.d;
        this.f = tckVar.k();
        this.c = ss0.a(this.f, tckVar.l(), AliNNImageProcess.Format.RGB);
        lxl.b().c("LOAD_OBJECT_REGION_DETECTION_MODEL", -1);
        int g = g();
        lxl.b().a("LOAD_OBJECT_REGION_DETECTION_MODEL");
        lxl.b().a("INIT_OBJECT_REGION_DETECTION_MODEL");
        this.e = (this.e | g | 4) & (-9);
        if (g == 2) {
            return true;
        }
        return false;
    }

    public final void r(AliNNNetInstance.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41073bc5", new Object[]{this, dVar});
            return;
        }
        tck tckVar = (tck) this.d;
        for (int i = 0; i < tckVar.m().length; i++) {
            this.g[i] = tckVar.i() / dVar.b(tckVar.m()[i]).b()[2];
        }
    }

    public final float s(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ea942dc", new Object[]{this, fArr, fArr2})).floatValue();
        }
        float max = Math.max(0.0f, (Math.min(fArr[2], fArr2[2]) - Math.max(fArr[0], fArr2[0])) + 1.0f) * Math.max(0.0f, (Math.min(fArr[3], fArr2[3]) - Math.max(fArr[1], fArr2[1])) + 1.0f);
        return max / ((((fArr[2] - fArr[0]) * (fArr[3] - fArr[1])) + ((fArr2[2] - fArr2[0]) * (fArr2[3] - fArr2[1]))) - max);
    }

    public void t(List<b> list, float f) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed12d34", new Object[]{this, list, new Float(f)});
            return;
        }
        Collections.sort(list, new a(this));
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Arrays.fill(zArr, true);
        for (int i = 0; i < size; i++) {
            if (zArr[i]) {
                for (int i2 = i + 1; i2 < size; i2++) {
                    if (!zArr[i2] || s(b.a(list.get(i)), b.a(list.get(i2))) >= f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zArr[i2] = z;
                }
            }
        }
        p(list, zArr);
    }

    public final void v(List<b> list, int i, int i2, int i3, int i4, int i5, int i6) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cd2b79", new Object[]{this, list, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        for (b bVar : list) {
            float f = i3;
            float f2 = i5;
            b.a(bVar)[c2] = n(b.a(bVar)[c2] - f, 0.0f, f2) / f2;
            float f3 = i4;
            float f4 = i6;
            b.a(bVar)[1] = n(b.a(bVar)[1] - f3, 0.0f, f4) / f4;
            b.a(bVar)[2] = n(b.a(bVar)[2] - f, 0.0f, f2) / f2;
            b.a(bVar)[3] = n(b.a(bVar)[3] - f3, 0.0f, f4) / f4;
            c2 = 0;
        }
    }

    public final float w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b9b363b", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) (1.0d / (Math.exp(-f) + 1.0d));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float[] f22950a;
        public float b;

        static {
            t2o.a(482344999);
        }

        public b(kvn kvnVar) {
            this.f22950a = new float[4];
        }

        public static /* synthetic */ float[] a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("2bf36fb", new Object[]{bVar});
            }
            return bVar.f22950a;
        }

        public static /* synthetic */ float b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e9262e17", new Object[]{bVar})).floatValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ float c(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("747bf727", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        public /* synthetic */ b(kvn kvnVar, a aVar) {
            this(kvnVar);
        }
    }

    public c u(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ed17f4dd", new Object[]{this, bitmap});
        }
        if (!f()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AliNNNetInstance.d.a a2 = this.b.a(null);
        tck tckVar = (tck) this.d;
        Bitmap createBitmap = Bitmap.createBitmap(tckVar.j(), tckVar.i(), Bitmap.Config.ARGB_8888);
        float min = Math.min((createBitmap.getWidth() * 1.0f) / bitmap.getWidth(), (createBitmap.getHeight() * 1.0f) / bitmap.getHeight());
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        Rect rect = new Rect();
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        rect.left = (createBitmap.getWidth() - width) / 2;
        int height2 = (createBitmap.getHeight() - height) / 2;
        rect.top = height2;
        int i = rect.left;
        rect.right = i + width;
        rect.bottom = height2 + height;
        int i2 = i * 2;
        int i3 = height2 * 2;
        canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        c4p.C("自动识别", "输入尺寸: width=" + createBitmap.getWidth() + " - height=" + createBitmap.getHeight(), new Object[0]);
        AliNNImageProcess.a(createBitmap, a2, this.c, null);
        long currentTimeMillis2 = System.currentTimeMillis();
        m();
        c4p.C("自动识别", "模型推理耗时(ms): " + (System.currentTimeMillis() - currentTimeMillis2), new Object[0]);
        r(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < tckVar.m().length; i4++) {
            o(this.b.b(tckVar.m()[i4]), this.g[i4], tckVar.g()[i4], arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        t(arrayList, tckVar.h());
        v(arrayList, i2, i3, rect.left, rect.top, width, height);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = (b) arrayList.get(i5);
                RectF rectF = new RectF();
                rectF.set(b.a(bVar)[0], b.a(bVar)[1], b.a(bVar)[2], b.a(bVar)[3]);
                arrayList2.add(rectF);
                arrayList3.add(Float.valueOf(b.b(bVar)));
            }
        }
        c4p.C("自动识别", "输出主体数量: " + arrayList2.size(), new Object[0]);
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            c4p.C("自动识别", "主体框位置[left,top][right,bottom]: " + ((RectF) arrayList2.get(i6)).toShortString(), new Object[0]);
            c4p.C("自动识别", "主体置信度: " + arrayList3.get(i6), new Object[0]);
        }
        c4p.C("自动识别", "模型总耗时(ms): " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        return new c(this, arrayList2, arrayList3);
    }
}
