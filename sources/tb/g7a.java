package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g7a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797200);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cae8a85a", new Object[0]);
        }
        return String.valueOf(864000);
    }
}
