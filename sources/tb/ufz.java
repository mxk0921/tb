package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ufz<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f6z<K, V> f29351a;
    public final Map<String, f6z<K, V>> b = new LinkedHashMap();

    static {
        t2o.a(598737237);
    }

    public ufz(int i, Map<String, Integer> map, a2a<? super Boolean, ? super K, ? super V, ? super V, ? super String, xhv> a2aVar) {
        ckf.g(map, "highPriorityInfo");
        this.f29351a = new f6z<>(i, a2aVar, null);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            this.b.put(key, new f6z<>(entry.getValue().intValue(), a2aVar, key));
        }
    }

    public final V a(String str, K k) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bb95e40f", new Object[]{this, str, k});
        }
        ckf.g(str, "businessId");
        f6z f6zVar = (f6z) ((LinkedHashMap) this.b).get(str);
        if (f6zVar == null) {
            v = null;
        } else {
            v = f6zVar.get(k);
        }
        if (v == null) {
            return this.f29351a.get(k);
        }
        return v;
    }

    public final void b(String str, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625e1918", new Object[]{this, str, k, v});
            return;
        }
        ckf.g(str, "businessId");
        f6z f6zVar = (f6z) ((LinkedHashMap) this.b).get(str);
        if (f6zVar != null) {
            f6zVar.put(k, v);
        } else {
            this.f29351a.put(k, v);
        }
    }
}
