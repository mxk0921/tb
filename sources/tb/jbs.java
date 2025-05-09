package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jbs extends qt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Application c;
    public final bbs d;
    public final String e;

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0954a Companion = new C0954a(null);
        public static final int b = f(0);
        public static final int c = f(1);
        public static final int d = f(2);
        public static final int e = f(4);

        /* renamed from: a  reason: collision with root package name */
        public final int f21906a;

        /* compiled from: Taobao */
        /* renamed from: tb.jbs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0954a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(839909732);
            }

            public /* synthetic */ C0954a(a07 a07Var) {
                this();
            }

            public final int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("edf82f0", new Object[]{this})).intValue();
                }
                return a.a();
            }

            public final int b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("47a52a6c", new Object[]{this})).intValue();
                }
                return a.b();
            }

            public final int c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("b9663167", new Object[]{this})).intValue();
                }
                return a.c();
            }

            public final int d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("788d024c", new Object[]{this})).intValue();
                }
                return a.d();
            }

            public C0954a() {
            }
        }

        static {
            t2o.a(839909731);
            f(3);
        }

        public /* synthetic */ a(int i) {
            this.f21906a = i;
        }

        public static final /* synthetic */ int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("80b24055", new Object[0])).intValue();
            }
            return c;
        }

        public static final /* synthetic */ int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f26a61d9", new Object[0])).intValue();
            }
            return e;
        }

        public static final /* synthetic */ int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b5b4d9fe", new Object[0])).intValue();
            }
            return d;
        }

        public static final /* synthetic */ int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("47ce4df9", new Object[0])).intValue();
            }
            return b;
        }

        public static final /* synthetic */ a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75a28b03", new Object[]{new Integer(i)});
            }
            return new a(i);
        }

        public static int f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static boolean g(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8e8d10e", new Object[]{new Integer(i), obj})).booleanValue();
            }
            if ((obj instanceof a) && i == ((a) obj).k()) {
                return true;
            }
            return false;
        }

        public static final boolean h(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16ffe02d", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i == i2) {
                return true;
            }
            return false;
        }

        public static int i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6440d9fd", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static String j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7de1ee5", new Object[]{new Integer(i)});
            }
            return "RuntimeState(state=" + i + ')';
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return g(this.f21906a, obj);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return i(this.f21906a);
        }

        public final /* synthetic */ int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d22175", new Object[]{this})).intValue();
            }
            return this.f21906a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return j(this.f21906a);
        }
    }

    static {
        t2o.a(839909730);
    }

    public jbs(Application application, bbs bbsVar, String str) {
        ckf.g(application, "application");
        ckf.g(bbsVar, "instance");
        ckf.g(str, "launcherLogTraceId");
        this.c = application;
        this.d = bbsVar;
        this.e = str;
    }

    public static /* synthetic */ Object ipc$super(jbs jbsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/launcher_ng/TMSLaunchRuntime");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbs)) {
            return false;
        }
        jbs jbsVar = (jbs) obj;
        if (ckf.b(this.c, jbsVar.c) && ckf.b(this.d, jbsVar.d) && ckf.b(this.e, jbsVar.e)) {
            return true;
        }
        return false;
    }

    public final bbs getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.d;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a461ab27", new Object[]{this});
        }
        return this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TMSLaunchRuntime(application=" + this.c + ", instance=" + this.d + ", launcherLogTraceId=" + this.e + ')';
    }
}
