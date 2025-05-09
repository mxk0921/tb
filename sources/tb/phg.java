package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class phg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MainCacheLoad = "hMainCacheLoad";
    public static final String MainDataParse = "hMainDataParse";
    public static final String MainRequest = "hMainRequest";
    public static final String OnCreaeView = "hOnCreateView";
    public static final String OnCreate = "hOnCreate";
    public static final String RmdCacheLoad = "hRmdCacheLoad";
    public static final String RmdDataParse = "hRmdDataParse";
    public static final String RmdRequest = "hRmdRequest";
    public static final String RmdViewHolderBindData = "rmdBindData";
    public static final String RmdViewHolderCreate = "rmdCreateView";
    public static final String SmallFileLoad = "hSmallCacheLoad";
    public static final String ViewHolderBindData = "hBindData";
    public static final String ViewHolderCreate = "hCreateView";

    static {
        t2o.a(729809115);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436a9428", new Object[]{str});
        } else {
            c("hDataParse", str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51b916f", new Object[]{str});
        } else {
            n("hDataParse", str);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc888bb", new Object[]{str, str2});
            return;
        }
        fve.e("LauncherTracker", "traceEndInner groupName:" + str + ",pointName:" + str2 + ",timestamp:" + SystemClock.uptimeMillis());
        w35.c();
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96a1641", new Object[]{str});
        } else {
            c("hIO", str);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f942f148", new Object[]{str});
        } else {
            n("hIO", str);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25680927", new Object[]{str});
        } else {
            c("hLifeCycle", str);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8fc2ae", new Object[]{str});
        } else {
            n("hLifeCycle", str);
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cdc9f4", new Object[]{str});
        } else {
            c("hNet", str);
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b88843b", new Object[]{str});
        } else {
            n("hNet", str);
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39285d38", new Object[]{str});
        } else {
            c("hPreRender", str);
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528b567f", new Object[]{str});
        } else {
            n("hPreRender", str);
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc03ee31", new Object[]{str});
        } else {
            c("hRender", str);
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc68d38", new Object[]{str});
        } else {
            n("hRender", str);
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195e9754", new Object[]{str, str2});
            return;
        }
        fve.e("LauncherTracker", "traceStartInner groupName:" + str + ",pointName:" + str2 + ",timestamp:" + SystemClock.uptimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        w35.a(sb.toString());
    }
}
