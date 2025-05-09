package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.utils.RateLRUCache;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rgn INSTANCE = new rgn();

    /* renamed from: a  reason: collision with root package name */
    public static final RateLRUCache<String, JSONObject> f27365a = new RateLRUCache<>(1, 3);
    public static final HashMap<String, String> b = new HashMap<>();
    public static final HashMap<String, Long> c = new HashMap<>();
    public static final long d;

    static {
        d = 300000L;
        d = n9l.INSTANCE.w() * 60000;
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6708369", new Object[]{this, str})).booleanValue();
        }
        Long l = c.get(str);
        if (l == null || System.currentTimeMillis() - l.longValue() > d) {
            return false;
        }
        return true;
    }

    public final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d423e67d", new Object[]{this, str});
        }
        ckf.g(str, "key");
        RateLRUCache<String, JSONObject> rateLRUCache = f27365a;
        if (rateLRUCache.b(str) != null) {
            if (a(str)) {
                "get cache key = ".concat(str);
                return rateLRUCache.b(str);
            }
            rateLRUCache.d(str);
            c.remove(str);
        }
        c.remove(str);
        return null;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56c26348", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return b.get(str);
    }

    public final void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2a9e3f", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "key");
        ckf.g(jSONObject, "data");
        e(str, jSONObject, "FirstLoad");
    }

    public final void e(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb25649", new Object[]{this, str, jSONObject, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(jSONObject, "data");
        ckf.g(str2, "cacheSource");
        f27365a.c(str, jSONObject);
        b.put(str, str2);
        c.put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
