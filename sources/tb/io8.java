package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
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
public class io8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jo8 i;

    /* renamed from: a  reason: collision with root package name */
    public final wmh<String, ExperimentV5> f21478a = new wmh<>(800);
    public final Map<String, Object> b = new ConcurrentHashMap();
    public final Map<String, gnv> c = new HashMap();
    public final ConcurrentHashMap<Long, Long> d = new ConcurrentHashMap<>();
    @Deprecated
    public final Map<String, List<String>> e = new ConcurrentHashMap();
    public final Map<String, mwa> f = new HashMap();
    public final Object g = new Object();
    public final Object h = new Object();
    public boolean j = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21479a;

        public a(String str) {
            this.f21479a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                io8.this.q(this.f21479a);
            }
        }
    }

    static {
        t2o.a(961544326);
    }

    public io8(jo8 jo8Var) {
        this.i = jo8Var;
    }

    public void b(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a208c72d", new Object[]{this, experimentV5});
        } else if (experimentV5 != null) {
            if (!n.j().a().q() && experimentV5.isColdWork()) {
                return;
            }
            if (n.j().a().F() || !experimentV5.isBuildSwitchIndex()) {
                if (experimentV5.getType() == ExperimentType.AbComponent) {
                    synchronized (this.g) {
                        this.f21478a.e(experimentV5.getKey(), experimentV5);
                        ((ConcurrentHashMap) this.b).remove(experimentV5.getKey());
                    }
                } else if (experimentV5.getType() == ExperimentType.AbUri || experimentV5.getType() == ExperimentType.Redirect) {
                    if (experimentV5.getUri() == null) {
                        experimentV5.setUri(tnv.j(experimentV5.getKey()));
                    }
                    if (experimentV5.getUri() != null) {
                        String m = m(experimentV5.getUri());
                        synchronized (this.h) {
                            try {
                                gnv gnvVar = (gnv) ((HashMap) this.c).get(m);
                                if (gnvVar == null) {
                                    gnvVar = new gnv();
                                    ((HashMap) this.c).put(m, gnvVar);
                                }
                                gnvVar.j(experimentV5.getUri(), experimentV5);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                for (String str : experimentV5.getSwitchSet()) {
                    if (!TextUtils.isEmpty(str)) {
                        List list = (List) ((ConcurrentHashMap) this.e).get(str);
                        if (list == null) {
                            list = new CopyOnWriteArrayList();
                            ((ConcurrentHashMap) this.e).put(str, list);
                        }
                        list.add(experimentV5.getKey());
                    }
                }
            }
        }
    }

    public void c(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf1f8ea", new Object[]{this, experimentV5});
        } else if (experimentV5 != null) {
            if (!n.j().a().q() || !experimentV5.isColdWork()) {
                if (experimentV5.getSwitchSet().size() > 0) {
                    ((HashMap) this.f).remove(experimentV5.getKey());
                }
                b(experimentV5);
                return;
            }
            ((ConcurrentHashMap) this.b).put(experimentV5.getKey(), Boolean.FALSE);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f74671", new Object[]{this});
        } else {
            this.d.clear();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d49bc7a", new Object[]{this});
            return;
        }
        this.f21478a.c();
        synchronized (this.h) {
            ((HashMap) this.c).clear();
        }
    }

    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87458daa", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = (List) ((ConcurrentHashMap) this.e).get(str);
        if (list != null && list.size() != 0) {
            return list;
        }
        bqm a2 = bqm.a();
        String d = a2.d("switchName_" + str, null);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Arrays.asList(d.split("###")));
        ((ConcurrentHashMap) this.e).put(str, copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    public ConcurrentHashMap<Long, Long> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("153cd2de", new Object[]{this});
        }
        return this.d;
    }

    public ExperimentV5 i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("46e53c0c", new Object[]{this, new Long(j)});
        }
        synchronized (this.h) {
            try {
                for (gnv gnvVar : ((HashMap) this.c).values()) {
                    ExperimentV5 e = gnvVar.e(j);
                    if (e != null) {
                        return e;
                    }
                }
                synchronized (this.g) {
                    try {
                        for (ExperimentV5 experimentV5 : this.f21478a.k().values()) {
                            List<ExperimentGroupV5> groups = experimentV5.getGroups();
                            if (groups != null) {
                                for (ExperimentGroupV5 experimentGroupV5 : groups) {
                                    if (experimentGroupV5.getId() == j) {
                                        return experimentV5;
                                    }
                                }
                                continue;
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public ExperimentV5 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("f35d57b2", new Object[]{this, str});
        }
        synchronized (this.g) {
            try {
                ExperimentV5 d = this.f21478a.d(str);
                if (d != null) {
                    t(d.getId());
                } else if (((ConcurrentHashMap) this.b).get(str) != null) {
                    return null;
                } else {
                    if (n.j().a().Q()) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bqm a2 = bqm.a();
                        String d2 = a2.d("expKey_" + str, null);
                        if (!TextUtils.isEmpty(d2)) {
                            ExperimentV5 experimentV5 = (ExperimentV5) JSON.parseObject(d2, ExperimentV5.class);
                            b(experimentV5);
                            t(experimentV5.getId());
                            ogh.e("ExperimentCache", "懒加载耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
                            return experimentV5;
                        }
                    }
                    ydt.e(new a(str));
                    if (!this.j) {
                        ogh.g("ExperimentCache", "当前一休实验缓存还没加载完成");
                    }
                }
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<ExperimentV5> k(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3b3d61b0", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        String m = m(uri);
        synchronized (this.h) {
            try {
                gnv gnvVar = (gnv) ((HashMap) this.c).get(m);
                if (gnvVar != null) {
                    List<ExperimentV5> f = gnvVar.f(uri);
                    if (f != null && !f.isEmpty()) {
                        for (ExperimentV5 experimentV5 : f) {
                            t(experimentV5.getId());
                        }
                    }
                    return f;
                }
                if (!this.j) {
                    ogh.g("ExperimentCache", "当前一休实验缓存还没加载完成");
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mwa l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwa) ipChange.ipc$dispatch("413c2eb7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (mwa mwaVar : ((HashMap) this.f).values()) {
            if (mwaVar.b(str)) {
                if (mwaVar.o() && !kw6.c(mwaVar)) {
                    ogh.i("ExperimentCache", "【运行实验】实验周期计算。实验ID：" + mwaVar.h() + "，计算结果：当前不在实验时间周期内。");
                } else if (n.j().h().b(mwaVar.e(), null, mwaVar.h(), 0L)) {
                    return mwaVar;
                } else {
                    ogh.i("ExperimentCache", "【运行实验】实验周期计算。实验ID：" + mwaVar.h() + "，条件匹配失败，" + mwaVar.d());
                }
            }
        }
        return null;
    }

    public String m(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c4b5693", new Object[]{this, uri});
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.startsWith("http")) {
            scheme = "http";
        }
        return scheme + ":" + uri.getAuthority();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        try {
            o();
        } catch (Throwable th) {
            ku0.j("ExperimentCache.initialize", th);
        }
    }

    public final /* synthetic */ boolean p(boolean z, Set set, int i, Set set2, ExperimentV5 experimentV5) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2185b4b", new Object[]{this, new Boolean(z), set, new Integer(i), set2, experimentV5})).booleanValue();
        }
        if (z && a1.c(experimentV5, set)) {
            return true;
        }
        if (experimentV5 == null || experimentV5.getExpPublishType() != i) {
            return false;
        }
        if (n.j().a().q() && experimentV5.isColdWork()) {
            z2 = false;
        }
        if (z2 && experimentV5.getType() == ExperimentType.AbComponent) {
            set2.add(experimentV5.getKey());
        }
        if (z2) {
            ((ConcurrentHashMap) this.b).remove(experimentV5.getKey());
        }
        return z2;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b77e290", new Object[]{this});
            return;
        }
        s(HighPriorityExperimentStorage.SP_NAME_RELEASE);
        s(HighPriorityExperimentStorage.SP_NAME_PULL_BETA_FILE);
        s(HighPriorityExperimentStorage.SP_NAME_BETA_SINGLE);
    }

    public final void s(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdbd7f8", new Object[]{this, str});
            return;
        }
        Map<String, ?> all = n.j().b().getSharedPreferences(str, 0).getAll();
        if (all != null) {
            long b = bqm.a().b("experimentDataVersionV5", 0L);
            Object obj = all.get("experimentDataVersionV5");
            Object obj2 = all.get(HighPriorityExperimentStorage.OPT_VERSION_KEY);
            if ((obj instanceof Long) && b != 0 && b == ((Long) obj).longValue() && (obj2 instanceof Integer) && obj2 == 1) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if (!"experimentDataVersionV5".equals(entry.getKey()) && !HighPriorityExperimentStorage.OPT_VERSION_KEY.equals(entry.getKey())) {
                        if (entry.getValue() == null) {
                            str2 = null;
                        } else {
                            str2 = entry.getValue().toString();
                        }
                        mwa mwaVar = new mwa(str2);
                        mwaVar.s(entry.getKey());
                        ((HashMap) this.f).put(entry.getKey(), mwaVar);
                    }
                }
                try {
                    t5r.b("abLazyExperimentVersion", Long.valueOf(b));
                } catch (Throwable th) {
                    th.printStackTrace();
                    ku0.j("ExperimentCache.parseToHighPriorityExpList", th);
                }
            }
        }
    }

    public final void t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c56e690", new Object[]{this, new Long(j)});
            return;
        }
        Long valueOf = Long.valueOf(j);
        Long l = this.d.get(valueOf);
        if (l == null) {
            this.d.put(valueOf, 1L);
        } else {
            this.d.put(valueOf, Long.valueOf(l.longValue() + 1));
        }
    }

    public void u(qpm<ExperimentV5> qpmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7121f2", new Object[]{this, qpmVar});
            return;
        }
        synchronized (this.g) {
            this.f21478a.g(qpmVar);
        }
        synchronized (this.h) {
            try {
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    if (!(entry == null || entry.getValue() == null)) {
                        ((gnv) entry.getValue()).k(qpmVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(List<ExperimentV5> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9880c49f", new Object[]{this, list, new Integer(i)});
        } else {
            x(list, new HashSet(), i, false);
        }
    }

    public void w(List<ExperimentV5> list, Set<Long> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1ef08", new Object[]{this, list, set, new Integer(i)});
        } else {
            x(list, set, i, true);
        }
    }

    public List<ExperimentV5> g(String str) {
        ExperimentCognation experimentCognation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e718a94", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            max maxVar = new max();
            maxVar.f(new lax("end_time>?", Long.valueOf(mcp.a())), new lax[0]);
            maxVar.f(new lax("type=?", Integer.valueOf(ExperimentType.AbComponent.getValue())), new lax[0]);
            lax b = maxVar.b();
            ArrayList<T> h = this.i.h(new String[]{"id", "release_id", "key", ExperimentDO.COLUMN_BEGIN_TIME, ExperimentDO.COLUMN_END_TIME, "condition", ExperimentDO.COLUMN_COGNATION}, null, 0, 0, b.c(), b.d());
            if (h != 0 && !h.isEmpty()) {
                Iterator it = h.iterator();
                while (it.hasNext()) {
                    ExperimentDO experimentDO = (ExperimentDO) it.next();
                    ExperimentV5 d = this.f21478a.d(experimentDO.getKey());
                    if (d != null) {
                        experimentCognation = d.getCognation();
                    } else {
                        experimentCognation = go8.p(experimentDO);
                    }
                    if (experimentCognation != null && experimentCognation.hasDomain(str)) {
                        if (d == null) {
                            d = go8.l(experimentDO);
                        }
                        if (d != null) {
                            arrayList.add(d);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("ExperimentCache.getExperimentOneGroupsByDomain", th);
        }
        return arrayList;
    }

    public final void o() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fea0736", new Object[]{this});
            return;
        }
        ogh.e("ExperimentCache", "initializeV5");
        max maxVar = new max();
        maxVar.f(new lax("end_time>?", Long.valueOf(mcp.a())), new lax[0]);
        max maxVar2 = new max();
        maxVar2.g(new lax("type=?", Integer.valueOf(ExperimentType.AbUri.getValue())), new lax("type=?", Integer.valueOf(ExperimentType.Redirect.getValue())), new lax[0]);
        maxVar.f(maxVar2.b(), new lax[0]);
        lax b = maxVar.b();
        ArrayList<T> h = this.i.h(null, "id ASC", 0, 0, b.c(), b.d());
        if (h == 0 || h.isEmpty()) {
            z = false;
        } else {
            Iterator it = h.iterator();
            while (it.hasNext()) {
                ExperimentV5 l = go8.l((ExperimentDO) it.next());
                if (l != null) {
                    b(l);
                }
            }
            z = true;
        }
        StringBuilder sb = new StringBuilder("加载页面实验缓存数据");
        sb.append(h == 0 ? 0 : h.size());
        sb.append("条.");
        ogh.g("ExperimentCache", sb.toString());
        max maxVar3 = new max();
        maxVar3.f(new lax("end_time>?", Long.valueOf(mcp.a())), new lax[0]);
        maxVar3.f(new lax("type=?", Integer.valueOf(ExperimentType.AbComponent.getValue())), new lax[0]);
        maxVar3.f(new lax("ext_int=?", 0), new lax[0]);
        lax b2 = maxVar3.b();
        ArrayList<T> h2 = this.i.h(null, "hit_latest_time DESC, hit_count DESC", 0, 800, b2.c(), b2.d());
        if (h2 != 0 && !h2.isEmpty()) {
            Iterator it2 = h2.iterator();
            while (it2.hasNext()) {
                ExperimentV5 l2 = go8.l((ExperimentDO) it2.next());
                if (l2 != null) {
                    b(l2);
                }
            }
            z = true;
        }
        StringBuilder sb2 = new StringBuilder("加载变量实验缓存数据");
        sb2.append(h2 == 0 ? 0 : h2.size());
        sb2.append("条.");
        ogh.g("ExperimentCache", sb2.toString());
        if (n.j().e().n() > 0) {
            if (z) {
                ku0.i(ku0.DATABASE_EXPERIMENT_GROUPS_V2_ALARM, "v5");
            } else {
                ku0.g(ku0.DATABASE_EXPERIMENT_GROUPS_V2_ALARM, "v5", "0", null, false);
            }
        }
        this.j = true;
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4620aaf", new Object[]{this, str});
            return;
        }
        try {
            max maxVar = new max();
            maxVar.f(new lax("key=?", str), new lax[0]);
            lax b = maxVar.b();
            List<ExperimentDO> h = this.i.h(null, null, 0, 0, b.c(), b.d());
            if (h == null || h.isEmpty()) {
                ((ConcurrentHashMap) this.b).put(str, Boolean.TRUE);
                return;
            }
            for (ExperimentDO experimentDO : h) {
                ExperimentV5 l = go8.l(experimentDO);
                if (l != null) {
                    if (l.isColdWork()) {
                        ((ConcurrentHashMap) this.b).put(str, Boolean.FALSE);
                    } else {
                        b(l);
                        t(l.getId());
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("ExperimentCache.loadExperimentCacheV5", th);
        }
    }

    public final void x(List<ExperimentV5> list, Set<Long> set, int i, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dd0bce", new Object[]{this, list, set, new Integer(i), new Boolean(z)});
            return;
        }
        HashSet hashSet = new HashSet();
        u(new ho8(this, z, set, i, hashSet));
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : list) {
            if (!z || !a1.c(experimentV5, set)) {
                if (experimentV5.getType() == ExperimentType.AbUri || experimentV5.getType() == ExperimentType.Redirect || (experimentV5.getType() == ExperimentType.AbComponent && hashSet.contains(experimentV5.getKey()))) {
                    c(experimentV5);
                    i2++;
                } else {
                    arrayList.add(experimentV5);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ExperimentV5 experimentV52 = (ExperimentV5) it.next();
            if (this.f21478a.i() >= 800) {
                break;
            }
            c(experimentV52);
            i2++;
        }
        ogh.e("ExperimentCache", "尝试添加实验缓存" + i2 + "条，publishType=" + i);
    }
}
