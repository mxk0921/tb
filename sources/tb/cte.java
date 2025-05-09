package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.model.CandidateDO;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDEX_STORE_NAME = "orange.index";

    /* renamed from: a  reason: collision with root package name */
    public volatile IndexDO f17302a = new IndexDO();
    public Map<String, Set<String>> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.orange.util.a.f(cte.a(cte.this), cte.INDEX_STORE_NAME);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.orange.util.a.f(cte.a(cte.this), cte.INDEX_STORE_NAME);
            }
        }
    }

    static {
        t2o.a(613417053);
    }

    public cte() {
        new HashSet();
    }

    public static /* synthetic */ IndexDO a(cte cteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndexDO) ipChange.ipc$dispatch("3e864b63", new Object[]{cteVar});
        }
        return cteVar.f17302a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8529822", new Object[]{this});
        } else {
            String str = com.taobao.orange.a.TAG;
        }
    }

    public final Map<String, NameSpaceDO> f(List<NameSpaceDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa6e0a51", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (NameSpaceDO nameSpaceDO : list) {
                hashMap.put(nameSpaceDO.name, nameSpaceDO);
            }
        }
        return hashMap;
    }

    public Set<NameSpaceDO> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7c5af4d9", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f17302a.mergedNamespaces);
        return hashSet;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66235568", new Object[]{this});
        }
        if (this.f17302a.appIndexVersion == null) {
            return "0";
        }
        return this.f17302a.appIndexVersion;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64e31501", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f17302a.cdn)) {
            return null;
        }
        return com.taobao.orange.a.p + HttpConstant.SCHEME_SPLIT + this.f17302a.cdn;
    }

    public Set<NameSpaceDO> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("18e16036", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.f17302a.mergedNamespaces) {
            if (nameSpaceDO.highLazy.intValue() == 0) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public IndexDO l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndexDO) ipChange.ipc$dispatch("ccb1768b", new Object[]{this});
        }
        return this.f17302a;
    }

    public Set<NameSpaceDO> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("337dd4fd", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.f17302a.mergedNamespaces) {
            if (nameSpaceDO.highLazy.intValue() != 0) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> o(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cf703870", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.f17302a.mergedNamespaces) {
            if (nameSpaceDO.hasChanged) {
                if ("HIGH".equals(nameSpaceDO.loadLevel)) {
                    hashSet.add(nameSpaceDO);
                } else if (set != null && set.contains(nameSpaceDO.name)) {
                    hashSet.add(nameSpaceDO);
                }
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> p(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c553e3de", new Object[]{this, set});
        }
        Set<String> c2 = jno.c(com.taobao.orange.a.g, OConstant.SP_KEY_USED_LIST, new HashSet());
        c2.add("orange");
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.f17302a.mergedNamespaces) {
            if (nameSpaceDO.hasChanged && (c2.contains(nameSpaceDO.name) || (set != null && set.contains(nameSpaceDO.name)))) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f57fa91", new Object[]{this});
        }
        if (this.f17302a.versionIndexVersion == null) {
            return "0";
        }
        return this.f17302a.versionIndexVersion;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a316dd19", new Object[]{this});
        } else {
            String str = com.taobao.orange.a.TAG;
        }
    }

    public synchronized void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec491687", new Object[]{this});
        } else {
            String str = com.taobao.orange.a.TAG;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IndexDO f17303a;

        public a(IndexDO indexDO) {
            this.f17303a = indexDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<NameSpaceDO> list = this.f17303a.mergedNamespaces;
            int size = list != null ? list.size() : 0;
            int i = this.f17303a.totalCnt;
            if (i <= 0 || size >= i) {
                OLog.e("IndexCache", "persistObject index", "size", Integer.valueOf(size));
                com.taobao.orange.util.a.f(this.f17303a, cte.INDEX_STORE_NAME);
                return;
            }
            OLog.e("IndexCache", "skip persistObject index.", "size", Integer.valueOf(size));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IndexDO f17305a;

        public c(IndexDO indexDO) {
            this.f17305a = indexDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<NameSpaceDO> list = this.f17305a.mergedNamespaces;
            int size = list != null ? list.size() : 0;
            int i = this.f17305a.totalCnt;
            if (i <= 0 || size >= i) {
                OLog.e("IndexCache", "persistObject index", "size", Integer.valueOf(size));
                com.taobao.orange.util.a.f(this.f17305a, cte.INDEX_STORE_NAME);
                return;
            }
            OLog.e("IndexCache", "skip persistObject index.", "size", Integer.valueOf(size));
        }
    }

    public NameSpaceDO m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NameSpaceDO) ipChange.ipc$dispatch("47361335", new Object[]{this, str});
        }
        long nanoTime = System.nanoTime();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (NameSpaceDO nameSpaceDO : this.f17302a.mergedNamespaces) {
            if (str.equals(nameSpaceDO.name)) {
                OLog.d("IndexCache", "time (getNameSpace)", "time: " + String.valueOf((System.nanoTime() - nanoTime) / 1000));
                return nameSpaceDO;
            }
        }
        OLog.d("IndexCache", "time (getNameSpace)", "time: " + String.valueOf((System.nanoTime() - nanoTime) / 1000));
        return null;
    }

    public List<String> b(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("628f7d98", new Object[]{this, indexDO});
        }
        if (com.taobao.orange.a.v > 0) {
            if (!(TextUtils.isEmpty(indexDO.baseVersion) || "0".equals(indexDO.baseVersion))) {
                return e(indexDO);
            }
            OLog.e("IndexCache", "cache", "baseVersion is empty");
        }
        t();
        Map<String, NameSpaceDO> f = f(this.f17302a.mergedNamespaces);
        Map<String, NameSpaceDO> f2 = f(indexDO.mergedNamespaces);
        ArrayList arrayList = new ArrayList(f.keySet());
        arrayList.removeAll(f2.keySet());
        for (Map.Entry<String, NameSpaceDO> entry : f2.entrySet()) {
            NameSpaceDO nameSpaceDO = f.get(entry.getKey());
            NameSpaceDO value = entry.getValue();
            if (nameSpaceDO == null) {
                value.hasChanged = true;
            } else {
                boolean equals = value.equals(nameSpaceDO);
                boolean z = !equals;
                if (!equals && OLog.isPrintLog(2)) {
                    OLog.i("IndexCache", "cache", "compare change NameSpaceDO", ibl.e(value));
                }
                value.hasChanged = z;
            }
        }
        int size = indexDO.mergedNamespaces.size();
        if (com.taobao.orange.a.B && size >= this.f17302a.totalCnt) {
            com.taobao.orange.a.B = false;
            eal.j(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_EXCEPTION_RECOVERY_COUNTS, String.valueOf(size), 1.0d);
            OLog.e("IndexCache", "[cache]indexExceptionCheck success.", "mergedNamespaces", Integer.valueOf(size));
        }
        if (!ibl.b()) {
            this.b = i(indexDO);
        }
        this.f17302a = indexDO;
        u();
        String str = com.taobao.orange.a.TAG;
        fck.g(new b());
        return arrayList;
    }

    public final void c(IndexDO indexDO) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02d83a4", new Object[]{this, indexDO});
            return;
        }
        List<NameSpaceDO> list = indexDO.mergedNamespaces;
        if (list != null && !list.isEmpty()) {
            int size = indexDO.mergedNamespaces.size();
            if (size <= 100) {
                str = "0_100";
            } else if (size <= 200) {
                str = "100_200";
            } else if (size <= 300) {
                str = "200_300";
            } else if (size <= 400) {
                str = "300_400";
            } else {
                str = size <= 500 ? "400_500" : null;
            }
            if (!TextUtils.isEmpty(str)) {
                eal.j(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_NAMESPACE_SIZE_COUNTS, str, 1.0d);
            }
            if (((Boolean) jno.b(com.taobao.orange.a.g, OConstant.SYSKEY_INDEX_CHECK_ENABLE, Boolean.TRUE)).booleanValue() && (i = indexDO.totalCnt) > 0 && size < i && com.taobao.orange.a.f11393a) {
                com.taobao.orange.a.B = true;
                OLog.e("IndexCache", "checkIndexIntact", "mergedNamespaces", Integer.valueOf(size), "totalCnt", Integer.valueOf(indexDO.totalCnt));
            }
        }
    }

    public final List<String> e(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc764513", new Object[]{this, indexDO});
        }
        OLog.e("IndexCache", "diffCache", "diff index, baseVersion = " + indexDO.baseVersion);
        ArrayList arrayList = new ArrayList();
        t();
        Map<String, NameSpaceDO> f = f(this.f17302a.mergedNamespaces);
        Map<String, NameSpaceDO> f2 = f(indexDO.mergedNamespaces);
        List<String> list = indexDO.offlineNamespaces;
        if (list != null && list.size() > 0) {
            for (String str : indexDO.offlineNamespaces) {
                f.remove(str);
            }
            arrayList.addAll(indexDO.offlineNamespaces);
        }
        for (Map.Entry<String, NameSpaceDO> entry : f2.entrySet()) {
            NameSpaceDO nameSpaceDO = f.get(entry.getKey());
            NameSpaceDO value = entry.getValue();
            if (nameSpaceDO == null) {
                value.hasChanged = true;
            } else {
                boolean equals = value.equals(nameSpaceDO);
                boolean z = !equals;
                if (!equals && OLog.isPrintLog(2)) {
                    OLog.i("IndexCache", "diffCache", "compare change NameSpaceDO", ibl.e(value));
                }
                value.hasChanged = z;
            }
        }
        for (Map.Entry<String, NameSpaceDO> entry2 : f.entrySet()) {
            if (!f2.containsKey(entry2.getKey())) {
                f2.put(entry2.getKey(), entry2.getValue());
            }
        }
        indexDO.mergedNamespaces.clear();
        indexDO.mergedNamespaces.addAll(new ArrayList(f2.values()));
        int size = indexDO.mergedNamespaces.size();
        if (com.taobao.orange.a.B && size >= this.f17302a.totalCnt) {
            com.taobao.orange.a.B = false;
            eal.j(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_EXCEPTION_RECOVERY_COUNTS, String.valueOf(size), 1.0d);
            OLog.e("IndexCache", "[diffCache]indexExceptionCheck success.", "mergedNamespaces", Integer.valueOf(size));
        }
        if (!ibl.b()) {
            this.b = i(indexDO);
        }
        this.f17302a = indexDO;
        u();
        String str2 = com.taobao.orange.a.TAG;
        fck.g(new d());
        OLog.e("IndexCache", "diffCache", "success");
        return arrayList;
    }

    public final Map<String, Set<String>> i(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("759f6fb8", new Object[]{this, indexDO});
        }
        if (indexDO == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (NameSpaceDO nameSpaceDO : indexDO.mergedNamespaces) {
            List<CandidateDO> list = nameSpaceDO.candidates;
            if (list != null && !list.isEmpty()) {
                for (CandidateDO candidateDO : nameSpaceDO.candidates) {
                    for (String str : MultiAnalyze.complie(candidateDO.match, false).getKeySet()) {
                        Set set = (Set) hashMap.get(str);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(str, set);
                        }
                        set.add(nameSpaceDO.name);
                    }
                }
            }
        }
        if (OLog.isPrintLog(1)) {
            OLog.d("IndexCache", "getCandidateNamespace", "result", hashMap);
        }
        return hashMap;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        IndexDO indexDO = (IndexDO) com.taobao.orange.util.a.i(INDEX_STORE_NAME);
        if (indexDO != null) {
            if (OLog.isPrintLog(2)) {
                OLog.i("IndexCache", "load", "indexDO", ibl.d(indexDO));
            }
            c(indexDO);
            if (!ibl.b()) {
                this.b = i(indexDO);
            }
            this.f17302a = indexDO;
        } else {
            OLog.w("IndexCache", "load fail", new Object[0]);
            try {
                com.taobao.orange.util.a.b();
            } catch (Throwable th) {
                OLog.e("IndexCache", "load clean cache exception", th, new Object[0]);
            }
        }
        u();
        s();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c050c44b", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("appKey=");
        sb.append(com.taobao.orange.a.h);
        sb.append("&appVersion=");
        sb.append(com.taobao.orange.a.j);
        sb.append("&clientAppIndexVersion=");
        sb.append(h());
        OLog.i("IndexCache", "updateOrangeHeader", "reqOrangeHeaderDiff", sb.toString());
        com.taobao.orange.a.o = sb.toString();
        sb.append("&clientVersionIndexVersion=");
        sb.append(q());
        OLog.i("IndexCache", "updateOrangeHeader", "reqOrangeHeader", sb.toString());
        com.taobao.orange.a.n = sb.toString();
    }
}
