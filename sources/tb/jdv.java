package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.UmbrellaProcessTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f21941a = "Page_HomePage";
    public static final Map<gdv, Map<String, b>> b = new ConcurrentHashMap();
    public static volatile boolean c = false;
    public static final Map<gdv, b> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f21942a;
        public long b;
        public long c;
        public long d;
        public String e;

        static {
            t2o.a(729809125);
        }

        public b() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MethodName =" + this.f21942a + " CostTime =" + this.d + "ms\r\n";
        }
    }

    static {
        t2o.a(729809123);
    }

    public static void b(gdv gdvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf5ea23", new Object[]{gdvVar, str, str2});
        } else if (!c) {
            Map<gdv, Map<String, b>> map = b;
            Map map2 = (Map) ((ConcurrentHashMap) map).get(gdvVar);
            if (map2 == null) {
                bqa.a("TimeProfiler", "None Start process " + gdvVar.a());
                return;
            }
            b bVar = (b) map2.get(str);
            if (bVar == null) {
                bqa.a("TimeProfiler", "None Start method " + str);
                return;
            }
            bVar.e = str2;
            if (bVar.d <= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                bVar.c = currentTimeMillis;
                long j = bVar.b;
                if (j > 0) {
                    bVar.d = currentTimeMillis - j;
                } else {
                    ((ConcurrentHashMap) map).remove(str);
                }
            }
        }
    }

    public static void c(gdv gdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504d0b08", new Object[]{gdvVar});
        } else if (!c && gdvVar != null) {
            Map<gdv, b> map = d;
            b bVar = (b) ((ConcurrentHashMap) map).get(gdvVar);
            if (bVar != null && bVar.d <= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                bVar.c = currentTimeMillis;
                long j = bVar.b;
                if (j > 0) {
                    bVar.d = currentTimeMillis - j;
                    bqa.a("TimeProfiler", "TimeProfiler " + f21941a + " " + gdvVar.a() + " CostTime " + bVar.d + "ms");
                    return;
                }
                ((ConcurrentHashMap) map).remove(gdvVar);
            }
        }
    }

    public static void d(gdv gdvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74bcbea", new Object[]{gdvVar, str, str2});
        } else if (!c && gdvVar != null && !TextUtils.isEmpty(str)) {
            Map<gdv, Map<String, b>> map = b;
            Map map2 = (Map) ((ConcurrentHashMap) map).get(gdvVar);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                ((ConcurrentHashMap) map).put(gdvVar, map2);
            }
            b bVar = new b();
            bVar.f21942a = str;
            bVar.b = System.currentTimeMillis();
            bVar.d = 0L;
            bVar.e = str2;
            map2.put(str, bVar);
        }
    }

    public static void e(gdv gdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fba3e1", new Object[]{gdvVar});
        } else if (!c && gdvVar != null) {
            Map<gdv, b> map = d;
            b bVar = (b) ((ConcurrentHashMap) map).get(gdvVar);
            if (bVar == null) {
                bVar = new b();
                ((ConcurrentHashMap) map).put(gdvVar, bVar);
            }
            bVar.b = System.currentTimeMillis();
            bVar.d = 0L;
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6661a9", new Object[]{new Long(j)});
        } else if (!c) {
            c = true;
            UmbrellaProcessTracker.register("Page_HomePage");
            UmbrellaProcessTracker.addPageLoad("Page_HomePage", j);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = 0;
            for (gdv gdvVar : ((ConcurrentHashMap) b).keySet()) {
                Map map = (Map) ((ConcurrentHashMap) b).get(gdvVar);
                Iterator it = map.keySet().iterator();
                int i = 0;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    b bVar = (b) map.get(str);
                    if (!TextUtils.isEmpty(bVar.f21942a)) {
                        map = map;
                        it = it;
                        currentTimeMillis = currentTimeMillis;
                        String format = String.format("method=%s,desc=%s , startTime=%d,endTime=%d,cost=%d", bVar.f21942a, bVar.e, Long.valueOf(bVar.b), Long.valueOf(bVar.c), Long.valueOf(bVar.d));
                        if (TextUtils.isEmpty(bVar.e)) {
                            UmbrellaProcessTracker.addSubProcess("Page_HomePage", gdvVar, str, bVar.d);
                        } else {
                            UmbrellaProcessTracker.addSubProcess("Page_HomePage", gdvVar, str + "_" + bVar.e, bVar.d);
                        }
                        bqa.a("TimeProfiler", format);
                        i = (int) (i + bVar.d);
                    } else {
                        currentTimeMillis = currentTimeMillis;
                        map = map;
                        it = it;
                    }
                }
                if (gdvVar == gdv.SUB_BIND_VIEW || gdvVar == gdv.SUB_CREATE_VIEW) {
                    j2 += i;
                } else {
                    UmbrellaProcessTracker.addProcess("Page_HomePage", gdvVar, i);
                }
                bqa.a("TimeProfiler", String.format("process=%s,cost=%d", gdvVar.a(), Integer.valueOf(i)));
                currentTimeMillis = currentTimeMillis;
            }
            if (j2 >= 0) {
                UmbrellaProcessTracker.addProcess("Page_HomePage", gdv.DRAWVIEW, j2);
            }
            for (gdv gdvVar2 : ((ConcurrentHashMap) d).keySet()) {
                long j3 = ((b) ((ConcurrentHashMap) d).get(gdvVar2)).d;
                if (j3 > 0) {
                    UmbrellaProcessTracker.addProcess("Page_HomePage", gdvVar2, j3);
                }
            }
            new StringBuilder("all dump time =").append(System.currentTimeMillis() - currentTimeMillis);
            UmbrellaProcessTracker.setChildBizName("Page_HomePage", b3b.c());
            UmbrellaProcessTracker.commit("Page_HomePage");
            ((ConcurrentHashMap) b).clear();
            ((ConcurrentHashMap) d).clear();
        }
    }
}
