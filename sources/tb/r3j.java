package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static Pair<String, ? extends jqc> f27086a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745537700);
        }

        public a() {
        }

        @JvmStatic
        public final jqc a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jqc) ipChange.ipc$dispatch("8c7f0cb2", new Object[]{this});
            }
            Pair a2 = r3j.a();
            if (a2 != null) {
                return (jqc) a2.getSecond();
            }
            return null;
        }

        @JvmStatic
        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e233c511", new Object[]{this});
                return;
            }
            TLog.loge("mtbMainLink", "logout,数据层销毁");
            r3j.b(null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fabc53e", new Object[]{this, str})).booleanValue();
            }
            ckf.h(str, "userId");
            Pair a2 = r3j.a();
            if (ckf.b(a2 != null ? (String) a2.getFirst() : null, str)) {
                return false;
            }
            r3j.b(new Pair(str, new m0i(str)));
            return true;
        }
    }

    static {
        t2o.a(745537699);
    }

    public static final /* synthetic */ Pair a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb286cac", new Object[0]);
        }
        return f27086a;
    }

    public static final /* synthetic */ void b(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacfe00a", new Object[]{pair});
        } else {
            f27086a = pair;
        }
    }
}
