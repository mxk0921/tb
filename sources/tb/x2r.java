package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.SystemConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x2r extends y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static x2r e = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f31104a = Collections.synchronizedMap(new HashMap());
    public final Map<String, List<a>> b = Collections.synchronizedMap(new HashMap());
    public final String[] c = {"utap_system"};
    public final Map<String, b> d = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592826);
        }

        public b() {
            new ArrayList();
        }

        public static b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c5266b9", new Object[]{str});
            }
            try {
                b bVar = new b();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("all_d")) {
                    jSONObject.optInt("all_d", -1);
                }
                if (jSONObject.has("arg1")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("arg1");
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                    }
                }
                return bVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    static {
        t2o.a(962592824);
    }

    public x2r() {
        try {
            if (o2w.k().h() != null) {
                List<? extends rf8> i = o2w.k().h().i(SystemConfig.class, null, null, -1);
                if (i.size() > 0) {
                    Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap(i.size()));
                    for (int i2 = 0; i2 < i.size(); i2++) {
                        synchronizedMap.put(((SystemConfig) i.get(i2)).key, ((SystemConfig) i.get(i2)).value);
                    }
                    j(synchronizedMap);
                }
            }
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    public static synchronized x2r f() {
        synchronized (x2r.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x2r) ipChange.ipc$dispatch("c696d143", new Object[0]);
            }
            if (e == null) {
                e = new x2r();
            }
            return e;
        }
    }

    public static /* synthetic */ Object ipc$super(x2r x2rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/SystemConfigMgr");
    }

    @Override // tb.y1v
    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1114543", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.y1v
    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217cb94", new Object[]{this, str, map});
        } else if ("utap_system".equalsIgnoreCase(str)) {
            j(map);
            o2w.k().h().b(SystemConfig.class);
            o2w.k().h().o(h(this.f31104a));
        }
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4410495", new Object[]{this, str, str2});
            return;
        }
        List<a> list = this.b.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).a(str, str2);
            }
        }
        m0v.b(str, str2);
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        return this.f31104a.get(str);
    }

    public int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue();
        }
        String e2 = e(str);
        if (!TextUtils.isEmpty(e2)) {
            try {
                return Integer.valueOf(e2).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public final List<rf8> h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2582c75e", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            SystemConfig systemConfig = new SystemConfig();
            systemConfig.key = str;
            systemConfig.value = map.get(str);
            arrayList.add(systemConfig);
        }
        return arrayList;
    }

    public void i(String str, a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31654ad9", new Object[]{this, str, aVar});
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.get(str) == null) {
                    list = new ArrayList<>();
                } else {
                    list = this.b.get(str);
                }
                list.add(aVar);
                this.b.put(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8424d3", new Object[]{this, map});
            return;
        }
        k(map);
        HashMap hashMap = new HashMap(this.f31104a.size());
        hashMap.putAll(this.f31104a);
        this.f31104a.clear();
        this.f31104a.putAll(map);
        for (String str : this.f31104a.keySet()) {
            if ((this.f31104a.get(str) == null && hashMap.get(str) != null) || (this.f31104a.get(str) != null && !this.f31104a.get(str).equalsIgnoreCase((String) hashMap.get(str)))) {
                d(str, this.f31104a.get(str));
            }
            hashMap.remove(str);
        }
        for (String str2 : hashMap.keySet()) {
            d(str2, this.f31104a.get(str2));
        }
    }

    public final synchronized void k(Map<String, String> map) {
        Map<String, b> map2;
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77875ca0", new Object[]{this, map});
            return;
        }
        if (map != null && map.containsKey("delay")) {
            if ((this.f31104a.get("delay") == null || !map.get("delay").equals(this.f31104a.get("delay"))) && (map2 = this.d) != null) {
                ((HashMap) map2).clear();
                try {
                    JSONObject jSONObject = new JSONObject(map.get("delay"));
                    Iterator<String> keys = jSONObject.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String string = jSONObject.getString(next);
                            if (!TextUtils.isEmpty(string) && (a2 = b.a(string)) != null) {
                                ((HashMap) this.d).put(next, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        Map<String, b> map3 = this.d;
        if (map3 != null) {
            ((HashMap) map3).clear();
        }
    }
}
