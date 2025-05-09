package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f23553a = ".UTSystemConfig" + File.separator + "Global";

    static {
        t2o.a(962592872);
    }

    public static k0m a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0m) ipChange.ipc$dispatch("e1c996a1", new Object[]{context});
        }
        if (context != null) {
            return new k0m(context, f23553a, "Alvin3", false, true);
        }
        return null;
    }

    public static k0m b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0m) ipChange.ipc$dispatch("41c65c0d", new Object[]{context});
        }
        if (context != null) {
            return new k0m(context, f23553a, "UTCommon", false, true);
        }
        return null;
    }
}
