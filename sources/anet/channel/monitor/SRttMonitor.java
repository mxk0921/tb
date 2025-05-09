package anet.channel.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SRttMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long UNKNOWN_SRTT = -1;
    private static ConcurrentHashMap<String, Long> srttMap = new ConcurrentHashMap<>();

    static {
        t2o.a(607125679);
    }

    public static long getDomainSRtt(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b092699e", new Object[]{str})).longValue();
        }
        if (str == null || (l = srttMap.get(str)) == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static void putDomainSRtt(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58039c1", new Object[]{str, new Long(j)});
        } else if (str != null) {
            srttMap.put(str, Long.valueOf(j));
        }
    }
}
