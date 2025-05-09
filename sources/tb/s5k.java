package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321965);
    }

    public static float a(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e4095d9", new Object[]{cxjVar})).floatValue();
        }
        if ("vertical".equals(cxjVar.j().R().m)) {
            return cxjVar.j().K().c() - z3w.c(cxjVar);
        }
        return rra.e(cxjVar);
    }

    public static int b(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b9315cb", new Object[]{cxjVar})).intValue();
        }
        if ("vertical".equals(cxjVar.j().R().m)) {
            return -1;
        }
        return rra.g(cxjVar);
    }
}
