package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class al {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, bl>> f15798a = new ConcurrentHashMap();
    public static final Map<String, bl.a> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f15799a;
        public final /* synthetic */ Event b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public a(nbb nbbVar, Event event, String str, String str2, long j) {
            this.f15799a = nbbVar;
            this.b = event;
            this.c = str;
            this.d = str2;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            al.a(this.f15799a, this.b);
            ck.g().e("AURAPageEventManager", "触发事件成功");
            al.b(this.c, this.d);
            if (this.e > 0 && !TextUtils.isEmpty(this.d)) {
                al.c(this.d);
            }
        }
    }

    static {
        t2o.a(81789246);
    }

    public static /* synthetic */ void a(nbb nbbVar, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5542532d", new Object[]{nbbVar, event});
        } else {
            l(nbbVar, event);
        }
    }

    public static /* synthetic */ void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79467bcc", new Object[]{str, str2});
        } else {
            k(str, str2);
        }
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415b7b83", new Object[]{str});
        } else {
            j(str);
        }
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("306871d8", new Object[]{str})).intValue();
        }
        return m9v.d("AURAPageEventManager").j(str);
    }

    public static JSONObject e(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3630aa9b", new Object[]{event});
        }
        JSONObject fields = event.getFields();
        if (fields == null) {
            return null;
        }
        return fields.getJSONObject("eventStrategy");
    }

    public static int f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e6c74a0", new Object[]{str, str2})).intValue();
        }
        Integer num = (Integer) ((HashMap) g(str).f16458a).get(str2);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static bl.a g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl.a) ipChange.ipc$dispatch("49280883", new Object[]{str});
        }
        Map<String, bl.a> map = b;
        bl.a aVar = (bl.a) ((ConcurrentHashMap) map).get(str);
        if (aVar != null) {
            return aVar;
        }
        bl.a aVar2 = new bl.a();
        ((ConcurrentHashMap) map).put(str, aVar2);
        return aVar2;
    }

    public static bl h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl) ipChange.ipc$dispatch("f922c19a", new Object[]{str, str2});
        }
        Map map = (Map) ((ConcurrentHashMap) f15798a).get(str);
        if (map == null) {
            return null;
        }
        return (bl) map.get(str2);
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00a679", new Object[]{str});
        } else {
            m9v.d("AURAPageEventManager").q(str, d(str) + 1);
        }
    }

    public static void k(String str, String str2) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d510141", new Object[]{str, str2});
            return;
        }
        bl.a g = g(str);
        Integer num = (Integer) ((HashMap) g.f16458a).get(str2);
        Map<String, Integer> map = g.f16458a;
        if (num != null) {
            i = 1 + num.intValue();
        }
        ((HashMap) map).put(str2, Integer.valueOf(i));
    }

    public static void l(nbb nbbVar, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05a12fc", new Object[]{nbbVar, event});
            return;
        }
        String type = event.getType();
        JSONObject fields = event.getFields();
        if (!TextUtils.isEmpty(type)) {
            qi qiVar = new qi();
            qiVar.n(fields);
            nbbVar.c("aura.workflow.event", new AURAEventIO(type, qiVar), null);
        }
    }

    public static void m(String str, Map<String, List<Event>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487583ec", new Object[]{str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            bl blVar = new bl();
            blVar.c(str2);
            blVar.b(map.get(str2));
            rbb g = ck.g();
            g.d("AURAPageEventManager cachePageEvent " + str);
            hashMap.put(str2, blVar);
        }
        ((ConcurrentHashMap) f15798a).put(str, hashMap);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, new bl.a());
        }
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c49dc0", new Object[]{str});
            return;
        }
        ((ConcurrentHashMap) f15798a).remove(str);
        ((ConcurrentHashMap) b).remove(str);
    }

    public static boolean i(int i, long j, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af57a8f0", new Object[]{new Integer(i), new Long(j), str, new Long(j2)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            int d = d(str);
            rbb g = ck.g();
            g.e("AURAPageEventManager", "本地执行成功次数：" + d);
            if (j > 0 && d >= j) {
                rbb g2 = ck.g();
                g2.e("AURAPageEventManager", "本地已经超过执行次数：" + d);
                return false;
            }
        }
        if (j2 <= 0 || i < j2) {
            return true;
        }
        rbb g3 = ck.g();
        g3.e("AURAPageEventManager", "已经超过执行次数：" + j2);
        return false;
    }

    public static boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69b5d7e1", new Object[]{str, str2})).booleanValue();
        }
        nbb d = qj.h().d(str);
        if (d == null) {
            rbb g = ck.g();
            g.e("AURAPageEventManager", "没有找到 instance triggerName：" + str2);
            return false;
        }
        bl h = h(str, str2);
        if (h == null) {
            rbb g2 = ck.g();
            g2.e("AURAPageEventManager", "没有找到 triggerName：" + str2);
            return false;
        }
        List<Event> a2 = h.a();
        if (a2 == null) {
            rbb g3 = ck.g();
            g3.e("AURAPageEventManager", "没有找到 eventList triggerName：" + str2);
            return false;
        }
        boolean z = false;
        for (Event event : a2) {
            JSONObject e = e(event);
            if (e == null) {
                l(d, event);
            } else {
                long d2 = pn.d((String) fk.b(e, AURAPageEventStrategy.STORAGE_NUM, String.class, null), -1L);
                String str3 = (String) fk.b(e, "identifier", String.class, null);
                long d3 = pn.d((String) fk.b(e, AURAPageEventStrategy.FREQUENCY, String.class, null), -1L);
                long d4 = pn.d((String) fk.b(e, "delay", String.class, null), 0L);
                if (i(f(str, str3), d2, str3, d3)) {
                    dn.b().postDelayed(new a(d, event, str, str3, d2), d4);
                    z = (xk.a("enableOnBackIntercept", true) && e.getBooleanValue(AURAPageEventStrategy.INTERCEPT) && !TextUtils.isEmpty(str3) && !(d2 == -1 && d3 == -1)) || z;
                }
            }
        }
        return z;
    }
}
