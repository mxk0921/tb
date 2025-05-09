package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Context, Map<String, String>> f30055a = new WeakHashMap();

    static {
        t2o.a(815793526);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4c1873", new Object[]{context});
        } else {
            ((WeakHashMap) f30055a).remove(context);
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f181f59a", new Object[]{context, str});
        }
        Map map = (Map) ((WeakHashMap) f30055a).get(context);
        if (map == null) {
            return "";
        }
        return (String) map.get(str);
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c33e74", new Object[]{context, str});
            return;
        }
        Map map = (Map) ((WeakHashMap) f30055a).get(context);
        if (map != null) {
            map.remove(str);
        }
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa7491c", new Object[]{context, str, str2});
            return;
        }
        Map<Context, Map<String, String>> map = f30055a;
        Map map2 = (Map) ((WeakHashMap) map).get(context);
        if (map2 == null) {
            map2 = new HashMap();
            ((WeakHashMap) map).put(context, map2);
        }
        map2.put(str, str2);
    }
}
