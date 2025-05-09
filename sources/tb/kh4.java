package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991584);
    }

    public static String a(String str, String str2, String str3) {
        OrangeConfig instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3faf5862", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (instance = OrangeConfig.getInstance()) == null) {
            return null;
        }
        return instance.getConfig(str, str2, null);
    }

    public static boolean b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9179de5f", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str, str2, null);
        if (!TextUtils.isEmpty(a2)) {
            return Boolean.valueOf(a2).booleanValue();
        }
        return z;
    }
}
