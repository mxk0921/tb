package com.alibaba.ability.impl.uttracker;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.ut.mini.UTTracker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.c2v;
import tb.ckf;
import tb.cu;
import tb.jpu;
import tb.kdb;
import tb.o3v;
import tb.oeh;
import tb.p3v;
import tb.t2o;
import tb.t4e;
import tb.vq;
import tb.yz3;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UTTrackerAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET_PAGE_NAME = "getPageName";
    public static final String API_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unsubscribe";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public vq f2062a;
    public o3v c;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Map<String, Map<String, List<String>>> d = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(141557764);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public d(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Set<Map.Entry<String, Object>> entrySet;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List list = this.b;
            ArrayList<Map> arrayList = new ArrayList(zz3.q(list, 10));
            Iterator it = list.iterator();
            while (true) {
                Map map = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof Map) {
                    map = next;
                }
                arrayList.add(map);
            }
            for (Map map2 : arrayList) {
                String w = MegaUtils.w(map2, "pageName", "");
                if (w == null) {
                    w = "";
                }
                Map<String, Object> r = MegaUtils.r(map2, "arg1AndKeys");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!(r == null || (entrySet = r.entrySet()) == null)) {
                    ArrayList arrayList2 = new ArrayList(zz3.q(entrySet, 10));
                    Iterator<T> it2 = entrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Object value = entry.getValue();
                        if (!(value instanceof List)) {
                            value = null;
                        }
                        List list2 = (List) value;
                        if (list2 == null) {
                            list2 = yz3.i();
                        }
                        arrayList2.add((List) linkedHashMap.put(entry.getKey(), list2));
                    }
                }
                if (!ckf.b(w, "")) {
                    UTTrackerAbility.access$getMUtTrackMap$p(UTTrackerAbility.this).put(w, linkedHashMap);
                }
            }
            p3v.getInstance().registerListener(UTTrackerAbility.access$getMUtListener$p(UTTrackerAbility.this));
        }
    }

    static {
        t2o.a(141557763);
    }

    public static final /* synthetic */ void access$getCurrentPageName(UTTrackerAbility uTTrackerAbility, int i, vq vqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874e1eaa", new Object[]{uTTrackerAbility, new Integer(i), vqVar, new Long(j)});
        } else {
            uTTrackerAbility.b(i, vqVar, j);
        }
    }

    public static final /* synthetic */ vq access$getMCallback$p(UTTrackerAbility uTTrackerAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq) ipChange.ipc$dispatch("f6caf7b8", new Object[]{uTTrackerAbility});
        }
        return uTTrackerAbility.f2062a;
    }

    public static final /* synthetic */ o3v access$getMUtListener$p(UTTrackerAbility uTTrackerAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o3v) ipChange.ipc$dispatch("eaa228c3", new Object[]{uTTrackerAbility});
        }
        return uTTrackerAbility.c;
    }

    public static final /* synthetic */ Map access$getMUtTrackMap$p(UTTrackerAbility uTTrackerAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c65122c", new Object[]{uTTrackerAbility});
        }
        return uTTrackerAbility.d;
    }

    public static final /* synthetic */ void access$setMCallback$p(UTTrackerAbility uTTrackerAbility, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a881f2", new Object[]{uTTrackerAbility, vqVar});
        } else {
            uTTrackerAbility.f2062a = vqVar;
        }
    }

    public static final /* synthetic */ void access$setMUtListener$p(UTTrackerAbility uTTrackerAbility, o3v o3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e4f821", new Object[]{uTTrackerAbility, o3vVar});
        } else {
            uTTrackerAbility.c = o3vVar;
        }
    }

    public static /* synthetic */ Object ipc$super(UTTrackerAbility uTTrackerAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/uttracker/UTTrackerAbility");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        p3v.getInstance().unregisterListener(this.c);
        this.c = null;
        this.f2062a = null;
        ((LinkedHashMap) this.d).clear();
    }

    public final void b(int i, vq vqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae909581", new Object[]{this, new Integer(i), vqVar, new Long(j)});
        } else if (i >= 20) {
            vqVar.b(new ErrorResult("1003", "The utTracker.getPageName is timeout, please try again.", (Map) null, 4, (a07) null));
        } else {
            MegaUtils.z(new c(i, vqVar), j);
        }
    }

    public final void c(vq vqVar, List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3f2086", new Object[]{this, vqVar, list});
        } else if (this.b.compareAndSet(false, true)) {
            this.f2062a = vqVar;
            this.c = new o3v(new b(this));
            MegaUtils.C(new d(list));
        } else {
            vqVar.b(new ErrorResult("1002", "A tracker already exists", (Map) null, 4, (a07) null));
        }
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            if (this.b.compareAndSet(true, false)) {
                a();
            }
        } catch (Throwable unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements t4e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<UTTrackerAbility> f2063a;

        static {
            t2o.a(141557765);
            t2o.a(141557762);
        }

        public b(UTTrackerAbility uTTrackerAbility) {
            ckf.g(uTTrackerAbility, MUSMonitor.MODULE_DIM_ABILITY);
            this.f2063a = new WeakReference<>(uTTrackerAbility);
        }

        public static final /* synthetic */ WeakReference c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("847d6728", new Object[]{bVar});
            }
            return bVar.f2063a;
        }

        @Override // tb.t4e
        public void a(UTTracker uTTracker, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            }
        }

        @Override // tb.t4e
        public void b(UTTracker uTTracker, Map<String, String> map) {
            String str;
            Map access$getMUtTrackMap$p;
            Map map2;
            Set keySet;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
                return;
            }
            String str3 = "";
            if (map == null || (str = map.get(oeh.ARG1)) == null) {
                str = str3;
            }
            if (!(map == null || (str2 = map.get("PAGE")) == null)) {
                str3 = str2;
            }
            UTTrackerAbility uTTrackerAbility = this.f2063a.get();
            if (uTTrackerAbility != null && (access$getMUtTrackMap$p = UTTrackerAbility.access$getMUtTrackMap$p(uTTrackerAbility)) != null && (map2 = (Map) access$getMUtTrackMap$p.get(str3)) != null && (keySet = map2.keySet()) != null && keySet.contains(str)) {
                MegaUtils.C(new a(map, str, str3));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Map b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.uttracker.UTTrackerAbility$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class RunnableC0054a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ JSONObject b;

                public RunnableC0054a(JSONObject jSONObject) {
                    this.b = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    vq access$getMCallback$p;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UTTrackerAbility uTTrackerAbility = (UTTrackerAbility) b.c(b.this).get();
                    if (uTTrackerAbility != null && (access$getMCallback$p = UTTrackerAbility.access$getMCallback$p(uTTrackerAbility)) != null) {
                        access$getMCallback$p.d(new ExecutingResult(this.b, "onUTTrigger"));
                    }
                }
            }

            public a(Map map, String str, String str2) {
                this.b = map;
                this.c = str;
                this.d = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                String str3;
                Map access$getMUtTrackMap$p;
                Map map;
                List<String> list;
                String str4;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Map map2 = this.b;
                if (map2 == null || (str = (String) map2.get(oeh.ARG2)) == null) {
                    str = "";
                }
                Map map3 = this.b;
                if (map3 == null || (str2 = (String) map3.get(oeh.ARG3)) == null) {
                    str2 = "";
                }
                Map map4 = this.b;
                if (map4 == null || (str3 = (String) map4.get(oeh.EVENTID)) == null) {
                    str3 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(oeh.ARG1, this.c);
                linkedHashMap.put(oeh.ARG2, str);
                linkedHashMap.put(oeh.ARG3, str2);
                linkedHashMap.put(oeh.EVENTID, str3);
                linkedHashMap.put("PAGE", this.d);
                UTTrackerAbility uTTrackerAbility = (UTTrackerAbility) b.c(b.this).get();
                if (!(uTTrackerAbility == null || (access$getMUtTrackMap$p = UTTrackerAbility.access$getMUtTrackMap$p(uTTrackerAbility)) == null || (map = (Map) access$getMUtTrackMap$p.get(this.d)) == null || (list = (List) map.get(this.c)) == null)) {
                    for (String str5 : list) {
                        Map map5 = this.b;
                        if (map5 == null || (str4 = (String) map5.get(str5)) == null) {
                            str4 = "";
                        }
                        linkedHashMap.put(str5, str4);
                    }
                }
                MegaUtils.A(new RunnableC0054a(new JSONObject(kotlin.collections.a.k(jpu.a("pageName", this.d), jpu.a("utData", new JSONObject(linkedHashMap))))), 0L, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ vq c;

        public c(int i, vq vqVar) {
            this.b = i;
            this.c = vqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c2v instance = c2v.getInstance();
            ckf.f(instance, "UTPageHitHelper.getInstance()");
            String currentPageName = instance.getCurrentPageName();
            if (currentPageName == null) {
                UTTrackerAbility.access$getCurrentPageName(UTTrackerAbility.this, this.b + 1, this.c, 50L);
            } else {
                this.c.c(new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("pageName", currentPageName))), null, 2, null));
            }
        }
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        int hashCode = str.hashCode();
        if (hashCode != -1357795536) {
            if (hashCode != 514841930) {
                if (hashCode == 583281361 && str.equals("unsubscribe")) {
                    if (!this.b.compareAndSet(true, false)) {
                        return new ErrorResult("1001", "Please invoke ut.track first", (Map) null, 4, (a07) null);
                    }
                    a();
                    return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("success", Boolean.TRUE))), null, 2, null);
                }
            } else if (str.equals("subscribe")) {
                List<? extends Object> n = MegaUtils.n(map, "utTrackers");
                if (n == null || n.isEmpty()) {
                    vqVar.b(ErrorResult.a.Companion.g("The param utTrackers is error, please check it."));
                } else {
                    c(vqVar, n);
                }
                return null;
            }
        } else if (str.equals(API_GET_PAGE_NAME)) {
            b(0, vqVar, -1L);
            return null;
        }
        return ErrorResult.a.Companion.a("Api not found");
    }
}
