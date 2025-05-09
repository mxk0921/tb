package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qau implements g2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] g = {"weitao_switch", "tnode", "ShortVideo", hpb.UGC_ORANGE_GROUP};
    public static final g2e h = p();
    public static final Set<String> i = new HashSet();
    public static final Map<String, Map<Long, b>> j = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public String f26639a;
    public final boolean b = akt.p2("enableAddTintInfo", true);
    public final HashSet<String> d = new HashSet<>();
    public final Map<String, String> e = new HashMap();
    public final Map<String, String> f = new HashMap();
    public String[] c = g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f26640a;
        public final long b;
        public final long c;

        static {
            t2o.a(503317360);
        }

        public b(long j, long j2, long j3) {
            this.f26640a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f26641a;
        public List<String> b;

        static {
            t2o.a(503317361);
        }

        public c() {
        }
    }

    public qau(String str) {
        this.f26639a = str;
    }

    public static g2e p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("137ec72b", new Object[0]);
        }
        return new qau("tab2");
    }

    public static g2e q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("f1b37b61", new Object[]{str});
        }
        return new qau(str);
    }

    public static Map<Long, b> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd2a5681", new Object[0]);
        }
        Map<String, Map<Long, b>> map = j;
        synchronized (map) {
            try {
                Map map2 = (Map) ((HashMap) map).get("tab2");
                if (map2 != null) {
                    return new HashMap(map2);
                }
                return new HashMap();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g2e s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("60c423a", new Object[0]);
        }
        return h;
    }

    public static void v(String str, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1a3e4", new Object[]{str, new Long(j2), new Long(j3), new Long(j4)});
        } else if (j2 != 0) {
            Map<String, Map<Long, b>> map = j;
            synchronized (map) {
                try {
                    Map map2 = (Map) ((HashMap) map).get(str);
                    if (map2 == null) {
                        map2 = new HashMap();
                        ((HashMap) map).put(str, map2);
                    }
                    map2.put(Long.valueOf(j2), new b(j2, j3, j4));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.g2e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.f26639a = str;
        }
    }

    @Override // tb.g2e
    public void b(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ceb055", new Object[]{this, str, str2, map, map2});
            return;
        }
        u(str, str2, map, map2);
        HashMap hashMap = new HashMap();
        if (this.b) {
            hashMap.putAll(e());
        }
        if (!map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        DimensionValueSet fromStringMap = DimensionValueSet.fromStringMap(hashMap);
        HashMap hashMap2 = new HashMap();
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                hashMap2.put(entry2.getKey(), Double.valueOf(nwv.p(entry2.getValue(), vu3.b.GEO_NOT_SUPPORT)));
            }
        }
        MeasureValueSet create = MeasureValueSet.create(hashMap2);
        AppMonitor.Stat.commit(this.f26639a + "_" + str, str2, fromStringMap, create);
        tfs.g("TrackTint", "commitState: " + this.f26639a + "_" + str + " name:" + str2);
    }

    @Override // tb.g2e
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afeb64b", new Object[]{this, str, str2});
            return;
        }
        try {
            ((HashMap) this.e).put(str, str2);
        } catch (Throwable unused) {
        }
    }

    @Override // tb.g2e
    public void commitSuccess(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bb57be", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        i(map);
        AppMonitor.Alarm.commitSuccess(this.f26639a + "_" + str, str2, JSON.toJSONString(map));
        tfs.g("TrackTint", "commitSuccess: " + this.f26639a + "_" + str + " name:" + str2);
    }

    @Override // tb.g2e
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d63e550", new Object[]{this, str, str2});
            return;
        }
        try {
            ((HashMap) this.f).put(str, str2);
        } catch (Throwable unused) {
        }
    }

    @Override // tb.g2e
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("26cbc96a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            String k = k();
            String m = m();
            String j2 = j();
            String n = n();
            Map l = l();
            hashMap.put(this.f26639a + "_basic_configs", k);
            hashMap.put(this.f26639a + "_orange_configs", m);
            hashMap.put(this.f26639a + "_abtest_configs", j2);
            hashMap.put(this.f26639a + "_web_configs", n);
            hashMap.putAll(this.f);
            hashMap.putAll(l);
            hashMap.put(sj4.TAB2_NATIVE, "true");
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // tb.g2e
    public void f(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c58066", new Object[]{this, strArr});
            return;
        }
        this.c = strArr;
        vfs.g().q(strArr);
    }

    @Override // tb.g2e
    public void g(String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4bc6b", new Object[]{this, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        i(map);
        AppMonitor.Alarm.commitFail(this.f26639a + "_" + str, str2, JSON.toJSONString(map), str3, null);
        tfs.g("TrackTint", "commitFail: " + this.f26639a + "_" + str + " name:" + str2 + " errorCode:" + str3);
    }

    @Override // tb.g2e
    public void h(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2957210", new Object[]{this, str, list});
        } else if (list != null) {
            try {
                c o = o(list);
                if (o.f26641a != null && o.b != null) {
                    synchronized (this.d) {
                        Iterator it = ((ArrayList) o.b).iterator();
                        while (it.hasNext()) {
                            HashSet<String> hashSet = this.d;
                            hashSet.add(o.f26641a + ":" + ((String) it.next()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void i(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42415d4", new Object[]{this, map});
        } else {
            map.putAll(e());
        }
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2314feef", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            Map<String, Map<Long, b>> map = j;
            synchronized (map) {
                Map map2 = (Map) ((HashMap) map).get(this.f26639a);
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        b bVar = (b) entry.getValue();
                        if (sb.length() > 0) {
                            sb.append(";");
                        }
                        sb.append(bVar.f26640a);
                        sb.append(":");
                        sb.append(bVar.b);
                        sb.append(":");
                        sb.append(bVar.c);
                    }
                    sb.append(";");
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final String k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f072280", new Object[]{this});
        }
        int k = od0.D().i().k();
        String utdid = od0.D().i().getUtdid(o.J());
        if (gwj.e(o.J())) {
            str = gwj.d(o.J());
        } else {
            str = "disconnected";
        }
        int b2 = gwj.b(o.J());
        return "deviceLevel:" + k + ";utdid:" + utdid + ";networkType:" + str + ";networkQuality:" + b2;
    }

    public final Map l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b9b1333", new Object[]{this});
        }
        return this.e;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29ecd55c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : vfs.g().h().entrySet()) {
                String key = entry.getKey();
                if (t(key)) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(key);
                    sb.append(":");
                    sb.append(entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12ac97a6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            synchronized (this.d) {
                Iterator<String> it = this.d.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(next);
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final c o(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ddcaaa52", new Object[]{this, list});
        }
        c cVar = new c();
        for (Object obj : list) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String I = nwv.I(map.get("type"), null);
                String I2 = nwv.I(map.get("name"), null);
                String I3 = nwv.I(map.get("version"), null);
                if (TextUtils.equals(I, "page")) {
                    cVar.f26641a = I2 + "_" + I3;
                } else {
                    if (cVar.b == null) {
                        cVar.b = new ArrayList();
                    }
                    List<String> list2 = cVar.b;
                    ((ArrayList) list2).add(I2 + "_" + I3);
                }
            }
        }
        return cVar;
    }

    public final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4882e810", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : this.c) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final void u(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d35df64", new Object[]{this, str, str2, map, map2});
            return;
        }
        String str3 = this.f26639a + "_" + str + "_" + str2;
        if (!((HashSet) i).contains(str3)) {
            ArrayList arrayList = new ArrayList();
            if (this.b) {
                arrayList.add(this.f26639a + "_basic_configs");
                arrayList.add(this.f26639a + "_orange_configs");
                arrayList.add(this.f26639a + "_abtest_configs");
                arrayList.add(this.f26639a + "_web_configs");
                for (String str4 : ((HashMap) this.e).keySet()) {
                    arrayList.add(str4);
                }
                for (String str5 : ((HashMap) this.f).keySet()) {
                    arrayList.add(str5);
                }
            }
            if (map != null) {
                for (String str6 : map.keySet()) {
                    arrayList.add(str6);
                }
            }
            DimensionSet create = DimensionSet.create(arrayList);
            ArrayList arrayList2 = new ArrayList();
            if (map2 != null) {
                arrayList2.addAll(map2.keySet());
            }
            AppMonitor.register(this.f26639a + "_" + str, str2, MeasureSet.create(arrayList2), create);
            ((HashSet) i).add(str3);
        }
    }

    static {
        t2o.a(503317358);
        t2o.a(503316607);
    }
}
