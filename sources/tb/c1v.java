package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c1v implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "gProp";
    public static c1v e = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f16780a = new HashMap();
    public final List<String> b = new ArrayList();
    public final List<String> c = new ArrayList();
    public final Map<String, List<String>> d = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<String> f16781a;
        public List<String> b;

        static {
            t2o.a(962592840);
        }

        public b() {
            this.f16781a = null;
            this.b = null;
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fe2299d", new Object[]{this, str})).booleanValue();
            }
            if (c(str) || !b(str)) {
                return false;
            }
            return true;
        }

        public final boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fb469412", new Object[]{this, str})).booleanValue();
            }
            List<String> list = this.b;
            if (list == null || list.contains("*") || this.b.contains(str)) {
                return true;
            }
            return false;
        }

        public final boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca14a150", new Object[]{this, str})).booleanValue();
            }
            List<String> list = this.f16781a;
            if (list == null) {
                return false;
            }
            if (list.contains("*") || this.f16781a.contains(str)) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(962592838);
        t2o.a(962592825);
    }

    public static c1v e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c1v) ipChange.ipc$dispatch("788c3b11", new Object[0]);
        }
        if (e == null) {
            e = new c1v();
        }
        return e;
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
            return;
        }
        try {
            g(str2);
        } catch (Exception unused) {
        }
    }

    public boolean b(String str, String str2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2a37f27", new Object[]{this, str, str2})).booleanValue();
        }
        Map<String, b> map = this.f16780a;
        if (map == null) {
            return true;
        }
        try {
            if (!((HashMap) map).containsKey(str) || (bVar = (b) ((HashMap) this.f16780a).get(str)) == null) {
                return true;
            }
            return bVar.a(str2);
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("620bd153", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : oeh.LogField) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public synchronized List<String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d24f5a9", new Object[]{this, str});
        } else if ("65501".equalsIgnoreCase(str) || "65502".equalsIgnoreCase(str) || "65503".equalsIgnoreCase(str)) {
            return null;
        } else {
            try {
                if (((ArrayList) this.b).contains(str)) {
                    return (List) ((HashMap) this.d).get(str);
                }
                return (List) ((HashMap) this.d).get("other");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b043b23b", new Object[]{this});
            return;
        }
        Map<String, b> map = this.f16780a;
        if (map == null || ((HashMap) map).size() < 1) {
            nhh.f("UTGlobalPropConfigListener", "mBlackGlobalPropItemMap is null");
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((HashMap) this.f16780a).entrySet()) {
                String str2 = (String) entry.getKey();
                if (!hsq.f(str2) && !c(str2)) {
                    if (!b(str2, str)) {
                        arrayList.add(str2);
                    }
                } else {
                    return;
                }
            }
            ((HashMap) this.d).put(str, arrayList);
        }
        ((HashMap) this.d).put("other", this.c);
        nhh.f("UTGlobalPropConfigListener", "mBlackGlobalPropItemMap", this.d);
    }

    public final synchronized void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("UTGlobalPropConfigListener", "parseConfig", str);
        ((HashMap) this.f16780a).clear();
        ((ArrayList) this.c).clear();
        ((HashMap) this.d).clear();
        ((ArrayList) this.b).clear();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (Map.Entry entry : ((HashMap) JSON.parseObject(str, Map.class)).entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!hsq.f(str2) && !c(str2)) {
                        Map map = (Map) entry.getValue();
                        if (map != null) {
                            b bVar = new b();
                            try {
                                List<String> list = (List) map.get("eidin");
                                bVar.b = list;
                                if (list != null) {
                                    for (String str3 : list) {
                                        if (!"*".equalsIgnoreCase(str3) && !((ArrayList) this.b).contains(str3)) {
                                            ((ArrayList) this.b).add(str3);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                bVar.b = null;
                            }
                            try {
                                List<String> list2 = (List) map.get("eidnin");
                                bVar.f16781a = list2;
                                if (list2 != null) {
                                    for (String str4 : list2) {
                                        if (!"*".equalsIgnoreCase(str4) && !((ArrayList) this.b).contains(str4)) {
                                            ((ArrayList) this.b).add(str4);
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                bVar.f16781a = null;
                            }
                            List<String> list3 = bVar.b;
                            if (list3 == null || list3.size() <= 0) {
                                List<String> list4 = bVar.f16781a;
                                if (list4 != null && list4.size() > 0 && bVar.f16781a.contains("*")) {
                                    ((ArrayList) this.c).add(str2);
                                }
                            } else if (!bVar.b.contains("*")) {
                                ((ArrayList) this.c).add(str2);
                            }
                            if (bVar.b != null || bVar.f16781a != null) {
                                ((HashMap) this.f16780a).put(str2, bVar);
                                nhh.f("UTGlobalPropConfigListener", "key", str2, "globalPropItem.eidin", bVar.b, "globalPropItem.eidnin", bVar.f16781a);
                            }
                        }
                    }
                    return;
                }
            } catch (Exception e2) {
                nhh.h("UTGlobalPropConfigListener", e2, new Object[0]);
            }
        }
        f();
    }
}
