package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class v5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f29796a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793520);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(v5p v5pVar, String str, String str2, String str3) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6efea8fa", new Object[]{this, v5pVar, str, str2, str3});
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (v5pVar == null || (str4 = v5pVar.a()) == null) {
                str4 = "unknown";
            }
            sb.append(str4);
            sb.append('_');
            sb.append(str);
            TLogTracker.i(sb.toString(), str2, str3);
        }

        @JvmStatic
        public final void b(v5p v5pVar, String str, Map<String, String> map) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0cead37", new Object[]{this, v5pVar, str, map});
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (v5pVar == null || (str2 = v5pVar.a()) == null) {
                str2 = "unknown";
            }
            sb.append(str2);
            sb.append('_');
            sb.append(str);
            TLogTracker.k(sb.toString(), map);
        }

        @JvmStatic
        public final void c(v5p v5pVar, String str, Map<String, String> map) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf43e5fe", new Object[]{this, v5pVar, str, map});
                return;
            }
            if (v5pVar == null || (str2 = v5pVar.a()) == null) {
                str2 = "unknown";
            }
            TLogTracker.r(str2, str, map);
        }

        public a() {
        }
    }

    static {
        t2o.a(815793519);
    }

    public v5p() {
        this(null, 1, null);
    }

    @JvmStatic
    public static final void b(v5p v5pVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efea8fa", new Object[]{v5pVar, str, str2, str3});
        } else {
            Companion.a(v5pVar, str, str2, str3);
        }
    }

    @JvmStatic
    public static final void c(v5p v5pVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cead37", new Object[]{v5pVar, str, map});
        } else {
            Companion.b(v5pVar, str, map);
        }
    }

    @JvmStatic
    public static final void d(v5p v5pVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf43e5fe", new Object[]{v5pVar, str, map});
        } else {
            Companion.c(v5pVar, str, map);
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.f29796a;
    }

    public v5p(String str) {
        this.f29796a = str;
    }

    public /* synthetic */ v5p(String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? "Default" : str);
    }
}
