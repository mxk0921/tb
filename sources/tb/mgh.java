package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138860);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f294d41b", new Object[0])).booleanValue();
        }
        if (ntq.i().m() != null) {
            return ntq.i().m().a();
        }
        return true;
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5534ee4", new Object[]{th});
        } else if (!a() && th != null) {
            th.printStackTrace();
        }
    }
}
