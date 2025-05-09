package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793221);
    }

    public static u1p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1p) ipChange.ipc$dispatch("a8695444", new Object[0]);
        }
        return new u1p();
    }
}
