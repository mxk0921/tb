package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, k5o> f23122a = new ConcurrentHashMap<>();

    static {
        t2o.a(589299731);
    }

    public static k5o a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5o) ipChange.ipc$dispatch("8b56a4b2", new Object[]{str});
        }
        ConcurrentHashMap<String, k5o> concurrentHashMap = f23122a;
        k5o k5oVar = concurrentHashMap.get(str);
        if (k5oVar == null) {
            synchronized (l5o.class) {
                try {
                    k5oVar = concurrentHashMap.get(str);
                    if (k5oVar == null) {
                        k5oVar = new k5o();
                        concurrentHashMap.put(str, k5oVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k5oVar;
    }
}
