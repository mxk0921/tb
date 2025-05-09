package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793222);
    }

    public static v1p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v1p) ipChange.ipc$dispatch("fe7621cb", new Object[0]);
        }
        return new v1p();
    }
}
