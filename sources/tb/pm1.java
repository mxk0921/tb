package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static pm1 i;
    public final AtomicReference<String> c = new AtomicReference<>("");
    public final AtomicReference<String> d = new AtomicReference<>("");
    public final AtomicLong e = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f26175a = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public final AtomicInteger f = new AtomicInteger(1);
    public final AtomicInteger g = new AtomicInteger(1);
    public final AtomicInteger h = new AtomicInteger(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f26176a;
        public String b;
        public String c;
        public int d;
        public int e;
        public long f;

        static {
            t2o.a(404750648);
        }

        public b() {
        }
    }

    static {
        t2o.a(404750646);
    }

    public static synchronized pm1 l() {
        synchronized (pm1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pm1) ipChange.ipc$dispatch("46699863", new Object[0]);
            }
            if (i == null) {
                i = new pm1();
            }
            return i;
        }
    }

    public final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        Map<String, Object> innerMap = v82.c.c().getInnerMap();
        if (innerMap == null) {
            return Collections.emptyList();
        }
        return new ArrayList(innerMap.keySet());
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            String i2 = i(str);
            if (!TextUtils.isEmpty(i2)) {
                this.b.put(i2, String.valueOf(this.h.getAndIncrement()));
                TLog.logd("BehaviX", "BHXPageIdentifierManager", "[bxid]addGeneration=" + str + ", gk=" + i2 + ", genid=" + this.h);
                this.e.set(System.currentTimeMillis());
                StringBuilder sb = new StringBuilder();
                for (String str2 : this.b.keySet()) {
                    sb.append(str2);
                    sb.append("#");
                    sb.append(this.b.get(str2));
                    sb.append("_");
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '_') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                this.c.set(this.d.get());
                this.d.set(sb.toString());
            }
        }
    }

    public final void c(b bVar) {
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebf67a9", new Object[]{this, bVar});
            return;
        }
        List<b> g = g(bVar.b);
        if (!g.isEmpty()) {
            bVar2 = g.get(0);
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            bVar.e = bVar2.e;
            bVar.f26176a = bVar2.f26176a;
            bVar.c = bVar2.c;
        } else {
            bVar.e = this.g.getAndIncrement();
            b(bVar.f26176a);
        }
        bVar.d = this.f.getAndIncrement();
        bVar.f = System.currentTimeMillis();
        this.f26175a.add(bVar);
        if (this.f26175a.size() >= 60) {
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f26175a;
            copyOnWriteArrayList.removeAll(copyOnWriteArrayList.subList(0, 30));
        }
        TLog.logd("BehaviX", "BHXPageIdentifierManager", "[bxid]addPage=" + bVar.f26176a + ", pvid=" + bVar.d + ", insid=" + bVar.e + ", iden=" + bVar.b);
    }

    public void d(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c1fdba", new Object[]{this, str, str2, obj});
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                b bVar = new b();
                String k = k(str);
                if (!TextUtils.isEmpty(k)) {
                    bVar.f26176a = k;
                } else {
                    bVar.f26176a = str;
                }
                bVar.b = str2;
                c(bVar);
            } catch (Throwable th) {
                TLog.loge("BehaviX", "BHXPageIdentifierManager", "[bxid]addPageItemWithPageName error=" + th.getMessage());
            }
        }
    }

    public Map<String, String> e(int i2, String str, Map<String, String> map) {
        b bVar;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e6a70bb", new Object[]{this, new Integer(i2), str, map});
        }
        List<String> a2 = a();
        if (!a2.isEmpty() && a2.contains(str)) {
            try {
                List<b> h = h(str);
                if (h.size() == 1) {
                    bVar = h.get(0);
                } else if (h.size() > 1) {
                    List<String> j = j(str);
                    if (j != null && !j.isEmpty()) {
                        bVar2 = null;
                        for (String str2 : j) {
                            String str3 = map.get(str2);
                            Iterator<b> it = h.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                b next = it.next();
                                String str4 = next.c;
                                if (str4 != null && str4.equals(str3)) {
                                    bVar2 = next;
                                    continue;
                                    break;
                                }
                            }
                            if (bVar2 != null) {
                                break;
                            }
                        }
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar = h.get(0);
                    } else {
                        bVar = bVar2;
                    }
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bxid", f(bVar));
                    return hashMap;
                }
            } catch (Throwable th) {
                TLog.loge("BehaviX", "BHXPageIdentifierManager", "[bxid]appendInfoWithEventId error=" + th.getMessage());
            }
        }
        return null;
    }

    public final String f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a65ae818", new Object[]{this, bVar});
        }
        if (TextUtils.isEmpty(this.d.get())) {
            return bVar.d + "`" + bVar.e;
        } else if (bVar.f >= this.e.get()) {
            return bVar.d + "`" + bVar.e + "`" + this.d;
        } else if (TextUtils.isEmpty(this.c.get())) {
            return bVar.d + "`" + bVar.e;
        } else {
            return bVar.d + "`" + bVar.e + "`" + this.c;
        }
    }

    public final List<b> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        for (int size = this.f26175a.size() - 1; size >= 0; size--) {
            b bVar = this.f26175a.get(size);
            if (str.equals(bVar.b)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final List<b> h(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (Arrays.asList(SkuLogUtils.PAGE_NAME, "Page_NewBuy").contains(str)) {
            if (this.f26175a.isEmpty()) {
                bVar = null;
            } else {
                CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f26175a;
                bVar = copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1);
            }
            if (bVar == null) {
                return Collections.emptyList();
            }
            return Collections.singletonList(bVar);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = this.f26175a.size() - 1; size >= 0; size--) {
            b bVar2 = this.f26175a.get(size);
            if (str.equals(bVar2.f26176a)) {
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        Map<String, Object> innerMap = v82.c.c().getInnerMap();
        if (innerMap == null) {
            return "";
        }
        try {
            Map map = (Map) innerMap.get(str);
            if (map != null && map.containsKey("gk")) {
                return (String) map.get("gk");
            }
            return "";
        } catch (Throwable th) {
            TLog.loge("BehaviX", "BHXPageIdentifierManager", "generationKeyWithPageName error", th);
            return "";
        }
    }

    public final List<String> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{this, str});
        }
        Map<String, Object> innerMap = v82.c.c().getInnerMap();
        try {
            if (innerMap == null) {
                return Collections.emptyList();
            }
            Map map = (Map) innerMap.get(str);
            if (map != null && map.containsKey("bk")) {
                return (List) map.get("bk");
            }
            return Collections.emptyList();
        } catch (Throwable th) {
            TLog.loge("BehaviX", "BHXPageIdentifierManager", "bizIdKeyWithPageName error", th);
            return Collections.emptyList();
        }
    }

    public final String k(String str) {
        Map<String, Object> innerMap;
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        if (str == null || str.isEmpty() || (innerMap = v82.c.c().getInnerMap()) == null || (map = (Map) innerMap.get("class2PageName")) == null) {
            return "";
        }
        return (String) map.get(str);
    }

    public void m(String str, String str2, Map<String, String> map) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd27fee5", new Object[]{this, str, str2, map});
            return;
        }
        List<String> j = j(str);
        if (j != null && !j.isEmpty()) {
            try {
                Iterator<b> it = g(str2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = it.next();
                    String str3 = bVar.c;
                    if (str3 != null) {
                        if (str3.isEmpty()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (bVar != null) {
                    Iterator<String> it2 = j.iterator();
                    if (it2.hasNext()) {
                        bVar.c = map.get(it2.next());
                    }
                }
            } catch (Throwable th) {
                TLog.loge("BehaviX", "BHXPageIdentifierManager", "[bxid]updateBizIdWithPageName error=" + th.getMessage());
            }
        }
    }

    public void n(String str, String str2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317ed8be", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List<b> g = g(str2);
                if (g.isEmpty()) {
                    bVar = null;
                } else {
                    bVar = g.get(0);
                }
                if (bVar != null && !TextUtils.equals(str, bVar.f26176a)) {
                    bVar.f26176a = str;
                    b(str);
                    TLog.logd("BehaviX", "BHXPageIdentifierManager", "[bxid]updatePageName=" + str + ", iden=" + str2);
                }
            } catch (Throwable th) {
                TLog.loge("BehaviX", "BHXPageIdentifierManager", "[bxid]updatePageName error=" + th.getMessage());
            }
        }
    }
}
