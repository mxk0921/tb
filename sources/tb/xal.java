package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tb_CashDesk", str, String.valueOf(z)));
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("tb_CashDesk", str, String.valueOf(str2));
    }
}
