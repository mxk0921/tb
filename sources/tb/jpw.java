package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class jpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jpw b = new jpw();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, Object> f22153a = new ConcurrentHashMap<>();

    static {
        t2o.a(989855845);
    }

    public static jpw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpw) ipChange.ipc$dispatch("94af092f", new Object[0]);
        }
        return b;
    }

    public <T> T a(Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a169e8b5", new Object[]{this, cls});
        }
        if (cls == null || (t = (T) this.f22153a.get(cls)) == null || !cls.isInstance(t)) {
            return null;
        }
        return t;
    }

    public <T> T b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8996c8b7", new Object[]{this, cls});
        }
        T t = (T) a(cls);
        if (t != null) {
            return t;
        }
        throw new RuntimeException("didn't find the necessary adapter for ".concat(cls.getName()));
    }

    public void d(Class<?> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65852f46", new Object[]{this, cls, obj});
        } else if (cls != null && obj != null && !this.f22153a.containsKey(cls)) {
            this.f22153a.put(cls, obj);
        }
    }
}
