package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface jjc {

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0956a Companion = new C0956a(null);
        public static final int b = c(1);

        /* renamed from: a  reason: collision with root package name */
        public final int f22029a;

        /* compiled from: Taobao */
        /* renamed from: tb.jjc$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0956a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(839909723);
            }

            public /* synthetic */ C0956a(a07 a07Var) {
                this();
            }

            public final int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6708475e", new Object[]{this})).intValue();
                }
                return a.a();
            }

            public C0956a() {
            }
        }

        static {
            t2o.a(839909722);
            c(0);
            c(2);
            c(3);
        }

        public /* synthetic */ a(int i) {
            this.f22029a = i;
        }

        public static final /* synthetic */ int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abd44d19", new Object[0])).intValue();
            }
            return b;
        }

        public static final /* synthetic */ a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ae7dd7d", new Object[]{new Integer(i)});
            }
            return new a(i);
        }

        public static int c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static boolean d(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8e8d10e", new Object[]{new Integer(i), obj})).booleanValue();
            }
            if ((obj instanceof a) && i == ((a) obj).g()) {
                return true;
            }
            return false;
        }

        public static int e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6440d9fd", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static String f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7de1ee5", new Object[]{new Integer(i)});
            }
            return "HandleStrategy(strategy=" + i + ')';
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return d(this.f22029a, obj);
        }

        public final /* synthetic */ int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d22175", new Object[]{this})).intValue();
            }
            return this.f22029a;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return e(this.f22029a);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return f(this.f22029a);
        }
    }

    void a(jbs jbsVar);

    boolean b();
}
