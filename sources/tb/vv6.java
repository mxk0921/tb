package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321684);
    }

    public static synchronized boolean a() {
        synchronized (vv6.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
            }
            return ((Boolean) hhg.a("isDebuggable", Boolean.FALSE)).booleanValue();
        }
    }
}
