package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hrz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final byte f20849a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737229);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737228);
    }

    public /* synthetic */ hrz(byte b) {
        this.f20849a = b;
    }

    public static final /* synthetic */ hrz a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrz) ipChange.ipc$dispatch("163fba56", new Object[]{new Byte(b)});
        }
        return new hrz(b);
    }

    public static byte b(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3e0ce", new Object[]{new Byte(b)})).byteValue();
        }
        return b;
    }

    public static boolean c(byte b, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ba1a87", new Object[]{new Byte(b), obj})).booleanValue();
        }
        if ((obj instanceof hrz) && b == ((hrz) obj).g()) {
            return true;
        }
        return false;
    }

    public static final boolean d(byte b, byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fc974d", new Object[]{new Byte(b), new Byte(b2)})).booleanValue();
        }
        if (b == b2) {
            return true;
        }
        return false;
    }

    public static int e(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440bfb6", new Object[]{new Byte(b)})).intValue();
        }
        return b;
    }

    public static String f(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a271424c", new Object[]{new Byte(b)});
        }
        return "TemplateFallbackType(value=" + ((int) b) + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return c(g(), obj);
    }

    public final /* synthetic */ byte g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d2216e", new Object[]{this})).byteValue();
        }
        return this.f20849a;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return e(g());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return f(g());
    }
}
