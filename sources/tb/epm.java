package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class epm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897897);
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55882632", new Object[]{new Boolean(z), str});
        } else if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("56526bdd", new Object[]{t});
        }
        t.getClass();
        return t;
    }

    public static <T> T c(T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b6a31a93", new Object[]{t, str});
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
