package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ixk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793726);
    }

    public static ixk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixk) ipChange.ipc$dispatch("becf73c", new Object[0]);
        }
        return new ixk();
    }
}
