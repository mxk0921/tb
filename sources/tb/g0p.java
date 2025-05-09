package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793789);
    }

    public static g0p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0p) ipChange.ipc$dispatch("fc2bd11f", new Object[0]);
        }
        return new g0p();
    }
}
