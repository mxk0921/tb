package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ScheduleTaskStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oa8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c2c> f25248a = new HashMap();
    public final Map<String, List<ScheduleTaskStrategy>> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25249a;

        public a(String str) {
            this.f25249a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oa8.a(oa8.this, this.f25249a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c2c f25250a;

        public b(c2c c2cVar) {
            this.f25250a = c2cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oa8.b(oa8.this, this.f25250a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25251a;

        public c(String str) {
            this.f25251a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oa8.c(oa8.this, this.f25251a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25252a;
        public final /* synthetic */ Map b;

        public d(String str, Map map) {
            this.f25252a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oa8.d(oa8.this, this.f25252a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Comparator<g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(oa8 oa8Var) {
        }

        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d2975b", new Object[]{this, gVar, gVar2})).intValue();
            }
            return Integer.compare(gVar2.f25254a, gVar.f25254a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f25254a;
        public c2c b;

        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(oa8 oa8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d78efd2", new Object[]{oa8Var, str});
        } else {
            oa8Var.h(str);
        }
    }

    public static /* synthetic */ void b(oa8 oa8Var, c2c c2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7633148b", new Object[]{oa8Var, c2cVar});
        } else {
            oa8Var.f(c2cVar);
        }
    }

    public static /* synthetic */ void c(oa8 oa8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb90bdd4", new Object[]{oa8Var, str});
        } else {
            oa8Var.j(str);
        }
    }

    public static /* synthetic */ void d(oa8 oa8Var, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab65210", new Object[]{oa8Var, str, map});
        } else {
            oa8Var.m(str, map);
        }
    }

    public void e(c2c c2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3d5d8f", new Object[]{this, c2cVar});
        } else {
            ja8.a(new b(c2cVar));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            h(pxn.d().g());
        }
    }

    public final void h(String str) {
        JSONArray parseArray;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c417de67", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (parseArray = JSON.parseArray(str)) != null && !parseArray.isEmpty()) {
            ((HashMap) this.b).clear();
            for (int i = 0; i < parseArray.size(); i++) {
                ScheduleTaskStrategy scheduleTaskStrategy = (ScheduleTaskStrategy) parseArray.getObject(i, ScheduleTaskStrategy.class);
                if (!(scheduleTaskStrategy == null || (list = scheduleTaskStrategy.matchTriggers) == null || list.isEmpty())) {
                    for (String str2 : scheduleTaskStrategy.matchTriggers) {
                        List list2 = (List) ((HashMap) this.b).get(str2);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            ((HashMap) this.b).put(str2, list2);
                        }
                        list2.add(scheduleTaskStrategy);
                    }
                }
            }
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b785fa", new Object[]{this, str});
        } else {
            ja8.a(new c(str));
        }
    }

    public final void k(c2c c2cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bc123b", new Object[]{this, c2cVar, str});
        } else {
            ja8.c(new f(str, c2cVar));
        }
    }

    public void l(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c56f97", new Object[]{this, str, map});
        } else {
            ja8.a(new d(str, map));
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40474ed", new Object[]{this, str});
        } else {
            ja8.a(new a(str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25253a;
        public final /* synthetic */ c2c b;

        public f(String str, c2c c2cVar) {
            this.f25253a = str;
            this.b = c2cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ha8 ha8Var = new ha8();
            long currentTimeMillis = System.currentTimeMillis();
            this.b.b(ha8Var, Collections.EMPTY_MAP);
            la8.c("elastic.ScheduleHandler", "[runInternal].", "task", this.b.a(), "type", this.b.type(), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final void f(c2c c2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d867ac", new Object[]{this, c2cVar});
            return;
        }
        String a2 = c2cVar.a();
        if (TextUtils.isEmpty(a2)) {
            la8.c("elastic.ScheduleHandler", "[addScheduleTask] taskId is null.", new Object[0]);
            return;
        }
        la8.c("elastic.ScheduleHandler", "[addScheduleTask] add task to elastic dispatcher.", "task", a2, "type", c2cVar.type());
        ((HashMap) this.f25248a).put(a2, c2cVar);
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9e0417", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            la8.c("elastic.ScheduleHandler", "[removeScheduleTask] taskId is null.", new Object[0]);
        } else {
            la8.c("elastic.ScheduleHandler", "[removeScheduleTask] remove task from elastic dispatcher.", "task", str);
            ((HashMap) this.f25248a).remove(str);
        }
    }

    public final void m(String str, Map<String, Object> map) {
        c2c c2cVar;
        c2c c2cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67cd47da", new Object[]{this, str, map});
            return;
        }
        la8.c("elastic.ScheduleHandler", "[triggerTask] trigger task.", "triggerType", str);
        List<ScheduleTaskStrategy> list = (List) ((HashMap) this.b).get(str);
        if (list == null || list.isEmpty()) {
            la8.c("elastic.ScheduleHandler", "[triggerTask] task strategies is null or empty.", "triggerType", str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ScheduleTaskStrategy scheduleTaskStrategy : list) {
            if (scheduleTaskStrategy != null) {
                if (scheduleTaskStrategy.once) {
                    c2cVar2 = (c2c) ((HashMap) this.f25248a).remove(scheduleTaskStrategy.taskId);
                } else {
                    c2cVar2 = (c2c) ((HashMap) this.f25248a).get(scheduleTaskStrategy.taskId);
                }
                if (c2cVar2 != null) {
                    g gVar = new g(null);
                    gVar.f25254a = c2cVar2.priority();
                    gVar.b = c2cVar2;
                    arrayList.add(gVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            la8.c("elastic.ScheduleHandler", "[triggerTask] runnable tasks is empty.", "triggerType", str);
            return;
        }
        Collections.sort(arrayList, new e(this));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar2 = (g) it.next();
            if (!(gVar2 == null || (c2cVar = gVar2.b) == null)) {
                k(c2cVar, str);
            }
        }
        arrayList.clear();
    }
}
