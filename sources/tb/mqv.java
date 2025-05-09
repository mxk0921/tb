package tb;

import android.app.Activity;
import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.userbehavior.module.BasicUBF;
import com.ut.userbehavior.module.BehaviorRecord;
import com.ut.userbehavior.module.EventChain;
import com.ut.userbehavior.module.Page;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mqv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEPARATOR = "#";
    public static final long b;
    public static final long c;

    /* renamed from: a  reason: collision with root package name */
    public static volatile mqv f24240a = null;
    public static final Map<String, BasicUBF> d = new HashMap();
    public static final Map<String, Page> e = new HashMap();
    public static String f = null;
    public static String g = null;
    public static String h = null;

    static {
        t2o.a(964689926);
        b = 0L;
        c = 0L;
        wzu.registerAppStatusCallbacks(u81.a());
        k5v.h();
        b = System.currentTimeMillis();
        c = SystemClock.elapsedRealtime();
    }

    public static String b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62c6cbce", new Object[]{activity});
        }
        if (activity == null) {
            return "";
        }
        String simpleName = activity.getClass().getSimpleName();
        int hashCode = activity.hashCode();
        return simpleName + "@" + hashCode;
    }

    public static mqv n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqv) ipChange.ipc$dispatch("31a51805", new Object[0]);
        }
        if (f24240a == null) {
            synchronized (mqv.class) {
                try {
                    if (f24240a == null) {
                        f24240a = new mqv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24240a;
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d7b86", new Object[]{str});
        } else if (l5v.c(h) && !h.endsWith(str)) {
            h = null;
        }
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87e88e8a", new Object[]{this, str});
        }
        if (l5v.b("")) {
            return str;
        }
        if (l5v.b(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (l5v.c("")) {
            sb.append(".");
            sb.append(str);
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean f() {
        Map<String, BasicUBF> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777f70da", new Object[]{this})).booleanValue();
        }
        if (k5v.f() || (map = d) == null || ((HashMap) map).isEmpty()) {
            return true;
        }
        return false;
    }

    public synchronized void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96a58aa", new Object[]{this, str});
            return;
        }
        Map<String, BasicUBF> map = d;
        if (map != null && !((HashMap) map).isEmpty()) {
            if (l5v.c(f) && f.endsWith(str) && ((Page) ((HashMap) e).get(f)) != null) {
                String str2 = f;
                g = str2;
                h = str2;
                h(str2);
            }
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fad2fc8f", new Object[]{this});
        }
        return String.format(Locale.getDefault(), "%d%s%04d", Long.valueOf(System.currentTimeMillis()), "#", Integer.valueOf(new Random().nextInt(10000)));
    }

    public String l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f918a63d", new Object[]{this, activity});
        }
        String k = k();
        if (activity == null) {
            return k;
        }
        String b2 = b(activity);
        return k + "#" + b2;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b794ac87", new Object[]{this})).intValue();
        }
        return (int) (SystemClock.elapsedRealtime() - c);
    }

    public synchronized void q() {
        Page page;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c42c58", new Object[]{this});
        } else if (!f()) {
            if (l5v.c(h) && (page = (Page) ((HashMap) e).get(h)) != null) {
                page.addEventChain(new EventChain("system", "系统", "enter_bg", null));
            }
            for (BasicUBF basicUBF : ((HashMap) d).values()) {
                kap.a(basicUBF, "bg");
            }
        }
    }

    public synchronized void r() {
        Page page;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd5b6d", new Object[]{this});
        } else if (!f()) {
            if (l5v.c(h) && (page = (Page) ((HashMap) e).get(h)) != null) {
                page.addEventChain(new EventChain("system", "系统", "enter_fg", null));
                d(h, page.getName());
                h = null;
            }
        }
    }

    public synchronized void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3c5c79", new Object[]{this, str, str2, str3});
        } else if (!f()) {
            String a2 = a("beginComponent");
            if (!l5v.b(str) && !l5v.b(str2)) {
                Map<String, Page> map = e;
                if (!((HashMap) map).isEmpty() && ((HashMap) map).containsKey(str2)) {
                    Page page = (Page) ((HashMap) map).get(str2);
                    if (page != null) {
                        page.beginComponentInPage(str, str3);
                    }
                    return;
                }
                j5v.c(a2, "beginPage should be used before beginComponent, pageKey", str2);
                return;
            }
            j5v.c(a2, "key or pageKey can not be empty.");
        }
    }

    public synchronized void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5262327d", new Object[]{this, str, str2});
        } else if (!f()) {
            String a2 = a("endComponent");
            if (!l5v.b(str) && !l5v.b(str2)) {
                Map<String, Page> map = e;
                if (!((HashMap) map).isEmpty() && ((HashMap) map).containsKey(str2)) {
                    Page page = (Page) ((HashMap) map).get(str2);
                    if (page != null) {
                        page.endComponentInPage(str);
                    }
                    return;
                }
                j5v.c(a2, "beginPage should be used first,pageKey", str2);
                return;
            }
            j5v.c(a2, "key or pageKey can not be empty.");
        }
    }

    public synchronized void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5545311b", new Object[]{this, str});
        } else if (!f()) {
            String a2 = a("endPage");
            if (l5v.b(str)) {
                j5v.c(a2, "key can not be empty.");
                return;
            }
            Map<String, Page> map = e;
            if (!((HashMap) map).isEmpty() && ((HashMap) map).containsKey(str)) {
                if (l5v.b(f)) {
                    j5v.c(a2, "endPage repeat", str);
                    return;
                }
                Page page = (Page) ((HashMap) map).get(str);
                if (page != null) {
                    page.autoEndComponents();
                    page.addBehaviorChain(new BehaviorRecord(2));
                    f = null;
                    j5v.b(a2, "pageKey", str);
                }
                return;
            }
            j5v.c(a2, "Current page should be started first");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:10:0x001a, B:14:0x0022, B:16:0x002e, B:19:0x0039, B:21:0x0044, B:24:0x004e, B:25:0x006f, B:26:0x007a, B:28:0x0082), top: B:33:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void j(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            monitor-enter(r7)
            com.android.alibaba.ip.runtime.IpChange r3 = tb.mqv.$ipChange     // Catch: all -> 0x0017
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0017
            if (r4 == 0) goto L_0x001a
            java.lang.String r4 = "590d1caf"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0017
            r0[r2] = r7     // Catch: all -> 0x0017
            r0[r1] = r8     // Catch: all -> 0x0017
            r3.ipc$dispatch(r4, r0)     // Catch: all -> 0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r8 = move-exception
            goto L_0x0091
        L_0x001a:
            boolean r3 = tb.k5v.f()     // Catch: all -> 0x0017
            if (r3 == 0) goto L_0x0022
            monitor-exit(r7)
            return
        L_0x0022:
            java.lang.String r3 = "endUBF"
            java.lang.String r3 = r7.a(r3)     // Catch: all -> 0x0017
            boolean r4 = tb.l5v.b(r8)     // Catch: all -> 0x0017
            if (r4 == 0) goto L_0x0039
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch: all -> 0x0017
            java.lang.String r0 = "Key can not be empty."
            r8[r2] = r0     // Catch: all -> 0x0017
            tb.j5v.c(r3, r8)     // Catch: all -> 0x0017
            monitor-exit(r7)
            return
        L_0x0039:
            java.util.Map<java.lang.String, com.ut.userbehavior.module.BasicUBF> r4 = tb.mqv.d     // Catch: all -> 0x0017
            r5 = r4
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: all -> 0x0017
            boolean r5 = r5.isEmpty()     // Catch: all -> 0x0017
            if (r5 != 0) goto L_0x006f
            r5 = r4
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: all -> 0x0017
            boolean r5 = r5.containsKey(r8)     // Catch: all -> 0x0017
            if (r5 != 0) goto L_0x004e
            goto L_0x006f
        L_0x004e:
            r5 = r4
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: all -> 0x0017
            java.lang.Object r5 = r5.get(r8)     // Catch: all -> 0x0017
            com.ut.userbehavior.module.BasicUBF r5 = (com.ut.userbehavior.module.BasicUBF) r5     // Catch: all -> 0x0017
            java.lang.String r6 = "end"
            tb.kap.a(r5, r6)     // Catch: all -> 0x0017
            r5 = r4
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: all -> 0x0017
            r5.remove(r8)     // Catch: all -> 0x0017
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0017
            java.lang.String r5 = "key"
            r0[r2] = r5     // Catch: all -> 0x0017
            r0[r1] = r8     // Catch: all -> 0x0017
            tb.j5v.b(r3, r0)     // Catch: all -> 0x0017
            goto L_0x007a
        L_0x006f:
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0017
            java.lang.String r5 = "Current UBF should be started first"
            r0[r2] = r5     // Catch: all -> 0x0017
            r0[r1] = r8     // Catch: all -> 0x0017
            tb.j5v.c(r3, r0)     // Catch: all -> 0x0017
        L_0x007a:
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: all -> 0x0017
            boolean r8 = r4.isEmpty()     // Catch: all -> 0x0017
            if (r8 == 0) goto L_0x008f
            java.util.Map<java.lang.String, com.ut.userbehavior.module.Page> r8 = tb.mqv.e     // Catch: all -> 0x0017
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch: all -> 0x0017
            r8.clear()     // Catch: all -> 0x0017
            tb.lqv.f()     // Catch: all -> 0x0017
            r8 = 0
            tb.mqv.f = r8     // Catch: all -> 0x0017
        L_0x008f:
            monitor-exit(r7)
            return
        L_0x0091:
            monitor-exit(r7)     // Catch: all -> 0x0017
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mqv.j(java.lang.String):void");
    }

    public synchronized void s(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4046ff56", new Object[]{this, str, str2, map});
        } else if (!f()) {
            String a2 = a("updateComponent");
            if (!l5v.b(str) && !l5v.b(str2) && map != null && !map.isEmpty()) {
                Map<String, Page> map2 = e;
                if (!((HashMap) map2).isEmpty() && ((HashMap) map2).containsKey(str2)) {
                    Page page = (Page) ((HashMap) map2).get(str2);
                    if (page != null) {
                        page.updateComponentInPage(str, map);
                    }
                    return;
                }
                j5v.c(a2, "beginPage should be used first,pageKey", str2);
                return;
            }
            j5v.c(a2, "key/pageKey/info can not be empty.");
        }
    }

    public synchronized void d(String str, String str2) {
        Page page;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33fd5cf3", new Object[]{this, str, str2});
        } else if (!f()) {
            String a2 = a("beginPage");
            if (!l5v.b(str) && !l5v.b(str2)) {
                if (l5v.c(f)) {
                    if (f.equalsIgnoreCase(str)) {
                        j5v.b(a2, "beginPage repeat", str);
                        return;
                    }
                    j5v.b(a2, "add endPage for last page", f);
                    g = str;
                    h(f);
                }
                Map<String, Page> map = e;
                if (((HashMap) map).containsKey(str)) {
                    page = (Page) ((HashMap) map).get(str);
                    if (page != null) {
                        page.setName(str2);
                        page.addBehaviorChain(new BehaviorRecord(1));
                        page.autoBeginComponents();
                        if (str.equalsIgnoreCase(g)) {
                            g = null;
                        }
                    }
                } else {
                    Page page2 = new Page(str, str2);
                    page2.addBehaviorChain(new BehaviorRecord(1));
                    ((HashMap) map).put(str, page2);
                    page = page2;
                }
                Map<String, BasicUBF> map2 = d;
                if (map2 != null && !((HashMap) map2).isEmpty()) {
                    for (BasicUBF basicUBF : ((HashMap) map2).values()) {
                        basicUBF.addPage(page);
                    }
                }
                f = str;
                j5v.b(a2, "pageCacheKey", str, "name", str2);
                return;
            }
            j5v.c(a2, "key or name can not be empty.");
        }
    }

    public synchronized void t(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7084dc", new Object[]{this, str, map});
        } else if (!f()) {
            String a2 = a("updatePage");
            if (!l5v.b(str) && map != null && !map.isEmpty()) {
                Map<String, Page> map2 = e;
                if (!((HashMap) map2).isEmpty() && ((HashMap) map2).containsKey(str)) {
                    Page page = (Page) ((HashMap) map2).get(str);
                    if (page != null) {
                        page.setInfo(map);
                        j5v.b(a2, "pageKey", str, "info", JSON.toJSONString(map));
                    }
                    return;
                }
                j5v.c(a2, "Current page should be started first");
                return;
            }
            j5v.c(a2, "key or info can not be empty.");
        }
    }

    public synchronized void u(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dceb94e4", new Object[]{this, str, map});
        } else if (!k5v.f()) {
            String a2 = a("updateUBF");
            if (!l5v.b(str) && map != null && !map.isEmpty()) {
                Map<String, BasicUBF> map2 = d;
                if (map2 != null && !((HashMap) map2).isEmpty() && ((HashMap) map2).containsKey(str)) {
                    BasicUBF basicUBF = (BasicUBF) ((HashMap) map2).get(str);
                    if (basicUBF != null) {
                        basicUBF.setInfo(map);
                        j5v.b(a2, "key", str, "info", JSON.toJSONString(map));
                    }
                    return;
                }
                j5v.c(a2, "Current UBF should be started first", str);
                return;
            }
            j5v.c(a2, "Key or info can not be empty.");
        }
    }

    public synchronized void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5086942b", new Object[]{this, str, str2});
        } else if (!k5v.f()) {
            String a2 = a("beginUBF");
            if (!l5v.b(str) && !l5v.b(str2)) {
                Map<String, BasicUBF> map = d;
                if (((HashMap) map).containsKey(str)) {
                    j5v.c(a2, "beginUBF repeat.UBFKey", str, "name", str2);
                } else {
                    BasicUBF basicUBF = new BasicUBF(str, str2);
                    basicUBF.setBeginTimeStamp(b);
                    basicUBF.setBeginTime(m());
                    ((HashMap) map).put(str, basicUBF);
                    j5v.b(a2, "key", str, "name", str2);
                }
                return;
            }
            j5v.c(a2, "pageObject/key/name can not be empty.");
        }
    }

    public synchronized void p(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58222c4", new Object[]{this, str, str2, str3, str4, map});
        } else if (!f()) {
            String a2 = a("sendEvent");
            if (!l5v.b(str) && !l5v.b(str2)) {
                Map<String, Page> map2 = e;
                if (!((HashMap) map2).isEmpty() && ((HashMap) map2).containsKey(str2)) {
                    Page page = (Page) ((HashMap) map2).get(str2);
                    if (page != null) {
                        page.sendEventInPage(str, str3, str4, map);
                        if (j5v.d()) {
                            j5v.b(a2, "key", str, "pageKey", str2, "name", str3, "type", str4, "info", JSON.toJSONString(map));
                        }
                    }
                    return;
                }
                j5v.c(a2, "beginPage should be used first,pageKey", str2);
                return;
            }
            j5v.c(a2, "key or pageKey can not be empty.");
        }
    }
}
