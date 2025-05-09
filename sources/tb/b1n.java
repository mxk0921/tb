package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f16129a;

    public b1n() {
        this.f16129a = new ConcurrentHashMap<>();
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ea8bce", new Object[]{this, str, obj});
        } else if (str != null && obj != null) {
            this.f16129a.put(str, obj);
        }
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object e = e(str);
        if (e instanceof Boolean) {
            return ((Boolean) e).booleanValue();
        }
        if (e instanceof String) {
            return Boolean.parseBoolean((String) e);
        }
        return z;
    }

    public int c(String str, int i) {
        Object e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            e = e(str);
        } catch (Exception e2) {
            ehh.d(e2);
        }
        if (e instanceof Integer) {
            return ((Integer) e).intValue();
        }
        if (e instanceof String) {
            return Integer.parseInt((String) e);
        }
        return i;
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        Object e = e(str);
        if (e instanceof String) {
            return (String) e;
        }
        if (e != null) {
            return String.valueOf(e);
        }
        return str2;
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b1ed0ca6", new Object[]{this, str});
        }
        return this.f16129a.get(str);
    }

    public b1n(Map<String, Object> map) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.f16129a = concurrentHashMap;
        concurrentHashMap.putAll(map);
    }
}
