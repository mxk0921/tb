package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qe7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pe7 implements IDetailCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26042a;
    public final oe7 c;
    public boolean d = false;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean f = true;
    public volatile List<DetailCacheData> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<DetailCacheData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(pe7 pe7Var) {
        }

        /* renamed from: a */
        public int compare(DetailCacheData detailCacheData, DetailCacheData detailCacheData2) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35c4437f", new Object[]{this, detailCacheData, detailCacheData2})).intValue();
            }
            if (detailCacheData2 != null) {
                i = detailCacheData2.calcHealthyScore();
            } else {
                i = 0;
            }
            if (detailCacheData != null) {
                i2 = detailCacheData.calcHealthyScore();
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Comparator<DetailCacheData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(pe7 pe7Var) {
        }

        /* renamed from: a */
        public int compare(DetailCacheData detailCacheData, DetailCacheData detailCacheData2) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35c4437f", new Object[]{this, detailCacheData, detailCacheData2})).intValue();
            }
            if (detailCacheData2 != null) {
                i = detailCacheData2.calcHealthyScore();
            } else {
                i = 0;
            }
            if (detailCacheData != null) {
                i2 = detailCacheData.calcHealthyScore();
            }
            return i - i2;
        }
    }

    static {
        t2o.a(468714634);
        t2o.a(468714642);
    }

    public pe7(String str, oe7 oe7Var) {
        this.f26042a = str;
        this.c = oe7Var;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a62b43", new Object[]{this, str});
            return;
        }
        r(">>>>deleteByContentId：" + str + "; " + q());
        if (!TextUtils.isEmpty(str)) {
            Iterator<DetailCacheData> it = this.b.iterator();
            DetailCacheData detailCacheData = null;
            while (it.hasNext()) {
                DetailCacheData next = it.next();
                if (next != null && str.equals(next.contentId)) {
                    it.remove();
                    detailCacheData = next;
                }
            }
            if (detailCacheData != null) {
                s();
                t(detailCacheData);
            }
            re7.g(str);
            r(" contentid：" + str + "; remove=" + detailCacheData);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public boolean b(String str, String str2, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2b0934", new Object[]{this, str, str2, new Integer(i), new Long(j)})).booleanValue();
        }
        r(">>>>markVideoHasDownload... contentid：" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        h();
        boolean z = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            DetailCacheData detailCacheData = this.b.get(i2);
            if (detailCacheData != null && str.equals(detailCacheData.contentId)) {
                detailCacheData.setPlayerCacheKey(str2);
                detailCacheData.hasVideoDownloadTime = j;
                detailCacheData.hasVideoDownloadSize = i;
                detailCacheData.checkUpdateHasVideoCacheOrNotForce();
                z = true;
            }
        }
        if (z) {
            s();
        }
        return z;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baa9487", new Object[]{this});
        } else {
            j(true);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public List<DetailCacheData> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b722a16", new Object[]{this});
        }
        h();
        return this.b;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public DetailCacheData e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("d3ef36e7", new Object[]{this});
        }
        if (!aps.u()) {
            return p();
        }
        r(">>>>getNeedCachedData()," + q());
        h();
        long j = 0L;
        DetailCacheData detailCacheData = null;
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            DetailCacheData detailCacheData2 = this.b.get(i2);
            if (detailCacheData2 != null) {
                boolean checkUpdateValidOrNot = detailCacheData2.checkUpdateValidOrNot();
                boolean A = cnm.A(detailCacheData2.getVideoResourceJsonObject());
                r("getNeedCachedData(), --- i=" + i2 + "; contentId=" + detailCacheData2.contentId + ";isValid=" + checkUpdateValidOrNot + ";hasVideoCached=" + A + "; cachetime=" + detailCacheData2.hasVideoDownloadTime + ";hasDownLoadError=" + detailCacheData2.hasDownLoadError);
                if (checkUpdateValidOrNot && A) {
                    i++;
                    j = Math.max(j, detailCacheData2.hasVideoDownloadTime);
                }
                if (checkUpdateValidOrNot && !A && !detailCacheData2.hasDownLoadError && detailCacheData == null) {
                    detailCacheData = detailCacheData2;
                }
            }
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp() - j;
        if (i < 2 || currentTimeStamp >= xg4.DEFAULT_MAX_AGE || currentTimeStamp <= 0) {
            r("getNeedCachedData(), bestCount=" + i + " spendTime=" + currentTimeStamp + "  需缓存. validNoCacheData：" + detailCacheData);
            return detailCacheData;
        }
        r("getNeedCachedData(), 已缓存视频满足策略，无需缓存, bestCount=" + i + " spendTime=" + currentTimeStamp);
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public DetailCacheData f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("6d2c8338", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        h();
        if (sz3.d(this.b)) {
            for (DetailCacheData detailCacheData : this.b) {
                if (str.equals(detailCacheData.contentId)) {
                    return detailCacheData;
                }
            }
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public DetailCacheData g(Map<String, Object> map) {
        List list;
        boolean A;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("3d71499e", new Object[]{this, map});
        }
        r(">>>>get()," + q());
        String str = q() + "_";
        h();
        int size = this.b.size();
        List list2 = this.b;
        if (aps.i()) {
            list2 = new ArrayList(this.b);
            Collections.reverse(list2);
        }
        DetailCacheData detailCacheData = null;
        long j = 0;
        long j2 = 0;
        DetailCacheData detailCacheData2 = null;
        long j3 = 0;
        while (i < list2.size()) {
            DetailCacheData detailCacheData3 = (DetailCacheData) list2.get(i);
            if (detailCacheData3 == null) {
                list = list2;
                detailCacheData2 = detailCacheData2;
                detailCacheData = detailCacheData;
            } else {
                j3++;
                long uptimeMillis = SystemClock.uptimeMillis();
                list = list2;
                boolean checkUpdateValidOrNot = detailCacheData3.checkUpdateValidOrNot();
                long uptimeMillis2 = j + (SystemClock.uptimeMillis() - uptimeMillis);
                long uptimeMillis3 = SystemClock.uptimeMillis();
                if (aps.u()) {
                    A = detailCacheData3.checkUpdateHasVideoCacheOrNot();
                } else {
                    A = cnm.A(detailCacheData3.getVideoResourceJsonObject());
                }
                long uptimeMillis4 = j2 + (SystemClock.uptimeMillis() - uptimeMillis3);
                detailCacheData3.isValid = checkUpdateValidOrNot;
                detailCacheData3.hasVideoCached = A;
                r("get(), --- i=" + i + "; contentId=" + detailCacheData3.contentId + ";isValid=" + checkUpdateValidOrNot + ";hasVideoCached=" + A);
                if (!checkUpdateValidOrNot || !A) {
                    if (!checkUpdateValidOrNot || detailCacheData != null) {
                        detailCacheData = detailCacheData;
                    } else {
                        detailCacheData = detailCacheData3;
                    }
                    if (checkUpdateValidOrNot || detailCacheData2 != null) {
                        detailCacheData2 = detailCacheData2;
                    } else {
                        detailCacheData2 = detailCacheData3;
                    }
                    j2 = uptimeMillis4;
                    j = uptimeMillis2;
                } else {
                    if (map != null) {
                        map.put(str + "checkCount", Long.valueOf(j3));
                        map.put(str + "cacheListSize", Integer.valueOf(size));
                        map.put(str + "checkValidCostTimeSUM", Long.valueOf(uptimeMillis2));
                        map.put(str + "checkVideoCacheCostTimeSUM", Long.valueOf(uptimeMillis4));
                    }
                    return detailCacheData3;
                }
            }
            i++;
            list2 = list;
        }
        if (map != null) {
            map.put(str + "checkCount", Long.valueOf(j3));
            map.put(str + "cacheListSize", Integer.valueOf(size));
            map.put(str + "checkValidCostTimeSUM", Long.valueOf(j));
            map.put(str + "checkVideoCacheCostTimeSUM", Long.valueOf(j2));
        }
        if (detailCacheData != null) {
            return detailCacheData;
        }
        return detailCacheData2;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81cfef5", new Object[]{this});
        } else if (aps.e()) {
            j(false);
        } else if (!this.e.get()) {
            this.b = i();
            this.e.set(true);
        }
    }

    public final List<DetailCacheData> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50c61eb5", new Object[]{this});
        }
        r("checkDisk2Memory,start");
        List<DetailCacheData> c = re7.c(o());
        if (!sz3.a(c)) {
            this.d = true;
            r("checkDisk2Memory, 从协议3.0取数据:" + c.size());
            return c;
        }
        ArrayList arrayList = new ArrayList();
        List<String> k = k();
        if (sz3.d(k)) {
            for (String str : k) {
                DetailCacheData l = l(m(str));
                if (l != null) {
                    arrayList.add(l);
                }
            }
            if (sz3.d(arrayList)) {
                r("checkDisk2Memory, 从协议2.0取数据:" + arrayList.size());
                return arrayList;
            }
        }
        DetailCacheData l2 = l(q());
        if (l2 != null) {
            arrayList.add(l2);
        }
        r("checkDisk2Memory, 从协议1.0取数据:" + arrayList.size());
        return arrayList;
    }

    public final List<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3acd86e9", new Object[]{this});
        }
        try {
            Object a2 = ggs.a(n());
            if (a2 == null) {
                return null;
            }
            return JSON.parseArray(JSON.toJSONString(a2), String.class);
        } catch (Throwable th) {
            r("contentIdsDisk2Memory error:" + th.getMessage());
            th.printStackTrace();
            return null;
        }
    }

    public final DetailCacheData l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("700c3678", new Object[]{this, str});
        }
        DetailCacheData detailCacheData = null;
        try {
            Map z = nwv.z(ggs.a(str), null);
            if (!sz3.b(z)) {
                detailCacheData = (DetailCacheData) JSON.toJavaObject((JSONObject) z, DetailCacheData.class);
            }
        } catch (Throwable th) {
            r("getCacheDataFromDisk, cacheKey=" + str + ", error=" + th.getMessage());
            th.printStackTrace();
        }
        r("getCacheDataFromDisk, cacheKey=" + str + ", data=" + detailCacheData);
        return detailCacheData;
    }

    public final String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd12dd05", new Object[]{this, str});
        }
        return q() + "_" + str;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aca1e567", new Object[]{this});
        }
        return q() + "_contentIds";
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1148f9b", new Object[]{this});
        }
        return q() + "_whole_list";
    }

    public final DetailCacheData p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("34e62270", new Object[]{this});
        }
        ir9.b("DetailCacheImpl", "[cachevideo]getNeedCachedData()," + q());
        h();
        DetailCacheData detailCacheData = null;
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            DetailCacheData detailCacheData2 = this.b.get(i2);
            if (detailCacheData2 != null) {
                boolean checkUpdateValidOrNot = detailCacheData2.checkUpdateValidOrNot();
                boolean checkUpdateHasVideoCacheOrNot = detailCacheData2.checkUpdateHasVideoCacheOrNot();
                ir9.b("DetailCacheImpl", "[cachevideo]get(), --- i=" + i2 + "; contentId=" + detailCacheData2.contentId + ";isValid=" + checkUpdateValidOrNot + ";hasVideoCached=" + checkUpdateHasVideoCacheOrNot);
                if (checkUpdateValidOrNot && checkUpdateHasVideoCacheOrNot) {
                    i++;
                }
                if (checkUpdateValidOrNot && !checkUpdateHasVideoCacheOrNot && detailCacheData == null) {
                    detailCacheData = detailCacheData2;
                }
                if (i >= 2) {
                    ir9.b("DetailCacheImpl", "[cachevideo]getNeedCachedData(), 已缓存视频满足策略，无需缓存");
                    return null;
                }
            }
        }
        ir9.b("DetailCacheImpl", "[cachevideo]getNeedCachedData(), 需缓存 validNoCacheData：" + detailCacheData);
        return detailCacheData;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.f26042a;
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        ir9.b("DetailCacheImpl", "[cachevideo][" + q() + "] :" + str);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d437df5", new Object[]{this});
            return;
        }
        r("memory2disk...");
        ggs.e(o(), JSON.toJSON(this.b));
        re7.h(this.b);
        y();
    }

    public final void t(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa527db", new Object[]{this, detailCacheData});
            return;
        }
        oe7 oe7Var = this.c;
        if (oe7Var != null) {
            ((qe7.b) oe7Var).a(detailCacheData);
        }
    }

    public final void u(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716706d", new Object[]{this, detailCacheData});
            return;
        }
        oe7 oe7Var = this.c;
        if (oe7Var != null) {
            ((qe7.b) oe7Var).b(detailCacheData);
        }
    }

    public final void v(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ad76db", new Object[]{this, list});
        } else if (list != null) {
            r(">>>>save(), start, save, need save srcCacheDataList.size=" + list.size());
            h();
            ArrayList arrayList = new ArrayList(list.size());
            for (DetailCacheData detailCacheData : list) {
                if (!this.b.contains(detailCacheData)) {
                    detailCacheData.setSceneName(q());
                    arrayList.add(detailCacheData);
                }
            }
            if (arrayList.size() <= 0) {
                r("---save() 无新数据，直接return");
                return;
            }
            int size = (this.b.size() + arrayList.size()) - 5;
            if (size > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < this.b.size(); i++) {
                    DetailCacheData detailCacheData2 = this.b.get(i);
                    if (detailCacheData2 != null) {
                        boolean checkUpdateValidOrNot = detailCacheData2.checkUpdateValidOrNot();
                        boolean checkUpdateHasVideoCacheOrNot = detailCacheData2.checkUpdateHasVideoCacheOrNot();
                        if (checkUpdateValidOrNot && checkUpdateHasVideoCacheOrNot) {
                            arrayList2.add(detailCacheData2);
                            r("------ 老的 未过期&有缓存的， cacheData=" + detailCacheData2);
                        }
                    }
                }
                int max = Math.max(this.b.size() - size, Math.min(arrayList2.size(), 2));
                Collections.sort(this.b, new b(this));
                int min = Math.min(max, this.b.size());
                if (min < this.b.size()) {
                    for (DetailCacheData detailCacheData3 : this.b.subList(min, this.b.size())) {
                        re7.g(detailCacheData3.contentId);
                        t(detailCacheData3);
                    }
                }
                this.b = this.b.subList(0, min);
                int size2 = this.b.size();
                for (int i2 = 0; i2 < 5 - size2 && i2 < arrayList.size(); i2++) {
                    DetailCacheData detailCacheData4 = (DetailCacheData) arrayList.get(i2);
                    if (detailCacheData4 != null) {
                        this.b.add(detailCacheData4);
                        u(detailCacheData4);
                        r("------ 保存新的 cacheData=" + detailCacheData4);
                    }
                }
            } else {
                this.b.addAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u((DetailCacheData) it.next());
                }
            }
            s();
        }
    }

    public final void w(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602cf1e2", new Object[]{this, list});
        } else if (list != null) {
            ir9.b("DetailCacheImpl", "[cachevideo]save, start, save, need save newCacheDataList.size=" + list.size());
            h();
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < this.b.size(); i++) {
                DetailCacheData detailCacheData = this.b.get(i);
                if (detailCacheData != null) {
                    boolean checkUpdateValidOrNot = detailCacheData.checkUpdateValidOrNot();
                    boolean checkUpdateHasVideoCacheOrNot = detailCacheData.checkUpdateHasVideoCacheOrNot();
                    if (checkUpdateValidOrNot && checkUpdateHasVideoCacheOrNot) {
                        arrayList.add(detailCacheData);
                        ir9.b("DetailCacheImpl", "[cachevideo]save, --- 保留老的 cacheData=" + detailCacheData);
                    }
                }
                if (arrayList.size() >= 2) {
                    break;
                }
            }
            this.b.clear();
            int size = arrayList.size();
            for (int i2 = 0; i2 < 5 - size && i2 < list.size(); i2++) {
                DetailCacheData detailCacheData2 = list.get(i2);
                if (detailCacheData2 != null) {
                    this.b.add(detailCacheData2);
                    ir9.b("DetailCacheImpl", "[cachevideo]save, --- 保存新的 cacheData=" + detailCacheData2);
                }
            }
            this.b.addAll(arrayList);
            s();
        }
    }

    public final void x(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab20155", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            h();
            this.b.clear();
            this.b.add(list.get(0));
            s();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1029a9c6", new Object[]{this});
        } else if (this.d) {
            this.d = false;
            List<String> k = k();
            if (k != null) {
                for (String str : k) {
                    r(" --- 淘汰老的 --- contentId=" + str);
                    ggs.e(m(str), null);
                    re7.g(str);
                }
            }
        }
    }

    public final void j(boolean z) {
        long j;
        long j2;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facff988", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z4 = z || this.f;
        if (!z) {
            this.f = false;
        }
        ryr.b(null, null, "checkDisk2MemoryThreadSafe");
        if (!this.e.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            List<DetailCacheData> i = i();
            j = SystemClock.uptimeMillis() - uptimeMillis;
            j2 = i.size();
            if (this.e.compareAndSet(false, true)) {
                this.b = i;
                z3 = true;
            }
        } else {
            j = 0;
            j2 = 0;
            z2 = false;
        }
        if (z4) {
            ir9.b("DetailCacheImpl", "checkDisk2MemoryThreadSafe load finish，是否来自warmup:" + z + ",有加载数据：" + z2 + "，最终是否使用:" + z3 + ",costTime：" + j + ",listSize：" + j2 + " @" + q());
            StringBuilder sb = new StringBuilder();
            sb.append(q());
            sb.append("_checkDisk2MemoryThreadSafe");
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("doCheckMemory", Boolean.valueOf(z2));
            hashMap.put("useCheckMemory", Boolean.valueOf(z3));
            hashMap.put("costTime", Long.valueOf(j));
            hashMap.put("listSize", Long.valueOf(j2));
            if (!z) {
                ryr.b(null, null, sb2);
                ryr.d(null, null, sb2, hashMap);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void save(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8b4475", new Object[]{this, list});
        } else if (aps.M()) {
            x(list);
        } else if (!aps.u()) {
            w(list);
        } else if (aps.r() || aps.o()) {
            v(list);
        } else if (list != null) {
            r(">>>>save(), start, save, need save newCacheDataList.size=" + list.size());
            h();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.b.size(); i++) {
                DetailCacheData detailCacheData = this.b.get(i);
                if (detailCacheData != null) {
                    boolean checkUpdateValidOrNot = detailCacheData.checkUpdateValidOrNot();
                    boolean checkUpdateHasVideoCacheOrNot = detailCacheData.checkUpdateHasVideoCacheOrNot();
                    if (checkUpdateValidOrNot && checkUpdateHasVideoCacheOrNot) {
                        arrayList.add(detailCacheData);
                        r("save, --- 老的 未过期&有缓存的， cacheData=" + detailCacheData);
                    }
                }
            }
            Collections.sort(arrayList, new a(this));
            int min = Math.min(arrayList.size(), 2);
            List subList = arrayList.subList(0, min);
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                r("save, --- 最终保留老的 未过期&有缓存的， contentid=" + ((DetailCacheData) it.next()).contentId);
            }
            this.b.clear();
            for (int i2 = 0; i2 < 5 - min && i2 < list.size(); i2++) {
                DetailCacheData detailCacheData2 = list.get(i2);
                if (detailCacheData2 != null) {
                    this.b.add(detailCacheData2);
                    r("save, --- 保存新的 cacheData=" + detailCacheData2);
                }
            }
            this.b.addAll(subList);
            s();
        }
    }
}
