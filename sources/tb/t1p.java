package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793220);
    }

    public static t1p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t1p) ipChange.ipc$dispatch("3dda3ff5", new Object[0]);
        }
        return new t1p();
    }
}
