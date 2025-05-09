package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691961);
    }

    public static Float a(Map<String, ?> map, String str, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("8f3e18e5", new Object[]{map, str, f});
        }
        if (map == null) {
            return f;
        }
        Object obj = map.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        try {
            return Float.valueOf(Float.parseFloat(String.valueOf(obj)));
        } catch (Exception unused) {
            return f;
        }
    }

    public static <T> T b(Map<String, ?> map, String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6ef25d86", new Object[]{map, str, cls, t});
        }
        if (map == null) {
            return t;
        }
        T t2 = (T) map.get(str);
        if (t2 == null) {
            return t;
        }
        try {
        } catch (Throwable th) {
            ck.g().b("AURAMapValueGetter", "getValue", th.getMessage());
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        return t;
    }
}
