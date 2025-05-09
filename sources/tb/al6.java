package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class al6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static sb5 f15803a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15804a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DXTemplateItem d;
        public final /* synthetic */ Map e;

        public a(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map map) {
            this.f15804a = str;
            this.b = str2;
            this.c = str3;
            this.d = dXTemplateItem;
            this.e = map;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXUmbrellaUtil$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = al6.a(this.f15804a);
                String str = this.b;
                String b = al6.b();
                String str2 = this.c;
                al6.d().b(this.f15804a, str, b, h36.TAG, str2, al6.c(str2, a2, this.b, this.d, this.e));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15805a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ hyp d;
        public final /* synthetic */ DXTemplateItem e;

        public b(String str, String str2, String str3, hyp hypVar, DXTemplateItem dXTemplateItem) {
            this.f15805a = str;
            this.b = str2;
            this.c = str3;
            this.d = hypVar;
            this.e = dXTemplateItem;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXUmbrellaUtil$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = al6.a(this.f15805a);
                String str = this.b;
                String b = al6.b();
                String str2 = this.c;
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : this.d.d().entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                for (Map.Entry<String, Long> entry2 : this.d.c().entrySet()) {
                    hashMap.put(entry2.getKey(), String.valueOf(((float) entry2.getValue().longValue()) / 1000000.0f));
                }
                al6.d().b(this.f15805a, str, b, h36.TAG, str2, al6.c(this.c, a2, this.b, this.e, hashMap));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f15806a;
        public final /* synthetic */ boolean b;

        public c(f fVar, boolean z) {
            this.f15806a = fVar;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXUmbrellaUtil$3");
        }

        @Override // java.lang.Runnable
        public void run() {
            List<f.a> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                f fVar = this.f15806a;
                if (!(fVar == null || (list = fVar.c) == null || ((ArrayList) list).isEmpty())) {
                    int size = ((ArrayList) this.f15806a.c).size();
                    int i = size - 1;
                    for (int i2 = 0; i2 < size; i2++) {
                        f.a aVar = (f.a) ((ArrayList) this.f15806a.c).get(i2);
                        if (aVar != null) {
                            if (this.b) {
                                aVar.c = "SimplePipeline" + aVar.c;
                            }
                            if (i2 == i) {
                                f fVar2 = this.f15806a;
                                al6.e(fVar2.f7311a, fVar2.b, aVar);
                                f fVar3 = this.f15806a;
                                al6.f(fVar3.f7311a, fVar3.b, aVar);
                                return;
                            }
                            f fVar4 = this.f15806a;
                            al6.e(fVar4.f7311a, fVar4.b, aVar);
                        }
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    static {
        t2o.a(444596912);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return g(str);
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return n();
    }

    public static /* synthetic */ Map c(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af3f247a", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        return m(str, str2, str3, dXTemplateItem, map);
    }

    public static /* synthetic */ sb5 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sb5) ipChange.ipc$dispatch("397d67f1", new Object[0]);
        }
        return f15803a;
    }

    public static /* synthetic */ void e(String str, DXTemplateItem dXTemplateItem, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7de0994", new Object[]{str, dXTemplateItem, aVar});
        } else {
            o(str, dXTemplateItem, aVar);
        }
    }

    public static /* synthetic */ void f(String str, DXTemplateItem dXTemplateItem, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44524673", new Object[]{str, dXTemplateItem, aVar});
        } else {
            j(str, dXTemplateItem, aVar);
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99bf2bed", new Object[]{str});
        }
        return str + "_umbrella2";
    }

    public static Map<String, Object> h(DXTemplateItem dXTemplateItem, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73e7e74d", new Object[]{dXTemplateItem, aVar});
        }
        HashMap hashMap = new HashMap();
        if (dXTemplateItem != null) {
            hashMap.put(yk6.f32141a, dXTemplateItem.f7343a);
            hashMap.put(yk6.b, Long.valueOf(dXTemplateItem.b));
            hashMap.put(yk6.c, dXTemplateItem.c);
        }
        if (aVar != null) {
            hashMap.put(yk6.d, aVar.b);
        }
        return hashMap;
    }

    public static void i(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f4e2ec", new Object[]{fVar, new Boolean(z)});
        } else if (f15803a != null) {
            jb6.i(new c(fVar, z));
        }
    }

    public static void j(String str, DXTemplateItem dXTemplateItem, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8db33", new Object[]{str, dXTemplateItem, aVar});
        } else if (aVar != null) {
            String g = g(aVar.c);
            String str2 = aVar.b;
            String n = n();
            Map<String, String> m = m(str, g, aVar.b, dXTemplateItem, aVar.f);
            String str3 = "" + aVar.d;
            String str4 = aVar.e;
            if (m != null) {
                m.put("errorMsg", str4);
                m.put("errorCode", str3);
            }
            f15803a.a(g, str2, n, h36.TAG, str, m, str3, str4);
        }
    }

    public static void k(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844c5c70", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d)});
        } else if (f15803a != null) {
            jb6.i(new a(str2, str3, str, dXTemplateItem, map));
        }
    }

    public static void l(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, hyp hypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cd8078", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, hypVar});
        } else if (f15803a != null) {
            jb6.i(new b(str2, str3, str, hypVar, dXTemplateItem));
        }
    }

    public static Map<String, String> m(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("440bd432", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizName", h36.TAG);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("sceneName", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("serviceId", str3);
        } else {
            hashMap.put("serviceId", "DX_Default_Service_Id");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("featureType", str2);
        }
        hashMap.put("version", n());
        hashMap.put("samplingRate", "1.0");
        if (dXTemplateItem != null) {
            if (!TextUtils.isEmpty(dXTemplateItem.f7343a)) {
                hashMap.put(yh6.CONFIG_KEY_TEMPLATE_NAME, dXTemplateItem.f7343a);
            }
            hashMap.put("templateVersion", dXTemplateItem.b + "");
            if (!TextUtils.isEmpty(dXTemplateItem.c)) {
                hashMap.put(WVMicorPublishPlugin.TEMPLATE_URL, dXTemplateItem.c);
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return k75.VIDEOCONFIG_API_VERSION_3;
    }

    public static void o(String str, DXTemplateItem dXTemplateItem, f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c84e864", new Object[]{str, dXTemplateItem, aVar});
        } else if (aVar != null) {
            String g = g(aVar.c);
            String str2 = "" + aVar.d;
            String str3 = aVar.e;
            Map<String, Object> h = h(dXTemplateItem, aVar);
            HashMap hashMap = new HashMap();
            Map<String, String> m = m(str, g, aVar.b, dXTemplateItem, aVar.f);
            if (m != null) {
                m.put("errorMsg", str3);
                m.put("errorCode", str2);
            }
            hashMap.put("args", m);
            f15803a.c(h36.TAG, str, g, null, str2, str3, h, hashMap);
        }
    }

    public static void p(sb5 sb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591cc2da", new Object[]{sb5Var});
        } else {
            f15803a = sb5Var;
        }
    }
}
