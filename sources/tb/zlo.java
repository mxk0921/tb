package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793738);
    }

    public static zlo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zlo) ipChange.ipc$dispatch("22693b4b", new Object[0]);
        }
        return new zlo();
    }
}
