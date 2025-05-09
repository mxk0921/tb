package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ucu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ucu b;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f29299a = new ConcurrentHashMap<>();

    static {
        t2o.a(155189379);
    }

    public static ucu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucu) ipChange.ipc$dispatch("259a14aa", new Object[0]);
        }
        if (b == null) {
            synchronized (ucu.class) {
                try {
                    if (b == null) {
                        b = new ucu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9eee58f4", new Object[]{this, str});
        }
        return this.f29299a.remove(str);
    }

    public void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2438b6b8", new Object[]{this, str, obj});
        } else {
            this.f29299a.put(str, obj);
        }
    }
}
