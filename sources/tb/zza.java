package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f33120a = new HashMap(4);
    public static imn b;
    public static imi c;
    public static HashMap<String, imi> d;
    public static HashMap<String, imi> e;
    public static HashMap<String, imn> f;
    public static HashMap<String, jee> g;

    static {
        t2o.a(729809258);
    }

    public static imi a(String str) {
        HashMap<String, imi> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imi) ipChange.ipc$dispatch("70a16f2e", new Object[]{str});
        }
        if (str == null || (hashMap = d) == null || hashMap.get(str) == null) {
            return c;
        }
        return d.get(str);
    }

    public static imi b(String str) {
        HashMap<String, imi> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imi) ipChange.ipc$dispatch("b8bc19e3", new Object[]{str});
        }
        if (str == null || (hashMap = e) == null || hashMap.get(str) == null) {
            return c;
        }
        return e.get(str);
    }

    public static imn c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("d9a5c543", new Object[0]);
        }
        return b;
    }

    public static imn d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("b212a9fe", new Object[]{str});
        }
        HashMap<String, imn> hashMap = f;
        if (hashMap == null || hashMap.get(str) == null) {
            return b;
        }
        return f.get(str);
    }

    public static wmn e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wmn) ipChange.ipc$dispatch("70ce1ec5", new Object[0]);
        }
        return yyj.e().i();
    }

    public static jee f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jee) ipChange.ipc$dispatch("e7d46dd9", new Object[]{str});
        }
        HomeInfoFlowDataService a2 = rue.a(str);
        if (a2 != null) {
            return a2.getDataServiceWindVaneProvider();
        }
        HashMap<String, jee> hashMap = g;
        if (hashMap == null || hashMap.get(str) == null) {
            return null;
        }
        return g.get(str);
    }

    @Deprecated
    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("709e8292", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static synchronized void h(String str, imi imiVar) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d59660c9", new Object[]{str, imiVar});
                return;
            }
            if (d == null) {
                d = new HashMap<>();
            }
            d.put(str, imiVar);
        }
    }

    public static synchronized void i(String str, imi imiVar) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e3d62ba", new Object[]{str, imiVar});
                return;
            }
            if (e == null) {
                e = new HashMap<>();
            }
            e.put(str, imiVar);
        }
    }

    public static synchronized void j(String str, imn imnVar) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d777d879", new Object[]{str, imnVar});
                return;
            }
            if (f == null) {
                f = new HashMap<>();
            }
            f.put(str, imnVar);
        }
    }

    public static synchronized void k(String str, jee jeeVar) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4dc191c", new Object[]{str, jeeVar});
                return;
            }
            if (g == null) {
                g = new HashMap<>();
            }
            g.put(str, jeeVar);
        }
    }

    public static void l(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00e4571", new Object[]{imnVar});
        } else {
            b = imnVar;
        }
    }

    public static void m(imi imiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a976e8d2", new Object[]{imiVar});
        } else {
            c = imiVar;
        }
    }

    public static synchronized void n(String str) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e195c3d8", new Object[]{str});
                return;
            }
            HashMap<String, imi> hashMap = d;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        }
    }

    public static synchronized void o(String str) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59ca49f7", new Object[]{str});
                return;
            }
            HashMap<String, imi> hashMap = e;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        }
    }

    public static synchronized void p(String str) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87e36828", new Object[]{str});
                return;
            }
            HashMap<String, imi> hashMap = d;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        }
    }

    public static synchronized void q(String str) {
        synchronized (zza.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ece3277", new Object[]{str});
                return;
            }
            HashMap<String, jee> hashMap = g;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        }
    }
}
