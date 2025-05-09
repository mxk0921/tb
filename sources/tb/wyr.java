package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714426);
    }

    public static boolean a(Map map, Map map2) {
        List<Pair<String, Object>> list;
        boolean z;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6172e7", new Object[]{map, map2})).booleanValue();
        }
        List<Pair<String, Object>> list2 = null;
        if (map != null) {
            list = d(map);
        } else {
            list = null;
        }
        if (map2 != null) {
            list2 = d(map2);
        }
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (map2 == null || map2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            z3 = false;
        }
        if (!(z3 || map == null || map2 == null)) {
            z3 = map.equals(map2);
        }
        if (list != null) {
            e(map, list);
        }
        if (list2 != null) {
            e(map2, list2);
        }
        return z3;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3cfc399", new Object[0]);
        }
        return akt.H2("ShortVideo.detailRequestIgnoreParams", "switchMode,dataSource,refreshMode,globalUtParams");
    }

    public static boolean c(String str) {
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17690c49", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getQueryParameter("extParams");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && str2.contains("default")) {
            z = true;
        }
        ir9.a("TBVideoListComponentUtils", "isDefaultGuangguangtab3WithUrl:" + z);
        return z;
    }

    public static List<Pair<String, Object>> d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec993e7e", new Object[]{map});
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String[] split = b.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            if (map.containsKey(str)) {
                arrayList.add(new Pair(str, map.remove(str)));
            }
        }
        return arrayList;
    }

    public static void e(Map map, List<Pair<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205c7783", new Object[]{map, list});
            return;
        }
        for (Pair<String, Object> pair : list) {
            map.put(pair.first, pair.second);
        }
    }
}
