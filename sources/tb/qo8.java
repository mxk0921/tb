package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class qo8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qo8 h;

    /* renamed from: a  reason: collision with root package name */
    public final io8 f26845a;
    public final jo8 b;
    public final so8 d;
    public final ConcurrentHashMap<String, Set<bzu>> e = new ConcurrentHashMap<>();
    @Deprecated
    public final List<ExperimentV5> f = new CopyOnWriteArrayList();
    public long g = System.currentTimeMillis();
    public final j92 c = new j92();

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
                qo8.b(qo8.this).q(qo8.a(qo8.this).h());
                qo8.a(qo8.this).d();
                qo8.c(qo8.this, System.currentTimeMillis());
            } catch (Throwable th) {
                ku0.j("ExperimentManager.recordExperimentHitCount", th);
            }
        }
    }

    static {
        t2o.a(961544328);
    }

    public qo8() {
        jo8 jo8Var = new jo8();
        this.b = jo8Var;
        this.f26845a = new io8(jo8Var);
        this.d = new so8(jo8Var);
    }

    public static /* synthetic */ io8 a(qo8 qo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io8) ipChange.ipc$dispatch("f7ff882a", new Object[]{qo8Var});
        }
        return qo8Var.f26845a;
    }

    public static /* synthetic */ jo8 b(qo8 qo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jo8) ipChange.ipc$dispatch("f210a343", new Object[]{qo8Var});
        }
        return qo8Var.b;
    }

    public static /* synthetic */ long c(qo8 qo8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fa17982", new Object[]{qo8Var, new Long(j)})).longValue();
        }
        qo8Var.g = j;
        return j;
    }

    public static synchronized qo8 s() {
        synchronized (qo8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qo8) ipChange.ipc$dispatch("cee6fc7f", new Object[0]);
            }
            if (h == null) {
                h = new qo8();
            }
            return h;
        }
    }

    public void A(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec851a1", new Object[]{this, str, str2, bzuVar});
        } else if (!TextUtils.equals(str, UTABTest.COMPONENT_URI)) {
            String a2 = a1.a(str, str2);
            if (bzuVar == null) {
                this.e.remove(a2);
                return;
            }
            Set<bzu> set = this.e.get(a2);
            if (set != null) {
                synchronized (this) {
                    set.remove(bzuVar);
                }
            }
        }
    }

    public boolean B(List<ExperimentDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b152c9", new Object[]{this, list})).booleanValue();
        }
        try {
            long[] k = this.c.k(list);
            if (!(k == null || k.length == 0 || k.length != list.size())) {
                if (ac1.a(k, -1L) == -1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            ku0.j("ExperimentManager.safeSaveBetaExperimentToDatabase", e);
            return false;
        }
    }

    public boolean C(List<ExperimentDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b69f7db9", new Object[]{this, list})).booleanValue();
        }
        try {
            long[] k = this.b.k(list);
            if (!(k == null || k.length == 0 || k.length != list.size())) {
                if (ac1.a(k, -1L) == -1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            ku0.j("ExperimentManager.safeSaveExperimentToDatabase", e);
            return false;
        }
    }

    public boolean D(List<ExperimentV5> list, int i) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2c3e67", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        while (it.hasNext()) {
            ExperimentV5 experimentV5 = (ExperimentV5) it.next();
            if (experimentV5 != null && experimentV5.getExpPublishType() == i) {
                ((CopyOnWriteArrayList) this.f).remove(experimentV5);
            }
        }
        ((CopyOnWriteArrayList) this.f).addAll(list);
        this.f26845a.v(list, i);
        lax laxVar = new lax("exp_publish_type=?", Integer.valueOf(i));
        this.c.a(laxVar.c(), laxVar.d());
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV52 : list) {
            arrayList.add(go8.c(experimentV52, 0L, 0L));
            if (arrayList.size() > 10) {
                if (!B(arrayList)) {
                    z = false;
                }
                arrayList.clear();
            }
        }
        if (arrayList.isEmpty() || B(arrayList)) {
            z2 = z;
        }
        if (!z2) {
            ogh.i("ExperimentManager", "beta 实验信息保存失败");
        }
        return z2;
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d062a4", new Object[]{this, str});
        } else {
            bqm.a().g("betaExperimentDataFileMd5", str);
        }
    }

    public void H(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5d19fb", new Object[]{this, new Long(j)});
        } else {
            bqm.a().f("protocolCompleteSaveTime", j);
        }
    }

    @Deprecated
    public final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c039c0", new Object[]{this, str});
        } else {
            bqm.a().g("experimentDataSignatureV5", str);
        }
    }

    public final void J(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10820a2e", new Object[]{this, new Long(j)});
        } else if (j != 0) {
            bqm.a().e("experimentDataVersionV5", j);
        }
    }

    public void d(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc284c3e", new Object[]{this, str, str2, bzuVar});
        } else if (!TextUtils.equals(str, UTABTest.COMPONENT_URI)) {
            String a2 = a1.a(str, str2);
            Set<bzu> set = this.e.get(a2);
            synchronized (this) {
                if (set == null) {
                    try {
                        set = new HashSet<>();
                        this.e.put(a2, set);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                set.add(bzuVar);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9614fb", new Object[]{this});
        } else {
            this.f26845a.e();
        }
    }

    public boolean f(List<ExperimentV5> list, Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8016fe24", new Object[]{this, list, set})).booleanValue();
        }
        try {
            jo8.n(this.b.b().w(), true);
            jo8.m(this.b.b().w(), true);
        } catch (Throwable th) {
            ku0.j("ExperimentManager.dropAndSaveExperimentsToDatabase", th);
        }
        return E(list, set, true);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e4e1a7a", new Object[]{this});
        }
        return bqm.a().d("betaExperimentDataFileMd5", null);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7064d24", new Object[]{this});
        }
        return bqm.a().d("betaExperimentDataSignature", null);
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cc51c1e", new Object[]{this})).intValue();
        }
        return ((CopyOnWriteArrayList) this.f).size();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8842de", new Object[]{this});
        }
        return bqm.a().d("experimentDataSignatureV5", null);
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3adcfed6", new Object[]{this})).longValue();
        }
        return bqm.a().b("experimentDataVersionV5", 0L);
    }

    public ExperimentV5 l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("f9a21d2e", new Object[]{this, new Long(j)});
        }
        return this.f26845a.i(j);
    }

    public ExperimentV5 m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("e33e9ed0", new Object[]{this, str});
        }
        ExperimentV5 j = this.f26845a.j(str);
        if (j != null) {
            y(false);
        }
        return j;
    }

    public List<ExperimentV5> n(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("671a9ece", new Object[]{this, uri});
        }
        List<ExperimentV5> k = this.f26845a.k(uri);
        if (k != null) {
            y(false);
        }
        return k;
    }

    public List<String> o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87458daa", new Object[]{this, str});
        }
        return this.f26845a.f(str);
    }

    public List<ExperimentV5> p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e718a94", new Object[]{this, str});
        }
        return this.f26845a.g(str);
    }

    public List<ExperimentV5> q(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("670077a4", new Object[]{this, l});
        }
        return this.d.d(l);
    }

    public Map<Long, ExperimentDO> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87ae883d", new Object[]{this});
        }
        Map<Long, ExperimentDO> map = null;
        if (!n.j().a().R()) {
            return null;
        }
        try {
            map = this.b.o();
            return x(map, this.f26845a.h());
        } catch (Throwable th) {
            ku0.j("ExperimentManager.getHitCount", th);
            return map;
        }
    }

    public mwa t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwa) ipChange.ipc$dispatch("413c2eb7", new Object[]{this, str});
        }
        if (n.j().a().D()) {
            return this.f26845a.l(str);
        }
        return null;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b77e290", new Object[]{this});
        } else if (n.j().a().D()) {
            this.f26845a.r();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb8e142", new Object[]{this});
            return;
        }
        try {
            this.f26845a.n();
        } catch (Throwable th) {
            ku0.j("ExperimentManager.loadMemoryCache", th);
        }
        u();
        this.d.e();
    }

    public Map<Long, ExperimentDO> x(Map<Long, ExperimentDO> map, Map<Long, Long> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f2ac6b22", new Object[]{this, map, map2});
        }
        if (map2 != null && !map2.isEmpty()) {
            if (map == null) {
                map = new HashMap<>();
            }
            for (Map.Entry<Long, Long> entry : map2.entrySet()) {
                ExperimentDO experimentDO = map.get(entry.getKey());
                if (experimentDO == null) {
                    ExperimentDO experimentDO2 = new ExperimentDO();
                    experimentDO2.setId(entry.getKey().longValue());
                    experimentDO2.setHitCount(entry.getValue().longValue());
                    experimentDO2.setHitLatestTime(System.currentTimeMillis());
                    map.put(Long.valueOf(experimentDO2.getId()), experimentDO2);
                } else {
                    experimentDO.setHitCount(experimentDO.getHitCount() + entry.getValue().longValue());
                    experimentDO.setHitLatestTime(System.currentTimeMillis());
                }
            }
        }
        return map;
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8eaae3", new Object[]{this, new Boolean(z)});
        } else if (!this.f26845a.h().isEmpty() && n.j().a().R()) {
            if (z || this.f26845a.h().size() >= 5 || this.g + 60000 < System.currentTimeMillis()) {
                ydt.b(new a());
            }
        }
    }

    public void z(List<ExperimentV5> list, Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15661161", new Object[]{this, list, set});
            return;
        }
        this.f26845a.w(list, set, 1);
        this.d.f(list);
    }

    public synchronized void F(List<ExperimentV5> list, Set<Long> set, long j, String str) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("594989f", new Object[]{this, list, set, new Long(j), str});
                return;
            }
            StringBuilder sb = new StringBuilder("待缓存实验数量：");
            sb.append(list == null ? 0 : list.size());
            sb.append(", dataVersion=");
            sb.append(j);
            sb.append(", dataSignature=");
            sb.append(str);
            ogh.e("ExperimentManager", sb.toString());
            if (list == null || list.isEmpty()) {
                e();
            } else {
                z(list, set);
                z = E(list, set, true);
                if (!z && n.j().a().l()) {
                    z = f(list, set);
                }
            }
            if (z) {
                J(j);
                I(str);
                H(System.currentTimeMillis());
                this.g = System.currentTimeMillis();
                this.f26845a.d();
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2a8fb6", new Object[]{this});
            return;
        }
        try {
            max maxVar = new max();
            maxVar.f(new lax("end_time>?", Long.valueOf(mcp.a())), new lax[0]);
            lax b = maxVar.b();
            ArrayList<T> h2 = this.c.h(null, null, 0, 0, b.c(), b.d());
            if (h2 != 0 && !h2.isEmpty()) {
                Iterator it = h2.iterator();
                while (it.hasNext()) {
                    ExperimentV5 l = go8.l((ExperimentDO) it.next());
                    if (l != null) {
                        this.f26845a.b(l);
                        ((CopyOnWriteArrayList) this.f).add(l);
                    }
                }
                ogh.e("ExperimentManager", "加载Beta实验缓存" + h2.size() + "条");
            }
        } catch (Throwable th) {
            ku0.j("ExperimentManager.loadBetaExperimentCache", th);
        }
    }

    public boolean E(List<ExperimentV5> list, Set<Long> set, boolean z) {
        long j;
        long j2;
        ExperimentDO experimentDO;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("254ce840", new Object[]{this, list, set, new Boolean(z)})).booleanValue();
        }
        Map<Long, ExperimentDO> r = r();
        if (z) {
            max maxVar = new max();
            maxVar.f(new lax("exp_publish_type=?", 2), new lax[0]);
            if (set != null && set.size() > 0) {
                maxVar.f(new lax("release_id NOT IN " + bsq.h(set), new Object[0]), new lax[0]);
            }
            lax b = new max().g(new lax("exp_publish_type=?", 1), maxVar.e(), new lax[0]).b();
            this.b.a(b.c(), b.d());
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : list) {
            if (!a1.c(experimentV5, set)) {
                if (r == null || (experimentDO = r.get(Long.valueOf(experimentV5.getId()))) == null) {
                    j2 = 0;
                    j = 0;
                } else {
                    j2 = experimentDO.getHitCount();
                    j = experimentDO.getHitLatestTime();
                }
                ExperimentDO c = go8.c(experimentV5, j2, j);
                if (c != null) {
                    arrayList.add(c);
                    if (arrayList.size() > 10) {
                        if (!C(arrayList)) {
                            z2 = false;
                        }
                        arrayList.clear();
                    }
                } else {
                    ogh.g("ExperimentManager", "实验对象转换数据存储对象失败，实验ID=" + experimentV5.getId());
                }
            }
        }
        if (arrayList.isEmpty() || C(arrayList)) {
            return z2;
        }
        return false;
    }
}
