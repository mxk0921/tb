package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Coordinator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k9h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f22494a = new ConcurrentHashMap();
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final Map<String, String> c = new ConcurrentHashMap();
    public static final List<String> d = new CopyOnWriteArrayList();
    public static final List<String> e = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f22495a;

        public a(Map map) {
            this.f22495a = map;
        }

        @Override // tb.kmc
        public void a(String str) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
                return;
            }
            tm1.a("LocalResourceUtils", "loadRecord2Map: -> " + str);
            if (!TextUtils.isEmpty(str)) {
                try {
                    map = (Map) JSON.parseObject(str, Map.class);
                } catch (Exception e) {
                    tm1.b("LocalResourceUtils", "loadRecord2Map  error", e);
                    map = null;
                }
                if (map != null) {
                    this.f22495a.putAll(map);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22496a;

        public b(String str) {
            this.f22496a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : k9h.a().entrySet()) {
                if (TextUtils.equals(this.f22496a, (CharSequence) entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
            File file = new File(di2.k(this.f22496a));
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (!arrayList.contains(file2.getAbsolutePath()) && file2.exists()) {
                        tm1.a("LocalResourceUtils", "delVideoResource : " + file2.getAbsolutePath() + ",delete:" + file2.delete());
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22497a;

        public c(String str) {
            this.f22497a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            File file = new File(di2.k(this.f22497a));
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    tm1.a("LocalResourceUtils", "delVideoAllResource key: " + this.f22497a + ",file:" + file2.getAbsolutePath() + ",delete:" + file2.delete());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22498a;

        public d(List list) {
            this.f22498a = list;
        }

        @Override // tb.kmc
        public void a(String str) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
                return;
            }
            tm1.a("LocalResourceUtils", "loadRecord2Map: -> " + str);
            if (!TextUtils.isEmpty(str)) {
                try {
                    list = JSON.parseArray(str, String.class);
                } catch (Exception e) {
                    tm1.b("LocalResourceUtils", "loadRecord2Map  error", e);
                    list = null;
                }
                if (list != null) {
                    this.f22498a.addAll(list);
                }
            }
        }
    }

    static {
        t2o.a(736100378);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return c;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862c05c2", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || ((CopyOnWriteArrayList) e).contains(str) || ((CopyOnWriteArrayList) d).contains(str)) {
            return false;
        }
        return true;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dafeb3", new Object[0]);
            return;
        }
        ((ConcurrentHashMap) f22494a).clear();
        kt2.c().b("aweSuffixImages");
        ((CopyOnWriteArrayList) d).clear();
        kt2.c().b("aweFailImages");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a78be65", new Object[0]);
            return;
        }
        ((ConcurrentHashMap) b).clear();
        kt2.c().b("splashSuffixImages");
        ((CopyOnWriteArrayList) e).clear();
        kt2.c().b("splashFailImages");
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656e4cd0", new Object[]{str});
        } else {
            Coordinator.execute(new c(str));
        }
    }

    public static void f(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98617660", new Object[]{str, list});
        } else {
            Coordinator.execute(new b(str));
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ce0054", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, String> map = f22494a;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return (String) ((ConcurrentHashMap) map).get(str);
        }
        Map<String, String> map2 = b;
        if (((ConcurrentHashMap) map2).containsKey(str)) {
            return (String) ((ConcurrentHashMap) map2).get(str);
        }
        return null;
    }

    public static void h(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6965f43b", new Object[]{str, list});
        } else {
            kt2.c().d(str, new d(list));
        }
    }

    public static void i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef46053", new Object[]{str, map});
        } else {
            kt2.c().d(str, new a(map));
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31371a8c", new Object[0]);
            return;
        }
        i("aweSuffixImages", f22494a);
        i("splashSuffixImages", b);
        i("videoMapKey", c);
        h("splashFailImages", e);
        h("aweFailImages", d);
    }

    public static void k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8007fd5e", new Object[]{str, str2, str3});
        } else if (TextUtils.equals("Market", str)) {
            ((ConcurrentHashMap) b).put(str2, str3);
        } else {
            ((ConcurrentHashMap) f22494a).put(str2, str3);
        }
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28499d0a", new Object[]{str, str2});
        } else {
            ((ConcurrentHashMap) c).put(str2, str);
        }
    }

    public static void m(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f163f9d", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            if (TextUtils.equals("Market", str)) {
                List<String> list2 = e;
                ((CopyOnWriteArrayList) list2).addAll(list);
                kt2.c().e("splashFailImages", JSON.toJSONString(list2));
                return;
            }
            List<String> list3 = d;
            ((CopyOnWriteArrayList) list3).addAll(list);
            kt2.c().e("aweFailImages", JSON.toJSONString(list3));
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88718cd", new Object[0]);
            return;
        }
        Map<String, String> map = b;
        if (!((ConcurrentHashMap) map).isEmpty()) {
            String jSONString = JSON.toJSONString(map);
            tm1.a("LocalResourceUtils", "saveSuffixImages splash: -> " + jSONString);
            kt2.c().e("splashSuffixImages", jSONString);
        }
        Map<String, String> map2 = f22494a;
        if (!((ConcurrentHashMap) map2).isEmpty()) {
            String jSONString2 = JSON.toJSONString(map2);
            tm1.a("LocalResourceUtils", "saveSuffixImages awe: -> " + jSONString2);
            kt2.c().e("aweSuffixImages", jSONString2);
        }
    }

    public static void o() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56f9d4a", new Object[0]);
            return;
        }
        Map<String, String> map = c;
        if (((ConcurrentHashMap) map).size() > 0) {
            try {
                str = JSON.toJSONString(map);
            } catch (Exception e2) {
                tm1.b("LocalResourceUtils", "saveVideoPath error: -> ", e2);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                kt2.c().e("videoMapKey", str);
            }
        }
    }
}
