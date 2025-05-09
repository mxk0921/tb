package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321759);
    }

    public static MUSDKInstance a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("69034671", new Object[0]);
        }
        return null;
    }
}
