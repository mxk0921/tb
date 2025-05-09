package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class da0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793209);
    }

    public static da0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (da0) ipChange.ipc$dispatch("3f018496", new Object[0]);
        }
        return new da0();
    }
}
