package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ObjectsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ObjectsCompat() {
    }

    public static boolean equals(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        return Objects.equals(obj, obj2);
    }

    public static int hash(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f836026f", new Object[]{objArr})).intValue();
        }
        return Objects.hash(objArr);
    }

    public static int hashCode(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7099d671", new Object[]{obj})).intValue();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("56c1f540", new Object[]{t});
        }
        t.getClass();
        return t;
    }

    public static String toString(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba26eba7", new Object[]{obj, str});
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static <T> T requireNonNull(T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d0863136", new Object[]{t, str});
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
