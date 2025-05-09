package tb;

import android.os.SystemClock;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ko0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22792a;
    public static final Map<String, String> b;
    public static final AtomicLong c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ko0.a();
            }
        }
    }

    static {
        String str;
        t2o.a(301990098);
        if (EnvironmentSwitcher.a() == 0) {
            str = "202312111115_4962";
        } else {
            str = "202312111152_2049";
        }
        f22792a = str;
        b = new ConcurrentHashMap();
        c = new AtomicLong(0L);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            f();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8cc893", new Object[0]);
        } else {
            dn.h(new a());
        }
    }

    public static Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4597facb", new Object[0]);
        }
        String d = d("style");
        String d2 = d(h9.KEY_POP_CONFIG);
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(d2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("styleABTest", Collections.singletonMap("style", d));
        hashMap.put("popConfigABTest", Collections.singletonMap(h9.KEY_POP_CONFIG, d2));
        return hashMap;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("535ae54f", new Object[]{str});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Map<String, String> map = b;
        if (!((ConcurrentHashMap) map).containsKey(str)) {
            f();
        }
        AtomicLong atomicLong = c;
        if (uptimeMillis - atomicLong.get() > 60000) {
            atomicLong.set(uptimeMillis);
            b();
        }
        return (String) ((ConcurrentHashMap) map).get(str);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99a114dc", new Object[0]);
        }
        if ("true".equals(i0r.j("enableNewStyle", "true"))) {
            return d(h9.KEY_POP_CONFIG);
        }
        return null;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815d02f7", new Object[0]);
            return;
        }
        String str = f22792a;
        String a2 = qf.a("AB_", str, "style", "");
        if (!TextUtils.isEmpty(a2)) {
            ((ConcurrentHashMap) b).put("style", a2);
        }
        String a3 = qf.a("AB_", str, h9.KEY_POP_CONFIG, "");
        if (a3 != null) {
            ((ConcurrentHashMap) b).put(h9.KEY_POP_CONFIG, a3);
            ck.g().d("Cached bucket: ".concat(a3));
        }
    }
}
