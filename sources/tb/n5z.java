package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n5z implements Comparable<n5z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final float b = g(0.0f);
    private static final float c = g(Float.POSITIVE_INFINITY);
    private static final float d = g(Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final float f24535a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737156);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1fe89d6c", new Object[]{this})).floatValue();
            }
            return n5z.c();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737155);
    }

    private /* synthetic */ n5z(float f) {
        this.f24535a = f;
    }

    public static final /* synthetic */ float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("874fc", new Object[0])).floatValue();
        }
        return b;
    }

    public static final /* synthetic */ float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("825ab96a", new Object[0])).floatValue();
        }
        return c;
    }

    public static final /* synthetic */ float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bc81327", new Object[0])).floatValue();
        }
        return d;
    }

    public static final /* synthetic */ n5z d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n5z) ipChange.ipc$dispatch("3a33eaa9", new Object[]{new Float(f)});
        }
        return new n5z(f);
    }

    public static int f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("886ccbfa", new Object[]{new Float(f), new Float(f2)})).intValue();
        }
        return Float.compare(f, f2);
    }

    public static float g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3efd6", new Object[]{new Float(f)})).floatValue();
        }
        return f;
    }

    public static final float h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9da42fb9", new Object[]{new Float(f), new Float(f2)})).floatValue();
        }
        return g(f / f2);
    }

    public static final float i(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9da43afc", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        return g(f / i);
    }

    public static final float j(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe1bcc88", new Object[]{new Float(f), new Float(f2)})).floatValue();
        }
        return f / f2;
    }

    public static boolean k(float f, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a31df08b", new Object[]{new Float(f), obj})).booleanValue();
        }
        if ((obj instanceof n5z) && ckf.b(Float.valueOf(f), Float.valueOf(((n5z) obj).u()))) {
            return true;
        }
        return false;
    }

    public static final boolean l(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fe77cd", new Object[]{new Float(f), new Float(f2)})).booleanValue();
        }
        return ckf.b(Float.valueOf(f), Float.valueOf(f2));
    }

    public static int n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ceba", new Object[]{new Float(f)})).intValue();
        }
        return Float.floatToIntBits(f);
    }

    public static final float o(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef561a8", new Object[]{new Float(f), new Float(f2)})).floatValue();
        }
        return g(f - f2);
    }

    public static final float p(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c133552", new Object[]{new Float(f), new Float(f2)})).floatValue();
        }
        return g(f + f2);
    }

    public static final float q(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cd51ae", new Object[]{new Float(f), new Float(f2)})).floatValue();
        }
        return g(f * f2);
    }

    public static final float r(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cd5cf1", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        return g(f * i);
    }

    public static String s(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40f89bc8", new Object[]{new Float(f)});
        }
        return "Dp(value=" + f + ')';
    }

    public static final float t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4da4b734", new Object[]{new Float(f)})).floatValue();
        }
        return g(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(n5z n5zVar) {
        return e(n5zVar.u());
    }

    public int e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e276cc", new Object[]{this, new Float(f)})).intValue();
        }
        return f(u(), f);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return k(u(), obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return n(u());
    }

    public final float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b2", new Object[]{this})).floatValue();
        }
        return u();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return s(u());
    }

    public final /* synthetic */ float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22172", new Object[]{this})).floatValue();
        }
        return this.f24535a;
    }
}
