package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u0r<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, Object> f29065a = new ConcurrentHashMap();

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, t})).booleanValue();
        }
        return ((ConcurrentHashMap) this.f29065a).containsKey(t);
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ade4719", new Object[]{this, t})).booleanValue();
        }
        return c(t, false);
    }

    public boolean c(T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{this, t, new Boolean(z)})).booleanValue();
        }
        Object obj = ((ConcurrentHashMap) this.f29065a).get(t);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public Map<T, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
        }
        return this.f29065a;
    }

    public Set<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.f29065a).keySet();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof u0r) {
            return ((ConcurrentHashMap) this.f29065a).equals(((u0r) obj).d());
        }
        return false;
    }

    public void f(T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360f65ce", new Object[]{this, t, obj});
        } else {
            ((ConcurrentHashMap) this.f29065a).put(t, obj);
        }
    }

    public void g(T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3084e858", new Object[]{this, t, new Boolean(z)});
        } else {
            ((ConcurrentHashMap) this.f29065a).put(t, Boolean.valueOf(z));
        }
    }
}
