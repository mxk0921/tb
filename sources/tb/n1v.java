package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static n1v f24457a = null;

    static {
        t2o.a(962593266);
    }

    public static n1v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1v) ipChange.ipc$dispatch("a6d201e4", new Object[0]);
        }
        if (f24457a == null) {
            synchronized (n1v.class) {
                try {
                    if (f24457a == null) {
                        f24457a = new n1v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24457a;
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else if (map != null) {
            try {
                if (q2v.d().g(map)) {
                    efh.a(map);
                } else {
                    nhh.r("log discard", "aLogMap", map);
                }
            } catch (Throwable th) {
                nhh.h(null, th, new Object[0]);
            }
        }
    }
}
