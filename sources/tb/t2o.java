package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.DaemonWorker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Integer> f28440a = new ConcurrentHashMap();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final int[] c = new int[DaemonWorker.MIN_WORK_INTERVAL];

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7abda", new Object[]{new Integer(i)});
            return;
        }
        try {
            int incrementAndGet = b.incrementAndGet();
            if (incrementAndGet < 120000) {
                c[incrementAndGet] = i;
                StringBuilder sb = new StringBuilder("addClassCallTime[");
                sb.append(incrementAndGet);
                sb.append("]=");
                sb.append(i);
            } else {
                new StringBuilder("addClassCallTime failed, t >= ALL_CLASS_COUNT").append(i);
            }
        } catch (Throwable th) {
            Log.e("CodeTrack.ReportUtil", "addClassCallTime ...", th);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21a5dc0d", new Object[0]);
        }
        try {
            String c2 = c();
            Log.e("CodeTrack.ReportUtil", "dump coverageResult complete,  length=" + c2.length());
            return c2;
        } catch (Throwable th) {
            AppMonitor.Alarm.commitFail(t71.MODULE_NAME, t71.MODULE_POINT_EXCEPTION, "outputCallTime", th.toString());
            return null;
        }
    }

    public static String c() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0f96ae7", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = f28440a;
        if (((ConcurrentHashMap) map).size() > 0) {
            for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                sb.append((Integer) entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append("\n");
            }
        } else {
            for (int i : c) {
                if (i != 0) {
                    sb.append(i);
                    sb.append(":1\n");
                }
            }
        }
        return sb.toString();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0fee4a8", new Object[0]);
        } else {
            ((ConcurrentHashMap) f28440a).clear();
        }
    }
}
