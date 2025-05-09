package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<Map<String, String>> b = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with root package name */
    public int f31041a;

    static {
        t2o.a(768606231);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("710b71f2", new Object[0])).booleanValue();
        }
        if (!UTAnalytics.getInstance().isInit()) {
            return false;
        }
        List<Map<String, String>> list = b;
        if (((CopyOnWriteArrayList) list).isEmpty()) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            UTAnalytics.getInstance().getDefaultTracker().send((Map) it.next());
        }
        vhh.a("ProfileMonitor", "cached ut log sent");
        ((CopyOnWriteArrayList) b).clear();
        return true;
    }

    public static void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66848c93", new Object[]{str, map});
            return;
        }
        try {
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("launch_turbo_pgo", 19999, str, null, null, map);
            if (UTAnalytics.getInstance().isInit()) {
                e();
                UTAnalytics.getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
            } else {
                vhh.a("ProfileMonitor", "ut is not ready, add to cache");
                ((CopyOnWriteArrayList) b).add(uTOriginalCustomHitBuilder.build());
            }
        } catch (Throwable th) {
            vhh.b("ProfileMonitor", "send ut failed for: " + str, th);
        }
    }

    public void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3dfcf57", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        Map<String, String> c = c();
        c.put("pgo_profile_compile_used_time", String.valueOf(j));
        c.put("pgo_profile_compile_times", String.valueOf(i));
        f("pgo_dex2oat_finish", c);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec272c", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> c = c();
        c.put("pgo_profile_compile_times", String.valueOf(i));
        f("pgo_dex2oat_compiling", c);
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96282aaf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pgo_device_manufacturer", Build.MANUFACTURER);
        hashMap.put("pgo_device_model", Build.MODEL);
        hashMap.put("pgo_sdk_int", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("pgo_policy", String.valueOf(this.f31041a));
        return hashMap;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1219093f", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> c = c();
        c.put("pgo_profile_compile_times", String.valueOf(i));
        f("pgo_compile_fail", c);
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7b03a8", new Object[]{this, new Integer(i)});
        } else {
            this.f31041a = i;
        }
    }

    public void h(long j, long j2, long j3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e0349", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Integer(i)});
            return;
        }
        Map<String, String> c = c();
        c.put("pgo_profile_compile_result", "1");
        c.put("pgo_odex_compile_before_size", String.valueOf(j));
        c.put("pgo_odex_compile_after_size", String.valueOf(j2));
        c.put("pgo_profile_compile_used_time", String.valueOf(j3));
        c.put("pgo_profile_compile_times", String.valueOf(i));
        f("pgo_compile_success", c);
    }
}
