package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdMultiWindowUtil: ";

    static {
        t2o.a(352321697);
    }

    public static boolean a(cxj cxjVar) {
        int N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5767e079", new Object[]{cxjVar})).booleanValue();
        }
        if (cxjVar == null || (N = cxjVar.m().N()) == -1 || System.currentTimeMillis() - cxjVar.k() >= N) {
            return false;
        }
        return true;
    }

    public static boolean b(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc9ae44", new Object[]{cxjVar})).booleanValue();
        }
        if (cxjVar == null) {
            return false;
        }
        cxjVar.z(System.currentTimeMillis());
        return true;
    }
}
