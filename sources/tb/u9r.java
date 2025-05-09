package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080281);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf488ed3", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("aura_purchase_template", str, str2);
    }
}
