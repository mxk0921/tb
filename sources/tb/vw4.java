package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ydd<String, Integer, Void> f30292a;
    public static final Object b = new Object();
    public static final Map<String, Integer> c = new ConcurrentHashMap();

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71ea4f", new Object[]{str, new Integer(i)});
        } else if (f30292a == null) {
            synchronized (b) {
                try {
                    if (f30292a != null) {
                        f30292a.a(str, Integer.valueOf(i));
                    } else {
                        ((ConcurrentHashMap) c).put(str, Integer.valueOf(i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            f30292a.a(str, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ydd<String, Integer, Void> yddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949b9a08", new Object[]{yddVar});
            return;
        }
        synchronized (b) {
            try {
                f30292a = yddVar;
                Map<String, Integer> map = c;
                if (!((ConcurrentHashMap) map).isEmpty()) {
                    for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                        f30292a.a(entry.getKey(), entry.getValue());
                    }
                    ((ConcurrentHashMap) c).clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
