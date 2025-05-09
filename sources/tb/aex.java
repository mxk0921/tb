package tb;

import android.net.wifi.ScanResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, Set<String>> f15700a = new HashMap();
    public Set<String> b;
    public long c;

    static {
        t2o.a(789577792);
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2706b162", new Object[]{this});
        }
        return this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public void c(List<ScanResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e3d49", new Object[]{this, list});
            return;
        }
        this.c = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (ScanResult scanResult : list) {
            hashSet.add(scanResult.BSSID);
            hashMap.put(scanResult.BSSID, Integer.valueOf(scanResult.level));
        }
        HashSet hashSet2 = new HashSet();
        for (Long l : ((HashMap) this.f15700a).keySet()) {
            if (this.c - l.longValue() > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
                hashSet2.add(l);
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f15700a).remove((Long) it.next());
        }
        ((HashMap) this.f15700a).put(Long.valueOf(this.c), hashSet);
        this.b = hashSet;
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }
}
