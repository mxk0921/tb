package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PerformanceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, String> f6971a = new ConcurrentHashMap(0);
    public static final List<String> b = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.utils.PerformanceUtils.1
        {
            add("preRenderHeaderEnd");
            add("renderHeaderEnd");
            add("refreshLayout");
            add("refreshLayoutEnd");
            add("preRenderHeader");
            add("renderHeader");
            add("response");
        }
    };
    public static final Map<String, Map<String, Long>> c = new ConcurrentHashMap(0);
    public static final Map<String, Map<String, Long>> d = new ConcurrentHashMap(0);
    public static final Map<String, Map<String, Long>> e = new ConcurrentHashMap(0);

    static {
        t2o.a(912262827);
    }

    public static void a(String str, String str2, long j) {
        long j2;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab9b418", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) d).get(str);
        if (map != null) {
            Long l2 = (Long) map.get(str2);
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            Map map2 = (Map) ((ConcurrentHashMap) c).get(str);
            if (!(map2 == null || (l = (Long) map2.get(str2)) == null)) {
                j2 += j - l.longValue();
            }
            map.put(str2, Long.valueOf(j2));
        }
        p(str, str2, j);
    }

    public static void b(ze7 ze7Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0904fe", new Object[]{ze7Var, str, new Long(j)});
        } else {
            a(ze7Var.i().b(), str, j);
        }
    }

    public static void c(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ebe474", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) e).get(str);
        if (map != null) {
            Long l = (Long) map.get(str2);
            if (l != null) {
                j += l.longValue();
            }
            map.put(str2, Long.valueOf(j));
        }
    }

    public static void d(ze7 ze7Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddaa95a", new Object[]{ze7Var, str, new Long(j)});
            return;
        }
        String b2 = ze7Var.i().b();
        if (b2 != null) {
            c(b2, str, j);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a07a41e", new Object[]{str});
            return;
        }
        Map<String, Map<String, Long>> map = c;
        if (((Map) ((ConcurrentHashMap) map).get(str)) == null) {
            ((ConcurrentHashMap) map).put(str, Collections.synchronizedMap(new LinkedHashMap()));
        }
        Map<String, Map<String, Long>> map2 = d;
        if (((Map) ((ConcurrentHashMap) map2).get(str)) == null) {
            ((ConcurrentHashMap) map2).put(str, Collections.synchronizedMap(new LinkedHashMap()));
        }
        Map<String, Map<String, Long>> map3 = e;
        if (((Map) ((ConcurrentHashMap) map3).get(str)) == null) {
            ((ConcurrentHashMap) map3).put(str, Collections.synchronizedMap(new LinkedHashMap()));
        }
    }

    public static void f(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193c74f8", new Object[]{ze7Var});
            return;
        }
        int hashCode = ze7Var.c().hashCode();
        String b2 = ze7Var.i().b();
        ((ConcurrentHashMap) f6971a).put(Integer.valueOf(hashCode), b2);
        e(b2);
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2204059c", new Object[]{str});
            return;
        }
        ((ConcurrentHashMap) c).remove(str);
        ((ConcurrentHashMap) d).remove(str);
        ((ConcurrentHashMap) e).remove(str);
    }

    public static void h(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c590076", new Object[]{ze7Var});
            return;
        }
        ((ConcurrentHashMap) f6971a).remove(Integer.valueOf(ze7Var.c().hashCode()));
        g(ze7Var.i().b());
    }

    public static Map<String, Long> i(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b9fcd641", new Object[]{ze7Var});
        }
        return (Map) ((ConcurrentHashMap) d).get(ze7Var.i().b());
    }

    public static Map<String, Long> j(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5e8373b", new Object[]{ze7Var});
        }
        return (Map) ((ConcurrentHashMap) e).get(ze7Var.i().b());
    }

    public static Map<String, Long> k(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("13feab87", new Object[]{ze7Var});
        }
        return (Map) ((ConcurrentHashMap) c).get(ze7Var.i().b());
    }

    public static void l(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e369ad9", new Object[]{context, str, new Long(j)});
            return;
        }
        String str2 = (String) ((ConcurrentHashMap) f6971a).get(Integer.valueOf(context.hashCode()));
        if (str2 != null) {
            m(str2, str, j);
        }
    }

    public static void m(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cd14a9", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) e).get(str);
        if (map == null) {
            return;
        }
        if (!((ArrayList) b).contains(str2) || !map.containsKey(str2)) {
            map.put(str2, Long.valueOf(j));
        }
    }

    public static void n(ze7 ze7Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f4c08f", new Object[]{ze7Var, str, new Long(j)});
            return;
        }
        String b2 = ze7Var.i().b();
        if (b2 != null) {
            m(b2, str, j);
        }
    }

    public static void o(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c919d0d", new Object[]{context, str, new Long(j)});
            return;
        }
        String str2 = (String) ((ConcurrentHashMap) f6971a).get(Integer.valueOf(context.hashCode()));
        if (str2 != null) {
            p(str2, str, j);
        }
    }

    public static void p(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d164f5", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) c).get(str);
        if (map == null) {
            return;
        }
        if (!((ArrayList) b).contains(str2) || !map.containsKey(str2)) {
            map.put(str2, Long.valueOf(j));
        }
    }

    public static void q(ze7 ze7Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f5d4db", new Object[]{ze7Var, str, new Long(j)});
            return;
        }
        String b2 = ze7Var.i().b();
        if (b2 != null) {
            p(b2, str, j);
        }
    }
}
