package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIKVStoreage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29330a = "";

    static {
        t2o.a(404750632);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afb69223", new Object[0]);
        }
        return f29330a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1d9624", new Object[0]);
            return;
        }
        try {
            DAIKVStoreage.put("BehaviX", "periodSessionId", f29330a);
        } catch (Exception e) {
            q82.f("setSessionTimestamp", null, null, e);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159d2f29", new Object[0]);
            return;
        }
        f29330a = System.currentTimeMillis() + "";
    }
}
