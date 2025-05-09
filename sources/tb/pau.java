package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.g4;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.alibaba.ut.abtest.internal.track.ExperimentServerTrackPO;
import com.alibaba.ut.abtest.track.TrackId;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.net.URLDecoder;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pau implements nau {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] m = {2001, 2101, 2201};

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ExperimentV5> f25980a = new ConcurrentHashMap<>();
    public final Map<String, mwa> b = new ConcurrentHashMap();
    public final ConcurrentHashMap<String, Set<ExperimentTrack>> c = new ConcurrentHashMap<>();
    public final Object d = new Object();
    public final wmh<String, Set<ExperimentTrack>> e = new wmh<>(80);
    public final wmh<String, Set<ExperimentTrack>> f = new wmh<>(80);
    public final wmh<String, Set<String>> g = new wmh<>(n.j().a().o());
    public final Object h = new Object();
    public final Set<ExperimentTrack> i = new HashSet();
    public final Object j = new Object();
    public final Set<String> k = new CopyOnWriteArraySet();
    public final ConcurrentHashMap<String, Long> l = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(pau pauVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends TypeReference<List<ExperimentServerTrackPO>> {
        public b(pau pauVar) {
        }
    }

    static {
        t2o.a(961544435);
        t2o.a(961544434);
    }

    @Override // tb.nau
    public void b(do8 do8Var, Map<String, Object> map, pv6 pv6Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba58b56", new Object[]{this, do8Var, map, pv6Var});
        } else if (do8Var.f() != null && !do8Var.f().isEmpty() && n.j().a().k()) {
            for (String str : do8Var.f()) {
                Long d = do8Var.d(str);
                if (d == null || !n.j().a().M(d)) {
                    Long c = do8Var.c(str);
                    if (c == null || !n.j().a().g(c)) {
                        String t = t(str);
                        if (map == null || map.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && d != null) {
                            z = n.j().a().t(d);
                        }
                        if (!z) {
                            Long l = this.l.get(t);
                            if (l == null || l.longValue() + n.j().a().j() < mcp.a()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            w(str, map, pv6Var);
                            this.l.put(t, Long.valueOf(mcp.a()));
                        } else {
                            ku0.a(ku0.TRACK_1022_BLOCK_COUNTER);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.nau
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2948a711", new Object[]{this});
        }
        synchronized (this.j) {
            try {
                if (((HashSet) this.i).isEmpty()) {
                    return null;
                }
                HashSet hashSet = new HashSet();
                Iterator it = ((HashSet) this.i).iterator();
                while (it.hasNext()) {
                    ExperimentTrack experimentTrack = (ExperimentTrack) it.next();
                    if (experimentTrack.getTrackId() != null) {
                        hashSet.add(experimentTrack.getTrackId().getAbTrackId());
                    }
                }
                return wyv.i(hashSet, ".");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.nau
    public void g(do8 do8Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d98fda", new Object[]{this, do8Var});
        } else if (do8Var != null) {
            try {
                if (do8Var.f() != null) {
                    for (String str : do8Var.f()) {
                        if (!TextUtils.isEmpty(str) && !((CopyOnWriteArraySet) this.k).contains(str)) {
                            ((CopyOnWriteArraySet) this.k).add(str);
                            z = true;
                        }
                    }
                    if (z) {
                        String i = wyv.i(this.k, ".");
                        fti.b(i);
                        t5r.a(i);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // tb.nau
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e23bd774", new Object[]{this});
        }
        Map<String, Set<String>> k = this.g.k();
        if (k == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        synchronized (this.h) {
            try {
                for (Set<String> set : k.values()) {
                    if (set != null) {
                        hashSet.addAll(set);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wyv.i(hashSet, ".");
    }

    @Override // tb.nau
    public void k(mwa mwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a5e5e", new Object[]{this, mwaVar});
        } else if (mwaVar != null) {
            ogh.e("TrackServiceImpl", "添加已激活的实验, experimentKey=" + mwaVar.i());
            String valueOf = String.valueOf(mwaVar.h());
            mwa mwaVar2 = (mwa) ((ConcurrentHashMap) this.b).get(valueOf);
            long g = mwaVar.g();
            if (mwaVar2 != null) {
                long g2 = mwaVar2.g();
                if (mwaVar2.j() == mwaVar.j() && g2 == g) {
                    ogh.e("TrackServiceImpl", "实验数据未发生变化, key=" + valueOf);
                    return;
                }
                ogh.e("TrackServiceImpl", "实验数据发生变化,删除旧数据. key=" + valueOf);
                v(mwaVar2.k(), g2);
            }
            ((ConcurrentHashMap) this.b).put(valueOf, mwaVar);
            List<ExperimentTrack> k = mwaVar.k();
            if (k == null || k.isEmpty()) {
                ogh.l("TrackServiceImpl", "实验未包含埋点规则信息, key=" + valueOf);
                return;
            }
            ogh.l("TrackServiceImpl", "实验包含埋点规则信息, key=" + valueOf + ",埋点规则数量=" + k.size());
            TrackId trackId = new TrackId();
            trackId.setAbTrackId(qbu.a(mwaVar.j(), g));
            m(g, k, trackId, null);
            for (ExperimentTrack experimentTrack : k) {
                if (experimentTrack.isAppScope()) {
                    x();
                    return;
                }
            }
        }
    }

    @Override // tb.nau
    public HashMap<String, String> l(String str, int i, String str2, String str3, String str4, Map<String, String> map, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a23242ee", new Object[]{this, str, new Integer(i), str2, str3, str4, map, str5});
        }
        HashSet hashSet = new HashSet();
        try {
            Set<ExperimentTrack> d = this.f.d(q(i, str, str5));
            if (d != null && !d.isEmpty()) {
                for (ExperimentTrack experimentTrack : d) {
                    hashSet.add(experimentTrack.getTrackId().getAbTrackId());
                }
            }
        } catch (Throwable th) {
            ku0.j("TrackServiceImpl.getTrackIdV2", th);
        }
        String u = u(hashSet, map);
        if (TextUtils.isEmpty(u)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("evo", u);
        return hashMap;
    }

    public final void m(long j, List<ExperimentTrack> list, TrackId trackId, Object obj) {
        Iterator<ExperimentTrack> it;
        ExperimentTrack experimentTrack;
        Set<ExperimentTrack> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65214f33", new Object[]{this, new Long(j), list, trackId, obj});
            return;
        }
        Iterator<ExperimentTrack> it2 = list.iterator();
        while (it2.hasNext()) {
            ExperimentTrack next = it2.next();
            if (next != null) {
                if (next.isAppScope()) {
                    ExperimentTrack experimentTrack2 = new ExperimentTrack();
                    experimentTrack2.setTrackId(trackId);
                    experimentTrack2.setGroupId(j);
                    synchronized (this.j) {
                        ((HashSet) this.i).add(experimentTrack2);
                    }
                }
                if (next.getPageNames() != null && next.getPageNames().length != 0) {
                    int[] iArr = m;
                    int length = iArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = iArr[i];
                        String[] pageNames = next.getPageNames();
                        int length2 = pageNames.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                it = it2;
                                experimentTrack = next;
                                break;
                            }
                            String str = pageNames[i3];
                            if (obj == null) {
                                it = it2;
                                set = this.c.get(p(i2, str));
                                if (set == null) {
                                    set = new HashSet<>();
                                    experimentTrack = next;
                                    this.c.put(p(i2, str), set);
                                } else {
                                    experimentTrack = next;
                                }
                            } else {
                                it = it2;
                                experimentTrack = next;
                                if (i2 == 2001) {
                                    y(trackId, obj);
                                    break;
                                }
                                set = this.e.d(q(i2, str, qbu.b(obj)));
                                if (set == null) {
                                    set = new HashSet<>();
                                    this.e.e(q(i2, str, qbu.b(obj)), set);
                                }
                            }
                            ExperimentTrack experimentTrack3 = new ExperimentTrack();
                            experimentTrack3.setTrackId(trackId);
                            experimentTrack3.setGroupId(j);
                            synchronized (this.d) {
                                set.add(experimentTrack3);
                            }
                            Set<String> d = this.g.d(str);
                            if (d == null) {
                                d = new HashSet<>();
                                this.g.e(str, d);
                            }
                            synchronized (this.h) {
                                d.add(trackId.getAbTrackId());
                            }
                            i3++;
                            it2 = it;
                            next = experimentTrack;
                        }
                        i++;
                        it2 = it;
                        next = experimentTrack;
                    }
                    continue;
                } else {
                    return;
                }
            }
        }
    }

    public final void n(long j, List<ExperimentTrack> list, TrackId trackId, Object obj) {
        Iterator<ExperimentTrack> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3ac58f", new Object[]{this, new Long(j), list, trackId, obj});
            return;
        }
        Iterator<ExperimentTrack> it2 = list.iterator();
        while (it2.hasNext()) {
            ExperimentTrack next = it2.next();
            if (next != null) {
                if (next.isAppScope()) {
                    ExperimentTrack experimentTrack = new ExperimentTrack();
                    experimentTrack.setTrackId(trackId);
                    experimentTrack.setGroupId(j);
                    synchronized (this.j) {
                        ((HashSet) this.i).add(experimentTrack);
                    }
                }
                if (next.getPageNames() != null && next.getPageNames().length != 0 && obj != null) {
                    int[] iArr = m;
                    int length = iArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = iArr[i];
                        String[] pageNames = next.getPageNames();
                        int length2 = pageNames.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            String str = pageNames[i3];
                            if (i2 == 2001) {
                                break;
                            }
                            Set<ExperimentTrack> d = this.f.d(q(i2, str, qbu.b(obj)));
                            if (d == null) {
                                d = Collections.synchronizedSet(new HashSet());
                                it = it2;
                                this.f.e(q(i2, str, qbu.b(obj)), d);
                            } else {
                                it = it2;
                            }
                            ExperimentTrack experimentTrack2 = new ExperimentTrack();
                            experimentTrack2.setTrackId(trackId);
                            experimentTrack2.setGroupId(j);
                            d.add(experimentTrack2);
                            i3++;
                            it2 = it;
                        }
                        i++;
                        it2 = it2;
                    }
                } else {
                    return;
                }
            }
        }
        Set<String> d2 = this.g.d(obj.getClass().getName());
        if (d2 == null) {
            d2 = new HashSet<>();
            this.g.e(obj.getClass().getName(), d2);
        }
        synchronized (this.h) {
            d2.add(trackId.getAbTrackId());
        }
    }

    public final String o(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18de722f", new Object[]{this, str, new Integer(i)});
        }
        if (i != 2001) {
            return str;
        }
        try {
            return str.contains(m.TRACK_PREFIX) ? URLDecoder.decode(str, "utf-8") : str;
        } catch (Exception e) {
            ku0.j("TrackServiceImpl.decodeIfNeed", e);
            return str;
        }
    }

    public final String p(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d333fb4", new Object[]{this, new Integer(i), str});
        }
        return i + "_" + str;
    }

    public final String q(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1514862a", new Object[]{this, new Integer(i), str, str2});
        }
        return i + "_" + str + "_" + str2;
    }

    public final Set<ExperimentTrack> r(int i, String str, String str2) {
        HashSet hashSet;
        Set<ExperimentTrack> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c4a29731", new Object[]{this, new Integer(i), str, str2});
        }
        Set<ExperimentTrack> set = this.c.get(p(i, str));
        if (set != null) {
            hashSet = new HashSet();
            synchronized (this.d) {
                hashSet.addAll(set);
            }
        } else {
            hashSet = null;
        }
        if (!TextUtils.isEmpty(str2) && (d = this.e.d(q(i, str, str2))) != null) {
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            synchronized (this.d) {
                hashSet.addAll(d);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup> s(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.pau.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "9b50266"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            java.util.List r7 = (java.util.List) r7
            return r7
        L_0x0018:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            java.lang.String r2 = "TrackServiceImpl"
            if (r0 == 0) goto L_0x0028
            java.lang.String r7 = "服务端实验配置为空！"
            tb.ogh.l(r2, r7)
            return r1
        L_0x0028:
            java.lang.String r0 = "{"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "}"
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L_0x0051
        L_0x003a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: all -> 0x0046
            r0.<init>(r7)     // Catch: all -> 0x0046
            java.lang.String r3 = "dataTrack"
            java.lang.String r0 = r0.optString(r3)     // Catch: all -> 0x0046
            goto L_0x0052
        L_0x0046:
            r0 = move-exception
            java.lang.String r3 = "服务端实验配置格式不合法！内容="
            java.lang.String r3 = r3.concat(r7)
            tb.ogh.m(r2, r3, r0)
        L_0x0051:
            r0 = r7
        L_0x0052:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "【服务端实验】添加埋点规则失败，埋点规则不合法。埋点规则："
            if (r3 == 0) goto L_0x0063
            java.lang.String r7 = r4.concat(r7)
            tb.ogh.n(r2, r7)
            return r1
        L_0x0063:
            tb.pau$b r3 = new tb.pau$b
            r3.<init>(r6)
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.Object r3 = tb.uwf.b(r0, r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0080
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            java.util.List r7 = tb.go8.d(r3, r0)
            return r7
        L_0x0080:
            java.lang.String r7 = r4.concat(r7)
            tb.ogh.n(r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pau.s(java.lang.String):java.util.List");
    }

    public final String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3dc8b8", new Object[]{this, str});
        }
        String o = n.j().o();
        int i = Calendar.getInstance().get(7);
        if (TextUtils.isEmpty(o)) {
            return d3r.c().d() + "_0_" + i + "_" + str;
        }
        return d3r.c().d() + "_" + o + "_" + i + "_" + str;
    }

    public final String u(Set<String> set, Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9679ea2", new Object[]{this, set, map});
        }
        if (map != null) {
            String str = map.get("evo");
            if (!TextUtils.isEmpty(str) && (split = str.split("\\.")) != null) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        set.add(str2);
                    }
                }
            }
        }
        if (set.size() > 0) {
            return wyv.i(set, ".");
        }
        return null;
    }

    public final void v(List<ExperimentTrack> list, long j) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f305f5", new Object[]{this, list, new Long(j)});
        } else if (list != null && !list.isEmpty() && j > 0) {
            for (ExperimentTrack experimentTrack : list) {
                if (experimentTrack.isAppScope()) {
                    synchronized (this.j) {
                        try {
                            Iterator it = ((HashSet) this.i).iterator();
                            while (it.hasNext()) {
                                if (((ExperimentTrack) it.next()).getGroupId() == j) {
                                    it.remove();
                                }
                            }
                        } finally {
                        }
                    }
                }
                if (!(experimentTrack.getPageNames() == null || experimentTrack.getPageNames().length == 0)) {
                    for (int i : m) {
                        for (String str : experimentTrack.getPageNames()) {
                            Set<ExperimentTrack> set = this.c.get(p(i, str));
                            if (set != null) {
                                synchronized (this.d) {
                                    try {
                                        if (!set.isEmpty()) {
                                            Iterator<ExperimentTrack> it2 = set.iterator();
                                            while (it2.hasNext()) {
                                                if (it2.next().getGroupId() == j) {
                                                    it2.remove();
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
    }

    public void w(String str, Map<String, Object> map, pv6 pv6Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71bdc5c", new Object[]{this, str, map, pv6Var});
            return;
        }
        String o = n.j().o();
        g1v g1vVar = new g1v();
        g1vVar.setProperty(g1v.FIELD_EVENT_ID, "1022");
        g1vVar.setProperty(g1v.FIELD_ARG1, g4.b.i);
        g1vVar.setProperty(g1v.FIELD_ARG2, "version=2.16.37,id=" + str + ",userid=" + o);
        if (map != null && !map.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String g = bsq.g(entry.getKey());
                if (!g.contains("=") && !g.contains(",")) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    if (entry.getValue() == null) {
                        obj = "";
                    } else {
                        obj = entry.getValue();
                    }
                    stringBuffer.append(obj);
                }
            }
            if (stringBuffer.length() > 0) {
                g1vVar.setProperty(g1v.FIELD_ARGS, stringBuffer.toString());
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(g1vVar.build());
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f92b25d", new Object[]{this});
        } else if (n.j().a().n()) {
            String d = d();
            if (!TextUtils.isEmpty(d)) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("aliab", d);
                try {
                    AppMonitor.setGlobalProperty("aliab", d);
                } catch (Throwable th) {
                    ogh.h("TrackServiceImpl", "setGlobalProperty fail", th);
                }
            }
        }
    }

    public final void y(TrackId trackId, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e55d7a7", new Object[]{this, trackId, obj});
            return;
        }
        String a2 = n.j().n().a(trackId, 2001, UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
        UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, a2);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3 A[RETURN] */
    @Override // tb.nau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(com.alibaba.ut.abtest.track.TrackId r8, int r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pau.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0023
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r7
            r9[r0] = r8
            r8 = 2
            r9[r8] = r3
            r8 = 3
            r9[r8] = r10
            java.lang.String r8 = "71f0da32"
            java.lang.Object r8 = r2.ipc$dispatch(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0023:
            java.lang.String r8 = r8.getAbTrackId()
            r2 = 0
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = "utparam-cnt"
            java.lang.Object r10 = r10.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x004d
            java.lang.String r9 = r7.o(r10, r9)
            tb.pau$a r10 = new tb.pau$a
            r10.<init>(r7)
            java.lang.reflect.Type r10 = r10.getType()
            java.lang.Object r9 = tb.uwf.b(r9, r10)
            java.util.Map r9 = (java.util.Map) r9
            goto L_0x004e
        L_0x004d:
            r9 = r2
        L_0x004e:
            java.lang.String r10 = "utabtest"
            if (r9 == 0) goto L_0x00a0
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00a0
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x00a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\\."
            java.lang.String[] r8 = r8.split(r4)
            int r4 = r8.length
        L_0x0071:
            if (r1 >= r4) goto L_0x0085
            r5 = r8[r1]
            boolean r6 = r9.contains(r5)
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "."
            r3.append(r6)
            r3.append(r5)
        L_0x0083:
            int r1 = r1 + r0
            goto L_0x0071
        L_0x0085:
            int r8 = r3.length()
            if (r8 <= 0) goto L_0x009f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.String r9 = r3.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L_0x00a0
        L_0x009f:
            return r2
        L_0x00a0:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x00b3
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r9.put(r10, r8)
            java.lang.String r8 = tb.uwf.f(r9)
            return r8
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pau.a(com.alibaba.ut.abtest.track.TrackId, int, java.util.Map):java.lang.String");
    }

    @Override // tb.nau
    public boolean e(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286e2d8d", new Object[]{this, str, map, obj})).booleanValue();
        }
        List<ExperimentGroup> s = s(str);
        if (s == null || s.isEmpty()) {
            return false;
        }
        do8 do8Var = new do8();
        for (ExperimentGroup experimentGroup : s) {
            ExperimentV5 n = go8.n(experimentGroup);
            if (n != null) {
                do8Var.a(n);
            }
        }
        j(do8Var, obj);
        g(do8Var);
        b(do8Var, map, null);
        if (ogh.c()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (ExperimentGroup experimentGroup2 : s) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("、");
                }
                stringBuffer.append(experimentGroup2.getId());
            }
            ogh.f("TrackServiceImpl", "【服务端实验】添加埋点规则成功，实验分组：" + ((Object) stringBuffer));
        }
        return true;
    }

    @Override // tb.nau
    public boolean f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a5e39c", new Object[]{this, str, obj})).booleanValue();
        }
        List<ExperimentGroup> s = s(str);
        if (s == null || s.isEmpty()) {
            return false;
        }
        do8 do8Var = new do8();
        for (ExperimentGroup experimentGroup : s) {
            ExperimentV5 n = go8.n(experimentGroup);
            if (n != null) {
                do8Var.a(n);
            }
        }
        c(do8Var, obj);
        g(do8Var);
        b(do8Var, null, null);
        if (ogh.c()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (ExperimentGroup experimentGroup2 : s) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("、");
                }
                stringBuffer.append(experimentGroup2.getId());
            }
            ogh.f("TrackServiceImpl", "【服务端实验】添加埋点规则成功，实验分组：" + ((Object) stringBuffer));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8 A[Catch: all -> 0x0087, LOOP:1: B:54:0x00f6->B:55:0x00f8, LOOP_END, TryCatch #1 {all -> 0x0087, blocks: (B:19:0x0068, B:21:0x006e, B:24:0x0080, B:27:0x008a, B:29:0x0098, B:31:0x00a6, B:32:0x00ac, B:34:0x00b2, B:35:0x00bb, B:39:0x00c4, B:40:0x00ca, B:42:0x00d0, B:45:0x00d8, B:47:0x00de, B:49:0x00eb, B:51:0x00f1, B:53:0x00f4, B:55:0x00f8, B:56:0x00ff, B:58:0x010d, B:62:0x0120, B:63:0x0124, B:66:0x0132, B:67:0x0136, B:69:0x0143, B:70:0x014d, B:72:0x0153, B:74:0x015f, B:77:0x0166, B:78:0x016a, B:80:0x0170, B:82:0x017c, B:84:0x0186, B:86:0x018c, B:88:0x0196, B:90:0x01a7), top: B:98:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #1 {all -> 0x0087, blocks: (B:19:0x0068, B:21:0x006e, B:24:0x0080, B:27:0x008a, B:29:0x0098, B:31:0x00a6, B:32:0x00ac, B:34:0x00b2, B:35:0x00bb, B:39:0x00c4, B:40:0x00ca, B:42:0x00d0, B:45:0x00d8, B:47:0x00de, B:49:0x00eb, B:51:0x00f1, B:53:0x00f4, B:55:0x00f8, B:56:0x00ff, B:58:0x010d, B:62:0x0120, B:63:0x0124, B:66:0x0132, B:67:0x0136, B:69:0x0143, B:70:0x014d, B:72:0x0153, B:74:0x015f, B:77:0x0166, B:78:0x016a, B:80:0x0170, B:82:0x017c, B:84:0x0186, B:86:0x018c, B:88:0x0196, B:90:0x01a7), top: B:98:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    @Override // tb.nau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ut.abtest.track.TrackId i(java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pau.i(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.alibaba.ut.abtest.track.TrackId");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    @Override // tb.nau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(tb.do8 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pau.c(tb.do8, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    @Override // tb.nau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.do8 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pau.j(tb.do8, java.lang.Object):void");
    }
}
