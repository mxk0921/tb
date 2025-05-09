package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zoi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f32911a = new ConcurrentHashMap();
    public static final AtomicInteger b = new AtomicInteger(0);

    static {
        t2o.a(912261363);
    }

    public static <T extends dtc> int a(Class<T> cls) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("251df155", new Object[]{cls})).intValue();
        }
        String name = cls.getName();
        Map<String, Integer> map = f32911a;
        synchronized (map) {
            try {
                Integer num = (Integer) ((ConcurrentHashMap) map).get(name);
                if (num == null) {
                    num = Integer.valueOf(b.getAndIncrement());
                    ((ConcurrentHashMap) map).put(name, num);
                }
                intValue = num.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }
}
