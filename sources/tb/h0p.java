package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793256);
    }

    public static h0p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0p) ipChange.ipc$dispatch("b6bf847c", new Object[0]);
        }
        return new h0p();
    }
}
