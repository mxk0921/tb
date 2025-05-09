package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean ENABLE_TRACE = false;
    public static final rds INSTANCE = new rds();

    static {
        t2o.a(839909979);
    }

    @JvmStatic
    public static final void a(String str, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce01c393", new Object[]{str, new Long(j), pair});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    public static /* synthetic */ void b(String str, long j, Pair pair, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d7c86f", new Object[]{str, new Long(j), pair, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        a(str, j, pair);
    }

    @JvmStatic
    public static final void c(String str, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5870bc5", new Object[]{str, new Long(j), pair});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    public static /* synthetic */ void d(String str, long j, Pair pair, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5418f0fd", new Object[]{str, new Long(j), pair, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        c(str, j, pair);
    }

    @JvmStatic
    public static final void e(String str, Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17f169a", new Object[]{str, pair, pair2});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    public static /* synthetic */ void f(String str, Pair pair, Pair pair2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2dc188", new Object[]{str, pair, pair2, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            pair = null;
        }
        if ((i & 4) != 0) {
            pair2 = null;
        }
        e(str, pair, pair2);
    }

    @JvmStatic
    public static final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("898a906", new Object[0])).longValue();
        }
        return 0L;
    }
}
