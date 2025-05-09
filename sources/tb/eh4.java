package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_GOWNGRADE_URL = null;
    public static final String DOWNGRADE = "downgradeUrlMap";
    public static final String INSTALL_ALL_DOWNGRADE = "installAllDowngrade";
    public static final String INSTALL_TIMEOUT = "installTimeoutMill";
    public static final String INSTALL_TIMEOUT_FINISH = "intallTimeoutFinish";
    public static final String MONIOTR_SUCESS = "installMonitorSuccess";
    public static final String NAMESPACE = "tb_fm";

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1b925e", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return "true".equals(c(str, str2, String.valueOf(z)));
    }

    public static int b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da96af03", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        String c = c(str, str2, String.valueOf(i));
        if (!TextUtils.isEmpty(c)) {
            return Integer.parseInt(c);
        }
        return i;
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c07bbd", new Object[]{str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
