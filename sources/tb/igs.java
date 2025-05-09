package tb;

import android.os.Debug;
import androidx.core.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class igs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21304a = akt.q2("enableTNodeTrace");
    public static final boolean b = akt.q2("enableStartMethodTracing");
    public static final boolean c = akt.q2("enablePrint");
    public static final ThreadLocal<List<b>> d = new ThreadLocal<>();
    public static int e = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                igs.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f21305a;
        public long b;

        static {
            t2o.a(503317270);
        }

        public b() {
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e596b629", new Object[]{bVar});
            }
            return bVar.f21305a;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("497207e1", new Object[]{bVar, str});
            }
            bVar.f21305a = str;
            return str;
        }

        public static /* synthetic */ long c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69a457ea", new Object[]{bVar})).longValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ long d(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ad8a3c84", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.b = j;
            return j;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(503317268);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (f21304a) {
            TraceCompat.beginSection(str);
            if (c) {
                b bVar = new b(null);
                b.b(bVar, str);
                b.d(bVar, System.currentTimeMillis());
                ThreadLocal<List<b>> threadLocal = d;
                List<b> list = threadLocal.get();
                if (list == null) {
                    list = new ArrayList<>();
                    threadLocal.set(list);
                }
                list.add(bVar);
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (f21304a) {
            TraceCompat.endSection();
            if (c) {
                List<b> list = d.get();
                b remove = list.remove(list.size() - 1);
                long currentTimeMillis = System.currentTimeMillis() - b.c(remove);
                if (nwv.X() && currentTimeMillis > 16) {
                    tfs.d("[performance] main thread executed " + currentTimeMillis + " tag:" + b.a(remove));
                } else if (Thread.currentThread().getName().contains("tnode") && currentTimeMillis > 40) {
                    tfs.d("[performance] engine thread executed " + currentTimeMillis + " tag:" + b.a(remove));
                } else if (currentTimeMillis > 100) {
                    tfs.d("[performance] other thread executed " + currentTimeMillis + " tag:" + b.a(remove));
                }
            }
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95626644", new Object[]{str});
        }
        if (str == null || str.length() <= 50) {
            return str;
        }
        return str.substring(str.length() - 50);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b2b81c", new Object[0]);
        } else if (f21304a) {
            b();
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54a3a83", new Object[0])).booleanValue();
        }
        return f21304a;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80869ed", new Object[0]);
        } else if (b) {
            int w2 = akt.w2("delayFinishMethodTracingSamplingTime", 5);
            if (e == -1) {
                int w22 = akt.w2("methodTracingSamplingBufferSize", 50);
                tfs.e("TNodeTrace", "methodTracingSamplingBufferSize:" + w22 + ",delayFinishTime:" + w2);
                Debug.startMethodTracingSampling(null, w22 * 1048576, 10000);
                e = 0;
            }
            nwv.A0(new a(), w2 * 1000);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c350c6", new Object[0]);
        } else if (b && e == 0) {
            Debug.stopMethodTracing();
            e = 1;
        }
    }

    public static void b() {
        try {
            Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }
}
