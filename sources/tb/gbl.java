package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217651);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2afe3579", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_alipay_change_url", "1"));
    }
}
