package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001809);
    }

    public static vxo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vxo) ipChange.ipc$dispatch("631ae249", new Object[0]);
        }
        return new vxo();
    }
}
