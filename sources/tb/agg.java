package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class agg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001966);
    }

    public static hj8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("89d002cd", new Object[0]);
        }
        ij8 b = hj8.b();
        b.b(false);
        b.c(true);
        b.d(false);
        return b.a();
    }
}
