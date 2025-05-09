package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(374341753);
    }

    public static <T> T a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("56526bdd", new Object[]{t});
        }
        t.getClass();
        return t;
    }
}
