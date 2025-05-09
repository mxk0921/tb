package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile lqv f23521a = null;
    public static final Map<String, String> b = new HashMap();

    static {
        t2o.a(964689925);
    }

    public static synchronized String a(String str, Activity activity) {
        synchronized (lqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6589cd81", new Object[]{str, activity});
            } else if (l5v.b(str)) {
                return "";
            } else {
                if (activity == null) {
                    return "";
                }
                String str2 = str + "#" + mqv.b(activity);
                ((HashMap) b).put(str, str2);
                return str2;
            }
        }
    }

    public static synchronized void f() {
        synchronized (lqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            } else {
                ((HashMap) b).clear();
            }
        }
    }

    public static lqv j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqv) ipChange.ipc$dispatch("35302d97", new Object[0]);
        }
        if (f23521a == null) {
            synchronized (lqv.class) {
                try {
                    if (f23521a == null) {
                        f23521a = new lqv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23521a;
    }

    public synchronized void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3c5c79", new Object[]{this, str, str2, str3});
        } else {
            mqv.n().c(str, b(str2), str3);
        }
    }

    public synchronized void d(String str, String str2, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b54c05", new Object[]{this, str, str2, activity});
        } else {
            mqv.n().d(a(str, activity), str2);
        }
    }

    public synchronized void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5086942b", new Object[]{this, str, str2});
        } else {
            mqv.n().e(str, str2);
        }
    }

    public synchronized void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5262327d", new Object[]{this, str, str2});
        } else {
            mqv.n().g(str, b(str2));
        }
    }

    public synchronized void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5545311b", new Object[]{this, str});
        } else {
            mqv.n().h(b(str));
        }
    }

    public synchronized void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590d1caf", new Object[]{this, str});
        } else {
            mqv.n().j(str);
        }
    }

    public synchronized void k(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58222c4", new Object[]{this, str, str2, str3, str4, map});
        } else {
            mqv.n().p(str, b(str2), str3, str4, map);
        }
    }

    public synchronized void l(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4046ff56", new Object[]{this, str, str2, map});
        } else {
            mqv.n().s(str, b(str2), map);
        }
    }

    public synchronized void m(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7084dc", new Object[]{this, str, map});
        } else {
            mqv.n().t(b(str), map);
        }
    }

    public synchronized void n(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dceb94e4", new Object[]{this, str, map});
        } else {
            mqv.n().u(str, map);
        }
    }

    public static synchronized String b(String str) {
        synchronized (lqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7d2143cd", new Object[]{str});
            } else if (l5v.b(str)) {
                j5v.b("_getPageKeyWithContainer", "key is empty", str);
                return "";
            } else {
                String str2 = (String) ((HashMap) b).get(str);
                if (l5v.c(str2)) {
                    j5v.b("_getPageKeyWithContainer", "mPageKeyMap.get(key)", str2);
                    return str2;
                }
                String[] split = str.split("#");
                if (split.length != 3 || !split[split.length - 1].contains("@")) {
                    return "";
                }
                j5v.b("_getPageKeyWithContainer", "key from mega:", str);
                return str;
            }
        }
    }
}
