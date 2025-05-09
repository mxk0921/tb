package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class q32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static Pair<String, ? extends tib> f26477a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745537917);
        }

        public a() {
        }

        @JvmStatic
        public final tib a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tib) ipChange.ipc$dispatch("dc04f3b7", new Object[]{this});
            }
            Pair a2 = q32.a();
            if (a2 != null) {
                return (tib) a2.getSecond();
            }
            return null;
        }

        @JvmStatic
        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fabc53a", new Object[]{this, str});
                return;
            }
            ckf.h(str, "userId");
            Pair a2 = q32.a();
            if (!ckf.b(a2 != null ? (String) a2.getFirst() : null, str)) {
                q32.b(new Pair(str, new p32(str)));
            }
        }

        @JvmStatic
        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e233c511", new Object[]{this});
            } else {
                q32.b(null);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(745537916);
    }

    public static final /* synthetic */ Pair a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb286cac", new Object[0]);
        }
        return f26477a;
    }

    public static final /* synthetic */ void b(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacfe00a", new Object[]{pair});
        } else {
            f26477a = pair;
        }
    }

    @JvmStatic
    public static final tib c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tib) ipChange.ipc$dispatch("dc04f3b7", new Object[0]);
        }
        return Companion.a();
    }

    @JvmStatic
    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fabc53a", new Object[]{str});
        } else {
            Companion.b(str);
        }
    }
}
