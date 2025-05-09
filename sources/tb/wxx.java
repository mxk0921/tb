package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097397);
    }

    public static int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{new Integer(i), str})).intValue();
        }
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static <T> T b(T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a12221e4", new Object[]{t, str});
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean c(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
