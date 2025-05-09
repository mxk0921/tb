package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ckr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_DEVICE = 1;
    public static final int LOW_DEVICE = 3;
    public static final int MIDDLE_DEVICE = 2;
    public static final int UNKNOWN_DEVICE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static lp0.e f17118a;

    static {
        t2o.a(310378911);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (f17118a == null) {
            f17118a = lp0.d().f();
        }
        lp0.e eVar = f17118a;
        if (eVar != null) {
            return eVar.f23479a;
        }
        return -1;
    }
}
