package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class my1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static my1 c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f24382a = Collections.synchronizedMap(new HashMap());
    public final Set<String> b;

    static {
        t2o.a(962593229);
    }

    public my1() {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add("biz_arg1");
        hashSet.add("biz_arg2");
        hashSet.add("biz_arg3");
        hashSet.add("biz_arg4");
        hashSet.add("biz_arg5");
        hashSet.add("biz_arg6");
        hashSet.add("biz_arg7");
        hashSet.add("biz_arg8");
        hashSet.add("biz_arg9");
        hashSet.add("biz_arg10");
        hashSet.add("biz_args");
        hashSet.add("sys_arg1");
        hashSet.add("sys_arg2");
        hashSet.add("sys_arg3");
        hashSet.add("sys_arg4");
        hashSet.add("sys_arg5");
        hashSet.add("sys_args");
    }

    public static my1 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (my1) ipChange.ipc$dispatch("a7380e24", new Object[0]);
        }
        if (c == null) {
            synchronized (my1.class) {
                try {
                    if (c == null) {
                        c = new my1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static String stringNotNull(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1cafc66", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public void putArgFields(Map<String, Object> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e02607", new Object[]{this, map, map2});
            return;
        }
        Map<String, String> map3 = this.f24382a;
        if (map3 != null && map3.size() != 0) {
            try {
                for (Map.Entry<String, String> entry : this.f24382a.entrySet()) {
                    map.put(entry.getValue(), stringNotNull(map2.get(entry.getKey())));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setArgFieldsMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b9080f", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
            this.f24382a.clear();
        } else {
            try {
                this.f24382a.clear();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (((HashSet) this.b).contains(value) && !hsq.f(key)) {
                        this.f24382a.put(key, value);
                    }
                }
            } catch (Throwable unused) {
                this.f24382a.clear();
            }
        }
    }
}
