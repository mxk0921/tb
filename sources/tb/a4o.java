package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, b> b = new ConcurrentHashMap();
    public static final Map<String, String> c = new ConcurrentHashMap();
    public static final ReentrantLock d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final String f15536a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15537a;
        public MtopInfo b;

        static {
            t2o.a(912262152);
        }

        public MtopInfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopInfo) ipChange.ipc$dispatch("9535a51b", new Object[]{this});
            }
            return this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
            }
            return this.f15537a;
        }

        public void c(MtopInfo mtopInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72575c19", new Object[]{this, mtopInfo});
            } else {
                this.b = mtopInfo;
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
            } else {
                this.f15537a = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f15538a;
        public owc b;

        static {
            t2o.a(912262153);
        }

        public owc a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (owc) ipChange.ipc$dispatch("d75fcc7a", new Object[]{this});
            }
            return this.b;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bf5553b", new Object[]{this});
            }
            return this.f15538a;
        }

        public void c(owc owcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2969c6f2", new Object[]{this, owcVar});
            } else {
                this.b = owcVar;
            }
        }

        public void d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bad313fb", new Object[]{this, aVar});
            } else {
                this.f15538a = aVar;
            }
        }
    }

    static {
        t2o.a(912262151);
    }

    public a4o(String str) {
        this.f15536a = str;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a1b9e1", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) c).remove(str);
            ((ConcurrentHashMap) b).remove(str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ddfb9", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b;
            Object obj = concurrentHashMap.get(str);
            if (obj == null || !(obj instanceof b)) {
                concurrentHashMap.put(str, new b());
            }
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b18725b", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return (String) ((ConcurrentHashMap) c).get(str);
    }

    public static boolean i(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a613492", new Object[]{mtopInfo})).booleanValue();
        }
        if (mtopInfo != null && mtopInfo.b() == 3) {
            return true;
        }
        return false;
    }

    public static boolean j(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ec94f8", new Object[]{mtopInfo})).booleanValue();
        }
        if (mtopInfo.b() == 1) {
            return true;
        }
        return false;
    }

    public static boolean k(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a895cdb7", new Object[]{mtopInfo})).booleanValue();
        }
        if (mtopInfo != null && mtopInfo.b() == 2) {
            return true;
        }
        return false;
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dd9fe3", new Object[]{str, str2});
        } else if (str != null && str2 != null) {
            ((ConcurrentHashMap) c).put(str, str2);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1d87b6", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f15536a) || ((ConcurrentHashMap) b).get(this.f15536a) == null) {
            return false;
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c437d7", new Object[]{this});
        } else {
            ((ConcurrentHashMap) b).remove(this.f15536a);
        }
    }

    public a e() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bf5553b", new Object[]{this});
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            b g = g();
            if (g == null) {
                aVar = null;
            } else {
                aVar = g.b();
            }
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            d.unlock();
            throw th;
        }
    }

    public b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9c78dbbf", new Object[]{this});
        }
        return (b) ((ConcurrentHashMap) b).get(this.f15536a);
    }

    public owc h() {
        owc owcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (owc) ipChange.ipc$dispatch("75ca5557", new Object[]{this});
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            b g = g();
            if (g == null) {
                owcVar = null;
            } else {
                owcVar = g.a();
            }
            reentrantLock.unlock();
            return owcVar;
        } catch (Throwable th) {
            d.unlock();
            throw th;
        }
    }

    public void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb18f96", new Object[]{this, aVar});
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            b bVar = (b) ((ConcurrentHashMap) b).get(this.f15536a);
            if (bVar == null) {
                reentrantLock.unlock();
                return;
            }
            bVar.d(aVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            d.unlock();
            throw th;
        }
    }

    public void m(owc owcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189c08e2", new Object[]{this, owcVar});
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            b bVar = (b) ((ConcurrentHashMap) b).get(this.f15536a);
            if (bVar == null) {
                reentrantLock.unlock();
                return;
            }
            bVar.c(owcVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            d.unlock();
            throw th;
        }
    }
}
