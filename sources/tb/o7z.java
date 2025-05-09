package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f25205a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737376);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a(short s, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("30b606fc", new Object[]{this, new Short(s), new Integer(i)})).intValue();
            }
            if (i >= 0 && i <= 255) {
                return o7z.b(((s & 65535) << 16) | (i & 255));
            }
            throw new IllegalArgumentException("FieldType value must be within 0-255");
        }

        public a() {
        }
    }

    static {
        t2o.a(598737375);
    }

    public /* synthetic */ o7z(int i) {
        this.f25205a = i;
    }

    public static final /* synthetic */ o7z a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7z) ipChange.ipc$dispatch("26835ce0", new Object[]{new Integer(i)});
        }
        return new o7z(i);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public static boolean c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8e8d10e", new Object[]{new Integer(i), obj})).booleanValue();
        }
        if ((obj instanceof o7z) && i == ((o7z) obj).h()) {
            return true;
        }
        return false;
    }

    public static final short d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("914607d9", new Object[]{new Integer(i)})).shortValue();
        }
        return (short) ((i >>> 16) & 65535);
    }

    public static final int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("646b85ad", new Object[]{new Integer(i)})).intValue();
        }
        return u6z.b(i & 255);
    }

    public static int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440d9fd", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public static String g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7de1ee5", new Object[]{new Integer(i)});
        }
        return "FuncParam(index=" + ((Object) tyu.h0(d(i))) + ", type=" + ((Object) u6z.e(e(i))) + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return c(h(), obj);
    }

    public final /* synthetic */ int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22175", new Object[]{this})).intValue();
        }
        return this.f25205a;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return f(h());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return g(h());
    }
}
