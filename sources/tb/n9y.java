package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class n9y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f24599a;
    public static final String[] b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                str3 = "&";
            }
            sb.append(str3);
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> b(Context context, Map<String, String> map) {
        synchronized (n9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f5f4589a", new Object[]{context, map});
            }
            if (f24599a == null) {
                e(context, map);
            }
            ((TreeMap) f24599a).putAll(b9y.b(context));
            a(f24599a);
            return f24599a;
        }
    }

    public static synchronized void c() {
        synchronized (n9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                f24599a = null;
            }
        }
    }

    public static synchronized String d(Context context, Map<String, String> map) {
        synchronized (n9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7df647ba", new Object[]{context, map});
            }
            b(context, map);
            TreeMap treeMap = new TreeMap();
            String[] strArr = b;
            for (int i = 0; i < 44; i++) {
                String str = strArr[i];
                if (((TreeMap) f24599a).containsKey(str)) {
                    treeMap.put(str, ((TreeMap) f24599a).get(str));
                }
            }
            return avx.a(a(treeMap));
        }
    }

    public static synchronized void e(Context context, Map<String, String> map) {
        synchronized (n9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
                return;
            }
            TreeMap treeMap = new TreeMap();
            f24599a = treeMap;
            treeMap.putAll(y7y.a(context, map));
            ((TreeMap) f24599a).putAll(b9y.a());
            ((TreeMap) f24599a).putAll(q8y.a(context));
            ((TreeMap) f24599a).putAll(o6y.a(context, map));
        }
    }
}
