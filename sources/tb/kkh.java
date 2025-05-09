package tb;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kkh {
    public Map<String, List<Layer>> c;
    public Map<String, olh> d;
    public Map<String, gu9> e;
    public List<h4i> f;
    public SparseArrayCompat<mu9> g;
    public LongSparseArray<Layer> h;
    public List<Layer> i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public final ayl f22726a = new ayl();
    public final HashSet<String> b = new HashSet<>();
    public int o = 0;

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements plh<kkh>, p23 {

            /* renamed from: a  reason: collision with root package name */
            public final dqk f22727a;

            /* renamed from: a */
            public void onResult(kkh kkhVar) {
                this.f22727a.onCompositionLoaded(kkhVar);
            }

            public a(dqk dqkVar) {
                this.f22727a = dqkVar;
            }
        }

        @Deprecated
        public static p23 a(InputStream inputStream, dqk dqkVar) {
            a aVar = new a(dqkVar);
            ukh.o(inputStream, null).d(aVar);
            return aVar;
        }
    }

    public void a(String str) {
        zhh.d(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public SparseArrayCompat<mu9> c() {
        return this.g;
    }

    public float d() {
        return (e() / this.m) * 1000.0f;
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, gu9> g() {
        return this.e;
    }

    public float h(float f) {
        return uvi.k(this.k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, olh> j() {
        return this.d;
    }

    public List<Layer> k() {
        return this.i;
    }

    public h4i l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            h4i h4iVar = this.f.get(i);
            if (h4iVar.a(str)) {
                return h4iVar;
            }
        }
        return null;
    }

    public int m() {
        return this.o;
    }

    public ayl n() {
        return this.f22726a;
    }

    public List<Layer> o(String str) {
        return this.c.get(str);
    }

    public float p() {
        return this.k;
    }

    public boolean q() {
        return this.n;
    }

    public void r(int i) {
        this.o += i;
    }

    public void s(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, olh> map2, SparseArrayCompat<mu9> sparseArrayCompat, Map<String, gu9> map3, List<h4i> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = longSparseArray;
        this.c = map;
        this.d = map2;
        this.g = sparseArrayCompat;
        this.e = map3;
        this.f = list2;
    }

    public Layer t(long j) {
        return this.h.get(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.i) {
            sb.append(layer.y("\t"));
        }
        return sb.toString();
    }

    public void u(boolean z) {
        this.n = z;
    }

    public void v(boolean z) {
        this.f22726a.b(z);
    }
}
