package com.taobao.android.tschedule.strategy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.a;
import com.taobao.android.tschedule.strategy.ABTest;
import com.taobao.android.tschedule.strategy.a;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ajf;
import tb.bb1;
import tb.bns;
import tb.c92;
import tb.cb1;
import tb.cns;
import tb.d92;
import tb.db1;
import tb.dms;
import tb.gjw;
import tb.ku6;
import tb.met;
import tb.q1r;
import tb.t2o;
import tb.vms;
import tb.wif;
import tb.yms;
import tb.zdh;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements wif, a.AbstractC0503a, a.AbstractC0502a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Float> f9712a;
    public final c92 b;
    public final AtomicBoolean c;
    public final boolean d;
    public final AtomicBoolean e;
    public int f;
    public float g;
    public Pair<Boolean, String> h;
    public final com.taobao.android.tschedule.strategy.a i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ db1 f9713a;
        public final /* synthetic */ db1 b;

        public a(db1 db1Var, db1 db1Var2) {
            this.f9713a = db1Var;
            this.b = db1Var2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            zdh.a("ScheduleStrategy", "onHistoryChanged, previous=" + this.f9713a.f17702a + ", current=" + this.b.f17702a);
            RenderScheduleProtocol e = vms.c().e(this.f9713a.b);
            if (e != null) {
                e.clearPreloadedInstances();
            }
            yms.m(this.f9713a.f17702a);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tschedule.strategy.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class C0504b {
        public static final b instance = new b(null);

        static {
            t2o.a(329252970);
        }
    }

    static {
        t2o.a(329252968);
        t2o.a(329252961);
        t2o.a(329252870);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.taobao.android.tschedule.strategy.a.AbstractC0503a
    public void a(db1 db1Var, db1 db1Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae762df4", new Object[]{this, db1Var, db1Var2});
        } else {
            bns.a().f(new a(db1Var, db1Var2));
        }
    }

    @Override // tb.wif
    public int c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf6f902e", new Object[]{this, str, map})).intValue();
        }
        Pair<Boolean, String> i = i(str, map);
        this.h = i;
        if (((Boolean) i.first).booleanValue()) {
            this.e.compareAndSet(false, true);
        }
        return 0;
    }

    @Override // com.taobao.android.tschedule.a.AbstractC0502a
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd4cd96", new Object[]{this, str, str2});
            return;
        }
        zdh.a("ScheduleStrategy", "onPreRenderVersionChanged, old=" + str + ", new=" + str2);
        ((d92) this.b).a();
    }

    public String e() {
        db1 db1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f25fd25d", new Object[]{this});
        }
        if (k()) {
            return null;
        }
        l();
        String b = ku6.b();
        boolean c = ((d92) this.b).c(b);
        if (c) {
            db1Var = f();
        } else {
            db1Var = g(b);
        }
        if (db1Var != null && !TextUtils.isEmpty(db1Var.f17702a)) {
            this.i.b(db1Var);
        }
        String b2 = db1.b(db1Var);
        boolean c2 = ABTest.c(100);
        HashMap hashMap = new HashMap();
        hashMap.put("hasHistory", String.valueOf(c));
        hashMap.put("isGrayOpen", String.valueOf(c2));
        hashMap.put("bizName", b2);
        dms.b("downgrade", "", "1", "TSchedule", "Arbitrate", hashMap);
        if (c2) {
            return b2;
        }
        return null;
    }

    public final db1 f() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (db1) ipChange.ipc$dispatch("bbb98cee", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f9712a).entrySet()) {
            float floatValue = ((Float) entry.getValue()).floatValue();
            for (gjw gjwVar : ((d92) this.b).b((String) entry.getKey())) {
                List<Pair<String, RenderScheduleTask>> a2 = met.a(met.d(), gjwVar.f20050a);
                if (a2.size() > 0) {
                    for (Pair<String, RenderScheduleTask> pair : a2) {
                        if (hashMap.containsKey(((RenderScheduleTask) pair.second).taskKey)) {
                            f = ((bb1) hashMap.get(((RenderScheduleTask) pair.second).taskKey)).c;
                        } else {
                            f = 0.0f;
                        }
                        float f2 = f + (gjwVar.b * floatValue);
                        RenderScheduleTask renderScheduleTask = (RenderScheduleTask) pair.second;
                        String str = renderScheduleTask.taskKey;
                        hashMap.put(str, new bb1(str, ((RenderTaskContext) renderScheduleTask.taskContext).bizCode, f2));
                    }
                }
            }
        }
        if (hashMap.values().size() <= 0) {
            return null;
        }
        bb1 bb1Var = (bb1) Collections.max(hashMap.values());
        zdh.a("ScheduleStrategy", "arbitrateHistory, max is " + bb1Var);
        if (Float.compare(bb1Var.c, this.g) >= 0) {
            return bb1Var;
        }
        return null;
    }

    public final db1 g(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (db1) ipChange.ipc$dispatch("a1494a05", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        List<gjw> b = ((d92) this.b).b(str);
        for (gjw gjwVar : b) {
            List<Pair<String, RenderScheduleTask>> a2 = met.a(met.d(), gjwVar.f20050a);
            if (a2.size() > 0) {
                for (Pair<String, RenderScheduleTask> pair : a2) {
                    if (hashMap.containsKey(((RenderScheduleTask) pair.second).taskKey)) {
                        i = ((cb1) hashMap.get(((RenderScheduleTask) pair.second).taskKey)).c;
                    } else {
                        i = 0;
                    }
                    int i2 = i + gjwVar.b;
                    Object obj = pair.second;
                    hashMap.put(((RenderScheduleTask) obj).taskKey, new cb1(((RenderScheduleTask) obj).taskKey, ((RenderTaskContext) ((RenderScheduleTask) obj).taskContext).bizCode, i2));
                }
            }
        }
        if (b.isEmpty()) {
            List<RenderScheduleTask> d = met.d();
            if (d.size() == 1) {
                RenderScheduleTask renderScheduleTask = d.get(0);
                hashMap.put(renderScheduleTask.taskKey, new cb1(renderScheduleTask.taskKey, ((RenderTaskContext) renderScheduleTask.taskContext).bizCode, 0));
            }
        }
        if (hashMap.values().size() <= 0) {
            return null;
        }
        cb1 cb1Var = (cb1) Collections.max(hashMap.values());
        zdh.a("ScheduleStrategy", "arbitrateNoHistory, max is " + cb1Var);
        if (cb1Var.c >= this.f) {
            return cb1Var;
        }
        return null;
    }

    public final Map<String, String> h(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("baac52ea", new Object[]{this, str, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        if (map != null && map.containsKey("fullUrl")) {
            hashMap.put("sourceExtra", map.get("fullUrl"));
        }
        return hashMap;
    }

    public final Pair<Boolean, String> i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d58ed4b7", new Object[]{this, str, map});
        }
        dms.b("downgrade", "", "1", "TSchedule", "pageEnter", h(str, map));
        if (k()) {
            return Pair.create(Boolean.FALSE, null);
        }
        List<Pair<String, RenderScheduleTask>> a2 = met.a(met.d(), str);
        if (a2.size() > 0) {
            for (Pair<String, RenderScheduleTask> pair : a2) {
                if (cns.b(str, map, ((RenderTaskContext) ((RenderScheduleTask) pair.second).taskContext).params.spmVerifyValue) && ((d92) this.b).h(((RenderScheduleTask) pair.second).taskKey, (String) pair.first)) {
                    return Pair.create(Boolean.TRUE, ((RenderScheduleTask) pair.second).taskKey);
                }
            }
        }
        return Pair.create(Boolean.FALSE, null);
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.c.compareAndSet(false, true)) {
            ((d92) this.b).d(context);
            ajf.c(this);
            com.taobao.android.tschedule.a.a(this);
        }
    }

    public b() {
        this.f9712a = new HashMap();
        this.c = new AtomicBoolean(false);
        this.d = q1r.c(".schedule_strategy_on");
        this.e = new AtomicBoolean(false);
        this.f = 1;
        this.g = 0.7f;
        this.h = Pair.create(Boolean.FALSE, null);
        this.b = new d92();
        com.taobao.android.tschedule.strategy.a aVar = new com.taobao.android.tschedule.strategy.a();
        this.i = aVar;
        aVar.a(this);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5dd10fd", new Object[]{this})).booleanValue();
        }
        if (this.d) {
            return false;
        }
        return !zms.b("is_strategy_on", false);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0cf622", new Object[]{this});
            return;
        }
        String b = q1r.b(".schedule_strategy_weights", null);
        if (b == null) {
            b = zms.e("weight_params_each_day", "");
        }
        try {
            this.g = Float.parseFloat(zms.e("min_prerender_score", "0.7"));
        } catch (Throwable unused) {
        }
        try {
            this.f = Integer.parseInt(zms.e("min_first_day_prerender_count", "1"));
        } catch (Throwable unused2) {
        }
        if (b == null || b.length() <= 0) {
            zdh.a("ScheduleStrategy", "parse weights config error");
            return;
        }
        String[] split = b.trim().split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } catch (Throwable th) {
                zdh.b("ScheduleStrategy", "parse config error: ".concat(b), th);
            }
        }
        ((HashMap) this.f9712a).clear();
        Date date = new Date();
        int size = arrayList.size();
        for (int i = 1; i <= size; i++) {
            ((HashMap) this.f9712a).put(ku6.c(ku6.a(date, -i)), arrayList.get(i - 1));
        }
        ArrayList arrayList2 = new ArrayList(((HashMap) this.f9712a).keySet());
        arrayList2.add(ku6.c(date));
        ((d92) this.b).e(arrayList2);
    }

    @Override // tb.wif
    public int b(String str, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7164108b", new Object[]{this, str, map, obj})).intValue();
        }
        if (!this.e.compareAndSet(true, false)) {
            return 0;
        }
        try {
            return ABTest.b((String) this.h.second) ? 0 : 2;
        } catch (ABTest.NoABExpException unused) {
            return 4;
        } finally {
            dms.b("downgrade", "", "1", "TSchedule", "pageEntered", h(str, map));
        }
    }
}
