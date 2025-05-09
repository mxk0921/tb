package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class juv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22231a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ kmb c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        public a(boolean z, Map map, kmb kmbVar, int i, String str) {
            this.f22231a = z;
            this.b = map;
            this.c = kmbVar;
            this.d = i;
            this.e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f22231a) {
                    this.b.putAll(ml1.h(this.c));
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.c.W().o(), this.d, this.e, null, null, this.b).build());
            } catch (Exception e) {
                ub3.g("cartUtSendError", e.getMessage());
            }
        }
    }

    static {
        t2o.a(479199596);
    }

    public static void a(kmb kmbVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a799c211", new Object[]{kmbVar, str, map});
        } else {
            h(kmbVar, str, 2101, map);
        }
    }

    public static void b(kmb kmbVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0905ab", new Object[]{kmbVar, str, strArr});
        } else {
            i(kmbVar, str, 2101, strArr);
        }
    }

    public static Map<String, String> c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e787273f", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap();
        if (strArr.length == 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && str.contains("=")) {
                if (str.contains(",")) {
                    arrayList.add(str);
                } else {
                    g(str, hashMap);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (String str2 : ((String) it.next()).split(",")) {
                g(str2, hashMap);
            }
        }
        return hashMap;
    }

    public static void d(kmb kmbVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a51894", new Object[]{kmbVar, str, strArr});
        } else {
            i(kmbVar, str, 19999, strArr);
        }
    }

    public static void e(kmb kmbVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae44782a", new Object[]{kmbVar, str, strArr});
        } else {
            i(kmbVar, str, 2201, strArr);
        }
    }

    public static Map<String, String> f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e05a2b7", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767d1c6d", new Object[]{str, map});
            return;
        }
        String[] split = str.split("=");
        if (split != null && split.length == 2) {
            map.put(split[0], split[1]);
        }
    }

    public static void h(kmb kmbVar, String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30ced37", new Object[]{kmbVar, str, new Integer(i), map});
            return;
        }
        boolean a2 = vav.a(c9x.CART_BIZ_NAME, "asyncUTSend", true);
        if (a2) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("currentCheckedCount", String.valueOf(CheckHoldManager.i().e()));
        } else if (map == null) {
            map = ml1.h(kmbVar);
        } else {
            map.putAll(ml1.h(kmbVar));
        }
        pav.k(new a(a2, map, kmbVar, i, str));
    }

    public static void i(kmb kmbVar, String str, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7062dd1", new Object[]{kmbVar, str, new Integer(i), strArr});
        } else {
            h(kmbVar, str, i, c(strArr));
        }
    }
}
