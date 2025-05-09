package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150890);
    }

    public static void a(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65694c80", new Object[]{context, new Boolean(z), new Boolean(z2)});
            return;
        }
        z9v u = z9v.u(context);
        u.B("apmClientBeforeNetworkLogicProcess", false, null);
        u.D("apmClientNetwork", null);
        if (z) {
            u.B("apmClientNetwork", false, null);
        }
        u.D("apmClientAfterNetworkLogicProcess", null);
        if (z && z2) {
            u.B("apmClientAfterNetworkLogicProcess", false, null);
            u.D("apmClientUltronProcess", "apmClientAfterNetworkLogicProcess");
            u.B("apmClientUltronProcess", false, null);
        }
    }
}
