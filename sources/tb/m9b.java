package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23862a;
    public long b;
    public String c;
    public final Map<String, String> d;

    static {
        t2o.a(442499197);
    }

    public m9b() {
        this(null);
    }

    public final boolean a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f23862a = null;
        this.b = 1L;
        this.c = null;
        ((HashMap) this.d).clear();
    }

    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
            return;
        }
        if (map.containsKey(q2q.KEY_SKU_ID)) {
            this.f23862a = map.get(q2q.KEY_SKU_ID);
            map.remove(q2q.KEY_SKU_ID);
        }
        if (map.containsKey("quantity")) {
            try {
                this.b = Long.parseLong(map.get("quantity"));
            } catch (Throwable unused) {
                this.b = 1L;
            }
            map.remove("quantity");
        }
        if (map.containsKey("skuViewText")) {
            map.get("skuViewText");
            map.remove("skuViewText");
        }
        if (map.containsKey("serviceId")) {
            this.c = map.get("serviceId");
        }
        if (!a(map)) {
            this.d.putAll(map);
        }
    }

    public m9b(Map<String, String> map) {
        this.b = 1L;
        this.d = new HashMap();
        if (!a(map)) {
            c(map);
        }
    }
}
