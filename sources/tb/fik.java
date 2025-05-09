package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class fik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700136);
    }

    public static boolean a(Boolean bool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5bbd1", new Object[]{bool, new Boolean(z)})).booleanValue();
        }
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }
}
