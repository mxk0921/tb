package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.alibaba.ut.abtest.internal.debug.DebugWindVanePlugin;
import com.alibaba.ut.abtest.pipeline.Response;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nv6 implements mv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BlockingQueue<m2o> f = new LinkedBlockingQueue();
    public static final AtomicBoolean g = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public cv6 f24970a;
    public final Set<Long> b = new HashSet();
    public final Object c = new Object();
    public final int d = 5;
    public final Map<String, Object> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nv6.a(nv6.this);
            } catch (Exception e) {
                ku0.j("DebugServiceImpl.reportLog", e);
            }
            nv6.b().set(false);
        }
    }

    static {
        t2o.a(961544360);
        t2o.a(961544359);
    }

    public nv6() {
        try {
            fsw.h(DebugWindVanePlugin.API_SERVER_NAME, DebugWindVanePlugin.class);
            f();
            String d = bqm.a().d("ab_mock_switches", "");
            if (!TextUtils.isEmpty(d)) {
                this.e = uwf.c(d);
            }
        } catch (Throwable th) {
            ku0.j("DebugServiceImpl.constructor", th);
        }
    }

    public static /* synthetic */ void a(nv6 nv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc95927", new Object[]{nv6Var});
        } else {
            nv6Var.c();
        }
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba88d1f8", new Object[0]);
        }
        return g;
    }

    public final synchronized void c() {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34e239f2", new Object[]{this});
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                while (z) {
                    m2o m2oVar = (m2o) ((LinkedBlockingQueue) f).poll(2L, TimeUnit.SECONDS);
                    if (m2oVar != null) {
                        arrayList.add(m2oVar);
                        if (arrayList.size() > this.d) {
                            e(arrayList);
                            arrayList.clear();
                        }
                    } else {
                        z = false;
                    }
                }
                if (arrayList.size() > 0) {
                    e(arrayList);
                }
            } catch (InterruptedException e) {
                ku0.j("DebugServiceImpl.handleLogDataQueue", e);
            }
        }
    }

    public final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("887759e3", new Object[]{this, new Integer(i)});
        }
        if (i == 5) {
            return EvoAccsService.ACCS_BETA_SINGLE;
        }
        if (i != 6) {
            return "release";
        }
        return "beta";
    }

    public final void e(List<m2o> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44564e8", new Object[]{this, list});
            return;
        }
        cv6 cv6Var = this.f24970a;
        if (cv6Var == null) {
            str = "";
        } else {
            str = cv6Var.a();
        }
        c3o b = e4o.b(list, str);
        Response a2 = n.j().l().a(b);
        if (a2 == null) {
            ogh.l("DebugServiceImpl", "Response is null, request=" + b);
        } else if (!a2.isSuccess()) {
            ogh.l("DebugServiceImpl", "Response is failure, code=" + a2.getCode() + ", message=" + a2.getMessage() + ", httpCode=" + a2.getHttpResponseCode() + ", request=" + b);
        }
    }

    @Override // tb.mv6
    public Object j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b4e93f98", new Object[]{this, str});
        }
        Map<String, Object> map = this.e;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // tb.mv6
    public boolean l(long j) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e51299bc", new Object[]{this, new Long(j)})).booleanValue();
        }
        synchronized (this.c) {
            contains = ((HashSet) this.b).contains(Long.valueOf(j));
        }
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    @Override // tb.mv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(com.alibaba.ut.abtest.internal.debug.Debug r6) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nv6.h(com.alibaba.ut.abtest.internal.debug.Debug):void");
    }

    @Override // tb.mv6
    public void k(Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db99933", new Object[]{this, set});
            return;
        }
        synchronized (this.c) {
            ((HashSet) this.b).clear();
        }
        if (set != null && !set.isEmpty()) {
            synchronized (this.c) {
                this.b.addAll(set);
            }
            StringBuilder sb = new StringBuilder();
            for (Long l : set) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                if (l != null) {
                    sb.append(l);
                    ExperimentV5 l2 = qo8.s().l(l.longValue());
                    if (l2 != null && l2.isHighPriorityWork()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l2);
                        new HighPriorityExperimentStorage().n(n.j().a().A()).k(d(l2.getExpPublishType())).l(arrayList).m(2).a().p();
                    }
                }
            }
            if (n.j().a().c()) {
                bqm.a().g("debug_whitelist", sb.toString());
            }
            ogh.i("DebugServiceImpl", "【白名单数据】本设备白名单实验分组：" + sb.toString());
        } else if (n.j().a().c()) {
            bqm.a().g("debug_whitelist", "");
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d429bd60", new Object[]{this});
        } else if (n.j().a().c()) {
            String d = bqm.a().d("debug_whitelist", "");
            if (ogh.c()) {
                ogh.e("DebugServiceImpl", "【白名单数据】本设备白名单实验分组(缓存)：" + d);
            }
            if (!TextUtils.isEmpty(d)) {
                String[] split = d.split(",");
                try {
                    synchronized (this.c) {
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                this.b.add(Long.valueOf(Long.parseLong(str)));
                            }
                        }
                    }
                } catch (Exception e) {
                    ku0.j("DebugServiceImpl.restoreWhitelist", e);
                }
            }
        }
    }

    @Override // tb.mv6
    public void i(int i, String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43abf014", new Object[]{this, new Integer(i), str, str2, str3, str4});
        } else if (this.f24970a != null) {
            try {
                m2o m2oVar = new m2o();
                m2oVar.g(System.currentTimeMillis());
                m2oVar.f(str);
                m2oVar.h(str2);
                StringBuilder sb = new StringBuilder("[");
                if (i == 0) {
                    str5 = "主";
                } else {
                    str5 = String.valueOf(i);
                }
                sb.append(str5);
                sb.append("进程]");
                sb.append(str4);
                m2oVar.e(sb.toString());
                ((LinkedBlockingQueue) f).offer(m2oVar);
                if (g.compareAndSet(false, true)) {
                    ydt.b(new a());
                }
            } catch (Throwable th) {
                ku0.j("DebugServiceImpl.reportLog", th);
            }
        }
    }
}
