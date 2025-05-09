package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792581);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64afdbd8", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        HashMap hashMap = new HashMap();
        hashMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        if (map != null) {
            hashMap.putAll(map);
        }
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afeca4ae", new Object[]{str});
        } else {
            d(str, null);
        }
    }

    public static void c(String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5dcd8d", new Object[]{str, str2, map});
            return;
        }
        if (map instanceof HashMap) {
            hashMap = map;
        } else {
            HashMap hashMap2 = new HashMap();
            if (map != null) {
                hashMap2.putAll(map);
            }
            hashMap = hashMap2;
        }
        String j = oen.j();
        hashMap.put("rainbow", j);
        hashMap.put("encode_rainbow", g6p.d(j));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str + "_Button-" + str2, "", "", hashMap).build());
    }

    public static void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f62d8517", new Object[]{str, map});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            currentPageName = "";
        }
        c(currentPageName, str, map);
    }

    @Deprecated
    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1937cccd", new Object[]{str});
        } else {
            g(str, null, null);
        }
    }

    @Deprecated
    public static void f(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf5702e", new Object[]{str, arrayMap});
        } else {
            g(str, arrayMap, null);
        }
    }

    @Deprecated
    public static void g(String str, ArrayMap<String, String> arrayMap, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badc2a78", new Object[]{str, arrayMap, str2});
        } else {
            i(null, str, arrayMap, str2);
        }
    }

    @Deprecated
    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3923d57", new Object[]{str, str2});
        } else {
            g(str, null, str2);
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8db106", new Object[]{str});
        } else {
            l(str, null);
        }
    }

    public static void k(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f9ac35", new Object[]{str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        String j = oen.j();
        hashMap.put("rainbow", j);
        hashMap.put("encode_rainbow", g6p.d(j));
        if (map != null) {
            hashMap.putAll(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "", hashMap).build());
    }

    public static void l(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f73dbf", new Object[]{str, map});
        } else {
            k(c2v.getInstance().getCurrentPageName(), str, map);
        }
    }

    public static void m(String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da81e5c5", new Object[]{str, str2, new Integer(i), map});
            return;
        }
        HashMap hashMap = new HashMap();
        String j = oen.j();
        hashMap.put("rainbow", j);
        hashMap.put("encode_rainbow", g6p.d(j));
        if (map != null) {
            hashMap.putAll(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, "", "", hashMap).build());
    }

    @Deprecated
    public static void i(String str, String str2, ArrayMap<String, String> arrayMap, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc39f02", new Object[]{str, str2, arrayMap, str3});
            return;
        }
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put("spm", str3);
        }
        String j = oen.j();
        arrayMap.put("rainbow", j);
        arrayMap.put("encode_rainbow", g6p.d(j));
        StringBuilder sb = new StringBuilder();
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(arrayMap.keyAt(i));
            sb.append("=");
            sb.append(arrayMap.valueAt(i));
        }
        if (TextUtils.isEmpty(str)) {
            TBS.Adv.ctrlClicked(CT.Button, str2, sb.toString());
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, sb.toString());
        }
    }
}
