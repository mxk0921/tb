package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b3i<T> implements mjn<Object, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f16156a;
    public final String b;

    static {
        t2o.a(1002438671);
    }

    public b3i(Map<String, Object> map, String str) {
        ckf.g(map, "map");
        ckf.g(str, "key");
        this.f16156a = map;
        this.b = str;
    }

    @Override // tb.mjn
    public void a(Object obj, a0g<?> a0gVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c500cbbd", new Object[]{this, obj, a0gVar, t});
            return;
        }
        ckf.g(a0gVar, "property");
        this.f16156a.put(this.b, t);
    }

    @Override // tb.mjn
    public T b(Object obj, a0g<?> a0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("591fe725", new Object[]{this, obj, a0gVar});
        }
        ckf.g(a0gVar, "property");
        T t = (T) this.f16156a.get(this.b);
        if (t == null) {
            return null;
        }
        return t;
    }
}
