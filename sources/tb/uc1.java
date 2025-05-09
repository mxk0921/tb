package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uc1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889307);
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d712338d", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return zc1.b(Boolean.valueOf("true".equals(String.valueOf(OrangeConfig.getInstance().getConfig(str, str2, String.valueOf(z))))), z);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933b45d7", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return a("ask_everyone", str, z);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3440f40e", new Object[]{str, str2});
        }
        return d("ask_everyone", str, str2);
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d839804", new Object[]{str, str2, str3});
        }
        return zc1.c(OrangeConfig.getInstance().getConfig(str, str2, str3), str3);
    }
}
