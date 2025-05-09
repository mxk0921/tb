package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ko4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ko4 INSTANCE = new ko4();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, String> f22794a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, String> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();

    static {
        t2o.a(511705170);
        new CopyOnWriteArrayList();
    }

    public final void a(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5f958a", new Object[]{this, num, str});
        } else if (num != null && str != null) {
            b.put(num, str);
        }
    }

    public final void b(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e0deab", new Object[]{this, num, str});
        } else if (num != null && str != null) {
            f22794a.put(num, str);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e82e2b", new Object[]{this});
        } else {
            b.clear();
        }
    }

    public final ConcurrentHashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("ee19aafd", new Object[]{this});
        }
        return d;
    }

    public final String e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("582c600b", new Object[]{this, num});
        }
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return b.get(num);
    }

    public final ConcurrentHashMap<Integer, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("128799d8", new Object[]{this});
        }
        return b;
    }

    public final String g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa8cbd8a", new Object[]{this, num});
        }
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return f22794a.get(num);
    }

    public final ConcurrentHashMap<Integer, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("828c6716", new Object[]{this});
        }
        return f22794a;
    }

    public final ConcurrentHashMap<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("f2541708", new Object[]{this});
        }
        return c;
    }

    public final String j(Integer num) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4289cb1f", new Object[]{this, num});
        }
        if (num == null || num.intValue() <= 0 || (str = f22794a.get(num)) == null) {
            return null;
        }
        return c.get(str);
    }
}
