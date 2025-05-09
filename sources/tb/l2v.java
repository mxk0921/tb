package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f23073a = 0;
    public static long b = 0;

    static {
        t2o.a(962593177);
    }

    public static long getUtPvid() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54149951", new Object[0])).longValue();
        }
        synchronized (l2v.class) {
            j = f23073a;
        }
        return j;
    }

    public static void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[0]);
            return;
        }
        synchronized (l2v.class) {
            f23073a++;
        }
    }

    public static Map<String, String> processH5PagePvid(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdb744aa", new Object[]{new Integer(i), map});
        }
        if (i != 2001) {
            return map;
        }
        if (map == null) {
            return null;
        }
        synchronized (l2v.class) {
            long j = f23073a + 1;
            f23073a = j;
            map.put("utpvid", String.valueOf(j));
            map.put("utpvid-b", String.valueOf(b));
            b = f23073a;
        }
        return map;
    }

    public static Map<String, String> processOtherPvid(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61ed91c0", new Object[]{new Integer(i), map});
        }
        if (map == null) {
            return null;
        }
        if (!(i == 19999 || i == 1010 || vzu.getInstance().isInForeground())) {
            map.put("utbg", "1");
        }
        if (i == 2001) {
            return map;
        }
        synchronized (l2v.class) {
            try {
                if (i != 19999) {
                    map.put("utpvid", String.valueOf(f23073a));
                    map.remove("utpvid-b");
                } else {
                    map.remove("utpvid");
                    map.remove("utpvid-b");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static Map<String, String> processPagePvid(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2f335954", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        synchronized (l2v.class) {
            map.put("utpvid", String.valueOf(f23073a));
            map.put("utpvid-b", String.valueOf(b));
            b = f23073a;
        }
        return map;
    }
}
