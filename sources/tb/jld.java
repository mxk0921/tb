package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297602);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        if (caa.c() == null || caa.c().getApplicationInfo() == null || (caa.c().getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }
}
