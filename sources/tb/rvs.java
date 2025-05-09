package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(776994828);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("319004d0", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableTbLinkSpm1", "true"));
    }
}
