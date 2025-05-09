package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, p84> f26572a = new ConcurrentHashMap<>();

    static {
        t2o.a(912261358);
    }

    public static p84 a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p84) ipChange.ipc$dispatch("519ea092", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return b(naq.a(obj));
    }

    public static p84 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p84) ipChange.ipc$dispatch("aadadb64", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (q84.class) {
            try {
                ConcurrentHashMap<String, p84> concurrentHashMap = f26572a;
                if (concurrentHashMap.containsKey(str)) {
                    return concurrentHashMap.get(str);
                }
                p84 p84Var = new p84();
                concurrentHashMap.put(str, p84Var);
                return p84Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{obj});
        } else if (obj != null) {
            d(naq.a(obj));
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (q84.class) {
                try {
                    ConcurrentHashMap<String, p84> concurrentHashMap = f26572a;
                    if (concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.get(str).c();
                        concurrentHashMap.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static p84 e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p84) ipChange.ipc$dispatch("90b3ceca", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, p84> concurrentHashMap = f26572a;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public static void f(Object obj, dtc dtcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc038ded", new Object[]{obj, dtcVar});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.d(dtcVar);
        }
    }

    public static <T> T g(Object obj, dtc dtcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("10008dbd", new Object[]{obj, dtcVar});
        }
        if (obj == null || (e = e(naq.a(obj))) == null) {
            return null;
        }
        return (T) e.e(dtcVar);
    }

    public static <T extends dtc> void h(Object obj, Class<T> cls, ktc ktcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5164b9e6", new Object[]{obj, cls, ktcVar});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.g(cls, ktcVar);
        }
    }

    public static <T extends dtc> void i(Object obj, Class<T> cls, ntc ntcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cde1160", new Object[]{obj, cls, ntcVar});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.i(cls, ntcVar);
        }
    }

    public static <T extends dtc> void j(Object obj, Class<T> cls) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1617658e", new Object[]{obj, cls});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.k(cls);
        }
    }

    public static void k(Object obj, ktc ktcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dfa0a00", new Object[]{obj, ktcVar});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.l(ktcVar);
        }
    }

    public static <T extends dtc> void l(Object obj, Class<T> cls) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d843c4f", new Object[]{obj, cls});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.n(cls);
        }
    }

    public static void m(Object obj, ntc ntcVar) {
        p84 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72794dfa", new Object[]{obj, ntcVar});
        } else if (obj != null && (e = e(naq.a(obj))) != null) {
            e.o(ntcVar);
        }
    }
}
