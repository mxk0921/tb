package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qf3<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Class<? extends qqc<T>>> f26715a = new LinkedHashMap();
    public Map<String, Map<String, T>> b = new LinkedHashMap();

    static {
        t2o.a(144703570);
    }

    public final T a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3b2e03e1", new Object[]{this, str, str2});
        }
        ckf.g(str, "key");
        ckf.g(str2, "category");
        return b(str2).get(str);
    }

    public final Map<String, T> b(String str) {
        Class cls;
        if (!this.b.containsKey(str) && (cls = (Class) ((LinkedHashMap) this.f26715a).get(str)) != null) {
            try {
                this.b.put(str, a.t(((qqc) cls.newInstance()).a()));
                xhv xhvVar = xhv.INSTANCE;
            } catch (Exception e) {
                Log.e("NsCenter", "ms map build exp : " + e);
            }
        }
        Map<String, T> map = (Map) ((LinkedHashMap) this.b).get(str);
        return map != null ? map : new LinkedHashMap();
    }

    public final List<Pair<String, T>> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5eb2e53", new Object[]{this, str});
        }
        ckf.g(str, "category");
        return x3i.u(b(str));
    }

    public final void d(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c9f386", new Object[]{this, str, str2, t});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "category");
        ckf.g(t, "value");
        Map<String, T> b = b(str2);
        b.put(str, t);
        this.b.put(str2, b);
    }

    public final void e(String str, Class<? extends qqc<T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5d91fe", new Object[]{this, str, cls});
            return;
        }
        ckf.g(str, "category");
        ckf.g(cls, "mapBuilder");
        this.f26715a.put(str, cls);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.b = new LinkedHashMap();
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8699358", new Object[]{this, str});
            return;
        }
        ckf.g(str, "category");
        this.b.remove(str);
    }
}
