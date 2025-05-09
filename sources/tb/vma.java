package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809654);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e28cada4", new Object[]{str});
        }
        try {
            if (!zjn.k(str)) {
                return th0.a();
            }
            return cxw.a("gul_edge_user_state.alinn", "version");
        } catch (Exception unused) {
            return "";
        }
    }
}
